package p034c7;

import android.os.Bundle;

/* renamed from: c7.o8 */
/* loaded from: classes.dex */
public final class RunnableC0825o8 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ String f3401h;

    /* renamed from: i */
    public final /* synthetic */ String f3402i;

    /* renamed from: j */
    public final /* synthetic */ long f3403j;

    /* renamed from: k */
    public final /* synthetic */ Bundle f3404k;

    /* renamed from: l */
    public final /* synthetic */ boolean f3405l;

    /* renamed from: m */
    public final /* synthetic */ boolean f3406m;

    /* renamed from: n */
    public final /* synthetic */ boolean f3407n;

    /* renamed from: o */
    public final /* synthetic */ String f3408o;

    /* renamed from: p */
    public final /* synthetic */ C0936w7 f3409p;

    public RunnableC0825o8(C0936w7 c0936w7, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f3401h = str;
        this.f3402i = str2;
        this.f3403j = j10;
        this.f3404k = bundle;
        this.f3405l = z10;
        this.f3406m = z11;
        this.f3407n = z12;
        this.f3408o = str3;
        this.f3409p = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3409p.m3957R(this.f3401h, this.f3402i, this.f3403j, this.f3404k, this.f3405l, this.f3406m, this.f3407n, this.f3408o);
    }
}
