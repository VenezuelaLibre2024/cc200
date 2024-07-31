package ve;

/* renamed from: ve.f */
/* loaded from: classes2.dex */
public final class C5171f {
    /* renamed from: a */
    public static boolean m20942a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: b */
    public static boolean m20943b(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* renamed from: c */
    public static boolean m20944c(String str) {
        return !str.equals("PROPFIND");
    }

    /* renamed from: d */
    public static boolean m20945d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m20946e(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
