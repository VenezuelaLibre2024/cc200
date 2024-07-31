package p350y4;

import android.net.Uri;
import p222p5.C4037l0;

/* renamed from: y4.i */
/* loaded from: classes.dex */
public final class C5808i {

    /* renamed from: a */
    public final long f21804a;

    /* renamed from: b */
    public final long f21805b;

    /* renamed from: c */
    public final String f21806c;

    /* renamed from: d */
    public int f21807d;

    public C5808i(String str, long j10, long j11) {
        this.f21806c = str == null ? "" : str;
        this.f21804a = j10;
        this.f21805b = j11;
    }

    /* renamed from: a */
    public C5808i m23359a(C5808i c5808i, String str) {
        String m23361c = m23361c(str);
        if (c5808i != null && m23361c.equals(c5808i.m23361c(str))) {
            long j10 = this.f21805b;
            if (j10 != -1) {
                long j11 = this.f21804a;
                if (j11 + j10 == c5808i.f21804a) {
                    long j12 = c5808i.f21805b;
                    return new C5808i(m23361c, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = c5808i.f21805b;
            if (j13 != -1) {
                long j14 = c5808i.f21804a;
                if (j14 + j13 == this.f21804a) {
                    return new C5808i(m23361c, j14, j10 != -1 ? j13 + j10 : -1L);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Uri m23360b(String str) {
        return C4037l0.m15388e(str, this.f21806c);
    }

    /* renamed from: c */
    public String m23361c(String str) {
        return C4037l0.m15387d(str, this.f21806c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5808i.class != obj.getClass()) {
            return false;
        }
        C5808i c5808i = (C5808i) obj;
        return this.f21804a == c5808i.f21804a && this.f21805b == c5808i.f21805b && this.f21806c.equals(c5808i.f21806c);
    }

    public int hashCode() {
        if (this.f21807d == 0) {
            this.f21807d = ((((527 + ((int) this.f21804a)) * 31) + ((int) this.f21805b)) * 31) + this.f21806c.hashCode();
        }
        return this.f21807d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f21806c + ", start=" + this.f21804a + ", length=" + this.f21805b + ")";
    }
}
