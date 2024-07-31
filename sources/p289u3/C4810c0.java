package p289u3;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p222p5.C4054z;
import p264s3.C4463m1;
import p317w3.C5247m;

/* renamed from: u3.c0 */
/* loaded from: classes.dex */
public final class C4810c0 {

    /* renamed from: a */
    public static final int[] f17993a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    public static final int[] f17994b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    public static final int[] f17995c = {64, C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, PlatformPlugin.DEFAULT_SYSTEM_UI, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m19001a(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4a
            r2 = -1
            if (r1 == r2) goto L32
            r2 = 31
            if (r1 == r2) goto L21
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L58
        L21:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L42
        L32:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L42:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5d
        L4a:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L58:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L5d:
            if (r0 == 0) goto L63
            int r7 = r7 * 16
            int r7 = r7 / 14
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p289u3.C4810c0.m19001a(byte[]):int");
    }

    /* renamed from: b */
    public static C4054z m19002b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C4054z(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m19003c(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b10 = copyOf[i10];
                int i11 = i10 + 1;
                copyOf[i10] = copyOf[i11];
                copyOf[i11] = b10;
            }
        }
        C4054z c4054z = new C4054z(copyOf);
        if (copyOf[0] == 31) {
            C4054z c4054z2 = new C4054z(copyOf);
            while (c4054z2.m15595b() >= 16) {
                c4054z2.m15611r(2);
                c4054z.m15599f(c4054z2.m15601h(14), 14);
            }
        }
        c4054z.m15607n(copyOf);
        return c4054z;
    }

    /* renamed from: c */
    public static boolean m19003c(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }

    /* renamed from: d */
    public static boolean m19004d(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    /* renamed from: e */
    public static int m19005e(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int position = byteBuffer.position();
        byte b10 = byteBuffer.get(position);
        if (b10 != -2) {
            if (b10 == -1) {
                i10 = (byteBuffer.get(position + 4) & 7) << 4;
                i13 = position + 7;
            } else if (b10 != 31) {
                i10 = (byteBuffer.get(position + 4) & 1) << 6;
                i11 = position + 5;
            } else {
                i10 = (byteBuffer.get(position + 5) & 7) << 4;
                i13 = position + 6;
            }
            i12 = byteBuffer.get(i13) & 60;
            return (((i12 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(position + 5) & 1) << 6;
        i11 = position + 4;
        i12 = byteBuffer.get(i11) & 252;
        return (((i12 >> 2) | i10) + 1) * 32;
    }

    /* renamed from: f */
    public static int m19006f(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    /* renamed from: g */
    public static C4463m1 m19007g(byte[] bArr, String str, String str2, C5247m c5247m) {
        C4054z m19002b = m19002b(bArr);
        m19002b.m15611r(60);
        int i10 = f17993a[m19002b.m15601h(6)];
        int i11 = f17994b[m19002b.m15601h(4)];
        int m15601h = m19002b.m15601h(5);
        int[] iArr = f17995c;
        int i12 = m15601h >= iArr.length ? -1 : (iArr[m15601h] * 1000) / 2;
        m19002b.m15611r(10);
        return new C4463m1.b().m17462U(str).m17474g0("audio/vnd.dts").m17450I(i12).m17451J(i10 + (m19002b.m15601h(2) > 0 ? 1 : 0)).m17475h0(i11).m17456O(c5247m).m17465X(str2).m17448G();
    }
}
