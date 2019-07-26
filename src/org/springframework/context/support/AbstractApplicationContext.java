package org.springframework.context.support;

import com.sun.istack.internal.Nullable;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * 描述:
 * Base class for {@link org.springframework.context.ApplicationContext}
 * implementations which are supposed to support multiple calls to {@link #refresh()},
 * creating a new internal bean factory instance every time.
 * Typically (but not necessarily), such a context will be driven by
 * a set of config locations to load bean definitions from.
 * <p>The only method to be implemented by subclasses is {@link #loadBeanDefinitions},
 * which gets invoked on each refresh. A concrete implementation is supposed to load
 * bean definitions into the given
 * {@link org.springframework.beans.factory.support.DefaultListableBeanFactory},
 * typically delegating to one or more specific bean definition readers.
 * <p><b>Note that there is a similar base class for WebApplicationContexts.</b>
 * {@link org.springframework.web.context.support.AbstractRefreshableWebApplicationContext}
 * provides the same subclassing strategy, but additionally pre-implements
 * all context functionality for web environments. There is also a
 * pre-defined way to receive config locations for a web context.
 * <p>Concrete standalone subclasses of this base class, reading in a
 * specific bean definition format, are {@link ClassPathXmlApplicationContext}
 * and {@link FileSystemXmlApplicationContext}, which both derive from the
 * common {@link AbstractXmlApplicationContext} base class;
 * {@link org.springframework.context.annotation.AnnotationConfigApplicationContext}
 * supports {@code @Configuration}-annotated classes as a source of bean definitions.
 *
 * @link org.springframework.context.applicationContext的基类
 * 应支持对@link refresh（）的多个调用的实现，
 * 每次都创建一个新的内部bean工厂实例。
 * 通常（但不一定），这样的环境将由
 * 从中加载bean定义的一组配置位置。
 * <p>子类要实现的唯一方法是@link loadbeandefinitions，
 * 在每次刷新时调用。应该加载一个具体的实现
 * bean定义到给定的
 * @link org.springframework.beans.factory.support.defaultListableBeanFactory，
 * 通常委托给一个或多个特定的bean定义阅读器。
 * <p><b>请注意，WebApplicationContexts有一个类似的基类。<b>
 * @link org.springframework.web.context.support.abstractRefreshableWebApplicationContext_
 * 提供相同的子类化策略，但另外还预实现
 * Web环境的所有上下文功能。还有一个
 * 为Web上下文接收配置位置的预定义方法。
 * <p>该基类的具体独立子类，在
 * 特定的bean定义格式是@link classpathxmlapplicationContext
 * 和@link filesystemxmlapplicationContext，两者都源自
 * Common@Link AbstractXmlApplicationContext基类；
 *
 * @link org.springframework.context.annotation.annotationConfigApplicationContext_
 *
 * 支持@code@configuration-注释类作为bean定义的源。
 * @author panlihuan
 * @create 2019-07-26 17:09
 */
public class AbstractApplicationContext extends DefaultResourceLoader
 implements {

    /** ResourcePatternResolver used by this context. */
    private ResourcePatternResolver resourcePatternResolver;

    /** Parent context. */
    @Nullable
    private ApplicationContext parent;

    /**
     * Create a new AbstractApplicationContext with no parent.
     */
    public AbstractApplicationContext() {
        this.resourcePatternResolver = getResourcePatternResolver();
    }

    private ResourcePatternResolver getResourcePatternResolver() {
        return new PathMatchingResourcePatternResolver(resourcePatternResolver);
    }

    /**
     * Create a new AbstractApplicationContext with the given parent context.
     * @param parent the parent context
     */
    public AbstractApplicationContext(@Nullable ApplicationContext parent) {
        this();
        setParent(parent);
    }

    private void setParent(ApplicationContext parent) {
        this.parent = parent;
        if (parent != null) {
            Environment parentEnvironment = parent.getEnvironment();
            if (parentEnvironment instanceof ConfigurableEnvironment) {
                getEnvironment().merge((ConfigurableEnvironment) parentEnvironment);
            }
        }
    }


}
