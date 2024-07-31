package p108h6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: h6.f */
/* loaded from: classes.dex */
public class C2355f extends AbstractC2601a {
    public static final Parcelable.Creator<C2355f> CREATOR = new C2381n1();

    /* renamed from: h */
    public final C2400u f9606h;

    /* renamed from: i */
    public final boolean f9607i;

    /* renamed from: j */
    public final boolean f9608j;

    /* renamed from: k */
    public final int[] f9609k;

    /* renamed from: l */
    public final int f9610l;

    /* renamed from: m */
    public final int[] f9611m;

    public C2355f(C2400u c2400u, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f9606h = c2400u;
        this.f9607i = z10;
        this.f9608j = z11;
        this.f9609k = iArr;
        this.f9610l = i10;
        this.f9611m = iArr2;
    }

    /* renamed from: I */
    public int m9535I() {
        return this.f9610l;
    }

    /* renamed from: J */
    public int[] m9536J() {
        return this.f9609k;
    }

    /* renamed from: K */
    public int[] m9537K() {
        return this.f9611m;
    }

    /* renamed from: L */
    public boolean m9538L() {
        return this.f9607i;
    }

    /* renamed from: M */
    public boolean m9539M() {
        return this.f9608j;
    }

    /* renamed from: N */
    public final C2400u m9540N() {
        return this.f9606h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 1, this.f9606h, i10, false);
        C2603c.m10471g(parcel, 2, m9538L());
        C2603c.m10471g(parcel, 3, m9539M());
        C2603c.m10486v(parcel, 4, m9536J(), false);
        C2603c.m10485u(parcel, 5, m9535I());
        C2603c.m10486v(parcel, 6, m9537K(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
