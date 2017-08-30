package cn.com.yxb.springmvc.pattern;

/**
 * Created on 2017/8/8.
 *
 * @author frank.
 */
public class DccObserver implements Observer{

    @Override
    public void sendOrders(Object o) throws Exception {
        System.out.println("向Dcc发送订单信息");
    }
}
