package p065e7;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2392r0;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: e7.j */
/* loaded from: classes.dex */
public final class C1713j extends AbstractC2601a {
    public static final Parcelable.Creator<C1713j> CREATOR = new C1714k();

    /* renamed from: h */
    public final int f6307h;

    /* renamed from: i */
    public final C2392r0 f6308i;

    public C1713j(int i10, C2392r0 c2392r0) {
        this.f6307h = i10;
        this.f6308i = c2392r0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f6307h);
        C2603c.m10454D(parcel, 2, this.f6308i, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
