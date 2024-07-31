package p001a;

/* renamed from: a.b */
/* loaded from: classes.dex */
public final class C0002b {

    /* renamed from: a */
    public static final String f3a = "_COROUTINE";

    /* renamed from: b */
    public static final StackTraceElement m4b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f3a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    /* renamed from: c */
    public static final String m5c() {
        return f3a;
    }
}
