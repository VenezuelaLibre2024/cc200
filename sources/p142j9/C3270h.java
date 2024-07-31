package p142j9;

import android.content.Context;
import p353y7.C5867c;
import p353y7.C5885q;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;

/* renamed from: j9.h */
/* loaded from: classes.dex */
public class C3270h {

    /* renamed from: j9.h$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        /* renamed from: a */
        String mo11826a(T t10);
    }

    /* renamed from: b */
    public static C5867c<?> m11823b(String str, String str2) {
        return C5867c.m23458l(AbstractC3268f.m11821a(str, str2), AbstractC3268f.class);
    }

    /* renamed from: c */
    public static C5867c<?> m11824c(final String str, final a<Context> aVar) {
        return C5867c.m23459m(AbstractC3268f.class).m23473b(C5885q.m23551j(Context.class)).m23477f(new InterfaceC5875g() { // from class: j9.g
            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                AbstractC3268f m11825d;
                m11825d = C3270h.m11825d(str, aVar, interfaceC5869d);
                return m11825d;
            }
        }).m23475d();
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC3268f m11825d(String str, a aVar, InterfaceC5869d interfaceC5869d) {
        return AbstractC3268f.m11821a(str, aVar.mo11826a((Context) interfaceC5869d.get(Context.class)));
    }
}
