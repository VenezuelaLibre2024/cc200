package p173ld;

import java.lang.reflect.Field;
import td.C4753m;

/* renamed from: ld.g */
/* loaded from: classes2.dex */
public final class C3473g {
    /* renamed from: a */
    public static final void m12921a(int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    public static final InterfaceC3472f m12922b(AbstractC3467a abstractC3467a) {
        return (InterfaceC3472f) abstractC3467a.getClass().getAnnotation(InterfaceC3472f.class);
    }

    /* renamed from: c */
    public static final int m12923c(AbstractC3467a abstractC3467a) {
        try {
            Field declaredField = abstractC3467a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC3467a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m12924d(AbstractC3467a abstractC3467a) {
        String str;
        C4753m.m18653f(abstractC3467a, "<this>");
        InterfaceC3472f m12922b = m12922b(abstractC3467a);
        if (m12922b == null) {
            return null;
        }
        m12921a(1, m12922b.m12920v());
        int m12923c = m12923c(abstractC3467a);
        int i10 = m12923c < 0 ? -1 : m12922b.m12918l()[m12923c];
        String m12929b = C3475i.f12179a.m12929b(abstractC3467a);
        if (m12929b == null) {
            str = m12922b.m12916c();
        } else {
            str = m12929b + '/' + m12922b.m12916c();
        }
        return new StackTraceElement(str, m12922b.m12919m(), m12922b.m12917f(), i10);
    }
}
