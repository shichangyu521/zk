package com.ziigeer.project.controller;


import com.alibaba.fastjson.JSONObject;
import com.ziigeer.project.domain.DetailTime;
import com.ziigeer.project.domain.MicroLesson;
import com.ziigeer.project.service.ZiigeerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2017/7/13.
 */
@RestController
@RequestMapping(value = "/ziigeer", produces = {"application/json;charset=UTF-8"})
@Api(value = "自个API", description = "自个API")
public class ziigeerController {

    @Autowired
    private ZiigeerService ziigeerService;

    @ApiOperation(value = "indexApi 测试")
    @ApiImplicitParams( {
        @ApiImplicitParam(name = "id", value = "时间详情id", required = true, dataType = "String", paramType
            = "query")
    })

    @RequestMapping(value = "index.do", method = RequestMethod.GET, produces = "application/json")
    public ModelAndView test(@RequestParam("id") String id, HttpServletRequest request) {
        MicroLesson microLesson = ziigeerService.helloWord(Long.valueOf(id));
        String jsonObject = "测试成功啦！";
        if (microLesson != null) {
            jsonObject = microLesson.getLessonName();
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("message", jsonObject);
        modelAndView.setViewName("index");
        request.setAttribute("message", jsonObject);
        return modelAndView;
    }

}
