package com.ziigeer.project.service.impl;

import com.ziigeer.project.dao.DetailTimeMapper;
import com.ziigeer.project.domain.DetailTime;
import com.ziigeer.project.domain.MicroLesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ziigeer.project.service.ZiigeerService;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by admin on 2017/7/14.
 */
@Service
public class ZiigeerServiceImpl implements ZiigeerService{

    @Autowired
    private DetailTimeMapper detailTimeMapper;

    @Override
    public MicroLesson helloWord(Long id) {
        MicroLesson microLesson = detailTimeMapper.selectByPrimaryKey(1001756894450421760L);
        return microLesson;
    }
}
