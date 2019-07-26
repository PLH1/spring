package org.springframework.context.support;

import com.sun.istack.internal.Nullable;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

/**
 * 描述:
 * 通过本地xml来生成bean
 *
 * @author panlihuan
 * @create 2019-07-26 15:59
 */
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{
    public ClassPathXmlApplicationContext() {
    }

    public ClassPathXmlApplicationContext(String configLocation) throws BeansException {
        this(new String[] {configLocation}, true, null);
    }

    public ClassPathXmlApplicationContext(
            String[] configLocations, boolean refresh, @Nullable ApplicationContext parent)throws BeansException{
        super(parent);

    }
}
