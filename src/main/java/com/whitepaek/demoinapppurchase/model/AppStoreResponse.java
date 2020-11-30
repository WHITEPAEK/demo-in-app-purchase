package com.whitepaek.demoinapppurchase.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

/**
 * Apple Document URL ‣ https://developer.apple.com/documentation/appstorereceipts/responsebody/receipt/in_app
 */
public class AppStoreResponse {

    private String environment;
    @JsonAlias("is-retryable")
    private boolean isRetryable;
    @JsonAlias("latest_receipt")
    private String latestReceipt;
    @JsonAlias("latest_receipt_info")
    private List<LatestReceiptInfo> latestReceiptInfo;
    @JsonAlias("pending_renewal_info")
    private List<PendingRenewalInfo> pendingRenewalInfo;
    private Receipt receipt;
    private int status;

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public boolean isRetryable() {
        return isRetryable;
    }

    public void setRetryable(boolean retryable) {
        isRetryable = retryable;
    }

    public String getLatestReceipt() {
        return latestReceipt;
    }

    public void setLatestReceipt(String latestReceipt) {
        this.latestReceipt = latestReceipt;
    }

    public List<LatestReceiptInfo> getLatestReceiptInfo() {
        return latestReceiptInfo;
    }

    public void setLatestReceiptInfo(List<LatestReceiptInfo> latestReceiptInfo) {
        this.latestReceiptInfo = latestReceiptInfo;
    }

    public List<PendingRenewalInfo> getPendingRenewalInfo() {
        return pendingRenewalInfo;
    }

    public void setPendingRenewalInfo(List<PendingRenewalInfo> pendingRenewalInfo) {
        this.pendingRenewalInfo = pendingRenewalInfo;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
