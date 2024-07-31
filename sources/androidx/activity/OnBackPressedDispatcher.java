package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.InterfaceC0350i;
import androidx.lifecycle.InterfaceC0354k;
import gd.C2245s;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p115hd.C2489f;
import sd.InterfaceC4569a;
import td.AbstractC4754n;
import td.C4753m;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f452a;

    /* renamed from: b */
    public final C2489f<AbstractC0159l> f453b = new C2489f<>();

    /* renamed from: c */
    public InterfaceC4569a<C2245s> f454c;

    /* renamed from: d */
    public OnBackInvokedCallback f455d;

    /* renamed from: e */
    public OnBackInvokedDispatcher f456e;

    /* renamed from: f */
    public boolean f457f;

    /* loaded from: classes.dex */
    public final class LifecycleOnBackPressedCancellable implements InterfaceC0350i, InterfaceC0148a {

        /* renamed from: h */
        public final AbstractC0344f f458h;

        /* renamed from: i */
        public final AbstractC0159l f459i;

        /* renamed from: j */
        public InterfaceC0148a f460j;

        /* renamed from: k */
        public final /* synthetic */ OnBackPressedDispatcher f461k;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC0344f abstractC0344f, AbstractC0159l abstractC0159l) {
            C4753m.m18653f(abstractC0344f, "lifecycle");
            C4753m.m18653f(abstractC0159l, "onBackPressedCallback");
            this.f461k = onBackPressedDispatcher;
            this.f458h = abstractC0344f;
            this.f459i = abstractC0159l;
            abstractC0344f.mo1800a(this);
        }

        @Override // androidx.lifecycle.InterfaceC0350i
        /* renamed from: a */
        public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
            C4753m.m18653f(interfaceC0354k, "source");
            C4753m.m18653f(aVar, "event");
            if (aVar == AbstractC0344f.a.ON_START) {
                this.f460j = this.f461k.m583c(this.f459i);
                return;
            }
            if (aVar != AbstractC0344f.a.ON_STOP) {
                if (aVar == AbstractC0344f.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC0148a interfaceC0148a = this.f460j;
                if (interfaceC0148a != null) {
                    interfaceC0148a.cancel();
                }
            }
        }

        @Override // androidx.activity.InterfaceC0148a
        public void cancel() {
            this.f458h.mo1802c(this);
            this.f459i.removeCancellable(this);
            InterfaceC0148a interfaceC0148a = this.f460j;
            if (interfaceC0148a != null) {
                interfaceC0148a.cancel();
            }
            this.f460j = null;
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    /* loaded from: classes.dex */
    public static final class C0144a extends AbstractC4754n implements InterfaceC4569a<C2245s> {
        public C0144a() {
            super(0);
        }

        /* renamed from: a */
        public final void m588a() {
            OnBackPressedDispatcher.this.m587g();
        }

        @Override // sd.InterfaceC4569a
        public /* bridge */ /* synthetic */ C2245s invoke() {
            m588a();
            return C2245s.f8873a;
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$b */
    /* loaded from: classes.dex */
    public static final class C0145b extends AbstractC4754n implements InterfaceC4569a<C2245s> {
        public C0145b() {
            super(0);
        }

        /* renamed from: a */
        public final void m589a() {
            OnBackPressedDispatcher.this.m585e();
        }

        @Override // sd.InterfaceC4569a
        public /* bridge */ /* synthetic */ C2245s invoke() {
            m589a();
            return C2245s.f8873a;
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$c */
    /* loaded from: classes.dex */
    public static final class C0146c {

        /* renamed from: a */
        public static final C0146c f464a = new C0146c();

        /* renamed from: c */
        public static final void m591c(InterfaceC4569a interfaceC4569a) {
            C4753m.m18653f(interfaceC4569a, "$onBackInvoked");
            interfaceC4569a.invoke();
        }

        /* renamed from: b */
        public final OnBackInvokedCallback m592b(InterfaceC4569a<C2245s> interfaceC4569a) {
            C4753m.m18653f(interfaceC4569a, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.m
                public /* synthetic */ C0160m() {
                }

                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.C0146c.m591c(InterfaceC4569a.this);
                }
            };
        }

        /* renamed from: d */
        public final void m593d(Object obj, int i10, Object obj2) {
            C4753m.m18653f(obj, "dispatcher");
            C4753m.m18653f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        /* renamed from: e */
        public final void m594e(Object obj, Object obj2) {
            C4753m.m18653f(obj, "dispatcher");
            C4753m.m18653f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$d */
    /* loaded from: classes.dex */
    public final class C0147d implements InterfaceC0148a {

        /* renamed from: h */
        public final AbstractC0159l f465h;

        /* renamed from: i */
        public final /* synthetic */ OnBackPressedDispatcher f466i;

        public C0147d(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC0159l abstractC0159l) {
            C4753m.m18653f(abstractC0159l, "onBackPressedCallback");
            this.f466i = onBackPressedDispatcher;
            this.f465h = abstractC0159l;
        }

        @Override // androidx.activity.InterfaceC0148a
        public void cancel() {
            this.f466i.f453b.remove(this.f465h);
            this.f465h.removeCancellable(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f465h.setEnabledChangedCallback$activity_release(null);
                this.f466i.m587g();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f452a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f454c = new C0144a();
            this.f455d = C0146c.f464a.m592b(new C0145b());
        }
    }

    /* renamed from: b */
    public final void m582b(InterfaceC0354k interfaceC0354k, AbstractC0159l abstractC0159l) {
        C4753m.m18653f(interfaceC0354k, "owner");
        C4753m.m18653f(abstractC0159l, "onBackPressedCallback");
        AbstractC0344f lifecycle = interfaceC0354k.getLifecycle();
        if (lifecycle.mo1801b() == AbstractC0344f.b.DESTROYED) {
            return;
        }
        abstractC0159l.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, abstractC0159l));
        if (Build.VERSION.SDK_INT >= 33) {
            m587g();
            abstractC0159l.setEnabledChangedCallback$activity_release(this.f454c);
        }
    }

    /* renamed from: c */
    public final InterfaceC0148a m583c(AbstractC0159l abstractC0159l) {
        C4753m.m18653f(abstractC0159l, "onBackPressedCallback");
        this.f453b.add(abstractC0159l);
        C0147d c0147d = new C0147d(this, abstractC0159l);
        abstractC0159l.addCancellable(c0147d);
        if (Build.VERSION.SDK_INT >= 33) {
            m587g();
            abstractC0159l.setEnabledChangedCallback$activity_release(this.f454c);
        }
        return c0147d;
    }

    /* renamed from: d */
    public final boolean m584d() {
        C2489f<AbstractC0159l> c2489f = this.f453b;
        if ((c2489f instanceof Collection) && c2489f.isEmpty()) {
            return false;
        }
        Iterator<AbstractC0159l> it = c2489f.iterator();
        while (it.hasNext()) {
            if (it.next().isEnabled()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void m585e() {
        AbstractC0159l abstractC0159l;
        C2489f<AbstractC0159l> c2489f = this.f453b;
        ListIterator<AbstractC0159l> listIterator = c2489f.listIterator(c2489f.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                abstractC0159l = null;
                break;
            } else {
                abstractC0159l = listIterator.previous();
                if (abstractC0159l.isEnabled()) {
                    break;
                }
            }
        }
        AbstractC0159l abstractC0159l2 = abstractC0159l;
        if (abstractC0159l2 != null) {
            abstractC0159l2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f452a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: f */
    public final void m586f(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C4753m.m18653f(onBackInvokedDispatcher, "invoker");
        this.f456e = onBackInvokedDispatcher;
        m587g();
    }

    /* renamed from: g */
    public final void m587g() {
        boolean m584d = m584d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f456e;
        OnBackInvokedCallback onBackInvokedCallback = this.f455d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (m584d && !this.f457f) {
            C0146c.f464a.m593d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f457f = true;
        } else {
            if (m584d || !this.f457f) {
                return;
            }
            C0146c.f464a.m594e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f457f = false;
        }
    }
}
