package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.z1 */
/* loaded from: classes.dex */
public final class C4986z1 extends AbstractC2601a {
    public static final Parcelable.Creator<C4986z1> CREATOR = new C4904a2();

    /* renamed from: h */
    public final long f18669h;

    /* renamed from: i */
    public final byte[] f18670i;

    /* renamed from: j */
    public final byte[] f18671j;

    /* renamed from: k */
    public final byte[] f18672k;

    public C4986z1(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f18669h = j10;
        this.f18670i = (byte[]) C2394s.m9619l(bArr);
        this.f18671j = (byte[]) C2394s.m9619l(bArr2);
        this.f18672k = (byte[]) C2394s.m9619l(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4986z1)) {
            return false;
        }
        C4986z1 c4986z1 = (C4986z1) obj;
        return this.f18669h == c4986z1.f18669h && Arrays.equals(this.f18670i, c4986z1.f18670i) && Arrays.equals(this.f18671j, c4986z1.f18671j) && Arrays.equals(this.f18672k, c4986z1.f18672k);
    }

    public final int hashCode() {
        return C2388q.m9593c(Long.valueOf(this.f18669h), this.f18670i, this.f18671j, this.f18672k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10489y(parcel, 1, this.f18669h);
        C2603c.m10476l(parcel, 2, this.f18670i, false);
        C2603c.m10476l(parcel, 3, this.f18671j, false);
        C2603c.m10476l(parcel, 4, this.f18672k, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
