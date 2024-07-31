package p021b6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p375authapi.zba;
import com.google.android.gms.internal.p375authapi.zbc;
import com.pichillilorenzo.flutter_inappwebview.C1417R;

/* renamed from: b6.w */
/* loaded from: classes.dex */
public final class C0504w extends zba {
    public C0504w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: c */
    public final void m2451c(InterfaceC0503v interfaceC0503v, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, interfaceC0503v);
        zbc.zbc(zba, googleSignInOptions);
        zbb(C1417R.styleable.AppCompatTheme_textAppearanceListItem, zba);
    }

    /* renamed from: e */
    public final void m2452e(InterfaceC0503v interfaceC0503v, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, interfaceC0503v);
        zbc.zbc(zba, googleSignInOptions);
        zbb(C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, zba);
    }

    /* renamed from: g */
    public final void m2453g(InterfaceC0503v interfaceC0503v, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbd(zba, interfaceC0503v);
        zbc.zbc(zba, googleSignInOptions);
        zbb(C1417R.styleable.AppCompatTheme_switchStyle, zba);
    }
}
