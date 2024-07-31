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
import p367z6.C6044y;

/* renamed from: z6.t */
/* loaded from: classes.dex */
public final class C6034t extends AbstractC2601a {
    public static final Parcelable.Creator<C6034t> CREATOR = new C6045y0();

    /* renamed from: h */
    public final List f22468h;

    /* renamed from: i */
    public float f22469i;

    /* renamed from: j */
    public int f22470j;

    /* renamed from: k */
    public float f22471k;

    /* renamed from: l */
    public boolean f22472l;

    /* renamed from: m */
    public boolean f22473m;

    /* renamed from: n */
    public boolean f22474n;

    /* renamed from: o */
    public C6004e f22475o;

    /* renamed from: p */
    public C6004e f22476p;

    /* renamed from: q */
    public int f22477q;

    /* renamed from: r */
    public List f22478r;

    /* renamed from: s */
    public List f22479s;

    public C6034t() {
        this.f22469i = 10.0f;
        this.f22470j = -16777216;
        this.f22471k = 0.0f;
        this.f22472l = true;
        this.f22473m = false;
        this.f22474n = false;
        this.f22475o = new C6002d();
        this.f22476p = new C6002d();
        this.f22477q = 0;
        this.f22478r = null;
        this.f22479s = new ArrayList();
        this.f22468h = new ArrayList();
    }

    public C6034t(List list, float f10, int i10, float f11, boolean z10, boolean z11, boolean z12, C6004e c6004e, C6004e c6004e2, int i11, List list2, List list3) {
        this.f22469i = 10.0f;
        this.f22470j = -16777216;
        this.f22471k = 0.0f;
        this.f22472l = true;
        this.f22473m = false;
        this.f22474n = false;
        this.f22475o = new C6002d();
        this.f22476p = new C6002d();
        this.f22477q = 0;
        this.f22478r = null;
        this.f22479s = new ArrayList();
        this.f22468h = list;
        this.f22469i = f10;
        this.f22470j = i10;
        this.f22471k = f11;
        this.f22472l = z10;
        this.f22473m = z11;
        this.f22474n = z12;
        if (c6004e != null) {
            this.f22475o = c6004e;
        }
        if (c6004e2 != null) {
            this.f22476p = c6004e2;
        }
        this.f22477q = i11;
        this.f22478r = list2;
        if (list3 != null) {
            this.f22479s = list3;
        }
    }

    /* renamed from: I */
    public C6034t m24218I(Iterable<LatLng> iterable) {
        C2394s.m9620m(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.f22468h.add(it.next());
        }
        return this;
    }

    /* renamed from: J */
    public C6034t m24219J(boolean z10) {
        this.f22474n = z10;
        return this;
    }

    /* renamed from: K */
    public C6034t m24220K(int i10) {
        this.f22470j = i10;
        return this;
    }

    /* renamed from: L */
    public C6034t m24221L(C6004e c6004e) {
        this.f22476p = (C6004e) C2394s.m9620m(c6004e, "endCap must not be null");
        return this;
    }

    /* renamed from: M */
    public C6034t m24222M(boolean z10) {
        this.f22473m = z10;
        return this;
    }

    /* renamed from: N */
    public int m24223N() {
        return this.f22470j;
    }

    /* renamed from: O */
    public C6004e m24224O() {
        return this.f22476p.m24094I();
    }

    /* renamed from: P */
    public int m24225P() {
        return this.f22477q;
    }

    /* renamed from: Q */
    public List<C6024o> m24226Q() {
        return this.f22478r;
    }

    /* renamed from: R */
    public List<LatLng> m24227R() {
        return this.f22468h;
    }

    /* renamed from: S */
    public C6004e m24228S() {
        return this.f22475o.m24094I();
    }

    /* renamed from: T */
    public float m24229T() {
        return this.f22469i;
    }

    /* renamed from: U */
    public float m24230U() {
        return this.f22471k;
    }

    /* renamed from: V */
    public boolean m24231V() {
        return this.f22474n;
    }

    /* renamed from: W */
    public boolean m24232W() {
        return this.f22473m;
    }

    /* renamed from: X */
    public boolean m24233X() {
        return this.f22472l;
    }

    /* renamed from: Y */
    public C6034t m24234Y(int i10) {
        this.f22477q = i10;
        return this;
    }

    /* renamed from: Z */
    public C6034t m24235Z(List<C6024o> list) {
        this.f22478r = list;
        return this;
    }

    /* renamed from: a0 */
    public C6034t m24236a0(C6004e c6004e) {
        this.f22475o = (C6004e) C2394s.m9620m(c6004e, "startCap must not be null");
        return this;
    }

    /* renamed from: b0 */
    public C6034t m24237b0(boolean z10) {
        this.f22472l = z10;
        return this;
    }

    /* renamed from: c0 */
    public C6034t m24238c0(float f10) {
        this.f22469i = f10;
        return this;
    }

    /* renamed from: d0 */
    public C6034t m24239d0(float f10) {
        this.f22471k = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10460J(parcel, 2, m24227R(), false);
        C2603c.m10481q(parcel, 3, m24229T());
        C2603c.m10485u(parcel, 4, m24223N());
        C2603c.m10481q(parcel, 5, m24230U());
        C2603c.m10471g(parcel, 6, m24233X());
        C2603c.m10471g(parcel, 7, m24232W());
        C2603c.m10471g(parcel, 8, m24231V());
        C2603c.m10454D(parcel, 9, m24228S(), i10, false);
        C2603c.m10454D(parcel, 10, m24224O(), i10, false);
        C2603c.m10485u(parcel, 11, m24225P());
        C2603c.m10460J(parcel, 12, m24226Q(), false);
        ArrayList arrayList = new ArrayList(this.f22479s.size());
        for (C6046z c6046z : this.f22479s) {
            C6044y.a aVar = new C6044y.a(c6046z.m24249J());
            aVar.m24247c(this.f22469i);
            aVar.m24246b(this.f22472l);
            arrayList.add(new C6046z(aVar.m24245a(), c6046z.m24248I()));
        }
        C2603c.m10460J(parcel, 13, arrayList, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
