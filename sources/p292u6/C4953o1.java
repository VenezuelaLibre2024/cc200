package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.o1 */
/* loaded from: classes.dex */
public final class C4953o1 extends AbstractC2601a {
    public static final Parcelable.Creator<C4953o1> CREATOR = new C4956p1();

    /* renamed from: h */
    public final byte[] f18599h;

    /* renamed from: i */
    public final byte[] f18600i;

    public C4953o1(byte[] bArr, byte[] bArr2) {
        this.f18599h = bArr;
        this.f18600i = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4953o1)) {
            return false;
        }
        C4953o1 c4953o1 = (C4953o1) obj;
        return Arrays.equals(this.f18599h, c4953o1.f18599h) && Arrays.equals(this.f18600i, c4953o1.f18600i);
    }

    public final int hashCode() {
        return C2388q.m9593c(this.f18599h, this.f18600i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10476l(parcel, 1, this.f18599h, false);
        C2603c.m10476l(parcel, 2, this.f18600i, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
