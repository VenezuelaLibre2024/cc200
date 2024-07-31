package p096g6;

import android.app.Dialog;

/* renamed from: g6.a2 */
/* loaded from: classes.dex */
public final class C2001a2 extends AbstractC2057q0 {

    /* renamed from: a */
    public final /* synthetic */ Dialog f7988a;

    /* renamed from: b */
    public final /* synthetic */ RunnableC2005b2 f7989b;

    public C2001a2(RunnableC2005b2 runnableC2005b2, Dialog dialog) {
        this.f7989b = runnableC2005b2;
        this.f7988a = dialog;
    }

    @Override // p096g6.AbstractC2057q0
    /* renamed from: a */
    public final void mo8083a() {
        this.f7989b.f7998i.m8105d();
        if (this.f7988a.isShowing()) {
            this.f7988a.dismiss();
        }
    }
}
