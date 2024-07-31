package com.google.gson;

import com.google.gson.internal.C1309a;
import com.google.gson.internal.C1363f;
import java.math.BigInteger;

/* renamed from: com.google.gson.o */
/* loaded from: classes.dex */
public final class C1379o extends AbstractC1374j {

    /* renamed from: a */
    public final Object f5215a;

    public C1379o(Boolean bool) {
        this.f5215a = C1309a.m5636b(bool);
    }

    public C1379o(Number number) {
        this.f5215a = C1309a.m5636b(number);
    }

    public C1379o(String str) {
        this.f5215a = C1309a.m5636b(str);
    }

    /* renamed from: t */
    public static boolean m5846t(C1379o c1379o) {
        Object obj = c1379o.f5215a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.AbstractC1374j
    /* renamed from: a */
    public boolean mo5620a() {
        return m5851s() ? ((Boolean) this.f5215a).booleanValue() : Boolean.parseBoolean(mo5621e());
    }

    @Override // com.google.gson.AbstractC1374j
    /* renamed from: e */
    public String mo5621e() {
        return m5852u() ? m5850q().toString() : m5851s() ? ((Boolean) this.f5215a).toString() : (String) this.f5215a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1379o.class != obj.getClass()) {
            return false;
        }
        C1379o c1379o = (C1379o) obj;
        if (this.f5215a == null) {
            return c1379o.f5215a == null;
        }
        if (m5846t(this) && m5846t(c1379o)) {
            return m5850q().longValue() == c1379o.m5850q().longValue();
        }
        Object obj2 = this.f5215a;
        if (!(obj2 instanceof Number) || !(c1379o.f5215a instanceof Number)) {
            return obj2.equals(c1379o.f5215a);
        }
        double doubleValue = m5850q().doubleValue();
        double doubleValue2 = c1379o.m5850q().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f5215a == null) {
            return 31;
        }
        if (m5846t(this)) {
            doubleToLongBits = m5850q().longValue();
        } else {
            Object obj = this.f5215a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(m5850q().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: n */
    public double m5847n() {
        return m5852u() ? m5850q().doubleValue() : Double.parseDouble(mo5621e());
    }

    /* renamed from: o */
    public int m5848o() {
        return m5852u() ? m5850q().intValue() : Integer.parseInt(mo5621e());
    }

    /* renamed from: p */
    public long m5849p() {
        return m5852u() ? m5850q().longValue() : Long.parseLong(mo5621e());
    }

    /* renamed from: q */
    public Number m5850q() {
        Object obj = this.f5215a;
        return obj instanceof String ? new C1363f((String) obj) : (Number) obj;
    }

    /* renamed from: s */
    public boolean m5851s() {
        return this.f5215a instanceof Boolean;
    }

    /* renamed from: u */
    public boolean m5852u() {
        return this.f5215a instanceof Number;
    }

    /* renamed from: v */
    public boolean m5853v() {
        return this.f5215a instanceof String;
    }
}
