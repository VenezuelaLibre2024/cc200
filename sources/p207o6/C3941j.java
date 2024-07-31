package p207o6;

import java.io.Closeable;
import java.io.IOException;

@Deprecated
/* renamed from: o6.j */
/* loaded from: classes.dex */
public final class C3941j {
    /* renamed from: a */
    public static void m14949a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
