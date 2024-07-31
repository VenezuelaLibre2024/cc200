package td;

import p359yd.InterfaceC5912b;
import p359yd.InterfaceC5917g;

/* renamed from: td.r */
/* loaded from: classes2.dex */
public abstract class AbstractC4758r extends AbstractC4760t implements InterfaceC5917g {
    public AbstractC4758r(Class cls, String str, String str2, int i10) {
        super(AbstractC4743c.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // td.AbstractC4743c
    public InterfaceC5912b computeReflected() {
        return C4764x.m18675e(this);
    }

    @Override // p359yd.InterfaceC5917g
    /* renamed from: d */
    public InterfaceC5917g.a mo18668d() {
        return ((InterfaceC5917g) getReflected()).mo18668d();
    }

    @Override // sd.InterfaceC4584p
    public Object invoke(Object obj, Object obj2) {
        return mo18669i(obj, obj2);
    }
}
