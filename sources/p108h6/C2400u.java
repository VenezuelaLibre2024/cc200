package p108h6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: h6.u */
/* loaded from: classes.dex */
public class C2400u extends AbstractC2601a {
    public static final Parcelable.Creator<C2400u> CREATOR = new C2354e1();

    /* renamed from: h */
    public final int f9714h;

    /* renamed from: i */
    public final boolean f9715i;

    /* renamed from: j */
    public final boolean f9716j;

    /* renamed from: k */
    public final int f9717k;

    /* renamed from: l */
    public final int f9718l;

    public C2400u(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f9714h = i10;
        this.f9715i = z10;
        this.f9716j = z11;
        this.f9717k = i11;
        this.f9718l = i12;
    }

    /* renamed from: I */
    public int m9635I() {
        return this.f9717k;
    }

    /* renamed from: J */
    public int m9636J() {
        return this.f9718l;
    }

    /* renamed from: K */
    public boolean m9637K() {
        return this.f9715i;
    }

    /* renamed from: L */
    public boolean m9638L() {
        return this.f9716j;
    }

    /* renamed from: M */
    public int m9639M() {
        return this.f9714h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, m9639M());
        C2603c.m10471g(parcel, 2, m9637K());
        C2603c.m10471g(parcel, 3, m9638L());
        C2603c.m10485u(parcel, 4, m9635I());
        C2603c.m10485u(parcel, 5, m9636J());
        C2603c.m10466b(parcel, m10465a);
    }
}
