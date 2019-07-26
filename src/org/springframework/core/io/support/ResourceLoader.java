package org.springframework.core.io.support;

/**
 * 描述:
 *Strategy interface for loading resources (e.. class path or file system
 * resources). An {@link org.springframework.context.ApplicationContext}
 * is required to provide this functionality, plus extended
 * {@link org.springframework.core.io.support.ResourcePatternResolver} support.
 * <p>{@link DefaultResourceLoader} is a standalone implementation that is
 * usable outside an ApplicationContext, also used by {@link ResourceEditor}.
 * <p>Bean properties of type Resource and Resource array can be populated
 * from Strings when running in an ApplicationContext, using the particular
 * context's resource loading strategy.
 *
 * 加载资源的策略接口（E..类路径或文件系统
 * 资源）。一个@link org.springframework.context.applicationContext
 * 需要提供此功能，以及扩展
 * @link org.springframework.core.io.support.resourcepatternresolver支持。
 * <p>@link defaultresourceloader是一个独立的实现，即
 * 在applicationContext之外可用，也由@link resourceeditor使用。
 * <p>可以填充类型资源和资源数组的bean属性
 * 在应用程序上下文中运行时，使用特定的
 * 上下文的资源加载策略。
 *
 * @author panlihuan
 * @create 2019-07-26 17:23
 */
public interface ResourceLoader {
}
