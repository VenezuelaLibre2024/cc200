package p066e8;

import java.util.Objects;
import p066e8.InterfaceC1722c0;

/* renamed from: e8.c */
/* loaded from: classes.dex */
public final class C1721c extends InterfaceC1722c0.a {

    /* renamed from: a */
    public final String f6334a;

    /* renamed from: b */
    public final String f6335b;

    public C1721c(String str, String str2) {
        Objects.requireNonNull(str, "Null crashlyticsInstallId");
        this.f6334a = str;
        this.f6335b = str2;
    }

    @Override // p066e8.InterfaceC1722c0.a
    /* renamed from: c */
    public String mo6783c() {
        return this.f6334a;
    }

    @Override // p066e8.InterfaceC1722c0.a
    /* renamed from: d */
    public String mo6784d() {
        return this.f6335b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC1722c0.a)) {
            return false;
        }
        InterfaceC1722c0.a aVar = (InterfaceC1722c0.a) obj;
        if (this.f6334a.equals(aVar.mo6783c())) {
            String str = this.f6335b;
            String mo6784d = aVar.mo6784d();
            if (str == null) {
                if (mo6784d == null) {
                    return true;
                }
            } else if (str.equals(mo6784d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f6334a.hashCode() ^ 1000003) * 1000003;
        String str = this.f6335b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f6334a + ", firebaseInstallationId=" + this.f6335b + "}";
    }
}
