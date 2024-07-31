package p335x5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: x5.n */
/* loaded from: classes.dex */
public final class C5613n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        GoogleSignInAccount googleSignInAccount = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 2:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 3:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    arrayList = C2602b.m10442r(parcel, m10412D);
                    break;
                case 5:
                    googleSignInAccount = (GoogleSignInAccount) C2602b.m10439o(parcel, m10412D, GoogleSignInAccount.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) C2602b.m10439o(parcel, m10412D, PendingIntent.CREATOR);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C5596a(str, str2, str3, arrayList, googleSignInAccount, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5596a[i10];
    }
}
