package re;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

/* renamed from: re.f0 */
/* loaded from: classes2.dex */
public final class C4357f0 {

    /* renamed from: a */
    public final C4346a f15782a;

    /* renamed from: b */
    public final Proxy f15783b;

    /* renamed from: c */
    public final InetSocketAddress f15784c;

    public C4357f0(C4346a c4346a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(c4346a, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f15782a = c4346a;
        this.f15783b = proxy;
        this.f15784c = inetSocketAddress;
    }

    /* renamed from: a */
    public C4346a m16737a() {
        return this.f15782a;
    }

    /* renamed from: b */
    public Proxy m16738b() {
        return this.f15783b;
    }

    /* renamed from: c */
    public boolean m16739c() {
        return this.f15782a.f15702i != null && this.f15783b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public InetSocketAddress m16740d() {
        return this.f15784c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4357f0) {
            C4357f0 c4357f0 = (C4357f0) obj;
            if (c4357f0.f15782a.equals(this.f15782a) && c4357f0.f15783b.equals(this.f15783b) && c4357f0.f15784c.equals(this.f15784c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f15782a.hashCode()) * 31) + this.f15783b.hashCode()) * 31) + this.f15784c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f15784c + "}";
    }
}
