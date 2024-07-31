package p034c7;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: c7.uc */
/* loaded from: classes.dex */
public final class C0913uc {

    /* renamed from: a */
    public final C0767k6 f3648a;

    public C0913uc(C0767k6 c0767k6) {
        this.f3648a = c0767k6;
    }

    /* renamed from: a */
    public final void m3896a() {
        this.f3648a.zzl().mo3099i();
        if (m3899d()) {
            if (m3900e()) {
                this.f3648a.m3485A().f3171y.m3674b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f3648a.m3487C().m3989x0("auto", "_cmpx", bundle);
            } else {
                String m3673a = this.f3648a.m3485A().f3171y.m3673a();
                if (TextUtils.isEmpty(m3673a)) {
                    this.f3648a.zzj().m3916D().m3995a("Cache still valid but referrer not found");
                } else {
                    long m3618a = ((this.f3648a.m3485A().f3172z.m3618a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(m3673a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", m3618a);
                    Object obj = pair.first;
                    this.f3648a.m3487C().m3989x0(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f3648a.m3485A().f3171y.m3674b(null);
            }
            this.f3648a.m3485A().f3172z.m3619b(0L);
        }
    }

    /* renamed from: b */
    public final void m3897b(String str, Bundle bundle) {
        String str2;
        this.f3648a.zzl().mo3099i();
        if (this.f3648a.m3503k()) {
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            str2 = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str3 : bundle.keySet()) {
                builder.appendQueryParameter(str3, bundle.getString(str3));
            }
            str2 = builder.build().toString();
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f3648a.m3485A().f3171y.m3674b(str2);
        this.f3648a.m3485A().f3172z.m3619b(this.f3648a.zzb().mo14932a());
    }

    /* renamed from: c */
    public final void m3898c() {
        if (m3899d() && m3900e()) {
            this.f3648a.m3485A().f3171y.m3674b(null);
        }
    }

    /* renamed from: d */
    public final boolean m3899d() {
        return this.f3648a.m3485A().f3172z.m3618a() > 0;
    }

    /* renamed from: e */
    public final boolean m3900e() {
        return m3899d() && this.f3648a.zzb().mo14932a() - this.f3648a.m3485A().f3172z.m3618a() > this.f3648a.m3513u().m3287u(null, C0733i0.f3079V);
    }
}
