package p319w5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import p125i6.C2602b;

/* renamed from: w5.j */
/* loaded from: classes.dex */
public final class C5286j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i10;
        int m10422N = C2602b.m10422N(parcel);
        HashSet hashSet = new HashSet();
        int i11 = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        C5277a c5277a = null;
        int i12 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    i12 = C2602b.m10414F(parcel, m10412D);
                    i10 = 1;
                    break;
                case 2:
                    str = C2602b.m10440p(parcel, m10412D);
                    i10 = 2;
                    break;
                case 3:
                    i11 = C2602b.m10414F(parcel, m10412D);
                    i10 = 3;
                    break;
                case 4:
                    bArr = C2602b.m10431g(parcel, m10412D);
                    i10 = 4;
                    break;
                case 5:
                    pendingIntent = (PendingIntent) C2602b.m10439o(parcel, m10412D, PendingIntent.CREATOR);
                    i10 = 5;
                    break;
                case 6:
                    c5277a = (C5277a) C2602b.m10439o(parcel, m10412D, C5277a.CREATOR);
                    i10 = 6;
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    continue;
            }
            hashSet.add(Integer.valueOf(i10));
        }
        if (parcel.dataPosition() == m10422N) {
            return new C5285i(hashSet, i12, str, i11, bArr, pendingIntent, c5277a);
        }
        throw new C2602b.a("Overread allowed size end=" + m10422N, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5285i[i10];
    }
}
