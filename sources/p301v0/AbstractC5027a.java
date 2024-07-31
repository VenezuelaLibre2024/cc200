package p301v0;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p301v0.AbstractC5027a;
import p301v0.AbstractC5027a.a;
import p301v0.AbstractC5048h;
import p301v0.InterfaceC5079r0;

/* renamed from: v0.a */
/* loaded from: classes.dex */
public abstract class AbstractC5027a<MessageType extends AbstractC5027a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC5079r0 {
    public int memoizedHashCode = 0;

    /* renamed from: v0.a$a */
    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends AbstractC5027a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC5079r0.a {
        /* renamed from: l */
        public static <T> void m19783l(Iterable<T> iterable, List<? super T> list) {
            C5028a0.m19789a(iterable);
            if (!(iterable instanceof InterfaceC5046g0)) {
                if (iterable instanceof InterfaceC5029a1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    m19784m(iterable, list);
                    return;
                }
            }
            List<?> mo19936r = ((InterfaceC5046g0) iterable).mo19936r();
            InterfaceC5046g0 interfaceC5046g0 = (InterfaceC5046g0) list;
            int size = list.size();
            for (Object obj : mo19936r) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC5046g0.size() - size) + " is null.";
                    for (int size2 = interfaceC5046g0.size() - 1; size2 >= size; size2--) {
                        interfaceC5046g0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC5048h) {
                    interfaceC5046g0.mo19935l((AbstractC5048h) obj);
                } else {
                    interfaceC5046g0.add((String) obj);
                }
            }
        }

        /* renamed from: m */
        public static <T> void m19784m(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        /* renamed from: p */
        public static C5065m1 m19785p(InterfaceC5079r0 interfaceC5079r0) {
            return new C5065m1(interfaceC5079r0);
        }

        /* renamed from: n */
        public abstract BuilderType mo19787n(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p301v0.InterfaceC5079r0.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public BuilderType mo19786j(InterfaceC5079r0 interfaceC5079r0) {
            if (mo20526b().getClass().isInstance(interfaceC5079r0)) {
                return (BuilderType) mo19787n((AbstractC5027a) interfaceC5079r0);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* renamed from: d */
    public static <T> void m19775d(Iterable<T> iterable, List<? super T> list) {
        a.m19783l(iterable, list);
    }

    @Override // p301v0.InterfaceC5079r0
    /* renamed from: f */
    public AbstractC5048h mo19776f() {
        try {
            AbstractC5048h.h m19955p = AbstractC5048h.m19955p(mo20457g());
            mo20456e(m19955p.m19977b());
            return m19955p.m19976a();
        } catch (IOException e10) {
            throw new RuntimeException(m19779n("ByteString"), e10);
        }
    }

    /* renamed from: l */
    public int mo19777l() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: m */
    public int m19778m(InterfaceC5047g1 interfaceC5047g1) {
        int mo19777l = mo19777l();
        if (mo19777l != -1) {
            return mo19777l;
        }
        int mo19944g = interfaceC5047g1.mo19944g(this);
        mo19781p(mo19944g);
        return mo19944g;
    }

    /* renamed from: n */
    public final String m19779n(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: o */
    public C5065m1 m19780o() {
        return new C5065m1(this);
    }

    /* renamed from: p */
    public void mo19781p(int i10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public void m19782q(OutputStream outputStream) {
        AbstractC5057k m20197f0 = AbstractC5057k.m20197f0(outputStream, AbstractC5057k.m20173I(mo20457g()));
        mo20456e(m20197f0);
        m20197f0.mo20248c0();
    }
}
