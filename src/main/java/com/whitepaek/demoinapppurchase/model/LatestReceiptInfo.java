package com.whitepaek.demoinapppurchase.model;

import com.fasterxml.jackson.annotation.JsonAlias;

/**
 * Apple Document URL ‣ https://developer.apple.com/documentation/appstorereceipts/responsebody/receipt/in_app
 */
public class LatestReceiptInfo {

    @JsonAlias("cancellation_date")
    private String cancellationDate;
    @JsonAlias("cancellation_date_ms")
    private String cancellationDateMs;
    @JsonAlias("cancellation_date_pst")
    private String cancellationDatePst;
    @JsonAlias("cancellation_reason")
    private String cancellationReason;
    @JsonAlias("expires_date")
    private String expiresDate;
    @JsonAlias("expires_date_ms")
    private String expiresDateMs;
    @JsonAlias("expires_date_pst")
    private String expiresDatePst;
    @JsonAlias("is_in_intro_offer_period")
    private String isInIntroOfferPeriod;
    @JsonAlias("is_trial_period")
    private String isTrialPeriod;
    @JsonAlias("is_upgraded")
    private String isUpgraded;
    @JsonAlias("offer_code_ref_name")
    private String offerCodeRefName;
    @JsonAlias("original_purchase_date")
    private String originalPurchaseDate;
    @JsonAlias("original_purchase_date_ms")
    private String originalPurchaseDateMs;
    @JsonAlias("original_purchase_date_pst")
    private String originalPurchaseDatePst;
    @JsonAlias("original_transaction_id")
    private String originalTransactionId;
    @JsonAlias("product_id")
    private String productId;
    @JsonAlias("promotional_offer_id")
    private String promotionalOfferId;
    @JsonAlias("purchase_date")
    private String purchaseDate;
    @JsonAlias("purchase_date_ms")
    private String purchaseDateMs;
    @JsonAlias("purchase_date_pst")
    private String purchaseDatePst;
    private String quantity;
    @JsonAlias("subscription_group_identifier")
    private String subscriptionGroupIdentifier;
    @JsonAlias("transaction_id")
    private String transactionId;
    @JsonAlias("web_order_line_item_id")
    private String webOrderLineItemId;

    public String getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(String cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public String getCancellationDateMs() {
        return cancellationDateMs;
    }

    public void setCancellationDateMs(String cancellationDateMs) {
        this.cancellationDateMs = cancellationDateMs;
    }

    public String getCancellationDatePst() {
        return cancellationDatePst;
    }

    public void setCancellationDatePst(String cancellationDatePst) {
        this.cancellationDatePst = cancellationDatePst;
    }

    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public String getExpiresDate() {
        return expiresDate;
    }

    public void setExpiresDate(String expiresDate) {
        this.expiresDate = expiresDate;
    }

    public String getExpiresDateMs() {
        return expiresDateMs;
    }

    public void setExpiresDateMs(String expiresDateMs) {
        this.expiresDateMs = expiresDateMs;
    }

    public String getExpiresDatePst() {
        return expiresDatePst;
    }

    public void setExpiresDatePst(String expiresDatePst) {
        this.expiresDatePst = expiresDatePst;
    }

    public String getIsInIntroOfferPeriod() {
        return isInIntroOfferPeriod;
    }

    public void setIsInIntroOfferPeriod(String isInIntroOfferPeriod) {
        this.isInIntroOfferPeriod = isInIntroOfferPeriod;
    }

    public String getIsTrialPeriod() {
        return isTrialPeriod;
    }

    public void setIsTrialPeriod(String isTrialPeriod) {
        this.isTrialPeriod = isTrialPeriod;
    }

    public String getIsUpgraded() {
        return isUpgraded;
    }

    public void setIsUpgraded(String isUpgraded) {
        this.isUpgraded = isUpgraded;
    }

    public String getOfferCodeRefName() {
        return offerCodeRefName;
    }

    public void setOfferCodeRefName(String offerCodeRefName) {
        this.offerCodeRefName = offerCodeRefName;
    }

    public String getOriginalPurchaseDate() {
        return originalPurchaseDate;
    }

    public void setOriginalPurchaseDate(String originalPurchaseDate) {
        this.originalPurchaseDate = originalPurchaseDate;
    }

    public String getOriginalPurchaseDateMs() {
        return originalPurchaseDateMs;
    }

    public void setOriginalPurchaseDateMs(String originalPurchaseDateMs) {
        this.originalPurchaseDateMs = originalPurchaseDateMs;
    }

    public String getOriginalPurchaseDatePst() {
        return originalPurchaseDatePst;
    }

    public void setOriginalPurchaseDatePst(String originalPurchaseDatePst) {
        this.originalPurchaseDatePst = originalPurchaseDatePst;
    }

    public String getOriginalTransactionId() {
        return originalTransactionId;
    }

    public void setOriginalTransactionId(String originalTransactionId) {
        this.originalTransactionId = originalTransactionId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPromotionalOfferId() {
        return promotionalOfferId;
    }

    public void setPromotionalOfferId(String promotionalOfferId) {
        this.promotionalOfferId = promotionalOfferId;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaseDateMs() {
        return purchaseDateMs;
    }

    public void setPurchaseDateMs(String purchaseDateMs) {
        this.purchaseDateMs = purchaseDateMs;
    }

    public String getPurchaseDatePst() {
        return purchaseDatePst;
    }

    public void setPurchaseDatePst(String purchaseDatePst) {
        this.purchaseDatePst = purchaseDatePst;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSubscriptionGroupIdentifier() {
        return subscriptionGroupIdentifier;
    }

    public void setSubscriptionGroupIdentifier(String subscriptionGroupIdentifier) {
        this.subscriptionGroupIdentifier = subscriptionGroupIdentifier;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getWebOrderLineItemId() {
        return webOrderLineItemId;
    }

    public void setWebOrderLineItemId(String webOrderLineItemId) {
        this.webOrderLineItemId = webOrderLineItemId;
    }
}
