package com.leiyonglin.pojo.DayManagement;

public class DayManagementDetail {

    private Integer managementDetailId;
    private Integer managementId;
    private Long startDate;
    private Long endDate;
    private String content;

    public Integer getManagementDetailId() {
        return managementDetailId;
    }

    public void setManagementDetailId(Integer managementDetailId) {
        this.managementDetailId = managementDetailId;
    }

    public Integer getManagementId() {
        return managementId;
    }

    public void setManagementId(Integer managementId) {
        this.managementId = managementId;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
