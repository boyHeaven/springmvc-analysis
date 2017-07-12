package cn.com.yxb.springmvc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created on 2017/7/7.
 *
 * @author frank.
 */
@RestController
public class TestHandlerAdapterController {


    @RequestMapping(value = "/execute")
    public ModelAndView execute() {
        return new ModelAndView("");
    }
}
