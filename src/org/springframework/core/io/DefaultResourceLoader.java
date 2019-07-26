package org.springframework.core.io;

import com.sun.istack.internal.Nullable;
import org.springframework.core.io.support.ResourceLoader;
import org.springframework.util.ClassUtils;

/**
 * 描述:
 *
 * @author panlihuan
 * @create 2019-07-26 17:43
 */
public class DefaultResourceLoader implements ResourceLoader {

    @Nullable
    private ClassLoader classLoader;


    /**
     * Create a new DefaultResourceLoader.
     * <p>ClassLoader access will happen using the thread context class loader
     * at the time of this ResourceLoader's initialization.
     * @see java.lang.Thread#getContextClassLoader()
     */
    public DefaultResourceLoader() {
        this.classLoader = ClassUtils.getDefaultClassLoader();
    }

    /**
     * Create a new DefaultResourceLoader.
     * @param classLoader the ClassLoader to load class path resources with, or {@code null}
     * for using the thread context class loader at the time of actual resource access
     */
    public DefaultResourceLoader(@Nullable ClassLoader classLoader) {
        this.classLoader = classLoader;
    }
}
