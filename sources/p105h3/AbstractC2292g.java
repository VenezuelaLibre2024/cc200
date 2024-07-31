package p105h3;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: h3.g */
/* loaded from: classes.dex */
public abstract class AbstractC2292g {

    /* renamed from: h3.g$a */
    /* loaded from: classes.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static AbstractC2292g m9306a() {
        return new C2287b(a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC2292g m9307d() {
        return new C2287b(a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static AbstractC2292g m9308e(long j10) {
        return new C2287b(a.OK, j10);
    }

    /* renamed from: f */
    public static AbstractC2292g m9309f() {
        return new C2287b(a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo9299b();

    /* renamed from: c */
    public abstract a mo9300c();
}
