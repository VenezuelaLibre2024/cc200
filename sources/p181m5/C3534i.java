package p181m5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p264s3.C4499t2;

/* renamed from: m5.i */
/* loaded from: classes.dex */
public final class C3534i {

    /* renamed from: a */
    public static final Pattern f12414a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static Matcher m13166a(C4015a0 c4015a0) {
        String m15243r;
        while (true) {
            String m15243r2 = c4015a0.m15243r();
            if (m15243r2 == null) {
                return null;
            }
            if (f12414a.matcher(m15243r2).matches()) {
                do {
                    m15243r = c4015a0.m15243r();
                    if (m15243r != null) {
                    }
                } while (!m15243r.isEmpty());
            } else {
                Matcher matcher = C3531f.f12387a.matcher(m15243r2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m13167b(C4015a0 c4015a0) {
        String m15243r = c4015a0.m15243r();
        return m15243r != null && m15243r.startsWith("WEBVTT");
    }

    /* renamed from: c */
    public static float m13168c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: d */
    public static long m13169d(String str) {
        String[] m15428R0 = C4041n0.m15428R0(str, "\\.");
        long j10 = 0;
        for (String str2 : C4041n0.m15426Q0(m15428R0[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (m15428R0.length == 2) {
            j11 += Long.parseLong(m15428R0[1]);
        }
        return j11 * 1000;
    }

    /* renamed from: e */
    public static void m13170e(C4015a0 c4015a0) {
        int m15231f = c4015a0.m15231f();
        if (m13167b(c4015a0)) {
            return;
        }
        c4015a0.m15223T(m15231f);
        throw C4499t2.m17594a("Expected WEBVTT. Got " + c4015a0.m15243r(), null);
    }
}
