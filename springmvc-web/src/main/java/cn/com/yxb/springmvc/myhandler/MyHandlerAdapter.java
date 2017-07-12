package cn.com.yxb.springmvc.myhandler;

import cn.com.yxb.springmvc.api.TestHandlerAdapterController;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created on 2017/7/7.
 *
 * @author frank.
 */
public class MyHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return handler instanceof TestHandlerAdapterController;
    }

    @Override
    public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return ((TestHandlerAdapterController) handler).execute();
    }

    @Override
    public long getLastModified(HttpServletRequest request, Object handler) {
        return -1L;
    }
}
