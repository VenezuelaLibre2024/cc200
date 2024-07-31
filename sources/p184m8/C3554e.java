package p184m8;

import java.util.Stack;

/* renamed from: m8.e */
/* loaded from: classes.dex */
public class C3554e {

    /* renamed from: a */
    public final String f12451a;

    /* renamed from: b */
    public final String f12452b;

    /* renamed from: c */
    public final StackTraceElement[] f12453c;

    /* renamed from: d */
    public final C3554e f12454d;

    public C3554e(String str, String str2, StackTraceElement[] stackTraceElementArr, C3554e c3554e) {
        this.f12451a = str;
        this.f12452b = str2;
        this.f12453c = stackTraceElementArr;
        this.f12454d = c3554e;
    }

    /* renamed from: a */
    public static C3554e m13200a(Throwable th, InterfaceC3553d interfaceC3553d) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        C3554e c3554e = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            c3554e = new C3554e(th2.getLocalizedMessage(), th2.getClass().getName(), interfaceC3553d.mo13197a(th2.getStackTrace()), c3554e);
        }
        return c3554e;
    }
}
