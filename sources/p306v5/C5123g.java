package p306v5;

import android.os.Bundle;
import p079f6.C1841a;
import p108h6.C2388q;

@Deprecated
/* renamed from: v5.g */
/* loaded from: classes.dex */
public final class C5123g implements C1841a.d {

    /* renamed from: k */
    public static final C5123g f19363k = new C5123g(new C5122f());

    /* renamed from: h */
    public final String f19364h = null;

    /* renamed from: i */
    public final boolean f19365i;

    /* renamed from: j */
    public final String f19366j;

    public C5123g(C5122f c5122f) {
        this.f19365i = c5122f.f19361a.booleanValue();
        this.f19366j = c5122f.f19362b;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ String m20797b(C5123g c5123g) {
        String str = c5123g.f19364h;
        return null;
    }

    /* renamed from: a */
    public final Bundle m20800a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f19365i);
        bundle.putString("log_session_id", this.f19366j);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5123g)) {
            return false;
        }
        C5123g c5123g = (C5123g) obj;
        String str = c5123g.f19364h;
        return C2388q.m9592b(null, null) && this.f19365i == c5123g.f19365i && C2388q.m9592b(this.f19366j, c5123g.f19366j);
    }

    public final int hashCode() {
        return C2388q.m9593c(null, Boolean.valueOf(this.f19365i), this.f19366j);
    }
}
