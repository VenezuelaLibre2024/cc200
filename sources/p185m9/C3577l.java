package p185m9;

import td.C4753m;

/* renamed from: m9.l */
/* loaded from: classes.dex */
public final class C3577l {

    /* renamed from: a */
    public final String f12588a;

    public C3577l(String str) {
        this.f12588a = str;
    }

    /* renamed from: a */
    public final String m13280a() {
        return this.f12588a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3577l) && C4753m.m18648a(this.f12588a, ((C3577l) obj).f12588a);
    }

    public int hashCode() {
        String str = this.f12588a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f12588a + ')';
    }
}
