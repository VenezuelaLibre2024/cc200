package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.f0 */
/* loaded from: classes.dex */
public class C4922f0 extends AbstractC2601a {
    public static final Parcelable.Creator<C4922f0> CREATOR = new C4919e1();

    /* renamed from: h */
    public final boolean f18563h;

    public C4922f0(boolean z10) {
        this.f18563h = z10;
    }

    /* renamed from: I */
    public boolean m19482I() {
        return this.f18563h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4922f0) && this.f18563h == ((C4922f0) obj).f18563h;
    }

    public int hashCode() {
        return C2388q.m9593c(Boolean.valueOf(this.f18563h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10471g(parcel, 1, m19482I());
        C2603c.m10466b(parcel, m10465a);
    }
}
