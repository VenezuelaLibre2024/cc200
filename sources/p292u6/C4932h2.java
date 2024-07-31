package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.h2 */
/* loaded from: classes.dex */
public final class C4932h2 extends AbstractC2601a {
    public static final Parcelable.Creator<C4932h2> CREATOR = new C4937j0();

    /* renamed from: h */
    public final boolean f18582h;

    public C4932h2(boolean z10) {
        this.f18582h = ((Boolean) C2394s.m9619l(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4932h2) && this.f18582h == ((C4932h2) obj).f18582h;
    }

    public final int hashCode() {
        return C2388q.m9593c(Boolean.valueOf(this.f18582h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10471g(parcel, 1, this.f18582h);
        C2603c.m10466b(parcel, m10465a);
    }
}
