package p301v0;

/* renamed from: v0.e1 */
/* loaded from: classes.dex */
public final class C5041e1 implements InterfaceC5073p0 {

    /* renamed from: a */
    public final InterfaceC5079r0 f18911a;

    /* renamed from: b */
    public final String f18912b;

    /* renamed from: c */
    public final Object[] f18913c;

    /* renamed from: d */
    public final int f18914d;

    public C5041e1(InterfaceC5079r0 interfaceC5079r0, String str, Object[] objArr) {
        char charAt;
        this.f18911a = interfaceC5079r0;
        this.f18912b = str;
        this.f18913c = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int i10 = charAt2 & 8191;
            int i11 = 13;
            int i12 = 1;
            while (true) {
                int i13 = i12 + 1;
                charAt = str.charAt(i12);
                if (charAt < 55296) {
                    break;
                }
                i10 |= (charAt & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
            charAt2 = i10 | (charAt << i11);
        }
        this.f18914d = charAt2;
    }

    @Override // p301v0.InterfaceC5073p0
    /* renamed from: a */
    public boolean mo19910a() {
        return (this.f18914d & 2) == 2;
    }

    @Override // p301v0.InterfaceC5073p0
    /* renamed from: b */
    public InterfaceC5079r0 mo19911b() {
        return this.f18911a;
    }

    @Override // p301v0.InterfaceC5073p0
    /* renamed from: c */
    public EnumC5032b1 mo19912c() {
        return (this.f18914d & 1) == 1 ? EnumC5032b1.PROTO2 : EnumC5032b1.PROTO3;
    }

    /* renamed from: d */
    public Object[] m19913d() {
        return this.f18913c;
    }

    /* renamed from: e */
    public String m19914e() {
        return this.f18912b;
    }
}
