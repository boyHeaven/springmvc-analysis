package cn.com.yxb.springmvc.pattern;

/**
 * Created on 2017/8/8.
 *
 * @author frank.
 */
public interface Subject {

    public void registerObserver(Observer o) throws Exception;

    public void execute() throws Exception;

}
