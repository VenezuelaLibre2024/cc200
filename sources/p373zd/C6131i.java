package p373zd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p115hd.C2502n;
import sd.InterfaceC4580l;
import td.C4753m;

/* renamed from: zd.i */
/* loaded from: classes2.dex */
public class C6131i extends C6130h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: zd.i$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Iterable<T> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC6124b f22688h;

        public a(InterfaceC6124b interfaceC6124b) {
            this.f22688h = interfaceC6124b;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f22688h.iterator();
        }
    }

    /* renamed from: e */
    public static final <T> Iterable<T> m24442e(InterfaceC6124b<? extends T> interfaceC6124b) {
        C4753m.m18653f(interfaceC6124b, "<this>");
        return new a(interfaceC6124b);
    }

    /* renamed from: f */
    public static final <T, R> InterfaceC6124b<R> m24443f(InterfaceC6124b<? extends T> interfaceC6124b, InterfaceC4580l<? super T, ? extends R> interfaceC4580l) {
        C4753m.m18653f(interfaceC6124b, "<this>");
        C4753m.m18653f(interfaceC4580l, "transform");
        return new C6132j(interfaceC6124b, interfaceC4580l);
    }

    /* renamed from: g */
    public static final <T, C extends Collection<? super T>> C m24444g(InterfaceC6124b<? extends T> interfaceC6124b, C c10) {
        C4753m.m18653f(interfaceC6124b, "<this>");
        C4753m.m18653f(c10, "destination");
        Iterator<? extends T> it = interfaceC6124b.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    /* renamed from: h */
    public static final <T> List<T> m24445h(InterfaceC6124b<? extends T> interfaceC6124b) {
        C4753m.m18653f(interfaceC6124b, "<this>");
        return C2502n.m9993i(m24446i(interfaceC6124b));
    }

    /* renamed from: i */
    public static final <T> List<T> m24446i(InterfaceC6124b<? extends T> interfaceC6124b) {
        C4753m.m18653f(interfaceC6124b, "<this>");
        return (List) m24444g(interfaceC6124b, new ArrayList());
    }
}
