package ae;

import java.util.NoSuchElementException;
import p343xd.C5767k;
import td.C4753m;

/* renamed from: ae.q */
/* loaded from: classes2.dex */
public class C0111q extends C0110p {
    /* renamed from: u0 */
    public static final String m490u0(String str, int i10) {
        C4753m.m18653f(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(C5767k.m22906c(i10, str.length()));
            C4753m.m18652e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: v0 */
    public static final char m491v0(CharSequence charSequence) {
        C4753m.m18653f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(C0109o.m485y(charSequence));
    }
}
