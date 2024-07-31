package p187n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p002a0.C0004a;
import p089g.C1931a;
import p089g.C1933c;
import p089g.C1934d;
import p089g.C1935e;
import p118i.C2572a;
import p187n.C3649n0;

/* renamed from: n.j */
/* loaded from: classes.dex */
public final class C3640j {

    /* renamed from: b */
    public static final PorterDuff.Mode f12886b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C3640j f12887c;

    /* renamed from: a */
    public C3649n0 f12888a;

    /* renamed from: n.j$a */
    /* loaded from: classes.dex */
    public class a implements C3649n0.f {

        /* renamed from: a */
        public final int[] f12889a = {C1935e.f7396R, C1935e.f7394P, C1935e.f7398a};

        /* renamed from: b */
        public final int[] f12890b = {C1935e.f7412o, C1935e.f7380B, C1935e.f7417t, C1935e.f7413p, C1935e.f7414q, C1935e.f7416s, C1935e.f7415r};

        /* renamed from: c */
        public final int[] f12891c = {C1935e.f7393O, C1935e.f7395Q, C1935e.f7408k, C1935e.f7389K, C1935e.f7390L, C1935e.f7391M, C1935e.f7392N};

        /* renamed from: d */
        public final int[] f12892d = {C1935e.f7420w, C1935e.f7406i, C1935e.f7419v};

        /* renamed from: e */
        public final int[] f12893e = {C1935e.f7388J, C1935e.f7397S};

        /* renamed from: f */
        public final int[] f12894f = {C1935e.f7400c, C1935e.f7404g, C1935e.f7401d, C1935e.f7405h};

