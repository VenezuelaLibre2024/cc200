package p129ia;

import p211oa.C3964a;
import p211oa.C3965b;

/* renamed from: ia.c */
/* loaded from: classes.dex */
public final class C2671c {

    /* renamed from: a */
    public final AbstractC2670b f10436a;

    /* renamed from: b */
    public C3965b f10437b;

    public C2671c(AbstractC2670b abstractC2670b) {
        if (abstractC2670b == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f10436a = abstractC2670b;
    }

    /* renamed from: a */
    public C3965b m10875a() {
        if (this.f10437b == null) {
            this.f10437b = this.f10436a.mo10870b();
        }
        return this.f10437b;
    }

    /* renamed from: b */
    public C3964a m10876b(int i10, C3964a c3964a) {
        return this.f10436a.mo10871c(i10, c3964a);
    }

    /* renamed from: c */
    public int m10877c() {
        return this.f10436a.m10872d();
    }

    /* renamed from: d */
    public int m10878d() {
        return this.f10436a.m10874f();
    }

    /* renamed from: e */
    public boolean m10879e() {
        return this.f10436a.m10873e().mo10888f();
    }

    /* renamed from: f */
    public C2671c m10880f() {
        return new C2671c(this.f10436a.mo10869a(this.f10436a.m10873e().mo10889g()));
    }

    public String toString() {
        try {
            return m10875a().toString();
        } catch (C2678j unused) {
            return "";
        }
    }
}
