package org.springframework.util;

import com.sun.istack.internal.Nullable;

/**
 * 描述:
 *
 * @author panlihuan
 * @create 2019-07-26 17:31
 */
public abstract class Assert {
    public static void notNull(@Nullable Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }
}
