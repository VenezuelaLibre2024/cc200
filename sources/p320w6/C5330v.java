package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: w6.v */
/* loaded from: classes.dex */
public class C5330v extends AbstractC2601a {
    public static final Parcelable.Creator<C5330v> CREATOR = new C5293c0();

    /* renamed from: h */
    public final List f20142h;

    /* renamed from: i */
    public final int f20143i;

    public C5330v(List list, int i10) {
        this.f20142h = list;
        this.f20143i = i10;
    }

    /* renamed from: I */
    public int m21402I() {
        return this.f20143i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5330v)) {
            return false;
        }
        C5330v c5330v = (C5330v) obj;
        return C2388q.m9592b(this.f20142h, c5330v.f20142h) && this.f20143i == c5330v.f20143i;
    }

    public int hashCode() {
        return C2388q.m9593c(this.f20142h, Integer.valueOf(this.f20143i));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C2394s.m9619l(parcel);
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10460J(parcel, 1, this.f20142h, false);
        C2603c.m10485u(parcel, 2, m21402I());
        C2603c.m10466b(parcel, m10465a);
    }
}
