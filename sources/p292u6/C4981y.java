package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.y */
/* loaded from: classes.dex */
public class C4981y extends AbstractC2601a {
    public static final Parcelable.Creator<C4981y> CREATOR = new C4982y0();

    /* renamed from: h */
    public final String f18663h;

    /* renamed from: i */
    public final String f18664i;

    /* renamed from: j */
    public final String f18665j;

    public C4981y(String str, String str2, String str3) {
        this.f18663h = (String) C2394s.m9619l(str);
        this.f18664i = (String) C2394s.m9619l(str2);
        this.f18665j = str3;
    }

    /* renamed from: I */
    public String m19546I() {
        return this.f18665j;
    }

    /* renamed from: J */
    public String m19547J() {
        return this.f18663h;
    }

    /* renamed from: K */
    public String m19548K() {
        return this.f18664i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4981y)) {
            return false;
        }
        C4981y c4981y = (C4981y) obj;
        return C2388q.m9592b(this.f18663h, c4981y.f18663h) && C2388q.m9592b(this.f18664i, c4981y.f18664i) && C2388q.m9592b(this.f18665j, c4981y.f18665j);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f18663h, this.f18664i, this.f18665j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 2, m19547J(), false);
        C2603c.m10456F(parcel, 3, m19548K(), false);
        C2603c.m10456F(parcel, 4, m19546I(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
