package cn.com.yxb.springmvc.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created on 2017/7/6.
 *
 * @author frank.
 */
@RestController
public class RestControllerDemo {


    @RequestMapping(value = "/demo")
    public String demo(HttpServletRequest request, HttpServletResponse response) {
        return "success";

    }
}
