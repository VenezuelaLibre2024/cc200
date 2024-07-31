package p197n9;

import td.C4753m;

/* renamed from: n9.b */
/* loaded from: classes.dex */
public interface InterfaceC3781b {

    /* renamed from: n9.b$a */
    /* loaded from: classes.dex */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* renamed from: n9.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f13629a;

        public b(String str) {
            C4753m.m18653f(str, "sessionId");
            this.f13629a = str;
        }

        /* renamed from: a */
        public final String m14389a() {
            return this.f13629a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C4753m.m18648a(this.f13629a, ((b) obj).f13629a);
        }

        public int hashCode() {
            return this.f13629a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f13629a + ')';
        }
    }

    /* renamed from: a */
    void mo6875a(b bVar);

    /* renamed from: b */
    boolean mo6876b();

    /* renamed from: c */
    a mo6877c();
}
