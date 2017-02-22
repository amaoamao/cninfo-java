package com.amaoamao.cninfo.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Announcement {

    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("secCode")
    @Expose
    private String secCode;
    @SerializedName("secName")
    @Expose
    private String secName;
    @SerializedName("orgId")
    @Expose
    private String orgId;
    @SerializedName("announcementId")
    @Expose
    private String announcementId;
    @SerializedName("announcementTitle")
    @Expose
    private String announcementTitle;
    @SerializedName("announcementTime")
    @Expose
    private Long announcementTime;
    @SerializedName("adjunctUrl")
    @Expose
    private String adjunctUrl;
    @SerializedName("adjunctSize")
    @Expose
    private Long adjunctSize;
    @SerializedName("adjunctType")
    @Expose
    private String adjunctType;
    @SerializedName("storageTime")
    @Expose
    private Object storageTime;
    @SerializedName("columnId")
    @Expose
    private Object columnId;
    @SerializedName("pageColumn")
    @Expose
    private Object pageColumn;
    @SerializedName("announcementType")
    @Expose
    private Object announcementType;
    @SerializedName("associateAnnouncement")
    @Expose
    private Object associateAnnouncement;
    @SerializedName("important")
    @Expose
    private Object important;
    @SerializedName("batchNum")
    @Expose
    private Object batchNum;
    @SerializedName("announcementContent")
    @Expose
    private Object announcementContent;
    @SerializedName("announcementTypeName")
    @Expose
    private Object announcementTypeName;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getSecCode() {
        return secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(String announcementId) {
        this.announcementId = announcementId;
    }

    public String getAnnouncementTitle() {
        return announcementTitle;
    }

    public void setAnnouncementTitle(String announcementTitle) {
        this.announcementTitle = announcementTitle;
    }

    public Long getAnnouncementTime() {
        return announcementTime;
    }

    public void setAnnouncementTime(Long announcementTime) {
        this.announcementTime = announcementTime;
    }

    public String getAdjunctUrl() {
        return adjunctUrl;
    }

    public void setAdjunctUrl(String adjunctUrl) {
        this.adjunctUrl = adjunctUrl;
    }

    public Long getAdjunctSize() {
        return adjunctSize;
    }

    public void setAdjunctSize(Long adjunctSize) {
        this.adjunctSize = adjunctSize;
    }

    public String getAdjunctType() {
        return adjunctType;
    }

    public void setAdjunctType(String adjunctType) {
        this.adjunctType = adjunctType;
    }

    public Object getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(Object storageTime) {
        this.storageTime = storageTime;
    }

    public Object getColumnId() {
        return columnId;
    }

    public void setColumnId(Object columnId) {
        this.columnId = columnId;
    }

    public Object getPageColumn() {
        return pageColumn;
    }

    public void setPageColumn(Object pageColumn) {
        this.pageColumn = pageColumn;
    }

    public Object getAnnouncementType() {
        return announcementType;
    }

    public void setAnnouncementType(Object announcementType) {
        this.announcementType = announcementType;
    }

    public Object getAssociateAnnouncement() {
        return associateAnnouncement;
    }

    public void setAssociateAnnouncement(Object associateAnnouncement) {
        this.associateAnnouncement = associateAnnouncement;
    }

    public Object getImportant() {
        return important;
    }

    public void setImportant(Object important) {
        this.important = important;
    }

    public Object getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(Object batchNum) {
        this.batchNum = batchNum;
    }

    public Object getAnnouncementContent() {
        return announcementContent;
    }

    public void setAnnouncementContent(Object announcementContent) {
        this.announcementContent = announcementContent;
    }

    public Object getAnnouncementTypeName() {
        return announcementTypeName;
    }

    public void setAnnouncementTypeName(Object announcementTypeName) {
        this.announcementTypeName = announcementTypeName;
    }

//    @Override
//    public boolean equals(Object o) {
//        return o instanceof Announcement && getSecName().equals(((Announcement) o).getSecName());
//    }
//
//    @Override
//    public int hashCode() {
//        return getSecName().hashCode();
//    }
}

/*
联美控股2016年年度报告
*ST工新2016年年度报告（修订稿）
三圣股份2016年年度报告
南风化工2015年年度报告摘要（更新后）
*ST景谷2016年年度报告
沃华医药2016年年度报告
安信信托2016年年度报告摘要
云意电气2016年年度报告摘要
安泰集团2016年年度报告摘要
塞力斯2016年年度报告
赤天化2016年年度报告摘要
金浦钛业2016年年度报告
花园生物2016年年度报告
大豪科技2016年年度报告
财信发展2016年年度报告
汇金科技2016年年度报告
富春环保2016年年度报告
北特科技2016年年度报告
 */