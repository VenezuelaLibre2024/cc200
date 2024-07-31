package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.C2602b;

/* renamed from: u6.s1 */
/* loaded from: classes.dex */
public final class C4965s1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                bArr = C2602b.m10431g(parcel, m10412D);
            } else if (m10446v == 3) {
                bArr2 = C2602b.m10431g(parcel, m10412D);
            } else if (m10446v == 4) {
                bArr3 = C2602b.m10431g(parcel, m10412D);
            } else if (m10446v == 5) {
                bArr4 = C2602b.m10431g(parcel, m10412D);
            } else if (m10446v != 6) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                bArr5 = C2602b.m10431g(parcel, m10412D);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C4925g(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4925g[i10];
    }
}
