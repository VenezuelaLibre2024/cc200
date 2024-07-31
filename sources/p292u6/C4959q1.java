package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.q1 */
/* loaded from: classes.dex */
public final class C4959q1 extends AbstractC2601a {
    public static final Parcelable.Creator<C4959q1> CREATOR = new C4962r1();

    /* renamed from: h */
    public final boolean f18624h;

    /* renamed from: i */
    public final byte[] f18625i;

    public C4959q1(boolean z10, byte[] bArr) {
        this.f18624h = z10;
        this.f18625i = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4959q1)) {
            return false;
        }
        C4959q1 c4959q1 = (C4959q1) obj;
        return this.f18624h == c4959q1.f18624h && Arrays.equals(this.f18625i, c4959q1.f18625i);
    }

    public final int hashCode() {
        return C2388q.m9593c(Boolean.valueOf(this.f18624h), this.f18625i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10471g(parcel, 1, this.f18624h);
        C2603c.m10476l(parcel, 2, this.f18625i, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
