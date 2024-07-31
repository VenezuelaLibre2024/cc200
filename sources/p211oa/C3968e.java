package p211oa;

import java.util.List;

/* renamed from: oa.e */
/* loaded from: classes.dex */
public final class C3968e {

    /* renamed from: a */
    public final byte[] f14311a;

    /* renamed from: b */
    public int f14312b;

    /* renamed from: c */
    public final String f14313c;

    /* renamed from: d */
    public final List<byte[]> f14314d;

    /* renamed from: e */
    public final String f14315e;

    /* renamed from: f */
    public Integer f14316f;

    /* renamed from: g */
    public Integer f14317g;

    /* renamed from: h */
    public Object f14318h;

    /* renamed from: i */
    public final int f14319i;

    /* renamed from: j */
    public final int f14320j;

    /* renamed from: k */
    public final int f14321k;

    public C3968e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1, 0);
    }

    public C3968e(byte[] bArr, String str, List<byte[]> list, String str2, int i10) {
        this(bArr, str, list, str2, -1, -1, i10);
    }

    public C3968e(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11, int i12) {
        this.f14311a = bArr;
        this.f14312b = bArr == null ? 0 : bArr.length * 8;
        this.f14313c = str;
        this.f14314d = list;
        this.f14315e = str2;
        this.f14319i = i11;
        this.f14320j = i10;
        this.f14321k = i12;
    }

    /* renamed from: a */
    public List<byte[]> m15054a() {
        return this.f14314d;
    }

    /* renamed from: b */
    public String m15055b() {
        return this.f14315e;
    }

    /* renamed from: c */
    public int m15056c() {
        return this.f14312b;
    }

    /* renamed from: d */
    public Object m15057d() {
        return this.f14318h;
    }

    /* renamed from: e */
    public byte[] m15058e() {
        return this.f14311a;
    }

    /* renamed from: f */
    public int m15059f() {
        return this.f14319i;
    }

    /* renamed from: g */
    public int m15060g() {
        return this.f14320j;
    }

    /* renamed from: h */
    public int m15061h() {
        return this.f14321k;
    }

    /* renamed from: i */
    public String m15062i() {
        return this.f14313c;
    }

    /* renamed from: j */
    public boolean m15063j() {
        return this.f14319i >= 0 && this.f14320j >= 0;
    }

    /* renamed from: k */
    public void m15064k(Integer num) {
        this.f14317g = num;
    }

    /* renamed from: l */
    public void m15065l(Integer num) {
        this.f14316f = num;
    }

    /* renamed from: m */
    public void m15066m(int i10) {
        this.f14312b = i10;
    }

    /* renamed from: n */
    public void m15067n(Object obj) {
        this.f14318h = obj;
    }
}
