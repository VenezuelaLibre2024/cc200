package p096g6;

import android.os.Handler;
import p096g6.ComponentCallbacks2C2006c;

/* renamed from: g6.f0 */
/* loaded from: classes.dex */
public final class C2019f0 implements ComponentCallbacks2C2006c.a {

    /* renamed from: a */
    public final /* synthetic */ C2018f f8035a;

    public C2019f0(C2018f c2018f) {
        this.f8035a = c2018f;
    }

    @Override // p096g6.ComponentCallbacks2C2006c.a
    /* renamed from: a */
    public final void mo8097a(boolean z10) {
        Handler handler;
        Handler handler2;
        C2018f c2018f = this.f8035a;
        handler = c2018f.f8033w;
        handler2 = c2018f.f8033w;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
