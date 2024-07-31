package p319w5;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: w5.a */
/* loaded from: classes.dex */
public class C5277a extends AbstractC2601a {
    public static final Parcelable.Creator<C5277a> CREATOR = new C5287k();

    /* renamed from: h */
    public final int f20023h;

    /* renamed from: i */
    public final boolean f20024i;

    /* renamed from: j */
    public final long f20025j;

    /* renamed from: k */
    public final boolean f20026k;

    public C5277a(int i10, boolean z10, long j10, boolean z11) {
        this.f20023h = i10;
        this.f20024i = z10;
        this.f20025j = j10;
        this.f20026k = z11;
    }

    /* renamed from: I */
    public long m21359I() {
        return this.f20025j;
    }

    /* renamed from: J */
    public boolean m21360J() {
        return this.f20026k;
    }

    /* renamed from: K */
    public boolean m21361K() {
        return this.f20024i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f20023h);
        C2603c.m10471g(parcel, 2, m21361K());
        C2603c.m10489y(parcel, 3, m21359I());
        C2603c.m10471g(parcel, 4, m21360J());
        C2603c.m10466b(parcel, m10465a);
    }
}
