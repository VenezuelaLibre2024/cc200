package p034c7;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: c7.lc */
/* loaded from: classes.dex */
public final class C0787lc extends AbstractC2601a {
    public static final Parcelable.Creator<C0787lc> CREATOR = new C0829oc();

    /* renamed from: h */
    public final int f3288h;

    /* renamed from: i */
    public final String f3289i;

    /* renamed from: j */
    public final long f3290j;

    /* renamed from: k */
    public final Long f3291k;

    /* renamed from: l */
    public final Float f3292l;

    /* renamed from: m */
    public final String f3293m;

    /* renamed from: n */
    public final String f3294n;

    /* renamed from: o */
    public final Double f3295o;

    public C0787lc(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f3288h = i10;
        this.f3289i = str;
        this.f3290j = j10;
        this.f3291k = l10;
        this.f3292l = null;
        if (i10 == 1) {
            this.f3295o = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f3295o = d10;
        }
        this.f3293m = str2;
        this.f3294n = str3;
    }

    public C0787lc(C0815nc c0815nc) {
        this(c0815nc.f3379c, c0815nc.f3380d, c0815nc.f3381e, c0815nc.f3378b);
    }

    public C0787lc(String str, long j10, Object obj, String str2) {
        C2394s.m9613f(str);
        this.f3288h = 2;
        this.f3289i = str;
        this.f3290j = j10;
        this.f3294n = str2;
        if (obj == null) {
            this.f3291k = null;
            this.f3292l = null;
            this.f3295o = null;
            this.f3293m = null;
            return;
        }
        if (obj instanceof Long) {
            this.f3291k = (Long) obj;
            this.f3292l = null;
            this.f3295o = null;
            this.f3293m = null;
            return;
        }
        if (obj instanceof String) {
            this.f3291k = null;
            this.f3292l = null;
            this.f3295o = null;
            this.f3293m = (String) obj;
            return;
        }
        if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.f3291k = null;
        this.f3292l = null;
        this.f3295o = (Double) obj;
        this.f3293m = null;
    }

    /* renamed from: I */
    public final Object m3529I() {
        Long l10 = this.f3291k;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f3295o;
        if (d10 != null) {
            return d10;
        }
        String str = this.f3293m;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f3288h);
        C2603c.m10456F(parcel, 2, this.f3289i, false);
        C2603c.m10489y(parcel, 3, this.f3290j);
        C2603c.m10451A(parcel, 4, this.f3291k, false);
        C2603c.m10483s(parcel, 5, null, false);
        C2603c.m10456F(parcel, 6, this.f3293m, false);
        C2603c.m10456F(parcel, 7, this.f3294n, false);
        C2603c.m10480p(parcel, 8, this.f3295o, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
