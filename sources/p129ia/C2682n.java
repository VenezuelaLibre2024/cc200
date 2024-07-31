package p129ia;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: ia.n */
/* loaded from: classes.dex */
public final class C2682n {

    /* renamed from: a */
    public final String f10468a;

    /* renamed from: b */
    public final byte[] f10469b;

    /* renamed from: c */
    public final int f10470c;

    /* renamed from: d */
    public C2684p[] f10471d;

    /* renamed from: e */
    public final EnumC2669a f10472e;

    /* renamed from: f */
    public Map<EnumC2683o, Object> f10473f;

    /* renamed from: g */
    public final long f10474g;

    public C2682n(String str, byte[] bArr, int i10, C2684p[] c2684pArr, EnumC2669a enumC2669a, long j10) {
        this.f10468a = str;
        this.f10469b = bArr;
        this.f10470c = i10;
        this.f10471d = c2684pArr;
        this.f10472e = enumC2669a;
        this.f10473f = null;
        this.f10474g = j10;
    }

    public C2682n(String str, byte[] bArr, C2684p[] c2684pArr, EnumC2669a enumC2669a) {
        this(str, bArr, c2684pArr, enumC2669a, System.currentTimeMillis());
    }

    public C2682n(String str, byte[] bArr, C2684p[] c2684pArr, EnumC2669a enumC2669a, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, c2684pArr, enumC2669a, j10);
    }

    /* renamed from: a */
    public void m10897a(C2684p[] c2684pArr) {
        C2684p[] c2684pArr2 = this.f10471d;
        if (c2684pArr2 == null) {
            this.f10471d = c2684pArr;
            return;
        }
        if (c2684pArr == null || c2684pArr.length <= 0) {
            return;
        }
        C2684p[] c2684pArr3 = new C2684p[c2684pArr2.length + c2684pArr.length];
        System.arraycopy(c2684pArr2, 0, c2684pArr3, 0, c2684pArr2.length);
        System.arraycopy(c2684pArr, 0, c2684pArr3, c2684pArr2.length, c2684pArr.length);
        this.f10471d = c2684pArr3;
    }

    /* renamed from: b */
    public EnumC2669a m10898b() {
        return this.f10472e;
    }

    /* renamed from: c */
    public byte[] m10899c() {
        return this.f10469b;
    }

    /* renamed from: d */
    public Map<EnumC2683o, Object> m10900d() {
        return this.f10473f;
    }

    /* renamed from: e */
    public C2684p[] m10901e() {
        return this.f10471d;
    }

    /* renamed from: f */
    public String m10902f() {
        return this.f10468a;
    }

    /* renamed from: g */
    public void m10903g(Map<EnumC2683o, Object> map) {
        if (map != null) {
            Map<EnumC2683o, Object> map2 = this.f10473f;
            if (map2 == null) {
                this.f10473f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void m10904h(EnumC2683o enumC2683o, Object obj) {
        if (this.f10473f == null) {
            this.f10473f = new EnumMap(EnumC2683o.class);
        }
        this.f10473f.put(enumC2683o, obj);
    }

    public String toString() {
        return this.f10468a;
    }
}
