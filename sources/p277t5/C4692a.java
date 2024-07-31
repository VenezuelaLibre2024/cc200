package p277t5;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: t5.a */
/* loaded from: classes.dex */
public class C4692a extends AbstractC2601a {
    public static final Parcelable.Creator<C4692a> CREATOR = new C4698g();

    /* renamed from: h */
    public final int f17526h;

    /* renamed from: i */
    public final long f17527i;

    /* renamed from: j */
    public final String f17528j;

    /* renamed from: k */
    public final int f17529k;

    /* renamed from: l */
    public final int f17530l;

    /* renamed from: m */
    public final String f17531m;

    public C4692a(int i10, long j10, String str, int i11, int i12, String str2) {
        this.f17526h = i10;
        this.f17527i = j10;
        this.f17528j = (String) C2394s.m9619l(str);
        this.f17529k = i11;
        this.f17530l = i12;
        this.f17531m = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4692a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C4692a c4692a = (C4692a) obj;
        return this.f17526h == c4692a.f17526h && this.f17527i == c4692a.f17527i && C2388q.m9592b(this.f17528j, c4692a.f17528j) && this.f17529k == c4692a.f17529k && this.f17530l == c4692a.f17530l && C2388q.m9592b(this.f17531m, c4692a.f17531m);
    }

    public int hashCode() {
        return C2388q.m9593c(Integer.valueOf(this.f17526h), Long.valueOf(this.f17527i), this.f17528j, Integer.valueOf(this.f17529k), Integer.valueOf(this.f17530l), this.f17531m);
    }

    public String toString() {
        int i10 = this.f17529k;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        return "AccountChangeEvent {accountName = " + this.f17528j + ", changeType = " + str + ", changeData = " + this.f17531m + ", eventIndex = " + this.f17530l + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f17526h);
        C2603c.m10489y(parcel, 2, this.f17527i);
        C2603c.m10456F(parcel, 3, this.f17528j, false);
        C2603c.m10485u(parcel, 4, this.f17529k);
        C2603c.m10485u(parcel, 5, this.f17530l);
        C2603c.m10456F(parcel, 6, this.f17531m, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
