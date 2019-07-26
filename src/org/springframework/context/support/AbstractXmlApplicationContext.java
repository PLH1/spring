package org.springframework.context.support;

import com.sun.istack.internal.Nullable;
import org.springframework.context.ApplicationContext;

/**
 * 描述:
 * Convenient base class for {@link org.springframework.context.ApplicationContext}
 *  implementations, drawing configuration from XML documents containing bean definitions
 *  understood by an {@link org.springframework.beans.factory.xml.XmlBeanDefinitionReader}.
 *  <p>Subclasses just have to implement the {@link #getConfigResources} and/or
 *  the {@link #getConfigLocations} method. Furthermore, they might override
 *  the {@link #getResourceByPath} hook to interpret relative paths in an
 *  environment-specific fashion, and/or {@link #getResourcePatternResolver}
 *  for extended pattern resolution.
 *
 *  方便@link org.springframework.context.applicationContext的基类
 *
 * 实现，从包含bean定义的XML文档中绘制配置
 *
 * 被@link org.springframework.beans.factory.xml.xmlbeanDefinitionReader理解。
 *
 * <p>子类只需实现@link getconfigresources和/或
 *
 * @link getconfiglocations方法。此外，它们可能会覆盖
 *
 * @link getresourcebypath钩子用于解释
 *
 * 环境特定的方式和/或@link getresourcepatternalresolver
 *
 * 用于扩展模式分辨率。
 *
 * @author panlihuan
 * @create 2019-07-26 17:03
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableConfigApplicationContext{
    /**
     * Create a new AbstractXmlApplicationContext with no parent.
     */
    public AbstractXmlApplicationContext() {
    }
    /**
     * Create a new AbstractXmlApplicationContext with the given parent context.
     * @param parent the parent context
     */
    public AbstractXmlApplicationContext(@Nullable ApplicationContext parent) {
        super(parent);
    }
}
