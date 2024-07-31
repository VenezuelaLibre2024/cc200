package p335x5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: x5.x */
/* loaded from: classes.dex */
public final class C5623x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        String str3 = null;
        int i10 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    pendingIntent = (PendingIntent) C2602b.m10439o(parcel, m10412D, PendingIntent.CREATOR);
                    break;
                case 2:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 3:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    arrayList = C2602b.m10442r(parcel, m10412D);
                    break;
                case 5:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 6:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new SaveAccountLinkingTokenRequest(pendingIntent, str, str2, arrayList, str3, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SaveAccountLinkingTokenRequest[i10];
    }
}
