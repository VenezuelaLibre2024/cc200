package p098g8;

import java.util.Objects;
import p098g8.AbstractC2137g0;

/* renamed from: g8.d0 */
/* loaded from: classes.dex */
public final class C2131d0 extends AbstractC2137g0.b {

    /* renamed from: a */
    public final int f8428a;

    /* renamed from: b */
    public final String f8429b;

    /* renamed from: c */
    public final int f8430c;

    /* renamed from: d */
    public final long f8431d;

    /* renamed from: e */
    public final long f8432e;

    /* renamed from: f */
    public final boolean f8433f;

    /* renamed from: g */
    public final int f8434g;

    /* renamed from: h */
    public final String f8435h;

    /* renamed from: i */
    public final String f8436i;

    public C2131d0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f8428a = i10;
        Objects.requireNonNull(str, "Null model");
        this.f8429b = str;
        this.f8430c = i11;
        this.f8431d = j10;
        this.f8432e = j11;
        this.f8433f = z10;
        this.f8434g = i12;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f8435h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f8436i = str3;
    }

    @Override // p098g8.AbstractC2137g0.b
    /* renamed from: a */
    public int mo8428a() {
        return this.f8428a;
    }

    @Override // p098g8.AbstractC2137g0.b
    /* renamed from: b */
    public int mo8429b() {
        return this.f8430c;
    }

    @Override // p098g8.AbstractC2137g0.b
    /* renamed from: d */
    public long mo8430d() {
        return this.f8432e;
    }

    @Override // p098g8.AbstractC2137g0.b
    /* renamed from: e */
    public boolean mo8431e() {
        return this.f8433f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2137g0.b)) {
            return false;
        }
        AbstractC2137g0.b bVar = (AbstractC2137g0.b) obj;
        return this.f8428a == bVar.mo8428a() && this.f8429b.equals(bVar.mo8433g()) && this.f8430c == bVar.mo8429b() && this.f8431d == bVar.mo8436j() && this.f8432e == bVar.mo8430d() && this.f8433f == bVar.mo8431e() && this.f8434g == bVar.mo8435i() && this.f8435h.equals(bVar.mo8432f()) && this.f8436i.equals(bVar.mo8434h());
    }

    @Override // p098g8.AbstractC2137g0.b
    /* renamed from: f */
    public String mo8432f() {
        return this.f8435h;
    }

    @Override // p098g8.AbstractC2137g0.b
    /* renamed from: g */
    public String mo8433g() {
        return this.f8429b;
    }

    @Override // p098g8.AbstractC2137g0.b
    /* renamed from: h */
    public String mo8434h() {
        return this.f8436i;
    }

    public int hashCode() {
        int hashCode = (((((this.f8428a ^ 1000003) * 1000003) ^ this.f8429b.hashCode()) * 1000003) ^ this.f8430c) * 1000003;
        long j10 = this.f8431d;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f8432e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f8433f ? 1231 : 1237)) * 1000003) ^ this.f8434g) * 1000003) ^ this.f8435h.hashCode()) * 1000003) ^ this.f8436i.hashCode();
    }

    @Override // p098g8.AbstractC2137g0.b
    /* renamed from: i */
    public int mo8435i() {
        return this.f8434g;
    }

    @Override // p098g8.AbstractC2137g0.b
    /* renamed from: j */
    public long mo8436j() {
        return this.f8431d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f8428a + ", model=" + this.f8429b + ", availableProcessors=" + this.f8430c + ", totalRam=" + this.f8431d + ", diskSpace=" + this.f8432e + ", isEmulator=" + this.f8433f + ", state=" + this.f8434g + ", manufacturer=" + this.f8435h + ", modelClass=" + this.f8436i + "}";
    }
}
