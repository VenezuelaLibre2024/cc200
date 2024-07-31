package p336x6;

import android.os.RemoteException;
import p352y6.InterfaceC5826e;
import p367z6.C6038v;

/* renamed from: x6.i */
/* loaded from: classes.dex */
public final class C5635i {

    /* renamed from: a */
    public final InterfaceC5826e f21080a;

    public C5635i(InterfaceC5826e interfaceC5826e) {
        this.f21080a = interfaceC5826e;
    }

    /* renamed from: a */
    public boolean m22679a() {
        try {
            return this.f21080a.mo23429b0();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: b */
    public boolean m22680b() {
        try {
            return this.f21080a.mo23432y0();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: c */
    public boolean m22681c() {
        try {
            return this.f21080a.mo23430c0();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: d */
    public boolean m22682d() {
        try {
            return this.f21080a.mo23433z();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: e */
    public boolean m22683e() {
        try {
            return this.f21080a.mo23431m1();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: f */
    public boolean m22684f() {
        try {
            return this.f21080a.mo23427M();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: g */
    public boolean m22685g() {
        try {
            return this.f21080a.mo23426A1();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: h */
    public boolean m22686h() {
        try {
            return this.f21080a.mo23428N();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: i */
    public void m22687i(boolean z10) {
        try {
            this.f21080a.setCompassEnabled(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: j */
    public void m22688j(boolean z10) {
        try {
            this.f21080a.setMapToolbarEnabled(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: k */
    public void m22689k(boolean z10) {
        try {
            this.f21080a.setMyLocationButtonEnabled(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: l */
    public void m22690l(boolean z10) {
        try {
            this.f21080a.setRotateGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: m */
    public void m22691m(boolean z10) {
        try {
            this.f21080a.setScrollGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: n */
    public void m22692n(boolean z10) {
        try {
            this.f21080a.setTiltGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: o */
    public void m22693o(boolean z10) {
        try {
            this.f21080a.setZoomControlsEnabled(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: p */
    public void m22694p(boolean z10) {
        try {
            this.f21080a.setZoomGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }
}
