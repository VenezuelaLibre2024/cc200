package p343xd;

import td.C4747g;

/* renamed from: xd.f */
/* loaded from: classes2.dex */
public final class C5762f extends C5760d {

    /* renamed from: l */
    public static final a f21341l = new a(null);

    /* renamed from: m */
    public static final C5762f f21342m = new C5762f(1, 0);

    /* renamed from: xd.f$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final C5762f m22899a() {
            return C5762f.f21342m;
        }
    }

    public C5762f(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // p343xd.C5760d
    public boolean equals(Object obj) {
        if (obj instanceof C5762f) {
            if (!isEmpty() || !((C5762f) obj).isEmpty()) {
                C5762f c5762f = (C5762f) obj;
                if (m22890a() != c5762f.m22890a() || m22891b() != c5762f.m22891b()) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m22896h(int i10) {
        return m22890a() <= i10 && i10 <= m22891b();
    }

    @Override // p343xd.C5760d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m22890a() * 31) + m22891b();
    }

    @Override // p343xd.C5760d
    public boolean isEmpty() {
        return m22890a() > m22891b();
    }

    /* renamed from: j */
    public Integer m22897j() {
        return Integer.valueOf(m22891b());
    }

    /* renamed from: k */
    public Integer m22898k() {
        return Integer.valueOf(m22890a());
    }

    @Override // p343xd.C5760d
    public String toString() {
        return m22890a() + ".." + m22891b();
    }
}
