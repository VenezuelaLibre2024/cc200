package re;

import java.io.IOException;

/* renamed from: re.z */
/* loaded from: classes2.dex */
public enum EnumC4378z {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: h */
    public final String f16050h;

    EnumC4378z(String str) {
        this.f16050h = str;
    }

    /* renamed from: b */
    public static EnumC4378z m16935b(String str) {
        EnumC4378z enumC4378z = HTTP_1_0;
        if (str.equals(enumC4378z.f16050h)) {
            return enumC4378z;
        }
        EnumC4378z enumC4378z2 = HTTP_1_1;
        if (str.equals(enumC4378z2.f16050h)) {
            return enumC4378z2;
        }
        EnumC4378z enumC4378z3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC4378z3.f16050h)) {
            return enumC4378z3;
        }
        EnumC4378z enumC4378z4 = HTTP_2;
        if (str.equals(enumC4378z4.f16050h)) {
            return enumC4378z4;
        }
        EnumC4378z enumC4378z5 = SPDY_3;
        if (str.equals(enumC4378z5.f16050h)) {
            return enumC4378z5;
        }
        EnumC4378z enumC4378z6 = QUIC;
        if (str.equals(enumC4378z6.f16050h)) {
            return enumC4378z6;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f16050h;
    }
}
