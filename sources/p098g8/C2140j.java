package p098g8;

import p098g8.AbstractC2135f0;

/* renamed from: g8.j */
/* loaded from: classes.dex */
public final class C2140j extends AbstractC2135f0.e.a.b {

    /* renamed from: a */
    public final String f8491a;

    @Override // p098g8.AbstractC2135f0.e.a.b
    /* renamed from: a */
    public String mo8501a() {
        return this.f8491a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2135f0.e.a.b) {
            return this.f8491a.equals(((AbstractC2135f0.e.a.b) obj).mo8501a());
        }
        return false;
    }

    public int hashCode() {
        return this.f8491a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f8491a + "}";
    }
}
