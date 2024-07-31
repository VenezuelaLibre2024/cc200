package p108h6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p064e6.C1671d;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: h6.l1 */
/* loaded from: classes.dex */
public final class C2375l1 extends AbstractC2601a {
    public static final Parcelable.Creator<C2375l1> CREATOR = new C2378m1();

    /* renamed from: h */
    public Bundle f9657h;

    /* renamed from: i */
    public C1671d[] f9658i;

    /* renamed from: j */
    public int f9659j;

    /* renamed from: k */
    public C2355f f9660k;

    public C2375l1() {
    }

    public C2375l1(Bundle bundle, C1671d[] c1671dArr, int i10, C2355f c2355f) {
        this.f9657h = bundle;
        this.f9658i = c1671dArr;
        this.f9659j = i10;
        this.f9660k = c2355f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10474j(parcel, 1, this.f9657h, false);
        C2603c.m10459I(parcel, 2, this.f9658i, i10, false);
        C2603c.m10485u(parcel, 3, this.f9659j);
        C2603c.m10454D(parcel, 4, this.f9660k, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
