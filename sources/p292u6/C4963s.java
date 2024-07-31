package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: u6.s */
/* loaded from: classes.dex */
public class C4963s extends AbstractC2601a {
    public static final Parcelable.Creator<C4963s> CREATOR = new C4952o0();

    /* renamed from: h */
    public final boolean f18628h;

    public C4963s(boolean z10) {
        this.f18628h = z10;
    }

    /* renamed from: I */
    public boolean m19517I() {
        return this.f18628h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4963s) && this.f18628h == ((C4963s) obj).m19517I();
    }

    public int hashCode() {
        return C2388q.m9593c(Boolean.valueOf(this.f18628h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10471g(parcel, 1, m19517I());
        C2603c.m10466b(parcel, m10465a);
    }
}
