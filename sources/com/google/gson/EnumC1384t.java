package com.google.gson;

import com.google.gson.internal.C1363f;
import java.math.BigDecimal;
import p355y9.C5897a;
import p355y9.C5900d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.gson.t */
/* loaded from: classes.dex */
public abstract class EnumC1384t implements InterfaceC1385u {

    /* renamed from: h */
    public static final EnumC1384t f5219h;

    /* renamed from: i */
    public static final EnumC1384t f5220i;

    /* renamed from: j */
    public static final EnumC1384t f5221j;

    /* renamed from: k */
    public static final EnumC1384t f5222k;

    /* renamed from: l */
    public static final /* synthetic */ EnumC1384t[] f5223l;

    /* renamed from: com.google.gson.t$a */
    /* loaded from: classes.dex */
    public enum a extends EnumC1384t {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.InterfaceC1385u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double mo5855b(C5897a c5897a) {
            return Double.valueOf(c5897a.mo5765b0());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        f5219h = aVar;
        EnumC1384t enumC1384t = new EnumC1384t("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.t.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC1385u
            /* renamed from: b */
            public Number mo5855b(C5897a c5897a) {
                return new C1363f(c5897a.mo5771l0());
            }
        };
        f5220i = enumC1384t;
        EnumC1384t enumC1384t2 = new EnumC1384t("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.t.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC1385u
            /* renamed from: b */
            public Number mo5855b(C5897a c5897a) {
                String mo5771l0 = c5897a.mo5771l0();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(mo5771l0));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(mo5771l0);
                        if ((!valueOf.isInfinite() && !valueOf.isNaN()) || c5897a.m23571I()) {
                            return valueOf;
                        }
                        throw new C5900d("JSON forbids NaN and infinities: " + valueOf + "; at path " + c5897a.mo5773o0());
                    }
                } catch (NumberFormatException e10) {
                    throw new C1378n("Cannot parse " + mo5771l0 + "; at path " + c5897a.mo5773o0(), e10);
                }
            }
        };
        f5221j = enumC1384t2;
        EnumC1384t enumC1384t3 = new EnumC1384t("BIG_DECIMAL", 3) { // from class: com.google.gson.t.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC1385u
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public BigDecimal mo5855b(C5897a c5897a) {
                String mo5771l0 = c5897a.mo5771l0();
                try {
                    return new BigDecimal(mo5771l0);
                } catch (NumberFormatException e10) {
                    throw new C1378n("Cannot parse " + mo5771l0 + "; at path " + c5897a.mo5773o0(), e10);
                }
            }
        };
        f5222k = enumC1384t3;
        f5223l = new EnumC1384t[]{aVar, enumC1384t, enumC1384t2, enumC1384t3};
    }

    public EnumC1384t(String str, int i10) {
    }

    public /* synthetic */ EnumC1384t(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static EnumC1384t valueOf(String str) {
        return (EnumC1384t) Enum.valueOf(EnumC1384t.class, str);
    }

    public static EnumC1384t[] values() {
        return (EnumC1384t[]) f5223l.clone();
    }
}
