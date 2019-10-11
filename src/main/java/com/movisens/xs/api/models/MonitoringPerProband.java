package com.movisens.xs.api.models;

import com.google.gson.annotations.Expose;

import java.util.List;

public class MonitoringPerProband {


    public enum MonitoringType {
        COMPLIANCE, ALERT
    }

    @Expose
    private long probandId;

    @Expose
    private String date;

    @Expose
    private String type;

    @Expose
    private String name;

    @Expose
    private String message;

    @Expose
    private boolean includeInMail = false;

    @Expose
    private boolean isWarning = false;

    @Expose
    private String category;

    @Expose
    private Integer value;

    public long getProbandId() {
        return probandId;
    }

    public void setProbandId(long probandId) {
        this.probandId = probandId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isIncludeInMail() {
        return includeInMail;
    }

    public void setIncludeInMail(boolean includeInMail) {
        this.includeInMail = includeInMail;
    }

    public boolean isWarning() {
        return isWarning;
    }

    public void setWarning(boolean warning) {
        isWarning = warning;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MonitoringPerProband{" +
                "probandId=" + probandId +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", includeInMail=" + includeInMail +
                ", isWarning=" + isWarning +
                ", category='" + category + '\'' +
                ", value=" + value +
                '}';
    }
}
