package p034c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: c7.rc */
/* loaded from: classes.dex */
public final class C0871rc extends AbstractC2601a {
    public static final Parcelable.Creator<C0871rc> CREATOR = new C0759jc();

    /* renamed from: A */
    public final List<String> f3522A;

    /* renamed from: B */
    public final String f3523B;

    /* renamed from: C */
    public final String f3524C;

    /* renamed from: D */
    public final String f3525D;

    /* renamed from: E */
    public final String f3526E;

    /* renamed from: F */
    public final boolean f3527F;

    /* renamed from: G */
    public final long f3528G;

    /* renamed from: H */
    public final int f3529H;

    /* renamed from: I */
    public final String f3530I;

    /* renamed from: J */
    public final int f3531J;

    /* renamed from: K */
    public final long f3532K;

    /* renamed from: L */
    public final String f3533L;

    /* renamed from: h */
    public final String f3534h;

    /* renamed from: i */
    public final String f3535i;

    /* renamed from: j */
    public final String f3536j;

    /* renamed from: k */
    public final String f3537k;

    /* renamed from: l */
    public final long f3538l;

    /* renamed from: m */
    public final long f3539m;

    /* renamed from: n */
    public final String f3540n;

    /* renamed from: o */
    public final boolean f3541o;

    /* renamed from: p */
    public final boolean f3542p;

    /* renamed from: q */
    public final long f3543q;

    /* renamed from: r */
    public final String f3544r;

    /* renamed from: s */
    @Deprecated
    public final long f3545s;

    /* renamed from: t */
    public final long f3546t;

    /* renamed from: u */
    public final int f3547u;

    /* renamed from: v */
    public final boolean f3548v;

    /* renamed from: w */
    public final boolean f3549w;

    /* renamed from: x */
    public final String f3550x;

    /* renamed from: y */
    public final Boolean f3551y;

    /* renamed from: z */
    public final long f3552z;

    public C0871rc(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9, String str10, String str11, boolean z14, long j16, int i11, String str12, int i12, long j17, String str13) {
        C2394s.m9613f(str);
        this.f3534h = str;
        this.f3535i = TextUtils.isEmpty(str2) ? null : str2;
        this.f3536j = str3;
        this.f3543q = j10;
        this.f3537k = str4;
        this.f3538l = j11;
        this.f3539m = j12;
        this.f3540n = str5;
        this.f3541o = z10;
        this.f3542p = z11;
        this.f3544r = str6;
        this.f3545s = j13;
        this.f3546t = j14;
        this.f3547u = i10;
        this.f3548v = z12;
        this.f3549w = z13;
        this.f3550x = str7;
        this.f3551y = bool;
        this.f3552z = j15;
        this.f3522A = list;
        this.f3523B = null;
        this.f3524C = str9;
        this.f3525D = str10;
        this.f3526E = str11;
        this.f3527F = z14;
        this.f3528G = j16;
        this.f3529H = i11;
        this.f3530I = str12;
        this.f3531J = i12;
        this.f3532K = j17;
        this.f3533L = str13;
    }

    public C0871rc(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9, String str10, String str11, boolean z14, long j16, int i11, String str12, int i12, long j17, String str13) {
        this.f3534h = str;
        this.f3535i = str2;
        this.f3536j = str3;
        this.f3543q = j12;
        this.f3537k = str4;
        this.f3538l = j10;
        this.f3539m = j11;
        this.f3540n = str5;
        this.f3541o = z10;
        this.f3542p = z11;
        this.f3544r = str6;
        this.f3545s = j13;
        this.f3546t = j14;
        this.f3547u = i10;
        this.f3548v = z12;
        this.f3549w = z13;
        this.f3550x = str7;
        this.f3551y = bool;
        this.f3552z = j15;
        this.f3522A = list;
        this.f3523B = str8;
        this.f3524C = str9;
        this.f3525D = str10;
        this.f3526E = str11;
        this.f3527F = z14;
        this.f3528G = j16;
        this.f3529H = i11;
        this.f3530I = str12;
        this.f3531J = i12;
        this.f3532K = j17;
        this.f3533L = str13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 2, this.f3534h, false);
        C2603c.m10456F(parcel, 3, this.f3535i, false);
        C2603c.m10456F(parcel, 4, this.f3536j, false);
        C2603c.m10456F(parcel, 5, this.f3537k, false);
        C2603c.m10489y(parcel, 6, this.f3538l);
        C2603c.m10489y(parcel, 7, this.f3539m);
        C2603c.m10456F(parcel, 8, this.f3540n, false);
        C2603c.m10471g(parcel, 9, this.f3541o);
        C2603c.m10471g(parcel, 10, this.f3542p);
        C2603c.m10489y(parcel, 11, this.f3543q);
        C2603c.m10456F(parcel, 12, this.f3544r, false);
        C2603c.m10489y(parcel, 13, this.f3545s);
        C2603c.m10489y(parcel, 14, this.f3546t);
        C2603c.m10485u(parcel, 15, this.f3547u);
        C2603c.m10471g(parcel, 16, this.f3548v);
        C2603c.m10471g(parcel, 18, this.f3549w);
        C2603c.m10456F(parcel, 19, this.f3550x, false);
        C2603c.m10473i(parcel, 21, this.f3551y, false);
        C2603c.m10489y(parcel, 22, this.f3552z);
        C2603c.m10458H(parcel, 23, this.f3522A, false);
        C2603c.m10456F(parcel, 24, this.f3523B, false);
        C2603c.m10456F(parcel, 25, this.f3524C, false);
        C2603c.m10456F(parcel, 26, this.f3525D, false);
        C2603c.m10456F(parcel, 27, this.f3526E, false);
        C2603c.m10471g(parcel, 28, this.f3527F);
        C2603c.m10489y(parcel, 29, this.f3528G);
        C2603c.m10485u(parcel, 30, this.f3529H);
        C2603c.m10456F(parcel, 31, this.f3530I, false);
        C2603c.m10485u(parcel, 32, this.f3531J);
        C2603c.m10489y(parcel, 34, this.f3532K);
        C2603c.m10456F(parcel, 35, this.f3533L, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
