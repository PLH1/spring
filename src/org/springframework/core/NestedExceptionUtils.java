package org.springframework.core;

import com.sun.istack.internal.Nullable;

/**
 * 描述:
 * Helper class for implementing exception classes which are capable of
 * holding nested exceptions. Necessary because we can't share a base
 * class among different exception types.
 * <p>
 * 用于实现能够
 * 包含嵌套异常。因为我们不能共用一个基地
 * 不同异常类型之间的类。
 *
 * @author panlihuan
 * @create 2019-07-26 16:16
 */
public abstract class NestedExceptionUtils {
    /**
     * Build a message for the given base message and root cause.
     *为给定的基本消息和根本原因生成消息。
     * @param message the base message
     * @param cause   the root cause
     * @return the full exception message
     */
    @Nullable
    public static String buildMessage(@Nullable String message, @Nullable Throwable cause) {
        if (cause == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(64);
        if (message != null) {
            sb.append(message).append("; ");
        }
        sb.append("nested exception is ").append(cause);
        return sb.toString();
    }


}
