package com.whitepaek.demoinapppurchase.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class UserReceipt {

    // TODO - User(구매자) 정보에 대한 Fields 필요.

    @JsonAlias("receipt-data")
    private String receiptData;

    public String getReceiptData() {
        return receiptData;
    }

    public void setReceiptData(String receiptData) {
        this.receiptData = receiptData;
    }
}
