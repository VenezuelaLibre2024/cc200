package p366z5;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: z5.c */
/* loaded from: classes.dex */
public class C5993c extends AbstractC2601a {
    public static final Parcelable.Creator<C5993c> CREATOR = new C5995e();

    /* renamed from: h */
    public final int f22378h;

    /* renamed from: i */
    public final PendingIntent f22379i;

    /* renamed from: j */
    public final int f22380j;

    /* renamed from: k */
    public final byte[] f22381k;

    /* renamed from: l */
    public final int f22382l;

    /* renamed from: m */
    public final Bundle f22383m;

    public C5993c(int i10, int i11, PendingIntent pendingIntent, int i12, Bundle bundle, byte[] bArr) {
        this.f22382l = i10;
        this.f22378h = i11;
        this.f22380j = i12;
        this.f22383m = bundle;
        this.f22381k = bArr;
        this.f22379i = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f22378h);
        C2603c.m10454D(parcel, 2, this.f22379i, i10, false);
        C2603c.m10485u(parcel, 3, this.f22380j);
        C2603c.m10474j(parcel, 4, this.f22383m, false);
        C2603c.m10476l(parcel, 5, this.f22381k, false);
        C2603c.m10485u(parcel, 1000, this.f22382l);
        C2603c.m10466b(parcel, m10465a);
    }
}
