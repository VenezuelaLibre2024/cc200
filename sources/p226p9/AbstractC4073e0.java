package p226p9;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
import p108h6.C2394s;
import p226p9.AbstractC4073e0;
import p226p9.AbstractC4073e0.a;
import p226p9.C4087l0;

/* renamed from: p9.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC4073e0<ResultT extends a> extends AbstractC4068c<ResultT> {

    /* renamed from: j */
    public static final HashMap<Integer, HashSet<Integer>> f14640j;

    /* renamed from: k */
    public static final HashMap<Integer, HashSet<Integer>> f14641k;

    /* renamed from: a */
    public final Object f14642a = new Object();

    /* renamed from: b */
    public final C4087l0<OnSuccessListener<? super ResultT>, ResultT> f14643b = new C4087l0<>(this, 128, new C4087l0.a() { // from class: p9.s
        @Override // p226p9.C4087l0.a
        /* renamed from: a */
        public final void mo15621a(Object obj, Object obj2) {
            AbstractC4073e0.this.m15637P((OnSuccessListener) obj, (AbstractC4073e0.a) obj2);
        }
    });

    /* renamed from: c */
    public final C4087l0<OnFailureListener, ResultT> f14644c = new C4087l0<>(this, 64, new C4087l0.a() { // from class: p9.d0
        @Override // p226p9.C4087l0.a
        /* renamed from: a */
        public final void mo15621a(Object obj, Object obj2) {
            AbstractC4073e0.this.m15638Q((OnFailureListener) obj, (AbstractC4073e0.a) obj2);
        }
    });

    /* renamed from: d */
    public final C4087l0<OnCompleteListener<ResultT>, ResultT> f14645d = new C4087l0<>(this, 448, new C4087l0.a() { // from class: p9.c0
        @Override // p226p9.C4087l0.a
        /* renamed from: a */
        public final void mo15621a(Object obj, Object obj2) {
            AbstractC4073e0.this.m15639R((OnCompleteListener) obj, (AbstractC4073e0.a) obj2);
        }
    });

    /* renamed from: e */
    public final C4087l0<OnCanceledListener, ResultT> f14646e = new C4087l0<>(this, 256, new C4087l0.a() { // from class: p9.b0
        @Override // p226p9.C4087l0.a
        /* renamed from: a */
        public final void mo15621a(Object obj, Object obj2) {
            AbstractC4073e0.this.m15640S((OnCanceledListener) obj, (AbstractC4073e0.a) obj2);
        }
    });

    /* renamed from: f */
    public final C4087l0<InterfaceC4088m<? super ResultT>, ResultT> f14647f = new C4087l0<>(this, -465, new C4087l0.a() { // from class: p9.u
        @Override // p226p9.C4087l0.a
        /* renamed from: a */
        public final void mo15621a(Object obj, Object obj2) {
            ((InterfaceC4088m) obj).mo11261a((AbstractC4073e0.a) obj2);
        }
    });

    /* renamed from: g */
    public final C4087l0<InterfaceC4086l<? super ResultT>, ResultT> f14648g = new C4087l0<>(this, 16, new C4087l0.a() { // from class: p9.t
        @Override // p226p9.C4087l0.a
        /* renamed from: a */
        public final void mo15621a(Object obj, Object obj2) {
            ((InterfaceC4086l) obj).mo11260a((AbstractC4073e0.a) obj2);
        }
    });

    /* renamed from: h */
    public volatile int f14649h = 1;

    /* renamed from: i */
    public ResultT f14650i;

    /* renamed from: p9.e0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        Exception mo15692a();
    }

    /* renamed from: p9.e0$b */
    /* loaded from: classes.dex */
    public class b implements a {

        /* renamed from: a */
        public final Exception f14651a;

        public b(Exception exc) {
            C4090n c4090n;
            Status status;
            if (exc != null) {
                this.f14651a = exc;
                return;
            }
            if (AbstractC4073e0.this.isCanceled()) {
                status = Status.f4474q;
            } else {
                if (AbstractC4073e0.this.m15651B() != 64) {
                    c4090n = null;
                    this.f14651a = c4090n;
                }
                status = Status.f4472o;
            }
            c4090n = C4090n.m15756c(status);
            this.f14651a = c4090n;
        }

        @Override // p226p9.AbstractC4073e0.a
        /* renamed from: a */
        public Exception mo15692a() {
            return this.f14651a;
        }

        /* renamed from: b */
        public C4093p m15693b() {
            return m15694c().mo15622I();
        }

        /* renamed from: c */
        public AbstractC4073e0<ResultT> m15694c() {
            return AbstractC4073e0.this;
        }
    }

    static {
        HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
        f14640j = hashMap;
        HashMap<Integer, HashSet<Integer>> hashMap2 = new HashMap<>();
        f14641k = hashMap2;
        hashMap.put(1, new HashSet<>(Arrays.asList(16, 256)));
        hashMap.put(2, new HashSet<>(Arrays.asList(8, 32)));
        hashMap.put(4, new HashSet<>(Arrays.asList(8, 32)));
        hashMap.put(16, new HashSet<>(Arrays.asList(2, 256)));
        hashMap.put(64, new HashSet<>(Arrays.asList(2, 256)));
        hashMap2.put(1, new HashSet<>(Arrays.asList(2, 64)));
        hashMap2.put(2, new HashSet<>(Arrays.asList(4, 64, 128)));
        hashMap2.put(4, new HashSet<>(Arrays.asList(4, 64, 128)));
        hashMap2.put(8, new HashSet<>(Arrays.asList(16, 64, 128)));
        hashMap2.put(32, new HashSet<>(Arrays.asList(256, 64, 128)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m15634M(Continuation continuation, TaskCompletionSource taskCompletionSource, Task task) {
        try {
            Object then = continuation.then(this);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            taskCompletionSource.setResult(then);
        } catch (RuntimeExecutionException e10) {
            boolean z10 = e10.getCause() instanceof Exception;
            Exception exc = e10;
            if (z10) {
                exc = (Exception) e10.getCause();
            }
            taskCompletionSource.setException(exc);
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m15635N(Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, Task task) {
        try {
            Task task2 = (Task) continuation.then(this);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            if (task2 == null) {
                taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                return;
            }
            task2.addOnSuccessListener(new C4103z(taskCompletionSource));
            task2.addOnFailureListener(new C4101x(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            task2.addOnCanceledListener(new C4095r(cancellationTokenSource));
        } catch (RuntimeExecutionException e10) {
            boolean z10 = e10.getCause() instanceof Exception;
            Exception exc = e10;
            if (z10) {
                exc = (Exception) e10.getCause();
            }
            taskCompletionSource.setException(exc);
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m15636O() {
        try {
            mo15624e0();
        } finally {
            m15691z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m15637P(OnSuccessListener onSuccessListener, a aVar) {
        C4075f0.m15714b().m15716c(this);
        onSuccessListener.onSuccess(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m15638Q(OnFailureListener onFailureListener, a aVar) {
        C4075f0.m15714b().m15716c(this);
        onFailureListener.onFailure(aVar.mo15692a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m15639R(OnCompleteListener onCompleteListener, a aVar) {
        C4075f0.m15714b().m15716c(this);
        onCompleteListener.onComplete(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m15640S(OnCanceledListener onCanceledListener, a aVar) {
        C4075f0.m15714b().m15716c(this);
        onCanceledListener.onCanceled();
    }

    /* renamed from: T */
    public static /* synthetic */ void m15641T(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, a aVar) {
        try {
            Task then = successContinuation.then(aVar);
            Objects.requireNonNull(taskCompletionSource);
            then.addOnSuccessListener(new C4103z(taskCompletionSource));
            then.addOnFailureListener(new C4101x(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            then.addOnCanceledListener(new C4095r(cancellationTokenSource));
        } catch (RuntimeExecutionException e10) {
            boolean z10 = e10.getCause() instanceof Exception;
            Exception exc = e10;
            if (z10) {
                exc = (Exception) e10.getCause();
            }
            taskCompletionSource.setException(exc);
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    /* renamed from: A */
    public final ResultT m15650A() {
        ResultT resultt = this.f14650i;
        if (resultt != null) {
            return resultt;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.f14650i == null) {
            this.f14650i = m15670g0();
        }
        return this.f14650i;
    }

    /* renamed from: B */
    public int m15651B() {
        return this.f14649h;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public ResultT getResult() {
        if (m15650A() == null) {
            throw new IllegalStateException();
        }
        Exception mo15692a = m15650A().mo15692a();
        if (mo15692a == null) {
            return m15650A();
        }
        throw new RuntimeExecutionException(mo15692a);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public <X extends Throwable> ResultT getResult(Class<X> cls) {
        if (m15650A() == null) {
            throw new IllegalStateException();
        }
        if (cls.isInstance(m15650A().mo15692a())) {
            throw cls.cast(m15650A().mo15692a());
        }
        Exception mo15692a = m15650A().mo15692a();
        if (mo15692a == null) {
            return m15650A();
        }
        throw new RuntimeExecutionException(mo15692a);
    }

    /* renamed from: E */
    public Runnable m15654E() {
        return new Runnable() { // from class: p9.a0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4073e0.this.m15636O();
            }
        };
    }

    /* renamed from: F */
    public ResultT m15655F() {
        return m15670g0();
    }

    /* renamed from: G */
    public final String m15656G(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? i10 != 16 ? i10 != 32 ? i10 != 64 ? i10 != 128 ? i10 != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED" : "INTERNAL_STATE_SUCCESS" : "INTERNAL_STATE_FAILURE" : "INTERNAL_STATE_CANCELING" : "INTERNAL_STATE_PAUSED" : "INTERNAL_STATE_PAUSING" : "INTERNAL_STATE_IN_PROGRESS" : "INTERNAL_STATE_QUEUED" : "INTERNAL_STATE_NOT_STARTED";
    }

    /* renamed from: H */
    public final String m15657H(int[] iArr) {
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 : iArr) {
            sb2.append(m15656G(i10));
            sb2.append(", ");
        }
        return sb2.substring(0, sb2.length() - 2);
    }

    /* renamed from: I */
    public abstract C4093p mo15622I();

    /* renamed from: J */
    public Object m15658J() {
        return this.f14642a;
    }

    /* renamed from: K */
    public boolean m15659K() {
        return (m15651B() & (-465)) != 0;
    }

    /* renamed from: L */
    public boolean m15660L() {
        return (m15651B() & 16) != 0;
    }

    /* renamed from: U */
    public void mo15623U() {
    }

    /* renamed from: V */
    public void m15661V() {
    }

    /* renamed from: W */
    public void m15662W() {
    }

    /* renamed from: X */
    public void mo15663X() {
    }

    /* renamed from: Y */
    public void m15664Y() {
    }

    /* renamed from: Z */
    public void m15665Z() {
    }

    /* renamed from: a0 */
    public boolean mo15666a0() {
        return m15676k0(new int[]{16, 8}, true);
    }

    /* renamed from: b0 */
    public boolean m15667b0() {
        if (!m15674j0(2, false)) {
            return false;
        }
        mo15625f0();
        return true;
    }

    /* renamed from: c0 */
    public void mo15668c0() {
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWith(Continuation<ResultT, ContinuationResultT> continuation) {
        return m15689x(null, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWith(Executor executor, Continuation<ResultT, ContinuationResultT> continuation) {
        return m15689x(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWithTask(Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        return m15690y(null, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> continueWithTask(Executor executor, Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        return m15690y(executor, continuation);
    }

    /* renamed from: d0 */
    public boolean mo15669d0() {
        if (!m15674j0(2, true)) {
            return false;
        }
        mo15668c0();
        mo15625f0();
        return true;
    }

    /* renamed from: e0 */
    public abstract void mo15624e0();

    /* renamed from: f0 */
    public abstract void mo15625f0();

    /* renamed from: g0 */
    public ResultT m15670g0() {
        ResultT mo15626h0;
        synchronized (this.f14642a) {
            mo15626h0 = mo15626h0();
        }
        return mo15626h0;
    }

    @Override // com.google.android.gms.tasks.Task
    public Exception getException() {
        if (m15650A() == null) {
            return null;
        }
        return m15650A().mo15692a();
    }

    /* renamed from: h0 */
    public abstract ResultT mo15626h0();

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC4073e0<ResultT> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        C2394s.m9619l(onCanceledListener);
        C2394s.m9619l(activity);
        this.f14646e.m15751d(activity, null, onCanceledListener);
        return this;
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: i0 */
    public final <ContinuationResultT> Task<ContinuationResultT> m15672i0(Executor executor, final SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f14643b.m15751d(null, executor, new OnSuccessListener() { // from class: p9.y
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                AbstractC4073e0.m15641T(SuccessContinuation.this, taskCompletionSource, cancellationTokenSource, (AbstractC4073e0.a) obj);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return m15651B() == 256;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return (m15651B() & 448) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return (m15651B() & 128) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC4073e0<ResultT> addOnCanceledListener(OnCanceledListener onCanceledListener) {
        C2394s.m9619l(onCanceledListener);
        this.f14646e.m15751d(null, null, onCanceledListener);
        return this;
    }

    /* renamed from: j0 */
    public boolean m15674j0(int i10, boolean z10) {
        return m15676k0(new int[]{i10}, z10);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC4073e0<ResultT> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        C2394s.m9619l(onCanceledListener);
        C2394s.m9619l(executor);
        this.f14646e.m15751d(null, executor, onCanceledListener);
        return this;
    }

    /* renamed from: k0 */
    public boolean m15676k0(int[] iArr, boolean z10) {
        HashMap<Integer, HashSet<Integer>> hashMap = z10 ? f14640j : f14641k;
        synchronized (this.f14642a) {
            for (int i10 : iArr) {
                HashSet<Integer> hashSet = hashMap.get(Integer.valueOf(m15651B()));
                if (hashSet != null && hashSet.contains(Integer.valueOf(i10))) {
                    this.f14649h = i10;
                    int i11 = this.f14649h;
                    if (i11 == 2) {
                        C4075f0.m15714b().m15715a(this);
                        m15664Y();
                    } else if (i11 == 4) {
                        mo15663X();
                    } else if (i11 == 16) {
                        m15662W();
                    } else if (i11 == 64) {
                        m15661V();
                    } else if (i11 == 128) {
                        m15665Z();
                    } else if (i11 == 256) {
                        mo15623U();
                    }
                    this.f14643b.m15752h();
                    this.f14644c.m15752h();
                    this.f14646e.m15752h();
                    this.f14645d.m15752h();
                    this.f14648g.m15752h();
                    this.f14647f.m15752h();
                    if (Log.isLoggable("StorageTask", 3)) {
                        Log.d("StorageTask", "changed internal state to: " + m15656G(i10) + " isUser: " + z10 + " from state:" + m15656G(this.f14649h));
                    }
                    return true;
                }
            }
            Log.w("StorageTask", "unable to change internal state to: " + m15657H(iArr) + " isUser: " + z10 + " from state:" + m15656G(this.f14649h));
            return false;
        }
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC4073e0<ResultT> addOnCompleteListener(Activity activity, OnCompleteListener<ResultT> onCompleteListener) {
        C2394s.m9619l(onCompleteListener);
        C2394s.m9619l(activity);
        this.f14645d.m15751d(activity, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC4073e0<ResultT> addOnCompleteListener(OnCompleteListener<ResultT> onCompleteListener) {
        C2394s.m9619l(onCompleteListener);
        this.f14645d.m15751d(null, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC4073e0<ResultT> addOnCompleteListener(Executor executor, OnCompleteListener<ResultT> onCompleteListener) {
        C2394s.m9619l(onCompleteListener);
        C2394s.m9619l(executor);
        this.f14645d.m15751d(null, executor, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC4073e0<ResultT> addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        C2394s.m9619l(onFailureListener);
        C2394s.m9619l(activity);
        this.f14644c.m15751d(activity, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        return m15672i0(null, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(Executor executor, SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        return m15672i0(executor, successContinuation);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC4073e0<ResultT> addOnFailureListener(OnFailureListener onFailureListener) {
        C2394s.m9619l(onFailureListener);
        this.f14644c.m15751d(null, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC4073e0<ResultT> addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        C2394s.m9619l(onFailureListener);
        C2394s.m9619l(executor);
        this.f14644c.m15751d(null, executor, onFailureListener);
        return this;
    }

    /* renamed from: r */
    public AbstractC4073e0<ResultT> m15683r(InterfaceC4086l<? super ResultT> interfaceC4086l) {
        C2394s.m9619l(interfaceC4086l);
        this.f14648g.m15751d(null, null, interfaceC4086l);
        return this;
    }

    /* renamed from: s */
    public AbstractC4073e0<ResultT> m15684s(InterfaceC4088m<? super ResultT> interfaceC4088m) {
        C2394s.m9619l(interfaceC4088m);
        this.f14647f.m15751d(null, null, interfaceC4088m);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public AbstractC4073e0<ResultT> addOnSuccessListener(Activity activity, OnSuccessListener<? super ResultT> onSuccessListener) {
        C2394s.m9619l(activity);
        C2394s.m9619l(onSuccessListener);
        this.f14643b.m15751d(activity, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC4073e0<ResultT> addOnSuccessListener(OnSuccessListener<? super ResultT> onSuccessListener) {
        C2394s.m9619l(onSuccessListener);
        this.f14643b.m15751d(null, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public AbstractC4073e0<ResultT> addOnSuccessListener(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        C2394s.m9619l(executor);
        C2394s.m9619l(onSuccessListener);
        this.f14643b.m15751d(null, executor, onSuccessListener);
        return this;
    }

    /* renamed from: w */
    public boolean m15688w() {
        return m15676k0(new int[]{256, 32}, true);
    }

    /* renamed from: x */
    public final <ContinuationResultT> Task<ContinuationResultT> m15689x(Executor executor, final Continuation<ResultT, ContinuationResultT> continuation) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f14645d.m15751d(null, executor, new OnCompleteListener() { // from class: p9.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AbstractC4073e0.this.m15634M(continuation, taskCompletionSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: y */
    public final <ContinuationResultT> Task<ContinuationResultT> m15690y(Executor executor, final Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f14645d.m15751d(null, executor, new OnCompleteListener() { // from class: p9.w
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AbstractC4073e0.this.m15635N(continuation, taskCompletionSource, cancellationTokenSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: z */
    public final void m15691z() {
        if (isComplete() || m15660L() || m15651B() == 2 || m15674j0(256, false)) {
            return;
        }
        m15674j0(64, false);
    }
}
