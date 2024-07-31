package p367z6;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzl;
import com.google.android.gms.maps.model.LatLng;
import p108h6.C2394s;

/* renamed from: z6.f */
/* loaded from: classes.dex */
public final class C6006f {

    /* renamed from: a */
    public final zzl f22406a;

    public C6006f(zzl zzlVar) {
        this.f22406a = (zzl) C2394s.m9619l(zzlVar);
    }

    /* renamed from: a */
    public String m24095a() {
        try {
            return this.f22406a.zzl();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: b */
    public void m24096b() {
        try {
            this.f22406a.zzn();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: c */
    public void m24097c(LatLng latLng) {
        try {
            C2394s.m9620m(latLng, "center must not be null.");
            this.f22406a.zzo(latLng);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: d */
    public void m24098d(boolean z10) {
        try {
            this.f22406a.zzp(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: e */
    public void m24099e(int i10) {
        try {
            this.f22406a.zzq(i10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6006f)) {
            return false;
        }
        try {
            return this.f22406a.zzy(((C6006f) obj).f22406a);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: f */
    public void m24100f(double d10) {
        try {
            this.f22406a.zzr(d10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: g */
    public void m24101g(int i10) {
        try {
            this.f22406a.zzs(i10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: h */
    public void m24102h(float f10) {
        try {
            this.f22406a.zzu(f10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    public final int hashCode() {
        try {
            return this.f22406a.zzi();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: i */
    public void m24103i(boolean z10) {
        try {
            this.f22406a.zzw(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: j */
    public void m24104j(float f10) {
        try {
            this.f22406a.zzx(f10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }
}
