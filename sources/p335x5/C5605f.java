package p335x5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: x5.f */
/* loaded from: classes.dex */
public class C5605f extends AbstractC2601a {
    public static final Parcelable.Creator<C5605f> CREATOR = new C5624y();

    /* renamed from: h */
    public final PendingIntent f21044h;

    public C5605f(PendingIntent pendingIntent) {
        this.f21044h = pendingIntent;
    }

    /* renamed from: I */
    public PendingIntent m22588I() {
        return this.f21044h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5605f) {
            return C2388q.m9592b(this.f21044h, ((C5605f) obj).f21044h);
        }
        return false;
    }

    public int hashCode() {
        return C2388q.m9593c(this.f21044h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 1, m22588I(), i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
