package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344f;
import java.util.Iterator;
import java.util.Map;
import p200o.C3822c;
import p216p.C3994b;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final Object NOT_SET = new Object();
    public static final int START_VERSION = -1;
    public int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    public final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C3994b<InterfaceC0362r<? super T>, LiveData<T>.AbstractC0333c> mObservers;
    public volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.AbstractC0333c implements InterfaceC0350i {

        /* renamed from: l */
        public final InterfaceC0354k f1663l;

        public LifecycleBoundObserver(InterfaceC0354k interfaceC0354k, InterfaceC0362r<? super T> interfaceC0362r) {
            super(interfaceC0362r);
            this.f1663l = interfaceC0354k;
        }

        @Override // androidx.lifecycle.InterfaceC0350i
        /* renamed from: a */
        public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
            AbstractC0344f.b mo1801b = this.f1663l.getLifecycle().mo1801b();
            if (mo1801b == AbstractC0344f.b.DESTROYED) {
                LiveData.this.removeObserver(this.f1667h);
                return;
            }
            AbstractC0344f.b bVar = null;
            while (bVar != mo1801b) {
                m1768b(mo1767e());
                bVar = mo1801b;
                mo1801b = this.f1663l.getLifecycle().mo1801b();
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0333c
        /* renamed from: c */
        public void mo1765c() {
            this.f1663l.getLifecycle().mo1802c(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0333c
        /* renamed from: d */
        public boolean mo1766d(InterfaceC0354k interfaceC0354k) {
            return this.f1663l == interfaceC0354k;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0333c
        /* renamed from: e */
        public boolean mo1767e() {
            return this.f1663l.getLifecycle().mo1801b().m1811c(AbstractC0344f.b.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    public class RunnableC0331a implements Runnable {
        public RunnableC0331a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: classes.dex */
    public class C0332b extends LiveData<T>.AbstractC0333c {
        public C0332b(InterfaceC0362r<? super T> interfaceC0362r) {
            super(interfaceC0362r);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0333c
        /* renamed from: e */
        public boolean mo1767e() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    /* loaded from: classes.dex */
    public abstract class AbstractC0333c {

        /* renamed from: h */
        public final InterfaceC0362r<? super T> f1667h;

        /* renamed from: i */
        public boolean f1668i;

        /* renamed from: j */
        public int f1669j = -1;

        public AbstractC0333c(InterfaceC0362r<? super T> interfaceC0362r) {
            this.f1667h = interfaceC0362r;
        }

        /* renamed from: b */
        public void m1768b(boolean z10) {
            if (z10 == this.f1668i) {
                return;
            }
            this.f1668i = z10;
            LiveData.this.changeActiveCounter(z10 ? 1 : -1);
            if (this.f1668i) {
                LiveData.this.dispatchingValue(this);
            }
        }

        /* renamed from: c */
        public void mo1765c() {
        }

        /* renamed from: d */
        public boolean mo1766d(InterfaceC0354k interfaceC0354k) {
            return false;
        }

        /* renamed from: e */
        public abstract boolean mo1767e();
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new C3994b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new RunnableC0331a();
        this.mData = obj;
        this.mVersion = -1;
    }

    public LiveData(T t10) {
        this.mDataLock = new Object();
        this.mObservers = new C3994b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new RunnableC0331a();
        this.mData = t10;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (C3822c.m14529g().mo14533b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void considerNotify(LiveData<T>.AbstractC0333c abstractC0333c) {
        if (abstractC0333c.f1668i) {
            if (!abstractC0333c.mo1767e()) {
                abstractC0333c.m1768b(false);
                return;
            }
            int i10 = abstractC0333c.f1669j;
            int i11 = this.mVersion;
            if (i10 >= i11) {
                return;
            }
            abstractC0333c.f1669j = i11;
            abstractC0333c.f1667h.mo1433a((Object) this.mData);
        }
    }

    public void changeActiveCounter(int i10) {
        int i11 = this.mActiveCount;
        this.mActiveCount = i10 + i11;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i12 = this.mActiveCount;
                if (i11 == i12) {
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    onActive();
                } else if (z11) {
                    onInactive();
                }
                i11 = i12;
            } finally {
                this.mChangingActiveState = false;
            }
        }
    }

    public void dispatchingValue(LiveData<T>.AbstractC0333c abstractC0333c) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (abstractC0333c != null) {
                considerNotify(abstractC0333c);
                abstractC0333c = null;
            } else {
                C3994b<InterfaceC0362r<? super T>, LiveData<T>.AbstractC0333c>.d m15128c = this.mObservers.m15128c();
                while (m15128c.hasNext()) {
                    considerNotify((AbstractC0333c) m15128c.next().getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t10 = (T) this.mData;
        if (t10 != NOT_SET) {
            return t10;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(InterfaceC0354k interfaceC0354k, InterfaceC0362r<? super T> interfaceC0362r) {
        assertMainThread("observe");
        if (interfaceC0354k.getLifecycle().mo1801b() == AbstractC0344f.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC0354k, interfaceC0362r);
        LiveData<T>.AbstractC0333c mo15124h = this.mObservers.mo15124h(interfaceC0362r, lifecycleBoundObserver);
        if (mo15124h != null && !mo15124h.mo1766d(interfaceC0354k)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo15124h != null) {
            return;
        }
        interfaceC0354k.getLifecycle().mo1800a(lifecycleBoundObserver);
    }

    public void observeForever(InterfaceC0362r<? super T> interfaceC0362r) {
        assertMainThread("observeForever");
        C0332b c0332b = new C0332b(interfaceC0362r);
        LiveData<T>.AbstractC0333c mo15124h = this.mObservers.mo15124h(interfaceC0362r, c0332b);
        if (mo15124h instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo15124h != null) {
            return;
        }
        c0332b.m1768b(true);
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t10) {
        boolean z10;
        synchronized (this.mDataLock) {
            z10 = this.mPendingData == NOT_SET;
            this.mPendingData = t10;
        }
        if (z10) {
            C3822c.m14529g().mo14534c(this.mPostValueRunnable);
        }
    }

    public void removeObserver(InterfaceC0362r<? super T> interfaceC0362r) {
        assertMainThread("removeObserver");
        LiveData<T>.AbstractC0333c mo15125j = this.mObservers.mo15125j(interfaceC0362r);
        if (mo15125j == null) {
            return;
        }
        mo15125j.mo1765c();
        mo15125j.m1768b(false);
    }

    public void removeObservers(InterfaceC0354k interfaceC0354k) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<InterfaceC0362r<? super T>, LiveData<T>.AbstractC0333c>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry<InterfaceC0362r<? super T>, LiveData<T>.AbstractC0333c> next = it.next();
            if (next.getValue().mo1766d(interfaceC0354k)) {
                removeObserver(next.getKey());
            }
        }
    }

    public void setValue(T t10) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t10;
        dispatchingValue(null);
    }
}
