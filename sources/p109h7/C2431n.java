package p109h7;

import java.util.logging.Logger;

/* renamed from: h7.n */
/* loaded from: classes.dex */
public final class C2431n {

    /* renamed from: a */
    public static final Logger f9760a = Logger.getLogger(C2431n.class.getName());

    /* renamed from: b */
    public static final InterfaceC2430m f9761b = m9693b();

    /* renamed from: h7.n$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC2430m {
        public b() {
        }
    }

    /* renamed from: a */
    public static String m9692a(String str) {
        if (m9694c(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static InterfaceC2430m m9693b() {
        return new b();
    }

    /* renamed from: c */
    public static boolean m9694c(String str) {
        return str == null || str.isEmpty();
    }
}
