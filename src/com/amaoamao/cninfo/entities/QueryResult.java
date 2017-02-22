package com.amaoamao.cninfo.entities;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QueryResult {

    @SerializedName("classifiedAnnouncements")
    @Expose
    private Object classifiedAnnouncements;
    @SerializedName("totalSecurities")
    @Expose
    private Integer totalSecurities;
    @SerializedName("totalAnnouncement")
    @Expose
    private Integer totalAnnouncement;
    @SerializedName("totalRecordNum")
    @Expose
    private Integer totalRecordNum;
    @SerializedName("announcements")
    @Expose
    private List<Announcement> announcements = null;
    @SerializedName("categoryList")
    @Expose
    private Object categoryList;
    @SerializedName("hasMore")
    @Expose
    private Boolean hasMore;
    @SerializedName("totalpages")
    @Expose
    private Integer totalpages;

    public Object getClassifiedAnnouncements() {
        return classifiedAnnouncements;
    }

    public void setClassifiedAnnouncements(Object classifiedAnnouncements) {
        this.classifiedAnnouncements = classifiedAnnouncements;
    }

    public Integer getTotalSecurities() {
        return totalSecurities;
    }

    public void setTotalSecurities(Integer totalSecurities) {
        this.totalSecurities = totalSecurities;
    }

    public Integer getTotalAnnouncement() {
        return totalAnnouncement;
    }

    public void setTotalAnnouncement(Integer totalAnnouncement) {
        this.totalAnnouncement = totalAnnouncement;
    }

    public Integer getTotalRecordNum() {
        return totalRecordNum;
    }

    public void setTotalRecordNum(Integer totalRecordNum) {
        this.totalRecordNum = totalRecordNum;
    }

    public List<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(List<Announcement> announcements) {
        this.announcements = announcements;
    }

    public Object getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(Object categoryList) {
        this.categoryList = categoryList;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public Integer getTotalpages() {
        return totalpages;
    }

    public void setTotalpages(Integer totalpages) {
        this.totalpages = totalpages;
    }

}
