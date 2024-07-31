package p065e7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import p079f6.InterfaceC1853m;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: e7.h */
/* loaded from: classes.dex */
public final class C1711h extends AbstractC2601a implements InterfaceC1853m {
    public static final Parcelable.Creator<C1711h> CREATOR = new C1712i();

    /* renamed from: h */
    public final List f6305h;

    /* renamed from: i */
    public final String f6306i;

    public C1711h(List list, String str) {
        this.f6305h = list;
        this.f6306i = str;
    }

    @Override // p079f6.InterfaceC1853m
    public final Status getStatus() {
        return this.f6306i != null ? Status.f4470m : Status.f4474q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10458H(parcel, 1, this.f6305h, false);
        C2603c.m10456F(parcel, 2, this.f6306i, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
