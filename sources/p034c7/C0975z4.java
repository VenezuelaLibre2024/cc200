package p034c7;

import android.os.Bundle;

/* renamed from: c7.z4 */
/* loaded from: classes.dex */
public final class C0975z4 {

    /* renamed from: a */
    public String f3835a;

    /* renamed from: b */
    public String f3836b;

    /* renamed from: c */
    public long f3837c;

    /* renamed from: d */
    public Bundle f3838d;

    public C0975z4(String str, String str2, Bundle bundle, long j10) {
        this.f3835a = str;
        this.f3836b = str2;
        this.f3838d = bundle == null ? new Bundle() : bundle;
        this.f3837c = j10;
    }

    /* renamed from: b */
    public static C0975z4 m4124b(C0705g0 c0705g0) {
        return new C0975z4(c0705g0.f2943h, c0705g0.f2945j, c0705g0.f2944i.m3079L(), c0705g0.f2946k);
    }

    /* renamed from: a */
    public final C0705g0 m4125a() {
        return new C0705g0(this.f3835a, new C0618a0(new Bundle(this.f3838d)), this.f3836b, this.f3837c);
    }

    public final String toString() {
        return "origin=" + this.f3836b + ",name=" + this.f3835a + ",params=" + String.valueOf(this.f3838d);
    }
}
