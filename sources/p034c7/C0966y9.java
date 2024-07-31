package p034c7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p064e6.C1683j;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p194n6.C3760a;
import p207o6.InterfaceC3935d;

/* renamed from: c7.y9 */
/* loaded from: classes.dex */
public final class C0966y9 extends AbstractC0680e3 {

    /* renamed from: c */
    public final ServiceConnectionC0869ra f3777c;

    /* renamed from: d */
    public InterfaceC0821o4 f3778d;

    /* renamed from: e */
    public volatile Boolean f3779e;

    /* renamed from: f */
    public final AbstractC0900u f3780f;

    /* renamed from: g */
    public final C0870rb f3781g;

    /* renamed from: h */
    public final List<Runnable> f3782h;

    /* renamed from: i */
    public final AbstractC0900u f3783i;

    public C0966y9(C0767k6 c0767k6) {
        super(c0767k6);
        this.f3782h = new ArrayList();
        this.f3781g = new C0870rb(c0767k6.zzb());
        this.f3777c = new ServiceConnectionC0869ra(this);
        this.f3780f = new C0952x9(this, c0767k6);
        this.f3783i = new C0771ka(this, c0767k6);
    }

    /* renamed from: D */
    public static /* synthetic */ void m4009D(C0966y9 c0966y9, ComponentName componentName) {
        c0966y9.mo3099i();
        if (c0966y9.f3778d != null) {
            c0966y9.f3778d = null;
            c0966y9.zzj().m3918F().m3996b("Disconnected from device MeasurementService", componentName);
            c0966y9.mo3099i();
            c0966y9.m4033T();
        }
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m4013g0(C0966y9 c0966y9) {
        c0966y9.mo3099i();
        if (c0966y9.m4037X()) {
            c0966y9.zzj().m3918F().m3995a("Inactivity, disconnecting from the service");
            c0966y9.m4034U();
        }
    }

    /* renamed from: A */
    public final void m4016A(InterfaceC0821o4 interfaceC0821o4) {
        mo3099i();
        C2394s.m9619l(interfaceC0821o4);
        this.f3778d = interfaceC0821o4;
        m4042c0();
        m4041b0();
    }

    /* renamed from: B */
    public final void m4017B(InterfaceC0821o4 interfaceC0821o4, AbstractC2601a abstractC2601a, C0871rc c0871rc) {
        int i10;
        C0947x4 m3914B;
        String str;
        mo3099i();
        m3155q();
        int i11 = 0;
        int i12 = 100;
        while (i11 < 1001 && i12 == 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractC2601a> m3837x = mo3102l().m3837x(100);
            if (m3837x != null) {
                arrayList.addAll(m3837x);
                i10 = m3837x.size();
            } else {
                i10 = 0;
            }
            if (abstractC2601a != null && i10 < 100) {
                arrayList.add(abstractC2601a);
            }
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                AbstractC2601a abstractC2601a2 = (AbstractC2601a) obj;
                if (abstractC2601a2 instanceof C0705g0) {
                    try {
                        interfaceC0821o4.mo3662i1((C0705g0) abstractC2601a2, c0871rc);
                    } catch (RemoteException e10) {
                        e = e10;
                        m3914B = zzj().m3914B();
                        str = "Failed to send event to the service";
                        m3914B.m3996b(str, e);
                    }
                } else if (abstractC2601a2 instanceof C0787lc) {
                    try {
                        interfaceC0821o4.mo3671x1((C0787lc) abstractC2601a2, c0871rc);
                    } catch (RemoteException e11) {
                        e = e11;
                        m3914B = zzj().m3914B();
                        str = "Failed to send user property to the service";
                        m3914B.m3996b(str, e);
                    }
                } else if (abstractC2601a2 instanceof C0690f) {
                    try {
                        interfaceC0821o4.mo3653C0((C0690f) abstractC2601a2, c0871rc);
                    } catch (RemoteException e12) {
                        e = e12;
                        m3914B = zzj().m3914B();
                        str = "Failed to send conditional user property to the service";
                        m3914B.m3996b(str, e);
                    }
                } else {
                    zzj().m3914B().m3995a("Discarding data. Unrecognized parcel type.");
                }
            }
            i11++;
            i12 = i10;
        }
    }

    /* renamed from: C */
    public final void m4018C(C0854q9 c0854q9) {
        mo3099i();
        m3155q();
        m4024K(new RunnableC0743ia(this, c0854q9));
    }

    /* renamed from: F */
    public final void m4019F(C0787lc c0787lc) {
        mo3099i();
        m3155q();
        m4024K(new RunnableC0628aa(this, m4043e0(true), mo3102l().m3831B(c0787lc), c0787lc));
    }

