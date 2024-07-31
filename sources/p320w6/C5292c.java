package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: w6.c */
/* loaded from: classes.dex */
public class C5292c extends AbstractC2601a {
    public static final Parcelable.Creator<C5292c> CREATOR = new C5305i0();

    /* renamed from: h */
    public final int f20057h;

    /* renamed from: i */
    public final int f20058i;

    public C5292c(int i10, int i11) {
        this.f20057h = i10;
        this.f20058i = i11;
    }

    /* renamed from: I */
    public int m21364I() {
        return this.f20057h;
    }

    /* renamed from: J */
    public int m21365J() {
        return this.f20058i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5292c)) {
            return false;
        }
        C5292c c5292c = (C5292c) obj;
        return this.f20057h == c5292c.f20057h && this.f20058i == c5292c.f20058i;
    }

    public int hashCode() {
        return C2388q.m9593c(Integer.valueOf(this.f20057h), Integer.valueOf(this.f20058i));
    }

    public String toString() {
        return "ActivityTransition [mActivityType=" + this.f20057h + ", mTransitionType=" + this.f20058i + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C2394s.m9619l(parcel);
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, m21364I());
        C2603c.m10485u(parcel, 2, m21365J());
        C2603c.m10466b(parcel, m10465a);
    }
}
