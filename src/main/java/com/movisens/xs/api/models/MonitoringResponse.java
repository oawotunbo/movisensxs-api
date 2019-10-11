package com.movisens.xs.api.models;

import com.google.gson.annotations.Expose;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class MonitoringResponse {
    @Expose
    public List<Proband> probands;

    @Expose
    public Study study;

    @Expose
    public String currentDate;

    @Expose
    public Map<?, ?> monitoringMap;

    @Expose
    public List<Object> listOfDates;

    @Expose
    public String previousPage;

    @Expose
    public String nextPage;

    @Expose
    public Boolean onlyIncomplete;

    @Expose
    public String beginDate;

    @Expose
    public String previousDateTooltip;

    @Expose
    public String nextDateTooltip;

    @Expose
    public List<MonitoringCompliance> monitoringCompliances;

    @Expose
    public List<MonitoringAlert> monitoringAlerts;

    @Expose
    public Map<Proband, Double> complianceAverageMap;

    public Integer studyId;

    public List<Monitoring> monitorings;

    public MonitoringResponse(List<Proband> probands, Study study, String currentDate,
                              Map<?, ?> monitoringMap, List<Object> listOfDates, String previousPage,
                              String nextPage, Boolean onlyIncomplete, String beginDate,
                              String previousDateTooltip, String nextDateTooltip,
                              Map<Proband, Double> complianceAverageMap) {
        this.probands = probands;
        this.study = study;
        this.currentDate = currentDate;
        this.monitoringMap = monitoringMap;
        this.listOfDates = listOfDates;
        this.previousPage = previousPage;
        this.nextPage = nextPage;
        this.onlyIncomplete = onlyIncomplete;
        this.beginDate = beginDate;
        this.previousDateTooltip = previousDateTooltip;
        this.nextDateTooltip = nextDateTooltip;
        this.complianceAverageMap = complianceAverageMap;
    }

    public MonitoringResponse(String nextPage) {
        this.nextPage = nextPage;
    }

    public List<Proband> getProbands() {
        return probands;
    }

    public void setProbands(List<Proband> probands) {
        this.probands = probands;
    }

    public Study getStudy() {
        return study;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public Map<?, ?> getMonitoringMap() {
        return monitoringMap;
    }

    public void setMonitoringMap(Map<?, ?> monitoringMap) {
        this.monitoringMap = monitoringMap;
    }

    public List<Object> getListOfDates() {
        return listOfDates;
    }

    public void setListOfDates(List<Object> listOfDates) {
        this.listOfDates = listOfDates;
    }

    public String getPreviousPage() {
        return previousPage;
    }

    public void setPreviousPage(String previousPage) {
        this.previousPage = previousPage;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    public Boolean getOnlyIncomplete() {
        return onlyIncomplete;
    }

    public void setOnlyIncomplete(Boolean onlyIncomplete) {
        this.onlyIncomplete = onlyIncomplete;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getPreviousDateTooltip() {
        return previousDateTooltip;
    }

    public void setPreviousDateTooltip(String previousDateTooltip) {
        this.previousDateTooltip = previousDateTooltip;
    }

    public String getNextDateTooltip() {
        return nextDateTooltip;
    }

    public void setNextDateTooltip(String nextDateTooltip) {
        this.nextDateTooltip = nextDateTooltip;
    }

    public List<MonitoringCompliance> getMonitoringCompliances() {
        return monitoringCompliances;
    }

    public void setMonitoringCompliances(List<MonitoringCompliance> monitoringCompliances) {
        this.monitoringCompliances = monitoringCompliances;
    }

    public List<MonitoringAlert> getMonitoringAlerts() {
        return monitoringAlerts;
    }

    public void setMonitoringAlerts(List<MonitoringAlert> monitoringAlerts) {
        this.monitoringAlerts = monitoringAlerts;
    }

    public Map<Proband, Double> getComplianceAverageMap() {
        return complianceAverageMap;
    }

    public void setComplianceAverageMap(Map<Proband, Double> complianceAverageMap) {
        this.complianceAverageMap = complianceAverageMap;
    }


    public Integer getStudyId() {
        return studyId;
    }

    public void setStudyId(Integer studyId) {
        this.studyId = studyId;
    }

    public List<Monitoring> getMonitorings() {
        return monitorings;
    }

    public void setMonitorings(List<Monitoring> monitorings) {
        this.monitorings = monitorings;
    }
}
