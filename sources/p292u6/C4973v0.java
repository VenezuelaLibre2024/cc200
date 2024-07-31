package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: u6.v0 */
/* loaded from: classes.dex */
public final class C4973v0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            int m10446v = C2602b.m10446v(m10412D);
            if (m10446v == 2) {
                str = C2602b.m10440p(parcel, m10412D);
            } else if (m10446v == 3) {
                bArr = C2602b.m10431g(parcel, m10412D);
            } else if (m10446v != 4) {
                C2602b.m10421M(parcel, m10412D);
            } else {
                arrayList = C2602b.m10444t(parcel, m10412D, Transport.CREATOR);
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C4972v(str, bArr, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4972v[i10];
    }
}
