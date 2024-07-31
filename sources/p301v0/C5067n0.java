package p301v0;

import java.util.Map;
import p301v0.C5058k0;

/* renamed from: v0.n0 */
/* loaded from: classes.dex */
public class C5067n0 implements InterfaceC5064m0 {
    /* renamed from: i */
    public static <K, V> int m20374i(int i10, Object obj, Object obj2) {
        C5061l0 c5061l0 = (C5061l0) obj;
        C5058k0 c5058k0 = (C5058k0) obj2;
        int i11 = 0;
        if (c5061l0.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : c5061l0.entrySet()) {
            i11 += c5058k0.m20286a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    /* renamed from: j */
    public static <K, V> C5061l0<K, V> m20375j(Object obj, Object obj2) {
        C5061l0<K, V> c5061l0 = (C5061l0) obj;
        C5061l0<K, V> c5061l02 = (C5061l0) obj2;
        if (!c5061l02.isEmpty()) {
            if (!c5061l0.m20345k()) {
                c5061l0 = c5061l0.m20348n();
            }
            c5061l0.m20347m(c5061l02);
        }
        return c5061l0;
    }

    @Override // p301v0.InterfaceC5064m0
    /* renamed from: a */
    public Object mo20365a(Object obj, Object obj2) {
        return m20375j(obj, obj2);
    }

    @Override // p301v0.InterfaceC5064m0
    /* renamed from: b */
    public Object mo20366b(Object obj) {
        ((C5061l0) obj).m20346l();
        return obj;
    }

    @Override // p301v0.InterfaceC5064m0
    /* renamed from: c */
    public C5058k0.a<?, ?> mo20367c(Object obj) {
        return ((C5058k0) obj).m20287c();
    }

    @Override // p301v0.InterfaceC5064m0
    /* renamed from: d */
    public Map<?, ?> mo20368d(Object obj) {
        return (C5061l0) obj;
    }

    @Override // p301v0.InterfaceC5064m0
    /* renamed from: e */
    public Object mo20369e(Object obj) {
        return C5061l0.m20341f().m20348n();
    }

    @Override // p301v0.InterfaceC5064m0
    /* renamed from: f */
    public int mo20370f(int i10, Object obj, Object obj2) {
        return m20374i(i10, obj, obj2);
    }

    @Override // p301v0.InterfaceC5064m0
    /* renamed from: g */
    public boolean mo20371g(Object obj) {
        return !((C5061l0) obj).m20345k();
    }

    @Override // p301v0.InterfaceC5064m0
    /* renamed from: h */
    public Map<?, ?> mo20372h(Object obj) {
        return (C5061l0) obj;
    }
}
