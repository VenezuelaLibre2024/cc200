package p264s3;

import java.util.HashSet;

/* renamed from: s3.j1 */
/* loaded from: classes.dex */
public final class C4448j1 {

    /* renamed from: a */
    public static final HashSet<String> f16405a = new HashSet<>();

    /* renamed from: b */
    public static String f16406b = "goog.exo.core";

    /* renamed from: a */
    public static synchronized void m17365a(String str) {
        synchronized (C4448j1.class) {
            if (f16405a.add(str)) {
                f16406b += ", " + str;
            }
        }
    }

    /* renamed from: b */
    public static synchronized String m17366b() {
        String str;
        synchronized (C4448j1.class) {
            str = f16406b;
        }
        return str;
    }
}
