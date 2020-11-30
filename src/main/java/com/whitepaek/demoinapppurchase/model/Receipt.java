package com.whitepaek.demoinapppurchase.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

/**
 * Apple Document URL ‣ https://developer.apple.com/documentation/appstorereceipts/responsebody/receipt
 */
public class Receipt {

    @JsonAlias("adam_id")
    private Number adamId;
    @JsonAlias("app_item_id")
    private Number app_item_id;
    @JsonAlias("application_version")
    private String applicationVersion;
    @JsonAlias("bundle_id")
    private String bundleId;
    @JsonAlias("download_id")
    private Integer downloadId;
    @JsonAlias("expiration_date")
    private String expirationDate;
    @JsonAlias("expiration_date_ms")
    private String expirationDateMs;
    @JsonAlias("expiration_date_pst")
    private String expirationDatePst;
    @JsonAlias("in_app")
    private List<InApp> inApp;
    @JsonAlias("original_application_version")
    private String originalApplicationVersion;
    @JsonAlias("original_purchase_date")
    private String originalPurchaseDate;
    @JsonAlias("original_purchase_date_ms")
    private String originalPurchaseDateMs;
    @JsonAlias("original_purchase_date_pst")
    private String originalPurchaseDatePst;
    @JsonAlias("preorder_date")
    private String preorderDate;
    @JsonAlias("preorder_date_ms")
    private String preorderDateMs;
    @JsonAlias("preorder_date_pst")
    private String preorderDatePst;
    @JsonAlias("receipt_creation_date")
    private String receiptCreationDate;
    @JsonAlias("receipt_creation_date_ms")
    private String receiptCreationDateMs;
    @JsonAlias("receipt_creation_date_pst")
    private String receiptCreationDatePst;
    @JsonAlias("receipt_type")
    private String receiptType;
    @JsonAlias("request_date")
    private String requestDate;
    @JsonAlias("request_date_ms")
    private String requestDateMs;
    @JsonAlias("request_date_pst")
    private String requestDatePst;
    @JsonAlias("version_external_identifier")
    private Integer versionExternalIdentifier;

    public Number getAdamId() {
        return adamId;
    }

    public void setAdamId(Number adamId) {
        this.adamId = adamId;
    }

    public Number getApp_item_id() {
        return app_item_id;
    }

    public void setApp_item_id(Number app_item_id) {
        this.app_item_id = app_item_id;
    }

    public String getApplicationVersion() {
        return applicationVersion;
    }

    public void setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public Integer getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(Integer downloadId) {
        this.downloadId = downloadId;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExpirationDateMs() {
        return expirationDateMs;
    }

    public void setExpirationDateMs(String expirationDateMs) {
        this.expirationDateMs = expirationDateMs;
    }

    public String getExpirationDatePst() {
        return expirationDatePst;
    }

    public void setExpirationDatePst(String expirationDatePst) {
        this.expirationDatePst = expirationDatePst;
    }

    public List<InApp> getInApp() {
        return inApp;
    }

    public void setInApp(List<InApp> inApp) {
        this.inApp = inApp;
    }

    public String getOriginalApplicationVersion() {
        return originalApplicationVersion;
    }

    public void setOriginalApplicationVersion(String originalApplicationVersion) {
        this.originalApplicationVersion = originalApplicationVersion;
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

    public String getPreorderDate() {
        return preorderDate;
    }

    public void setPreorderDate(String preorderDate) {
        this.preorderDate = preorderDate;
    }

    public String getPreorderDateMs() {
        return preorderDateMs;
    }

    public void setPreorderDateMs(String preorderDateMs) {
        this.preorderDateMs = preorderDateMs;
    }

    public String getPreorderDatePst() {
        return preorderDatePst;
    }

    public void setPreorderDatePst(String preorderDatePst) {
        this.preorderDatePst = preorderDatePst;
    }

    public String getReceiptCreationDate() {
        return receiptCreationDate;
    }

    public void setReceiptCreationDate(String receiptCreationDate) {
        this.receiptCreationDate = receiptCreationDate;
    }

    public String getReceiptCreationDateMs() {
        return receiptCreationDateMs;
    }

    public void setReceiptCreationDateMs(String receiptCreationDateMs) {
        this.receiptCreationDateMs = receiptCreationDateMs;
    }

    public String getReceiptCreationDatePst() {
        return receiptCreationDatePst;
    }

    public void setReceiptCreationDatePst(String receiptCreationDatePst) {
        this.receiptCreationDatePst = receiptCreationDatePst;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getRequestDateMs() {
        return requestDateMs;
    }

    public void setRequestDateMs(String requestDateMs) {
        this.requestDateMs = requestDateMs;
    }

    public String getRequestDatePst() {
        return requestDatePst;
    }

    public void setRequestDatePst(String requestDatePst) {
        this.requestDatePst = requestDatePst;
    }

    public Integer getVersionExternalIdentifier() {
        return versionExternalIdentifier;
    }

    public void setVersionExternalIdentifier(Integer versionExternalIdentifier) {
        this.versionExternalIdentifier = versionExternalIdentifier;
    }
}
