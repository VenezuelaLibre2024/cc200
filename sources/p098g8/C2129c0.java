package p098g8;

import java.util.Objects;
import p023b8.C0514f;
import p098g8.AbstractC2137g0;

/* renamed from: g8.c0 */
/* loaded from: classes.dex */
public final class C2129c0 extends AbstractC2137g0.a {

    /* renamed from: a */
    public final String f8416a;

    /* renamed from: b */
    public final String f8417b;

    /* renamed from: c */
    public final String f8418c;

    /* renamed from: d */
    public final String f8419d;

    /* renamed from: e */
    public final int f8420e;

    /* renamed from: f */
    public final C0514f f8421f;

    public C2129c0(String str, String str2, String str3, String str4, int i10, C0514f c0514f) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f8416a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f8417b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f8418c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f8419d = str4;
        this.f8420e = i10;
        Objects.requireNonNull(c0514f, "Null developmentPlatformProvider");
        this.f8421f = c0514f;
    }

    @Override // p098g8.AbstractC2137g0.a
    /* renamed from: a */
    public String mo8415a() {
        return this.f8416a;
    }

    @Override // p098g8.AbstractC2137g0.a
    /* renamed from: c */
    public int mo8416c() {
        return this.f8420e;
    }

    @Override // p098g8.AbstractC2137g0.a
    /* renamed from: d */
    public C0514f mo8417d() {
        return this.f8421f;
    }

    @Override // p098g8.AbstractC2137g0.a
    /* renamed from: e */
    public String mo8418e() {
        return this.f8419d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2137g0.a)) {
            return false;
        }
        AbstractC2137g0.a aVar = (AbstractC2137g0.a) obj;
        return this.f8416a.equals(aVar.mo8415a()) && this.f8417b.equals(aVar.mo8419f()) && this.f8418c.equals(aVar.mo8420g()) && this.f8419d.equals(aVar.mo8418e()) && this.f8420e == aVar.mo8416c() && this.f8421f.equals(aVar.mo8417d());
    }

    @Override // p098g8.AbstractC2137g0.a
    /* renamed from: f */
    public String mo8419f() {
        return this.f8417b;
    }

    @Override // p098g8.AbstractC2137g0.a
    /* renamed from: g */
    public String mo8420g() {
        return this.f8418c;
    }

    public int hashCode() {
        return ((((((((((this.f8416a.hashCode() ^ 1000003) * 1000003) ^ this.f8417b.hashCode()) * 1000003) ^ this.f8418c.hashCode()) * 1000003) ^ this.f8419d.hashCode()) * 1000003) ^ this.f8420e) * 1000003) ^ this.f8421f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f8416a + ", versionCode=" + this.f8417b + ", versionName=" + this.f8418c + ", installUuid=" + this.f8419d + ", deliveryMechanism=" + this.f8420e + ", developmentPlatformProvider=" + this.f8421f + "}";
    }
}
