package p137j4;

import android.media.MediaCodec;
import p304v3.C5109f;

/* renamed from: j4.m */
/* loaded from: classes.dex */
public class C3234m extends C5109f {

    /* renamed from: h */
    public final C3235n f11232h;

    /* renamed from: i */
    public final String f11233i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3234m(java.lang.Throwable r4, p137j4.C3235n r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto Lf
            r2 = r1
            goto L11
        Lf:
            java.lang.String r2 = r5.f11234a
        L11:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f11232h = r5
            int r5 = p222p5.C4041n0.f14513a
            r0 = 21
            if (r5 < r0) goto L27
            java.lang.String r1 = m11568a(r4)
        L27:
            r3.f11233i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p137j4.C3234m.<init>(java.lang.Throwable, j4.n):void");
    }

    /* renamed from: a */
    public static String m11568a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
