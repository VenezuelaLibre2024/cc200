package p108h6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: h6.p */
/* loaded from: classes.dex */
public class C2385p extends AbstractC2601a {
    public static final Parcelable.Creator<C2385p> CREATOR = new C2377m0();

    /* renamed from: h */
    public final int f9668h;

    /* renamed from: i */
    public final int f9669i;

    /* renamed from: j */
    public final int f9670j;

    /* renamed from: k */
    public final long f9671k;

    /* renamed from: l */
    public final long f9672l;

    /* renamed from: m */
    public final String f9673m;

    /* renamed from: n */
    public final String f9674n;

    /* renamed from: o */
    public final int f9675o;

    /* renamed from: p */
    public final int f9676p;

    public C2385p(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f9668h = i10;
        this.f9669i = i11;
        this.f9670j = i12;
        this.f9671k = j10;
        this.f9672l = j11;
        this.f9673m = str;
        this.f9674n = str2;
        this.f9675o = i13;
        this.f9676p = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f9668h);
        C2603c.m10485u(parcel, 2, this.f9669i);
        C2603c.m10485u(parcel, 3, this.f9670j);
        C2603c.m10489y(parcel, 4, this.f9671k);
        C2603c.m10489y(parcel, 5, this.f9672l);
        C2603c.m10456F(parcel, 6, this.f9673m, false);
        C2603c.m10456F(parcel, 7, this.f9674n, false);
        C2603c.m10485u(parcel, 8, this.f9675o);
        C2603c.m10485u(parcel, 9, this.f9676p);
        C2603c.m10466b(parcel, m10465a);
    }
}
