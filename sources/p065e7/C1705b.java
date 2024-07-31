package p065e7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p079f6.InterfaceC1853m;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: e7.b */
/* loaded from: classes.dex */
public final class C1705b extends AbstractC2601a implements InterfaceC1853m {
    public static final Parcelable.Creator<C1705b> CREATOR = new C1706c();

    /* renamed from: h */
    public final int f6302h;

    /* renamed from: i */
    public int f6303i;

    /* renamed from: j */
    public Intent f6304j;

    public C1705b() {
        this(2, 0, null);
    }

    public C1705b(int i10, int i11, Intent intent) {
        this.f6302h = i10;
        this.f6303i = i11;
        this.f6304j = intent;
    }

    @Override // p079f6.InterfaceC1853m
    public final Status getStatus() {
        return this.f6303i == 0 ? Status.f4470m : Status.f4474q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f6302h);
        C2603c.m10485u(parcel, 2, this.f6303i);
        C2603c.m10454D(parcel, 3, this.f6304j, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
