package p373zd;

import gd.C2245s;
import java.util.Iterator;
import p146jd.InterfaceC3281d;
import p161kd.C3384b;
import sd.InterfaceC4584p;
import td.C4753m;

/* renamed from: zd.e */
/* loaded from: classes2.dex */
public class C6127e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: zd.e$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements InterfaceC6124b<T> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4584p f22686a;

        public a(InterfaceC4584p interfaceC4584p) {
            this.f22686a = interfaceC4584p;
        }

        @Override // p373zd.InterfaceC6124b
        public Iterator<T> iterator() {
            return C6127e.m24438a(this.f22686a);
        }
    }

    /* renamed from: a */
    public static final <T> Iterator<T> m24438a(InterfaceC4584p<? super AbstractC6126d<? super T>, ? super InterfaceC3281d<? super C2245s>, ? extends Object> interfaceC4584p) {
        C4753m.m18653f(interfaceC4584p, "block");
        C6125c c6125c = new C6125c();
        c6125c.m24437j(C3384b.m12579a(interfaceC4584p, c6125c, c6125c));
        return c6125c;
    }

    /* renamed from: b */
    public static final <T> InterfaceC6124b<T> m24439b(InterfaceC4584p<? super AbstractC6126d<? super T>, ? super InterfaceC3281d<? super C2245s>, ? extends Object> interfaceC4584p) {
        C4753m.m18653f(interfaceC4584p, "block");
        return new a(interfaceC4584p);
    }
}
