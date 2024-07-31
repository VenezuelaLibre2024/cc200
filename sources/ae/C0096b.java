package ae;

/* renamed from: ae.b */
/* loaded from: classes2.dex */
public class C0096b extends C0095a {
    /* renamed from: d */
    public static final boolean m403d(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
