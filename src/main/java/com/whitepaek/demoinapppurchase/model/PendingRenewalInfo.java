package com.whitepaek.demoinapppurchase.model;

import com.fasterxml.jackson.annotation.JsonAlias;

/**
 * Apple Document URL ‣ https://developer.apple.com/documentation/appstorereceipts/responsebody/pending_renewal_info
 */
public class PendingRenewalInfo {

    @JsonAlias("auto_renew_product_id")
    private String autoRenewProductId;
    @JsonAlias("auto_renew_status")
    private String autoRenewStatus;
    @JsonAlias("expiration_intent")
    private String expirationIntent;
    @JsonAlias("grace_period_expires_date")
    private String gracePeriodExpiresDate;
    @JsonAlias("grace_period_expires_date_ms")
    private String gracePeriodExpiresDateMs;
    @JsonAlias("grace_period_expires_date_pst")
    private String gracePeriodExpiresDatePst;
    @JsonAlias("is_in_billing_retry_period")
    private String isInBillingRetryPeriod;
    @JsonAlias("offer_code_ref_name")
    private String offerCodeRefName;
    @JsonAlias("original_transaction_id")
    private String originalTransactionId;
    @JsonAlias("price_consent_status")
    private String priceConsentStatus;
    @JsonAlias("product_id")
    private String productId;

    public String getAutoRenewProductId() {
        return autoRenewProductId;
    }

    public void setAutoRenewProductId(String autoRenewProductId) {
        this.autoRenewProductId = autoRenewProductId;
    }

    public String getAutoRenewStatus() {
        return autoRenewStatus;
    }

    public void setAutoRenewStatus(String autoRenewStatus) {
        this.autoRenewStatus = autoRenewStatus;
    }

    public String getExpirationIntent() {
        return expirationIntent;
    }

    public void setExpirationIntent(String expirationIntent) {
        this.expirationIntent = expirationIntent;
    }

    public String getGracePeriodExpiresDate() {
        return gracePeriodExpiresDate;
    }

    public void setGracePeriodExpiresDate(String gracePeriodExpiresDate) {
        this.gracePeriodExpiresDate = gracePeriodExpiresDate;
    }

    public String getGracePeriodExpiresDateMs() {
        return gracePeriodExpiresDateMs;
    }

    public void setGracePeriodExpiresDateMs(String gracePeriodExpiresDateMs) {
        this.gracePeriodExpiresDateMs = gracePeriodExpiresDateMs;
    }

    public String getGracePeriodExpiresDatePst() {
        return gracePeriodExpiresDatePst;
    }

    public void setGracePeriodExpiresDatePst(String gracePeriodExpiresDatePst) {
        this.gracePeriodExpiresDatePst = gracePeriodExpiresDatePst;
    }

    public String getIsInBillingRetryPeriod() {
        return isInBillingRetryPeriod;
    }

    public void setIsInBillingRetryPeriod(String isInBillingRetryPeriod) {
        this.isInBillingRetryPeriod = isInBillingRetryPeriod;
    }

    public String getOfferCodeRefName() {
        return offerCodeRefName;
    }

    public void setOfferCodeRefName(String offerCodeRefName) {
        this.offerCodeRefName = offerCodeRefName;
    }

    public String getOriginalTransactionId() {
        return originalTransactionId;
    }

    public void setOriginalTransactionId(String originalTransactionId) {
        this.originalTransactionId = originalTransactionId;
    }

    public String getPriceConsentStatus() {
        return priceConsentStatus;
    }

    public void setPriceConsentStatus(String priceConsentStatus) {
        this.priceConsentStatus = priceConsentStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
