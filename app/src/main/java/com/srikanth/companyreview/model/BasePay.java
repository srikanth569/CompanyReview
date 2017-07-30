package com.srikanth.companyreview.model;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONException;
import org.json.JSONObject;

public class BasePay implements Parcelable{
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.amount);
        dest.writeString(this.currencyCode);
        dest.writeString(this.name);
        dest.writeString(this.symbol);
    }

    public BasePay() {
    }

    protected BasePay(Parcel in) {
        this.amount = (Double) in.readValue(Double.class.getClassLoader());
        this.currencyCode = in.readString();
        this.name = in.readString();
        this.symbol = in.readString();
    }

    public static final Creator<BasePay> CREATOR = new Creator<BasePay>() {
        @Override
        public BasePay createFromParcel(Parcel source) {
            return new BasePay(source);
        }

        @Override
        public BasePay[] newArray(int size) {
            return new BasePay[size];
        }
    };
}
