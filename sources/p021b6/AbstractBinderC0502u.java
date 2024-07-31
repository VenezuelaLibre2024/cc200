package p021b6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p375authapi.zbb;
import com.google.android.gms.internal.p375authapi.zbc;
import com.pichillilorenzo.flutter_inappwebview.C1417R;

/* renamed from: b6.u */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0502u extends zbb implements InterfaceC0503v {
    public AbstractBinderC0502u() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p375authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case C1417R.styleable.AppCompatTheme_switchStyle /* 101 */:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zbc.zba(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                mo2430w0(googleSignInAccount, status);
                break;
            case C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                mo2428L0(status2);
                break;
            case C1417R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                Status status3 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                mo2429t0(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
