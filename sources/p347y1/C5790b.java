package p347y1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p015b0.C0436a;
import p285u.C4771a;
import p360z.C5937k;

/* renamed from: y1.b */
/* loaded from: classes.dex */
public class C5790b extends AbstractC5795g implements Animatable {

    /* renamed from: i */
    public b f21640i;

    /* renamed from: j */
    public Context f21641j;

    /* renamed from: k */
    public ArgbEvaluator f21642k;

    /* renamed from: l */
    public Animator.AnimatorListener f21643l;

    /* renamed from: m */
    public ArrayList<Object> f21644m;

    /* renamed from: n */
    public final Drawable.Callback f21645n;

    /* renamed from: y1.b$a */
    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C5790b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            C5790b.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C5790b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: y1.b$b */
    /* loaded from: classes.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a */
        public int f21647a;

        /* renamed from: b */
        public C5796h f21648b;

        /* renamed from: c */
        public AnimatorSet f21649c;

        /* renamed from: d */
        public ArrayList<Animator> f21650d;

        /* renamed from: e */
        public C4771a<Animator, String> f21651e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f21647a = bVar.f21647a;
                C5796h c5796h = bVar.f21648b;
                if (c5796h != null) {
                    Drawable.ConstantState constantState = c5796h.getConstantState();
                    this.f21648b = (C5796h) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C5796h c5796h2 = (C5796h) this.f21648b.mutate();
                    this.f21648b = c5796h2;
                    c5796h2.setCallback(callback);
                    this.f21648b.setBounds(bVar.f21648b.getBounds());
                    this.f21648b.m23227h(false);
                }
                ArrayList<Animator> arrayList = bVar.f21650d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f21650d = new ArrayList<>(size);
                    this.f21651e = new C4771a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = bVar.f21650d.get(i10);
                        Animator clone = animator.clone();
                        String str = bVar.f21651e.get(animator);
                        clone.setTarget(this.f21648b.m23224d(str));
                        this.f21650d.add(clone);
                        this.f21651e.put(clone, str);
                    }
                    m23192a();
                }
            }
        }

        /* renamed from: a */
        public void m23192a() {
            if (this.f21649c == null) {
                this.f21649c = new AnimatorSet();
            }
            this.f21649c.playTogether(this.f21650d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f21647a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: y1.b$c */
    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f21652a;

        public c(Drawable.ConstantState constantState) {
            this.f21652a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f21652a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f21652a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C5790b c5790b = new C5790b();
            Drawable newDrawable = this.f21652a.newDrawable();
            c5790b.f21657h = newDrawable;
            newDrawable.setCallback(c5790b.f21645n);
            return c5790b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C5790b c5790b = new C5790b();
            Drawable newDrawable = this.f21652a.newDrawable(resources);
            c5790b.f21657h = newDrawable;
            newDrawable.setCallback(c5790b.f21645n);
            return c5790b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C5790b c5790b = new C5790b();
            Drawable newDrawable = this.f21652a.newDrawable(resources, theme);
            c5790b.f21657h = newDrawable;
            newDrawable.setCallback(c5790b.f21645n);
            return c5790b;
        }
    }

    public C5790b() {
        this(null, null, null);
    }

    public C5790b(Context context) {
        this(context, null, null);
    }

    public C5790b(Context context, b bVar, Resources resources) {
        this.f21642k = null;
        this.f21643l = null;
        this.f21644m = null;
        a aVar = new a();
        this.f21645n = aVar;
        this.f21641j = context;
        if (bVar != null) {
            this.f21640i = bVar;
        } else {
            this.f21640i = new b(context, bVar, aVar, resources);
        }
    }

    /* renamed from: a */
    public static C5790b m23189a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C5790b c5790b = new C5790b(context);
        c5790b.inflate(resources, xmlPullParser, attributeSet, theme);
        return c5790b;
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            C0436a.m2250a(drawable, theme);
        }
    }

    /* renamed from: b */
    public final void m23190b(String str, Animator animator) {
        animator.setTarget(this.f21640i.f21648b.m23224d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m23191c(animator);
        }
        b bVar = this.f21640i;
        if (bVar.f21650d == null) {
            bVar.f21650d = new ArrayList<>();
            this.f21640i.f21651e = new C4771a<>();
        }
        this.f21640i.f21650d.add(animator);
        this.f21640i.f21651e.put(animator, str);
    }

    /* renamed from: c */
    public final void m23191c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i10 = 0; i10 < childAnimations.size(); i10++) {
                m23191c(childAnimations.get(i10));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f21642k == null) {
                    this.f21642k = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f21642k);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            return C0436a.m2251b(drawable);
        }
        return false;
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f21640i.f21648b.draw(canvas);
        if (this.f21640i.f21649c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f21657h;
        return drawable != null ? C0436a.m2252c(drawable) : this.f21640i.f21648b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f21657h;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f21640i.f21647a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f21657h;
        return drawable != null ? C0436a.m2253d(drawable) : this.f21640i.f21648b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f21657h == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f21657h.getConstantState());
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f21657h;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f21640i.f21648b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f21657h;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f21640i.f21648b.getIntrinsicWidth();
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f21657h;
        return drawable != null ? drawable.getOpacity() : this.f21640i.f21648b.getOpacity();
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            C0436a.m2255f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C5937k.m23781k(resources, theme, attributeSet, C5789a.f21632e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C5796h m23221b = C5796h.m23221b(resources, resourceId, theme);
                        m23221b.m23227h(false);
                        m23221b.setCallback(this.f21645n);
                        C5796h c5796h = this.f21640i.f21648b;
                        if (c5796h != null) {
                            c5796h.setCallback(null);
                        }
                        this.f21640i.f21648b = m23221b;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C5789a.f21633f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f21641j;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m23190b(string, C5792d.m23203i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f21640i.m23192a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f21657h;
        return drawable != null ? C0436a.m2256g(drawable) : this.f21640i.f21648b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f21657h;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f21640i.f21649c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f21657h;
        return drawable != null ? drawable.isStateful() : this.f21640i.f21648b.isStateful();
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f21640i.f21648b.setBounds(rect);
        }
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f21657h;
        return drawable != null ? drawable.setLevel(i10) : this.f21640i.f21648b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f21657h;
        return drawable != null ? drawable.setState(iArr) : this.f21640i.f21648b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f21640i.f21648b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            C0436a.m2258i(drawable, z10);
        } else {
            this.f21640i.f21648b.setAutoMirrored(z10);
        }
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f21640i.f21648b.setColorFilter(colorFilter);
        }
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p347y1.AbstractC5795g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTint(int i10) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            C0436a.m2262m(drawable, i10);
        } else {
            this.f21640i.f21648b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            C0436a.m2263n(drawable, colorStateList);
        } else {
            this.f21640i.f21648b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            C0436a.m2264o(drawable, mode);
        } else {
            this.f21640i.f21648b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f21640i.f21648b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f21640i.f21649c.isStarted()) {
                return;
            }
            this.f21640i.f21649c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f21657h;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f21640i.f21649c.end();
        }
    }
}
