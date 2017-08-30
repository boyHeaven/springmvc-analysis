package cn.com.yxb.springmvc.send;

/**
 * Created on 2017/8/8.
 *
 * @author frank.
 */
public class Sub {

    private SendEvent event;

    public Sub(SendEvent event) {
        this.event = event;
    }

    //用来接受发布者发布的消息
    public void receiveInfo(Object o) {
        event.sendOrders(o);
    }
}
