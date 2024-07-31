package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: w6.s */
/* loaded from: classes.dex */
public final class C5324s extends AbstractC2601a {
    public static final Parcelable.Creator<C5324s> CREATOR = new C5336y();

    /* renamed from: h */
    public final boolean f20136h;

    /* renamed from: i */
    public final boolean f20137i;

    /* renamed from: j */
    public final boolean f20138j;

    /* renamed from: k */
    public final boolean f20139k;

    /* renamed from: l */
    public final boolean f20140l;

    /* renamed from: m */
    public final boolean f20141m;

    public C5324s(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f20136h = z10;
        this.f20137i = z11;
        this.f20138j = z12;
        this.f20139k = z13;
        this.f20140l = z14;
        this.f20141m = z15;
    }

    /* renamed from: I */
    public boolean m21396I() {
        return this.f20141m;
    }

    /* renamed from: J */
    public boolean m21397J() {
        return this.f20138j;
    }

    /* renamed from: K */
    public boolean m21398K() {
        return this.f20139k;
    }

    /* renamed from: L */
    public boolean m21399L() {
        return this.f20136h;
    }

    /* renamed from: M */
    public boolean m21400M() {
        return this.f20140l;
    }

    /* renamed from: N */
    public boolean m21401N() {
        return this.f20137i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10471g(parcel, 1, m21399L());
        C2603c.m10471g(parcel, 2, m21401N());
        C2603c.m10471g(parcel, 3, m21397J());
        C2603c.m10471g(parcel, 4, m21398K());
        C2603c.m10471g(parcel, 5, m21400M());
        C2603c.m10471g(parcel, 6, m21396I());
        C2603c.m10466b(parcel, m10465a);
    }
}
