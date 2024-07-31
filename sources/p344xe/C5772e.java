package p344xe;

import bf.C0560f;
import java.io.IOException;
import se.C4596e;

/* renamed from: xe.e */
/* loaded from: classes2.dex */
public final class C5772e {

    /* renamed from: a */
    public static final C0560f f21395a = C0560f.m2859m("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    public static final String[] f21396b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    public static final String[] f21397c = new String[64];

    /* renamed from: d */
    public static final String[] f21398d = new String[256];

    static {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = f21398d;
            if (i11 >= strArr.length) {
                break;
            }
            strArr[i11] = C4596e.m18108p("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
            i11++;
        }
        String[] strArr2 = f21397c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i12 = 0; i12 < 1; i12++) {
            int i13 = iArr[i12];
            String[] strArr3 = f21397c;
            strArr3[i13 | 8] = strArr3[i13] + "|PADDED";
        }
        String[] strArr4 = f21397c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i14 = 0; i14 < 3; i14++) {
            int i15 = iArr2[i14];
            for (int i16 = 0; i16 < 1; i16++) {
                int i17 = iArr[i16];
                String[] strArr5 = f21397c;
                int i18 = i17 | i15;
                strArr5[i18] = strArr5[i17] + '|' + strArr5[i15];
                strArr5[i18 | 8] = strArr5[i17] + '|' + strArr5[i15] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr6 = f21397c;
            if (i10 >= strArr6.length) {
                return;
            }
            if (strArr6[i10] == null) {
                strArr6[i10] = f21398d[i10];
            }
            i10++;
        }
    }

    /* renamed from: a */
    public static String m22940a(byte b10, byte b11) {
        if (b11 == 0) {
            return "";
        }
        if (b10 != 2 && b10 != 3) {
            if (b10 == 4 || b10 == 6) {
                return b11 == 1 ? "ACK" : f21398d[b11];
            }
            if (b10 != 7 && b10 != 8) {
                String[] strArr = f21397c;
                String str = b11 < strArr.length ? strArr[b11] : f21398d[b11];
                return (b10 != 5 || (b11 & 4) == 0) ? (b10 != 0 || (b11 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f21398d[b11];
    }

    /* renamed from: b */
    public static String m22941b(boolean z10, int i10, int i11, byte b10, byte b11) {
        String[] strArr = f21396b;
        String m18108p = b10 < strArr.length ? strArr[b10] : C4596e.m18108p("0x%02x", Byte.valueOf(b10));
        String m22940a = m22940a(b10, b11);
        Object[] objArr = new Object[5];
        objArr[0] = z10 ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = Integer.valueOf(i11);
        objArr[3] = m18108p;
        objArr[4] = m22940a;
        return C4596e.m18108p("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: c */
    public static IllegalArgumentException m22942c(String str, Object... objArr) {
        throw new IllegalArgumentException(C4596e.m18108p(str, objArr));
    }

    /* renamed from: d */
    public static IOException m22943d(String str, Object... objArr) {
        throw new IOException(C4596e.m18108p(str, objArr));
    }
}
