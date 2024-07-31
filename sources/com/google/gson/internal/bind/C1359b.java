package com.google.gson.internal.bind;

import com.google.gson.AbstractC1374j;
import com.google.gson.C1305g;
import com.google.gson.C1376l;
import com.google.gson.C1377m;
import com.google.gson.C1379o;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p355y9.C5899c;

/* renamed from: com.google.gson.internal.bind.b */
/* loaded from: classes.dex */
public final class C1359b extends C5899c {

    /* renamed from: v */
    public static final Writer f5136v = new a();

    /* renamed from: w */
    public static final C1379o f5137w = new C1379o("closed");

    /* renamed from: s */
    public final List<AbstractC1374j> f5138s;

    /* renamed from: t */
    public String f5139t;

    /* renamed from: u */
    public AbstractC1374j f5140u;

    /* renamed from: com.google.gson.internal.bind.b$a */
    /* loaded from: classes.dex */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public C1359b() {
        super(f5136v);
        this.f5138s = new ArrayList();
        this.f5140u = C1376l.f5213a;
    }

    /* renamed from: G0 */
    public final AbstractC1374j m5776G0() {
        return this.f5138s.get(r0.size() - 1);
    }

    /* renamed from: H0 */
    public final void m5777H0(AbstractC1374j abstractC1374j) {
        if (this.f5139t != null) {
            if (!abstractC1374j.m5839j() || m23604x()) {
                ((C1377m) m5776G0()).m5842n(this.f5139t, abstractC1374j);
            }
            this.f5139t = null;
            return;
        }
        if (this.f5138s.isEmpty()) {
            this.f5140u = abstractC1374j;
            return;
        }
        AbstractC1374j m5776G0 = m5776G0();
        if (!(m5776G0 instanceof C1305g)) {
            throw new IllegalStateException();
        }
        ((C1305g) m5776G0).m5622n(abstractC1374j);
    }

    @Override // p355y9.C5899c
    /* renamed from: K */
    public C5899c mo5778K(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f5138s.isEmpty() || this.f5139t != null) {
            throw new IllegalStateException();
        }
        if (!(m5776G0() instanceof C1377m)) {
            throw new IllegalStateException();
        }
        this.f5139t = str;
        return this;
    }

    @Override // p355y9.C5899c
    /* renamed from: W */
    public C5899c mo5779W() {
        m5777H0(C1376l.f5213a);
        return this;
    }

    @Override // p355y9.C5899c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f5138s.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f5138s.add(f5137w);
    }

    @Override // p355y9.C5899c
    /* renamed from: f */
    public C5899c mo5780f() {
        C1305g c1305g = new C1305g();
        m5777H0(c1305g);
        this.f5138s.add(c1305g);
        return this;
    }

    @Override // p355y9.C5899c, java.io.Flushable
    public void flush() {
    }

    @Override // p355y9.C5899c
    /* renamed from: j */
    public C5899c mo5781j() {
        C1377m c1377m = new C1377m();
        m5777H0(c1377m);
        this.f5138s.add(c1377m);
        return this;
    }

    @Override // p355y9.C5899c
    /* renamed from: n */
    public C5899c mo5782n() {
        if (this.f5138s.isEmpty() || this.f5139t != null) {
            throw new IllegalStateException();
        }
        if (!(m5776G0() instanceof C1305g)) {
            throw new IllegalStateException();
        }
        this.f5138s.remove(r0.size() - 1);
        return this;
    }

    @Override // p355y9.C5899c
    /* renamed from: r0 */
    public C5899c mo5783r0(long j10) {
        m5777H0(new C1379o(Long.valueOf(j10)));
        return this;
    }

    @Override // p355y9.C5899c
    /* renamed from: s0 */
    public C5899c mo5784s0(Boolean bool) {
        if (bool == null) {
            return mo5779W();
        }
        m5777H0(new C1379o(bool));
        return this;
    }

    @Override // p355y9.C5899c
    /* renamed from: u0 */
    public C5899c mo5785u0(Number number) {
        if (number == null) {
            return mo5779W();
        }
        if (!m23590I()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m5777H0(new C1379o(number));
        return this;
    }

    @Override // p355y9.C5899c
    /* renamed from: v0 */
    public C5899c mo5786v0(String str) {
        if (str == null) {
            return mo5779W();
        }
        m5777H0(new C1379o(str));
        return this;
    }

    @Override // p355y9.C5899c
    /* renamed from: w */
    public C5899c mo5787w() {
        if (this.f5138s.isEmpty() || this.f5139t != null) {
            throw new IllegalStateException();
        }
        if (!(m5776G0() instanceof C1377m)) {
            throw new IllegalStateException();
        }
        this.f5138s.remove(r0.size() - 1);
        return this;
    }

    @Override // p355y9.C5899c
    /* renamed from: x0 */
    public C5899c mo5788x0(boolean z10) {
        m5777H0(new C1379o(Boolean.valueOf(z10)));
        return this;
    }

    /* renamed from: z0 */
    public AbstractC1374j m5789z0() {
        if (this.f5138s.isEmpty()) {
            return this.f5140u;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f5138s);
    }
}
