package p153k5;

import android.text.TextUtils;
import java.util.regex.Pattern;
import p109h7.C2420c;
import p126i7.AbstractC2657x;

/* renamed from: k5.b */
/* loaded from: classes.dex */
public final class C3356b {

    /* renamed from: d */
    public static final Pattern f11671d = Pattern.compile("\\s+");

    /* renamed from: e */
    public static final AbstractC2657x<String> f11672e = AbstractC2657x.m10824u("auto", "none");

    /* renamed from: f */
    public static final AbstractC2657x<String> f11673f = AbstractC2657x.m10825v("dot", "sesame", "circle");

    /* renamed from: g */
    public static final AbstractC2657x<String> f11674g = AbstractC2657x.m10824u("filled", "open");

    /* renamed from: h */
    public static final AbstractC2657x<String> f11675h = AbstractC2657x.m10825v("after", "before", "outside");

    /* renamed from: a */
    public final int f11676a;

    /* renamed from: b */
    public final int f11677b;

    /* renamed from: c */
    public final int f11678c;

    public C3356b(int i10, int i11, int i12) {
        this.f11676a = i10;
        this.f11677b = i11;
        this.f11678c = i12;
    }

    /* renamed from: a */
    public static C3356b m12430a(String str) {
        if (str == null) {
            return null;
        }
        String m9665e = C2420c.m9665e(str.trim());
        if (m9665e.isEmpty()) {
            return null;
        }
        return m12431b(AbstractC2657x.m10821o(TextUtils.split(m9665e, f11671d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r9.equals("auto") != false) goto L38;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p153k5.C3356b m12431b(p126i7.AbstractC2657x<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p153k5.C3356b.m12431b(i7.x):k5.b");
    }
}
