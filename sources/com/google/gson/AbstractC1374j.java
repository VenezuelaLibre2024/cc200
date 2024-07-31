package com.google.gson;

import com.google.gson.internal.C1368k;
import java.io.IOException;
import java.io.StringWriter;
import p355y9.C5899c;

/* renamed from: com.google.gson.j */
/* loaded from: classes.dex */
public abstract class AbstractC1374j {
    /* renamed from: a */
    public boolean mo5620a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: b */
    public C1305g m5835b() {
        if (m5838h()) {
            return (C1305g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: c */
    public C1377m m5836c() {
        if (m5840k()) {
            return (C1377m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: d */
    public C1379o m5837d() {
        if (m5841m()) {
            return (C1379o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: e */
    public String mo5621e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: h */
    public boolean m5838h() {
        return this instanceof C1305g;
    }

    /* renamed from: j */
    public boolean m5839j() {
        return this instanceof C1376l;
    }

    /* renamed from: k */
    public boolean m5840k() {
        return this instanceof C1377m;
    }

    /* renamed from: m */
    public boolean m5841m() {
        return this instanceof C1379o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C5899c c5899c = new C5899c(stringWriter);
            c5899c.m23600i0(true);
            C1368k.m5822b(this, c5899c);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
