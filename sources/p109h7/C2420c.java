package p109h7;

/* renamed from: h7.c */
/* loaded from: classes.dex */
public final class C2420c {
    /* renamed from: a */
    public static boolean m9661a(CharSequence charSequence, CharSequence charSequence2) {
        int m9662b;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = charSequence.charAt(i10);
            char charAt2 = charSequence2.charAt(i10);
            if (charAt != charAt2 && ((m9662b = m9662b(charAt)) >= 26 || m9662b != m9662b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static int m9662b(char c10) {
        return (char) ((c10 | ' ') - 97);
    }

    /* renamed from: c */
    public static boolean m9663c(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    /* renamed from: d */
    public static boolean m9664d(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    /* renamed from: e */
    public static String m9665e(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (m9664d(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (m9664d(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    /* renamed from: f */
    public static String m9666f(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (m9663c(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (m9663c(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }
}