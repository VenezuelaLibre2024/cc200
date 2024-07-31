package p108h6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p064e6.C1667b;
import p108h6.InterfaceC2370k;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: h6.t0 */
/* loaded from: classes.dex */
public final class C2398t0 extends AbstractC2601a {
    public static final Parcelable.Creator<C2398t0> CREATOR = new C2401u0();

    /* renamed from: h */
    public final int f9701h;

    /* renamed from: i */
    public final IBinder f9702i;

    /* renamed from: j */
    public final C1667b f9703j;

    /* renamed from: k */
    public final boolean f9704k;

    /* renamed from: l */
    public final boolean f9705l;

    public C2398t0(int i10, IBinder iBinder, C1667b c1667b, boolean z10, boolean z11) {
        this.f9701h = i10;
        this.f9702i = iBinder;
        this.f9703j = c1667b;
        this.f9704k = z10;
        this.f9705l = z11;
    }

    /* renamed from: I */
    public final C1667b m9628I() {
        return this.f9703j;
    }

    /* renamed from: J */
    public final InterfaceC2370k m9629J() {
        IBinder iBinder = this.f9702i;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC2370k.a.m9579c(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2398t0)) {
            return false;
        }
        C2398t0 c2398t0 = (C2398t0) obj;
        return this.f9703j.equals(c2398t0.f9703j) && C2388q.m9592b(m9629J(), c2398t0.m9629J());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f9701h);
        C2603c.m10484t(parcel, 2, this.f9702i, false);
        C2603c.m10454D(parcel, 3, this.f9703j, i10, false);
        C2603c.m10471g(parcel, 4, this.f9704k);
        C2603c.m10471g(parcel, 5, this.f9705l);
        C2603c.m10466b(parcel, m10465a);
    }
}
