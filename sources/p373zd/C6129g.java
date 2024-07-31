package p373zd;

import java.util.Iterator;
import td.C4753m;

/* renamed from: zd.g */
/* loaded from: classes2.dex */
public class C6129g extends C6128f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: zd.g$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements InterfaceC6124b<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterator f22687a;

        public a(Iterator it) {
            this.f22687a = it;
        }

        @Override // p373zd.InterfaceC6124b
        public Iterator<T> iterator() {
            return this.f22687a;
        }
    }

    /* renamed from: c */
    public static final <T> InterfaceC6124b<T> m24440c(Iterator<? extends T> it) {
        C4753m.m18653f(it, "<this>");
        return m24441d(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static final <T> InterfaceC6124b<T> m24441d(InterfaceC6124b<? extends T> interfaceC6124b) {
        C4753m.m18653f(interfaceC6124b, "<this>");
        return interfaceC6124b instanceof C6123a ? interfaceC6124b : new C6123a(interfaceC6124b);
    }
}
