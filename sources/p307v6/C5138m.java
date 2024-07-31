package p307v6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: v6.m */
/* loaded from: classes.dex */
public final class C5138m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        Integer num = null;
        Double d10 = null;
        Uri uri = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
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
                    bArr = C2602b.m10431g(parcel, m10412D);
                    break;
                case 6:
                    arrayList = C2602b.m10444t(parcel, m10412D, C5130e.CREATOR);
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
        return new SignRequestParams(num, d10, uri, bArr, arrayList, c5126a, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignRequestParams[i10];
    }
}
