package org.springframework.context.support;

import com.sun.istack.internal.Nullable;
import org.springframework.context.ApplicationContext;

/**
 * 描述:
 *  {@link AbstractRefreshableApplicationContext} subclass that adds common handling
 *  of specified config locations. Serves as base class for XML-based application
 *  context implementations such as {@link ClassPathXmlApplicationContext} and
 *  {@link FileSystemXmlApplicationContext}, as well as
 *  {@link org.springframework.web.context.support.XmlWebApplicationContext}.
 *
 *  @link abstractrefreshableapplicationcontext添加公共操作的子类
 *
 * 指定的配置位置。为基于XML的应用程序提供基类服务
 *
 * 上下文实现搜索为@link classpathxmlapplicationContext和
 *
 * @link filesystemxmlapplicationContext，以及
 *
 * @link org.springframework.web.context.support.xmlWebApplicationContext。
 * @author panlihuan
 * @create 2019-07-26 17:05
 */
public abstract class AbstractRefreshableConfigApplicationContext extends AbstractRefreshableApplicationContext{
    /**
     * Create a new AbstractRefreshableConfigApplicationContext with no parent.
     */
    public AbstractRefreshableConfigApplicationContext() {
    }

    /**
     * Create a new AbstractRefreshableConfigApplicationContext with the given parent context.
     * @param parent the parent context
     */
    public AbstractRefreshableConfigApplicationContext(@Nullable ApplicationContext parent) {
        super(parent);
    }
}
