package p108h6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: h6.d */
/* loaded from: classes.dex */
public class C2349d extends AbstractC2601a {
    public static final Parcelable.Creator<C2349d> CREATOR = new C2341a0();

    /* renamed from: h */
    public final int f9588h;

    /* renamed from: i */
    public final String f9589i;

    public C2349d(int i10, String str) {
        this.f9588h = i10;
        this.f9589i = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2349d)) {
            return false;
        }
        C2349d c2349d = (C2349d) obj;
        return c2349d.f9588h == this.f9588h && C2388q.m9592b(c2349d.f9589i, this.f9589i);
    }

    public final int hashCode() {
        return this.f9588h;
    }

    public final String toString() {
        return this.f9588h + ":" + this.f9589i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f9588h);
        C2603c.m10456F(parcel, 2, this.f9589i, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
