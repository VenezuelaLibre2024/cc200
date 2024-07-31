package p034c7;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: c7.f */
/* loaded from: classes.dex */
public final class C0690f extends AbstractC2601a {
    public static final Parcelable.Creator<C0690f> CREATOR = new C0676e();

    /* renamed from: h */
    public String f2907h;

    /* renamed from: i */
    public String f2908i;

    /* renamed from: j */
    public C0787lc f2909j;

    /* renamed from: k */
    public long f2910k;

    /* renamed from: l */
    public boolean f2911l;

    /* renamed from: m */
    public String f2912m;

    /* renamed from: n */
    public C0705g0 f2913n;

    /* renamed from: o */
    public long f2914o;

    /* renamed from: p */
    public C0705g0 f2915p;

    /* renamed from: q */
    public long f2916q;

    /* renamed from: r */
    public C0705g0 f2917r;

    public C0690f(C0690f c0690f) {
        C2394s.m9619l(c0690f);
        this.f2907h = c0690f.f2907h;
        this.f2908i = c0690f.f2908i;
        this.f2909j = c0690f.f2909j;
        this.f2910k = c0690f.f2910k;
        this.f2911l = c0690f.f2911l;
        this.f2912m = c0690f.f2912m;
        this.f2913n = c0690f.f2913n;
        this.f2914o = c0690f.f2914o;
        this.f2915p = c0690f.f2915p;
        this.f2916q = c0690f.f2916q;
        this.f2917r = c0690f.f2917r;
    }

    public C0690f(String str, String str2, C0787lc c0787lc, long j10, boolean z10, String str3, C0705g0 c0705g0, long j11, C0705g0 c0705g02, long j12, C0705g0 c0705g03) {
        this.f2907h = str;
        this.f2908i = str2;
        this.f2909j = c0787lc;
        this.f2910k = j10;
        this.f2911l = z10;
        this.f2912m = str3;
        this.f2913n = c0705g0;
        this.f2914o = j11;
        this.f2915p = c0705g02;
        this.f2916q = j12;
        this.f2917r = c0705g03;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 2, this.f2907h, false);
        C2603c.m10456F(parcel, 3, this.f2908i, false);
        C2603c.m10454D(parcel, 4, this.f2909j, i10, false);
        C2603c.m10489y(parcel, 5, this.f2910k);
        C2603c.m10471g(parcel, 6, this.f2911l);
        C2603c.m10456F(parcel, 7, this.f2912m, false);
        C2603c.m10454D(parcel, 8, this.f2913n, i10, false);
        C2603c.m10489y(parcel, 9, this.f2914o);
        C2603c.m10454D(parcel, 10, this.f2915p, i10, false);
        C2603c.m10489y(parcel, 11, this.f2916q);
        C2603c.m10454D(parcel, 12, this.f2917r, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
