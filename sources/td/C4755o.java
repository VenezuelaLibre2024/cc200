package td;

/* renamed from: td.o */
/* loaded from: classes2.dex */
public final class C4755o implements InterfaceC4744d {

    /* renamed from: h */
    public final Class<?> f17726h;

    /* renamed from: i */
    public final String f17727i;

    public C4755o(Class<?> cls, String str) {
        C4753m.m18653f(cls, "jClass");
        C4753m.m18653f(str, "moduleName");
        this.f17726h = cls;
        this.f17727i = str;
    }

    @Override // td.InterfaceC4744d
    /* renamed from: b */
    public Class<?> mo18640b() {
        return this.f17726h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4755o) && C4753m.m18648a(mo18640b(), ((C4755o) obj).mo18640b());
    }

    public int hashCode() {
        return mo18640b().hashCode();
    }

    public String toString() {
        return mo18640b().toString() + " (Kotlin reflection is not available)";
    }
}
