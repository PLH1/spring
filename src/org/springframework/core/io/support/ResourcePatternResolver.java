package org.springframework.core.io.support;

/**
 * 描述:
 *Strategy interface for resolving a location pattern (for example,
 * an Ant-style path pattern) into Resource objects.
 * <p>This is an extension to the {@link org.springframework.core.io.ResourceLoader}
 * interface. A passed-in ResourceLoader (for example, an
 * {@link org.springframework.context.ApplicationContext} passed in via
 * {@link org.springframework.context.ResourceLoaderAware} when running in a context)
 * can be checked whether it implements this extended interface too.
 * <p>{@link PathMatchingResourcePatternResolver} is a standalone implementation
 * that is usable outside an ApplicationContext, also used by
 * {@link ResourceArrayPropertyEditor} for populating Resource array bean properties.
 * <p>Can be used with any sort of location pattern (e.g. "/WEB-INF/*-context.xml"):
 * Input patterns have to match the strategy implementation. This interface just
 * specifies the conversion method rather than a specific pattern format.
 * <p>This interface also suggests a new resource prefix "classpath*:" for all
 * matching resources from the class path. Note that the resource location is
 * expected to be a path without placeholders in this case (e.g. "/beans.xml");
 * JAR files or classes directories can contain multiple files of the same name.
 * 用于解决位置模式的策略接口（例如，
 *
 * 一个Ant样式的路径模式）。
 *
 * <p>这是对@link org.springframework.core.io.resourceloader的扩展
 *
 * 接口。传入的资源加载器（例如，
 *
 * @link org.springframework.context.applicationContext通过
 *
 * @link org.springframework.context.resourceloaderaware在上下文中运行时）
 *
 * 可以检查它是否也实现了这个扩展接口。
 *
 * <p>@link pathmatchingResourcePatternResolver是一个独立的实现
 *
 * 可在ApplicationContext之外使用，也可由
 *
 * @link resourcearraypropertiesyeditor用于填充资源数组bean属性。
 *
 * <p>可用于任何类型的位置模式（例如“/WEB-INF/*-context.xml”）：
 *
 * 输入模式必须与策略实现相匹配。这个接口只是
 *
 * 指定转换方法而不是特定的模式格式。
 *
 * <p>此接口还建议为所有资源使用新的资源前缀“classpath*：”
 *
 * 正在匹配类路径中的资源。请注意，资源位置是
 *
 * 在这种情况下，应该是没有占位符的路径（例如“/beans.xml”）；
 *
 * JAR文件或类目录可以包含多个同名文件。
 *
 * @author panlihuan
 * @create 2019-07-26 17:19
 */
public interface ResourcePatternResolver extends ResourceLoader {
}
