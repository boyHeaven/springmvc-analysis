package cn.com.yxb.springmvc.send;

/**
 * Created on 2017/8/8.
 *
 * @author frank.
 */
public class Main {

    public static void main(String[] args) {
        Pub pub = new Pub();
        pub.register(new Sub(new SendEventImpl()));
        pub.notifySub("XXXXX");

    }
}
