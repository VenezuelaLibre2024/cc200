package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p292u6.C4951o;
import p292u6.EnumC4984z;

/* renamed from: u6.w */
/* loaded from: classes.dex */
public class C4975w extends AbstractC2601a {
    public static final Parcelable.Creator<C4975w> CREATOR = new C4976w0();

    /* renamed from: h */
    public final EnumC4984z f18652h;

    /* renamed from: i */
    public final C4951o f18653i;

    public C4975w(String str, int i10) {
        C2394s.m9619l(str);
        try {
            this.f18652h = EnumC4984z.m19549b(str);
            C2394s.m9619l(Integer.valueOf(i10));
            try {
                this.f18653i = C4951o.m19512a(i10);
            } catch (C4951o.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (EnumC4984z.a e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    /* renamed from: I */
    public int m19537I() {
        return this.f18653i.m19513b();
    }

    /* renamed from: J */
    public String m19538J() {
        return this.f18652h.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4975w)) {
            return false;
        }
        C4975w c4975w = (C4975w) obj;
        return this.f18652h.equals(c4975w.f18652h) && this.f18653i.equals(c4975w.f18653i);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f18652h, this.f18653i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 2, m19538J(), false);
        C2603c.m10487w(parcel, 3, Integer.valueOf(m19537I()), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
