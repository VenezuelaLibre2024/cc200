package p064e6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: e6.e0 */
/* loaded from: classes.dex */
public final class C1674e0 extends AbstractC2601a {
    public static final Parcelable.Creator<C1674e0> CREATOR = new C1676f0();

    /* renamed from: h */
    public final boolean f6256h;

    /* renamed from: i */
    public final String f6257i;

    /* renamed from: j */
    public final int f6258j;

    /* renamed from: k */
    public final int f6259k;

    public C1674e0(boolean z10, String str, int i10, int i11) {
        this.f6256h = z10;
        this.f6257i = str;
        this.f6258j = C1690m0.m6749a(i10) - 1;
        this.f6259k = C1695r.m6751a(i11) - 1;
    }

    /* renamed from: I */
    public final boolean m6712I() {
        return this.f6256h;
    }

    /* renamed from: J */
    public final int m6713J() {
        return C1695r.m6751a(this.f6259k);
    }

    /* renamed from: K */
    public final int m6714K() {
        return C1690m0.m6749a(this.f6258j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10471g(parcel, 1, this.f6256h);
        C2603c.m10456F(parcel, 2, this.f6257i, false);
        C2603c.m10485u(parcel, 3, this.f6258j);
        C2603c.m10485u(parcel, 4, this.f6259k);
        C2603c.m10466b(parcel, m10465a);
    }

    public final String zza() {
        return this.f6257i;
    }
}
