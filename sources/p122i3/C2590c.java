package p122i3;

/* renamed from: i3.c */
/* loaded from: classes.dex */
public final class C2590c<T> implements InterfaceC2589b<T> {

    /* renamed from: b */
    public static final C2590c<Object> f10148b = new C2590c<>(null);

    /* renamed from: a */
    public final T f10149a;

    public C2590c(T t10) {
        this.f10149a = t10;
    }

    /* renamed from: a */
    public static <T> InterfaceC2589b<T> m10353a(T t10) {
        return new C2590c(C2591d.m10356c(t10, "instance cannot be null"));
    }

    @Override // p086fd.InterfaceC1904a
    public T get() {
        return this.f10149a;
    }
}
