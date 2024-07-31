package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.t */
/* loaded from: classes.dex */
public class C4966t extends AbstractC2601a {
    public static final Parcelable.Creator<C4966t> CREATOR = new C4970u0();

    /* renamed from: h */
    public final String f18629h;

    /* renamed from: i */
    public final String f18630i;

    /* renamed from: j */
    public final byte[] f18631j;

    /* renamed from: k */
    public final C4929h f18632k;

    /* renamed from: l */
    public final C4925g f18633l;

    /* renamed from: m */
    public final C4933i f18634m;

    /* renamed from: n */
    public final C4917e f18635n;

    /* renamed from: o */
    public final String f18636o;

    public C4966t(String str, String str2, byte[] bArr, C4929h c4929h, C4925g c4925g, C4933i c4933i, C4917e c4917e, String str3) {
        boolean z10 = true;
        if ((c4929h == null || c4925g != null || c4933i != null) && ((c4929h != null || c4925g == null || c4933i != null) && (c4929h != null || c4925g != null || c4933i == null))) {
            z10 = false;
        }
        C2394s.m9608a(z10);
        this.f18629h = str;
        this.f18630i = str2;
        this.f18631j = bArr;
        this.f18632k = c4929h;
        this.f18633l = c4925g;
        this.f18634m = c4933i;
        this.f18635n = c4917e;
        this.f18636o = str3;
    }

    /* renamed from: I */
    public String m19518I() {
        return this.f18636o;
    }

    /* renamed from: J */
    public C4917e m19519J() {
        return this.f18635n;
    }

    /* renamed from: K */
    public String m19520K() {
        return this.f18629h;
    }

    /* renamed from: L */
    public byte[] m19521L() {
        return this.f18631j;
    }

    /* renamed from: M */
    public String m19522M() {
        return this.f18630i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4966t)) {
            return false;
        }
        C4966t c4966t = (C4966t) obj;
        return C2388q.m9592b(this.f18629h, c4966t.f18629h) && C2388q.m9592b(this.f18630i, c4966t.f18630i) && Arrays.equals(this.f18631j, c4966t.f18631j) && C2388q.m9592b(this.f18632k, c4966t.f18632k) && C2388q.m9592b(this.f18633l, c4966t.f18633l) && C2388q.m9592b(this.f18634m, c4966t.f18634m) && C2388q.m9592b(this.f18635n, c4966t.f18635n) && C2388q.m9592b(this.f18636o, c4966t.f18636o);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f18629h, this.f18630i, this.f18631j, this.f18633l, this.f18632k, this.f18634m, this.f18635n, this.f18636o);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, m19520K(), false);
        C2603c.m10456F(parcel, 2, m19522M(), false);
        C2603c.m10476l(parcel, 3, m19521L(), false);
        C2603c.m10454D(parcel, 4, this.f18632k, i10, false);
        C2603c.m10454D(parcel, 5, this.f18633l, i10, false);
        C2603c.m10454D(parcel, 6, this.f18634m, i10, false);
        C2603c.m10454D(parcel, 7, m19519J(), i10, false);
        C2603c.m10456F(parcel, 8, m19518I(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
