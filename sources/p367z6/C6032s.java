package p367z6;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import p108h6.C2394s;

/* renamed from: z6.s */
/* loaded from: classes.dex */
public final class C6032s {

    /* renamed from: a */
    public final zzaj f22467a;

    public C6032s(zzaj zzajVar) {
        this.f22467a = (zzaj) C2394s.m9619l(zzajVar);
    }

    /* renamed from: a */
    public String m24205a() {
        try {
            return this.f22467a.zzl();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: b */
    public void m24206b() {
        try {
            this.f22467a.zzp();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: c */
    public void m24207c(boolean z10) {
        try {
            this.f22467a.zzq(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: d */
    public void m24208d(int i10) {
        try {
            this.f22467a.zzr(i10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: e */
    public void m24209e(C6004e c6004e) {
        C2394s.m9620m(c6004e, "endCap must not be null");
        try {
            this.f22467a.zzs(c6004e);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6032s)) {
            return false;
        }
        try {
            return this.f22467a.zzD(((C6032s) obj).f22467a);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: f */
    public void m24210f(boolean z10) {
        try {
            this.f22467a.zzt(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: g */
    public void m24211g(int i10) {
        try {
            this.f22467a.zzu(i10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: h */
    public void m24212h(List<C6024o> list) {
        try {
            this.f22467a.zzv(list);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f22467a.zzh();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: i */
    public void m24213i(List<LatLng> list) {
        C2394s.m9620m(list, "points must not be null");
        try {
            this.f22467a.zzw(list);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: j */
    public void m24214j(C6004e c6004e) {
        C2394s.m9620m(c6004e, "startCap must not be null");
        try {
            this.f22467a.zzy(c6004e);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: k */
    public void m24215k(boolean z10) {
        try {
            this.f22467a.zzA(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: l */
    public void m24216l(float f10) {
        try {
            this.f22467a.zzB(f10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: m */
    public void m24217m(float f10) {
        try {
            this.f22467a.zzC(f10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }
}
