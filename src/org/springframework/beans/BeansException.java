package org.springframework.beans;

import org.springframework.core.NestedRuntimeException;

/**
 * 描述:
 * beans包中抛出的所有异常的抽象超类和子包。
 *
 * <p>请注意，这是运行时（未选中）异常。beans异常
 * 通常是致命的；没有理由检查它们。
 *
 * @author panlihuan
 * @create 2019-07-26 16:04
 */
public abstract class BeansException  extends NestedRuntimeException {
}
