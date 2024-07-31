package p343xd;

import td.C4747g;

/* renamed from: xd.i */
/* loaded from: classes2.dex */
public final class C5765i extends C5763g {

    /* renamed from: l */
    public static final a f21351l = new a(null);

    /* renamed from: m */
    public static final C5765i f21352m = new C5765i(1, 0);

    /* renamed from: xd.i$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public C5765i(long j10, long j11) {
        super(j10, j11, 1L);
    }

    /* renamed from: d */
    public boolean m22903d(long j10) {
        return m22900a() <= j10 && j10 <= m22901b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5765i) {
            if (!isEmpty() || !((C5765i) obj).isEmpty()) {
                C5765i c5765i = (C5765i) obj;
                if (m22900a() != c5765i.m22900a() || m22901b() != c5765i.m22901b()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (m22900a() ^ (m22900a() >>> 32))) + (m22901b() ^ (m22901b() >>> 32)));
    }

    public boolean isEmpty() {
        return m22900a() > m22901b();
    }

    public String toString() {
        return m22900a() + ".." + m22901b();
    }
}
