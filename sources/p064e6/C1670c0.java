package p064e6;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p252r6.BinderC4309d;
import p252r6.InterfaceC4307b;

/* renamed from: e6.c0 */
/* loaded from: classes.dex */
public final class C1670c0 extends AbstractC2601a {
    public static final Parcelable.Creator<C1670c0> CREATOR = new C1672d0();

    /* renamed from: h */
    public final String f6243h;

    /* renamed from: i */
    public final boolean f6244i;

    /* renamed from: j */
    public final boolean f6245j;

    /* renamed from: k */
    public final Context f6246k;

    /* renamed from: l */
    public final boolean f6247l;

    /* renamed from: m */
    public final boolean f6248m;

    public C1670c0(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f6243h = str;
        this.f6244i = z10;
        this.f6245j = z11;
        this.f6246k = (Context) BinderC4309d.m16571e(InterfaceC4307b.a.m16570c(iBinder));
        this.f6247l = z12;
        this.f6248m = z13;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [r6.b, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6243h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, str, false);
        C2603c.m10471g(parcel, 2, this.f6244i);
        C2603c.m10471g(parcel, 3, this.f6245j);
        C2603c.m10484t(parcel, 4, BinderC4309d.m16572g(this.f6246k), false);
        C2603c.m10471g(parcel, 5, this.f6247l);
        C2603c.m10471g(parcel, 6, this.f6248m);
        C2603c.m10466b(parcel, m10465a);
    }
}
