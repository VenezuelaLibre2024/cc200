package p331x1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p148k0.C3308b0;

/* renamed from: x1.c */
/* loaded from: classes.dex */
public class C5517c extends AbstractC5537m {

    /* renamed from: T */
    public static final String[] f20632T = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: U */
    public static final Property<Drawable, PointF> f20633U = new b(PointF.class, "boundsOrigin");

    /* renamed from: V */
    public static final Property<k, PointF> f20634V = new c(PointF.class, "topLeft");

    /* renamed from: W */
    public static final Property<k, PointF> f20635W = new d(PointF.class, "bottomRight");

    /* renamed from: X */
    public static final Property<View, PointF> f20636X = new e(PointF.class, "bottomRight");

    /* renamed from: Y */
    public static final Property<View, PointF> f20637Y = new f(PointF.class, "topLeft");

    /* renamed from: Z */
    public static final Property<View, PointF> f20638Z = new g(PointF.class, "position");

    /* renamed from: a0 */
    public static C5533k f20639a0 = new C5533k();

    /* renamed from: Q */
    public int[] f20640Q = new int[2];

    /* renamed from: R */
    public boolean f20641R = false;

    /* renamed from: S */
    public boolean f20642S = false;

    /* renamed from: x1.c$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f20643a;

        /* renamed from: b */
        public final /* synthetic */ BitmapDrawable f20644b;

        /* renamed from: c */
        public final /* synthetic */ View f20645c;

