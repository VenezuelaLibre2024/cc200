package p335x5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p292u6.C4966t;

/* renamed from: x5.i */
/* loaded from: classes.dex */
public final class C5608i extends AbstractC2601a {
    public static final Parcelable.Creator<C5608i> CREATOR = new C5599b0();

    /* renamed from: h */
    public final String f21052h;

    /* renamed from: i */
    public final String f21053i;

    /* renamed from: j */
    public final String f21054j;

    /* renamed from: k */
    public final String f21055k;

    /* renamed from: l */
    public final Uri f21056l;

    /* renamed from: m */
    public final String f21057m;

    /* renamed from: n */
    public final String f21058n;

    /* renamed from: o */
    public final String f21059o;

    /* renamed from: p */
    public final C4966t f21060p;

    public C5608i(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C4966t c4966t) {
        this.f21052h = (String) C2394s.m9619l(str);
        this.f21053i = str2;
        this.f21054j = str3;
        this.f21055k = str4;
        this.f21056l = uri;
        this.f21057m = str5;
        this.f21058n = str6;
        this.f21059o = str7;
        this.f21060p = c4966t;
    }

    /* renamed from: I */
    public String m22597I() {
        return this.f21055k;
    }

    /* renamed from: J */
    public String m22598J() {
        return this.f21054j;
    }

    /* renamed from: K */
    public String m22599K() {
        return this.f21058n;
    }

    /* renamed from: L */
    public String m22600L() {
        return this.f21052h;
    }

    /* renamed from: M */
    public String m22601M() {
        return this.f21057m;
    }

    /* renamed from: N */
    public Uri m22602N() {
        return this.f21056l;
    }

    /* renamed from: O */
    public C4966t m22603O() {
        return this.f21060p;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5608i)) {
            return false;
        }
        C5608i c5608i = (C5608i) obj;
        return C2388q.m9592b(this.f21052h, c5608i.f21052h) && C2388q.m9592b(this.f21053i, c5608i.f21053i) && C2388q.m9592b(this.f21054j, c5608i.f21054j) && C2388q.m9592b(this.f21055k, c5608i.f21055k) && C2388q.m9592b(this.f21056l, c5608i.f21056l) && C2388q.m9592b(this.f21057m, c5608i.f21057m) && C2388q.m9592b(this.f21058n, c5608i.f21058n) && C2388q.m9592b(this.f21059o, c5608i.f21059o) && C2388q.m9592b(this.f21060p, c5608i.f21060p);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f21052h, this.f21053i, this.f21054j, this.f21055k, this.f21056l, this.f21057m, this.f21058n, this.f21059o, this.f21060p);
    }

    @Deprecated
    /* renamed from: m */
    public String m22604m() {
        return this.f21059o;
    }

    /* renamed from: s */
    public String m22605s() {
        return this.f21053i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, m22600L(), false);
        C2603c.m10456F(parcel, 2, m22605s(), false);
        C2603c.m10456F(parcel, 3, m22598J(), false);
        C2603c.m10456F(parcel, 4, m22597I(), false);
        C2603c.m10454D(parcel, 5, m22602N(), i10, false);
        C2603c.m10456F(parcel, 6, m22601M(), false);
        C2603c.m10456F(parcel, 7, m22599K(), false);
        C2603c.m10456F(parcel, 8, m22604m(), false);
        C2603c.m10454D(parcel, 9, m22603O(), i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
