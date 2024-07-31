package p243qd;

import java.io.File;
import td.C4753m;

/* renamed from: qd.d */
/* loaded from: classes2.dex */
public final class C4237d {
    /* renamed from: b */
    public static final String m16276b(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": " + str);
        }
        String sb3 = sb2.toString();
        C4753m.m18652e(sb3, "sb.toString()");
        return sb3;
    }
}
