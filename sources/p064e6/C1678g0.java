package p064e6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import p108h6.AbstractBinderC2417z1;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p252r6.BinderC4309d;
import p252r6.InterfaceC4307b;

/* renamed from: e6.g0 */
/* loaded from: classes.dex */
public final class C1678g0 extends AbstractC2601a {
    public static final Parcelable.Creator<C1678g0> CREATOR = new C1680h0();

    /* renamed from: h */
    public final String f6263h;

    /* renamed from: i */
    public final AbstractBinderC1701x f6264i;

    /* renamed from: j */
    public final boolean f6265j;

    /* renamed from: k */
    public final boolean f6266k;

    public C1678g0(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f6263h = str;
        BinderC1702y binderC1702y = null;
        if (iBinder != null) {
            try {
                InterfaceC4307b zzd = AbstractBinderC2417z1.m9653c(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) BinderC4309d.m16571e(zzd);
                if (bArr != null) {
                    binderC1702y = new BinderC1702y(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f6264i = binderC1702y;
        this.f6265j = z10;
        this.f6266k = z11;
    }

    public C1678g0(String str, AbstractBinderC1701x abstractBinderC1701x, boolean z10, boolean z11) {
        this.f6263h = str;
        this.f6264i = abstractBinderC1701x;
        this.f6265j = z10;
        this.f6266k = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6263h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, str, false);
        AbstractBinderC1701x abstractBinderC1701x = this.f6264i;
        if (abstractBinderC1701x == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC1701x = null;
        }
        C2603c.m10484t(parcel, 2, abstractBinderC1701x, false);
        C2603c.m10471g(parcel, 3, this.f6265j);
        C2603c.m10471g(parcel, 4, this.f6266k);
        C2603c.m10466b(parcel, m10465a);
    }
}
