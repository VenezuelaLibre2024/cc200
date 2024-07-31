package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.p0 */
/* loaded from: classes.dex */
public final class C4955p0 extends AbstractC2601a {
    public static final Parcelable.Creator<C4955p0> CREATOR = new C4958q0();

    /* renamed from: h */
    public final String f18609h;

    public C4955p0(String str) {
        this.f18609h = (String) C2394s.m9619l(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4955p0) {
            return this.f18609h.equals(((C4955p0) obj).f18609h);
        }
        return false;
    }

    public final int hashCode() {
        return C2388q.m9593c(this.f18609h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, this.f18609h, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
