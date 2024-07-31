package p021b6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: b6.a */
/* loaded from: classes.dex */
public class C0481a extends AbstractC2601a {
    public static final Parcelable.Creator<C0481a> CREATOR = new C0485d();

    /* renamed from: h */
    public final int f2273h;

    /* renamed from: i */
    public int f2274i;

    /* renamed from: j */
    public Bundle f2275j;

    public C0481a(int i10, int i11, Bundle bundle) {
        this.f2273h = i10;
        this.f2274i = i11;
        this.f2275j = bundle;
    }

    /* renamed from: I */
    public int m2412I() {
        return this.f2274i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f2273h);
        C2603c.m10485u(parcel, 2, m2412I());
        C2603c.m10474j(parcel, 3, this.f2275j, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
