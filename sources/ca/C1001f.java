package ca;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import ca.C1001f;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p012aa.C0082c;
import p012aa.InterfaceC0080a;
import p012aa.InterfaceC0081b;
import p052da.C1607b;
import p068ea.C1763b;
import p083fa.C1887b;
import p112ha.C2454b;
import p112ha.C2455c;
import p336x6.C5629c;
import p336x6.C5634h;
import p367z6.C5998b;
import p367z6.C6000c;
import p367z6.C6020m;
import p367z6.C6022n;
import p370z9.C6094b;
import p370z9.C6096d;

/* renamed from: ca.f */
/* loaded from: classes.dex */
public class C1001f<T extends InterfaceC0081b> implements InterfaceC0996a<T> {
    private C0082c.c<T> mClickListener;
    private final C0082c<T> mClusterManager;
    private Set<? extends InterfaceC0080a<T>> mClusters;
    private ShapeDrawable mColoredCircleBackground;
    private final float mDensity;
    private final C2454b mIconGenerator;
    private C0082c.d<T> mInfoWindowClickListener;
    private C0082c.e<T> mInfoWindowLongClickListener;
    private C0082c.f<T> mItemClickListener;
    private C0082c.g<T> mItemInfoWindowClickListener;
    private C0082c.h<T> mItemInfoWindowLongClickListener;
    private final C5629c mMap;
    private float mZoom;
    private static final int[] BUCKETS = {10, 20, 50, 100, 200, 500, 1000};
    private static final TimeInterpolator ANIMATION_INTERP = new DecelerateInterpolator();
    private final Executor mExecutor = Executors.newSingleThreadExecutor();
    private Set<g> mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
    private SparseArray<C5998b> mIcons = new SparseArray<>();
    private e<T> mMarkerCache = new e<>(null);
    private int mMinClusterSize = 4;
    private e<InterfaceC0080a<T>> mClusterMarkerCache = new e<>(null);
    private final C1001f<T>.i mViewModifier = new i(this, null);
    private boolean mAnimate = true;
    private long mAnimationDurationMs = 300;

    /* renamed from: ca.f$a */
    /* loaded from: classes.dex */
    public class a implements C5629c.j {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p336x6.C5629c.j
        public boolean onMarkerClick(C6020m c6020m) {
            return C1001f.this.mItemClickListener != null && C1001f.this.mItemClickListener.onClusterItemClick((InterfaceC0081b) C1001f.this.mMarkerCache.m4198a(c6020m));
        }
    }

    /* renamed from: ca.f$b */
    /* loaded from: classes.dex */
    public class b implements C5629c.f {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p336x6.C5629c.f
        public void onInfoWindowClick(C6020m c6020m) {
            if (C1001f.this.mItemInfoWindowClickListener != null) {
                C1001f.this.mItemInfoWindowClickListener.m354a((InterfaceC0081b) C1001f.this.mMarkerCache.m4198a(c6020m));
            }
        }
    }

    /* renamed from: ca.f$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final g f3910a;

        /* renamed from: b */
        public final C6020m f3911b;

        /* renamed from: c */
        public final LatLng f3912c;

        /* renamed from: d */
        public final LatLng f3913d;

        /* renamed from: e */
        public boolean f3914e;

        /* renamed from: f */
        public C1607b f3915f;

        public c(g gVar, LatLng latLng, LatLng latLng2) {
            this.f3910a = gVar;
            this.f3911b = gVar.f3932a;
            this.f3912c = latLng;
            this.f3913d = latLng2;
        }

        public /* synthetic */ c(C1001f c1001f, g gVar, LatLng latLng, LatLng latLng2, a aVar) {
            this(gVar, latLng, latLng2);
        }

