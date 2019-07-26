package org.springframework.context.support;

import com.sun.istack.internal.Nullable;
import org.springframework.context.ApplicationContext;

/**
 * 描述:
 *
 * @author panlihuan
 * @create 2019-07-26 17:08
 */
public class AbstractRefreshableApplicationContext extends AbstractApplicationContext {
    /**
     * Create a new AbstractRefreshableApplicationContext with no parent.
     */
    public AbstractRefreshableApplicationContext() {
    }

    /**
     * Create a new AbstractRefreshableApplicationContext with the given parent context.
     * @param parent the parent context
     */
    public AbstractRefreshableApplicationContext(@Nullable ApplicationContext parent) {
        super(parent);
    }

}
