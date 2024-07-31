package p067e9;

import p108h6.C2388q;

/* renamed from: e9.b */
/* loaded from: classes.dex */
public class C1761b {

    /* renamed from: a */
    public String f6512a;

    public C1761b(String str) {
        this.f6512a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1761b) {
            return C2388q.m9592b(this.f6512a, ((C1761b) obj).f6512a);
        }
        return false;
    }

    public int hashCode() {
        return C2388q.m9593c(this.f6512a);
    }

    public String toString() {
        return C2388q.m9594d(this).m9595a("token", this.f6512a).toString();
    }
}
