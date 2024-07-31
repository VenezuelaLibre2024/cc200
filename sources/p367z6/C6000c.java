package p367z6;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzi;
import p108h6.C2394s;

/* renamed from: z6.c */
/* loaded from: classes.dex */
public final class C6000c {

    /* renamed from: a */
    public static zzi f22389a;

    /* renamed from: a */
    public static C5998b m24078a() {
        try {
            return new C5998b(m24083f().zzd());
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: b */
    public static C5998b m24079b(float f10) {
        try {
            return new C5998b(m24083f().zze(f10));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: c */
    public static C5998b m24080c(String str) {
        C2394s.m9620m(str, "assetName must not be null");
        try {
            return new C5998b(m24083f().zzf(str));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: d */
    public static C5998b m24081d(Bitmap bitmap) {
        C2394s.m9620m(bitmap, "image must not be null");
        try {
            return new C5998b(m24083f().zzg(bitmap));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: e */
    public static void m24082e(zzi zziVar) {
        if (f22389a != null) {
            return;
        }
        f22389a = (zzi) C2394s.m9620m(zziVar, "delegate must not be null");
    }

    /* renamed from: f */
    public static zzi m24083f() {
        return (zzi) C2394s.m9620m(f22389a, "IBitmapDescriptorFactory is not initialized");
    }
}
