package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: z6.z */
/* loaded from: classes.dex */
public final class C6046z extends AbstractC2601a {
    public static final Parcelable.Creator<C6046z> CREATOR = new C6011h0();

    /* renamed from: h */
    public final C6044y f22491h;

    /* renamed from: i */
    public final double f22492i;

    public C6046z(C6044y c6044y, double d10) {
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.f22491h = c6044y;
        this.f22492i = d10;
    }

    /* renamed from: I */
    public double m24248I() {
        return this.f22492i;
    }

    /* renamed from: J */
    public C6044y m24249J() {
        return this.f22491h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 2, m24249J(), i10, false);
        C2603c.m10478n(parcel, 3, m24248I());
        C2603c.m10466b(parcel, m10465a);
    }
}
