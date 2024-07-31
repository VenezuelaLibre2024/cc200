package be;

import java.text.DecimalFormat;

/* renamed from: be.b */
/* loaded from: classes2.dex */
public final class C0551b {

    /* renamed from: a */
    public static final boolean f2483a = false;

    /* renamed from: b */
    public static final ThreadLocal<DecimalFormat>[] f2484b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal<>();
        }
        f2484b = threadLocalArr;
    }

    /* renamed from: a */
    public static final boolean m2772a() {
        return f2483a;
    }
}
