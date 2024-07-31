package com.google.gson.internal.bind;

import com.google.gson.AbstractC1374j;
import com.google.gson.C1305g;
import com.google.gson.C1376l;
import com.google.gson.C1377m;
import com.google.gson.C1379o;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p355y9.C5897a;
import p355y9.EnumC5898b;

/* renamed from: com.google.gson.internal.bind.a */
/* loaded from: classes.dex */
public final class C1358a extends C5897a {

    /* renamed from: A */
    public static final Reader f5130A = new a();

    /* renamed from: B */
    public static final Object f5131B = new Object();

    /* renamed from: w */
    public Object[] f5132w;

    /* renamed from: x */
    public int f5133x;

    /* renamed from: y */
    public String[] f5134y;

    /* renamed from: z */
    public int[] f5135z;

    /* renamed from: com.google.gson.internal.bind.a$a */
    /* loaded from: classes.dex */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public C1358a(AbstractC1374j abstractC1374j) {
        super(f5130A);
        this.f5132w = new Object[32];
        this.f5133x = 0;
        this.f5134y = new String[32];
        this.f5135z = new int[32];
        m5762Q0(abstractC1374j);
    }

    /* renamed from: P */
    private String m5754P() {
        return " at path " + mo5773o0();
    }

    @Override // p355y9.C5897a
    /* renamed from: E */
    public boolean mo5755E() {
        EnumC5898b mo5774r0 = mo5774r0();
        return (mo5774r0 == EnumC5898b.END_OBJECT || mo5774r0 == EnumC5898b.END_ARRAY) ? false : true;
    }

