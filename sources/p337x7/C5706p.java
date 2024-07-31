package p337x7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p321w7.AbstractC5377j0;
import p321w7.AbstractC5385l0;
import p321w7.C5403r0;
import p321w7.C5421x0;

/* renamed from: x7.p */
/* loaded from: classes.dex */
public final class C5706p extends AbstractC5385l0 {
    public static final Parcelable.Creator<C5706p> CREATOR = new C5715s();

    /* renamed from: h */
    public String f21231h;

    /* renamed from: i */
    public String f21232i;

    /* renamed from: j */
    public List<C5403r0> f21233j;

    /* renamed from: k */
    public List<C5421x0> f21234k;

    /* renamed from: l */
    public C5685i f21235l;

    public C5706p() {
    }

    public C5706p(String str, String str2, List<C5403r0> list, List<C5421x0> list2, C5685i c5685i) {
        this.f21231h = str;
        this.f21232i = str2;
        this.f21233j = list;
        this.f21234k = list2;
        this.f21235l = c5685i;
    }

    /* renamed from: J */
    public static C5706p m22793J(String str, C5685i c5685i) {
        C2394s.m9613f(str);
        C5706p c5706p = new C5706p();
        c5706p.f21231h = str;
        c5706p.f21235l = c5685i;
        return c5706p;
    }

    /* renamed from: K */
    public static C5706p m22794K(List<AbstractC5377j0> list, String str) {
        List list2;
        AbstractC2601a abstractC2601a;
        C2394s.m9619l(list);
        C2394s.m9613f(str);
        C5706p c5706p = new C5706p();
        c5706p.f21233j = new ArrayList();
        c5706p.f21234k = new ArrayList();
        for (AbstractC5377j0 abstractC5377j0 : list) {
            if (abstractC5377j0 instanceof C5403r0) {
                list2 = c5706p.f21233j;
                abstractC2601a = (C5403r0) abstractC5377j0;
            } else {
                if (!(abstractC5377j0 instanceof C5421x0)) {
                    throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: " + abstractC5377j0.mo21513J());
                }
                list2 = c5706p.f21234k;
                abstractC2601a = (C5421x0) abstractC5377j0;
            }
            list2.add(abstractC2601a);
        }
        c5706p.f21232i = str;
        return c5706p;
    }

    /* renamed from: I */
    public final C5685i m22795I() {
        return this.f21235l;
    }

    /* renamed from: L */
    public final String m22796L() {
        return this.f21231h;
    }

    /* renamed from: M */
    public final boolean m22797M() {
        return this.f21231h != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, this.f21231h, false);
        C2603c.m10456F(parcel, 2, this.f21232i, false);
        C2603c.m10460J(parcel, 3, this.f21233j, false);
        C2603c.m10460J(parcel, 4, this.f21234k, false);
        C2603c.m10454D(parcel, 5, this.f21235l, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }

    public final String zzc() {
        return this.f21232i;
    }
}