    /* renamed from: G */
    public final void m4020G(zzcv zzcvVar) {
        mo3099i();
        m3155q();
        m4024K(new RunnableC0701fa(this, m4043e0(false), zzcvVar));
    }

    /* renamed from: H */
    public final void m4021H(zzcv zzcvVar, C0705g0 c0705g0, String str) {
        mo3099i();
        m3155q();
        if (mo3096f().m3803p(C1683j.f6269a) == 0) {
            m4024K(new RunnableC0757ja(this, c0705g0, str, zzcvVar));
        } else {
            zzj().m3919G().m3995a("Not bundling data. Service unavailable or out of date");
            mo3096f().m3791U(zzcvVar, new byte[0]);
        }
    }

    /* renamed from: I */
    public final void m4022I(zzcv zzcvVar, String str, String str2) {
        mo3099i();
        m3155q();
        m4024K(new RunnableC0841pa(this, str, str2, m4043e0(false), zzcvVar));
    }

    /* renamed from: J */
    public final void m4023J(zzcv zzcvVar, String str, String str2, boolean z10) {
        mo3099i();
        m3155q();
        m4024K(new RunnableC0980z9(this, str, str2, m4043e0(false), z10, zzcvVar));
    }

    /* renamed from: K */
    public final void m4024K(Runnable runnable) {
        mo3099i();
        if (m4037X()) {
            runnable.run();
        } else {
            if (this.f3782h.size() >= 1000) {
                zzj().m3914B().m3995a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f3782h.add(runnable);
            this.f3783i.m3851b(60000L);
            m4033T();
        }
    }

    /* renamed from: L */
    public final void m4025L(AtomicReference<String> atomicReference) {
        mo3099i();
        m3155q();
        m4024K(new RunnableC0658ca(this, atomicReference, m4043e0(false)));
    }

    /* renamed from: M */
    public final void m4026M(AtomicReference<List<C0856qb>> atomicReference, Bundle bundle) {
        mo3099i();
        m3155q();
        m4024K(new RunnableC0643ba(this, atomicReference, m4043e0(false), bundle));
    }

    /* renamed from: N */
    public final void m4027N(AtomicReference<List<C0690f>> atomicReference, String str, String str2, String str3) {
        mo3099i();
        m3155q();
        m4024K(new RunnableC0855qa(this, atomicReference, str, str2, str3, m4043e0(false)));
    }

    /* renamed from: O */
    public final void m4028O(AtomicReference<List<C0787lc>> atomicReference, String str, String str2, String str3, boolean z10) {
        mo3099i();
        m3155q();
        m4024K(new RunnableC0883sa(this, atomicReference, str, str2, str3, m4043e0(false), z10));
    }

    /* renamed from: P */
    public final void m4029P(boolean z10) {
        mo3099i();
        m3155q();
        if (z10) {
            mo3102l().m3832C();
        }
        if (m4039Z()) {
            m4024K(new RunnableC0785la(this, m4043e0(false)));
        }
    }

    /* renamed from: Q */
    public final C0760k m4030Q() {
        mo3099i();
        m3155q();
        InterfaceC0821o4 interfaceC0821o4 = this.f3778d;
        if (interfaceC0821o4 == null) {
            m4033T();
            zzj().m3913A().m3995a("Failed to get consents; not connected to service yet.");
            return null;
        }
        C0871rc m4043e0 = m4043e0(false);
        C2394s.m9619l(m4043e0);
        try {
            C0760k mo3660i = interfaceC0821o4.mo3660i(m4043e0);
            m4042c0();
            return mo3660i;
        } catch (RemoteException e10) {
            zzj().m3914B().m3996b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    /* renamed from: R */
    public final Boolean m4031R() {
        return this.f3779e;
    }

    /* renamed from: S */
    public final void m4032S() {
        mo3099i();
        m3155q();
        C0871rc m4043e0 = m4043e0(true);
        mo3102l().m3833D();
        m4024K(new RunnableC0687ea(this, m4043e0));
    }

    /* renamed from: T */
    public final void m4033T() {
        mo3099i();
        m3155q();
        if (m4037X()) {
            return;
        }
        if (m4040a0()) {
            this.f3777c.m3820a();
            return;
        }
        if (mo3092a().m3272O()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (!((queryIntentServices == null || queryIntentServices.isEmpty()) ? false : true)) {
            zzj().m3914B().m3995a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f3777c.m3821b(intent);
    }

    /* renamed from: U */
    public final void m4034U() {
        mo3099i();
        m3155q();
        this.f3777c.m3824f();
        try {
            C3760a.m14312b().m14317c(zza(), this.f3777c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f3778d = null;
    }

    /* renamed from: V */
    public final void m4035V() {
        mo3099i();
        m3155q();
        C0871rc m4043e0 = m4043e0(false);
        mo3102l().m3832C();
        m4024K(new RunnableC0673da(this, m4043e0));
    }

    /* renamed from: W */
    public final void m4036W() {
        mo3099i();
        m3155q();
        m4024K(new RunnableC0799ma(this, m4043e0(true)));
    }

    /* renamed from: X */
    public final boolean m4037X() {
        mo3099i();
        m3155q();
        return this.f3778d != null;
    }

    /* renamed from: Y */
    public final boolean m4038Y() {
        mo3099i();
        m3155q();
        return !m4040a0() || mo3096f().m3766B0() >= 200900;
    }

    /* renamed from: Z */
    public final boolean m4039Z() {
        mo3099i();
        m3155q();
        return !m4040a0() || mo3096f().m3766B0() >= C0733i0.f3120o0.m3607a(null).intValue();
    }

    @Override // p034c7.C0754j7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0718h mo3092a() {
        return super.mo3092a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ef  */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4040a0() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0966y9.m4040a0():boolean");
    }

    /* renamed from: b0 */
    public final void m4041b0() {
        mo3099i();
        zzj().m3918F().m3996b("Processing queued up service tasks", Integer.valueOf(this.f3782h.size()));
        Iterator<Runnable> it = this.f3782h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e10) {
                zzj().m3914B().m3996b("Task exception while flushing queue", e10);
            }
        }
        this.f3782h.clear();
        this.f3783i.m3850a();
    }

    @Override // p034c7.C0754j7
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C0970z mo3093c() {
        return super.mo3093c();
    }

    /* renamed from: c0 */
    public final void m4042c0() {
        mo3099i();
        this.f3781g.m3828c();
        this.f3780f.m3851b(C0733i0.f3059L.m3607a(null).longValue());
    }

    @Override // p034c7.C0754j7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C0905u4 mo3094d() {
        return super.mo3094d();
    }

    @Override // p034c7.C0754j7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C0738i5 mo3095e() {
        return super.mo3095e();
    }

    /* renamed from: e0 */
    public final C0871rc m4043e0(boolean z10) {
        return mo3101k().m3703w(z10 ? zzj().m3922J() : null);
    }

    @Override // p034c7.C0754j7
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0857qc mo3096f() {
        return super.mo3096f();
    }

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo3097g() {
        super.mo3097g();
    }

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo3098h() {
        super.mo3098h();
    }

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo3099i() {
        super.mo3099i();
    }

    @Override // p034c7.C0695f4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C0633b0 mo3100j() {
        return super.mo3100j();
    }

    @Override // p034c7.C0695f4
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C0835p4 mo3101k() {
        return super.mo3101k();
    }

    @Override // p034c7.C0695f4
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C0877s4 mo3102l() {
        return super.mo3102l();
    }

    @Override // p034c7.C0695f4
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0936w7 mo3103m() {
        return super.mo3103m();
    }

    @Override // p034c7.C0695f4
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C0840p9 mo3104n() {
        return super.mo3104n();
    }

    @Override // p034c7.C0695f4
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C0966y9 mo3105o() {
        return super.mo3105o();
    }

    @Override // p034c7.C0695f4
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C0716gb mo3106p() {
        return super.mo3106p();
    }

    @Override // p034c7.AbstractC0680e3
    /* renamed from: v */
    public final boolean mo3160v() {
        return false;
    }

    /* renamed from: x */
    public final void m4044x(Bundle bundle) {
        mo3099i();
        m3155q();
        m4024K(new RunnableC0715ga(this, m4043e0(false), bundle));
    }

    /* renamed from: y */
    public final void m4045y(C0690f c0690f) {
        C2394s.m9619l(c0690f);
        mo3099i();
        m3155q();
        m4024K(new RunnableC0813na(this, true, m4043e0(true), mo3102l().m3839z(c0690f), new C0690f(c0690f), c0690f));
    }

    /* renamed from: z */
    public final void m4046z(C0705g0 c0705g0, String str) {
        C2394s.m9619l(c0705g0);
        mo3099i();
        m3155q();
        m4024K(new RunnableC0827oa(this, true, m4043e0(true), mo3102l().m3830A(c0705g0), c0705g0, str));
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ InterfaceC3935d zzb() {
        return super.zzb();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0647c zzd() {
        return super.zzd();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0919v4 zzj() {
        return super.zzj();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0669d6 zzl() {
        return super.zzl();
    }
}
