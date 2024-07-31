package p173ld;

import p146jd.InterfaceC3281d;
import td.C4753m;
import td.C4764x;
import td.InterfaceC4749i;

/* renamed from: ld.l */
/* loaded from: classes2.dex */
public abstract class AbstractC3478l extends AbstractC3470d implements InterfaceC4749i<Object> {
    private final int arity;

    public AbstractC3478l(int i10) {
        this(i10, null);
    }

    public AbstractC3478l(int i10, InterfaceC3281d<Object> interfaceC3281d) {
        super(interfaceC3281d);
        this.arity = i10;
    }

    @Override // td.InterfaceC4749i
    public int getArity() {
        return this.arity;
    }

    @Override // p173ld.AbstractC3467a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String m18676f = C4764x.m18676f(this);
        C4753m.m18652e(m18676f, "renderLambdaToString(this)");
        return m18676f;
    }
}
