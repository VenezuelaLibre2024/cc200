package p142j9;

import java.util.Iterator;
import java.util.Set;
import p353y7.C5867c;
import p353y7.C5885q;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;

/* renamed from: j9.c */
/* loaded from: classes.dex */
public class C3265c implements InterfaceC3271i {

    /* renamed from: a */
    public final String f11393a;

    /* renamed from: b */
    public final C3266d f11394b;

    public C3265c(Set<AbstractC3268f> set, C3266d c3266d) {
        this.f11393a = m11816e(set);
        this.f11394b = c3266d;
    }

    /* renamed from: c */
    public static C5867c<InterfaceC3271i> m11814c() {
        return C5867c.m23454c(InterfaceC3271i.class).m23473b(C5885q.m23555n(AbstractC3268f.class)).m23477f(new InterfaceC5875g() { // from class: j9.b
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                InterfaceC3271i m11815d;
                m11815d = C3265c.m11815d(interfaceC5869d);
                return m11815d;
            }
        }).m23475d();
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC3271i m11815d(InterfaceC5869d interfaceC5869d) {
        return new C3265c(interfaceC5869d.m23497f(AbstractC3268f.class), C3266d.m11818a());
    }

    /* renamed from: e */
    public static String m11816e(Set<AbstractC3268f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AbstractC3268f> it = set.iterator();
        while (it.hasNext()) {
            AbstractC3268f next = it.next();
            sb2.append(next.mo11811b());
            sb2.append('/');
            sb2.append(next.mo11812c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // p142j9.InterfaceC3271i
    /* renamed from: a */
    public String mo11817a() {
        if (this.f11394b.m11819b().isEmpty()) {
            return this.f11393a;
        }
        return this.f11393a + ' ' + m11816e(this.f11394b.m11819b());
    }
}
