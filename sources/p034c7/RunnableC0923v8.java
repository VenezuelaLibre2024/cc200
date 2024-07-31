package p034c7;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c7.v8 */
/* loaded from: classes.dex */
public final class RunnableC0923v8 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ AtomicReference f3672h;

    /* renamed from: i */
    public final /* synthetic */ String f3673i = null;

    /* renamed from: j */
    public final /* synthetic */ String f3674j;

    /* renamed from: k */
    public final /* synthetic */ String f3675k;

    /* renamed from: l */
    public final /* synthetic */ C0936w7 f3676l;

    public RunnableC0923v8(C0936w7 c0936w7, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f3672h = atomicReference;
        this.f3674j = str2;
        this.f3675k = str3;
        this.f3676l = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3676l.f3198a.m3489E().m4027N(this.f3672h, null, this.f3674j, this.f3675k);
    }
}
