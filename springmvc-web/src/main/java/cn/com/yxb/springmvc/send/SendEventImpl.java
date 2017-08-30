package cn.com.yxb.springmvc.send;

/**
 * Created on 2017/8/8.
 *
 * @author frank.
 */
public class SendEventImpl implements SendEvent {

    // 定义dcc发送

    @Override
    public void sendOrders(Object object) {
        // 发送dcc
        System.out.println("正在发送数据，请稍后" + object);
    }
}
