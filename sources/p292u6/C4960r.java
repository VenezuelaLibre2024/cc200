package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.r */
/* loaded from: classes.dex */
public class C4960r extends AbstractC2601a {
    public static final Parcelable.Creator<C4960r> CREATOR = new C4928g2();

    /* renamed from: h */
    public final String f18626h;

    public C4960r(String str) {
        this.f18626h = (String) C2394s.m9619l(str);
    }

    /* renamed from: I */
    public String m19516I() {
        return this.f18626h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4960r) {
            return this.f18626h.equals(((C4960r) obj).f18626h);
        }
        return false;
    }

    public int hashCode() {
        return C2388q.m9593c(this.f18626h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 2, m19516I(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
