package p169l6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: l6.d */
/* loaded from: classes.dex */
public final class C3437d extends AbstractC2601a {
    public static final Parcelable.Creator<C3437d> CREATOR = new C3439f();

    /* renamed from: h */
    public final int f12080h;

    /* renamed from: i */
    public final String f12081i;

    /* renamed from: j */
    public final int f12082j;

    public C3437d(int i10, String str, int i11) {
        this.f12080h = i10;
        this.f12081i = str;
        this.f12082j = i11;
    }

    public C3437d(String str, int i10) {
        this.f12080h = 1;
        this.f12081i = str;
        this.f12082j = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f12080h);
        C2603c.m10456F(parcel, 2, this.f12081i, false);
        C2603c.m10485u(parcel, 3, this.f12082j);
        C2603c.m10466b(parcel, m10465a);
    }
}
