package p038ce;

/* renamed from: ce.l1 */
/* loaded from: classes2.dex */
public final class C1070l1 implements InterfaceC1118x1 {

    /* renamed from: h */
    public final boolean f4050h;

    public C1070l1(boolean z10) {
        this.f4050h = z10;
    }

    @Override // p038ce.InterfaceC1118x1
    /* renamed from: a */
    public boolean mo4363a() {
        return this.f4050h;
    }

    @Override // p038ce.InterfaceC1118x1
    /* renamed from: e */
    public C1083o2 mo4364e() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(mo4363a() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
