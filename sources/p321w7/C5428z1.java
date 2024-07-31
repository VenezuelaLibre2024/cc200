package p321w7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.p377firebaseauthapi.zzags;
import com.google.android.gms.internal.p377firebaseauthapi.zzah;
import p108h6.C2394s;
import p125i6.C2603c;

/* renamed from: w7.z1 */
/* loaded from: classes.dex */
public class C5428z1 extends AbstractC5388m0 {
    public static final Parcelable.Creator<C5428z1> CREATOR = new C5343a2();

    /* renamed from: h */
    public final String f20254h;

    /* renamed from: i */
    public final String f20255i;

    /* renamed from: j */
    public final String f20256j;

    /* renamed from: k */
    public final zzags f20257k;

    /* renamed from: l */
    public final String f20258l;

    /* renamed from: m */
    public final String f20259m;

    /* renamed from: n */
    public final String f20260n;

    public C5428z1(String str, String str2, String str3, zzags zzagsVar, String str4, String str5, String str6) {
        this.f20254h = zzah.zzb(str);
        this.f20255i = str2;
        this.f20256j = str3;
        this.f20257k = zzagsVar;
        this.f20258l = str4;
        this.f20259m = str5;
        this.f20260n = str6;
    }

    /* renamed from: O */
    public static zzags m21582O(C5428z1 c5428z1, String str) {
        C2394s.m9619l(c5428z1);
        zzags zzagsVar = c5428z1.f20257k;
        return zzagsVar != null ? zzagsVar : new zzags(c5428z1.mo21526M(), c5428z1.mo21525L(), c5428z1.mo21462I(), null, c5428z1.mo21527N(), null, str, c5428z1.f20258l, c5428z1.f20260n);
    }

    /* renamed from: P */
    public static C5428z1 m21583P(zzags zzagsVar) {
        C2394s.m9620m(zzagsVar, "Must specify a non-null webSignInCredential");
        return new C5428z1(null, null, null, zzagsVar, null, null, null);
    }

    /* renamed from: Q */
    public static C5428z1 m21584Q(String str, String str2, String str3, String str4) {
        C2394s.m9614g(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new C5428z1(str, str2, str3, null, null, null, str4);
    }

    /* renamed from: R */
    public static C5428z1 m21585R(String str, String str2, String str3, String str4, String str5) {
        C2394s.m9614g(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new C5428z1(str, str2, str3, null, str4, str5, null);
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: I */
    public String mo21462I() {
        return this.f20254h;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: J */
    public String mo21463J() {
        return this.f20254h;
    }

    @Override // p321w7.AbstractC5368h
    /* renamed from: K */
    public final AbstractC5368h mo21464K() {
        return new C5428z1(this.f20254h, this.f20255i, this.f20256j, this.f20257k, this.f20258l, this.f20259m, this.f20260n);
    }

    @Override // p321w7.AbstractC5388m0
    /* renamed from: L */
    public String mo21525L() {
        return this.f20256j;
    }

    @Override // p321w7.AbstractC5388m0
    /* renamed from: M */
    public String mo21526M() {
        return this.f20255i;
    }

    @Override // p321w7.AbstractC5388m0
    /* renamed from: N */
    public String mo21527N() {
        return this.f20259m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, mo21462I(), false);
        C2603c.m10456F(parcel, 2, mo21526M(), false);
        C2603c.m10456F(parcel, 3, mo21525L(), false);
        C2603c.m10454D(parcel, 4, this.f20257k, i10, false);
        C2603c.m10456F(parcel, 5, this.f20258l, false);
        C2603c.m10456F(parcel, 6, mo21527N(), false);
        C2603c.m10456F(parcel, 7, this.f20260n, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
