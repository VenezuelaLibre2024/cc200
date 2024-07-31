package p132j;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p015b0.InterfaceC0437b;
import p132j.C3199b;
import p132j.C3201d;
import p147k.C3301b;
import p147k.C3302c;
import p147k.C3304e;
import p285u.C4774d;
import p285u.C4778h;
import p347y1.C5790b;
import p360z.C5937k;

/* renamed from: j.a */
/* loaded from: classes.dex */
public class C3198a extends C3201d implements InterfaceC0437b {

    /* renamed from: A */
    public static final String f11029A = C3198a.class.getSimpleName();

    /* renamed from: v */
    public c f11030v;

    /* renamed from: w */
    public g f11031w;

    /* renamed from: x */
    public int f11032x;

    /* renamed from: y */
    public int f11033y;

    /* renamed from: z */
    public boolean f11034z;

    /* renamed from: j.a$b */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a */
        public final Animatable f11035a;

        public b(Animatable animatable) {
            super();
            this.f11035a = animatable;
        }

        @Override // p132j.C3198a.g
        /* renamed from: c */
        public void mo11343c() {
            this.f11035a.start();
        }

        @Override // p132j.C3198a.g
        /* renamed from: d */
        public void mo11344d() {
            this.f11035a.stop();
        }
    }

    /* renamed from: j.a$c */
    /* loaded from: classes.dex */
    public static class c extends C3201d.a {

        /* renamed from: K */
        public C4774d<Long> f11036K;

        /* renamed from: L */
        public C4778h<Integer> f11037L;

        public c(c cVar, C3198a c3198a, Resources resources) {
            super(cVar, c3198a, resources);
            C4778h<Integer> c4778h;
            if (cVar != null) {
                this.f11036K = cVar.f11036K;
                c4778h = cVar.f11037L;
            } else {
                this.f11036K = new C4774d<>();
                c4778h = new C4778h<>();
            }
            this.f11037L = c4778h;
        }

        /* renamed from: D */
        public static long m11345D(int i10, int i11) {
            return i11 | (i10 << 32);
        }

        /* renamed from: B */
        public int m11346B(int[] iArr, Drawable drawable, int i10) {
            int m11398z = super.m11398z(iArr, drawable);
            this.f11037L.m18773k(m11398z, Integer.valueOf(i10));
            return m11398z;
        }

        /* renamed from: C */
        public int m11347C(int i10, int i11, Drawable drawable, boolean z10) {
            int m11370a = super.m11370a(drawable);
            long m11345D = m11345D(i10, i11);
            long j10 = z10 ? 8589934592L : 0L;
            long j11 = m11370a;
            this.f11036K.m18730b(m11345D, Long.valueOf(j11 | j10));
            if (z10) {
                this.f11036K.m18730b(m11345D(i11, i10), Long.valueOf(4294967296L | j11 | j10));
            }
            return m11370a;
        }

        /* renamed from: E */
        public int m11348E(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.f11037L.m18771h(i10, 0).intValue();
        }

        /* renamed from: F */
        public int m11349F(int[] iArr) {
            int m11397A = super.m11397A(iArr);
            return m11397A >= 0 ? m11397A : super.m11397A(StateSet.WILD_CARD);
        }

        /* renamed from: G */
        public int m11350G(int i10, int i11) {
            return (int) this.f11036K.m18735h(m11345D(i10, i11), -1L).longValue();
        }

        /* renamed from: H */
        public boolean m11351H(int i10, int i11) {
            return (this.f11036K.m18735h(m11345D(i10, i11), -1L).longValue() & 4294967296L) != 0;
        }

        /* renamed from: I */
        public boolean m11352I(int i10, int i11) {
            return (this.f11036K.m18735h(m11345D(i10, i11), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // p132j.C3201d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C3198a(this, null);
        }

        @Override // p132j.C3201d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C3198a(this, resources);
        }

        @Override // p132j.C3201d.a, p132j.C3199b.d
        /* renamed from: r */
        public void mo11353r() {
            this.f11036K = this.f11036K.clone();
            this.f11037L = this.f11037L.clone();
        }
    }

    /* renamed from: j.a$d */
    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a */
        public final C5790b f11038a;

        public d(C5790b c5790b) {
            super();
            this.f11038a = c5790b;
        }

        @Override // p132j.C3198a.g
        /* renamed from: c */
        public void mo11343c() {
            this.f11038a.start();
        }

        @Override // p132j.C3198a.g
        /* renamed from: d */
        public void mo11344d() {
            this.f11038a.stop();
        }
    }

    /* renamed from: j.a$e */
    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a */
        public final ObjectAnimator f11039a;

        /* renamed from: b */
        public final boolean f11040b;

        public e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            if (Build.VERSION.SDK_INT >= 18) {
                C3301b.m11960a(ofInt, true);
            }
            ofInt.setDuration(fVar.m11356a());
            ofInt.setInterpolator(fVar);
            this.f11040b = z11;
            this.f11039a = ofInt;
        }

        @Override // p132j.C3198a.g
        /* renamed from: a */
        public boolean mo11354a() {
            return this.f11040b;
        }

        @Override // p132j.C3198a.g
        /* renamed from: b */
        public void mo11355b() {
            this.f11039a.reverse();
        }

        @Override // p132j.C3198a.g
        /* renamed from: c */
        public void mo11343c() {
            this.f11039a.start();
        }

        @Override // p132j.C3198a.g
        /* renamed from: d */
        public void mo11344d() {
            this.f11039a.cancel();
        }
    }

    /* renamed from: j.a$f */
    /* loaded from: classes.dex */
    public static class f implements TimeInterpolator {

        /* renamed from: a */
        public int[] f11041a;

        /* renamed from: b */
        public int f11042b;

        /* renamed from: c */
        public int f11043c;

        public f(AnimationDrawable animationDrawable, boolean z10) {
            m11357b(animationDrawable, z10);
        }

        /* renamed from: a */
        public int m11356a() {
            return this.f11043c;
        }

        /* renamed from: b */
        public int m11357b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f11042b = numberOfFrames;
            int[] iArr = this.f11041a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f11041a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f11041a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f11043c = i10;
            return i10;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * this.f11043c) + 0.5f);
            int i11 = this.f11042b;
            int[] iArr = this.f11041a;
            int i12 = 0;
            while (i12 < i11 && i10 >= iArr[i12]) {
                i10 -= iArr[i12];
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f11043c : 0.0f);
        }
    }

    /* renamed from: j.a$g */
    /* loaded from: classes.dex */
    public static abstract class g {
        public g() {
        }

        /* renamed from: a */
        public boolean mo11354a() {
            return false;
        }

        /* renamed from: b */
        public void mo11355b() {
        }

        /* renamed from: c */
        public abstract void mo11343c();

        /* renamed from: d */
        public abstract void mo11344d();
    }

    public C3198a() {
        this(null, null);
    }

    public C3198a(c cVar, Resources resources) {
        super(null);
        this.f11032x = -1;
        this.f11033y = -1;
        mo11333h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: m */
    public static C3198a m11331m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C3198a c3198a = new C3198a();
            c3198a.m11336n(context, resources, xmlPullParser, attributeSet, theme);
            return c3198a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // p132j.C3201d, p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p132j.C3201d, p132j.C3199b
    /* renamed from: h */
    public void mo11333h(C3199b.d dVar) {
        super.mo11333h(dVar);
        if (dVar instanceof c) {
            this.f11030v = (c) dVar;
        }
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // p132j.C3201d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f11031w;
        if (gVar != null) {
            gVar.mo11344d();
            this.f11031w = null;
            m11363g(this.f11032x);
            this.f11032x = -1;
            this.f11033y = -1;
        }
    }

    @Override // p132j.C3201d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c mo11332b() {
        return new c(this.f11030v, this, null);
    }

    @Override // p132j.C3201d, p132j.C3199b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f11034z && super.mutate() == this) {
            this.f11030v.mo11353r();
            this.f11034z = true;
        }
        return this;
    }

    /* renamed from: n */
    public void m11336n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray m23781k = C5937k.m23781k(resources, theme, attributeSet, C3304e.f11509a);
        setVisible(m23781k.getBoolean(C3304e.f11511c, true), true);
        m11342t(m23781k);
        m11364i(resources);
        m23781k.recycle();
        m11337o(context, resources, xmlPullParser, attributeSet, theme);
        m11338p();
    }

    /* renamed from: o */
    public final void m11337o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    m11339q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    m11340r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i10) {
        return super.onLayoutDirectionChanged(i10);
    }

    @Override // p132j.C3201d, p132j.C3199b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int m11349F = this.f11030v.m11349F(iArr);
        boolean z10 = m11349F != m11360c() && (m11341s(m11349F) || m11363g(m11349F));
        Drawable current = getCurrent();
        return current != null ? z10 | current.setState(iArr) : z10;
    }

    /* renamed from: p */
    public final void m11338p() {
        onStateChange(getState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r5 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r7.getName().equals("vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r5 = p347y1.C5796h.m23222c(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 21) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        r5 = p147k.C3302c.m11961a(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r5 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        return r4.f11030v.m11346B(r0, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        r5 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r5 != 4) goto L27;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m11339q(android.content.Context r5, android.content.res.Resources r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, android.content.res.Resources.Theme r9) {
        /*
            r4 = this;
            int[] r0 = p147k.C3304e.f11516h
            android.content.res.TypedArray r0 = p360z.C5937k.m23781k(r6, r9, r8, r0)
            int r1 = p147k.C3304e.f11517i
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = p147k.C3304e.f11518j
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L1f
            n.n0 r3 = p187n.C3649n0.m13623h()
            android.graphics.drawable.Drawable r5 = r3.m13634j(r5, r2)
            goto L20
        L1f:
            r5 = 0
        L20:
            r0.recycle()
            int[] r0 = r4.m11396k(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L70
        L2b:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L33
            goto L2b
        L33:
            r3 = 2
            if (r5 != r3) goto L57
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L47
            y1.h r5 = p347y1.C5796h.m23222c(r6, r7, r8, r9)
            goto L70
        L47:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r5 < r3) goto L52
            android.graphics.drawable.Drawable r5 = p147k.C3302c.m11961a(r6, r7, r8, r9)
            goto L70
        L52:
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r6, r7, r8)
            goto L70
        L57:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L70:
            if (r5 == 0) goto L79
            j.a$c r6 = r4.f11030v
            int r5 = r6.m11346B(r0, r5, r1)
            return r5
        L79:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p132j.C3198a.m11339q(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r4 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r10.getName().equals("animated-vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r4 = p347y1.C5790b.m23189a(r8, r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 21) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r4 = p147k.C3302c.m11961a(r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r4 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r1 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r3 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        return r7.f11030v.m11347C(r1, r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        r4 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r4 != 4) goto L31;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m11340r(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            int[] r0 = p147k.C3304e.f11519k
            android.content.res.TypedArray r0 = p360z.C5937k.m23781k(r9, r12, r11, r0)
            int r1 = p147k.C3304e.f11522n
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = p147k.C3304e.f11521m
            int r3 = r0.getResourceId(r3, r2)
            int r4 = p147k.C3304e.f11520l
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L24
            n.n0 r5 = p187n.C3649n0.m13623h()
            android.graphics.drawable.Drawable r4 = r5.m13634j(r8, r4)
            goto L25
        L24:
            r4 = 0
        L25:
            int r5 = p147k.C3304e.f11523o
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L78
        L33:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L3b
            goto L33
        L3b:
            r6 = 2
            if (r4 != r6) goto L5f
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L4f
            y1.b r4 = p347y1.C5790b.m23189a(r8, r9, r10, r11, r12)
            goto L78
        L4f:
            int r8 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r8 < r4) goto L5a
            android.graphics.drawable.Drawable r4 = p147k.C3302c.m11961a(r9, r10, r11, r12)
            goto L78
        L5a:
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromXmlInner(r9, r10, r11)
            goto L78
        L5f:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L78:
            if (r4 == 0) goto La0
            if (r1 == r2) goto L85
            if (r3 == r2) goto L85
            j.a$c r8 = r7.f11030v
            int r8 = r8.m11347C(r1, r3, r4, r5)
            return r8
        L85:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        La0:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p132j.C3198a.m11340r(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* renamed from: s */
    public final boolean m11341s(int i10) {
        int m11360c;
        int m11350G;
        g bVar;
        g gVar = this.f11031w;
        if (gVar == null) {
            m11360c = m11360c();
        } else {
            if (i10 == this.f11032x) {
                return true;
            }
            if (i10 == this.f11033y && gVar.mo11354a()) {
                gVar.mo11355b();
                this.f11032x = this.f11033y;
                this.f11033y = i10;
                return true;
            }
            m11360c = this.f11032x;
            gVar.mo11344d();
        }
        this.f11031w = null;
        this.f11033y = -1;
        this.f11032x = -1;
        c cVar = this.f11030v;
        int m11348E = cVar.m11348E(m11360c);
        int m11348E2 = cVar.m11348E(i10);
        if (m11348E2 == 0 || m11348E == 0 || (m11350G = cVar.m11350G(m11348E, m11348E2)) < 0) {
            return false;
        }
        boolean m11352I = cVar.m11352I(m11348E, m11348E2);
        m11363g(m11350G);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.m11351H(m11348E, m11348E2), m11352I);
        } else {
            if (!(current instanceof C5790b)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((C5790b) current);
        }
        bVar.mo11343c();
        this.f11031w = bVar;
        this.f11033y = m11360c;
        this.f11032x = i10;
        return true;
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        super.scheduleDrawable(drawable, runnable, j10);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z10) {
        super.setAutoMirrored(z10);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z10) {
        super.setDither(z10);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public /* bridge */ /* synthetic */ void setTint(int i10) {
        super.setTint(i10);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.f11031w;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.mo11343c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    /* renamed from: t */
    public final void m11342t(TypedArray typedArray) {
        c cVar = this.f11030v;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f11070d |= C3302c.m11962b(typedArray);
        }
        cVar.m11392x(typedArray.getBoolean(C3304e.f11512d, cVar.f11075i));
        cVar.m11388t(typedArray.getBoolean(C3304e.f11513e, cVar.f11078l));
        cVar.m11389u(typedArray.getInt(C3304e.f11514f, cVar.f11058A));
        cVar.m11390v(typedArray.getInt(C3304e.f11515g, cVar.f11059B));
        setDither(typedArray.getBoolean(C3304e.f11510b, cVar.f11090x));
    }

    @Override // p132j.C3199b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