    @Override // p355y9.C5897a
    /* renamed from: J0 */
    public void mo5756J0() {
        if (mo5774r0() == EnumC5898b.NAME) {
            mo5769f0();
            this.f5134y[this.f5133x - 2] = "null";
        } else {
            m5760O0();
            int i10 = this.f5133x;
            if (i10 > 0) {
                this.f5134y[i10 - 1] = "null";
            }
        }
        int i11 = this.f5133x;
        if (i11 > 0) {
            int[] iArr = this.f5135z;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    /* renamed from: L0 */
    public final void m5757L0(EnumC5898b enumC5898b) {
        if (mo5774r0() == enumC5898b) {
            return;
        }
        throw new IllegalStateException("Expected " + enumC5898b + " but was " + mo5774r0() + m5754P());
    }

    /* renamed from: M0 */
    public AbstractC1374j m5758M0() {
        EnumC5898b mo5774r0 = mo5774r0();
        if (mo5774r0 != EnumC5898b.NAME && mo5774r0 != EnumC5898b.END_ARRAY && mo5774r0 != EnumC5898b.END_OBJECT && mo5774r0 != EnumC5898b.END_DOCUMENT) {
            AbstractC1374j abstractC1374j = (AbstractC1374j) m5759N0();
            mo5756J0();
            return abstractC1374j;
        }
        throw new IllegalStateException("Unexpected " + mo5774r0 + " when reading a JsonElement.");
    }

    /* renamed from: N0 */
    public final Object m5759N0() {
        return this.f5132w[this.f5133x - 1];
    }

    /* renamed from: O0 */
    public final Object m5760O0() {
        Object[] objArr = this.f5132w;
        int i10 = this.f5133x - 1;
        this.f5133x = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    /* renamed from: P0 */
    public void m5761P0() {
        m5757L0(EnumC5898b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m5759N0()).next();
        m5762Q0(entry.getValue());
        m5762Q0(new C1379o((String) entry.getKey()));
    }

    /* renamed from: Q0 */
    public final void m5762Q0(Object obj) {
        int i10 = this.f5133x;
        Object[] objArr = this.f5132w;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f5132w = Arrays.copyOf(objArr, i11);
            this.f5135z = Arrays.copyOf(this.f5135z, i11);
            this.f5134y = (String[]) Arrays.copyOf(this.f5134y, i11);
        }
        Object[] objArr2 = this.f5132w;
        int i12 = this.f5133x;
        this.f5133x = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // p355y9.C5897a
    /* renamed from: W */
    public boolean mo5763W() {
        m5757L0(EnumC5898b.BOOLEAN);
        boolean mo5620a = ((C1379o) m5760O0()).mo5620a();
        int i10 = this.f5133x;
        if (i10 > 0) {
            int[] iArr = this.f5135z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return mo5620a;
    }

    @Override // p355y9.C5897a
    /* renamed from: a */
    public void mo5764a() {
        m5757L0(EnumC5898b.BEGIN_ARRAY);
        m5762Q0(((C1305g) m5759N0()).iterator());
        this.f5135z[this.f5133x - 1] = 0;
    }

    @Override // p355y9.C5897a
    /* renamed from: b0 */
    public double mo5765b0() {
        EnumC5898b mo5774r0 = mo5774r0();
        EnumC5898b enumC5898b = EnumC5898b.NUMBER;
        if (mo5774r0 != enumC5898b && mo5774r0 != EnumC5898b.STRING) {
            throw new IllegalStateException("Expected " + enumC5898b + " but was " + mo5774r0 + m5754P());
        }
        double m5847n = ((C1379o) m5759N0()).m5847n();
        if (!m23571I() && (Double.isNaN(m5847n) || Double.isInfinite(m5847n))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + m5847n);
        }
        m5760O0();
        int i10 = this.f5133x;
        if (i10 > 0) {
            int[] iArr = this.f5135z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return m5847n;
    }

    @Override // p355y9.C5897a
    /* renamed from: c0 */
    public int mo5766c0() {
        EnumC5898b mo5774r0 = mo5774r0();
        EnumC5898b enumC5898b = EnumC5898b.NUMBER;
        if (mo5774r0 != enumC5898b && mo5774r0 != EnumC5898b.STRING) {
            throw new IllegalStateException("Expected " + enumC5898b + " but was " + mo5774r0 + m5754P());
        }
        int m5848o = ((C1379o) m5759N0()).m5848o();
        m5760O0();
        int i10 = this.f5133x;
        if (i10 > 0) {
            int[] iArr = this.f5135z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return m5848o;
    }

    @Override // p355y9.C5897a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5132w = new Object[]{f5131B};
        this.f5133x = 1;
    }

    @Override // p355y9.C5897a
    /* renamed from: d */
    public void mo5767d() {
        m5757L0(EnumC5898b.BEGIN_OBJECT);
        m5762Q0(((C1377m) m5759N0()).m5843o().iterator());
    }

    @Override // p355y9.C5897a
    /* renamed from: e0 */
    public long mo5768e0() {
        EnumC5898b mo5774r0 = mo5774r0();
        EnumC5898b enumC5898b = EnumC5898b.NUMBER;
        if (mo5774r0 != enumC5898b && mo5774r0 != EnumC5898b.STRING) {
            throw new IllegalStateException("Expected " + enumC5898b + " but was " + mo5774r0 + m5754P());
        }
        long m5849p = ((C1379o) m5759N0()).m5849p();
        m5760O0();
        int i10 = this.f5133x;
        if (i10 > 0) {
            int[] iArr = this.f5135z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return m5849p;
    }

    @Override // p355y9.C5897a
    /* renamed from: f0 */
    public String mo5769f0() {
        m5757L0(EnumC5898b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m5759N0()).next();
        String str = (String) entry.getKey();
        this.f5134y[this.f5133x - 1] = str;
        m5762Q0(entry.getValue());
        return str;
    }

    @Override // p355y9.C5897a
    /* renamed from: h0 */
    public void mo5770h0() {
        m5757L0(EnumC5898b.NULL);
        m5760O0();
        int i10 = this.f5133x;
        if (i10 > 0) {
            int[] iArr = this.f5135z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // p355y9.C5897a
    /* renamed from: l0 */
    public String mo5771l0() {
        EnumC5898b mo5774r0 = mo5774r0();
        EnumC5898b enumC5898b = EnumC5898b.STRING;
        if (mo5774r0 == enumC5898b || mo5774r0 == EnumC5898b.NUMBER) {
            String mo5621e = ((C1379o) m5760O0()).mo5621e();
            int i10 = this.f5133x;
            if (i10 > 0) {
                int[] iArr = this.f5135z;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return mo5621e;
        }
        throw new IllegalStateException("Expected " + enumC5898b + " but was " + mo5774r0 + m5754P());
    }

    @Override // p355y9.C5897a
    /* renamed from: n */
    public void mo5772n() {
        m5757L0(EnumC5898b.END_ARRAY);
        m5760O0();
        m5760O0();
        int i10 = this.f5133x;
        if (i10 > 0) {
            int[] iArr = this.f5135z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // p355y9.C5897a
    /* renamed from: o0 */
    public String mo5773o0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f5133x;
            if (i10 >= i11) {
                return sb2.toString();
            }
            Object[] objArr = this.f5132w;
            if (objArr[i10] instanceof C1305g) {
                i10++;
                if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                    sb2.append('[');
                    sb2.append(this.f5135z[i10]);
                    sb2.append(']');
                }
            } else if ((objArr[i10] instanceof C1377m) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                sb2.append('.');
                String[] strArr = this.f5134y;
                if (strArr[i10] != null) {
                    sb2.append(strArr[i10]);
                }
            }
            i10++;
        }
    }

    @Override // p355y9.C5897a
    /* renamed from: r0 */
    public EnumC5898b mo5774r0() {
        if (this.f5133x == 0) {
            return EnumC5898b.END_DOCUMENT;
        }
        Object m5759N0 = m5759N0();
        if (m5759N0 instanceof Iterator) {
            boolean z10 = this.f5132w[this.f5133x - 2] instanceof C1377m;
            Iterator it = (Iterator) m5759N0;
            if (!it.hasNext()) {
                return z10 ? EnumC5898b.END_OBJECT : EnumC5898b.END_ARRAY;
            }
            if (z10) {
                return EnumC5898b.NAME;
            }
            m5762Q0(it.next());
            return mo5774r0();
        }
        if (m5759N0 instanceof C1377m) {
            return EnumC5898b.BEGIN_OBJECT;
        }
        if (m5759N0 instanceof C1305g) {
            return EnumC5898b.BEGIN_ARRAY;
        }
        if (!(m5759N0 instanceof C1379o)) {
            if (m5759N0 instanceof C1376l) {
                return EnumC5898b.NULL;
            }
            if (m5759N0 == f5131B) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        C1379o c1379o = (C1379o) m5759N0;
        if (c1379o.m5853v()) {
            return EnumC5898b.STRING;
        }
        if (c1379o.m5851s()) {
            return EnumC5898b.BOOLEAN;
        }
        if (c1379o.m5852u()) {
            return EnumC5898b.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // p355y9.C5897a
    public String toString() {
        return C1358a.class.getSimpleName() + m5754P();
    }

    @Override // p355y9.C5897a
    /* renamed from: w */
    public void mo5775w() {
        m5757L0(EnumC5898b.END_OBJECT);
        m5760O0();
        m5760O0();
        int i10 = this.f5133x;
        if (i10 > 0) {
            int[] iArr = this.f5135z;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }
}
