package com.google.gson.internal.bind;

import com.google.gson.C1382r;
import com.google.gson.EnumC1384t;
import com.google.gson.Gson;
import com.google.gson.InterfaceC1385u;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;
import p355y9.EnumC5898b;

/* loaded from: classes.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {

    /* renamed from: b */
    public static final InterfaceC1386v f5020b = m5676b(EnumC1384t.f5220i);

    /* renamed from: a */
    public final InterfaceC1385u f5021a;

    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$1 */
    /* loaded from: classes.dex */
    public class C13151 implements InterfaceC1386v {
        public C13151() {
        }

        @Override // com.google.gson.InterfaceC1386v
        public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
            if (c5740a.getRawType() == Number.class) {
                return NumberTypeAdapter.this;
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C1316a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5023a;

        static {
            int[] iArr = new int[EnumC5898b.values().length];
            f5023a = iArr;
            try {
                iArr[EnumC5898b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5023a[EnumC5898b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5023a[EnumC5898b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NumberTypeAdapter(InterfaceC1385u interfaceC1385u) {
        this.f5021a = interfaceC1385u;
    }

    /* renamed from: a */
    public static InterfaceC1386v m5675a(InterfaceC1385u interfaceC1385u) {
        return interfaceC1385u == EnumC1384t.f5220i ? f5020b : m5676b(interfaceC1385u);
    }

    /* renamed from: b */
    public static InterfaceC1386v m5676b(InterfaceC1385u interfaceC1385u) {
        return new InterfaceC1386v() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            public C13151() {
            }

            @Override // com.google.gson.InterfaceC1386v
            public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
                if (c5740a.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public Number read(C5897a c5897a) {
        EnumC5898b mo5774r0 = c5897a.mo5774r0();
        int i10 = C1316a.f5023a[mo5774r0.ordinal()];
        if (i10 == 1) {
            c5897a.mo5770h0();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f5021a.mo5855b(c5897a);
        }
        throw new C1382r("Expecting number, got: " + mo5774r0);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: d */
    public void write(C5899c c5899c, Number number) {
        c5899c.mo5785u0(number);
    }
}