        /* renamed from: a */
        public void m4194a() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(C1001f.ANIMATION_INTERP);
            ofFloat.setDuration(C1001f.this.mAnimationDurationMs);
            ofFloat.addUpdateListener(this);
            ofFloat.addListener(this);
            ofFloat.start();
        }

        /* renamed from: b */
        public void m4195b(C1607b c1607b) {
            this.f3915f = c1607b;
            this.f3914e = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3914e) {
                C1001f.this.mMarkerCache.m4201d(this.f3911b);
                C1001f.this.mClusterMarkerCache.m4201d(this.f3911b);
                this.f3915f.mo6437d(this.f3911b);
            }
            this.f3910a.f3933b = this.f3913d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f3913d == null || this.f3912c == null || this.f3911b == null) {
                return;
            }
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f3913d;
            double d10 = latLng.f4594h;
            LatLng latLng2 = this.f3912c;
            double d11 = latLng2.f4594h;
            double d12 = animatedFraction;
            double d13 = ((d10 - d11) * d12) + d11;
            double d14 = latLng.f4595i - latLng2.f4595i;
            if (Math.abs(d14) > 180.0d) {
                d14 -= Math.signum(d14) * 360.0d;
            }
            this.f3911b.m24135n(new LatLng(d13, (d14 * d12) + this.f3912c.f4595i));
        }
    }

    /* renamed from: ca.f$d */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a */
        public final InterfaceC0080a<T> f3917a;

        /* renamed from: b */
        public final Set<g> f3918b;

        /* renamed from: c */
        public final LatLng f3919c;

        public d(InterfaceC0080a<T> interfaceC0080a, Set<g> set, LatLng latLng) {
            this.f3917a = interfaceC0080a;
            this.f3918b = set;
            this.f3919c = latLng;
        }

        /* renamed from: b */
        public final void m4197b(C1001f<T>.f fVar) {
            g gVar;
            g gVar2;
            if (C1001f.this.shouldRenderAsCluster(this.f3917a)) {
                C6020m m4199b = C1001f.this.mClusterMarkerCache.m4199b(this.f3917a);
                if (m4199b == null) {
                    C6022n c6022n = new C6022n();
                    LatLng latLng = this.f3919c;
                    if (latLng == null) {
                        latLng = this.f3917a.getPosition();
                    }
                    C6022n m24162c0 = c6022n.m24162c0(latLng);
                    C1001f.this.onBeforeClusterRendered(this.f3917a, m24162c0);
                    m4199b = C1001f.this.mClusterManager.m343f().m6452i(m24162c0);
                    C1001f.this.mClusterMarkerCache.m4200c(this.f3917a, m4199b);
                    gVar = new g(m4199b, null);
                    LatLng latLng2 = this.f3919c;
                    if (latLng2 != null) {
                        fVar.m4203b(gVar, latLng2, this.f3917a.getPosition());
                    }
                } else {
                    gVar = new g(m4199b, null);
                    C1001f.this.onClusterUpdated(this.f3917a, m4199b);
                }
                C1001f.this.onClusterRendered(this.f3917a, m4199b);
                this.f3918b.add(gVar);
                return;
            }
            for (T t10 : this.f3917a.mo336b()) {
                C6020m m4199b2 = C1001f.this.mMarkerCache.m4199b(t10);
                if (m4199b2 == null) {
                    C6022n c6022n2 = new C6022n();
                    LatLng latLng3 = this.f3919c;
                    if (latLng3 != null) {
                        c6022n2.m24162c0(latLng3);
                    } else {
                        c6022n2.m24162c0(t10.getPosition());
                        if (t10.getZIndex() != null) {
                            c6022n2.m24167h0(t10.getZIndex().floatValue());
                        }
                    }
                    C1001f.this.onBeforeClusterItemRendered(t10, c6022n2);
                    m4199b2 = C1001f.this.mClusterManager.m344g().m6452i(c6022n2);
                    gVar2 = new g(m4199b2, null);
                    C1001f.this.mMarkerCache.m4200c(t10, m4199b2);
                    LatLng latLng4 = this.f3919c;
                    if (latLng4 != null) {
                        fVar.m4203b(gVar2, latLng4, t10.getPosition());
                    }
                } else {
                    gVar2 = new g(m4199b2, null);
                    C1001f.this.onClusterItemUpdated(t10, m4199b2);
                }
                C1001f.this.onClusterItemRendered(t10, m4199b2);
                this.f3918b.add(gVar2);
            }
        }
    }

    /* renamed from: ca.f$e */
    /* loaded from: classes.dex */
    public static class e<T> {

        /* renamed from: a */
        public Map<T, C6020m> f3921a;

        /* renamed from: b */
        public Map<C6020m, T> f3922b;

        public e() {
            this.f3921a = new HashMap();
            this.f3922b = new HashMap();
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        /* renamed from: a */
        public T m4198a(C6020m c6020m) {
            return this.f3922b.get(c6020m);
        }

        /* renamed from: b */
        public C6020m m4199b(T t10) {
            return this.f3921a.get(t10);
        }

        /* renamed from: c */
        public void m4200c(T t10, C6020m c6020m) {
            this.f3921a.put(t10, c6020m);
            this.f3922b.put(c6020m, t10);
        }

        /* renamed from: d */
        public void m4201d(C6020m c6020m) {
            T t10 = this.f3922b.get(c6020m);
            this.f3922b.remove(c6020m);
            this.f3921a.remove(t10);
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: ca.f$f */
    /* loaded from: classes.dex */
    public class f extends Handler implements MessageQueue.IdleHandler {

        /* renamed from: h */
        public final Lock f3923h;

        /* renamed from: i */
        public final Condition f3924i;

        /* renamed from: j */
        public Queue<C1001f<T>.d> f3925j;

        /* renamed from: k */
        public Queue<C1001f<T>.d> f3926k;

        /* renamed from: l */
        public Queue<C6020m> f3927l;

        /* renamed from: m */
        public Queue<C6020m> f3928m;

        /* renamed from: n */
        public Queue<C1001f<T>.c> f3929n;

        /* renamed from: o */
        public boolean f3930o;

        public f() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f3923h = reentrantLock;
            this.f3924i = reentrantLock.newCondition();
            this.f3925j = new LinkedList();
            this.f3926k = new LinkedList();
            this.f3927l = new LinkedList();
            this.f3928m = new LinkedList();
            this.f3929n = new LinkedList();
        }

        public /* synthetic */ f(C1001f c1001f, a aVar) {
            this();
        }

        /* renamed from: a */
        public void m4202a(boolean z10, C1001f<T>.d dVar) {
            this.f3923h.lock();
            sendEmptyMessage(0);
            (z10 ? this.f3926k : this.f3925j).add(dVar);
            this.f3923h.unlock();
        }

        /* renamed from: b */
        public void m4203b(g gVar, LatLng latLng, LatLng latLng2) {
            this.f3923h.lock();
            this.f3929n.add(new c(C1001f.this, gVar, latLng, latLng2, null));
            this.f3923h.unlock();
        }

        /* renamed from: c */
        public void m4204c(g gVar, LatLng latLng, LatLng latLng2) {
            this.f3923h.lock();
            C1001f<T>.c cVar = new c(C1001f.this, gVar, latLng, latLng2, null);
            cVar.m4195b(C1001f.this.mClusterManager.m345h());
            this.f3929n.add(cVar);
            this.f3923h.unlock();
        }

        /* renamed from: d */
        public boolean m4205d() {
            boolean z10;
            try {
                this.f3923h.lock();
                if (this.f3925j.isEmpty() && this.f3926k.isEmpty() && this.f3928m.isEmpty() && this.f3927l.isEmpty()) {
                    if (this.f3929n.isEmpty()) {
                        z10 = false;
                        return z10;
                    }
                }
                z10 = true;
                return z10;
            } finally {
                this.f3923h.unlock();
            }
        }

        /* renamed from: e */
        public final void m4206e() {
            Queue<C6020m> queue;
            Queue<C1001f<T>.d> queue2;
            if (this.f3928m.isEmpty()) {
                if (!this.f3929n.isEmpty()) {
                    this.f3929n.poll().m4194a();
                    return;
                }
                if (!this.f3926k.isEmpty()) {
                    queue2 = this.f3926k;
                } else if (!this.f3925j.isEmpty()) {
                    queue2 = this.f3925j;
                } else if (this.f3927l.isEmpty()) {
                    return;
                } else {
                    queue = this.f3927l;
                }
                queue2.poll().m4197b(this);
                return;
            }
            queue = this.f3928m;
            m4208g(queue.poll());
        }

        /* renamed from: f */
        public void m4207f(boolean z10, C6020m c6020m) {
            this.f3923h.lock();
            sendEmptyMessage(0);
            (z10 ? this.f3928m : this.f3927l).add(c6020m);
            this.f3923h.unlock();
        }

        /* renamed from: g */
        public final void m4208g(C6020m c6020m) {
            C1001f.this.mMarkerCache.m4201d(c6020m);
            C1001f.this.mClusterMarkerCache.m4201d(c6020m);
            C1001f.this.mClusterManager.m345h().mo6437d(c6020m);
        }

        /* renamed from: h */
        public void m4209h() {
            while (m4205d()) {
                sendEmptyMessage(0);
                this.f3923h.lock();
                try {
                    try {
                        if (m4205d()) {
                            this.f3924i.await();
                        }
                    } catch (InterruptedException e10) {
                        throw new RuntimeException(e10);
                    }
                } finally {
                    this.f3923h.unlock();
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.f3930o) {
                Looper.myQueue().addIdleHandler(this);
                this.f3930o = true;
            }
            removeMessages(0);
            this.f3923h.lock();
            for (int i10 = 0; i10 < 10; i10++) {
                try {
                    m4206e();
                } finally {
                    this.f3923h.unlock();
                }
            }
            if (m4205d()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.f3930o = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f3924i.signalAll();
            }
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }
    }

    /* renamed from: ca.f$g */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a */
        public final C6020m f3932a;

        /* renamed from: b */
        public LatLng f3933b;

        public g(C6020m c6020m) {
            this.f3932a = c6020m;
            this.f3933b = c6020m.m24123b();
        }

        public /* synthetic */ g(C6020m c6020m, a aVar) {
            this(c6020m);
        }

        public boolean equals(Object obj) {
            if (obj instanceof g) {
                return this.f3932a.equals(((g) obj).f3932a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3932a.hashCode();
        }
    }

    /* renamed from: ca.f$h */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: h */
        public final Set<? extends InterfaceC0080a<T>> f3934h;

        /* renamed from: i */
        public Runnable f3935i;

        /* renamed from: j */
        public C5634h f3936j;

        /* renamed from: k */
        public C1887b f3937k;

        /* renamed from: l */
        public float f3938l;

        public h(Set<? extends InterfaceC0080a<T>> set) {
            this.f3934h = set;
        }

        public /* synthetic */ h(C1001f c1001f, Set set, a aVar) {
            this(set);
        }

        /* renamed from: a */
        public void m4213a(Runnable runnable) {
            this.f3935i = runnable;
        }

        /* renamed from: b */
        public void m4214b(float f10) {
            this.f3938l = f10;
            this.f3937k = new C1887b(Math.pow(2.0d, Math.min(f10, C1001f.this.mZoom)) * 256.0d);
        }

        /* renamed from: c */
        public void m4215c(C5634h c5634h) {
            this.f3936j = c5634h;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            LatLngBounds m5098a;
            ArrayList arrayList;
            C1001f c1001f = C1001f.this;
            if (c1001f.shouldRender(c1001f.immutableOf(c1001f.mClusters), C1001f.this.immutableOf(this.f3934h))) {
                ArrayList arrayList2 = null;
                f fVar = new f(C1001f.this, null);
                float f10 = this.f3938l;
                boolean z10 = f10 > C1001f.this.mZoom;
                float f11 = f10 - C1001f.this.mZoom;
                Set<g> set = C1001f.this.mMarkers;
                try {
                    m5098a = this.f3936j.m22677b().f22405l;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    m5098a = LatLngBounds.m5095I().m5099b(new LatLng(0.0d, 0.0d)).m5098a();
                }
                if (C1001f.this.mClusters == null || !C1001f.this.mAnimate) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (InterfaceC0080a<T> interfaceC0080a : C1001f.this.mClusters) {
                        if (C1001f.this.shouldRenderAsCluster(interfaceC0080a) && m5098a.m5096J(interfaceC0080a.getPosition())) {
                            arrayList.add(this.f3937k.m7718b(interfaceC0080a.getPosition()));
                        }
                    }
                }
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                for (InterfaceC0080a<T> interfaceC0080a2 : this.f3934h) {
                    boolean m5096J = m5098a.m5096J(interfaceC0080a2.getPosition());
                    if (z10 && m5096J && C1001f.this.mAnimate) {
                        C1763b findClosestCluster = C1001f.this.findClosestCluster(arrayList, this.f3937k.m7718b(interfaceC0080a2.getPosition()));
                        if (findClosestCluster != null) {
                            fVar.m4202a(true, new d(interfaceC0080a2, newSetFromMap, this.f3937k.m7717a(findClosestCluster)));
                        } else {
                            fVar.m4202a(true, new d(interfaceC0080a2, newSetFromMap, null));
                        }
                    } else {
                        fVar.m4202a(m5096J, new d(interfaceC0080a2, newSetFromMap, null));
                    }
                }
                fVar.m4209h();
                set.removeAll(newSetFromMap);
                if (C1001f.this.mAnimate) {
                    arrayList2 = new ArrayList();
                    for (InterfaceC0080a<T> interfaceC0080a3 : this.f3934h) {
                        if (C1001f.this.shouldRenderAsCluster(interfaceC0080a3) && m5098a.m5096J(interfaceC0080a3.getPosition())) {
                            arrayList2.add(this.f3937k.m7718b(interfaceC0080a3.getPosition()));
                        }
                    }
                }
                for (g gVar : set) {
                    boolean m5096J2 = m5098a.m5096J(gVar.f3933b);
                    if (z10 || f11 <= -3.0f || !m5096J2 || !C1001f.this.mAnimate) {
                        fVar.m4207f(m5096J2, gVar.f3932a);
                    } else {
                        C1763b findClosestCluster2 = C1001f.this.findClosestCluster(arrayList2, this.f3937k.m7718b(gVar.f3933b));
                        if (findClosestCluster2 != null) {
                            fVar.m4204c(gVar, gVar.f3933b, this.f3937k.m7717a(findClosestCluster2));
                        } else {
                            fVar.m4207f(true, gVar.f3932a);
                        }
                    }
                }
                fVar.m4209h();
                C1001f.this.mMarkers = newSetFromMap;
                C1001f.this.mClusters = this.f3934h;
                C1001f.this.mZoom = f10;
            }
            this.f3935i.run();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: ca.f$i */
    /* loaded from: classes.dex */
    public class i extends Handler {

        /* renamed from: a */
        public boolean f3940a;

        /* renamed from: b */
        public C1001f<T>.h f3941b;

        public i() {
            this.f3940a = false;
            this.f3941b = null;
        }

        public /* synthetic */ i(C1001f c1001f, a aVar) {
            this();
        }

        /* renamed from: b */
        public /* synthetic */ void m4217b() {
            sendEmptyMessage(1);
        }

        /* renamed from: c */
        public void m4218c(Set<? extends InterfaceC0080a<T>> set) {
            synchronized (this) {
                this.f3941b = new h(C1001f.this, set, null);
            }
            sendEmptyMessage(0);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C1001f<T>.h hVar;
            if (message.what == 1) {
                this.f3940a = false;
                if (this.f3941b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.f3940a || this.f3941b == null) {
                return;
            }
            C5634h m22650j = C1001f.this.mMap.m22650j();
            synchronized (this) {
                hVar = this.f3941b;
                this.f3941b = null;
                this.f3940a = true;
            }
            hVar.m4213a(new Runnable() { // from class: ca.g
                public /* synthetic */ RunnableC1002g() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1001f.i.this.m4217b();
                }
            });
            hVar.m4215c(m22650j);
            hVar.m4214b(C1001f.this.mMap.m22647g().f4587i);
            C1001f.this.mExecutor.execute(hVar);
        }
    }

    public C1001f(Context context, C5629c c5629c, C0082c<T> c0082c) {
        this.mMap = c5629c;
        this.mDensity = context.getResources().getDisplayMetrics().density;
        C2454b c2454b = new C2454b(context);
        this.mIconGenerator = c2454b;
        c2454b.m9818g(makeSquareTextView(context));
        c2454b.m9820i(C6096d.f22625c);
        c2454b.m9816e(makeClusterBackground());
        this.mClusterManager = c0082c;
    }

    private static double distanceSquared(C1763b c1763b, C1763b c1763b2) {
        double d10 = c1763b.f6519a;
        double d11 = c1763b2.f6519a;
        double d12 = (d10 - d11) * (d10 - d11);
        double d13 = c1763b.f6520b;
        double d14 = c1763b2.f6520b;
        return d12 + ((d13 - d14) * (d13 - d14));
    }

    public C1763b findClosestCluster(List<C1763b> list, C1763b c1763b) {
        C1763b c1763b2 = null;
        if (list != null && !list.isEmpty()) {
            int mo2549g = this.mClusterManager.m342e().mo2549g();
            double d10 = mo2549g * mo2549g;
            for (C1763b c1763b3 : list) {
                double distanceSquared = distanceSquared(c1763b3, c1763b);
                if (distanceSquared < d10) {
                    c1763b2 = c1763b3;
                    d10 = distanceSquared;
                }
            }
        }
        return c1763b2;
    }

    public Set<? extends InterfaceC0080a<T>> immutableOf(Set<? extends InterfaceC0080a<T>> set) {
        return set != null ? Collections.unmodifiableSet(set) : Collections.emptySet();
    }

    public /* synthetic */ void lambda$onAdd$0(C6020m c6020m) {
        C0082c.h<T> hVar = this.mItemInfoWindowLongClickListener;
        if (hVar != null) {
            hVar.m355a(this.mMarkerCache.m4198a(c6020m));
        }
    }

    public /* synthetic */ boolean lambda$onAdd$1(C6020m c6020m) {
        C0082c.c<T> cVar = this.mClickListener;
        return cVar != null && cVar.onClusterClick(this.mClusterMarkerCache.m4198a(c6020m));
    }

    public /* synthetic */ void lambda$onAdd$2(C6020m c6020m) {
        C0082c.d<T> dVar = this.mInfoWindowClickListener;
        if (dVar != null) {
            dVar.m352a(this.mClusterMarkerCache.m4198a(c6020m));
        }
    }

    public /* synthetic */ void lambda$onAdd$3(C6020m c6020m) {
        C0082c.e<T> eVar = this.mInfoWindowLongClickListener;
        if (eVar != null) {
            eVar.m353a(this.mClusterMarkerCache.m4198a(c6020m));
        }
    }

    private LayerDrawable makeClusterBackground() {
        this.mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i10 = (int) (this.mDensity * 3.0f);
        layerDrawable.setLayerInset(1, i10, i10, i10, i10);
        return layerDrawable;
    }

    private C2455c makeSquareTextView(Context context) {
        C2455c c2455c = new C2455c(context);
        c2455c.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        c2455c.setId(C6094b.f22621a);
        int i10 = (int) (this.mDensity * 12.0f);
        c2455c.setPadding(i10, i10, i10, i10);
        return c2455c;
    }

    public int getBucket(InterfaceC0080a<T> interfaceC0080a) {
        int mo337c = interfaceC0080a.mo337c();
        int i10 = 0;
        if (mo337c <= BUCKETS[0]) {
            return mo337c;
        }
        while (true) {
            int[] iArr = BUCKETS;
            if (i10 >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i11 = i10 + 1;
            if (mo337c < iArr[i11]) {
                return iArr[i10];
            }
            i10 = i11;
        }
    }

    public InterfaceC0080a<T> getCluster(C6020m c6020m) {
        return this.mClusterMarkerCache.m4198a(c6020m);
    }

    public T getClusterItem(C6020m c6020m) {
        return this.mMarkerCache.m4198a(c6020m);
    }

    public String getClusterText(int i10) {
        if (i10 < BUCKETS[0]) {
            return String.valueOf(i10);
        }
        return i10 + "+";
    }

    public int getClusterTextAppearance(int i10) {
        return C6096d.f22625c;
    }

    public int getColor(int i10) {
        float min = 300.0f - Math.min(i10, 300.0f);
        return Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    public C5998b getDescriptorForCluster(InterfaceC0080a<T> interfaceC0080a) {
        int bucket = getBucket(interfaceC0080a);
        C5998b c5998b = this.mIcons.get(bucket);
        if (c5998b != null) {
            return c5998b;
        }
        this.mColoredCircleBackground.getPaint().setColor(getColor(bucket));
        this.mIconGenerator.m9820i(getClusterTextAppearance(bucket));
        C5998b m24081d = C6000c.m24081d(this.mIconGenerator.m9815d(getClusterText(bucket)));
        this.mIcons.put(bucket, m24081d);
        return m24081d;
    }

    public C6020m getMarker(InterfaceC0080a<T> interfaceC0080a) {
        return this.mClusterMarkerCache.m4199b(interfaceC0080a);
    }

    public C6020m getMarker(T t10) {
        return this.mMarkerCache.m4199b(t10);
    }

    public int getMinClusterSize() {
        return this.mMinClusterSize;
    }

    @Override // ca.InterfaceC0996a
    public void onAdd() {
        this.mClusterManager.m344g().m6456m(new a());
        this.mClusterManager.m344g().m6454k(new b());
        this.mClusterManager.m344g().m6455l(new C5629c.g() { // from class: ca.c
            public /* synthetic */ C0998c() {
            }

            @Override // p336x6.C5629c.g
            /* renamed from: b */
            public final void mo4189b(C6020m c6020m) {
                C1001f.this.lambda$onAdd$0(c6020m);
            }
        });
        this.mClusterManager.m343f().m6456m(new C5629c.j() { // from class: ca.e
            public /* synthetic */ C1000e() {
            }

            @Override // p336x6.C5629c.j
            public final boolean onMarkerClick(C6020m c6020m) {
                boolean lambda$onAdd$1;
                lambda$onAdd$1 = C1001f.this.lambda$onAdd$1(c6020m);
                return lambda$onAdd$1;
            }
        });
        this.mClusterManager.m343f().m6454k(new C5629c.f() { // from class: ca.b
            public /* synthetic */ C0997b() {
            }

            @Override // p336x6.C5629c.f
            public final void onInfoWindowClick(C6020m c6020m) {
                C1001f.this.lambda$onAdd$2(c6020m);
            }
        });
        this.mClusterManager.m343f().m6455l(new C5629c.g() { // from class: ca.d
            public /* synthetic */ C0999d() {
            }

            @Override // p336x6.C5629c.g
            /* renamed from: b */
            public final void mo4189b(C6020m c6020m) {
                C1001f.this.lambda$onAdd$3(c6020m);
            }
        });
    }

    public void onBeforeClusterItemRendered(T t10, C6022n c6022n) {
        String snippet;
        if (t10.getTitle() != null && t10.getSnippet() != null) {
            c6022n.m24165f0(t10.getTitle());
            c6022n.m24164e0(t10.getSnippet());
            return;
        }
        if (t10.getTitle() != null) {
            snippet = t10.getTitle();
        } else if (t10.getSnippet() == null) {
            return;
        } else {
            snippet = t10.getSnippet();
        }
        c6022n.m24165f0(snippet);
    }

    public void onBeforeClusterRendered(InterfaceC0080a<T> interfaceC0080a, C6022n c6022n) {
        c6022n.m24157X(getDescriptorForCluster(interfaceC0080a));
    }

    public void onClusterItemRendered(T t10, C6020m c6020m) {
    }

    public void onClusterItemUpdated(T t10, C6020m c6020m) {
        String title;
        boolean z10 = true;
        boolean z11 = false;
        if (t10.getTitle() == null || t10.getSnippet() == null) {
            if (t10.getSnippet() != null && !t10.getSnippet().equals(c6020m.m24125d())) {
                title = t10.getSnippet();
            } else if (t10.getTitle() != null && !t10.getTitle().equals(c6020m.m24125d())) {
                title = t10.getTitle();
            }
            c6020m.m24138q(title);
            z11 = true;
        } else {
            if (!t10.getTitle().equals(c6020m.m24125d())) {
                c6020m.m24138q(t10.getTitle());
                z11 = true;
            }
            if (!t10.getSnippet().equals(c6020m.m24124c())) {
                c6020m.m24137p(t10.getSnippet());
                z11 = true;
            }
        }
        if (c6020m.m24123b().equals(t10.getPosition())) {
            z10 = z11;
        } else {
            c6020m.m24135n(t10.getPosition());
            if (t10.getZIndex() != null) {
                c6020m.m24140s(t10.getZIndex().floatValue());
            }
        }
        if (z10 && c6020m.m24127f()) {
            c6020m.m24141t();
        }
    }

    public void onClusterRendered(InterfaceC0080a<T> interfaceC0080a, C6020m c6020m) {
    }

    public void onClusterUpdated(InterfaceC0080a<T> interfaceC0080a, C6020m c6020m) {
        c6020m.m24133l(getDescriptorForCluster(interfaceC0080a));
    }

    @Override // ca.InterfaceC0996a
    public void onClustersChanged(Set<? extends InterfaceC0080a<T>> set) {
        this.mViewModifier.m4218c(set);
    }

    @Override // ca.InterfaceC0996a
    public void onRemove() {
        this.mClusterManager.m344g().m6456m(null);
        this.mClusterManager.m344g().m6454k(null);
        this.mClusterManager.m344g().m6455l(null);
        this.mClusterManager.m343f().m6456m(null);
        this.mClusterManager.m343f().m6454k(null);
        this.mClusterManager.m343f().m6455l(null);
    }

    public void setAnimation(boolean z10) {
        this.mAnimate = z10;
    }

    public void setAnimationDuration(long j10) {
        this.mAnimationDurationMs = j10;
    }

    public void setMinClusterSize(int i10) {
        this.mMinClusterSize = i10;
    }

    @Override // ca.InterfaceC0996a
    public void setOnClusterClickListener(C0082c.c<T> cVar) {
        this.mClickListener = cVar;
    }

    @Override // ca.InterfaceC0996a
    public void setOnClusterInfoWindowClickListener(C0082c.d<T> dVar) {
        this.mInfoWindowClickListener = dVar;
    }

    @Override // ca.InterfaceC0996a
    public void setOnClusterInfoWindowLongClickListener(C0082c.e<T> eVar) {
        this.mInfoWindowLongClickListener = eVar;
    }

    @Override // ca.InterfaceC0996a
    public void setOnClusterItemClickListener(C0082c.f<T> fVar) {
        this.mItemClickListener = fVar;
    }

    @Override // ca.InterfaceC0996a
    public void setOnClusterItemInfoWindowClickListener(C0082c.g<T> gVar) {
        this.mItemInfoWindowClickListener = gVar;
    }

    @Override // ca.InterfaceC0996a
    public void setOnClusterItemInfoWindowLongClickListener(C0082c.h<T> hVar) {
        this.mItemInfoWindowLongClickListener = hVar;
    }

    public boolean shouldRender(Set<? extends InterfaceC0080a<T>> set, Set<? extends InterfaceC0080a<T>> set2) {
        return !set2.equals(set);
    }

    public boolean shouldRenderAsCluster(InterfaceC0080a<T> interfaceC0080a) {
        return interfaceC0080a.mo337c() >= this.mMinClusterSize;
    }
}
