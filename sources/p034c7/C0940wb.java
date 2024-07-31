package p034c7;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzqa;
import java.util.HashMap;
import p207o6.InterfaceC3935d;

/* renamed from: c7.wb */
/* loaded from: classes.dex */
public final class C0940wb extends C0912ub {
    public C0940wb(C0968yb c0968yb) {
        super(c0968yb);
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

    /* renamed from: p */
    public final Uri.Builder m3992p(String str) {
        String m3289w;
        String m3876L = mo3123m().m3876L(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(mo3092a().m3289w(str, C0733i0.f3085Y));
        if (TextUtils.isEmpty(m3876L)) {
            m3289w = mo3092a().m3289w(str, C0733i0.f3087Z);
        } else {
            m3289w = m3876L + "." + mo3092a().m3289w(str, C0733i0.f3087Z);
        }
        builder.authority(m3289w);
        builder.path(mo3092a().m3289w(str, C0733i0.f3090a0));
        return builder;
    }

    /* renamed from: q */
    public final C0982zb m3993q(String str) {
        if (zzqa.zza() && mo3092a().m3281o(C0733i0.f3134v0)) {
            zzj().m3918F().m3995a("sgtm feature flag enabled.");
            C0710g5 m3604y0 = mo3122l().m3604y0(str);
            if (m3604y0 == null) {
                return new C0982zb(m3994r(str));
            }
            C0982zb c0982zb = null;
            if (m3604y0.m3235u()) {
                zzj().m3918F().m3995a("sgtm upload enabled in manifest.");
                zzfc.zzd m3871G = mo3123m().m3871G(m3604y0.m3238v0());
                if (m3871G != null && m3871G.zzr()) {
                    String zzd = m3871G.zzh().zzd();
                    if (!TextUtils.isEmpty(zzd)) {
                        String zzc = m3871G.zzh().zzc();
                        zzj().m3918F().m3997c("sgtm configured with upload_url, server_info", zzd, TextUtils.isEmpty(zzc) ? "Y" : "N");
                        if (TextUtils.isEmpty(zzc)) {
                            c0982zb = new C0982zb(zzd);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", zzc);
                            c0982zb = new C0982zb(zzd, hashMap);
                        }
                    }
                }
            }
            if (c0982zb != null) {
                return c0982zb;
            }
        }
        return new C0982zb(m3994r(str));
    }

    /* renamed from: r */
    public final String m3994r(String str) {
        String m3876L = mo3123m().m3876L(str);
        if (TextUtils.isEmpty(m3876L)) {
            return C0733i0.f3127s.m3607a(null);
        }
        Uri parse = Uri.parse(C0733i0.f3127s.m3607a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.authority(m3876L + "." + parse.getAuthority());
        return buildUpon.build().toString();
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
