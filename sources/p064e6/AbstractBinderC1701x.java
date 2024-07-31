package p064e6;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p108h6.AbstractBinderC2417z1;
import p108h6.C2394s;
import p108h6.InterfaceC2407w0;
import p252r6.BinderC4309d;
import p252r6.InterfaceC4307b;

/* renamed from: e6.x */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1701x extends AbstractBinderC2417z1 {

    /* renamed from: a */
    public final int f6293a;

    public AbstractBinderC1701x(byte[] bArr) {
        C2394s.m9608a(bArr.length == 25);
        this.f6293a = Arrays.hashCode(bArr);
    }

    /* renamed from: e */
    public static byte[] m6753e(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        InterfaceC4307b zzd;
        if (obj != null && (obj instanceof InterfaceC2407w0)) {
            try {
                InterfaceC2407w0 interfaceC2407w0 = (InterfaceC2407w0) obj;
                if (interfaceC2407w0.zzc() == this.f6293a && (zzd = interfaceC2407w0.zzd()) != null) {
                    return Arrays.equals(mo6754g(), (byte[]) BinderC4309d.m16571e(zzd));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    /* renamed from: g */
    public abstract byte[] mo6754g();

    public final int hashCode() {
        return this.f6293a;
    }

    @Override // p108h6.InterfaceC2407w0
    public final int zzc() {
        return this.f6293a;
    }

    @Override // p108h6.InterfaceC2407w0
    public final InterfaceC4307b zzd() {
        return BinderC4309d.m16572g(mo6754g());
    }
}
