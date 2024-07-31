package p034c7;

import p108h6.C2394s;

/* renamed from: c7.n9 */
/* loaded from: classes.dex */
public final class C0812n9 {
    /* renamed from: a */
    public static String m3646a(String str, String[] strArr, String[] strArr2) {
        C2394s.m9619l(strArr);
        C2394s.m9619l(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i10];
            }
        }
        return null;
    }
}
