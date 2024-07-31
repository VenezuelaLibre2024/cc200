package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: w6.g0 */
/* loaded from: classes.dex */
public final class C5301g0 extends AbstractC2601a {
    public static final Parcelable.Creator<C5301g0> CREATOR = new C5303h0();

    /* renamed from: h */
    public final long f20086h;

    /* renamed from: i */
    public final boolean f20087i;

    /* renamed from: j */
    public final WorkSource f20088j;

    /* renamed from: k */
    public final String f20089k;

    /* renamed from: l */
    public final int[] f20090l;

    /* renamed from: m */
    public final boolean f20091m;

    /* renamed from: n */
    public final String f20092n;

    /* renamed from: o */
    public final long f20093o;

    /* renamed from: p */
    public String f20094p;

    public C5301g0(long j10, boolean z10, WorkSource workSource, String str, int[] iArr, boolean z11, String str2, long j11, String str3) {
        this.f20086h = j10;
        this.f20087i = z10;
        this.f20088j = workSource;
        this.f20089k = str;
        this.f20090l = iArr;
        this.f20091m = z11;
        this.f20092n = str2;
        this.f20093o = j11;
        this.f20094p = str3;
    }

    /* renamed from: I */
    public final C5301g0 m21377I(String str) {
        this.f20094p = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C2394s.m9619l(parcel);
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10489y(parcel, 1, this.f20086h);
        C2603c.m10471g(parcel, 2, this.f20087i);
        C2603c.m10454D(parcel, 3, this.f20088j, i10, false);
        C2603c.m10456F(parcel, 4, this.f20089k, false);
        C2603c.m10486v(parcel, 5, this.f20090l, false);
        C2603c.m10471g(parcel, 6, this.f20091m);
        C2603c.m10456F(parcel, 7, this.f20092n, false);
        C2603c.m10489y(parcel, 8, this.f20093o);
        C2603c.m10456F(parcel, 9, this.f20094p, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
