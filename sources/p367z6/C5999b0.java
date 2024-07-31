package p367z6;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzam;
import p108h6.C2394s;

/* renamed from: z6.b0 */
/* loaded from: classes.dex */
public final class C5999b0 {

    /* renamed from: a */
    public final zzam f22388a;

    public C5999b0(zzam zzamVar) {
        this.f22388a = (zzam) C2394s.m9619l(zzamVar);
    }

    /* renamed from: a */
    public void m24067a() {
        try {
            this.f22388a.zzh();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: b */
    public boolean m24068b() {
        try {
            return this.f22388a.zzo();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: c */
    public String m24069c() {
        try {
            return this.f22388a.zzg();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: d */
    public float m24070d() {
        try {
            return this.f22388a.zzd();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: e */
    public float m24071e() {
        try {
            return this.f22388a.zze();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5999b0)) {
            return false;
        }
        try {
            return this.f22388a.zzn(((C5999b0) obj).f22388a);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: f */
    public boolean m24072f() {
        try {
            return this.f22388a.zzp();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: g */
    public void m24073g() {
        try {
            this.f22388a.zzi();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: h */
    public void m24074h(boolean z10) {
        try {
            this.f22388a.zzj(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f22388a.zzf();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: i */
    public void m24075i(float f10) {
        try {
            this.f22388a.zzk(f10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: j */
    public void m24076j(boolean z10) {
        try {
            this.f22388a.zzl(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: k */
    public void m24077k(float f10) {
        try {
            this.f22388a.zzm(f10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }
}
