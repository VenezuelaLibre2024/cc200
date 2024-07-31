package p274t2;

import p263s2.AbstractC4393a;
import p263s2.InterfaceC4396d;

/* renamed from: t2.d */
/* loaded from: classes.dex */
public class C4617d implements InterfaceC4396d {
    @Override // p263s2.InterfaceC4396d
    /* renamed from: a */
    public String mo17007a(StackTraceElement stackTraceElement) {
        return "";
    }

    @Override // p263s2.InterfaceC4396d
    /* renamed from: b */
    public String mo17008b(StackTraceElement stackTraceElement, boolean z10, boolean z11) {
        String m18195e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(stackTraceElement.getClassName());
        sb2.append(".");
        sb2.append(stackTraceElement.getMethodName());
        if (stackTraceElement.isNativeMethod()) {
            m18195e = m18194d();
        } else if (stackTraceElement.getFileName() == null || stackTraceElement.getFileName().length() <= 0) {
            m18195e = m18195e();
        } else {
            sb2.append("(");
            sb2.append(stackTraceElement.getFileName());
            if (stackTraceElement.getLineNumber() >= 0) {
                sb2.append(":");
                sb2.append(stackTraceElement.getLineNumber());
            }
            m18195e = ")";
        }
        sb2.append(m18195e);
        if (z11) {
            sb2.append(mo17009c(stackTraceElement));
        }
        return sb2.toString();
    }

    @Override // p263s2.InterfaceC4396d
    /* renamed from: c */
    public String mo17009c(StackTraceElement stackTraceElement) {
        StringBuilder sb2 = new StringBuilder();
        String className = stackTraceElement.getClassName();
        Class<?> mo17005a = C4614a.f17296b.mo17005a(className);
        if (mo17005a != null) {
            sb2.append(AbstractC4393a.m17000m(AbstractC4393a.m16999l(mo17005a), AbstractC4393a.m17004q(C4614a.f17295a, mo17005a, AbstractC4393a.m17001n(className))));
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public String m18194d() {
        return "(Native Method)";
    }

    /* renamed from: e */
    public String m18195e() {
        return "(Unknown Source)";
    }
}
