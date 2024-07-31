package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zau;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p079f6.AbstractC1846f;
import p079f6.AbstractC1848h;
import p079f6.AbstractC1856p;
import p079f6.AbstractC1857q;
import p079f6.InterfaceC1850j;
import p079f6.InterfaceC1853m;
import p079f6.InterfaceC1854n;
import p096g6.C2013d2;
import p096g6.C2021f2;
import p096g6.C2061r1;
import p096g6.C2064s1;
import p108h6.C2394s;
import p108h6.InterfaceC2373l;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends InterfaceC1853m> extends AbstractC1848h<R> {
    public static final ThreadLocal zaa = new C2013d2();
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private C2021f2 mResultGuardian;
    public final HandlerC1163a zab;
    public final WeakReference zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList zag;
    private InterfaceC1854n zah;
    private final AtomicReference zai;
    private InterfaceC1853m zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private InterfaceC2373l zao;
    private volatile C2061r1 zap;
    private boolean zaq;

    @VisibleForTesting
    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* loaded from: classes.dex */
    public static class HandlerC1163a<R extends InterfaceC1853m> extends zau {
        public HandlerC1163a() {
            super(Looper.getMainLooper());
        }

        public HandlerC1163a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void m4993a(InterfaceC1854n interfaceC1854n, InterfaceC1853m interfaceC1853m) {
            int i10 = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((InterfaceC1854n) C2394s.m9619l(interfaceC1854n), interfaceC1853m)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                InterfaceC1854n interfaceC1854n = (InterfaceC1854n) pair.first;
                InterfaceC1853m interfaceC1853m = (InterfaceC1853m) pair.second;
                try {
                    interfaceC1854n.mo7602a(interfaceC1853m);
                    return;
                } catch (RuntimeException e10) {
                    BasePendingResult.zal(interfaceC1853m);
                    throw e10;
                }
            }
            if (i10 == 2) {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f4473p);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new HandlerC1163a(Looper.getMainLooper());
        this.zac = new WeakReference(null);
    }

    @Deprecated
    public BasePendingResult(Looper looper) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new HandlerC1163a(looper);
        this.zac = new WeakReference(null);
    }

    @VisibleForTesting
    public BasePendingResult(HandlerC1163a<R> handlerC1163a) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = (HandlerC1163a) C2394s.m9620m(handlerC1163a, "CallbackHandler must not be null");
        this.zac = new WeakReference(null);
    }

    public BasePendingResult(AbstractC1846f abstractC1846f) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new HandlerC1163a(abstractC1846f != null ? abstractC1846f.mo7591e() : Looper.getMainLooper());
        this.zac = new WeakReference(abstractC1846f);
    }

    private final InterfaceC1853m zaa() {
        InterfaceC1853m interfaceC1853m;
        synchronized (this.zae) {
            C2394s.m9623p(!this.zal, "Result has already been consumed.");
            C2394s.m9623p(isReady(), "Result is not ready.");
            interfaceC1853m = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (((C2064s1) this.zai.getAndSet(null)) == null) {
            return (InterfaceC1853m) C2394s.m9619l(interfaceC1853m);
        }
        throw null;
    }

    private final void zab(InterfaceC1853m interfaceC1853m) {
        this.zaj = interfaceC1853m;
        this.zak = interfaceC1853m.getStatus();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            InterfaceC1854n interfaceC1854n = this.zah;
            if (interfaceC1854n != null) {
                this.zab.removeMessages(2);
                this.zab.m4993a(interfaceC1854n, zaa());
            } else if (this.zaj instanceof InterfaceC1850j) {
                this.mResultGuardian = new C2021f2(this, null);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC1848h.a) arrayList.get(i10)).mo7596a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(InterfaceC1853m interfaceC1853m) {
        if (interfaceC1853m instanceof InterfaceC1850j) {
            try {
                ((InterfaceC1850j) interfaceC1853m).release();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(interfaceC1853m)), e10);
            }
        }
    }

    @Override // p079f6.AbstractC1848h
    public final void addStatusListener(AbstractC1848h.a aVar) {
        C2394s.m9609b(aVar != null, "Callback cannot be null.");
        synchronized (this.zae) {
            if (isReady()) {
                aVar.mo7596a(this.zak);
            } else {
                this.zag.add(aVar);
            }
        }
    }

    @Override // p079f6.AbstractC1848h
    public final R await() {
        C2394s.m9618k("await must not be called on the UI thread");
        C2394s.m9623p(!this.zal, "Result has already been consumed");
        C2394s.m9623p(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f4471n);
        }
        C2394s.m9623p(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // p079f6.AbstractC1848h
    public final R await(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            C2394s.m9618k("await must not be called on the UI thread when time is greater than zero.");
        }
        C2394s.m9623p(!this.zal, "Result has already been consumed.");
        C2394s.m9623p(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j10, timeUnit)) {
                forceFailureUnlessReady(Status.f4473p);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f4471n);
        }
        C2394s.m9623p(isReady(), "Result is not ready.");
        return (R) zaa();
    }

    @Override // p079f6.AbstractC1848h
    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                InterfaceC2373l interfaceC2373l = this.zao;
                if (interfaceC2373l != null) {
                    try {
                        interfaceC2373l.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zal(this.zaj);
                this.zam = true;
                zab(createFailedResult(Status.f4474q));
            }
        }
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    @Override // p079f6.AbstractC1848h
    public final boolean isCanceled() {
        boolean z10;
        synchronized (this.zae) {
            z10 = this.zam;
        }
        return z10;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(InterfaceC2373l interfaceC2373l) {
        synchronized (this.zae) {
            this.zao = interfaceC2373l;
        }
    }

    public final void setResult(R r10) {
        synchronized (this.zae) {
            if (this.zan || this.zam) {
                zal(r10);
                return;
            }
            isReady();
            C2394s.m9623p(!isReady(), "Results have already been set");
            C2394s.m9623p(!this.zal, "Result has already been consumed");
            zab(r10);
        }
    }

    @Override // p079f6.AbstractC1848h
    public final void setResultCallback(InterfaceC1854n<? super R> interfaceC1854n) {
        synchronized (this.zae) {
            if (interfaceC1854n == null) {
                this.zah = null;
                return;
            }
            boolean z10 = true;
            C2394s.m9623p(!this.zal, "Result has already been consumed.");
            if (this.zap != null) {
                z10 = false;
            }
            C2394s.m9623p(z10, "Cannot set callbacks if then() has been called.");
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zab.m4993a(interfaceC1854n, zaa());
            } else {
                this.zah = interfaceC1854n;
            }
        }
    }

    @Override // p079f6.AbstractC1848h
    public final void setResultCallback(InterfaceC1854n<? super R> interfaceC1854n, long j10, TimeUnit timeUnit) {
        synchronized (this.zae) {
            if (interfaceC1854n == null) {
                this.zah = null;
                return;
            }
            boolean z10 = true;
            C2394s.m9623p(!this.zal, "Result has already been consumed.");
            if (this.zap != null) {
                z10 = false;
            }
            C2394s.m9623p(z10, "Cannot set callbacks if then() has been called.");
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zab.m4993a(interfaceC1854n, zaa());
            } else {
                this.zah = interfaceC1854n;
                HandlerC1163a handlerC1163a = this.zab;
                handlerC1163a.sendMessageDelayed(handlerC1163a.obtainMessage(2, this), timeUnit.toMillis(j10));
            }
        }
    }

    @Override // p079f6.AbstractC1848h
    public final <S extends InterfaceC1853m> AbstractC1857q<S> then(AbstractC1856p<? super R, ? extends S> abstractC1856p) {
        AbstractC1857q<S> m8257b;
        C2394s.m9623p(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            C2394s.m9623p(this.zap == null, "Cannot call then() twice.");
            C2394s.m9623p(this.zah == null, "Cannot call then() if callbacks are set.");
            C2394s.m9623p(!this.zam, "Cannot call then() if result was canceled.");
            this.zaq = true;
            this.zap = new C2061r1(this.zac);
            m8257b = this.zap.m8257b(abstractC1856p);
            if (isReady()) {
                this.zab.m4993a(this.zap, zaa());
            } else {
                this.zah = this.zap;
            }
        }
        return m8257b;
    }

    public final void zak() {
        boolean z10 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z10 = false;
        }
        this.zaq = z10;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            if (((AbstractC1846f) this.zac.get()) == null || !this.zaq) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public final void zan(C2064s1 c2064s1) {
        this.zai.set(c2064s1);
    }
}
