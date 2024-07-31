package p064e6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: e6.d */
/* loaded from: classes.dex */
public class C1671d extends AbstractC2601a {
    public static final Parcelable.Creator<C1671d> CREATOR = new C1694q();

    /* renamed from: h */
    public final String f6249h;

    /* renamed from: i */
    @Deprecated
    public final int f6250i;

    /* renamed from: j */
    public final long f6251j;

    public C1671d(String str, int i10, long j10) {
        this.f6249h = str;
        this.f6250i = i10;
        this.f6251j = j10;
    }

    public C1671d(String str, long j10) {
        this.f6249h = str;
        this.f6251j = j10;
        this.f6250i = -1;
    }

    /* renamed from: I */
    public String m6691I() {
        return this.f6249h;
    }

    /* renamed from: J */
    public long m6692J() {
        long j10 = this.f6251j;
        return j10 == -1 ? this.f6250i : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1671d) {
            C1671d c1671d = (C1671d) obj;
            if (((m6691I() != null && m6691I().equals(c1671d.m6691I())) || (m6691I() == null && c1671d.m6691I() == null)) && m6692J() == c1671d.m6692J()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2388q.m9593c(m6691I(), Long.valueOf(m6692J()));
    }

    public final String toString() {
        C2388q.a m9594d = C2388q.m9594d(this);
        m9594d.m9595a("name", m6691I());
        m9594d.m9595a("version", Long.valueOf(m6692J()));
        return m9594d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, m6691I(), false);
        C2603c.m10485u(parcel, 2, this.f6250i);
        C2603c.m10489y(parcel, 3, m6692J());
        C2603c.m10466b(parcel, m10465a);
    }
}
