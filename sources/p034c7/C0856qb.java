package p034c7;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: c7.qb */
/* loaded from: classes.dex */
public final class C0856qb extends AbstractC2601a {
    public static final Parcelable.Creator<C0856qb> CREATOR = new C0898tb();

    /* renamed from: h */
    public final String f3485h;

    /* renamed from: i */
    public final long f3486i;

    /* renamed from: j */
    public final int f3487j;

    public C0856qb(String str, long j10, int i10) {
        this.f3485h = str;
        this.f3486i = j10;
        this.f3487j = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, this.f3485h, false);
        C2603c.m10489y(parcel, 2, this.f3486i);
        C2603c.m10485u(parcel, 3, this.f3487j);
        C2603c.m10466b(parcel, m10465a);
    }
}
