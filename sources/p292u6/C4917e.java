package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.e */
/* loaded from: classes.dex */
public class C4917e extends AbstractC2601a {
    public static final Parcelable.Creator<C4917e> CREATOR = new C4944l1();

    /* renamed from: h */
    public final C4926g0 f18549h;

    /* renamed from: i */
    public final C4953o1 f18550i;

    /* renamed from: j */
    public final C4921f f18551j;

    /* renamed from: k */
    public final C4959q1 f18552k;

    public C4917e(C4926g0 c4926g0, C4953o1 c4953o1, C4921f c4921f, C4959q1 c4959q1) {
        this.f18549h = c4926g0;
        this.f18550i = c4953o1;
        this.f18551j = c4921f;
        this.f18552k = c4959q1;
    }

    /* renamed from: I */
    public C4921f m19476I() {
        return this.f18551j;
    }

    /* renamed from: J */
    public C4926g0 m19477J() {
        return this.f18549h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4917e)) {
            return false;
        }
        C4917e c4917e = (C4917e) obj;
        return C2388q.m9592b(this.f18549h, c4917e.f18549h) && C2388q.m9592b(this.f18550i, c4917e.f18550i) && C2388q.m9592b(this.f18551j, c4917e.f18551j) && C2388q.m9592b(this.f18552k, c4917e.f18552k);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f18549h, this.f18550i, this.f18551j, this.f18552k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 1, m19477J(), i10, false);
        C2603c.m10454D(parcel, 2, this.f18550i, i10, false);
        C2603c.m10454D(parcel, 3, m19476I(), i10, false);
        C2603c.m10454D(parcel, 4, this.f18552k, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
