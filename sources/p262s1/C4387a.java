package p262s1;

/* renamed from: s1.a */
/* loaded from: classes.dex */
public final class C4387a implements InterfaceC4391e {

    /* renamed from: h */
    public final String f16103h;

    /* renamed from: i */
    public final Object[] f16104i;

    public C4387a(String str) {
        this(str, null);
    }

    public C4387a(String str, Object[] objArr) {
        this.f16103h = str;
        this.f16104i = objArr;
    }

    /* renamed from: b */
    public static void m16965b(InterfaceC4390d interfaceC4390d, int i10, Object obj) {
        long j10;
        int byteValue;
        double doubleValue;
        if (obj == null) {
            interfaceC4390d.mo14596j0(i10);
            return;
        }
        if (obj instanceof byte[]) {
            interfaceC4390d.mo14592Q(i10, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            doubleValue = ((Float) obj).floatValue();
        } else {
            if (!(obj instanceof Double)) {
                if (obj instanceof Long) {
                    j10 = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        byteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        byteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        byteValue = ((Byte) obj).byteValue();
                    } else {
                        if (obj instanceof String) {
                            interfaceC4390d.mo14598q(i10, (String) obj);
                            return;
                        }
                        if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                        }
                        j10 = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    }
                    j10 = byteValue;
                }
                interfaceC4390d.mo14591M(i10, j10);
                return;
            }
            doubleValue = ((Double) obj).doubleValue();
        }
        interfaceC4390d.mo14599y(i10, doubleValue);
    }

    /* renamed from: c */
    public static void m16966c(InterfaceC4390d interfaceC4390d, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            m16965b(interfaceC4390d, i10, obj);
        }
    }

    @Override // p262s1.InterfaceC4391e
    /* renamed from: a */
    public String mo14593a() {
        return this.f16103h;
    }

    @Override // p262s1.InterfaceC4391e
    /* renamed from: d */
    public void mo14594d(InterfaceC4390d interfaceC4390d) {
        m16966c(interfaceC4390d, this.f16104i);
    }
}
