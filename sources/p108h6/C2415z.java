package p108h6;

import android.os.Bundle;
import p079f6.C1841a;

/* renamed from: h6.z */
/* loaded from: classes.dex */
public class C2415z implements C1841a.d {

    /* renamed from: i */
    public static final C2415z f9730i = m9650a().m9652a();

    /* renamed from: h */
    public final String f9731h;

    /* renamed from: h6.z$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public String f9732a;

        public /* synthetic */ a(C2347c0 c2347c0) {
        }

        /* renamed from: a */
        public C2415z m9652a() {
            return new C2415z(this.f9732a, null);
        }
    }

    public /* synthetic */ C2415z(String str, C2350d0 c2350d0) {
        this.f9731h = str;
    }

    /* renamed from: a */
    public static a m9650a() {
        return new a(null);
    }

    /* renamed from: b */
    public final Bundle m9651b() {
        Bundle bundle = new Bundle();
        String str = this.f9731h;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2415z) {
            return C2388q.m9592b(this.f9731h, ((C2415z) obj).f9731h);
        }
        return false;
    }

    public final int hashCode() {
        return C2388q.m9593c(this.f9731h);
    }
}
