package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.r0 */
/* loaded from: classes.dex */
public final class C4961r0 extends AbstractC2601a {
    public static final Parcelable.Creator<C4961r0> CREATOR = new C4964s0();

    /* renamed from: h */
    public final byte[][] f18627h;

    public C4961r0(byte[][] bArr) {
        C2394s.m9608a(bArr != null);
        C2394s.m9608a(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            C2394s.m9608a(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            C2394s.m9608a(bArr[i11] != null);
            int length = bArr[i11].length;
            C2394s.m9608a(length == 32 || length == 64);
            i10 += 2;
        }
        this.f18627h = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4961r0) {
            return Arrays.deepEquals(this.f18627h, ((C4961r0) obj).f18627h);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        for (byte[] bArr : this.f18627h) {
            i10 ^= C2388q.m9593c(bArr);
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10477m(parcel, 1, this.f18627h, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
