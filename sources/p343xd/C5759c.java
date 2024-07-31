package p343xd;

import td.C4747g;
import td.C4753m;

/* renamed from: xd.c */
/* loaded from: classes2.dex */
public final class C5759c extends C5757a {

    /* renamed from: l */
    public static final a f21331l = new a(null);

    /* renamed from: m */
    public static final C5759c f21332m = new C5759c(1, 0);

    /* renamed from: xd.c$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public C5759c(char c10, char c11) {
        super(c10, c11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5759c) {
            if (!isEmpty() || !((C5759c) obj).isEmpty()) {
                C5759c c5759c = (C5759c) obj;
                if (m22887a() != c5759c.m22887a() || m22888b() != c5759c.m22888b()) {
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
        return (m22887a() * 31) + m22888b();
    }

    public boolean isEmpty() {
        return C4753m.m18655h(m22887a(), m22888b()) > 0;
    }

    public String toString() {
        return m22887a() + ".." + m22888b();
    }
}
