package p034c7;

import android.os.Bundle;

/* renamed from: c7.s9 */
/* loaded from: classes.dex */
public final class RunnableC0882s9 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ Bundle f3568h;

    /* renamed from: i */
    public final /* synthetic */ C0854q9 f3569i;

    /* renamed from: j */
    public final /* synthetic */ C0854q9 f3570j;

    /* renamed from: k */
    public final /* synthetic */ long f3571k;

    /* renamed from: l */
    public final /* synthetic */ C0840p9 f3572l;

    public RunnableC0882s9(C0840p9 c0840p9, Bundle bundle, C0854q9 c0854q9, C0854q9 c0854q92, long j10) {
        this.f3568h = bundle;
        this.f3569i = c0854q9;
        this.f3570j = c0854q92;
        this.f3571k = j10;
        this.f3572l = c0840p9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0840p9.m3708E(this.f3572l, this.f3568h, this.f3569i, this.f3570j, this.f3571k);
    }
}
