package com.ziigeer.project.controller;


import com.ziigeer.project.common.LogHandlerTest;
import com.ziigeer.project.domain.MicroLesson;
import com.ziigeer.project.service.Person;
import com.ziigeer.project.service.UserManager;
import com.ziigeer.project.service.ZiigeerService;
import com.ziigeer.project.service.impl.PersonImpl;
import com.ziigeer.project.service.impl.UserManagerImpl;
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
        String jsonObject = "测试成功啦！555";
        if (microLesson != null) {
            jsonObject = microLesson.getLessonName();
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("message", jsonObject);
        modelAndView.setViewName("index");
        request.setAttribute("message", jsonObject);
        return modelAndView;
    }


    public static void main(String[] args) {
        //给客户一个InvokationHandler对象，就能动态生成一个代理对象，进而能够访问目标对象
        LogHandlerTest lh = new LogHandlerTest();
        UserManager um = (UserManager) lh.newProxyInstance(new UserManagerImpl());
        System.out.println("******************");
        um.addUser("张三");

        //动态代理可以代理多个目标对象，减少了代码重写
        //如又代理PersonImpl,并不需要额外写其他代码
        Person p = (Person) lh.newProxyInstance(new PersonImpl());
        System.out.println("******************");
        p.consume(88f);
    }
}
