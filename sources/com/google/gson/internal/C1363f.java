package com.google.gson.internal;

import java.math.BigDecimal;

/* renamed from: com.google.gson.internal.f */
/* loaded from: classes.dex */
public final class C1363f extends Number {

    /* renamed from: h */
    public final String f5168h;

    public C1363f(String str) {
        this.f5168h = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f5168h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1363f)) {
            return false;
        }
        String str = this.f5168h;
        String str2 = ((C1363f) obj).f5168h;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f5168h);
    }

    public int hashCode() {
        return this.f5168h.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f5168h);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f5168h).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f5168h);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f5168h);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f5168h).longValue();
        }
    }

    public String toString() {
        return this.f5168h;
    }
}
