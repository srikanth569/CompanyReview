package com.srikanth.companyreview.model;

import org.json.JSONException;
import org.json.JSONObject;

public class BasePay {
    private Double amount;
    private String currencyCode;
    private String name;
    private String symbol;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BasePay loadFromJson(JSONObject obj) throws JSONException {
        BasePay basePay = new BasePay();
        basePay.setAmount(obj.getDouble("amount"));
        basePay.setCurrencyCode(obj.getString("currencyCode"));
        basePay.setName(obj.getString("name"));
        basePay.setSymbol(obj.getString("symbol"));
        return null;
    }
}
