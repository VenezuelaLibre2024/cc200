package p367z6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: z6.a0 */
/* loaded from: classes.dex */
public final class C5997a0 extends AbstractC2601a {
    public static final Parcelable.Creator<C5997a0> CREATOR = new C6013i0();

    /* renamed from: h */
    public final int f22384h;

    /* renamed from: i */
    public final int f22385i;

    /* renamed from: j */
    public final byte[] f22386j;

    public C5997a0(int i10, int i11, byte[] bArr) {
        this.f22384h = i10;
        this.f22385i = i11;
        this.f22386j = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f22384h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 2, i11);
        C2603c.m10485u(parcel, 3, this.f22385i);
        C2603c.m10476l(parcel, 4, this.f22386j, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
