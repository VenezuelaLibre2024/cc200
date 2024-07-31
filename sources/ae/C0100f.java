package ae;

import sd.InterfaceC4580l;
import td.C4753m;

/* renamed from: ae.f */
/* loaded from: classes2.dex */
public class C0100f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* renamed from: a */
    public static final <T> void m413a(Appendable appendable, T t10, InterfaceC4580l<? super T, ? extends CharSequence> interfaceC4580l) {
        CharSequence valueOf;
        C4753m.m18653f(appendable, "<this>");
        if (interfaceC4580l != null) {
            t10 = (T) interfaceC4580l.invoke(t10);
        } else {
            if (!(t10 == 0 ? true : t10 instanceof CharSequence)) {
                if (t10 instanceof Character) {
                    appendable.append(((Character) t10).charValue());
                    return;
                } else {
                    valueOf = String.valueOf((Object) t10);
                    appendable.append(valueOf);
                }
            }
        }
        valueOf = (CharSequence) t10;
        appendable.append(valueOf);
    }
}
