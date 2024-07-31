package p045d3;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: d3.d */
/* loaded from: classes.dex */
public abstract class AbstractC1532d<T> {
    /* renamed from: e */
    public static <T> AbstractC1532d<T> m6234e(T t10) {
        return new C1529a(null, t10, EnumC1533e.DEFAULT, null);
    }

    /* renamed from: f */
    public static <T> AbstractC1532d<T> m6235f(T t10, AbstractC1534f abstractC1534f) {
        return new C1529a(null, t10, EnumC1533e.DEFAULT, abstractC1534f);
    }

    /* renamed from: g */
    public static <T> AbstractC1532d<T> m6236g(T t10) {
        return new C1529a(null, t10, EnumC1533e.HIGHEST, null);
    }

    /* renamed from: a */
    public abstract Integer mo6227a();

    /* renamed from: b */
    public abstract T mo6228b();

    /* renamed from: c */
    public abstract EnumC1533e mo6229c();

    /* renamed from: d */
    public abstract AbstractC1534f mo6230d();
}
