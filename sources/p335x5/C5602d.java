package p335x5;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: x5.d */
/* loaded from: classes.dex */
public class C5602d extends AbstractC2601a {
    public static final Parcelable.Creator<C5602d> CREATOR = new C5617r();

    /* renamed from: h */
    public final int f21031h;

    public C5602d(int i10) {
        this.f21031h = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5602d) {
            return C2388q.m9592b(Integer.valueOf(this.f21031h), Integer.valueOf(((C5602d) obj).f21031h));
        }
        return false;
    }

    public int hashCode() {
        return C2388q.m9593c(Integer.valueOf(this.f21031h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21031h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, i11);
        C2603c.m10466b(parcel, m10465a);
    }
}