        @Override // p187n.C3649n0.f
        /* renamed from: a */
        public Drawable mo13549a(C3649n0 c3649n0, Context context, int i10) {
            int i11;
            if (i10 == C1935e.f7407j) {
                return new LayerDrawable(new Drawable[]{c3649n0.m13634j(context, C1935e.f7406i), c3649n0.m13634j(context, C1935e.f7408k)});
            }
            if (i10 == C1935e.f7422y) {
                i11 = C1934d.f7372i;
            } else if (i10 == C1935e.f7421x) {
                i11 = C1934d.f7373j;
            } else {
                if (i10 != C1935e.f7423z) {
                    return null;
                }
                i11 = C1934d.f7374k;
            }
            return m13560l(c3649n0, context, i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
        @Override // p187n.C3649n0.f
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo13550b(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = p187n.C3640j.m13540a()
                int[] r1 = r6.f12889a
                boolean r1 = r6.m13554f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = p089g.C1931a.f7352x
            L14:
                r8 = r3
            L15:
                r1 = r5
                goto L44
            L17:
                int[] r1 = r6.f12891c
                boolean r1 = r6.m13554f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = p089g.C1931a.f7350v
                goto L14
            L22:
                int[] r1 = r6.f12892d
                boolean r1 = r6.m13554f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = p089g.C1935e.f7418u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = p089g.C1935e.f7409l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = r3
                r1 = r4
                r2 = r1
            L44:
                if (r1 == 0) goto L61
                boolean r1 = p187n.C3637h0.m13511a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = p187n.C3657r0.m13695c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = p187n.C3640j.m13542e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p187n.C3640j.a.mo13550b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // p187n.C3649n0.f
        /* renamed from: c */
        public PorterDuff.Mode mo13551c(int i10) {
            if (i10 == C1935e.f7386H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // p187n.C3649n0.f
        /* renamed from: d */
        public ColorStateList mo13552d(Context context, int i10) {
            if (i10 == C1935e.f7410m) {
                return C2572a.m10277a(context, C1933c.f7360e);
            }
            if (i10 == C1935e.f7387I) {
                return C2572a.m10277a(context, C1933c.f7363h);
            }
            if (i10 == C1935e.f7386H) {
                return m13559k(context);
            }
            if (i10 == C1935e.f7403f) {
                return m13558j(context);
            }
            if (i10 == C1935e.f7399b) {
                return m13555g(context);
            }
            if (i10 == C1935e.f7402e) {
                return m13557i(context);
            }
            if (i10 == C1935e.f7382D || i10 == C1935e.f7383E) {
                return C2572a.m10277a(context, C1933c.f7362g);
            }
            if (m13554f(this.f12890b, i10)) {
                return C3657r0.m13697e(context, C1931a.f7352x);
            }
            if (m13554f(this.f12893e, i10)) {
                return C2572a.m10277a(context, C1933c.f7359d);
            }
            if (m13554f(this.f12894f, i10)) {
                return C2572a.m10277a(context, C1933c.f7358c);
            }
            if (i10 == C1935e.f7379A) {
                return C2572a.m10277a(context, C1933c.f7361f);
            }
            return null;
        }

        @Override // p187n.C3649n0.f
        /* renamed from: e */
        public boolean mo13553e(Context context, int i10, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int m13695c;
            if (i10 == C1935e.f7381C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = C1931a.f7352x;
                m13561m(findDrawableByLayerId2, C3657r0.m13695c(context, i11), C3640j.f12886b);
                m13561m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), C3657r0.m13695c(context, i11), C3640j.f12886b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                m13695c = C3657r0.m13695c(context, C1931a.f7350v);
            } else {
                if (i10 != C1935e.f7422y && i10 != C1935e.f7421x && i10 != C1935e.f7423z) {
                    return false;
                }
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m13561m(layerDrawable2.findDrawableByLayerId(R.id.background), C3657r0.m13694b(context, C1931a.f7352x), C3640j.f12886b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i12 = C1931a.f7350v;
                m13561m(findDrawableByLayerId3, C3657r0.m13695c(context, i12), C3640j.f12886b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                m13695c = C3657r0.m13695c(context, i12);
            }
            m13561m(findDrawableByLayerId, m13695c, C3640j.f12886b);
            return true;
        }

        /* renamed from: f */
        public final boolean m13554f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public final ColorStateList m13555g(Context context) {
            return m13556h(context, 0);
        }

        /* renamed from: h */
        public final ColorStateList m13556h(Context context, int i10) {
            int m13695c = C3657r0.m13695c(context, C1931a.f7351w);
            return new ColorStateList(new int[][]{C3657r0.f13017b, C3657r0.f13020e, C3657r0.f13018c, C3657r0.f13024i}, new int[]{C3657r0.m13694b(context, C1931a.f7349u), C0004a.m8c(m13695c, i10), C0004a.m8c(m13695c, i10), i10});
        }

        /* renamed from: i */
        public final ColorStateList m13557i(Context context) {
            return m13556h(context, C3657r0.m13695c(context, C1931a.f7348t));
        }

        /* renamed from: j */
        public final ColorStateList m13558j(Context context) {
            return m13556h(context, C3657r0.m13695c(context, C1931a.f7349u));
        }

        /* renamed from: k */
        public final ColorStateList m13559k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i10 = C1931a.f7353y;
            ColorStateList m13697e = C3657r0.m13697e(context, i10);
            if (m13697e == null || !m13697e.isStateful()) {
                iArr[0] = C3657r0.f13017b;
                iArr2[0] = C3657r0.m13694b(context, i10);
                iArr[1] = C3657r0.f13021f;
                iArr2[1] = C3657r0.m13695c(context, C1931a.f7350v);
                iArr[2] = C3657r0.f13024i;
                iArr2[2] = C3657r0.m13695c(context, i10);
            } else {
                iArr[0] = C3657r0.f13017b;
                iArr2[0] = m13697e.getColorForState(iArr[0], 0);
                iArr[1] = C3657r0.f13021f;
                iArr2[1] = C3657r0.m13695c(context, C1931a.f7350v);
                iArr[2] = C3657r0.f13024i;
                iArr2[2] = m13697e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        public final LayerDrawable m13560l(C3649n0 c3649n0, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable m13634j = c3649n0.m13634j(context, C1935e.f7384F);
            Drawable m13634j2 = c3649n0.m13634j(context, C1935e.f7385G);
            if ((m13634j instanceof BitmapDrawable) && m13634j.getIntrinsicWidth() == dimensionPixelSize && m13634j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) m13634j;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                m13634j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m13634j.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((m13634j2 instanceof BitmapDrawable) && m13634j2.getIntrinsicWidth() == dimensionPixelSize && m13634j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) m13634j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                m13634j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m13634j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* renamed from: m */
        public final void m13561m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (C3637h0.m13511a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C3640j.f12886b;
            }
            drawable.setColorFilter(C3640j.m13542e(i10, mode));
        }
    }

    /* renamed from: b */
    public static synchronized C3640j m13541b() {
        C3640j c3640j;
        synchronized (C3640j.class) {
            if (f12887c == null) {
                m13543h();
            }
            c3640j = f12887c;
        }
        return c3640j;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m13542e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter m13624l;
        synchronized (C3640j.class) {
            m13624l = C3649n0.m13624l(i10, mode);
        }
        return m13624l;
    }

    /* renamed from: h */
    public static synchronized void m13543h() {
        synchronized (C3640j.class) {
            if (f12887c == null) {
                C3640j c3640j = new C3640j();
                f12887c = c3640j;
                c3640j.f12888a = C3649n0.m13623h();
                f12887c.f12888a.m13642u(new a());
            }
        }
    }

    /* renamed from: i */
    public static void m13544i(Drawable drawable, C3663u0 c3663u0, int[] iArr) {
        C3649n0.m13627w(drawable, c3663u0, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m13545c(Context context, int i10) {
        return this.f12888a.m13634j(context, i10);
    }

    /* renamed from: d */
    public synchronized Drawable m13546d(Context context, int i10, boolean z10) {
        return this.f12888a.m13635k(context, i10, z10);
    }

    /* renamed from: f */
    public synchronized ColorStateList m13547f(Context context, int i10) {
        return this.f12888a.m13636m(context, i10);
    }

    /* renamed from: g */
    public synchronized void m13548g(Context context) {
        this.f12888a.m13640s(context);
    }
}
