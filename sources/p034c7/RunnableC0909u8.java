package p034c7;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c7.u8 */
/* loaded from: classes.dex */
public final class RunnableC0909u8 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ AtomicReference f3638h;

    /* renamed from: i */
    public final /* synthetic */ String f3639i = null;

    /* renamed from: j */
    public final /* synthetic */ String f3640j;

    /* renamed from: k */
    public final /* synthetic */ String f3641k;

    /* renamed from: l */
    public final /* synthetic */ boolean f3642l;

    /* renamed from: m */
    public final /* synthetic */ C0936w7 f3643m;

    public RunnableC0909u8(C0936w7 c0936w7, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f3638h = atomicReference;
        this.f3640j = str2;
        this.f3641k = str3;
        this.f3642l = z10;
        this.f3643m = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3643m.f3198a.m3489E().m4028O(this.f3638h, null, this.f3640j, this.f3641k, this.f3642l);
    }
}
