package com.ziigeer.project.dao;


import com.ziigeer.project.domain.DetailTime;
import com.ziigeer.project.domain.MicroLesson;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: ShiCY
 * @Description:时间详情
 * @Date:2017/8/1 14:10
 * Copyright (c) 2017, zaodao All Rights Reserved.
 */
@Mapper
public interface DetailTimeMapper {

    /**
     * selectByPrimaryKey
     * @param id Long
     * @return DetailTime
     */
    MicroLesson selectByPrimaryKey(Long id);
}
