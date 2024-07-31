package p034c7;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzcp;
import p207o6.InterfaceC3935d;

/* renamed from: c7.gb */
/* loaded from: classes.dex */
public final class C0716gb extends AbstractC0680e3 {

    /* renamed from: c */
    public Handler f2999c;

    /* renamed from: d */
    public boolean f3000d;

    /* renamed from: e */
    public final C0842pb f3001e;

    /* renamed from: f */
    public final C0814nb f3002f;

    /* renamed from: g */
    public final C0730hb f3003g;

    public C0716gb(C0767k6 c0767k6) {
        super(c0767k6);
        this.f3000d = true;
        this.f3001e = new C0842pb(this);
        this.f3002f = new C0814nb(this);
        this.f3003g = new C0730hb(this);
    }

    /* renamed from: D */
    public static /* synthetic */ void m3251D(C0716gb c0716gb, long j10) {
        c0716gb.mo3099i();
        c0716gb.m3255B();
        c0716gb.zzj().m3918F().m3996b("Activity resumed, time", Long.valueOf(j10));
        if (!c0716gb.mo3092a().m3281o(C0733i0.f3064N0) ? c0716gb.mo3092a().m3270M() || c0716gb.mo3095e().f3167u.m3528b() : c0716gb.mo3092a().m3270M() || c0716gb.f3000d) {
            c0716gb.f3002f.m3652f(j10);
        }
        c0716gb.f3003g.m3297a();
        C0842pb c0842pb = c0716gb.f3001e;
        c0842pb.f3458a.mo3099i();
        if (c0842pb.f3458a.f3198a.m3503k()) {
            c0842pb.m3728b(c0842pb.f3458a.zzb().mo14932a(), false);
        }
    }

    /* renamed from: x */
    public static /* synthetic */ void m3253x(C0716gb c0716gb, long j10) {
        c0716gb.mo3099i();
        c0716gb.m3255B();
        c0716gb.zzj().m3918F().m3996b("Activity paused, time", Long.valueOf(j10));
        c0716gb.f3003g.m3298b(j10);
        if (c0716gb.mo3092a().m3270M()) {
            c0716gb.f3002f.m3651e(j10);
        }
    }

    /* renamed from: A */
    public final boolean m3254A() {
        mo3099i();
        return this.f3000d;
    }

    /* renamed from: B */
    public final void m3255B() {
        mo3099i();
        if (this.f2999c == null) {
            this.f2999c = new zzcp(Looper.getMainLooper());
        }
    }

    @Override // p034c7.C0754j7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0718h mo3092a() {
        return super.mo3092a();
    }

    @Override // p034c7.C0754j7
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C0970z mo3093c() {
        return super.mo3093c();
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

    /* renamed from: y */
    public final void m3256y(boolean z10) {
        mo3099i();
        this.f3000d = z10;
    }

    /* renamed from: z */
    public final boolean m3257z(boolean z10, boolean z11, long j10) {
        return this.f3002f.m3650d(z10, z11, j10);
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
