package p002a0;

import android.graphics.Path;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.ArrayList;

/* renamed from: a0.d */
/* loaded from: classes.dex */
public class C0007d {

    /* renamed from: a0.d$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f11a;

        /* renamed from: b */
        public boolean f12b;
    }

    /* renamed from: a0.d$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public char f13a;

        /* renamed from: b */
        public float[] f14b;

        public b(char c10, float[] fArr) {
            this.f13a = c10;
            this.f14b = fArr;
        }

        public b(b bVar) {
            this.f13a = bVar.f13a;
            float[] fArr = bVar.f14b;
            this.f14b = C0007d.m23c(fArr, 0, fArr.length);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        public static void m31a(Path path, float[] fArr, char c10, char c11, float[] fArr2) {
            int i10;
            int i11;
            int i12;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            char c12 = c11;
            boolean z10 = false;
            float f18 = fArr[0];
            float f19 = fArr[1];
            float f20 = fArr[2];
            float f21 = fArr[3];
            float f22 = fArr[4];
            float f23 = fArr[5];
            switch (c12) {
                case C1417R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case C1417R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                    i10 = 7;
                    i11 = i10;
                    break;
                case C1417R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                case C1417R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                    i10 = 6;
                    i11 = i10;
                    break;
                case C1417R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                case 'V':
                case C1417R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                case 'v':
                    i11 = 1;
                    break;
                case C1417R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                case C1417R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                case C1417R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                case C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                case C1417R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                case 't':
                default:
                    i11 = 2;
                    break;
                case C1417R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                case C1417R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                case C1417R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                case C1417R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                    i11 = 4;
                    break;
                case C1417R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                case 'z':
                    path.close();
                    path.moveTo(f22, f23);
                    f18 = f22;
                    f20 = f18;
                    f19 = f23;
                    f21 = f19;
                    i11 = 2;
                    break;
            }
            float f24 = f18;
            float f25 = f19;
            float f26 = f22;
            float f27 = f23;
            int i13 = 0;
            char c13 = c10;
            while (i13 < fArr2.length) {
                if (c12 != 'A') {
                    if (c12 == 'C') {
                        i12 = i13;
                        int i14 = i12 + 2;
                        int i15 = i12 + 3;
                        int i16 = i12 + 4;
                        int i17 = i12 + 5;
                        path.cubicTo(fArr2[i12 + 0], fArr2[i12 + 1], fArr2[i14], fArr2[i15], fArr2[i16], fArr2[i17]);
                        f24 = fArr2[i16];
                        float f28 = fArr2[i17];
                        float f29 = fArr2[i14];
                        float f30 = fArr2[i15];
                        f25 = f28;
                        f21 = f30;
                        f20 = f29;
                    } else if (c12 == 'H') {
                        i12 = i13;
                        int i18 = i12 + 0;
                        path.lineTo(fArr2[i18], f25);
                        f24 = fArr2[i18];
                    } else if (c12 == 'Q') {
                        i12 = i13;
                        int i19 = i12 + 0;
                        int i20 = i12 + 1;
                        int i21 = i12 + 2;
                        int i22 = i12 + 3;
                        path.quadTo(fArr2[i19], fArr2[i20], fArr2[i21], fArr2[i22]);
                        float f31 = fArr2[i19];
                        float f32 = fArr2[i20];
                        f24 = fArr2[i21];
                        f25 = fArr2[i22];
                        f20 = f31;
                        f21 = f32;
                    } else if (c12 == 'V') {
                        i12 = i13;
                        int i23 = i12 + 0;
                        path.lineTo(f24, fArr2[i23]);
                        f25 = fArr2[i23];
                    } else if (c12 != 'a') {
                        if (c12 != 'c') {
                            if (c12 == 'h') {
                                int i24 = i13 + 0;
                                path.rLineTo(fArr2[i24], 0.0f);
                                f24 += fArr2[i24];
                            } else if (c12 != 'q') {
                                if (c12 == 'v') {
                                    int i25 = i13 + 0;
                                    path.rLineTo(0.0f, fArr2[i25]);
                                    f13 = fArr2[i25];
                                } else if (c12 == 'L') {
                                    int i26 = i13 + 0;
                                    int i27 = i13 + 1;
                                    path.lineTo(fArr2[i26], fArr2[i27]);
                                    f24 = fArr2[i26];
                                    f25 = fArr2[i27];
                                } else if (c12 == 'M') {
                                    int i28 = i13 + 0;
                                    f24 = fArr2[i28];
                                    int i29 = i13 + 1;
                                    f25 = fArr2[i29];
                                    if (i13 > 0) {
                                        path.lineTo(fArr2[i28], fArr2[i29]);
                                    } else {
                                        path.moveTo(fArr2[i28], fArr2[i29]);
                                        i12 = i13;
                                        f27 = f25;
                                        f26 = f24;
                                    }
                                } else if (c12 == 'S') {
                                    if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                        f24 = (f24 * 2.0f) - f20;
                                        f25 = (f25 * 2.0f) - f21;
                                    }
                                    float f33 = f25;
                                    int i30 = i13 + 0;
                                    int i31 = i13 + 1;
                                    int i32 = i13 + 2;
                                    int i33 = i13 + 3;
                                    path.cubicTo(f24, f33, fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                    f10 = fArr2[i30];
                                    f11 = fArr2[i31];
                                    f24 = fArr2[i32];
                                    f25 = fArr2[i33];
                                    f20 = f10;
                                    f21 = f11;
                                } else if (c12 == 'T') {
                                    if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                        f24 = (f24 * 2.0f) - f20;
                                        f25 = (f25 * 2.0f) - f21;
                                    }
                                    int i34 = i13 + 0;
                                    int i35 = i13 + 1;
                                    path.quadTo(f24, f25, fArr2[i34], fArr2[i35]);
                                    float f34 = fArr2[i34];
                                    float f35 = fArr2[i35];
                                    i12 = i13;
                                    f21 = f25;
                                    f20 = f24;
                                    f24 = f34;
                                    f25 = f35;
                                } else if (c12 == 'l') {
                                    int i36 = i13 + 0;
                                    int i37 = i13 + 1;
                                    path.rLineTo(fArr2[i36], fArr2[i37]);
                                    f24 += fArr2[i36];
                                    f13 = fArr2[i37];
                                } else if (c12 == 'm') {
                                    int i38 = i13 + 0;
                                    f24 += fArr2[i38];
                                    int i39 = i13 + 1;
                                    f25 += fArr2[i39];
                                    if (i13 > 0) {
                                        path.rLineTo(fArr2[i38], fArr2[i39]);
                                    } else {
                                        path.rMoveTo(fArr2[i38], fArr2[i39]);
                                        i12 = i13;
                                        f27 = f25;
                                        f26 = f24;
                                    }
                                } else if (c12 == 's') {
                                    if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                        float f36 = f24 - f20;
                                        f14 = f25 - f21;
                                        f15 = f36;
                                    } else {
                                        f15 = 0.0f;
                                        f14 = 0.0f;
                                    }
                                    int i40 = i13 + 0;
                                    int i41 = i13 + 1;
                                    int i42 = i13 + 2;
                                    int i43 = i13 + 3;
                                    path.rCubicTo(f15, f14, fArr2[i40], fArr2[i41], fArr2[i42], fArr2[i43]);
                                    f10 = fArr2[i40] + f24;
                                    f11 = fArr2[i41] + f25;
                                    f24 += fArr2[i42];
                                    f12 = fArr2[i43];
                                } else if (c12 == 't') {
                                    if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                        f16 = f24 - f20;
                                        f17 = f25 - f21;
                                    } else {
                                        f17 = 0.0f;
                                        f16 = 0.0f;
                                    }
                                    int i44 = i13 + 0;
                                    int i45 = i13 + 1;
                                    path.rQuadTo(f16, f17, fArr2[i44], fArr2[i45]);
                                    float f37 = f16 + f24;
                                    float f38 = f17 + f25;
                                    f24 += fArr2[i44];
                                    f25 += fArr2[i45];
                                    f21 = f38;
                                    f20 = f37;
                                }
                                f25 += f13;
                            } else {
                                int i46 = i13 + 0;
                                int i47 = i13 + 1;
                                int i48 = i13 + 2;
                                int i49 = i13 + 3;
                                path.rQuadTo(fArr2[i46], fArr2[i47], fArr2[i48], fArr2[i49]);
                                f10 = fArr2[i46] + f24;
                                f11 = fArr2[i47] + f25;
                                f24 += fArr2[i48];
                                f12 = fArr2[i49];
                            }
                            i12 = i13;
                        } else {
                            int i50 = i13 + 2;
                            int i51 = i13 + 3;
                            int i52 = i13 + 4;
                            int i53 = i13 + 5;
                            path.rCubicTo(fArr2[i13 + 0], fArr2[i13 + 1], fArr2[i50], fArr2[i51], fArr2[i52], fArr2[i53]);
                            f10 = fArr2[i50] + f24;
                            f11 = fArr2[i51] + f25;
                            f24 += fArr2[i52];
                            f12 = fArr2[i53];
                        }
                        f25 += f12;
                        f20 = f10;
                        f21 = f11;
                        i12 = i13;
                    } else {
                        int i54 = i13 + 5;
                        int i55 = i13 + 6;
                        i12 = i13;
                        m33c(path, f24, f25, fArr2[i54] + f24, fArr2[i55] + f25, fArr2[i13 + 0], fArr2[i13 + 1], fArr2[i13 + 2], fArr2[i13 + 3] != 0.0f, fArr2[i13 + 4] != 0.0f);
                        f24 += fArr2[i54];
                        f25 += fArr2[i55];
                    }
                    i13 = i12 + i11;
                    c13 = c11;
                    c12 = c13;
                    z10 = false;
                } else {
                    i12 = i13;
                    int i56 = i12 + 5;
                    int i57 = i12 + 6;
                    m33c(path, f24, f25, fArr2[i56], fArr2[i57], fArr2[i12 + 0], fArr2[i12 + 1], fArr2[i12 + 2], fArr2[i12 + 3] != 0.0f, fArr2[i12 + 4] != 0.0f);
                    f24 = fArr2[i56];
                    f25 = fArr2[i57];
                }
                f21 = f25;
                f20 = f24;
                i13 = i12 + i11;
                c13 = c11;
                c12 = c13;
                z10 = false;
            }
            fArr[z10 ? 1 : 0] = f24;
            fArr[1] = f25;
            fArr[2] = f20;
            fArr[3] = f21;
            fArr[4] = f26;
            fArr[5] = f27;
        }

        /* renamed from: b */
        public static void m32b(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
            double d19 = d12;
            int ceil = (int) Math.ceil(Math.abs((d18 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d16);
            double sin = Math.sin(d16);
            double cos2 = Math.cos(d17);
            double sin2 = Math.sin(d17);
            double d20 = -d19;
            double d21 = d20 * cos;
            double d22 = d13 * sin;
            double d23 = (d21 * sin2) - (d22 * cos2);
            double d24 = d20 * sin;
            double d25 = d13 * cos;
            double d26 = (sin2 * d24) + (cos2 * d25);
            double d27 = d18 / ceil;
            double d28 = d26;
            double d29 = d23;
            int i10 = 0;
            double d30 = d14;
            double d31 = d15;
            double d32 = d17;
            while (i10 < ceil) {
                double d33 = d32 + d27;
                double sin3 = Math.sin(d33);
                double cos3 = Math.cos(d33);
                double d34 = (d10 + ((d19 * cos) * cos3)) - (d22 * sin3);
                double d35 = d11 + (d19 * sin * cos3) + (d25 * sin3);
                double d36 = (d21 * sin3) - (d22 * cos3);
                double d37 = (sin3 * d24) + (cos3 * d25);
                double d38 = d33 - d32;
                double tan = Math.tan(d38 / 2.0d);
                double sin4 = (Math.sin(d38) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d39 = d30 + (d29 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d39, (float) (d31 + (d28 * sin4)), (float) (d34 - (sin4 * d36)), (float) (d35 - (sin4 * d37)), (float) d34, (float) d35);
                i10++;
                d27 = d27;
                sin = sin;
                d30 = d34;
                d24 = d24;
                cos = cos;
                d32 = d33;
                d28 = d37;
                d29 = d36;
                ceil = ceil;
                d31 = d35;
                d19 = d12;
            }
        }

        /* renamed from: c */
        public static void m33c(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d12 = f10;
            double d13 = d12 * cos;
            double d14 = f11;
            double d15 = f14;
            double d16 = (d13 + (d14 * sin)) / d15;
            double d17 = ((-f10) * sin) + (d14 * cos);
            double d18 = f15;
            double d19 = d17 / d18;
            double d20 = f13;
            double d21 = ((f12 * cos) + (d20 * sin)) / d15;
            double d22 = (((-f12) * sin) + (d20 * cos)) / d18;
            double d23 = d16 - d21;
            double d24 = d19 - d22;
            double d25 = (d16 + d21) / 2.0d;
            double d26 = (d19 + d22) / 2.0d;
            double d27 = (d23 * d23) + (d24 * d24);
            if (d27 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d28 = (1.0d / d27) - 0.25d;
            if (d28 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d27);
                float sqrt = (float) (Math.sqrt(d27) / 1.99999d);
                m33c(path, f10, f11, f12, f13, f14 * sqrt, f15 * sqrt, f16, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d28);
            double d29 = d23 * sqrt2;
            double d30 = sqrt2 * d24;
            if (z10 == z11) {
                d10 = d25 - d30;
                d11 = d26 + d29;
            } else {
                d10 = d25 + d30;
                d11 = d26 - d29;
            }
            double atan2 = Math.atan2(d19 - d11, d16 - d10);
            double atan22 = Math.atan2(d22 - d11, d21 - d10) - atan2;
            if (z11 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d31 = d10 * d15;
            double d32 = d11 * d18;
            m32b(path, (d31 * cos) - (d32 * sin), (d31 * sin) + (d32 * cos), d15, d18, d12, d14, radians, atan2, atan22);
        }

        /* renamed from: e */
        public static void m34e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c10 = 'm';
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                m31a(path, fArr, c10, bVarArr[i10].f13a, bVarArr[i10].f14b);
                c10 = bVarArr[i10].f13a;
            }
        }

        /* renamed from: d */
        public void m35d(b bVar, b bVar2, float f10) {
            this.f13a = bVar.f13a;
            int i10 = 0;
            while (true) {
                float[] fArr = bVar.f14b;
                if (i10 >= fArr.length) {
                    return;
                }
                this.f14b[i10] = (fArr[i10] * (1.0f - f10)) + (bVar2.f14b[i10] * f10);
                i10++;
            }
        }
    }

    /* renamed from: a */
    public static void m21a(ArrayList<b> arrayList, char c10, float[] fArr) {
        arrayList.add(new b(c10, fArr));
    }

    /* renamed from: b */
    public static boolean m22b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            if (bVarArr[i10].f13a != bVarArr2[i10].f13a || bVarArr[i10].f14b.length != bVarArr2[i10].f14b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static float[] m23c(float[] fArr, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i10 < 0 || i10 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = i11 - i10;
        int min = Math.min(i12, length - i10);
        float[] fArr2 = new float[i12];
        System.arraycopy(fArr, i10, fArr2, 0, min);
        return fArr2;
    }

    /* renamed from: d */
    public static b[] m24d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 0;
        while (i10 < str.length()) {
            int m29i = m29i(str, i10);
            String trim = str.substring(i11, m29i).trim();
            if (trim.length() > 0) {
                m21a(arrayList, trim.charAt(0), m28h(trim));
            }
            i11 = m29i;
            i10 = m29i + 1;
        }
        if (i10 - i11 == 1 && i11 < str.length()) {
            m21a(arrayList, str.charAt(i11), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    /* renamed from: e */
    public static Path m25e(String str) {
        Path path = new Path();
        b[] m24d = m24d(str);
        if (m24d == null) {
            return null;
        }
        try {
            b.m34e(m24d, path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing " + str, e10);
        }
    }

    /* renamed from: f */
    public static b[] m26f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = new b(bVarArr[i10]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[LOOP:0: B:2:0x0007->B:14:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m27g(java.lang.String r8, int r9, p002a0.C0007d.a r10) {
        /*
            r0 = 0
            r10.f12b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3b
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L33
            r6 = 69
            if (r5 == r6) goto L31
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L31
            switch(r5) {
                case 44: goto L33;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L2f
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L35
        L27:
            r10.f12b = r7
            goto L33
        L2a:
            if (r1 == r9) goto L2f
            if (r2 != 0) goto L2f
            goto L27
        L2f:
            r2 = r0
            goto L35
        L31:
            r2 = r7
            goto L35
        L33:
            r2 = r0
            r4 = r7
        L35:
            if (r4 == 0) goto L38
            goto L3b
        L38:
            int r1 = r1 + 1
            goto L7
        L3b:
            r10.f11a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p002a0.C0007d.m27g(java.lang.String, int, a0.d$a):void");
    }

    /* renamed from: h */
    public static float[] m28h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i10 = 1;
            int i11 = 0;
            while (i10 < length) {
                m27g(str, i10, aVar);
                int i12 = aVar.f11a;
                if (i10 < i12) {
                    fArr[i11] = Float.parseFloat(str.substring(i10, i12));
                    i11++;
                }
                i10 = aVar.f12b ? i12 : i12 + 1;
            }
            return m23c(fArr, 0, i11);
        } catch (NumberFormatException e10) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e10);
        }
    }

    /* renamed from: i */
    public static int m29i(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    /* renamed from: j */
    public static void m30j(b[] bVarArr, b[] bVarArr2) {
        for (int i10 = 0; i10 < bVarArr2.length; i10++) {
            bVarArr[i10].f13a = bVarArr2[i10].f13a;
            for (int i11 = 0; i11 < bVarArr2[i10].f14b.length; i11++) {
                bVarArr[i10].f14b[i11] = bVarArr2[i10].f14b[i11];
            }
        }
    }
}
