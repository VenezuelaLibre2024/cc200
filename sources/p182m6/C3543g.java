package p182m6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p182m6.AbstractC3537a;

/* renamed from: m6.g */
/* loaded from: classes.dex */
public final class C3543g extends AbstractC2601a {
    public static final Parcelable.Creator<C3543g> CREATOR = new C3541e();

    /* renamed from: h */
    public final int f12440h;

    /* renamed from: i */
    public final String f12441i;

    /* renamed from: j */
    public final AbstractC3537a.a f12442j;

    public C3543g(int i10, String str, AbstractC3537a.a aVar) {
        this.f12440h = i10;
        this.f12441i = str;
        this.f12442j = aVar;
    }

    public C3543g(String str, AbstractC3537a.a aVar) {
        this.f12440h = 1;
        this.f12441i = str;
        this.f12442j = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f12440h);
        C2603c.m10456F(parcel, 2, this.f12441i, false);
        C2603c.m10454D(parcel, 3, this.f12442j, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
