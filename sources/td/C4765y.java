package td;

import p359yd.InterfaceC5913c;
import p359yd.InterfaceC5914d;
import p359yd.InterfaceC5915e;
import p359yd.InterfaceC5916f;
import p359yd.InterfaceC5917g;

/* renamed from: td.y */
/* loaded from: classes2.dex */
public class C4765y {
    /* renamed from: a */
    public InterfaceC5915e m18678a(C4750j c4750j) {
        return c4750j;
    }

    /* renamed from: b */
    public InterfaceC5913c m18679b(Class cls) {
        return new C4745e(cls);
    }

    /* renamed from: c */
    public InterfaceC5914d m18680c(Class cls, String str) {
        return new C4755o(cls, str);
    }

    /* renamed from: d */
    public InterfaceC5916f m18681d(AbstractC4756p abstractC4756p) {
        return abstractC4756p;
    }

    /* renamed from: e */
    public InterfaceC5917g m18682e(AbstractC4758r abstractC4758r) {
        return abstractC4758r;
    }

    /* renamed from: f */
    public String m18683f(InterfaceC4749i interfaceC4749i) {
        String obj = interfaceC4749i.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: g */
    public String m18684g(AbstractC4754n abstractC4754n) {
        return m18683f(abstractC4754n);
    }
}
