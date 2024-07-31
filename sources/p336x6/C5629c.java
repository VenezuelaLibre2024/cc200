package p336x6;

import android.graphics.Bitmap;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzam;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;
import p108h6.C2394s;
import p252r6.BinderC4309d;
import p352y6.InterfaceC5820b;
import p367z6.C5996a;
import p367z6.C5999b0;
import p367z6.C6001c0;
import p367z6.C6006f;
import p367z6.C6008g;
import p367z6.C6018l;
import p367z6.C6020m;
import p367z6.C6022n;
import p367z6.C6028q;
import p367z6.C6030r;
import p367z6.C6032s;
import p367z6.C6034t;
import p367z6.C6038v;

/* renamed from: x6.c */
/* loaded from: classes.dex */
public class C5629c {

    /* renamed from: a */
    public final InterfaceC5820b f21068a;

    /* renamed from: b */
    public final Map f21069b = new HashMap();

    /* renamed from: c */
    public final Map f21070c = new HashMap();

    /* renamed from: d */
    public C5635i f21071d;

    /* renamed from: x6.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        View mo6443a(C6020m c6020m);

        /* renamed from: c */
        View mo6444c(C6020m c6020m);
    }

    /* renamed from: x6.c$b */
    /* loaded from: classes.dex */
    public interface b {
        void onCameraIdle();
    }

    /* renamed from: x6.c$c */
    /* loaded from: classes.dex */
    public interface c {
        void onCameraMove();
    }

    /* renamed from: x6.c$d */
    /* loaded from: classes.dex */
    public interface d {
        void onCameraMoveStarted(int i10);
    }

    /* renamed from: x6.c$e */
    /* loaded from: classes.dex */
    public interface e {
        void onCircleClick(C6006f c6006f);
    }

    /* renamed from: x6.c$f */
    /* loaded from: classes.dex */
    public interface f {
        void onInfoWindowClick(C6020m c6020m);
    }

    /* renamed from: x6.c$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: b */
        void mo4189b(C6020m c6020m);
    }

    /* renamed from: x6.c$h */
    /* loaded from: classes.dex */
    public interface h {
        void onMapClick(LatLng latLng);
    }

    /* renamed from: x6.c$i */
    /* loaded from: classes.dex */
    public interface i {
        void onMapLongClick(LatLng latLng);
    }

    /* renamed from: x6.c$j */
    /* loaded from: classes.dex */
    public interface j {
        boolean onMarkerClick(C6020m c6020m);
    }

    /* renamed from: x6.c$k */
    /* loaded from: classes.dex */
    public interface k {
        void onMarkerDrag(C6020m c6020m);

        void onMarkerDragEnd(C6020m c6020m);

        void onMarkerDragStart(C6020m c6020m);
    }

    /* renamed from: x6.c$l */
    /* loaded from: classes.dex */
    public interface l {
        void onPolygonClick(C6028q c6028q);
    }

    /* renamed from: x6.c$m */
    /* loaded from: classes.dex */
    public interface m {
        void onPolylineClick(C6032s c6032s);
    }

    /* renamed from: x6.c$n */
    /* loaded from: classes.dex */
    public interface n {
        void onSnapshotReady(Bitmap bitmap);
    }

    public C5629c(InterfaceC5820b interfaceC5820b) {
        this.f21068a = (InterfaceC5820b) C2394s.m9619l(interfaceC5820b);
    }

    /* renamed from: A */
    public final void m22627A(d dVar) {
        try {
            if (dVar == null) {
                this.f21068a.mo23413j1(null);
            } else {
                this.f21068a.mo23413j1(new BinderC5650x(this, dVar));
            }
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: B */
    public final void m22628B(e eVar) {
        try {
            if (eVar == null) {
                this.f21068a.mo23416o(null);
            } else {
                this.f21068a.mo23416o(new BinderC5646t(this, eVar));
            }
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: C */
    public final void m22629C(f fVar) {
        try {
            if (fVar == null) {
                this.f21068a.mo23418p(null);
            } else {
                this.f21068a.mo23418p(new BinderC5643q(this, fVar));
            }
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: D */
    public final void m22630D(g gVar) {
        try {
            if (gVar == null) {
                this.f21068a.mo23403P0(null);
            } else {
                this.f21068a.mo23403P0(new BinderC5644r(this, gVar));
            }
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: E */
    public final void m22631E(h hVar) {
        try {
            if (hVar == null) {
                this.f21068a.mo23411d1(null);
            } else {
                this.f21068a.mo23411d1(new BinderC5627a0(this, hVar));
            }
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: F */
    public final void m22632F(i iVar) {
        try {
            if (iVar == null) {
                this.f21068a.mo23393D1(null);
            } else {
                this.f21068a.mo23393D1(new BinderC5637k(this, iVar));
            }
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: G */
    public final void m22633G(j jVar) {
        try {
            if (jVar == null) {
                this.f21068a.mo23395F1(null);
            } else {
                this.f21068a.mo23395F1(new BinderC5636j(this, jVar));
            }
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: H */
    public final void m22634H(k kVar) {
        try {
            if (kVar == null) {
                this.f21068a.mo23400I1(null);
            } else {
                this.f21068a.mo23400I1(new BinderC5642p(this, kVar));
            }
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: I */
    public final void m22635I(l lVar) {
        try {
            if (lVar == null) {
                this.f21068a.mo23401J1(null);
            } else {
                this.f21068a.mo23401J1(new BinderC5647u(this, lVar));
            }
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: J */
    public final void m22636J(m mVar) {
        try {
            if (mVar == null) {
                this.f21068a.mo23405T0(null);
            } else {
                this.f21068a.mo23405T0(new BinderC5648v(this, mVar));
            }
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: K */
    public final void m22637K(int i10, int i11, int i12, int i13) {
        try {
            this.f21068a.mo23396G(i10, i11, i12, i13);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: L */
    public final void m22638L(boolean z10) {
        try {
            this.f21068a.setTrafficEnabled(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: M */
    public final void m22639M(n nVar) {
        C2394s.m9620m(nVar, "Callback must not be null.");
        m22640N(nVar, null);
    }

    /* renamed from: N */
    public final void m22640N(n nVar, Bitmap bitmap) {
        C2394s.m9620m(nVar, "Callback must not be null.");
        try {
            this.f21068a.mo23412f1(new BinderC5649w(this, nVar), (BinderC4309d) (bitmap != null ? BinderC4309d.m16572g(bitmap) : null));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: a */
    public final C6006f m22641a(C6008g c6008g) {
        try {
            C2394s.m9620m(c6008g, "CircleOptions must not be null.");
            return new C6006f(this.f21068a.mo23398H(c6008g));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: b */
    public final C6020m m22642b(C6022n c6022n) {
        try {
            C2394s.m9620m(c6022n, "MarkerOptions must not be null.");
            zzad mo23419p1 = this.f21068a.mo23419p1(c6022n);
            if (mo23419p1 != null) {
                return c6022n.m24168i0() == 1 ? new C5996a(mo23419p1) : new C6020m(mo23419p1);
            }
            return null;
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: c */
    public final C6028q m22643c(C6030r c6030r) {
        try {
            C2394s.m9620m(c6030r, "PolygonOptions must not be null");
            return new C6028q(this.f21068a.mo23397G0(c6030r));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: d */
    public final C6032s m22644d(C6034t c6034t) {
        try {
            C2394s.m9620m(c6034t, "PolylineOptions must not be null");
            return new C6032s(this.f21068a.mo23408X0(c6034t));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: e */
    public final C5999b0 m22645e(C6001c0 c6001c0) {
        try {
            C2394s.m9620m(c6001c0, "TileOverlayOptions must not be null.");
            zzam mo23421r = this.f21068a.mo23421r(c6001c0);
            if (mo23421r != null) {
                return new C5999b0(mo23421r);
            }
            return null;
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: f */
    public final void m22646f(C5626a c5626a) {
        try {
            C2394s.m9620m(c5626a, "CameraUpdate must not be null.");
            this.f21068a.mo23407U0(c5626a.m22613a());
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: g */
    public final CameraPosition m22647g() {
        try {
            return this.f21068a.mo23406U();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: h */
    public final float m22648h() {
        try {
            return this.f21068a.mo23420q1();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: i */
    public final float m22649i() {
        try {
            return this.f21068a.mo23415m();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: j */
    public final C5634h m22650j() {
        try {
            return new C5634h(this.f21068a.mo23410b1());
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: k */
    public final C5635i m22651k() {
        try {
            if (this.f21071d == null) {
                this.f21071d = new C5635i(this.f21068a.mo23402O0());
            }
            return this.f21071d;
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: l */
    public final boolean m22652l() {
        try {
            return this.f21068a.mo23404S0();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: m */
    public final boolean m22653m() {
        try {
            return this.f21068a.mo23414l0();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: n */
    public final void m22654n(C5626a c5626a) {
        try {
            C2394s.m9620m(c5626a, "CameraUpdate must not be null.");
            this.f21068a.mo23392C(c5626a.m22613a());
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: o */
    public void m22655o() {
        try {
            this.f21068a.mo23394F0();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: p */
    public final void m22656p(boolean z10) {
        try {
            this.f21068a.setBuildingsEnabled(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: q */
    public final boolean m22657q(boolean z10) {
        try {
            return this.f21068a.setIndoorEnabled(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: r */
    public final void m22658r(a aVar) {
        try {
            if (aVar == null) {
                this.f21068a.mo23399I(null);
            } else {
                this.f21068a.mo23399I(new BinderC5645s(this, aVar));
            }
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: s */
    public void m22659s(LatLngBounds latLngBounds) {
        try {
            this.f21068a.mo23422s(latLngBounds);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: t */
    public boolean m22660t(C6018l c6018l) {
        try {
            return this.f21068a.mo23409a0(c6018l);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: u */
    public final void m22661u(int i10) {
        try {
            this.f21068a.setMapType(i10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: v */
    public void m22662v(float f10) {
        try {
            this.f21068a.mo23417o0(f10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: w */
    public void m22663w(float f10) {
        try {
            this.f21068a.mo23423v0(f10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: x */
    public final void m22664x(boolean z10) {
        try {
            this.f21068a.setMyLocationEnabled(z10);
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: y */
    public final void m22665y(b bVar) {
        try {
            if (bVar == null) {
                this.f21068a.mo23391A(null);
            } else {
                this.f21068a.mo23391A(new BinderC5652z(this, bVar));
            }
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: z */
    public final void m22666z(c cVar) {
        try {
            if (cVar == null) {
                this.f21068a.mo23424v1(null);
            } else {
                this.f21068a.mo23424v1(new BinderC5651y(this, cVar));
            }
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }
}
