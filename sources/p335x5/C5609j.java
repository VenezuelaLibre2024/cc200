package p335x5;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: x5.j */
/* loaded from: classes.dex */
public class C5609j extends AbstractC2601a {
    public static final Parcelable.Creator<C5609j> CREATOR = new C5603d0();

    /* renamed from: h */
    public final String f21061h;

    /* renamed from: i */
    public final String f21062i;

    public C5609j(String str, String str2) {
        this.f21061h = C2394s.m9614g(((String) C2394s.m9620m(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f21062i = C2394s.m9613f(str2);
    }

    /* renamed from: I */
    public String m22606I() {
        return this.f21061h;
    }

    /* renamed from: J */
    public String m22607J() {
        return this.f21062i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5609j)) {
            return false;
        }
        C5609j c5609j = (C5609j) obj;
        return C2388q.m9592b(this.f21061h, c5609j.f21061h) && C2388q.m9592b(this.f21062i, c5609j.f21062i);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f21061h, this.f21062i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, m22606I(), false);
        C2603c.m10456F(parcel, 2, m22607J(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
