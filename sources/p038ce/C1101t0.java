package p038ce;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ce.t0 */
/* loaded from: classes2.dex */
public final class C1101t0 {

    /* renamed from: a */
    public static final boolean f4087a = false;

    /* renamed from: b */
    public static final boolean f4088b;

    /* renamed from: c */
    public static final boolean f4089c;

    /* renamed from: d */
    public static final AtomicLong f4090d;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r0.equals("on") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
    
        if (r0.equals("") != false) goto L23;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = p116he.C2540m0.m10115d(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L63
            int r3 = r0.hashCode()
            if (r3 == 0) goto L39
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L30
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L27
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L43
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
            goto L63
        L27:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
            goto L63
        L30:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
            goto L41
        L39:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
        L41:
            r0 = r1
            goto L64
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r2.append(r3)
            r2.append(r0)
            r0 = 39
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L63:
            r0 = r2
        L64:
            p038ce.C1101t0.f4088b = r0
            if (r0 == 0) goto L71
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = p116he.C2540m0.m10117f(r0, r1)
            if (r0 == 0) goto L71
            goto L72
        L71:
            r1 = r2
        L72:
            p038ce.C1101t0.f4089c = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            p038ce.C1101t0.f4090d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p038ce.C1101t0.<clinit>():void");
    }

    /* renamed from: a */
    public static final boolean m4573a() {
        return f4087a;
    }

    /* renamed from: b */
    public static final AtomicLong m4574b() {
        return f4090d;
    }

    /* renamed from: c */
    public static final boolean m4575c() {
        return f4088b;
    }

    /* renamed from: d */
    public static final boolean m4576d() {
        return f4089c;
    }
}
