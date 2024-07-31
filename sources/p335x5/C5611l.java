package p335x5;

import android.os.Bundle;
import p079f6.C1841a;
import p108h6.C2388q;

/* renamed from: x5.l */
/* loaded from: classes.dex */
public final class C5611l implements C1841a.d {

    /* renamed from: h */
    public final String f21064h;

    public C5611l(String str) {
        this.f21064h = str;
    }

    /* renamed from: a */
    public final Bundle m22611a() {
        Bundle bundle = new Bundle();
        bundle.putString("session_id", this.f21064h);
        return bundle;
    }

    /* renamed from: b */
    public final String m22612b() {
        return this.f21064h;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C5611l;
    }

    public final int hashCode() {
        return C2388q.m9593c(C5611l.class);
    }
}
