package p008a6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: a6.e */
/* loaded from: classes.dex */
public final class C0063e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        int i10 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 1:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 2:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 3:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 5:
                    str4 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 6:
                    uri = (Uri) C2602b.m10439o(parcel, m10412D, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 8:
                    j10 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 9:
                    str6 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 10:
                    arrayList = C2602b.m10444t(parcel, m10412D, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 12:
                    str8 = C2602b.m10440p(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
