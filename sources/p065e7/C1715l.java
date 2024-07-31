package p065e7;

import android.os.Parcel;
import android.os.Parcelable;
import p064e6.C1667b;
import p108h6.C2398t0;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: e7.l */
/* loaded from: classes.dex */
public final class C1715l extends AbstractC2601a {
    public static final Parcelable.Creator<C1715l> CREATOR = new C1716m();

    /* renamed from: h */
    public final int f6309h;

    /* renamed from: i */
    public final C1667b f6310i;

    /* renamed from: j */
    public final C2398t0 f6311j;

    public C1715l(int i10, C1667b c1667b, C2398t0 c2398t0) {
        this.f6309h = i10;
        this.f6310i = c1667b;
        this.f6311j = c2398t0;
    }

    /* renamed from: I */
    public final C1667b m6758I() {
        return this.f6310i;
    }

    /* renamed from: J */
    public final C2398t0 m6759J() {
        return this.f6311j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f6309h);
        C2603c.m10454D(parcel, 2, this.f6310i, i10, false);
        C2603c.m10454D(parcel, 3, this.f6311j, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
