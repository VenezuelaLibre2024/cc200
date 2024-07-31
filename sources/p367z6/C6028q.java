package p367z6;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzag;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import p108h6.C2394s;

/* renamed from: z6.q */
/* loaded from: classes.dex */
public final class C6028q {

    /* renamed from: a */
    public final zzag f22455a;

    public C6028q(zzag zzagVar) {
        this.f22455a = (zzag) C2394s.m9619l(zzagVar);
    }

    /* renamed from: a */
    public String m24175a() {
        try {
            return this.f22455a.zzk();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: b */
    public void m24176b() {
        try {
            this.f22455a.zzo();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: c */
    public void m24177c(boolean z10) {
        try {
            this.f22455a.zzp(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: d */
    public void m24178d(int i10) {
        try {
            this.f22455a.zzq(i10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: e */
    public void m24179e(boolean z10) {
        try {
            this.f22455a.zzr(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6028q)) {
            return false;
        }
        try {
            return this.f22455a.zzB(((C6028q) obj).f22455a);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: f */
    public void m24180f(List<? extends List<LatLng>> list) {
        try {
            this.f22455a.zzs(list);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: g */
    public void m24181g(List<LatLng> list) {
        try {
            C2394s.m9620m(list, "points must not be null.");
            this.f22455a.zzt(list);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: h */
    public void m24182h(int i10) {
        try {
            this.f22455a.zzu(i10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f22455a.zzi();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: i */
    public void m24183i(float f10) {
        try {
            this.f22455a.zzx(f10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: j */
    public void m24184j(boolean z10) {
        try {
            this.f22455a.zzz(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: k */
    public void m24185k(float f10) {
        try {
            this.f22455a.zzA(f10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }
}
