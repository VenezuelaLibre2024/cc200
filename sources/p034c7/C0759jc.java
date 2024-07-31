package p034c7;

import android.os.Parcel;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.ArrayList;
import p125i6.C2602b;

/* renamed from: c7.jc */
/* loaded from: classes.dex */
public final class C0759jc implements Parcelable.Creator<C0871rc> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0871rc createFromParcel(Parcel parcel) {
        int m10422N = C2602b.m10422N(parcel);
        boolean z10 = true;
        boolean z11 = true;
        String str = "";
        String str2 = str;
        String str3 = str2;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i11 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        long j17 = -2147483648L;
        int i12 = 100;
        while (parcel.dataPosition() < m10422N) {
            int m10412D = C2602b.m10412D(parcel);
            switch (C2602b.m10446v(m10412D)) {
                case 2:
                    str4 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 3:
                    str5 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 4:
                    str6 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 5:
                    str7 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 6:
                    j10 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 7:
                    j11 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 8:
                    str8 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 9:
                    z10 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 10:
                    z12 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 11:
                    j17 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 12:
                    str9 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 13:
                    j12 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 14:
                    j13 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 15:
                    i10 = C2602b.m10414F(parcel, m10412D);
                    break;
                case 16:
                    z11 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 17:
                case 20:
                case C1417R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                default:
                    C2602b.m10421M(parcel, m10412D);
                    break;
                case 18:
                    z13 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 19:
                    str10 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 21:
                    bool = C2602b.m10448x(parcel, m10412D);
                    break;
                case 22:
                    j14 = C2602b.m10417I(parcel, m10412D);
                    break;
                case 23:
                    arrayList = C2602b.m10442r(parcel, m10412D);
                    break;
                case 24:
                    str11 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 25:
                    str = C2602b.m10440p(parcel, m10412D);
                    break;
                case 26:
                    str2 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 27:
                    str12 = C2602b.m10440p(parcel, m10412D);
                    break;
                case 28:
                    z14 = C2602b.m10447w(parcel, m10412D);
                    break;
                case 29:
                    j15 = C2602b.m10417I(parcel, m10412D);
                    break;
                case C1417R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    i12 = C2602b.m10414F(parcel, m10412D);
                    break;
                case C1417R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    str3 = C2602b.m10440p(parcel, m10412D);
                    break;
                case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    i11 = C2602b.m10414F(parcel, m10412D);
                    break;
                case C1417R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    j16 = C2602b.m10417I(parcel, m10412D);
                    break;
                case C1417R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    str13 = C2602b.m10440p(parcel, m10412D);
                    break;
            }
        }
        C2602b.m10445u(parcel, m10422N);
        return new C0871rc(str4, str5, str6, str7, j10, j11, str8, z10, z12, j17, str9, j12, j13, i10, z11, z13, str10, bool, j14, arrayList, str11, str, str2, str12, z14, j15, i12, str3, i11, j16, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0871rc[] newArray(int i10) {
        return new C0871rc[i10];
    }
}
