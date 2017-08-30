package cn.com.yxb.springmvc.send;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2017/8/8.
 *
 * @author frank.
 */
public class Pub {

    private List<Sub> clientArrayList = new ArrayList<Sub>();

    public void notifySub(Object info) {
        for (Sub client : clientArrayList) {
            client.receiveInfo(info);
        }
    }

    public void register(Sub client) {
        clientArrayList.add(client);
    }
}
