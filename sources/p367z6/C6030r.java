package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: z6.r */
/* loaded from: classes.dex */
public final class C6030r extends AbstractC2601a {
    public static final Parcelable.Creator<C6030r> CREATOR = new C6043x0();

    /* renamed from: h */
    public final List f22456h;

    /* renamed from: i */
    public final List f22457i;

    /* renamed from: j */
    public float f22458j;

    /* renamed from: k */
    public int f22459k;

    /* renamed from: l */
    public int f22460l;

    /* renamed from: m */
    public float f22461m;

    /* renamed from: n */
    public boolean f22462n;

    /* renamed from: o */
    public boolean f22463o;

    /* renamed from: p */
    public boolean f22464p;

    /* renamed from: q */
    public int f22465q;

    /* renamed from: r */
    public List f22466r;

    public C6030r() {
        this.f22458j = 10.0f;
        this.f22459k = -16777216;
        this.f22460l = 0;
        this.f22461m = 0.0f;
        this.f22462n = true;
        this.f22463o = false;
        this.f22464p = false;
        this.f22465q = 0;
        this.f22466r = null;
        this.f22456h = new ArrayList();
        this.f22457i = new ArrayList();
    }

    public C6030r(List list, List list2, float f10, int i10, int i11, float f11, boolean z10, boolean z11, boolean z12, int i12, List list3) {
        this.f22456h = list;
        this.f22457i = list2;
        this.f22458j = f10;
        this.f22459k = i10;
        this.f22460l = i11;
        this.f22461m = f11;
        this.f22462n = z10;
        this.f22463o = z11;
        this.f22464p = z12;
        this.f22465q = i12;
        this.f22466r = list3;
    }

    /* renamed from: I */
    public C6030r m24186I(Iterable<LatLng> iterable) {
        C2394s.m9620m(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.f22456h.add(it.next());
        }
        return this;
    }

    /* renamed from: J */
    public C6030r m24187J(Iterable<LatLng> iterable) {
        C2394s.m9620m(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.f22457i.add(arrayList);
        return this;
    }

    /* renamed from: K */
    public C6030r m24188K(boolean z10) {
        this.f22464p = z10;
        return this;
    }

    /* renamed from: L */
    public C6030r m24189L(int i10) {
        this.f22460l = i10;
        return this;
    }

    /* renamed from: M */
    public C6030r m24190M(boolean z10) {
        this.f22463o = z10;
        return this;
    }

    /* renamed from: N */
    public int m24191N() {
        return this.f22460l;
    }

    /* renamed from: O */
    public List<LatLng> m24192O() {
        return this.f22456h;
    }

    /* renamed from: P */
    public int m24193P() {
        return this.f22459k;
    }

    /* renamed from: Q */
    public int m24194Q() {
        return this.f22465q;
    }

    /* renamed from: R */
    public List<C6024o> m24195R() {
        return this.f22466r;
    }

    /* renamed from: S */
    public float m24196S() {
        return this.f22458j;
    }

    /* renamed from: T */
    public float m24197T() {
        return this.f22461m;
    }

    /* renamed from: U */
    public boolean m24198U() {
        return this.f22464p;
    }

    /* renamed from: V */
    public boolean m24199V() {
        return this.f22463o;
    }

    /* renamed from: W */
    public boolean m24200W() {
        return this.f22462n;
    }

    /* renamed from: X */
    public C6030r m24201X(int i10) {
        this.f22459k = i10;
        return this;
    }

    /* renamed from: Y */
    public C6030r m24202Y(float f10) {
        this.f22458j = f10;
        return this;
    }

    /* renamed from: Z */
    public C6030r m24203Z(boolean z10) {
        this.f22462n = z10;
        return this;
    }

    /* renamed from: a0 */
    public C6030r m24204a0(float f10) {
        this.f22461m = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10460J(parcel, 2, m24192O(), false);
        C2603c.m10488x(parcel, 3, this.f22457i, false);
        C2603c.m10481q(parcel, 4, m24196S());
        C2603c.m10485u(parcel, 5, m24193P());
        C2603c.m10485u(parcel, 6, m24191N());
        C2603c.m10481q(parcel, 7, m24197T());
        C2603c.m10471g(parcel, 8, m24200W());
        C2603c.m10471g(parcel, 9, m24199V());
        C2603c.m10471g(parcel, 10, m24198U());
        C2603c.m10485u(parcel, 11, m24194Q());
        C2603c.m10460J(parcel, 12, m24195R(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
