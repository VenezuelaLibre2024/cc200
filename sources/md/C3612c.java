package md;

import java.io.Serializable;
import java.lang.Enum;
import p115hd.AbstractC2483c;
import p115hd.C2497j;
import sd.InterfaceC4569a;
import td.C4753m;

/* renamed from: md.c */
/* loaded from: classes2.dex */
public final class C3612c<T extends Enum<T>> extends AbstractC2483c<T> implements InterfaceC3610a<T>, Serializable {

    /* renamed from: i */
    public final InterfaceC4569a<T[]> f12740i;

    /* renamed from: j */
    public volatile T[] f12741j;

    public C3612c(InterfaceC4569a<T[]> interfaceC4569a) {
        C4753m.m18653f(interfaceC4569a, "entriesProvider");
        this.f12740i = interfaceC4569a;
    }

    @Override // p115hd.AbstractC2479a
    /* renamed from: a */
    public int mo9875a() {
        return m13366d().length;
    }

    /* renamed from: b */
    public boolean m13364b(T t10) {
        C4753m.m18653f(t10, "element");
        return ((Enum) C2497j.m9969n(m13366d(), t10.ordinal())) == t10;
    }

    @Override // p115hd.AbstractC2483c, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public T get(int i10) {
        T[] m13366d = m13366d();
        AbstractC2483c.f9909h.m9883a(i10, m13366d.length);
        return m13366d[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p115hd.AbstractC2479a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return m13364b((Enum) obj);
        }
        return false;
    }

    /* renamed from: d */
    public final T[] m13366d() {
        T[] tArr = this.f12741j;
        if (tArr != null) {
            return tArr;
        }
        T[] invoke = this.f12740i.invoke();
        this.f12741j = invoke;
        return invoke;
    }

    /* renamed from: e */
    public int m13367e(T t10) {
        C4753m.m18653f(t10, "element");
        int ordinal = t10.ordinal();
        if (((Enum) C2497j.m9969n(m13366d(), ordinal)) == t10) {
            return ordinal;
        }
        return -1;
    }

    /* renamed from: h */
    public int m13368h(T t10) {
        C4753m.m18653f(t10, "element");
        return indexOf(t10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p115hd.AbstractC2483c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return m13367e((Enum) obj);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p115hd.AbstractC2483c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return m13368h((Enum) obj);
        }
        return -1;
    }
}
