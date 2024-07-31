package p280t8;

/* renamed from: t8.d */
/* loaded from: classes.dex */
public @interface InterfaceC4727d {

    /* renamed from: t8.d$a */
    /* loaded from: classes.dex */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
