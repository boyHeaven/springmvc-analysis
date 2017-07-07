package cn.com.yxb.springmvc.web;

import cn.com.yxb.springmvc.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created on 2017/7/6.
 *
 * @author frank.
 */
@RestController
public class RestControllerDemo {


    @Resource
    private DemoService demoService;

    @RequestMapping(value = "/demo")
    public String demo(HttpServletRequest request, HttpServletResponse response) {

        System.out.println(demoService.getSessionId());

        return "success";

    }
}
