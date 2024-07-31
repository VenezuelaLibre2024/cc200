package td;

import java.io.Serializable;

/* renamed from: td.n */
/* loaded from: classes2.dex */
public abstract class AbstractC4754n<R> implements InterfaceC4749i<R>, Serializable {
    private final int arity;

    public AbstractC4754n(int i10) {
        this.arity = i10;
    }

    @Override // td.InterfaceC4749i
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String m18677g = C4764x.m18677g(this);
        C4753m.m18652e(m18677g, "renderLambdaToString(this)");
        return m18677g;
    }
}
