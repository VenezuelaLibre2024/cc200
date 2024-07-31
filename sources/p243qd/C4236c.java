package p243qd;

import gd.C2227a;
import java.io.Closeable;

/* renamed from: qd.c */
/* loaded from: classes2.dex */
public final class C4236c {
    /* renamed from: a */
    public static final void m16274a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C2227a.m8956a(th, th2);
            }
        }
    }
}
