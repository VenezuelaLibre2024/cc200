package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.f */
/* loaded from: classes.dex */
public class C4921f extends AbstractC2601a {
    public static final Parcelable.Creator<C4921f> CREATOR = new C4950n1();

    /* renamed from: h */
    public final boolean f18562h;

    public C4921f(boolean z10) {
        this.f18562h = z10;
    }

    /* renamed from: I */
    public boolean m19481I() {
        return this.f18562h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4921f) && this.f18562h == ((C4921f) obj).f18562h;
    }

    public int hashCode() {
        return C2388q.m9593c(Boolean.valueOf(this.f18562h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10471g(parcel, 1, m19481I());
        C2603c.m10466b(parcel, m10465a);
    }
}
