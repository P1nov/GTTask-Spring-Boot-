package com.leiyonglin.pojo.DayManagement;

import java.util.List;

public class DayManagement {

    private Integer managementId;
    private Long dateInterval;
    private String managementTheme;
    private String address;
    private List<DayManagementDetail> detailList;

    public Integer getManagementId() {
        return managementId;
    }

    public void setManagementId(Integer managementId) {
        this.managementId = managementId;
    }

    public Long getDateInterval() {
        return dateInterval;
    }

    public void setDateInterval(Long dateInterval) {
        this.dateInterval = dateInterval;
    }

    public String getManagementTheme() {
        return managementTheme;
    }

    public void setManagementTheme(String managementTheme) {
        this.managementTheme = managementTheme;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<DayManagementDetail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<DayManagementDetail> detailList) {
        this.detailList = detailList;
    }
}
