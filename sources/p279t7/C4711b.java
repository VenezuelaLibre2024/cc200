package p279t7;

import p108h6.C2394s;
import p195n7.C3773m;
import p268s7.AbstractC4546b;
import p268s7.AbstractC4547c;

/* renamed from: t7.b */
/* loaded from: classes.dex */
public final class C4711b extends AbstractC4547c {

    /* renamed from: a */
    public final String f17594a;

    /* renamed from: b */
    public final C3773m f17595b;

    public C4711b(String str, C3773m c3773m) {
        C2394s.m9613f(str);
        this.f17594a = str;
        this.f17595b = c3773m;
    }

    /* renamed from: c */
    public static C4711b m18529c(AbstractC4546b abstractC4546b) {
        C2394s.m9619l(abstractC4546b);
        return new C4711b(abstractC4546b.mo17978b(), null);
    }

    /* renamed from: d */
    public static C4711b m18530d(C3773m c3773m) {
        return new C4711b("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", (C3773m) C2394s.m9619l(c3773m));
    }

    @Override // p268s7.AbstractC4547c
    /* renamed from: a */
    public Exception mo17979a() {
        return this.f17595b;
    }

    @Override // p268s7.AbstractC4547c
    /* renamed from: b */
    public String mo17980b() {
        return this.f17594a;
    }
}
