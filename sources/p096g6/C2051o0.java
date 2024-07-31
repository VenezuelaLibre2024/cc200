package p096g6;

import android.os.Handler;
import android.util.Log;
import java.util.Map;
import java.util.Set;
import p064e6.C1667b;
import p079f6.C1841a;
import p108h6.AbstractC2346c;
import p108h6.InterfaceC2370k;

/* renamed from: g6.o0 */
/* loaded from: classes.dex */
public final class C2051o0 implements AbstractC2346c.c, InterfaceC2040k1 {

    /* renamed from: a */
    public final C1841a.f f8110a;

    /* renamed from: b */
    public final C2002b f8111b;

    /* renamed from: c */
    public InterfaceC2370k f8112c = null;

    /* renamed from: d */
    public Set f8113d = null;

    /* renamed from: e */
    public boolean f8114e = false;

    /* renamed from: f */
    public final /* synthetic */ C2018f f8115f;

    public C2051o0(C2018f c2018f, C1841a.f fVar, C2002b c2002b) {
        this.f8115f = c2018f;
        this.f8110a = fVar;
        this.f8111b = c2002b;
    }

    @Override // p096g6.InterfaceC2040k1
    /* renamed from: a */
    public final void mo8211a(C1667b c1667b) {
        Map map;
        map = this.f8115f.f8029s;
        C2039k0 c2039k0 = (C2039k0) map.get(this.f8111b);
        if (c2039k0 != null) {
            c2039k0.m8184I(c1667b);
        }
    }

    @Override // p108h6.AbstractC2346c.c
    /* renamed from: b */
    public final void mo8233b(C1667b c1667b) {
        Handler handler;
        handler = this.f8115f.f8033w;
        handler.post(new RunnableC2048n0(this, c1667b));
    }

    @Override // p096g6.InterfaceC2040k1
    /* renamed from: c */
    public final void mo8212c(InterfaceC2370k interfaceC2370k, Set set) {
        if (interfaceC2370k == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo8211a(new C1667b(4));
        } else {
            this.f8112c = interfaceC2370k;
            this.f8113d = set;
            m8234h();
        }
    }

    /* renamed from: h */
    public final void m8234h() {
        InterfaceC2370k interfaceC2370k;
        if (!this.f8114e || (interfaceC2370k = this.f8112c) == null) {
            return;
        }
        this.f8110a.getRemoteService(interfaceC2370k, this.f8113d);
    }
}
