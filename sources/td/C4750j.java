package td;

import p359yd.InterfaceC5912b;
import p359yd.InterfaceC5915e;

/* renamed from: td.j */
/* loaded from: classes2.dex */
public class C4750j extends AbstractC4743c implements InterfaceC4749i, InterfaceC5915e {
    private final int arity;
    private final int flags;

    public C4750j(int i10) {
        this(i10, AbstractC4743c.NO_RECEIVER, null, null, null, 0);
    }

    public C4750j(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    public C4750j(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // td.AbstractC4743c
    public InterfaceC5912b computeReflected() {
        return C4764x.m18671a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4750j) {
            C4750j c4750j = (C4750j) obj;
            return getName().equals(c4750j.getName()) && getSignature().equals(c4750j.getSignature()) && this.flags == c4750j.flags && this.arity == c4750j.arity && C4753m.m18648a(getBoundReceiver(), c4750j.getBoundReceiver()) && C4753m.m18648a(getOwner(), c4750j.getOwner());
        }
        if (obj instanceof InterfaceC5915e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // td.InterfaceC4749i
    public int getArity() {
        return this.arity;
    }

    @Override // td.AbstractC4743c
    public InterfaceC5915e getReflected() {
        return (InterfaceC5915e) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // p359yd.InterfaceC5915e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p359yd.InterfaceC5915e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p359yd.InterfaceC5915e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p359yd.InterfaceC5915e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // td.AbstractC4743c, p359yd.InterfaceC5912b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC5912b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
