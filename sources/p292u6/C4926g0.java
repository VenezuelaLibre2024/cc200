package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.g0 */
/* loaded from: classes.dex */
public class C4926g0 extends AbstractC2601a {
    public static final Parcelable.Creator<C4926g0> CREATOR = new C4935i1();

    /* renamed from: h */
    public final List f18569h;

    public C4926g0(List list) {
        this.f18569h = list;
    }

    /* renamed from: I */
    public List<C4930h0> m19488I() {
        return this.f18569h;
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof C4926g0)) {
            return false;
        }
        C4926g0 c4926g0 = (C4926g0) obj;
        List list2 = this.f18569h;
        return (list2 == null && c4926g0.f18569h == null) || (list2 != null && (list = c4926g0.f18569h) != null && list2.containsAll(list) && c4926g0.f18569h.containsAll(this.f18569h));
    }

    public int hashCode() {
        return C2388q.m9593c(new HashSet(this.f18569h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10460J(parcel, 1, m19488I(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
