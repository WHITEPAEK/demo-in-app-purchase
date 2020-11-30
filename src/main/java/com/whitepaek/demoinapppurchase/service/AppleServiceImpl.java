package com.whitepaek.demoinapppurchase.service;

import com.whitepaek.demoinapppurchase.model.AppStoreResponse;
import com.whitepaek.demoinapppurchase.model.InApp;
import com.whitepaek.demoinapppurchase.model.UserReceipt;
import com.whitepaek.demoinapppurchase.model.UserReceiptInfo;
import com.whitepaek.demoinapppurchase.utils.AppleUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AppleServiceImpl implements AppleService {

    private Logger logger = LoggerFactory.getLogger(AppleServiceImpl.class);

    private final AppleUtils appleUtils;

    public AppleServiceImpl(AppleUtils appleUtils) {
        this.appleUtils = appleUtils;
    }

    @Override
    public String updatePurchaseHistory(UserReceipt userReceipt) {

        AppStoreResponse appStoreResponse;
        try {
            appStoreResponse = appleUtils.verifyReceipt(userReceipt);
        } catch (Exception e) {
            logger.error("Verify receipt fail..");
            e.printStackTrace();
            return "Fail";
        }

        UserReceiptInfo userReceiptInfo = null;
        if (appStoreResponse.getReceipt().getInApp().size() == 1) { // 소모품 (Consumable)
            userReceiptInfo = getUserReceiptInfo(appStoreResponse.getReceipt().getInApp().get(0));
        } else {
            // TODO - 비소모품(Non-Consumable), 자동 갱신 구독(Auto-Renewable Subscription), 비자동 갱신 구독(Non-Renewable Subscription)에 대한 로직 필요.
        }

        logger.info("===== DATABASE INSERT IGNORE =====");
        logger.info("product_id ‣ " + userReceiptInfo.getProductId());
        logger.info("transaction_id ‣ " + userReceiptInfo.getTransactionId());
        logger.info("original_transaction_id ‣ " + userReceiptInfo.getOriginalTransactionId());
        logger.info("purchase_data_ms ‣ " + userReceiptInfo.getPurchaseDateMs());
        logger.info("expiration_date ‣ " + userReceiptInfo.getExpirationDate());
        logger.info("====================================");

        return "Success";
    }

    private UserReceiptInfo getUserReceiptInfo(InApp inApp) {

        // TODO - 상품(product_id)에 대한 기간을 가져온 후 구매 날짜(purchase_data_ms)를 기준으로 만료 날짜(expiration_data)를 계산하는 로직 필요.

        return new UserReceiptInfo.Builder(inApp.getProductId(), inApp.getTransactionId(), inApp.getOriginalTransactionId())
                .purchaseDateMs(inApp.getPurchaseDateMs())
                .expirationDate("9999-12-31") // 만료 날짜
                .build();
    }

}