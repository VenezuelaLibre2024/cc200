package p289u3;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.nio.ByteBuffer;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4054z;
import p264s3.C4463m1;
import p317w3.C5247m;

/* renamed from: u3.b */
/* loaded from: classes.dex */
public final class C4807b {

    /* renamed from: a */
    public static final int[] f17962a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f17963b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f17964c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f17965d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f17966e = {32, 40, 48, 56, 64, 80, 96, C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    public static final int[] f17967f = {69, 87, C1417R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: u3.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f17968a;

        /* renamed from: b */
        public final int f17969b;

        /* renamed from: c */
        public final int f17970c;

        /* renamed from: d */
        public final int f17971d;

        /* renamed from: e */
        public final int f17972e;

        /* renamed from: f */
        public final int f17973f;

        /* renamed from: g */
        public final int f17974g;

        public b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f17968a = str;
            this.f17969b = i10;
            this.f17971d = i11;
            this.f17970c = i12;
            this.f17972e = i13;
            this.f17973f = i14;
            this.f17974g = i15;
        }
    }

    /* renamed from: a */
    public static int m18972a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    /* renamed from: b */
    public static int m18973b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((C4041n0.m15409I(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static int m18974c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f17963b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f17967f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f17966e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    /* renamed from: d */
    public static C4463m1 m18975d(C4015a0 c4015a0, String str, String str2, C5247m c5247m) {
        C4054z c4054z = new C4054z();
        c4054z.m15606m(c4015a0);
        int i10 = f17963b[c4054z.m15601h(2)];
        c4054z.m15611r(8);
        int i11 = f17965d[c4054z.m15601h(3)];
        if (c4054z.m15601h(1) != 0) {
            i11++;
        }
        int i12 = f17966e[c4054z.m15601h(5)] * 1000;
        c4054z.m15596c();
        c4015a0.m15223T(c4054z.m15597d());
        return new C4463m1.b().m17462U(str).m17474g0("audio/ac3").m17451J(i11).m17475h0(i10).m17456O(c5247m).m17465X(str2).m17450I(i12).m17469b0(i12).m17448G();
    }

    /* renamed from: e */
    public static int m18976e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f17962a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* renamed from: f */
    public static b m18977f(C4054z c4054z) {
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int m15598e = c4054z.m15598e();
        c4054z.m15611r(40);
        boolean z10 = c4054z.m15601h(5) > 10;
        c4054z.m15609p(m15598e);
        int i22 = -1;
        if (z10) {
            c4054z.m15611r(16);
            int m15601h = c4054z.m15601h(2);
            if (m15601h == 0) {
                i22 = 0;
            } else if (m15601h == 1) {
                i22 = 1;
            } else if (m15601h == 2) {
                i22 = 2;
            }
            c4054z.m15611r(3);
            int m15601h2 = (c4054z.m15601h(11) + 1) * 2;
            int m15601h3 = c4054z.m15601h(2);
            if (m15601h3 == 3) {
                i17 = f17964c[c4054z.m15601h(2)];
                i16 = 3;
                i18 = 6;
            } else {
                int m15601h4 = c4054z.m15601h(2);
                int i23 = f17962a[m15601h4];
                i16 = m15601h4;
                i17 = f17963b[m15601h3];
                i18 = i23;
            }
            int i24 = i18 * 256;
            int m18972a = m18972a(m15601h2, i17, i18);
            int m15601h5 = c4054z.m15601h(3);
            boolean m15600g = c4054z.m15600g();
            i10 = f17965d[m15601h5] + (m15600g ? 1 : 0);
            c4054z.m15611r(10);
            if (c4054z.m15600g()) {
                c4054z.m15611r(8);
            }
            if (m15601h5 == 0) {
                c4054z.m15611r(5);
                if (c4054z.m15600g()) {
                    c4054z.m15611r(8);
                }
            }
            if (i22 == 1 && c4054z.m15600g()) {
                c4054z.m15611r(16);
            }
            if (c4054z.m15600g()) {
                if (m15601h5 > 2) {
                    c4054z.m15611r(2);
                }
                if ((m15601h5 & 1) == 0 || m15601h5 <= 2) {
                    i20 = 6;
                } else {
                    i20 = 6;
                    c4054z.m15611r(6);
                }
                if ((m15601h5 & 4) != 0) {
                    c4054z.m15611r(i20);
                }
                if (m15600g && c4054z.m15600g()) {
                    c4054z.m15611r(5);
                }
                if (i22 == 0) {
                    if (c4054z.m15600g()) {
                        i21 = 6;
                        c4054z.m15611r(6);
                    } else {
                        i21 = 6;
                    }
                    if (m15601h5 == 0 && c4054z.m15600g()) {
                        c4054z.m15611r(i21);
                    }
                    if (c4054z.m15600g()) {
                        c4054z.m15611r(i21);
                    }
                    int m15601h6 = c4054z.m15601h(2);
                    if (m15601h6 == 1) {
                        c4054z.m15611r(5);
                    } else if (m15601h6 == 2) {
                        c4054z.m15611r(12);
                    } else if (m15601h6 == 3) {
                        int m15601h7 = c4054z.m15601h(5);
                        if (c4054z.m15600g()) {
                            c4054z.m15611r(5);
                            if (c4054z.m15600g()) {
                                c4054z.m15611r(4);
                            }
                            if (c4054z.m15600g()) {
                                c4054z.m15611r(4);
                            }
                            if (c4054z.m15600g()) {
                                c4054z.m15611r(4);
                            }
                            if (c4054z.m15600g()) {
                                c4054z.m15611r(4);
                            }
                            if (c4054z.m15600g()) {
                                c4054z.m15611r(4);
                            }
                            if (c4054z.m15600g()) {
                                c4054z.m15611r(4);
                            }
                            if (c4054z.m15600g()) {
                                c4054z.m15611r(4);
                            }
                            if (c4054z.m15600g()) {
                                if (c4054z.m15600g()) {
                                    c4054z.m15611r(4);
                                }
                                if (c4054z.m15600g()) {
                                    c4054z.m15611r(4);
                                }
                            }
                        }
                        if (c4054z.m15600g()) {
                            c4054z.m15611r(5);
                            if (c4054z.m15600g()) {
                                c4054z.m15611r(7);
                                if (c4054z.m15600g()) {
                                    c4054z.m15611r(8);
                                }
                            }
                        }
                        c4054z.m15611r((m15601h7 + 2) * 8);
                        c4054z.m15596c();
                    }
                    if (m15601h5 < 2) {
                        if (c4054z.m15600g()) {
                            c4054z.m15611r(14);
                        }
                        if (m15601h5 == 0 && c4054z.m15600g()) {
                            c4054z.m15611r(14);
                        }
                    }
                    if (c4054z.m15600g()) {
                        if (i16 == 0) {
                            c4054z.m15611r(5);
                        } else {
                            for (int i25 = 0; i25 < i18; i25++) {
                                if (c4054z.m15600g()) {
                                    c4054z.m15611r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c4054z.m15600g()) {
                c4054z.m15611r(5);
                if (m15601h5 == 2) {
                    c4054z.m15611r(4);
                }
                if (m15601h5 >= 6) {
                    c4054z.m15611r(2);
                }
                if (c4054z.m15600g()) {
                    c4054z.m15611r(8);
                }
                if (m15601h5 == 0 && c4054z.m15600g()) {
                    c4054z.m15611r(8);
                }
                if (m15601h3 < 3) {
                    c4054z.m15610q();
                }
            }
            if (i22 == 0 && i16 != 3) {
                c4054z.m15610q();
            }
            if (i22 == 2 && (i16 == 3 || c4054z.m15600g())) {
                i19 = 6;
                c4054z.m15611r(6);
            } else {
                i19 = 6;
            }
            str = (c4054z.m15600g() && c4054z.m15601h(i19) == 1 && c4054z.m15601h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i11 = i22;
            i12 = i24;
            i14 = m15601h2;
            i15 = i17;
            i13 = m18972a;
        } else {
            c4054z.m15611r(32);
            int m15601h8 = c4054z.m15601h(2);
            String str2 = m15601h8 == 3 ? null : "audio/ac3";
            int m15601h9 = c4054z.m15601h(6);
            int i26 = f17966e[m15601h9 / 2] * 1000;
            int m18974c = m18974c(m15601h8, m15601h9);
            c4054z.m15611r(8);
            int m15601h10 = c4054z.m15601h(3);
            if ((m15601h10 & 1) != 0 && m15601h10 != 1) {
                c4054z.m15611r(2);
            }
            if ((m15601h10 & 4) != 0) {
                c4054z.m15611r(2);
            }
            if (m15601h10 == 2) {
                c4054z.m15611r(2);
            }
            int[] iArr = f17963b;
            int i27 = m15601h8 < iArr.length ? iArr[m15601h8] : -1;
            i10 = f17965d[m15601h10] + (c4054z.m15600g() ? 1 : 0);
            i11 = -1;
            i12 = 1536;
            str = str2;
            i13 = i26;
            i14 = m18974c;
            i15 = i27;
        }
        return new b(str, i11, i10, i15, i14, i12, i13);
    }

    /* renamed from: g */
    public static int m18978g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        return m18974c((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    /* renamed from: h */
    public static C4463m1 m18979h(C4015a0 c4015a0, String str, String str2, C5247m c5247m) {
        String str3;
        C4054z c4054z = new C4054z();
        c4054z.m15606m(c4015a0);
        int m15601h = c4054z.m15601h(13) * 1000;
        c4054z.m15611r(3);
        int i10 = f17963b[c4054z.m15601h(2)];
        c4054z.m15611r(10);
        int i11 = f17965d[c4054z.m15601h(3)];
        if (c4054z.m15601h(1) != 0) {
            i11++;
        }
        c4054z.m15611r(3);
        int m15601h2 = c4054z.m15601h(4);
        c4054z.m15611r(1);
        if (m15601h2 > 0) {
            c4054z.m15612s(6);
            if (c4054z.m15601h(1) != 0) {
                i11 += 2;
            }
            c4054z.m15611r(1);
        }
        if (c4054z.m15595b() > 7) {
            c4054z.m15611r(7);
            if (c4054z.m15601h(1) != 0) {
                str3 = "audio/eac3-joc";
                c4054z.m15596c();
                c4015a0.m15223T(c4054z.m15597d());
                return new C4463m1.b().m17462U(str).m17474g0(str3).m17451J(i11).m17475h0(i10).m17456O(c5247m).m17465X(str2).m17469b0(m15601h).m17448G();
            }
        }
        str3 = "audio/eac3";
        c4054z.m15596c();
        c4015a0.m15223T(c4054z.m15597d());
        return new C4463m1.b().m17462U(str).m17474g0(str3).m17451J(i11).m17475h0(i10).m17456O(c5247m).m17465X(str2).m17469b0(m15601h).m17448G();
    }

    /* renamed from: i */
    public static int m18980i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* renamed from: j */
    public static int m18981j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }
}
