package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import p148k0.ViewTreeObserverOnPreDrawListenerC3342y;
import p361z0.C5939a;
import p361z0.C5940b;

/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
public class C0308k {

    /* renamed from: androidx.fragment.app.k$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final Animation f1519a;

        /* renamed from: b */
        public final Animator f1520b;

        public a(Animator animator) {
            this.f1519a = null;
            this.f1520b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public a(Animation animation) {
            this.f1519a = animation;
            this.f1520b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.k$b */
    /* loaded from: classes.dex */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: h */
        public final ViewGroup f1521h;

        /* renamed from: i */
        public final View f1522i;

        /* renamed from: j */
        public boolean f1523j;

        /* renamed from: k */
        public boolean f1524k;

        /* renamed from: l */
        public boolean f1525l;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1525l = true;
            this.f1521h = viewGroup;
            this.f1522i = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f1525l = true;
            if (this.f1523j) {
                return !this.f1524k;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f1523j = true;
                ViewTreeObserverOnPreDrawListenerC3342y.m12395a(this.f1521h, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f1525l = true;
            if (this.f1523j) {
                return !this.f1524k;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f1523j = true;
                ViewTreeObserverOnPreDrawListenerC3342y.m12395a(this.f1521h, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1523j || !this.f1525l) {
                this.f1521h.endViewTransition(this.f1522i);
                this.f1524k = true;
            } else {
                this.f1525l = false;
                this.f1521h.post(this);
            }
        }
    }

    /* renamed from: a */
    public static int m1531a(Fragment fragment, boolean z10, boolean z11) {
        return z11 ? z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* renamed from: b */
    public static a m1532b(Context context, Fragment fragment, boolean z10, boolean z11) {
        int nextTransition = fragment.getNextTransition();
        int m1531a = m1531a(fragment, z10, z11);
        boolean z12 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i10 = C5940b.f22088c;
            if (viewGroup.getTag(i10) != null) {
                fragment.mContainer.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, m1531a);
        if (onCreateAnimation != null) {
            return new a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, m1531a);
        if (onCreateAnimator != null) {
            return new a(onCreateAnimator);
        }
        if (m1531a == 0 && nextTransition != 0) {
            m1531a = m1534d(context, nextTransition, z10);
        }
        if (m1531a != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(m1531a));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, m1531a);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                    z12 = true;
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            if (!z12) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, m1531a);
                    if (loadAnimator != null) {
                        return new a(loadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (equals) {
                        throw e11;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, m1531a);
                    if (loadAnimation2 != null) {
                        return new a(loadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static int m1533c(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: d */
    public static int m1534d(Context context, int i10, boolean z10) {
        int i11;
        if (i10 == 4097) {
            return z10 ? C5939a.f22084e : C5939a.f22085f;
        }
        if (i10 == 8194) {
            return z10 ? C5939a.f22080a : C5939a.f22081b;
        }
        if (i10 == 8197) {
            i11 = z10 ? R.attr.activityCloseEnterAnimation : R.attr.activityCloseExitAnimation;
        } else {
            if (i10 == 4099) {
                return z10 ? C5939a.f22082c : C5939a.f22083d;
            }
            if (i10 != 4100) {
                return -1;
            }
            i11 = z10 ? R.attr.activityOpenEnterAnimation : R.attr.activityOpenExitAnimation;
        }
        return m1533c(context, i11);
    }
}
