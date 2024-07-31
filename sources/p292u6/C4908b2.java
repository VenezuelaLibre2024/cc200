package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.b2 */
/* loaded from: classes.dex */
public final class C4908b2 extends AbstractC2601a {
    public static final Parcelable.Creator<C4908b2> CREATOR = new C4912c2();

    /* renamed from: h */
    public final List f18527h;

    public C4908b2(List list) {
        this.f18527h = (List) C2394s.m9619l(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4908b2)) {
            return false;
        }
        C4908b2 c4908b2 = (C4908b2) obj;
        return this.f18527h.containsAll(c4908b2.f18527h) && c4908b2.f18527h.containsAll(this.f18527h);
    }

    public final int hashCode() {
        return C2388q.m9593c(new HashSet(this.f18527h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10460J(parcel, 1, this.f18527h, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
