package p034c7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: c7.k */
/* loaded from: classes.dex */
public final class C0760k extends AbstractC2601a {
    public static final Parcelable.Creator<C0760k> CREATOR = new C0802n();

    /* renamed from: h */
    public final Bundle f3206h;

    public C0760k(Bundle bundle) {
        this.f3206h = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10474j(parcel, 1, this.f3206h, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
