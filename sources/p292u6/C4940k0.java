package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.k0 */
/* loaded from: classes.dex */
public final class C4940k0 extends AbstractC2601a {
    public static final Parcelable.Creator<C4940k0> CREATOR = new C4943l0();

    /* renamed from: h */
    public final long f18590h;

    public C4940k0(long j10) {
        this.f18590h = ((Long) C2394s.m9619l(Long.valueOf(j10))).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4940k0) && this.f18590h == ((C4940k0) obj).f18590h;
    }

    public final int hashCode() {
        return C2388q.m9593c(Long.valueOf(this.f18590h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10489y(parcel, 1, this.f18590h);
        C2603c.m10466b(parcel, m10465a);
    }
}
