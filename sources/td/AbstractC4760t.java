package td;

import p359yd.InterfaceC5912b;
import p359yd.InterfaceC5918h;

/* renamed from: td.t */
/* loaded from: classes2.dex */
public abstract class AbstractC4760t extends AbstractC4743c implements InterfaceC5918h {

    /* renamed from: h */
    public final boolean f17728h;

    public AbstractC4760t() {
        this.f17728h = false;
    }

    public AbstractC4760t(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f17728h = (i10 & 2) == 2;
    }

    @Override // td.AbstractC4743c
    /* renamed from: c */
    public InterfaceC5918h getReflected() {
        if (this.f17728h) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (InterfaceC5918h) super.getReflected();
    }

    @Override // td.AbstractC4743c
    public InterfaceC5912b compute() {
        return this.f17728h ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4760t) {
            AbstractC4760t abstractC4760t = (AbstractC4760t) obj;
            return getOwner().equals(abstractC4760t.getOwner()) && getName().equals(abstractC4760t.getName()) && getSignature().equals(abstractC4760t.getSignature()) && C4753m.m18648a(getBoundReceiver(), abstractC4760t.getBoundReceiver());
        }
        if (obj instanceof InterfaceC5918h) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        InterfaceC5912b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
