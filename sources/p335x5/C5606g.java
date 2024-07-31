package p335x5;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: x5.g */
/* loaded from: classes.dex */
public class C5606g extends AbstractC2601a {
    public static final Parcelable.Creator<C5606g> CREATOR = new C5625z();

    /* renamed from: h */
    public final C5609j f21045h;

    /* renamed from: i */
    public final String f21046i;

    /* renamed from: j */
    public final int f21047j;

    /* renamed from: x5.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public C5609j f21048a;

        /* renamed from: b */
        public String f21049b;

        /* renamed from: c */
        public int f21050c;

        /* renamed from: a */
        public C5606g m22592a() {
            return new C5606g(this.f21048a, this.f21049b, this.f21050c);
        }

        /* renamed from: b */
        public a m22593b(C5609j c5609j) {
            this.f21048a = c5609j;
            return this;
        }

        /* renamed from: c */
        public final a m22594c(String str) {
            this.f21049b = str;
            return this;
        }

        /* renamed from: d */
        public final a m22595d(int i10) {
            this.f21050c = i10;
            return this;
        }
    }

    public C5606g(C5609j c5609j, String str, int i10) {
        this.f21045h = (C5609j) C2394s.m9619l(c5609j);
        this.f21046i = str;
        this.f21047j = i10;
    }

    /* renamed from: I */
    public static a m22589I() {
        return new a();
    }

    /* renamed from: K */
    public static a m22590K(C5606g c5606g) {
        C2394s.m9619l(c5606g);
        a m22589I = m22589I();
        m22589I.m22593b(c5606g.m22591J());
        m22589I.m22595d(c5606g.f21047j);
        String str = c5606g.f21046i;
        if (str != null) {
            m22589I.m22594c(str);
        }
        return m22589I;
    }

    /* renamed from: J */
    public C5609j m22591J() {
        return this.f21045h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5606g)) {
            return false;
        }
        C5606g c5606g = (C5606g) obj;
        return C2388q.m9592b(this.f21045h, c5606g.f21045h) && C2388q.m9592b(this.f21046i, c5606g.f21046i) && this.f21047j == c5606g.f21047j;
    }

    public int hashCode() {
        return C2388q.m9593c(this.f21045h, this.f21046i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 1, m22591J(), i10, false);
        C2603c.m10456F(parcel, 2, this.f21046i, false);
        C2603c.m10485u(parcel, 3, this.f21047j);
        C2603c.m10466b(parcel, m10465a);
    }
}
