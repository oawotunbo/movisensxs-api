package com.movisens.xs.api.models;


public class MonitoringDTO {
    public Boolean compliant;
    public Boolean alertWarning;
    public Boolean completed;
    public DayType dayType = DayType.OUTSIDE_RANGE;

    public static enum DayType {
        OUTSIDE_RANGE, WEEKDAY, WEEKEND
    }

    public Boolean getCompliant() {
        return compliant;
    }

    public void setCompliant(Boolean compliant) {
        this.compliant = compliant;
    }

    public Boolean getAlertWarning() {
        return alertWarning;
    }

    public void setAlertWarning(Boolean alertWarning) {
        this.alertWarning = alertWarning;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public DayType getDayType() {
        return dayType;
    }

    public void setDayType(DayType dayType) {
        this.dayType = dayType;
    }

    @Override
    public String toString() {
        return "MonitoringDTO{" +
                "compliant=" + compliant +
                ", alertWarning=" + alertWarning +
                ", completed=" + completed +
                ", dayType=" + dayType +
                '}';
    }
}
