package cn.com.yxb.springmvc.service.impl;

import cn.com.yxb.springmvc.service.DemoService;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * Created on 2017/7/7.
 *
 * @author frank.
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getSessionId() {

        return RequestContextHolder.getRequestAttributes().getSessionId();
    }
}
