package p078f5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p047d5.C1547b;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4054z;

/* renamed from: f5.b */
/* loaded from: classes.dex */
public final class C1839b {

    /* renamed from: h */
    public static final byte[] f6971h = {0, 7, 8, 15};

    /* renamed from: i */
    public static final byte[] f6972i = {0, 119, -120, -1};

    /* renamed from: j */
    public static final byte[] f6973j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    public final Paint f6974a;

    /* renamed from: b */
    public final Paint f6975b;

    /* renamed from: c */
    public final Canvas f6976c;

    /* renamed from: d */
    public final b f6977d;

    /* renamed from: e */
    public final a f6978e;

    /* renamed from: f */
    public final h f6979f;

    /* renamed from: g */
    public Bitmap f6980g;

    /* renamed from: f5.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f6981a;

        /* renamed from: b */
        public final int[] f6982b;

        /* renamed from: c */
        public final int[] f6983c;

        /* renamed from: d */
        public final int[] f6984d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f6981a = i10;
            this.f6982b = iArr;
            this.f6983c = iArr2;
            this.f6984d = iArr3;
        }
    }

    /* renamed from: f5.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f6985a;

        /* renamed from: b */
        public final int f6986b;

        /* renamed from: c */
        public final int f6987c;

        /* renamed from: d */
        public final int f6988d;

        /* renamed from: e */
        public final int f6989e;

        /* renamed from: f */
        public final int f6990f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f6985a = i10;
            this.f6986b = i11;
            this.f6987c = i12;
            this.f6988d = i13;
            this.f6989e = i14;
            this.f6990f = i15;
        }
    }

    /* renamed from: f5.b$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final int f6991a;

        /* renamed from: b */
        public final boolean f6992b;

        /* renamed from: c */
        public final byte[] f6993c;

        /* renamed from: d */
        public final byte[] f6994d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f6991a = i10;
            this.f6992b = z10;
            this.f6993c = bArr;
            this.f6994d = bArr2;
        }
    }

    /* renamed from: f5.b$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final int f6995a;

        /* renamed from: b */
        public final int f6996b;

        /* renamed from: c */
        public final int f6997c;

        /* renamed from: d */
        public final SparseArray<e> f6998d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f6995a = i10;
            this.f6996b = i11;
            this.f6997c = i12;
            this.f6998d = sparseArray;
        }
    }

    /* renamed from: f5.b$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final int f6999a;

        /* renamed from: b */
        public final int f7000b;

        public e(int i10, int i11) {
            this.f6999a = i10;
            this.f7000b = i11;
        }
    }

    /* renamed from: f5.b$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        public final int f7001a;

        /* renamed from: b */
        public final boolean f7002b;

        /* renamed from: c */
        public final int f7003c;

        /* renamed from: d */
        public final int f7004d;

        /* renamed from: e */
        public final int f7005e;

        /* renamed from: f */
        public final int f7006f;

        /* renamed from: g */
        public final int f7007g;

        /* renamed from: h */
        public final int f7008h;

        /* renamed from: i */
        public final int f7009i;

        /* renamed from: j */
        public final int f7010j;

        /* renamed from: k */
        public final SparseArray<g> f7011k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f7001a = i10;
            this.f7002b = z10;
            this.f7003c = i11;
            this.f7004d = i12;
            this.f7005e = i13;
            this.f7006f = i14;
            this.f7007g = i15;
            this.f7008h = i16;
            this.f7009i = i17;
            this.f7010j = i18;
            this.f7011k = sparseArray;
        }

        /* renamed from: a */
        public void m7576a(f fVar) {
            SparseArray<g> sparseArray = fVar.f7011k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f7011k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* renamed from: f5.b$g */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        public final int f7012a;

        /* renamed from: b */
        public final int f7013b;

        /* renamed from: c */
        public final int f7014c;

        /* renamed from: d */
        public final int f7015d;

        /* renamed from: e */
        public final int f7016e;

        /* renamed from: f */
        public final int f7017f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f7012a = i10;
            this.f7013b = i11;
            this.f7014c = i12;
            this.f7015d = i13;
            this.f7016e = i14;
            this.f7017f = i15;
        }
    }

    /* renamed from: f5.b$h */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a */
        public final int f7018a;

        /* renamed from: b */
        public final int f7019b;

        /* renamed from: c */
        public final SparseArray<f> f7020c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<a> f7021d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<c> f7022e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<a> f7023f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<c> f7024g = new SparseArray<>();

        /* renamed from: h */
        public b f7025h;

        /* renamed from: i */
        public d f7026i;

        public h(int i10, int i11) {
            this.f7018a = i10;
            this.f7019b = i11;
        }

        /* renamed from: a */
        public void m7577a() {
            this.f7020c.clear();
            this.f7021d.clear();
            this.f7022e.clear();
            this.f7023f.clear();
            this.f7024g.clear();
            this.f7025h = null;
            this.f7026i = null;
        }
    }

    public C1839b(int i10, int i11) {
        Paint paint = new Paint();
        this.f6974a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f6975b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f6976c = new Canvas();
        this.f6977d = new b(719, 575, 0, 719, 0, 575);
        this.f6978e = new a(0, m7559c(), m7560d(), m7561e());
        this.f6979f = new h(i10, i11);
    }

    /* renamed from: a */
    public static byte[] m7558a(int i10, int i11, C4054z c4054z) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) c4054z.m15601h(i11);
        }
        return bArr;
    }

    /* renamed from: c */
    public static int[] m7559c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: d */
    public static int[] m7560d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = m7562f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = m7562f(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: e */
    public static int[] m7561e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = m7562f(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = m7562f(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = m7562f(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = m7562f(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = m7562f(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* renamed from: f */
    public static int m7562f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* renamed from: g */
    public static int m7563g(C4054z c4054z, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int m15601h;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int m15601h2 = c4054z.m15601h(2);
            if (m15601h2 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (c4054z.m15600g()) {
                    m15601h = c4054z.m15601h(3) + 3;
                } else {
                    if (c4054z.m15600g()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int m15601h3 = c4054z.m15601h(2);
                        if (m15601h3 == 0) {
                            z10 = true;
                        } else if (m15601h3 == 1) {
                            z10 = z11;
                            i12 = 2;
                        } else if (m15601h3 == 2) {
                            m15601h = c4054z.m15601h(4) + 12;
                        } else if (m15601h3 != 3) {
                            z10 = z11;
                        } else {
                            m15601h = c4054z.m15601h(8) + 29;
                        }
                        m15601h2 = 0;
                        i12 = 0;
                    }
                    m15601h2 = 0;
                }
                z10 = z11;
                i12 = m15601h;
                m15601h2 = c4054z.m15601h(2);
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    m15601h2 = bArr[m15601h2];
                }
                paint.setColor(iArr[m15601h2]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    /* renamed from: h */
    public static int m7564h(C4054z c4054z, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int m15601h;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int m15601h2 = c4054z.m15601h(4);
            int i14 = 2;
            if (m15601h2 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (c4054z.m15600g()) {
                if (c4054z.m15600g()) {
                    int m15601h3 = c4054z.m15601h(2);
                    if (m15601h3 != 0) {
                        if (m15601h3 != 1) {
                            if (m15601h3 == 2) {
                                m15601h = c4054z.m15601h(4) + 9;
                            } else if (m15601h3 != 3) {
                                z10 = z11;
                                m15601h2 = 0;
                                i12 = 0;
                            } else {
                                m15601h = c4054z.m15601h(8) + 25;
                            }
                        }
                        z10 = z11;
                        i12 = i14;
                        m15601h2 = 0;
                    } else {
                        z10 = z11;
                        i12 = 1;
                        m15601h2 = 0;
                    }
                } else {
                    m15601h = c4054z.m15601h(2) + 4;
                }
                m15601h2 = c4054z.m15601h(4);
                z10 = z11;
                i12 = m15601h;
            } else {
                int m15601h4 = c4054z.m15601h(3);
                if (m15601h4 != 0) {
                    i14 = m15601h4 + 2;
                    z10 = z11;
                    i12 = i14;
                    m15601h2 = 0;
                } else {
                    z10 = true;
                    m15601h2 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    m15601h2 = bArr[m15601h2];
                }
                paint.setColor(iArr[m15601h2]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    /* renamed from: i */
    public static int m7565i(C4054z c4054z, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int m15601h;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            int m15601h2 = c4054z.m15601h(8);
            if (m15601h2 != 0) {
                z10 = z11;
                m15601h = 1;
            } else if (c4054z.m15600g()) {
                z10 = z11;
                m15601h = c4054z.m15601h(7);
                m15601h2 = c4054z.m15601h(8);
            } else {
                int m15601h3 = c4054z.m15601h(7);
                if (m15601h3 != 0) {
                    z10 = z11;
                    m15601h = m15601h3;
                    m15601h2 = 0;
                } else {
                    z10 = true;
                    m15601h2 = 0;
                    m15601h = 0;
                }
            }
            if (m15601h != 0 && paint != null) {
                if (bArr != null) {
                    m15601h2 = bArr[m15601h2];
                }
                paint.setColor(iArr[m15601h2]);
                canvas.drawRect(i12, i11, i12 + m15601h, i11 + 1, paint);
            }
            i12 += m15601h;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    /* renamed from: j */
    public static void m7566j(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        C4054z c4054z = new C4054z(bArr);
        int i13 = i11;
        int i14 = i12;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (c4054z.m15595b() != 0) {
            int m15601h = c4054z.m15601h(8);
            if (m15601h != 240) {
                switch (m15601h) {
                    case 16:
                        if (i10 != 3) {
                            if (i10 != 2) {
                                bArr2 = null;
                                i13 = m7563g(c4054z, iArr, bArr2, i13, i14, paint, canvas);
                                break;
                            } else {
                                bArr3 = bArr7 == null ? f6971h : bArr7;
                            }
                        } else {
                            bArr3 = bArr5 == null ? f6972i : bArr5;
                        }
                        bArr2 = bArr3;
                        i13 = m7563g(c4054z, iArr, bArr2, i13, i14, paint, canvas);
                    case 17:
                        if (i10 == 3) {
                            bArr4 = bArr6 == null ? f6973j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i13 = m7564h(c4054z, iArr, bArr4, i13, i14, paint, canvas);
                        break;
                    case 18:
                        i13 = m7565i(c4054z, iArr, null, i13, i14, paint, canvas);
                        continue;
                    default:
                        switch (m15601h) {
                            case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                bArr7 = m7558a(4, 4, c4054z);
                                break;
                            case C1417R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                bArr5 = m7558a(4, 8, c4054z);
                                break;
                            case C1417R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                bArr6 = m7558a(16, 8, c4054z);
                                break;
                            default:
                                continue;
                        }
                }
                c4054z.m15596c();
            } else {
                i14 += 2;
                i13 = i11;
            }
        }
    }

    /* renamed from: k */
    public static void m7567k(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr = i10 == 3 ? aVar.f6984d : i10 == 2 ? aVar.f6983c : aVar.f6982b;
        m7566j(cVar.f6993c, iArr, i10, i11, i12, paint, canvas);
        m7566j(cVar.f6994d, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    /* renamed from: l */
    public static a m7568l(C4054z c4054z, int i10) {
        int m15601h;
        int i11;
        int m15601h2;
        int i12;
        int i13;
        int i14 = 8;
        int m15601h3 = c4054z.m15601h(8);
        c4054z.m15611r(8);
        int i15 = 2;
        int i16 = i10 - 2;
        int[] m7559c = m7559c();
        int[] m7560d = m7560d();
        int[] m7561e = m7561e();
        while (i16 > 0) {
            int m15601h4 = c4054z.m15601h(i14);
            int m15601h5 = c4054z.m15601h(i14);
            int i17 = i16 - 2;
            int[] iArr = (m15601h5 & 128) != 0 ? m7559c : (m15601h5 & 64) != 0 ? m7560d : m7561e;
            if ((m15601h5 & 1) != 0) {
                i12 = c4054z.m15601h(i14);
                i13 = c4054z.m15601h(i14);
                m15601h = c4054z.m15601h(i14);
                m15601h2 = c4054z.m15601h(i14);
                i11 = i17 - 4;
            } else {
                int m15601h6 = c4054z.m15601h(6) << i15;
                int m15601h7 = c4054z.m15601h(4) << 4;
                m15601h = c4054z.m15601h(4) << 4;
                i11 = i17 - 2;
                m15601h2 = c4054z.m15601h(i15) << 6;
                i12 = m15601h6;
                i13 = m15601h7;
            }
            if (i12 == 0) {
                m15601h2 = 255;
                i13 = 0;
                m15601h = 0;
            }
            double d10 = i12;
            double d11 = i13 - 128;
            double d12 = m15601h - 128;
            iArr[m15601h4] = m7562f((byte) (255 - (m15601h2 & 255)), C4041n0.m15477q((int) (d10 + (1.402d * d11)), 0, 255), C4041n0.m15477q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), C4041n0.m15477q((int) (d10 + (d12 * 1.772d)), 0, 255));
            i16 = i11;
            m15601h3 = m15601h3;
            i14 = 8;
            i15 = 2;
        }
        return new a(m15601h3, m7559c, m7560d, m7561e);
    }

    /* renamed from: m */
    public static b m7569m(C4054z c4054z) {
        int i10;
        int i11;
        int i12;
        int i13;
        c4054z.m15611r(4);
        boolean m15600g = c4054z.m15600g();
        c4054z.m15611r(3);
        int m15601h = c4054z.m15601h(16);
        int m15601h2 = c4054z.m15601h(16);
        if (m15600g) {
            int m15601h3 = c4054z.m15601h(16);
            int m15601h4 = c4054z.m15601h(16);
            int m15601h5 = c4054z.m15601h(16);
            i13 = c4054z.m15601h(16);
            i12 = m15601h4;
            i11 = m15601h5;
            i10 = m15601h3;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = m15601h;
            i13 = m15601h2;
        }
        return new b(m15601h, m15601h2, i10, i12, i11, i13);
    }

    /* renamed from: n */
    public static c m7570n(C4054z c4054z) {
        byte[] bArr;
        int m15601h = c4054z.m15601h(16);
        c4054z.m15611r(4);
        int m15601h2 = c4054z.m15601h(2);
        boolean m15600g = c4054z.m15600g();
        c4054z.m15611r(1);
        byte[] bArr2 = C4041n0.f14518f;
        if (m15601h2 == 1) {
            c4054z.m15611r(c4054z.m15601h(8) * 16);
        } else if (m15601h2 == 0) {
            int m15601h3 = c4054z.m15601h(16);
            int m15601h4 = c4054z.m15601h(16);
            if (m15601h3 > 0) {
                bArr2 = new byte[m15601h3];
                c4054z.m15604k(bArr2, 0, m15601h3);
            }
            if (m15601h4 > 0) {
                bArr = new byte[m15601h4];
                c4054z.m15604k(bArr, 0, m15601h4);
                return new c(m15601h, m15600g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(m15601h, m15600g, bArr2, bArr);
    }

    /* renamed from: o */
    public static d m7571o(C4054z c4054z, int i10) {
        int m15601h = c4054z.m15601h(8);
        int m15601h2 = c4054z.m15601h(4);
        int m15601h3 = c4054z.m15601h(2);
        c4054z.m15611r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int m15601h4 = c4054z.m15601h(8);
            c4054z.m15611r(8);
            i11 -= 6;
            sparseArray.put(m15601h4, new e(c4054z.m15601h(16), c4054z.m15601h(16)));
        }
        return new d(m15601h, m15601h2, m15601h3, sparseArray);
    }

    /* renamed from: p */
    public static f m7572p(C4054z c4054z, int i10) {
        int m15601h;
        int m15601h2;
        int m15601h3 = c4054z.m15601h(8);
        c4054z.m15611r(4);
        boolean m15600g = c4054z.m15600g();
        c4054z.m15611r(3);
        int i11 = 16;
        int m15601h4 = c4054z.m15601h(16);
        int m15601h5 = c4054z.m15601h(16);
        int m15601h6 = c4054z.m15601h(3);
        int m15601h7 = c4054z.m15601h(3);
        int i12 = 2;
        c4054z.m15611r(2);
        int m15601h8 = c4054z.m15601h(8);
        int m15601h9 = c4054z.m15601h(8);
        int m15601h10 = c4054z.m15601h(4);
        int m15601h11 = c4054z.m15601h(2);
        c4054z.m15611r(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int m15601h12 = c4054z.m15601h(i11);
            int m15601h13 = c4054z.m15601h(i12);
            int m15601h14 = c4054z.m15601h(i12);
            int m15601h15 = c4054z.m15601h(12);
            int i14 = m15601h11;
            c4054z.m15611r(4);
            int m15601h16 = c4054z.m15601h(12);
            i13 -= 6;
            if (m15601h13 == 1 || m15601h13 == 2) {
                i13 -= 2;
                m15601h = c4054z.m15601h(8);
                m15601h2 = c4054z.m15601h(8);
            } else {
                m15601h = 0;
                m15601h2 = 0;
            }
            sparseArray.put(m15601h12, new g(m15601h13, m15601h14, m15601h15, m15601h16, m15601h, m15601h2));
            m15601h11 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new f(m15601h3, m15600g, m15601h4, m15601h5, m15601h6, m15601h7, m15601h8, m15601h9, m15601h10, m15601h11, sparseArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static void m7573q(C4054z c4054z, h hVar) {
        f fVar;
        SparseArray sparseArray;
        a aVar;
        int i10;
        a aVar2;
        c cVar;
        int m15601h = c4054z.m15601h(8);
        int m15601h2 = c4054z.m15601h(16);
        int m15601h3 = c4054z.m15601h(16);
        int m15597d = c4054z.m15597d() + m15601h3;
        if (m15601h3 * 8 > c4054z.m15595b()) {
            C4046r.m15529i("DvbParser", "Data field length exceeds limit");
            c4054z.m15611r(c4054z.m15595b());
            return;
        }
        switch (m15601h) {
            case 16:
                if (m15601h2 == hVar.f7018a) {
                    d dVar = hVar.f7026i;
                    d m7571o = m7571o(c4054z, m15601h3);
                    if (m7571o.f6997c == 0) {
                        if (dVar != null && dVar.f6996b != m7571o.f6996b) {
                            hVar.f7026i = m7571o;
                            break;
                        }
                    } else {
                        hVar.f7026i = m7571o;
                        hVar.f7020c.clear();
                        hVar.f7021d.clear();
                        hVar.f7022e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f7026i;
                if (m15601h2 == hVar.f7018a && dVar2 != null) {
                    f m7572p = m7572p(c4054z, m15601h3);
                    if (dVar2.f6997c == 0 && (fVar = hVar.f7020c.get(m7572p.f7001a)) != null) {
                        m7572p.m7576a(fVar);
                    }
                    hVar.f7020c.put(m7572p.f7001a, m7572p);
                    break;
                }
                break;
            case 18:
                if (m15601h2 == hVar.f7018a) {
                    a m7568l = m7568l(c4054z, m15601h3);
                    sparseArray = hVar.f7021d;
                    aVar = m7568l;
                } else if (m15601h2 == hVar.f7019b) {
                    a m7568l2 = m7568l(c4054z, m15601h3);
                    sparseArray = hVar.f7023f;
                    aVar = m7568l2;
                }
                i10 = aVar.f6981a;
                aVar2 = aVar;
                sparseArray.put(i10, aVar2);
                break;
            case 19:
                if (m15601h2 == hVar.f7018a) {
                    c m7570n = m7570n(c4054z);
                    sparseArray = hVar.f7022e;
                    cVar = m7570n;
                } else if (m15601h2 == hVar.f7019b) {
                    c m7570n2 = m7570n(c4054z);
                    sparseArray = hVar.f7024g;
                    cVar = m7570n2;
                }
                i10 = cVar.f6991a;
                aVar2 = cVar;
                sparseArray.put(i10, aVar2);
                break;
            case 20:
                if (m15601h2 == hVar.f7018a) {
                    hVar.f7025h = m7569m(c4054z);
                    break;
                }
                break;
        }
        c4054z.m15612s(m15597d - c4054z.m15597d());
    }

    /* renamed from: b */
    public List<C1547b> m7574b(byte[] bArr, int i10) {
        int i11;
        SparseArray<g> sparseArray;
        C4054z c4054z = new C4054z(bArr, i10);
        while (c4054z.m15595b() >= 48 && c4054z.m15601h(8) == 15) {
            m7573q(c4054z, this.f6979f);
        }
        h hVar = this.f6979f;
        d dVar = hVar.f7026i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.f7025h;
        if (bVar == null) {
            bVar = this.f6977d;
        }
        Bitmap bitmap = this.f6980g;
        if (bitmap == null || bVar.f6985a + 1 != bitmap.getWidth() || bVar.f6986b + 1 != this.f6980g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f6985a + 1, bVar.f6986b + 1, Bitmap.Config.ARGB_8888);
            this.f6980g = createBitmap;
            this.f6976c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f6998d;
        for (int i12 = 0; i12 < sparseArray2.size(); i12++) {
            this.f6976c.save();
            e valueAt = sparseArray2.valueAt(i12);
            f fVar = this.f6979f.f7020c.get(sparseArray2.keyAt(i12));
            int i13 = valueAt.f6999a + bVar.f6987c;
            int i14 = valueAt.f7000b + bVar.f6989e;
            this.f6976c.clipRect(i13, i14, Math.min(fVar.f7003c + i13, bVar.f6988d), Math.min(fVar.f7004d + i14, bVar.f6990f));
            a aVar = this.f6979f.f7021d.get(fVar.f7007g);
            if (aVar == null && (aVar = this.f6979f.f7023f.get(fVar.f7007g)) == null) {
                aVar = this.f6978e;
            }
            SparseArray<g> sparseArray3 = fVar.f7011k;
            int i15 = 0;
            while (i15 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i15);
                g valueAt2 = sparseArray3.valueAt(i15);
                c cVar = this.f6979f.f7022e.get(keyAt);
                c cVar2 = cVar == null ? this.f6979f.f7024g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i11 = i15;
                    sparseArray = sparseArray3;
                    m7567k(cVar2, aVar, fVar.f7006f, valueAt2.f7014c + i13, i14 + valueAt2.f7015d, cVar2.f6992b ? null : this.f6974a, this.f6976c);
                } else {
                    i11 = i15;
                    sparseArray = sparseArray3;
                }
                i15 = i11 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f7002b) {
                int i16 = fVar.f7006f;
                this.f6975b.setColor(i16 == 3 ? aVar.f6984d[fVar.f7008h] : i16 == 2 ? aVar.f6983c[fVar.f7009i] : aVar.f6982b[fVar.f7010j]);
                this.f6976c.drawRect(i13, i14, fVar.f7003c + i13, fVar.f7004d + i14, this.f6975b);
            }
            arrayList.add(new C1547b.b().m6323f(Bitmap.createBitmap(this.f6980g, i13, i14, fVar.f7003c, fVar.f7004d)).m6328k(i13 / bVar.f6985a).m6329l(0).m6325h(i14 / bVar.f6986b, 0).m6326i(0).m6331n(fVar.f7003c / bVar.f6985a).m6324g(fVar.f7004d / bVar.f6986b).m6318a());
            this.f6976c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f6976c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: r */
    public void m7575r() {
        this.f6979f.m7577a();
    }
}
