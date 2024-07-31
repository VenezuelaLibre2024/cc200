package p034c7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p207o6.InterfaceC3935d;
import p266s5.C4532a;

/* renamed from: c7.xa */
/* loaded from: classes.dex */
public final class C0953xa extends AbstractC0954xb {

    /* renamed from: d */
    public final Map<String, C0629ab> f3740d;

    /* renamed from: e */
    public final C0808n5 f3741e;

    /* renamed from: f */
    public final C0808n5 f3742f;

    /* renamed from: g */
    public final C0808n5 f3743g;

    /* renamed from: h */
    public final C0808n5 f3744h;

    /* renamed from: i */
    public final C0808n5 f3745i;

    public C0953xa(C0968yb c0968yb) {
        super(c0968yb);
        this.f3740d = new HashMap();
        C0738i5 mo3095e = mo3095e();
        Objects.requireNonNull(mo3095e);
        this.f3741e = new C0808n5(mo3095e, "last_delete_stale", 0L);
        C0738i5 mo3095e2 = mo3095e();
        Objects.requireNonNull(mo3095e2);
        this.f3742f = new C0808n5(mo3095e2, "backoff", 0L);
        C0738i5 mo3095e3 = mo3095e();
        Objects.requireNonNull(mo3095e3);
        this.f3743g = new C0808n5(mo3095e3, "last_upload", 0L);
        C0738i5 mo3095e4 = mo3095e();
        Objects.requireNonNull(mo3095e4);
        this.f3744h = new C0808n5(mo3095e4, "last_upload_attempt", 0L);
        C0738i5 mo3095e5 = mo3095e();
        Objects.requireNonNull(mo3095e5);
        this.f3745i = new C0808n5(mo3095e5, "midnight_offset", 0L);
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

    @Override // p034c7.C0754j7
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo3097g() {
        super.mo3097g();
    }

    @Override // p034c7.C0754j7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo3098h() {
        super.mo3098h();
    }

    @Override // p034c7.C0754j7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo3099i() {
        super.mo3099i();
    }

    @Override // p034c7.C0912ub
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C0745ic mo3120j() {
        return super.mo3120j();
    }

    @Override // p034c7.C0912ub
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C0955xc mo3121k() {
        return super.mo3121k();
    }

    @Override // p034c7.C0912ub
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C0788m mo3122l() {
        return super.mo3122l();
    }

    @Override // p034c7.C0912ub
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0906u5 mo3123m() {
        return super.mo3123m();
    }

    @Override // p034c7.C0912ub
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C0953xa mo3124n() {
        return super.mo3124n();
    }

    @Override // p034c7.C0912ub
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C0940wb mo3125o() {
        return super.mo3125o();
    }

    @Override // p034c7.AbstractC0954xb
    /* renamed from: s */
    public final boolean mo3126s() {
        return false;
    }

    @Deprecated
    /* renamed from: t */
    public final Pair<String, Boolean> m3999t(String str) {
        C0629ab c0629ab;
        mo3099i();
        long mo14933b = zzb().mo14933b();
        C0629ab c0629ab2 = this.f3740d.get(str);
        if (c0629ab2 != null && mo14933b < c0629ab2.f2773c) {
            return new Pair<>(c0629ab2.f2771a, Boolean.valueOf(c0629ab2.f2772b));
        }
        C4532a.m17957b(true);
        long m3288v = mo3092a().m3288v(str) + mo14933b;
        C4532a.a aVar = null;
        try {
            long m3287u = mo3092a().m3287u(str, C0733i0.f3097d);
            if (m3287u > 0) {
                try {
                    aVar = C4532a.m17956a(zza());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (c0629ab2 != null && mo14933b < c0629ab2.f2773c + m3287u) {
                        return new Pair<>(c0629ab2.f2771a, Boolean.valueOf(c0629ab2.f2772b));
                    }
                }
            } else {
                aVar = C4532a.m17956a(zza());
            }
        } catch (Exception e10) {
            zzj().m3913A().m3996b("Unable to get advertising id", e10);
            c0629ab = new C0629ab("", false, m3288v);
        }
        if (aVar == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String m17963a = aVar.m17963a();
        c0629ab = m17963a != null ? new C0629ab(m17963a, aVar.m17964b(), m3288v) : new C0629ab("", aVar.m17964b(), m3288v);
        this.f3740d.put(str, c0629ab);
        C4532a.m17957b(false);
        return new Pair<>(c0629ab.f2771a, Boolean.valueOf(c0629ab.f2772b));
    }

    /* renamed from: u */
    public final Pair<String, Boolean> m4000u(String str, C0810n7 c0810n7) {
        return c0810n7.m3643x() ? m3999t(str) : new Pair<>("", Boolean.FALSE);
    }

    @Deprecated
    /* renamed from: v */
    public final String m4001v(String str, boolean z10) {
        mo3099i();
        String str2 = z10 ? (String) m3999t(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest m3745O0 = C0857qc.m3745O0();
        if (m3745O0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m3745O0.digest(str2.getBytes())));
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
