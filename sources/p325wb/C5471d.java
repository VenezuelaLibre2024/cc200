package p325wb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: wb.d */
/* loaded from: classes.dex */
public class C5471d {

    /* renamed from: a */
    public final Pattern f20359a = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)");

    /* renamed from: a */
    public float[] m21679a(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f20359a.matcher(str);
        if (matcher.find() && matcher.groupCount() == 2) {
            try {
                return new float[]{Float.parseFloat(matcher.group(1)), Float.parseFloat(matcher.group(2))};
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
