package com.ziigeer.project.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ziigeer.project.controller.map.DetailsMap;
import com.ziigeer.project.domain.DetailTime;
import com.ziigeer.project.domain.Dto.DetailTimeDto;
import com.ziigeer.project.service.ZiigeerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 2017/7/13.
 */
@RestController
@RequestMapping(value = "/group", produces = {"application/json;charset=UTF-8"})
@Api(value = "测试API", description = "测试API")
public class testController {

    @Autowired
    private ZiigeerService ziigeerService;

    @ApiOperation(value = "indexApi 测试")
    @ApiImplicitParams( {
        @ApiImplicitParam(name = "id", value = "时间详情id", required = true, dataType = "String", paramType
            = "query")
    })
    @RequestMapping(value = "index.do", method = RequestMethod.POST, produces = "application/json")
    public DetailTimeDto test(@RequestParam("id") String id) {
//        DetailTime detailTime = ziigeerService.helloWord(Long.valueOf(id));
//        DetailTimeDto detailTimeDto = DetailsMap.DETAILSINSTANCE.detailTimeToDetailTimeDto(detailTime);
//        return detailTimeDto;
        return null;
    }

    @ApiOperation(value = "testApi")
    @RequestMapping(value = "testApi.do", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<DetailTime> testApi(@RequestParam("id") String id) {
//        DetailTime detailTime = ziigeerService.helloWord(Long.valueOf(id));
//        List<DetailTime> detailTimeList = Arrays.asList(detailTime, detailTime, detailTime, detailTime, detailTime);
//        return detailTimeList;
        return null;
    }
}
