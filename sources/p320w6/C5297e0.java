package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: w6.e0 */
/* loaded from: classes.dex */
public final class C5297e0 extends AbstractC2601a {
    public static final Parcelable.Creator<C5297e0> CREATOR = new C5299f0();

    /* renamed from: h */
    public final int f20082h;

    /* renamed from: i */
    public final int f20083i;

    /* renamed from: j */
    public final int f20084j;

    /* renamed from: k */
    public final int f20085k;

    public C5297e0(int i10, int i11, int i12, int i13) {
        C2394s.m9623p(i10 >= 0 && i10 <= 23, "Start hour must be in range [0, 23].");
        C2394s.m9623p(i11 >= 0 && i11 <= 59, "Start minute must be in range [0, 59].");
        C2394s.m9623p(i12 >= 0 && i12 <= 23, "End hour must be in range [0, 23].");
        C2394s.m9623p(i13 >= 0 && i13 <= 59, "End minute must be in range [0, 59].");
        C2394s.m9623p(((i10 + i11) + i12) + i13 > 0, "Parameters can't be all 0.");
        this.f20082h = i10;
        this.f20083i = i11;
        this.f20084j = i12;
        this.f20085k = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5297e0)) {
            return false;
        }
        C5297e0 c5297e0 = (C5297e0) obj;
        return this.f20082h == c5297e0.f20082h && this.f20083i == c5297e0.f20083i && this.f20084j == c5297e0.f20084j && this.f20085k == c5297e0.f20085k;
    }

    public final int hashCode() {
        return C2388q.m9593c(Integer.valueOf(this.f20082h), Integer.valueOf(this.f20083i), Integer.valueOf(this.f20084j), Integer.valueOf(this.f20085k));
    }

    public final String toString() {
        return "UserPreferredSleepWindow [startHour=" + this.f20082h + ", startMinute=" + this.f20083i + ", endHour=" + this.f20084j + ", endMinute=" + this.f20085k + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C2394s.m9619l(parcel);
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f20082h);
        C2603c.m10485u(parcel, 2, this.f20083i);
        C2603c.m10485u(parcel, 3, this.f20084j);
        C2603c.m10485u(parcel, 4, this.f20085k);
        C2603c.m10466b(parcel, m10465a);
    }
}
