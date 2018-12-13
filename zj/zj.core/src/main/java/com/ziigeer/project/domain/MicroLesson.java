package com.ziigeer.project.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: shicy
 * @Description:
 * @Date: 2017/10/26 16:56
 * Copyright (c) 2017, zaodao All Rights Reserved.
 */

public class MicroLesson {

    /** 序列化 */
    private static final long serialVersionUID = -5838261660983590900L;

    private Long id;

    private Long createUser;

    private Date createTime;

    /** 名称 */
    @JsonView(Common.class)
    @ApiModelProperty(value = "微课名字")
    private String lessonName;

    /** 语种 */
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    private Integer langType;

    /** 有效期 */
    @JsonView(Common.class)
    @ApiModelProperty(value = "有效期")
    private String expiry;

    /** 有效期类型 */
    @ApiModelProperty(value = "有效期类型 1:年,2:月,3:日")
    @JsonView(Common.class)
    private Integer expiryType;

    /** 是否展示 */
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    private Integer isShow;

    /** 是否免费 */
    @ApiModelProperty(value = "是否免费 1:是,2:否")
    private Integer isFree;

    /** 协议ID */
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    private Long protocolId;

    /** 正常价 */
    @ApiModelProperty(value = "原始价格")
    @JsonView(Common.class)
    private BigDecimal orignPrice;

    /** 优惠价 */
    @ApiModelProperty(value = "优惠价格")
    @JsonView(Common.class)
    private BigDecimal salePrice;

    /** 微课简介 */
    @ApiModelProperty(value = "简介")
    @JsonView(Common.class)
    private String lessonIntroduction;

    /** 内容大纲 */
    @ApiModelProperty(value = "内容大纲")
    @JsonView(Common.class)
    private String lessonOutLine;

    /** 适用人群 */
    @ApiModelProperty(value = "适用人群")
    @JsonView(Common.class)
    private String applicableUser;

    /** 视频封面地址 */
    @ApiModelProperty(value = "视频封面地址")
    @JsonView(Common.class)
    private String videoCoverUrl;

    /** 视频地址 */
    @ApiModelProperty(value = "视频播放地址")
    @JsonView(Common.class)
    private String videoUrl;

    /** 课时 */
    @ApiModelProperty(value = "课时")
    @JsonView(Common.class)
    private Integer totalHours;

    /** 排序 */
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    private Integer seqNum;

    /** 学习模式 */
    private String studyModel;

    /** 最大人数 */
    private String maxNumber;

    /** 开始日期 */
    private Date startDate;

    /** 开课日期 str */
    private String startDateStr;

    /** 开始时间 */
    private String studyTime;

    /** 上课周期 */
    private Integer classCycle;

    /** 文案推送时间 */
    private String handOutTime;

    /** 助教二维码 */
    private String assistantQRCode;

    /** 助教微信号 */
    private String assistantWechatNo;

    /** 展示平台APPID */
    private String showAppId;

    /** 售卖截止时间 */
    private Date saleEndTime;

    /** 有效期 */
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    private Date expiryDate;

    /** 支付日期 */
    private Date orderDate;

    /** 有效期截止日期 */
    @ApiModelProperty(value = "有效期截止日期")
    @JsonView(MyMicroLessonView.class)
    private String expiryEndDate;

    /** 是否购买 */
    @ApiModelProperty(value = "是否购买 1:是,2:否")
    @JsonView(MicroLessonDetailView.class)
    private Integer isBuy;

    /** 推送tag*/
    private String pushTag;

    /** 打卡分享地址*/
    private String shareUrl;

    /** 常见问题 */
    private String question;


    //JSON VIEW
    /** 公共JSON VIEW */
    public interface Common { }
    /** MicroLesson JSON VIEW */
    public interface MicroLessonView extends Common { }
    /** MicroLessonDetail JSON VIEW */
    public interface MicroLessonDetailView extends Common { }
    /** MyMicroLesson JSON VIEW */
    public interface MyMicroLessonView extends Common { }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Integer getLangType() {
        return langType;
    }

    public void setLangType(Integer langType) {
        this.langType = langType;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public Integer getExpiryType() {
        return expiryType;
    }

    public void setExpiryType(Integer expiryType) {
        this.expiryType = expiryType;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getIsFree() {
        return isFree;
    }

    public void setIsFree(Integer isFree) {
        this.isFree = isFree;
    }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    public BigDecimal getOrignPrice() {
        return orignPrice;
    }

    public void setOrignPrice(BigDecimal orignPrice) {
        this.orignPrice = orignPrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public String getLessonIntroduction() {
        return lessonIntroduction;
    }

    public void setLessonIntroduction(String lessonIntroduction) {
        this.lessonIntroduction = lessonIntroduction;
    }

    public String getLessonOutLine() {
        return lessonOutLine;
    }

    public void setLessonOutLine(String lessonOutLine) {
        this.lessonOutLine = lessonOutLine;
    }

    public String getApplicableUser() {
        return applicableUser;
    }

    public void setApplicableUser(String applicableUser) {
        this.applicableUser = applicableUser;
    }

    public String getVideoCoverUrl() {
        return videoCoverUrl;
    }

    public void setVideoCoverUrl(String videoCoverUrl) {
        this.videoCoverUrl = videoCoverUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(Integer totalHours) {
        this.totalHours = totalHours;
    }

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    public String getStudyModel() {
        return studyModel;
    }

    public void setStudyModel(String studyModel) {
        this.studyModel = studyModel;
    }

    public String getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(String maxNumber) {
        this.maxNumber = maxNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStartDateStr() {
        return startDateStr;
    }

    public void setStartDateStr(String startDateStr) {
        this.startDateStr = startDateStr;
    }

    public String getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(String studyTime) {
        this.studyTime = studyTime;
    }

    public Integer getClassCycle() {
        return classCycle;
    }

    public void setClassCycle(Integer classCycle) {
        this.classCycle = classCycle;
    }

    public String getHandOutTime() {
        return handOutTime;
    }

    public void setHandOutTime(String handOutTime) {
        this.handOutTime = handOutTime;
    }

    public String getAssistantQRCode() {
        return assistantQRCode;
    }

    public void setAssistantQRCode(String assistantQRCode) {
        this.assistantQRCode = assistantQRCode;
    }

    public String getAssistantWechatNo() {
        return assistantWechatNo;
    }

    public void setAssistantWechatNo(String assistantWechatNo) {
        this.assistantWechatNo = assistantWechatNo;
    }

    public String getShowAppId() {
        return showAppId;
    }

    public void setShowAppId(String showAppId) {
        this.showAppId = showAppId;
    }

    public Date getSaleEndTime() {
        return saleEndTime;
    }

    public void setSaleEndTime(Date saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

    public void setExpiryEndDate(String expiryEndDate) {
        this.expiryEndDate = expiryEndDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(Integer isBuy) {
        this.isBuy = isBuy;
    }

    public String getPushTag() {
        return pushTag;
    }

    public void setPushTag(String pushTag) {
        this.pushTag = pushTag;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getExpiryEndDate() {
        return expiryEndDate;
    }
}
