package ve;

import java.net.ProtocolException;
import re.EnumC4378z;

/* renamed from: ve.k */
/* loaded from: classes2.dex */
public final class C5176k {

    /* renamed from: a */
    public final EnumC4378z f19522a;

    /* renamed from: b */
    public final int f19523b;

    /* renamed from: c */
    public final String f19524c;

    public C5176k(EnumC4378z enumC4378z, int i10, String str) {
        this.f19522a = enumC4378z;
        this.f19523b = i10;
        this.f19524c = str;
    }

    /* renamed from: a */
    public static C5176k m20958a(String str) {
        EnumC4378z enumC4378z;
        String str2;
        int i10 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                enumC4378z = EnumC4378z.HTTP_1_0;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                enumC4378z = EnumC4378z.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            enumC4378z = EnumC4378z.HTTP_1_0;
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i10, i11));
            if (str.length() <= i11) {
                str2 = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                str2 = str.substring(i10 + 4);
            }
            return new C5176k(enumC4378z, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19522a == EnumC4378z.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f19523b);
        if (this.f19524c != null) {
            sb2.append(' ');
            sb2.append(this.f19524c);
        }
        return sb2.toString();
    }
}
