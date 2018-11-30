package com.ziigeer.project.domain;


import io.swagger.annotations.ApiModelProperty;

/**
 * @Auther: ShiCY
 * @Description:排课具体时间
 * @Date:2017/8/1 14:10
 * Copyright (c) 2017, zaodao All Rights Reserved.
 */
public class DetailTime {
    /**
     * 序列化
     */
    private static final long serialVersionUID = -5095161466852274284L;

    @ApiModelProperty(value = "id", dataType = "Long")
    private Long id;
    /**
     * 开始时间
     */
    @ApiModelProperty(value = "开始时间", dataType = "Long")
    private String startTime;
    /**
     * 结束时间
     */
    @ApiModelProperty(value = "结束时间", dataType = "String")
    private String endTime;
    /**
     * 排序号
     */
    @ApiModelProperty(value = "排序号", dataType = "Integer")
    private Integer sequence;
    /**
     * 是否预约
     */
    @ApiModelProperty(value = "是否预约", dataType = "Integer")
    private Integer isBook;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getIsBook() {
        return isBook;
    }

    public void setIsBook(Integer isBook) {
        this.isBook = isBook;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DetailTime{" +
            "id=" + id +
            ", startTime='" + startTime + '\'' +
            ", endTime='" + endTime + '\'' +
            ", sequence=" + sequence +
            ", isBook=" + isBook +
            '}';
    }
}
