package p034c7;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: c7.g0 */
/* loaded from: classes.dex */
public final class C0705g0 extends AbstractC2601a {
    public static final Parcelable.Creator<C0705g0> CREATOR = new C0691f0();

    /* renamed from: h */
    public final String f2943h;

    /* renamed from: i */
    public final C0618a0 f2944i;

    /* renamed from: j */
    public final String f2945j;

    /* renamed from: k */
    public final long f2946k;

    public C0705g0(C0705g0 c0705g0, long j10) {
        C2394s.m9619l(c0705g0);
        this.f2943h = c0705g0.f2943h;
        this.f2944i = c0705g0.f2944i;
        this.f2945j = c0705g0.f2945j;
        this.f2946k = j10;
    }

    public C0705g0(String str, C0618a0 c0618a0, String str2, long j10) {
        this.f2943h = str;
        this.f2944i = c0618a0;
        this.f2945j = str2;
        this.f2946k = j10;
    }

    public final String toString() {
        return "origin=" + this.f2945j + ",name=" + this.f2943h + ",params=" + String.valueOf(this.f2944i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 2, this.f2943h, false);
        C2603c.m10454D(parcel, 3, this.f2944i, i10, false);
        C2603c.m10456F(parcel, 4, this.f2945j, false);
        C2603c.m10489y(parcel, 5, this.f2946k);
        C2603c.m10466b(parcel, m10465a);
    }
}
