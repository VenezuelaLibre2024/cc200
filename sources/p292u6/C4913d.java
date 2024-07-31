package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.d */
/* loaded from: classes.dex */
public class C4913d extends AbstractC2601a {
    public static final Parcelable.Creator<C4913d> CREATOR = new C4947m1();

    /* renamed from: h */
    public final C4960r f18533h;

    /* renamed from: i */
    public final C4908b2 f18534i;

    /* renamed from: j */
    public final C4922f0 f18535j;

    /* renamed from: k */
    public final C4932h2 f18536k;

    /* renamed from: l */
    public final C4940k0 f18537l;

    /* renamed from: m */
    public final C4946m0 f18538m;

    /* renamed from: n */
    public final C4916d2 f18539n;

    /* renamed from: o */
    public final C4955p0 f18540o;

    /* renamed from: p */
    public final C4963s f18541p;

    /* renamed from: q */
    public final C4961r0 f18542q;

    public C4913d(C4960r c4960r, C4908b2 c4908b2, C4922f0 c4922f0, C4932h2 c4932h2, C4940k0 c4940k0, C4946m0 c4946m0, C4916d2 c4916d2, C4955p0 c4955p0, C4963s c4963s, C4961r0 c4961r0) {
        this.f18533h = c4960r;
        this.f18535j = c4922f0;
        this.f18534i = c4908b2;
        this.f18536k = c4932h2;
        this.f18537l = c4940k0;
        this.f18538m = c4946m0;
        this.f18539n = c4916d2;
        this.f18540o = c4955p0;
        this.f18541p = c4963s;
        this.f18542q = c4961r0;
    }

    /* renamed from: I */
    public C4960r m19473I() {
        return this.f18533h;
    }

    /* renamed from: J */
    public C4922f0 m19474J() {
        return this.f18535j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4913d)) {
            return false;
        }
        C4913d c4913d = (C4913d) obj;
        return C2388q.m9592b(this.f18533h, c4913d.f18533h) && C2388q.m9592b(this.f18534i, c4913d.f18534i) && C2388q.m9592b(this.f18535j, c4913d.f18535j) && C2388q.m9592b(this.f18536k, c4913d.f18536k) && C2388q.m9592b(this.f18537l, c4913d.f18537l) && C2388q.m9592b(this.f18538m, c4913d.f18538m) && C2388q.m9592b(this.f18539n, c4913d.f18539n) && C2388q.m9592b(this.f18540o, c4913d.f18540o) && C2388q.m9592b(this.f18541p, c4913d.f18541p) && C2388q.m9592b(this.f18542q, c4913d.f18542q);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f18533h, this.f18534i, this.f18535j, this.f18536k, this.f18537l, this.f18538m, this.f18539n, this.f18540o, this.f18541p, this.f18542q);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 2, m19473I(), i10, false);
        C2603c.m10454D(parcel, 3, this.f18534i, i10, false);
        C2603c.m10454D(parcel, 4, m19474J(), i10, false);
        C2603c.m10454D(parcel, 5, this.f18536k, i10, false);
        C2603c.m10454D(parcel, 6, this.f18537l, i10, false);
        C2603c.m10454D(parcel, 7, this.f18538m, i10, false);
        C2603c.m10454D(parcel, 8, this.f18539n, i10, false);
        C2603c.m10454D(parcel, 9, this.f18540o, i10, false);
        C2603c.m10454D(parcel, 10, this.f18541p, i10, false);
        C2603c.m10454D(parcel, 11, this.f18542q, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
