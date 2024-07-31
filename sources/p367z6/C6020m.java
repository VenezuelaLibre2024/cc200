package p367z6;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.maps.model.LatLng;
import p108h6.C2394s;

/* renamed from: z6.m */
/* loaded from: classes.dex */
public class C6020m {

    /* renamed from: a */
    public final zzad f22425a;

    public C6020m(zzad zzadVar) {
        this.f22425a = (zzad) C2394s.m9619l(zzadVar);
    }

    /* renamed from: a */
    public String m24122a() {
        try {
            return this.f22425a.zzk();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: b */
    public LatLng m24123b() {
        try {
            return this.f22425a.zzj();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: c */
    public String m24124c() {
        try {
            return this.f22425a.zzl();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: d */
    public String m24125d() {
        try {
            return this.f22425a.zzm();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: e */
    public void m24126e() {
        try {
            this.f22425a.zzn();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6020m)) {
            return false;
        }
        try {
            return this.f22425a.zzE(((C6020m) obj).f22425a);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: f */
    public boolean m24127f() {
        try {
            return this.f22425a.zzH();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: g */
    public void m24128g() {
        try {
            this.f22425a.zzo();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: h */
    public void m24129h(float f10) {
        try {
            this.f22425a.zzp(f10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f22425a.zzg();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: i */
    public void m24130i(float f10, float f11) {
        try {
            this.f22425a.zzq(f10, f11);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: j */
    public void m24131j(boolean z10) {
        try {
            this.f22425a.zzr(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: k */
    public void m24132k(boolean z10) {
        try {
            this.f22425a.zzs(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: l */
    public void m24133l(C5998b c5998b) {
        try {
            if (c5998b == null) {
                this.f22425a.zzt(null);
            } else {
                this.f22425a.zzt(c5998b.m24066a());
            }
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: m */
    public void m24134m(float f10, float f11) {
        try {
            this.f22425a.zzv(f10, f11);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: n */
    public void m24135n(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.f22425a.zzw(latLng);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: o */
    public void m24136o(float f10) {
        try {
            this.f22425a.zzx(f10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: p */
    public void m24137p(String str) {
        try {
            this.f22425a.zzy(str);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: q */
    public void m24138q(String str) {
        try {
            this.f22425a.zzA(str);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: r */
    public void m24139r(boolean z10) {
        try {
            this.f22425a.zzB(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: s */
    public void m24140s(float f10) {
        try {
            this.f22425a.zzC(f10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: t */
    public void m24141t() {
        try {
            this.f22425a.zzD();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }
}
