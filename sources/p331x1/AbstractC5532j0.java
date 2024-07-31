package p331x1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p331x1.AbstractC5537m;
import p331x1.C5513a;

/* renamed from: x1.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC5532j0 extends AbstractC5537m {

    /* renamed from: R */
    public static final String[] f20713R = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: Q */
    public int f20714Q = 3;

    /* renamed from: x1.j0$a */
    /* loaded from: classes.dex */
    public class a extends C5539n {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f20715a;

        /* renamed from: b */
        public final /* synthetic */ View f20716b;

        /* renamed from: c */
        public final /* synthetic */ View f20717c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.f20715a = viewGroup;
            this.f20716b = view;
            this.f20717c = view2;
        }

        @Override // p331x1.C5539n, p331x1.AbstractC5537m.f
        /* renamed from: b */
        public void mo22216b(AbstractC5537m abstractC5537m) {
            C5549x.m22343a(this.f20715a).mo22342d(this.f20716b);
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: d */
        public void mo22218d(AbstractC5537m abstractC5537m) {
            this.f20717c.setTag(C5531j.f20710b, null);
            C5549x.m22343a(this.f20715a).mo22342d(this.f20716b);
            abstractC5537m.mo22287T(this);
        }

        @Override // p331x1.C5539n, p331x1.AbstractC5537m.f
        /* renamed from: e */
        public void mo22219e(AbstractC5537m abstractC5537m) {
            if (this.f20716b.getParent() == null) {
                C5549x.m22343a(this.f20715a).mo22341c(this.f20716b);
            } else {
                AbstractC5532j0.this.mo22304h();
            }
        }
    }

    /* renamed from: x1.j0$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements AbstractC5537m.f, C5513a.a {

        /* renamed from: a */
        public final View f20719a;

        /* renamed from: b */
        public final int f20720b;

        /* renamed from: c */
        public final ViewGroup f20721c;

        /* renamed from: d */
        public final boolean f20722d;

        /* renamed from: e */
        public boolean f20723e;

        /* renamed from: f */
        public boolean f20724f = false;

        public b(View view, int i10, boolean z10) {
            this.f20719a = view;
            this.f20720b = i10;
            this.f20721c = (ViewGroup) view.getParent();
            this.f20722d = z10;
            m22265g(true);
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: a */
        public void mo22247a(AbstractC5537m abstractC5537m) {
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: b */
        public void mo22216b(AbstractC5537m abstractC5537m) {
            m22265g(false);
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: c */
        public void mo22217c(AbstractC5537m abstractC5537m) {
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: d */
        public void mo22218d(AbstractC5537m abstractC5537m) {
            m22264f();
            abstractC5537m.mo22287T(this);
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: e */
        public void mo22219e(AbstractC5537m abstractC5537m) {
            m22265g(true);
        }

        /* renamed from: f */
        public final void m22264f() {
            if (!this.f20724f) {
                C5518c0.m22230h(this.f20719a, this.f20720b);
                ViewGroup viewGroup = this.f20721c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m22265g(false);
        }

        /* renamed from: g */
        public final void m22265g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f20722d || this.f20723e == z10 || (viewGroup = this.f20721c) == null) {
                return;
            }
            this.f20723e = z10;
            C5549x.m22345c(viewGroup, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f20724f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m22264f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p331x1.C5513a.a
        public void onAnimationPause(Animator animator) {
            if (this.f20724f) {
                return;
            }
            C5518c0.m22230h(this.f20719a, this.f20720b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p331x1.C5513a.a
        public void onAnimationResume(Animator animator) {
            if (this.f20724f) {
                return;
            }
            C5518c0.m22230h(this.f20719a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: x1.j0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public boolean f20725a;

        /* renamed from: b */
        public boolean f20726b;

        /* renamed from: c */
        public int f20727c;

        /* renamed from: d */
        public int f20728d;

        /* renamed from: e */
        public ViewGroup f20729e;

        /* renamed from: f */
        public ViewGroup f20730f;
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: H */
    public String[] mo22198H() {
        return f20713R;
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: J */
    public boolean mo22258J(C5544s c5544s, C5544s c5544s2) {
        if (c5544s == null && c5544s2 == null) {
            return false;
        }
        if (c5544s != null && c5544s2 != null && c5544s2.f20797a.containsKey("android:visibility:visibility") != c5544s.f20797a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c m22260h0 = m22260h0(c5544s, c5544s2);
        if (m22260h0.f20725a) {
            return m22260h0.f20727c == 0 || m22260h0.f20728d == 0;
        }
        return false;
    }

    /* renamed from: g0 */
    public final void m22259g0(C5544s c5544s) {
        c5544s.f20797a.put("android:visibility:visibility", Integer.valueOf(c5544s.f20798b.getVisibility()));
        c5544s.f20797a.put("android:visibility:parent", c5544s.f20798b.getParent());
        int[] iArr = new int[2];
        c5544s.f20798b.getLocationOnScreen(iArr);
        c5544s.f20797a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r9 == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r0.f20729e == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (r0.f20727c == 0) goto L82;
     */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p331x1.AbstractC5532j0.c m22260h0(p331x1.C5544s r8, p331x1.C5544s r9) {
        /*
            r7 = this;
            x1.j0$c r0 = new x1.j0$c
            r0.<init>()
            r1 = 0
            r0.f20725a = r1
            r0.f20726b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f20797a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f20797a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f20727c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f20797a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f20729e = r6
            goto L37
        L33:
            r0.f20727c = r4
            r0.f20729e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f20797a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f20797a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f20728d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f20797a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f20730f = r2
            goto L5e
        L5a:
            r0.f20728d = r4
            r0.f20730f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f20727c
            int r9 = r0.f20728d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f20729e
            android.view.ViewGroup r4 = r0.f20730f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f20730f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f20729e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f20728d
            if (r8 != 0) goto L8d
        L88:
            r0.f20726b = r2
        L8a:
            r0.f20725a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f20727c
            if (r8 != 0) goto L96
        L93:
            r0.f20726b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p331x1.AbstractC5532j0.m22260h0(x1.s, x1.s):x1.j0$c");
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: i */
    public void mo22201i(C5544s c5544s) {
        m22259g0(c5544s);
    }

    /* renamed from: i0 */
    public abstract Animator mo22238i0(ViewGroup viewGroup, View view, C5544s c5544s, C5544s c5544s2);

    /* renamed from: j0 */
    public Animator m22261j0(ViewGroup viewGroup, C5544s c5544s, int i10, C5544s c5544s2, int i11) {
        if ((this.f20714Q & 1) != 1 || c5544s2 == null) {
            return null;
        }
        if (c5544s == null) {
            View view = (View) c5544s2.f20798b.getParent();
            if (m22260h0(m22315w(view, false), m22278I(view, false)).f20725a) {
                return null;
            }
        }
        return mo22238i0(viewGroup, c5544s2.f20798b, c5544s, c5544s2);
    }

    /* renamed from: k0 */
    public abstract Animator mo22239k0(ViewGroup viewGroup, View view, C5544s c5544s, C5544s c5544s2);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0089, code lost:
    
        if (r17.f20741C != false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator m22262l0(android.view.ViewGroup r18, p331x1.C5544s r19, int r20, p331x1.C5544s r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p331x1.AbstractC5532j0.m22262l0(android.view.ViewGroup, x1.s, int, x1.s, int):android.animation.Animator");
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: m */
    public void mo22202m(C5544s c5544s) {
        m22259g0(c5544s);
    }

    /* renamed from: m0 */
    public void m22263m0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f20714Q = i10;
    }

    @Override // p331x1.AbstractC5537m
    /* renamed from: q */
    public Animator mo22203q(ViewGroup viewGroup, C5544s c5544s, C5544s c5544s2) {
        c m22260h0 = m22260h0(c5544s, c5544s2);
        if (!m22260h0.f20725a) {
            return null;
        }
        if (m22260h0.f20729e == null && m22260h0.f20730f == null) {
            return null;
        }
        return m22260h0.f20726b ? m22261j0(viewGroup, c5544s, m22260h0.f20727c, c5544s2, m22260h0.f20728d) : m22262l0(viewGroup, c5544s, m22260h0.f20727c, c5544s2, m22260h0.f20728d);
    }
}
