package p335x5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: x5.h */
/* loaded from: classes.dex */
public class C5607h extends AbstractC2601a {
    public static final Parcelable.Creator<C5607h> CREATOR = new C5597a0();

    /* renamed from: h */
    public final PendingIntent f21051h;

    public C5607h(PendingIntent pendingIntent) {
        this.f21051h = (PendingIntent) C2394s.m9619l(pendingIntent);
    }

    /* renamed from: I */
    public PendingIntent m22596I() {
        return this.f21051h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5607h) {
            return C2388q.m9592b(this.f21051h, ((C5607h) obj).f21051h);
        }
        return false;
    }

    public int hashCode() {
        return C2388q.m9593c(this.f21051h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 1, m22596I(), i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
