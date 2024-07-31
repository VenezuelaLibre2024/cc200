package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

@Deprecated
/* renamed from: w6.z */
/* loaded from: classes.dex */
public final class C5338z extends AbstractC2601a {
    public static final Parcelable.Creator<C5338z> CREATOR = new C5289a0();

    /* renamed from: h */
    public final int f20145h;

    /* renamed from: i */
    public final int f20146i;

    /* renamed from: j */
    public final long f20147j;

    /* renamed from: k */
    public final long f20148k;

    public C5338z(int i10, int i11, long j10, long j11) {
        this.f20145h = i10;
        this.f20146i = i11;
        this.f20147j = j10;
        this.f20148k = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5338z) {
            C5338z c5338z = (C5338z) obj;
            if (this.f20145h == c5338z.f20145h && this.f20146i == c5338z.f20146i && this.f20147j == c5338z.f20147j && this.f20148k == c5338z.f20148k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2388q.m9593c(Integer.valueOf(this.f20146i), Integer.valueOf(this.f20145h), Long.valueOf(this.f20148k), Long.valueOf(this.f20147j));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f20145h + " Cell status: " + this.f20146i + " elapsed time NS: " + this.f20148k + " system time ms: " + this.f20147j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f20145h);
        C2603c.m10485u(parcel, 2, this.f20146i);
        C2603c.m10489y(parcel, 3, this.f20147j);
        C2603c.m10489y(parcel, 4, this.f20148k);
        C2603c.m10466b(parcel, m10465a);
    }
}
