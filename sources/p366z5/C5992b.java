package p366z5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: z5.b */
/* loaded from: classes.dex */
public class C5992b extends AbstractC2601a {
    public static final Parcelable.Creator<C5992b> CREATOR = new C5994d();

    /* renamed from: n */
    public static final int f22363n = 0;

    /* renamed from: o */
    public static final int f22364o = 1;

    /* renamed from: p */
    public static final int f22365p = 2;

    /* renamed from: q */
    public static final int f22366q = 3;

    /* renamed from: r */
    public static final int f22367r = 4;

    /* renamed from: s */
    public static final int f22368s = 5;

    /* renamed from: t */
    public static final int f22369t = 6;

    /* renamed from: u */
    public static final int f22370u = 7;

    /* renamed from: v */
    public static final int f22371v = 7;

    /* renamed from: h */
    public final String f22372h;

    /* renamed from: i */
    public final int f22373i;

    /* renamed from: j */
    public final long f22374j;

    /* renamed from: k */
    public final byte[] f22375k;

    /* renamed from: l */
    public final int f22376l;

    /* renamed from: m */
    public final Bundle f22377m;

    public C5992b(int i10, String str, int i11, long j10, byte[] bArr, Bundle bundle) {
        this.f22376l = i10;
        this.f22372h = str;
        this.f22373i = i11;
        this.f22374j = j10;
        this.f22375k = bArr;
        this.f22377m = bundle;
    }

    public String toString() {
        return "ProxyRequest[ url: " + this.f22372h + ", method: " + this.f22373i + " ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, this.f22372h, false);
        C2603c.m10485u(parcel, 2, this.f22373i);
        C2603c.m10489y(parcel, 3, this.f22374j);
        C2603c.m10476l(parcel, 4, this.f22375k, false);
        C2603c.m10474j(parcel, 5, this.f22377m, false);
        C2603c.m10485u(parcel, 1000, this.f22376l);
        C2603c.m10466b(parcel, m10465a);
    }
}
