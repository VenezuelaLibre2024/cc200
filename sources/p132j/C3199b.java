package p132j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import p015b0.C0436a;

/* renamed from: j.b */
/* loaded from: classes.dex */
public class C3199b extends Drawable implements Drawable.Callback {

    /* renamed from: h */
    public d f11044h;

    /* renamed from: i */
    public Rect f11045i;

    /* renamed from: j */
    public Drawable f11046j;

    /* renamed from: k */
    public Drawable f11047k;

    /* renamed from: m */
    public boolean f11049m;

    /* renamed from: o */
    public boolean f11051o;

    /* renamed from: p */
    public Runnable f11052p;

    /* renamed from: q */
    public long f11053q;

    /* renamed from: r */
    public long f11054r;

    /* renamed from: s */
    public c f11055s;

    /* renamed from: l */
    public int f11048l = 255;

    /* renamed from: n */
    public int f11050n = -1;

    /* renamed from: j.b$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3199b.this.m11359a(true);
            C3199b.this.invalidateSelf();
        }
    }

    /* renamed from: j.b$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static boolean m11365a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m11366b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m11367c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: j.b$c */
    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {

        /* renamed from: h */
        public Drawable.Callback f11057h;

        /* renamed from: a */
        public Drawable.Callback m11368a() {
            Drawable.Callback callback = this.f11057h;
            this.f11057h = null;
            return callback;
        }

        /* renamed from: b */
        public c m11369b(Drawable.Callback callback) {
            this.f11057h = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f11057h;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f11057h;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: j.b$d */
    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {

        /* renamed from: A */
        public int f11058A;

        /* renamed from: B */
        public int f11059B;

        /* renamed from: C */
        public boolean f11060C;

        /* renamed from: D */
        public ColorFilter f11061D;

        /* renamed from: E */
        public boolean f11062E;

        /* renamed from: F */
        public ColorStateList f11063F;

        /* renamed from: G */
        public PorterDuff.Mode f11064G;

        /* renamed from: H */
        public boolean f11065H;

        /* renamed from: I */
        public boolean f11066I;

        /* renamed from: a */
        public final C3199b f11067a;

        /* renamed from: b */
        public Resources f11068b;

        /* renamed from: c */
        public int f11069c;

        /* renamed from: d */
        public int f11070d;

        /* renamed from: e */
        public int f11071e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f11072f;

        /* renamed from: g */
        public Drawable[] f11073g;

        /* renamed from: h */
        public int f11074h;

        /* renamed from: i */
        public boolean f11075i;

        /* renamed from: j */
        public boolean f11076j;

        /* renamed from: k */
        public Rect f11077k;

        /* renamed from: l */
        public boolean f11078l;

        /* renamed from: m */
        public boolean f11079m;

        /* renamed from: n */
        public int f11080n;

        /* renamed from: o */
        public int f11081o;

        /* renamed from: p */
        public int f11082p;

        /* renamed from: q */
        public int f11083q;

        /* renamed from: r */
        public boolean f11084r;

        /* renamed from: s */
        public int f11085s;

        /* renamed from: t */
        public boolean f11086t;

        /* renamed from: u */
        public boolean f11087u;

        /* renamed from: v */
        public boolean f11088v;

        /* renamed from: w */
        public boolean f11089w;

        /* renamed from: x */
        public boolean f11090x;

        /* renamed from: y */
        public boolean f11091y;

        /* renamed from: z */
        public int f11092z;

        public d(d dVar, C3199b c3199b, Resources resources) {
            this.f11075i = false;
            this.f11078l = false;
            this.f11090x = true;
            this.f11058A = 0;
            this.f11059B = 0;
            this.f11067a = c3199b;
            this.f11068b = resources != null ? resources : dVar != null ? dVar.f11068b : null;
            int m11358f = C3199b.m11358f(resources, dVar != null ? dVar.f11069c : 0);
            this.f11069c = m11358f;
            if (dVar == null) {
                this.f11073g = new Drawable[10];
                this.f11074h = 0;
                return;
            }
            this.f11070d = dVar.f11070d;
            this.f11071e = dVar.f11071e;
            this.f11088v = true;
            this.f11089w = true;
            this.f11075i = dVar.f11075i;
            this.f11078l = dVar.f11078l;
            this.f11090x = dVar.f11090x;
            this.f11091y = dVar.f11091y;
            this.f11092z = dVar.f11092z;
            this.f11058A = dVar.f11058A;
            this.f11059B = dVar.f11059B;
            this.f11060C = dVar.f11060C;
            this.f11061D = dVar.f11061D;
            this.f11062E = dVar.f11062E;
            this.f11063F = dVar.f11063F;
            this.f11064G = dVar.f11064G;
            this.f11065H = dVar.f11065H;
            this.f11066I = dVar.f11066I;
            if (dVar.f11069c == m11358f) {
                if (dVar.f11076j) {
                    this.f11077k = dVar.f11077k != null ? new Rect(dVar.f11077k) : null;
                    this.f11076j = true;
                }
                if (dVar.f11079m) {
                    this.f11080n = dVar.f11080n;
                    this.f11081o = dVar.f11081o;
                    this.f11082p = dVar.f11082p;
                    this.f11083q = dVar.f11083q;
                    this.f11079m = true;
                }
            }
            if (dVar.f11084r) {
                this.f11085s = dVar.f11085s;
                this.f11084r = true;
            }
            if (dVar.f11086t) {
                this.f11087u = dVar.f11087u;
                this.f11086t = true;
            }
            Drawable[] drawableArr = dVar.f11073g;
            this.f11073g = new Drawable[drawableArr.length];
            this.f11074h = dVar.f11074h;
            SparseArray<Drawable.ConstantState> sparseArray = dVar.f11072f;
            this.f11072f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f11074h);
            int i10 = this.f11074h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11] != null) {
                    Drawable.ConstantState constantState = drawableArr[i11].getConstantState();
                    if (constantState != null) {
                        this.f11072f.put(i11, constantState);
                    } else {
                        this.f11073g[i11] = drawableArr[i11];
                    }
                }
            }
        }

        /* renamed from: a */
        public final int m11370a(Drawable drawable) {
            int i10 = this.f11074h;
            if (i10 >= this.f11073g.length) {
                mo11384o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f11067a);
            this.f11073g[i10] = drawable;
            this.f11074h++;
            this.f11071e = drawable.getChangingConfigurations() | this.f11071e;
            m11385p();
            this.f11077k = null;
            this.f11076j = false;
            this.f11079m = false;
            this.f11088v = false;
            return i10;
        }

        /* renamed from: b */
        public final void m11371b(Resources.Theme theme) {
            if (theme != null) {
                m11374e();
                int i10 = this.f11074h;
                Drawable[] drawableArr = this.f11073g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11] != null && C0436a.m2251b(drawableArr[i11])) {
                        C0436a.m2250a(drawableArr[i11], theme);
                        this.f11071e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                m11393y(b.m11367c(theme));
            }
        }

        /* renamed from: c */
        public boolean m11372c() {
            if (this.f11088v) {
                return this.f11089w;
            }
            m11374e();
            this.f11088v = true;
            int i10 = this.f11074h;
            Drawable[] drawableArr = this.f11073g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f11089w = false;
                    return false;
                }
            }
            this.f11089w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f11074h;
            Drawable[] drawableArr = this.f11073g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f11072f.get(i11);
                    if (constantState != null && b.m11365a(constantState)) {
                        return true;
                    }
                } else if (C0436a.m2251b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public void m11373d() {
            this.f11079m = true;
            m11374e();
            int i10 = this.f11074h;
            Drawable[] drawableArr = this.f11073g;
            this.f11081o = -1;
            this.f11080n = -1;
            this.f11083q = 0;
            this.f11082p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f11080n) {
                    this.f11080n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f11081o) {
                    this.f11081o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f11082p) {
                    this.f11082p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f11083q) {
                    this.f11083q = minimumHeight;
                }
            }
        }

        /* renamed from: e */
        public final void m11374e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f11072f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f11073g[this.f11072f.keyAt(i10)] = m11387s(this.f11072f.valueAt(i10).newDrawable(this.f11068b));
                }
                this.f11072f = null;
            }
        }

        /* renamed from: f */
        public final int m11375f() {
            return this.f11073g.length;
        }

        /* renamed from: g */
        public final Drawable m11376g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f11073g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f11072f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable m11387s = m11387s(this.f11072f.valueAt(indexOfKey).newDrawable(this.f11068b));
            this.f11073g[i10] = m11387s;
            this.f11072f.removeAt(indexOfKey);
            if (this.f11072f.size() == 0) {
                this.f11072f = null;
            }
            return m11387s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11070d | this.f11071e;
        }

        /* renamed from: h */
        public final int m11377h() {
            return this.f11074h;
        }

        /* renamed from: i */
        public final int m11378i() {
            if (!this.f11079m) {
                m11373d();
            }
            return this.f11081o;
        }

        /* renamed from: j */
        public final int m11379j() {
            if (!this.f11079m) {
                m11373d();
            }
            return this.f11083q;
        }

        /* renamed from: k */
        public final int m11380k() {
            if (!this.f11079m) {
                m11373d();
            }
            return this.f11082p;
        }

        /* renamed from: l */
        public final Rect m11381l() {
            Rect rect = null;
            if (this.f11075i) {
                return null;
            }
            Rect rect2 = this.f11077k;
            if (rect2 != null || this.f11076j) {
                return rect2;
            }
            m11374e();
            Rect rect3 = new Rect();
            int i10 = this.f11074h;
            Drawable[] drawableArr = this.f11073g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f11076j = true;
            this.f11077k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int m11382m() {
            if (!this.f11079m) {
                m11373d();
            }
            return this.f11080n;
        }

        /* renamed from: n */
        public final int m11383n() {
            if (this.f11084r) {
                return this.f11085s;
            }
            m11374e();
            int i10 = this.f11074h;
            Drawable[] drawableArr = this.f11073g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f11085s = opacity;
            this.f11084r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo11384o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f11073g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f11073g = drawableArr;
        }

        /* renamed from: p */
        public void m11385p() {
            this.f11084r = false;
            this.f11086t = false;
        }

        /* renamed from: q */
        public final boolean m11386q() {
            return this.f11078l;
        }

        /* renamed from: r */
        public abstract void mo11353r();

        /* renamed from: s */
        public final Drawable m11387s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                C0436a.m2261l(drawable, this.f11092z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f11067a);
            return mutate;
        }

        /* renamed from: t */
        public final void m11388t(boolean z10) {
            this.f11078l = z10;
        }

        /* renamed from: u */
        public final void m11389u(int i10) {
            this.f11058A = i10;
        }

        /* renamed from: v */
        public final void m11390v(int i10) {
            this.f11059B = i10;
        }

        /* renamed from: w */
        public final boolean m11391w(int i10, int i11) {
            int i12 = this.f11074h;
            Drawable[] drawableArr = this.f11073g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    boolean m2261l = Build.VERSION.SDK_INT >= 23 ? C0436a.m2261l(drawableArr[i13], i10) : false;
                    if (i13 == i11) {
                        z10 = m2261l;
                    }
                }
            }
            this.f11092z = i10;
            return z10;
        }

        /* renamed from: x */
        public final void m11392x(boolean z10) {
            this.f11075i = z10;
        }

        /* renamed from: y */
        public final void m11393y(Resources resources) {
            if (resources != null) {
                this.f11068b = resources;
                int m11358f = C3199b.m11358f(resources, this.f11069c);
                int i10 = this.f11069c;
                this.f11069c = m11358f;
                if (i10 != m11358f) {
                    this.f11079m = false;
                    this.f11076j = false;
                }
            }
        }
    }

    /* renamed from: f */
    public static int m11358f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m11359a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f11049m = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f11046j
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L34
            long r9 = r13.f11053q
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L36
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f11048l
            r3.setAlpha(r9)
            goto L34
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            j.b$d r10 = r13.f11044h
            int r10 = r10.f11058A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f11048l
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L37
        L34:
            r13.f11053q = r7
        L36:
            r3 = r6
        L37:
            android.graphics.drawable.Drawable r9 = r13.f11047k
            if (r9 == 0) goto L5d
            long r10 = r13.f11054r
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L5f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4c
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f11047k = r0
            goto L5d
        L4c:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            j.b$d r4 = r13.f11044h
            int r4 = r4.f11059B
            int r3 = r3 / r4
            int r4 = r13.f11048l
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L60
        L5d:
            r13.f11054r = r7
        L5f:
            r0 = r3
        L60:
            if (r14 == 0) goto L6c
            if (r0 == 0) goto L6c
            java.lang.Runnable r14 = r13.f11052p
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p132j.C3199b.m11359a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f11044h.m11371b(theme);
    }

    /* renamed from: b */
    public d mo11332b() {
        throw null;
    }

    /* renamed from: c */
    public int m11360c() {
        return this.f11050n;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f11044h.canApplyTheme();
    }

    /* renamed from: d */
    public final void m11361d(Drawable drawable) {
        if (this.f11055s == null) {
            this.f11055s = new c();
        }
        drawable.setCallback(this.f11055s.m11369b(drawable.getCallback()));
        try {
            if (this.f11044h.f11058A <= 0 && this.f11049m) {
                drawable.setAlpha(this.f11048l);
            }
            d dVar = this.f11044h;
            if (dVar.f11062E) {
                drawable.setColorFilter(dVar.f11061D);
            } else {
                if (dVar.f11065H) {
                    C0436a.m2263n(drawable, dVar.f11063F);
                }
                d dVar2 = this.f11044h;
                if (dVar2.f11066I) {
                    C0436a.m2264o(drawable, dVar2.f11064G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f11044h.f11090x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                C0436a.m2261l(drawable, C0436a.m2254e(this));
            }
            if (i10 >= 19) {
                C0436a.m2258i(drawable, this.f11044h.f11060C);
            }
            Rect rect = this.f11045i;
            if (i10 >= 21 && rect != null) {
                C0436a.m2260k(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f11055s.m11368a());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11046j;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f11047k;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public final boolean m11362e() {
        return isAutoMirrored() && C0436a.m2254e(this) == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m11363g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f11050n
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            j.b$d r0 = r9.f11044h
            int r0 = r0.f11059B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f11047k
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f11046j
            if (r0 == 0) goto L29
            r9.f11047k = r0
            j.b$d r0 = r9.f11044h
            int r0 = r0.f11059B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f11054r = r0
            goto L35
        L29:
            r9.f11047k = r4
            r9.f11054r = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f11046j
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            j.b$d r0 = r9.f11044h
            int r1 = r0.f11074h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m11376g(r10)
            r9.f11046j = r0
            r9.f11050n = r10
            if (r0 == 0) goto L5a
            j.b$d r10 = r9.f11044h
            int r10 = r10.f11058A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f11053q = r2
        L51:
            r9.m11361d(r0)
            goto L5a
        L55:
            r9.f11046j = r4
            r10 = -1
            r9.f11050n = r10
        L5a:
            long r0 = r9.f11053q
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f11054r
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f11052p
            if (r10 != 0) goto L73
            j.b$a r10 = new j.b$a
            r10.<init>()
            r9.f11052p = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.m11359a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p132j.C3199b.m11363g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f11048l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f11044h.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f11044h.m11372c()) {
            return null;
        }
        this.f11044h.f11070d = getChangingConfigurations();
        return this.f11044h;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f11046j;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f11045i;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f11044h.m11386q()) {
            return this.f11044h.m11378i();
        }
        Drawable drawable = this.f11046j;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f11044h.m11386q()) {
            return this.f11044h.m11382m();
        }
        Drawable drawable = this.f11046j;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f11044h.m11386q()) {
            return this.f11044h.m11379j();
        }
        Drawable drawable = this.f11046j;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f11044h.m11386q()) {
            return this.f11044h.m11380k();
        }
        Drawable drawable = this.f11046j;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f11046j;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f11044h.m11383n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f11046j;
        if (drawable != null) {
            b.m11366b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m11381l = this.f11044h.m11381l();
        if (m11381l != null) {
            rect.set(m11381l);
            padding = (m11381l.right | ((m11381l.left | m11381l.top) | m11381l.bottom)) != 0;
        } else {
            Drawable drawable = this.f11046j;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m11362e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    /* renamed from: h */
    public void mo11333h(d dVar) {
        this.f11044h = dVar;
        int i10 = this.f11050n;
        if (i10 >= 0) {
            Drawable m11376g = dVar.m11376g(i10);
            this.f11046j = m11376g;
            if (m11376g != null) {
                m11361d(m11376g);
            }
        }
        this.f11047k = null;
    }

    /* renamed from: i */
    public final void m11364i(Resources resources) {
        this.f11044h.m11393y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f11044h;
        if (dVar != null) {
            dVar.m11385p();
        }
        if (drawable != this.f11046j || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f11044h.f11060C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f11047k;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f11047k = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f11046j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f11049m) {
                this.f11046j.setAlpha(this.f11048l);
            }
        }
        if (this.f11054r != 0) {
            this.f11054r = 0L;
            z10 = true;
        }
        if (this.f11053q != 0) {
            this.f11053q = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f11051o && super.mutate() == this) {
            d mo11332b = mo11332b();
            mo11332b.mo11353r();
            mo11333h(mo11332b);
            this.f11051o = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11047k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f11046j;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f11044h.m11391w(i10, m11360c());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f11047k;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f11046j;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11047k;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f11046j;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f11046j || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f11049m && this.f11048l == i10) {
            return;
        }
        this.f11049m = true;
        this.f11048l = i10;
        Drawable drawable = this.f11046j;
        if (drawable != null) {
            if (this.f11053q == 0) {
                drawable.setAlpha(i10);
            } else {
                m11359a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f11044h;
        if (dVar.f11060C != z10) {
            dVar.f11060C = z10;
            Drawable drawable = this.f11046j;
            if (drawable != null) {
                C0436a.m2258i(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f11044h;
        dVar.f11062E = true;
        if (dVar.f11061D != colorFilter) {
            dVar.f11061D = colorFilter;
            Drawable drawable = this.f11046j;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f11044h;
        if (dVar.f11090x != z10) {
            dVar.f11090x = z10;
            Drawable drawable = this.f11046j;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f11046j;
        if (drawable != null) {
            C0436a.m2259j(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f11045i;
        if (rect == null) {
            this.f11045i = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f11046j;
        if (drawable != null) {
            C0436a.m2260k(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f11044h;
        dVar.f11065H = true;
        if (dVar.f11063F != colorStateList) {
            dVar.f11063F = colorStateList;
            C0436a.m2263n(this.f11046j, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f11044h;
        dVar.f11066I = true;
        if (dVar.f11064G != mode) {
            dVar.f11064G = mode;
            C0436a.m2264o(this.f11046j, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f11047k;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f11046j;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f11046j || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
