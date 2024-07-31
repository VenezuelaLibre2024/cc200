package p096g6;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.util.VisibleForTesting;
import p064e6.C1667b;
import p064e6.C1673e;
import p108h6.C2394s;
import p285u.C4772b;

/* renamed from: g6.b0 */
/* loaded from: classes.dex */
public final class C2003b0 extends AbstractDialogInterfaceOnCancelListenerC2009c2 {

    /* renamed from: l */
    public final C4772b f7994l;

    /* renamed from: m */
    public final C2018f f7995m;

    @VisibleForTesting
    public C2003b0(InterfaceC2030i interfaceC2030i, C2018f c2018f, C1673e c1673e) {
        super(interfaceC2030i, c1673e);
        this.f7994l = new C4772b();
        this.f7995m = c2018f;
        this.mLifecycleFragment.mo8156a("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: j */
    public static void m8086j(Activity activity, C2018f c2018f, C2002b c2002b) {
        InterfaceC2030i fragment = LifecycleCallback.getFragment(activity);
        C2003b0 c2003b0 = (C2003b0) fragment.mo8157b("ConnectionlessLifecycleHelper", C2003b0.class);
        if (c2003b0 == null) {
            c2003b0 = new C2003b0(fragment, c2018f, C1673e.m6693m());
        }
        C2394s.m9620m(c2002b, "ApiKey cannot be null");
        c2003b0.f7994l.add(c2002b);
        c2018f.m8137d(c2003b0);
    }

    @Override // p096g6.AbstractDialogInterfaceOnCancelListenerC2009c2
    /* renamed from: b */
    public final void mo8087b(C1667b c1667b, int i10) {
        this.f7995m.m8134K(c1667b, i10);
    }

    @Override // p096g6.AbstractDialogInterfaceOnCancelListenerC2009c2
    /* renamed from: c */
    public final void mo8088c() {
        this.f7995m.m8135b();
    }

    /* renamed from: i */
    public final C4772b m8089i() {
        return this.f7994l;
    }

    /* renamed from: k */
    public final void m8090k() {
        if (this.f7994l.isEmpty()) {
            return;
        }
        this.f7995m.m8137d(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        m8090k();
    }

    @Override // p096g6.AbstractDialogInterfaceOnCancelListenerC2009c2, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        m8090k();
    }

    @Override // p096g6.AbstractDialogInterfaceOnCancelListenerC2009c2, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        this.f7995m.m8138e(this);
    }
}
