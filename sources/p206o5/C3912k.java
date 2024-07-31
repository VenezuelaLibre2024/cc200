package p206o5;

import java.io.IOException;

/* renamed from: o5.k */
/* loaded from: classes.dex */
public class C3912k extends IOException {

    /* renamed from: h */
    public final int f14048h;

    public C3912k(int i10) {
        this.f14048h = i10;
    }

    public C3912k(String str, int i10) {
        super(str);
        this.f14048h = i10;
    }

    public C3912k(String str, Throwable th, int i10) {
        super(str, th);
        this.f14048h = i10;
    }

    public C3912k(Throwable th, int i10) {
        super(th);
        this.f14048h = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r2 = r2;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m14831a(java.io.IOException r2) {
        /*
        L0:
            if (r2 == 0) goto L16
            boolean r0 = r2 instanceof p206o5.C3912k
            if (r0 == 0) goto L11
            r0 = r2
            o5.k r0 = (p206o5.C3912k) r0
            int r0 = r0.f14048h
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r0 != r1) goto L11
            r2 = 1
            return r2
        L11:
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        L16:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p206o5.C3912k.m14831a(java.io.IOException):boolean");
    }
}
