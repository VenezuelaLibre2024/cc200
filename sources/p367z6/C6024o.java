package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: z6.o */
/* loaded from: classes.dex */
public class C6024o extends AbstractC2601a {

    /* renamed from: h */
    public final int f22446h;

    /* renamed from: i */
    public final Float f22447i;

    /* renamed from: j */
    public static final String f22445j = C6024o.class.getSimpleName();
    public static final Parcelable.Creator<C6024o> CREATOR = new C6037u0();

    public C6024o(int i10, Float f10) {
        boolean z10 = false;
        if (i10 == 1 || (f10 != null && f10.floatValue() >= 0.0f)) {
            z10 = true;
        }
        C2394s.m9609b(z10, "Invalid PatternItem: type=" + i10 + " length=" + f10);
        this.f22446h = i10;
        this.f22447i = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6024o)) {
            return false;
        }
        C6024o c6024o = (C6024o) obj;
        return this.f22446h == c6024o.f22446h && C2388q.m9592b(this.f22447i, c6024o.f22447i);
    }

    public int hashCode() {
        return C2388q.m9593c(Integer.valueOf(this.f22446h), this.f22447i);
    }

    public String toString() {
        return "[PatternItem: type=" + this.f22446h + " length=" + this.f22447i + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f22446h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 2, i11);
        C2603c.m10483s(parcel, 3, this.f22447i, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
