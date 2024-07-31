package p142j9;

import java.util.Objects;

/* renamed from: j9.a */
/* loaded from: classes.dex */
public final class C3263a extends AbstractC3268f {

    /* renamed from: a */
    public final String f11390a;

    /* renamed from: b */
    public final String f11391b;

    public C3263a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f11390a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f11391b = str2;
    }

    @Override // p142j9.AbstractC3268f
    /* renamed from: b */
    public String mo11811b() {
        return this.f11390a;
    }

    @Override // p142j9.AbstractC3268f
    /* renamed from: c */
    public String mo11812c() {
        return this.f11391b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3268f)) {
            return false;
        }
        AbstractC3268f abstractC3268f = (AbstractC3268f) obj;
        return this.f11390a.equals(abstractC3268f.mo11811b()) && this.f11391b.equals(abstractC3268f.mo11812c());
    }

    public int hashCode() {
        return ((this.f11390a.hashCode() ^ 1000003) * 1000003) ^ this.f11391b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f11390a + ", version=" + this.f11391b + "}";
    }
}
