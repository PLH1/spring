package org.springframework.context;

/**
 * 描述:
 * Central interface to provide configuration for an application. 为应用程序提供配置的中央接口。
 * This is read-only while the application is running, but may be
 * reloaded if the implementation supports this. 这在应用程序运行时是只读的，但如果实现支持，则可以重新加载。
 * <p>An ApplicationContext provides: 应用程序上下文提供
 * <ul>
 * <li>Bean factory methods for accessing application components. 访问应用程序组件的bean工厂方法。
 * Inherited from {@link org.springframework.beans.factory.ListableBeanFactory}.
 * <li>The ability to load file resources in a generic fashion. 以通用方式加载文件资源的能力
 * Inherited from the {@link org.springframework.core.io.ResourceLoader} interface.
 * <li>The ability to publish events to registered listeners. 向已注册的侦听器发布事件的能力
 * Inherited from the {@link ApplicationEventPublisher} interface.
 * <li>The ability to resolve messages, supporting internationalization. 能够解析消息，支持国际化
 * Inherited from the {@link MessageSource} interface.
 * <li>Inheritance from a parent context. Definitions in a descendant context
 * will always take priority. This means, for example, that a single parent
 * context can be used by an entire web application, while each servlet has
 * its own child context that is independent of that of any other servlet.
 * 从父上下文继承。后代上下文中的定义将始终优先。例如，这意味着整个Web应用程序可以使用单个父上下文，
 * 而每个servlet都有自己的子上下文，独立于任何其他servlet。
 * </ul>
 * @author panlihuan
 * @create 2019-07-26 16:51
 */
public interface ApplicationContext {

}
