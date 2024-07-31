package p187n;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p175m.InterfaceC3490f;

/* renamed from: n.j0 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC3641j0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: h */
    public final float f12895h;

    /* renamed from: i */
    public final int f12896i;

    /* renamed from: j */
    public final int f12897j;

    /* renamed from: k */
    public final View f12898k;

    /* renamed from: l */
    public Runnable f12899l;

    /* renamed from: m */
    public Runnable f12900m;

    /* renamed from: n */
    public boolean f12901n;

    /* renamed from: o */
    public int f12902o;

    /* renamed from: p */
    public final int[] f12903p = new int[2];

    /* renamed from: n.j0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC3641j0.this.f12898k.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: n.j0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC3641j0.this.m13564e();
        }
    }

    public AbstractViewOnTouchListenerC3641j0(View view) {
        this.f12898k = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f12895h = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f12896i = tapTimeout;
        this.f12897j = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: h */
    public static boolean m13562h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    /* renamed from: a */
    public final void m13563a() {
        Runnable runnable = this.f12900m;
        if (runnable != null) {
            this.f12898k.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f12899l;
        if (runnable2 != null) {
            this.f12898k.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC3490f mo697b();

    /* renamed from: c */
    public abstract boolean mo698c();

    /* renamed from: d */
    public boolean mo1049d() {
        InterfaceC3490f mo697b = mo697b();
        if (mo697b == null || !mo697b.mo729a()) {
            return true;
        }
        mo697b.dismiss();
        return true;
    }

    /* renamed from: e */
    public void m13564e() {
        m13563a();
        View view = this.f12898k;
        if (view.isEnabled() && !view.isLongClickable() && mo698c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f12901n = true;
        }
    }

    /* renamed from: f */
    public final boolean m13565f(MotionEvent motionEvent) {
        C3639i0 c3639i0;
        View view = this.f12898k;
        InterfaceC3490f mo697b = mo697b();
        if (mo697b == null || !mo697b.mo729a() || (c3639i0 = (C3639i0) mo697b.mo731j()) == null || !c3639i0.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m13567i(view, obtainNoHistory);
        m13568j(c3639i0, obtainNoHistory);
        boolean mo13527e = c3639i0.mo13527e(obtainNoHistory, this.f12902o);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return mo13527e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m13566g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f12898k
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f12902o
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f12895h
            boolean r6 = m13562h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m13563a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m13563a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f12902o = r6
            java.lang.Runnable r6 = r5.f12899l
            if (r6 != 0) goto L52
            n.j0$a r6 = new n.j0$a
            r6.<init>()
            r5.f12899l = r6
        L52:
            java.lang.Runnable r6 = r5.f12899l
            int r1 = r5.f12896i
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f12900m
            if (r6 != 0) goto L65
            n.j0$b r6 = new n.j0$b
            r6.<init>()
            r5.f12900m = r6
        L65:
            java.lang.Runnable r6 = r5.f12900m
            int r1 = r5.f12897j
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p187n.AbstractViewOnTouchListenerC3641j0.m13566g(android.view.MotionEvent):boolean");
    }

    /* renamed from: i */
    public final boolean m13567i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f12903p);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* renamed from: j */
    public final boolean m13568j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f12903p);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f12901n;
        if (z11) {
            z10 = m13565f(motionEvent) || !mo1049d();
        } else {
            z10 = m13566g(motionEvent) && mo698c();
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f12898k.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f12901n = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f12901n = false;
        this.f12902o = -1;
        Runnable runnable = this.f12899l;
        if (runnable != null) {
            this.f12898k.removeCallbacks(runnable);
        }
    }
}
