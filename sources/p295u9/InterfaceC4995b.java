package p295u9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: u9.b */
/* loaded from: classes.dex */
public @interface InterfaceC4995b {
    boolean nullSafe() default true;

    Class<?> value();
}
