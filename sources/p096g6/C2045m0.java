package p096g6;

import io.flutter.plugins.firebase.crashlytics.Constants;
import p064e6.C1671d;
import p108h6.C2388q;

/* renamed from: g6.m0 */
/* loaded from: classes.dex */
public final class C2045m0 {

    /* renamed from: a */
    public final C2002b f8100a;

    /* renamed from: b */
    public final C1671d f8101b;

    public /* synthetic */ C2045m0(C2002b c2002b, C1671d c1671d, C2042l0 c2042l0) {
        this.f8100a = c2002b;
        this.f8101b = c1671d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2045m0)) {
            C2045m0 c2045m0 = (C2045m0) obj;
            if (C2388q.m9592b(this.f8100a, c2045m0.f8100a) && C2388q.m9592b(this.f8101b, c2045m0.f8101b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2388q.m9593c(this.f8100a, this.f8101b);
    }

    public final String toString() {
        return C2388q.m9594d(this).m9595a(Constants.KEY, this.f8100a).m9595a("feature", this.f8101b).toString();
    }
}
