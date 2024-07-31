package p295u9;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: u9.a */
/* loaded from: classes.dex */
public @interface InterfaceC4994a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
