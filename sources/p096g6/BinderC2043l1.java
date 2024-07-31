package p096g6;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;
import p049d7.C1598e;
import p049d7.InterfaceC1599f;
import p064e6.C1667b;
import p065e7.BinderC1707d;
import p065e7.C1715l;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p108h6.C2352e;
import p108h6.C2394s;
import p108h6.C2398t0;

/* renamed from: g6.l1 */
/* loaded from: classes.dex */
public final class BinderC2043l1 extends BinderC1707d implements AbstractC1846f.a, AbstractC1846f.b {

    /* renamed from: j */
    public static final C1841a.a f8092j = C1598e.f5924c;

    /* renamed from: a */
    public final Context f8093a;

    /* renamed from: b */
    public final Handler f8094b;

    /* renamed from: c */
    public final C1841a.a f8095c;

    /* renamed from: f */
    public final Set f8096f;

    /* renamed from: g */
    public final C2352e f8097g;

    /* renamed from: h */
    public InterfaceC1599f f8098h;

    /* renamed from: i */
    public InterfaceC2040k1 f8099i;

    public BinderC2043l1(Context context, Handler handler, C2352e c2352e) {
        C1841a.a aVar = f8092j;
        this.f8093a = context;
        this.f8094b = handler;
        this.f8097g = (C2352e) C2394s.m9620m(c2352e, "ClientSettings must not be null");
        this.f8096f = c2352e.m9525g();
        this.f8095c = aVar;
    }

    /* renamed from: N1 */
    public static /* bridge */ /* synthetic */ void m8218N1(BinderC2043l1 binderC2043l1, C1715l c1715l) {
        C1667b m6758I = c1715l.m6758I();
        if (m6758I.m6681M()) {
            C2398t0 c2398t0 = (C2398t0) C2394s.m9619l(c1715l.m6759J());
            m6758I = c2398t0.m9628I();
            if (m6758I.m6681M()) {
                binderC2043l1.f8099i.mo8212c(c2398t0.m9629J(), binderC2043l1.f8096f);
                binderC2043l1.f8098h.disconnect();
            } else {
                String valueOf = String.valueOf(m6758I);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            }
        }
        binderC2043l1.f8099i.mo8211a(m6758I);
        binderC2043l1.f8098h.disconnect();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [d7.f, f6.a$f] */
    /* renamed from: O1 */
    public final void m8219O1(InterfaceC2040k1 interfaceC2040k1) {
        InterfaceC1599f interfaceC1599f = this.f8098h;
        if (interfaceC1599f != null) {
            interfaceC1599f.disconnect();
        }
        this.f8097g.m9529k(Integer.valueOf(System.identityHashCode(this)));
        C1841a.a aVar = this.f8095c;
        Context context = this.f8093a;
        Looper looper = this.f8094b.getLooper();
        C2352e c2352e = this.f8097g;
        this.f8098h = aVar.buildClient(context, looper, c2352e, (C2352e) c2352e.m9526h(), (AbstractC1846f.a) this, (AbstractC1846f.b) this);
        this.f8099i = interfaceC2040k1;
        Set set = this.f8096f;
        if (set == null || set.isEmpty()) {
            this.f8094b.post(new RunnableC2032i1(this));
        } else {
            this.f8098h.mo6433b();
        }
    }

    /* renamed from: P1 */
    public final void m8220P1() {
        InterfaceC1599f interfaceC1599f = this.f8098h;
        if (interfaceC1599f != null) {
            interfaceC1599f.disconnect();
        }
    }

    @Override // p096g6.InterfaceC2014e
    /* renamed from: c */
    public final void mo8108c(int i10) {
        this.f8098h.disconnect();
    }

    @Override // p096g6.InterfaceC2044m
    /* renamed from: e */
    public final void mo8194e(C1667b c1667b) {
        this.f8099i.mo8211a(c1667b);
    }

    @Override // p096g6.InterfaceC2014e
    /* renamed from: g */
    public final void mo8109g(Bundle bundle) {
        this.f8098h.mo6432a(this);
    }

    @Override // p065e7.InterfaceC1709f
    /* renamed from: w */
    public final void mo6756w(C1715l c1715l) {
        this.f8094b.post(new RunnableC2036j1(this, c1715l));
    }
}
