package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.d2 */
/* loaded from: classes.dex */
public final class C4916d2 extends AbstractC2601a {
    public static final Parcelable.Creator<C4916d2> CREATOR = new C4920e2();

    /* renamed from: h */
    public final boolean f18548h;

    public C4916d2(boolean z10) {
        this.f18548h = ((Boolean) C2394s.m9619l(Boolean.valueOf(z10))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4916d2) && this.f18548h == ((C4916d2) obj).f18548h;
    }

    public final int hashCode() {
        return C2388q.m9593c(Boolean.valueOf(this.f18548h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10471g(parcel, 1, this.f18548h);
        C2603c.m10466b(parcel, m10465a);
    }
}
