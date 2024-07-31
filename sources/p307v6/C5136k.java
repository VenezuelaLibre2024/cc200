package p307v6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: v6.k */
/* loaded from: classes.dex */
public final class C5136k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        Integer num = null;
        Double d10 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        C5126a c5126a = null;
        String str = null;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 2:
                    num = C2602b.m10415G(parcel, m10412D);
                    break;
                case 3:
                    d10 = C2602b.m10409A(parcel, m10412D);
                    break;
                case 4:
                    uri = (Uri) C2602b.m10439o(parcel, m10412D, Uri.CREATOR);
                    break;
                case 5:
                    arrayList = C2602b.m10444t(parcel, m10412D, C5129d.CREATOR);
                    break;
                case 6:
                    arrayList2 = C2602b.m10444t(parcel, m10412D, C5130e.CREATOR);
                    break;
                case 7:
                    c5126a = (C5126a) C2602b.m10439o(parcel, m10412D, C5126a.CREATOR);
                    break;
                case 8:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new RegisterRequestParams(num, d10, uri, arrayList, arrayList2, c5126a, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RegisterRequestParams[i10];
    }
}
