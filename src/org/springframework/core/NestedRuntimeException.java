package org.springframework.core;

/**
 * 描述:
 *Handy class for wrapping runtime {@code Exceptions} with a root cause.
 * <p>This class is {@code abstract} to force the programmer to extend
 * the class. {@code getMessage} will include nested exception
 * information; {@code printStackTrace} and other like methods will
 * delegate to the wrapped exception, if any.
 * <p>The similarity between this class and the
 * class is unavoidable, as Java forces these two classes to have different
 * superclasses (ah, the inflexibility of concrete inheritance!).
 * @author panlihuan
 * @create 2019-07-26 16:08
 * @See NestedCheckedException
 */
public class NestedRuntimeException extends RuntimeException{
    /**
     * Use serialVersionUID from Spring 1.2 for interoperability.
     */
    private static final long serialVersionUID = 7100714597678207546L;

    static {
        // Eagerly load the NestedExceptionUtils class to avoid classloader deadlock
        // issues on OSGi when calling getMessage(). Reported by Don Brown; SPR-5607.
        NestedExceptionUtils.class.getName();
    }

}
