package p098g8;

import java.util.Objects;
import p098g8.AbstractC2137g0;

/* renamed from: g8.e0 */
/* loaded from: classes.dex */
public final class C2133e0 extends AbstractC2137g0.c {

    /* renamed from: a */
    public final String f8441a;

    /* renamed from: b */
    public final String f8442b;

    /* renamed from: c */
    public final boolean f8443c;

    public C2133e0(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "Null osRelease");
        this.f8441a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f8442b = str2;
        this.f8443c = z10;
    }

    @Override // p098g8.AbstractC2137g0.c
    /* renamed from: b */
    public boolean mo8442b() {
        return this.f8443c;
    }

    @Override // p098g8.AbstractC2137g0.c
    /* renamed from: c */
    public String mo8443c() {
        return this.f8442b;
    }

    @Override // p098g8.AbstractC2137g0.c
    /* renamed from: d */
    public String mo8444d() {
        return this.f8441a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2137g0.c)) {
            return false;
        }
        AbstractC2137g0.c cVar = (AbstractC2137g0.c) obj;
        return this.f8441a.equals(cVar.mo8444d()) && this.f8442b.equals(cVar.mo8443c()) && this.f8443c == cVar.mo8442b();
    }

    public int hashCode() {
        return ((((this.f8441a.hashCode() ^ 1000003) * 1000003) ^ this.f8442b.hashCode()) * 1000003) ^ (this.f8443c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f8441a + ", osCodeName=" + this.f8442b + ", isRooted=" + this.f8443c + "}";
    }
}
