package p281t9;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p353y7.C5867c;
import p353y7.InterfaceC5869d;
import p353y7.InterfaceC5875g;
import p353y7.InterfaceC5877i;

/* renamed from: t9.b */
/* loaded from: classes.dex */
public class C4734b implements InterfaceC5877i {
    /* renamed from: c */
    public static /* synthetic */ Object m18602c(String str, C5867c c5867c, InterfaceC5869d interfaceC5869d) {
        try {
            C4735c.m18605b(str);
            return c5867c.m23464h().mo319a(interfaceC5869d);
        } finally {
            C4735c.m18604a();
        }
    }

    @Override // p353y7.InterfaceC5877i
    /* renamed from: a */
    public List<C5867c<?>> mo18603a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C5867c<?> c5867c : componentRegistrar.getComponents()) {
            final String m23465i = c5867c.m23465i();
            if (m23465i != null) {
                c5867c = c5867c.m23471t(new InterfaceC5875g() { // from class: t9.a
                    @Override // p353y7.InterfaceC5875g
                    /* renamed from: a */
                    public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                        Object m18602c;
                        m18602c = C4734b.m18602c(m23465i, c5867c, interfaceC5869d);
                        return m18602c;
                    }
                });
            }
            arrayList.add(c5867c);
        }
        return arrayList;
    }
}
