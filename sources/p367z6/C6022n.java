package p367z6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p252r6.BinderC4309d;
import p252r6.InterfaceC4307b;

/* renamed from: z6.n */
/* loaded from: classes.dex */
public class C6022n extends AbstractC2601a {
    public static final Parcelable.Creator<C6022n> CREATOR = new C6035t0();

    /* renamed from: h */
    public LatLng f22426h;

    /* renamed from: i */
    public String f22427i;

    /* renamed from: j */
    public String f22428j;

    /* renamed from: k */
    public C5998b f22429k;

    /* renamed from: l */
    public float f22430l;

    /* renamed from: m */
    public float f22431m;

    /* renamed from: n */
    public boolean f22432n;

    /* renamed from: o */
    public boolean f22433o;

    /* renamed from: p */
    public boolean f22434p;

    /* renamed from: q */
    public float f22435q;

    /* renamed from: r */
    public float f22436r;

    /* renamed from: s */
    public float f22437s;

    /* renamed from: t */
    public float f22438t;

    /* renamed from: u */
    public float f22439u;

    /* renamed from: v */
    public int f22440v;

    /* renamed from: w */
    public View f22441w;

    /* renamed from: x */
    public int f22442x;

    /* renamed from: y */
    public String f22443y;

    /* renamed from: z */
    public float f22444z;

    public C6022n() {
        this.f22430l = 0.5f;
        this.f22431m = 1.0f;
        this.f22433o = true;
        this.f22434p = false;
        this.f22435q = 0.0f;
        this.f22436r = 0.5f;
        this.f22437s = 0.0f;
        this.f22438t = 1.0f;
        this.f22440v = 0;
    }

    public C6022n(LatLng latLng, String str, String str2, IBinder iBinder, float f10, float f11, boolean z10, boolean z11, boolean z12, float f12, float f13, float f14, float f15, float f16, int i10, IBinder iBinder2, int i11, String str3, float f17) {
        this.f22430l = 0.5f;
        this.f22431m = 1.0f;
        this.f22433o = true;
        this.f22434p = false;
        this.f22435q = 0.0f;
        this.f22436r = 0.5f;
        this.f22437s = 0.0f;
        this.f22438t = 1.0f;
        this.f22440v = 0;
        this.f22426h = latLng;
        this.f22427i = str;
        this.f22428j = str2;
        if (iBinder == null) {
            this.f22429k = null;
        } else {
            this.f22429k = new C5998b(InterfaceC4307b.a.m16570c(iBinder));
        }
        this.f22430l = f10;
        this.f22431m = f11;
        this.f22432n = z10;
        this.f22433o = z11;
        this.f22434p = z12;
        this.f22435q = f12;
        this.f22436r = f13;
        this.f22437s = f14;
        this.f22438t = f15;
        this.f22439u = f16;
        this.f22442x = i11;
        this.f22440v = i10;
        InterfaceC4307b m16570c = InterfaceC4307b.a.m16570c(iBinder2);
        this.f22441w = m16570c != null ? (View) BinderC4309d.m16571e(m16570c) : null;
        this.f22443y = str3;
        this.f22444z = f17;
    }

    /* renamed from: I */
    public C6022n m24142I(float f10) {
        this.f22438t = f10;
        return this;
    }

    /* renamed from: J */
    public C6022n m24143J(float f10, float f11) {
        this.f22430l = f10;
        this.f22431m = f11;
        return this;
    }

    /* renamed from: K */
    public C6022n m24144K(boolean z10) {
        this.f22432n = z10;
        return this;
    }

    /* renamed from: L */
    public C6022n m24145L(boolean z10) {
        this.f22434p = z10;
        return this;
    }

    /* renamed from: M */
    public float m24146M() {
        return this.f22438t;
    }

    /* renamed from: N */
    public float m24147N() {
        return this.f22430l;
    }

    /* renamed from: O */
    public float m24148O() {
        return this.f22431m;
    }

    /* renamed from: P */
    public C5998b m24149P() {
        return this.f22429k;
    }

    /* renamed from: Q */
    public float m24150Q() {
        return this.f22436r;
    }

    /* renamed from: R */
    public float m24151R() {
        return this.f22437s;
    }

    /* renamed from: S */
    public LatLng m24152S() {
        return this.f22426h;
    }

    /* renamed from: T */
    public float m24153T() {
        return this.f22435q;
    }

    /* renamed from: U */
    public String m24154U() {
        return this.f22428j;
    }

    /* renamed from: V */
    public String m24155V() {
        return this.f22427i;
    }

    /* renamed from: W */
    public float m24156W() {
        return this.f22439u;
    }

    /* renamed from: X */
    public C6022n m24157X(C5998b c5998b) {
        this.f22429k = c5998b;
        return this;
    }

    /* renamed from: Y */
    public C6022n m24158Y(float f10, float f11) {
        this.f22436r = f10;
        this.f22437s = f11;
        return this;
    }

    /* renamed from: Z */
    public boolean m24159Z() {
        return this.f22432n;
    }

    /* renamed from: a0 */
    public boolean m24160a0() {
        return this.f22434p;
    }

    /* renamed from: b0 */
    public boolean m24161b0() {
        return this.f22433o;
    }

    /* renamed from: c0 */
    public C6022n m24162c0(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.f22426h = latLng;
        return this;
    }

    /* renamed from: d0 */
    public C6022n m24163d0(float f10) {
        this.f22435q = f10;
        return this;
    }

    /* renamed from: e0 */
    public C6022n m24164e0(String str) {
        this.f22428j = str;
        return this;
    }

    /* renamed from: f0 */
    public C6022n m24165f0(String str) {
        this.f22427i = str;
        return this;
    }

    /* renamed from: g0 */
    public C6022n m24166g0(boolean z10) {
        this.f22433o = z10;
        return this;
    }

    /* renamed from: h0 */
    public C6022n m24167h0(float f10) {
        this.f22439u = f10;
        return this;
    }

    /* renamed from: i0 */
    public final int m24168i0() {
        return this.f22442x;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 2, m24152S(), i10, false);
        C2603c.m10456F(parcel, 3, m24155V(), false);
        C2603c.m10456F(parcel, 4, m24154U(), false);
        C5998b c5998b = this.f22429k;
        C2603c.m10484t(parcel, 5, c5998b == null ? null : c5998b.m24066a().asBinder(), false);
        C2603c.m10481q(parcel, 6, m24147N());
        C2603c.m10481q(parcel, 7, m24148O());
        C2603c.m10471g(parcel, 8, m24159Z());
        C2603c.m10471g(parcel, 9, m24161b0());
        C2603c.m10471g(parcel, 10, m24160a0());
        C2603c.m10481q(parcel, 11, m24153T());
        C2603c.m10481q(parcel, 12, m24150Q());
        C2603c.m10481q(parcel, 13, m24151R());
        C2603c.m10481q(parcel, 14, m24146M());
        C2603c.m10481q(parcel, 15, m24156W());
        C2603c.m10485u(parcel, 17, this.f22440v);
        C2603c.m10484t(parcel, 18, BinderC4309d.m16572g(this.f22441w).asBinder(), false);
        C2603c.m10485u(parcel, 19, this.f22442x);
        C2603c.m10456F(parcel, 20, this.f22443y, false);
        C2603c.m10481q(parcel, 21, this.f22444z);
        C2603c.m10466b(parcel, m10465a);
    }
}
