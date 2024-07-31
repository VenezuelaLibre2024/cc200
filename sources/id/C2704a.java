package id;

/* renamed from: id.a */
/* loaded from: classes2.dex */
public class C2704a {
    /* renamed from: a */
    public static final <T extends Comparable<?>> int m11031a(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }
}
