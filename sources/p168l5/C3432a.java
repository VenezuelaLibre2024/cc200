package p168l5;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import java.nio.charset.Charset;
import java.util.List;
import p047d5.AbstractC1552g;
import p047d5.C1547b;
import p047d5.C1555j;
import p047d5.InterfaceC1553h;
import p109h7.C2422e;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;

/* renamed from: l5.a */
/* loaded from: classes.dex */
public final class C3432a extends AbstractC1552g {

    /* renamed from: o */
    public final C4015a0 f12066o;

    /* renamed from: p */
    public final boolean f12067p;

    /* renamed from: q */
    public final int f12068q;

    /* renamed from: r */
    public final int f12069r;

    /* renamed from: s */
    public final String f12070s;

    /* renamed from: t */
    public final float f12071t;

    /* renamed from: u */
    public final int f12072u;

    public C3432a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f12066o = new C4015a0();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f12068q = 0;
            this.f12069r = -1;
            this.f12070s = "sans-serif";
            this.f12067p = false;
            this.f12071t = 0.85f;
            this.f12072u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f12068q = bArr[24];
        this.f12069r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f12070s = "Serif".equals(C4041n0.m15401E(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f12072u = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f12067p = z10;
        if (z10) {
            this.f12071t = C4041n0.m15475p(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f12071t = 0.85f;
        }
    }

    /* renamed from: C */
    public static void m12777C(boolean z10) {
        if (!z10) {
            throw new C1555j("Unexpected subtitle format.");
        }
    }

    /* renamed from: D */
    public static void m12778D(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m12779E(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L4c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto Lc
            r10 = r1
            goto Ld
        Lc:
            r10 = r0
        Ld:
            r2 = r6 & 2
            if (r2 == 0) goto L13
            r2 = r1
            goto L14
        L13:
            r2 = r0
        L14:
            if (r10 == 0) goto L23
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L1f
            r4 = 3
            r3.<init>(r4)
            goto L2b
        L1f:
            r3.<init>(r1)
            goto L2b
        L23:
            if (r2 == 0) goto L2e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L2b:
            r5.setSpan(r3, r8, r9, r7)
        L2e:
            r6 = r6 & 4
            if (r6 == 0) goto L33
            goto L34
        L33:
            r1 = r0
        L34:
            if (r1 == 0) goto L3e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L3e:
            if (r1 != 0) goto L4c
            if (r10 != 0) goto L4c
            if (r2 != 0) goto L4c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p168l5.C3432a.m12779E(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    /* renamed from: F */
    public static void m12780F(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    /* renamed from: G */
    public static String m12781G(C4015a0 c4015a0) {
        m12777C(c4015a0.m15226a() >= 2);
        int m15216M = c4015a0.m15216M();
        if (m15216M == 0) {
            return "";
        }
        int m15231f = c4015a0.m15231f();
        Charset m15218O = c4015a0.m15218O();
        int m15231f2 = m15216M - (c4015a0.m15231f() - m15231f);
        if (m15218O == null) {
            m15218O = C2422e.f9747c;
        }
        return c4015a0.m15208E(m15231f2, m15218O);
    }

    /* renamed from: B */
    public final void m12782B(C4015a0 c4015a0, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        m12777C(c4015a0.m15226a() >= 12);
        int m15216M = c4015a0.m15216M();
        int m15216M2 = c4015a0.m15216M();
        c4015a0.m15224U(2);
        int m15210G = c4015a0.m15210G();
        c4015a0.m15224U(1);
        int m15241p = c4015a0.m15241p();
        if (m15216M2 > spannableStringBuilder.length()) {
            C4046r.m15529i("Tx3gDecoder", "Truncating styl end (" + m15216M2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            i10 = spannableStringBuilder.length();
        } else {
            i10 = m15216M2;
        }
        if (m15216M < i10) {
            int i11 = i10;
            m12779E(spannableStringBuilder, m15210G, this.f12068q, m15216M, i11, 0);
            m12778D(spannableStringBuilder, m15241p, this.f12069r, m15216M, i11, 0);
            return;
        }
        C4046r.m15529i("Tx3gDecoder", "Ignoring styl with start (" + m15216M + ") >= end (" + i10 + ").");
    }

    @Override // p047d5.AbstractC1552g
    /* renamed from: z */
    public InterfaceC1553h mo6363z(byte[] bArr, int i10, boolean z10) {
        this.f12066o.m15221R(bArr, i10);
        String m12781G = m12781G(this.f12066o);
        if (m12781G.isEmpty()) {
            return C3433b.f12073i;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m12781G);
        m12779E(spannableStringBuilder, this.f12068q, 0, 0, spannableStringBuilder.length(), 16711680);
        m12778D(spannableStringBuilder, this.f12069r, -1, 0, spannableStringBuilder.length(), 16711680);
        m12780F(spannableStringBuilder, this.f12070s, 0, spannableStringBuilder.length());
        float f10 = this.f12071t;
        while (this.f12066o.m15226a() >= 8) {
            int m15231f = this.f12066o.m15231f();
            int m15241p = this.f12066o.m15241p();
            int m15241p2 = this.f12066o.m15241p();
            if (m15241p2 == 1937013100) {
                m12777C(this.f12066o.m15226a() >= 2);
                int m15216M = this.f12066o.m15216M();
                for (int i11 = 0; i11 < m15216M; i11++) {
                    m12782B(this.f12066o, spannableStringBuilder);
                }
            } else if (m15241p2 == 1952608120 && this.f12067p) {
                m12777C(this.f12066o.m15226a() >= 2);
                f10 = C4041n0.m15475p(this.f12066o.m15216M() / this.f12072u, 0.0f, 0.95f);
            }
            this.f12066o.m15223T(m15231f + m15241p);
        }
        return new C3433b(new C1547b.b().m6332o(spannableStringBuilder).m6325h(f10, 0).m6326i(0).m6318a());
    }
}
