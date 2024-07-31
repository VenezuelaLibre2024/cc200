package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.h0 */
/* loaded from: classes.dex */
public class C4930h0 extends AbstractC2601a {
    public static final Parcelable.Creator<C4930h0> CREATOR = new C4941k1();

    /* renamed from: h */
    public final int f18574h;

    /* renamed from: i */
    public final short f18575i;

    /* renamed from: j */
    public final short f18576j;

    public C4930h0(int i10, short s10, short s11) {
        this.f18574h = i10;
        this.f18575i = s10;
        this.f18576j = s11;
    }

    /* renamed from: I */
    public short m19493I() {
        return this.f18575i;
    }

    /* renamed from: J */
    public short m19494J() {
        return this.f18576j;
    }

    /* renamed from: K */
    public int m19495K() {
        return this.f18574h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4930h0)) {
            return false;
        }
        C4930h0 c4930h0 = (C4930h0) obj;
        return this.f18574h == c4930h0.f18574h && this.f18575i == c4930h0.f18575i && this.f18576j == c4930h0.f18576j;
    }

    public int hashCode() {
        return C2388q.m9593c(Integer.valueOf(this.f18574h), Short.valueOf(this.f18575i), Short.valueOf(this.f18576j));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, m19495K());
        C2603c.m10455E(parcel, 2, m19493I());
        C2603c.m10455E(parcel, 3, m19494J());
        C2603c.m10466b(parcel, m10465a);
    }
}
