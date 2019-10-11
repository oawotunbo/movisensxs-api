package com.movisens.xs.api.models;

import java.util.List;

public class MonitoringPerProbandResponse {
    public List<MonitoringPerProband> monitorings;

    public List<MonitoringPerProband> getMonitorings() {
        return monitorings;
    }

    public void setMonitorings(List<MonitoringPerProband> monitorings) {
        this.monitorings = monitorings;
    }
}