        /* renamed from: d */
        public final /* synthetic */ float f20646d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f20643a = viewGroup;
            this.f20644b = bitmapDrawable;
            this.f20645c = view;
            this.f20646d = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5518c0.m22224b(this.f20643a).mo22196b(this.f20644b);
            C5518c0.m22229g(this.f20645c, this.f20646d);
        }
    }

    /* renamed from: x1.c$b */
    /* loaded from: classes.dex */
    public class b extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f20648a;

        public b(Class cls, String str) {
            super(cls, str);
            this.f20648a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f20648a);
            Rect rect = this.f20648a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f20648a);
            this.f20648a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f20648a);
        }
    }

    /* renamed from: x1.c$c */
    /* loaded from: classes.dex */
    public class c extends Property<k, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.m22222c(pointF);
        }
    }

    /* renamed from: x1.c$d */
    /* loaded from: classes.dex */
    public class d extends Property<k, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.m22220a(pointF);
        }
    }

    /* renamed from: x1.c$e */
    /* loaded from: classes.dex */
    public class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C5518c0.m22228f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: x1.c$f */
    /* loaded from: classes.dex */
    public class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C5518c0.m22228f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: x1.c$g */
    /* loaded from: classes.dex */
    public class g extends Property<View, PointF> {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C5518c0.m22228f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: x1.c$h */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ k f20649a;
        private k mViewBounds;

        public h(k kVar) {
            this.f20649a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: x1.c$i */
    /* loaded from: classes.dex */
    public class i extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f20651a;

        /* renamed from: b */
        public final /* synthetic */ View f20652b;

        /* renamed from: c */
        public final /* synthetic */ Rect f20653c;

        /* renamed from: d */
        public final /* synthetic */ int f20654d;

        /* renamed from: e */
        public final /* synthetic */ int f20655e;

        /* renamed from: f */
        public final /* synthetic */ int f20656f;

        /* renamed from: g */
        public final /* synthetic */ int f20657g;

        public i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f20652b = view;
            this.f20653c = rect;
            this.f20654d = i10;
            this.f20655e = i11;
            this.f20656f = i12;
            this.f20657g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f20651a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f20651a) {
                return;
            }
            C3308b0.m12018c0(this.f20652b, this.f20653c);
            C5518c0.m22228f(this.f20652b, this.f20654d, this.f20655e, this.f20656f, this.f20657g);
        }
    }

    /* renamed from: x1.c$j */
    /* loaded from: classes.dex */
    public class j extends C5539n {

        /* renamed from: a */
        public boolean f20659a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f20660b;

        public j(ViewGroup viewGroup) {
            this.f20660b = viewGroup;
        }

        @Override // p331x1.C5539n, p331x1.AbstractC5537m.f
        /* renamed from: b */
        public void mo22216b(AbstractC5537m abstractC5537m) {
            C5549x.m22345c(this.f20660b, false);
        }

        @Override // p331x1.C5539n, p331x1.AbstractC5537m.f
        /* renamed from: c */
        public void mo22217c(AbstractC5537m abstractC5537m) {
            C5549x.m22345c(this.f20660b, false);
            this.f20659a = true;
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: d */
        public void mo22218d(AbstractC5537m abstractC5537m) {
            if (!this.f20659a) {
                C5549x.m22345c(this.f20660b, false);
            }
            abstractC5537m.mo22287T(this);
        }

        @Override // p331x1.C5539n, p331x1.AbstractC5537m.f
        /* renamed from: e */
        public void mo22219e(AbstractC5537m abstractC5537m) {
            C5549x.m22345c(this.f20660b, true);
        }
    }

    /* renamed from: x1.c$k */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a */
        public int f20662a;

        /* renamed from: b */
        public int f20663b;

        /* renamed from: c */
        public int f20664c;

        /* renamed from: d */
        public int f20665d;

        /* renamed from: e */
        public View f20666e;

        /* renamed from: f */
        public int f20667f;

        /* renamed from: g */
        public int f20668g;

        public k(View view) {
            this.f20666e = view;
        }

        /* renamed from: a */
        public void m22220a(PointF pointF) {
            this.f20664c = Math.round(pointF.x);
            this.f20665d = Math.round(pointF.y);
            int i10 = this.f20668g + 1;
            this.f20668g = i10;
            if (this.f20667f == i10) {
                m22221b();
            }
        }

        /* renamed from: b */
        public final void m22221b() {
            C5518c0.m22228f(this.f20666e, this.f20662a, this.f20663b, this.f20664c, this.f20665d);
            this.f20667f = 0;
            this.f20668g = 0;
        }

        /* renamed from: c */
        public void m22222c(PointF pointF) {
            this.f20662a = Math.round(pointF.x);
            this.f20663b = Math.round(pointF.y);
            int i10 = this.f20667f + 1;
            this.f20667f = i10;
            if (i10 == this.f20668g) {
                m22221b();
            }
        }
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: H */
    public String[] mo22198H() {
        return f20632T;
    }

    /* renamed from: g0 */
    public final void m22199g0(C5544s c5544s) {
        View view = c5544s.f20798b;
        if (!C3308b0.m11993G(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c5544s.f20797a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c5544s.f20797a.put("android:changeBounds:parent", c5544s.f20798b.getParent());
        if (this.f20642S) {
            c5544s.f20798b.getLocationInWindow(this.f20640Q);
            c5544s.f20797a.put("android:changeBounds:windowX", Integer.valueOf(this.f20640Q[0]));
            c5544s.f20797a.put("android:changeBounds:windowY", Integer.valueOf(this.f20640Q[1]));
        }
        if (this.f20641R) {
            c5544s.f20797a.put("android:changeBounds:clip", C3308b0.m12044r(view));
        }
    }

    /* renamed from: h0 */
    public final boolean m22200h0(View view, View view2) {
        if (!this.f20642S) {
            return true;
        }
        C5544s m22315w = m22315w(view, true);
        if (m22315w == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == m22315w.f20798b) {
            return true;
        }
        return false;
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: i */
    public void mo22201i(C5544s c5544s) {
        m22199g0(c5544s);
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: m */
    public void mo22202m(C5544s c5544s) {
        m22199g0(c5544s);
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: q */
    public Animator mo22203q(ViewGroup viewGroup, C5544s c5544s, C5544s c5544s2) {
        int i10;
        View view;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator m22339c;
        Path mo22252a;
        Property<View, PointF> property;
        if (c5544s == null || c5544s2 == null) {
            return null;
        }
        Map<String, Object> map = c5544s.f20797a;
        Map<String, Object> map2 = c5544s2.f20797a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c5544s2.f20798b;
        if (!m22200h0(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) c5544s.f20797a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) c5544s.f20797a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) c5544s2.f20797a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) c5544s2.f20797a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f20640Q);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float m22225c = C5518c0.m22225c(view2);
            C5518c0.m22229g(view2, 0.0f);
            C5518c0.m22224b(viewGroup).mo22195a(bitmapDrawable);
            AbstractC5525g m22317y = m22317y();
            int[] iArr = this.f20640Q;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C5529i.m22256a(f20633U, m22317y.mo22252a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
            ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, m22225c));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) c5544s.f20797a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) c5544s2.f20797a.get("android:changeBounds:bounds");
        int i12 = rect2.left;
        int i13 = rect3.left;
        int i14 = rect2.top;
        int i15 = rect3.top;
        int i16 = rect2.right;
        int i17 = rect3.right;
        int i18 = rect2.bottom;
        int i19 = rect3.bottom;
        int i20 = i16 - i12;
        int i21 = i18 - i14;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        Rect rect4 = (Rect) c5544s.f20797a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) c5544s2.f20797a.get("android:changeBounds:clip");
        if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
            i10 = 0;
        } else {
            i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
            if (i16 != i17 || i18 != i19) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        if (i10 <= 0) {
            return null;
        }
        if (this.f20641R) {
            view = view2;
            C5518c0.m22228f(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
            ObjectAnimator m22250a = (i12 == i13 && i14 == i15) ? null : C5523f.m22250a(view, f20638Z, m22317y().mo22252a(i12, i14, i13, i15));
            if (rect4 == null) {
                i11 = 0;
                rect = new Rect(0, 0, i20, i21);
            } else {
                i11 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i11, i11, i22, i23) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                C3308b0.m12018c0(view, rect);
                C5533k c5533k = f20639a0;
                Object[] objArr = new Object[2];
                objArr[i11] = rect;
                objArr[1] = rect6;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c5533k, objArr);
                ofObject.addListener(new i(view, rect5, i13, i15, i17, i19));
                objectAnimator = ofObject;
            }
            m22339c = C5543r.m22339c(m22250a, objectAnimator);
        } else {
            view = view2;
            C5518c0.m22228f(view, i12, i14, i16, i18);
            if (i10 == 2) {
                if (i20 == i22 && i21 == i23) {
                    mo22252a = m22317y().mo22252a(i12, i14, i13, i15);
                    property = f20638Z;
                } else {
                    k kVar = new k(view);
                    ObjectAnimator m22250a2 = C5523f.m22250a(kVar, f20634V, m22317y().mo22252a(i12, i14, i13, i15));
                    ObjectAnimator m22250a3 = C5523f.m22250a(kVar, f20635W, m22317y().mo22252a(i16, i18, i17, i19));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(m22250a2, m22250a3);
                    animatorSet.addListener(new h(kVar));
                    m22339c = animatorSet;
                }
            } else if (i12 == i13 && i14 == i15) {
                mo22252a = m22317y().mo22252a(i16, i18, i17, i19);
                property = f20636X;
            } else {
                mo22252a = m22317y().mo22252a(i12, i14, i13, i15);
                property = f20637Y;
            }
            m22339c = C5523f.m22250a(view, property, mo22252a);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            C5549x.m22345c(viewGroup4, true);
            mo22295b(new j(viewGroup4));
        }
        return m22339c;
    }
}
