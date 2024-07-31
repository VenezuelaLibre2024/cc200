package p335x5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: x5.c */
/* loaded from: classes.dex */
public final class C5600c extends AbstractC2601a {
    public static final Parcelable.Creator<C5600c> CREATOR = new C5615p();

    /* renamed from: h */
    public final PendingIntent f21030h;

    public C5600c(PendingIntent pendingIntent) {
        this.f21030h = (PendingIntent) C2394s.m9619l(pendingIntent);
    }

    /* renamed from: I */
    public PendingIntent m22574I() {
        return this.f21030h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 1, m22574I(), i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
