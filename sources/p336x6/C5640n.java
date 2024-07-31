package p336x6;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import p108h6.C2394s;
import p252r6.BinderC4309d;
import p252r6.InterfaceC4308c;
import p352y6.C5825d0;
import p352y6.InterfaceC5822c;
import p367z6.C6038v;

/* renamed from: x6.n */
/* loaded from: classes.dex */
public final class C5640n implements InterfaceC4308c {

    /* renamed from: a */
    public final ViewGroup f21084a;

    /* renamed from: b */
    public final InterfaceC5822c f21085b;

    /* renamed from: c */
    public View f21086c;

    public C5640n(ViewGroup viewGroup, InterfaceC5822c interfaceC5822c) {
        this.f21085b = (InterfaceC5822c) C2394s.m9619l(interfaceC5822c);
        this.f21084a = (ViewGroup) C2394s.m9619l(viewGroup);
    }

    /* renamed from: a */
    public final void m22698a(InterfaceC5632f interfaceC5632f) {
        try {
            this.f21085b.mo23425h1(new BinderC5639m(this, interfaceC5632f));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    @Override // p252r6.InterfaceC4308c
    public final void onCreate(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C5825d0.m23438b(bundle, bundle2);
            this.f21085b.onCreate(bundle2);
            C5825d0.m23438b(bundle2, bundle);
            this.f21086c = (View) BinderC4309d.m16571e(this.f21085b.getView());
            this.f21084a.removeAllViews();
            this.f21084a.addView(this.f21086c);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    @Override // p252r6.InterfaceC4308c
    public final void onDestroy() {
        try {
            this.f21085b.onDestroy();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    @Override // p252r6.InterfaceC4308c
    public final void onResume() {
        try {
            this.f21085b.onResume();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    @Override // p252r6.InterfaceC4308c
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C5825d0.m23438b(bundle, bundle2);
            this.f21085b.onSaveInstanceState(bundle2);
            C5825d0.m23438b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    @Override // p252r6.InterfaceC4308c
    public final void onStart() {
        try {
            this.f21085b.onStart();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    @Override // p252r6.InterfaceC4308c
    public final void onStop() {
        try {
            this.f21085b.onStop();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }
}
