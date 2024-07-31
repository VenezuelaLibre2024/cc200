package p116he;

/* renamed from: he.n0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2542n0 {

    /* renamed from: a */
    public static final int f9984a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m10120a() {
        return f9984a;
    }

    /* renamed from: b */
    public static final String m10121b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
