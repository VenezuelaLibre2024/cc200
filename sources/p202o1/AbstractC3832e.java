package p202o1;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.C0391c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p218p1.AbstractC3996a;
import p262s1.InterfaceC4388b;
import p262s1.InterfaceC4389c;
import p262s1.InterfaceC4391e;
import p262s1.InterfaceC4392f;

/* renamed from: o1.e */
/* loaded from: classes.dex */
public abstract class AbstractC3832e {

    /* renamed from: a */
    @Deprecated
    public volatile InterfaceC4388b f13790a;

    /* renamed from: b */
    public Executor f13791b;

    /* renamed from: c */
    public Executor f13792c;

    /* renamed from: d */
    public InterfaceC4389c f13793d;

    /* renamed from: f */
    public boolean f13795f;

    /* renamed from: g */
    public boolean f13796g;

    /* renamed from: h */
    @Deprecated
    public List<b> f13797h;

    /* renamed from: i */
    public final ReentrantReadWriteLock f13798i = new ReentrantReadWriteLock();

    /* renamed from: j */
    public final ThreadLocal<Integer> f13799j = new ThreadLocal<>();

    /* renamed from: k */
    public final Map<String, Object> f13800k = new ConcurrentHashMap();

    /* renamed from: e */
    public final C0391c f13794e = mo2150e();

    /* renamed from: o1.e$a */
    /* loaded from: classes.dex */
    public static class a<T extends AbstractC3832e> {

        /* renamed from: a */
        public final Class<T> f13801a;

        /* renamed from: b */
        public final String f13802b;

        /* renamed from: c */
        public final Context f13803c;

        /* renamed from: d */
        public ArrayList<b> f13804d;

        /* renamed from: e */
        public Executor f13805e;

        /* renamed from: f */
        public Executor f13806f;

        /* renamed from: g */
        public InterfaceC4389c.c f13807g;

        /* renamed from: h */
        public boolean f13808h;

        /* renamed from: j */
        public boolean f13810j;

        /* renamed from: l */
        public boolean f13812l;

        /* renamed from: n */
        public Set<Integer> f13814n;

        /* renamed from: o */
        public Set<Integer> f13815o;

        /* renamed from: p */
        public String f13816p;

        /* renamed from: q */
        public File f13817q;

        /* renamed from: i */
        public c f13809i = c.AUTOMATIC;

        /* renamed from: k */
        public boolean f13811k = true;

        /* renamed from: m */
        public final d f13813m = new d();

        public a(Context context, Class<T> cls, String str) {
            this.f13803c = context;
            this.f13801a = cls;
            this.f13802b = str;
        }

        /* renamed from: a */
        public a<T> m14563a(b bVar) {
            if (this.f13804d == null) {
                this.f13804d = new ArrayList<>();
            }
            this.f13804d.add(bVar);
            return this;
        }

        /* renamed from: b */
        public a<T> m14564b(AbstractC3996a... abstractC3996aArr) {
            if (this.f13815o == null) {
                this.f13815o = new HashSet();
            }
            for (AbstractC3996a abstractC3996a : abstractC3996aArr) {
                this.f13815o.add(Integer.valueOf(abstractC3996a.f14395a));
                this.f13815o.add(Integer.valueOf(abstractC3996a.f14396b));
            }
            this.f13813m.m14575b(abstractC3996aArr);
            return this;
        }

        /* renamed from: c */
        public a<T> m14565c() {
            this.f13808h = true;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x0028, code lost:
        
            if (r1 != null) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
        @android.annotation.SuppressLint({"RestrictedApi"})
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public T m14566d() {
            /*
                Method dump skipped, instructions count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p202o1.AbstractC3832e.a.m14566d():o1.e");
        }

        /* renamed from: e */
        public a<T> m14567e() {
            this.f13811k = false;
            this.f13812l = true;
            return this;
        }

        /* renamed from: f */
        public a<T> m14568f(InterfaceC4389c.c cVar) {
            this.f13807g = cVar;
            return this;
        }

        /* renamed from: g */
        public a<T> m14569g(Executor executor) {
            this.f13805e = executor;
            return this;
        }
    }

    /* renamed from: o1.e$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        /* renamed from: a */
        public void m14570a(InterfaceC4388b interfaceC4388b) {
        }

        /* renamed from: b */
        public void m14571b(InterfaceC4388b interfaceC4388b) {
        }

        /* renamed from: c */
        public void mo2138c(InterfaceC4388b interfaceC4388b) {
        }
    }

    /* renamed from: o1.e$c */
    /* loaded from: classes.dex */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: b */
        public static boolean m14572b(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: c */
        public c m14573c(Context context) {
            ActivityManager activityManager;
            return this != AUTOMATIC ? this : (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || m14572b(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* renamed from: o1.e$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public HashMap<Integer, TreeMap<Integer, AbstractC3996a>> f13822a = new HashMap<>();

        /* renamed from: a */
        public final void m14574a(AbstractC3996a abstractC3996a) {
            int i10 = abstractC3996a.f14395a;
            int i11 = abstractC3996a.f14396b;
            TreeMap<Integer, AbstractC3996a> treeMap = this.f13822a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f13822a.put(Integer.valueOf(i10), treeMap);
            }
            AbstractC3996a abstractC3996a2 = treeMap.get(Integer.valueOf(i11));
            if (abstractC3996a2 != null) {
                Log.w("ROOM", "Overriding migration " + abstractC3996a2 + " with " + abstractC3996a);
            }
            treeMap.put(Integer.valueOf(i11), abstractC3996a);
        }

        /* renamed from: b */
        public void m14575b(AbstractC3996a... abstractC3996aArr) {
            for (AbstractC3996a abstractC3996a : abstractC3996aArr) {
                m14574a(abstractC3996a);
            }
        }

        /* renamed from: c */
        public List<AbstractC3996a> m14576c(int i10, int i11) {
            if (i10 == i11) {
                return Collections.emptyList();
            }
            return m14577d(new ArrayList(), i11 > i10, i10, i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<p218p1.AbstractC3996a> m14577d(java.util.List<p218p1.AbstractC3996a> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L58
                goto L7
            L5:
                if (r9 <= r10) goto L58
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, p1.a>> r0 = r6.f13822a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L54
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = r4
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                r7.add(r9)
                r9 = r3
                goto L55
            L54:
                r4 = r5
            L55:
                if (r4 != 0) goto L0
                return r1
            L58:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p202o1.AbstractC3832e.d.m14577d(java.util.List, boolean, int, int):java.util.List");
        }
    }

    /* renamed from: n */
    public static boolean m14547n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: a */
    public void m14548a() {
        if (!this.f13795f && m14547n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: b */
    public void m14549b() {
        if (!m14556k() && this.f13799j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    /* renamed from: c */
    public void m14550c() {
        m14548a();
        InterfaceC4388b mo14600U = this.f13793d.mo14600U();
        this.f13794e.m1978m(mo14600U);
        mo14600U.mo16972g();
    }

    /* renamed from: d */
    public InterfaceC4392f m14551d(String str) {
        m14548a();
        m14549b();
        return this.f13793d.mo14600U().mo16978t(str);
    }

    /* renamed from: e */
    public abstract C0391c mo2150e();

    /* renamed from: f */
    public abstract InterfaceC4389c mo2151f(C3828a c3828a);

    @Deprecated
    /* renamed from: g */
    public void m14552g() {
        this.f13793d.mo14600U().mo16971Z();
        if (m14556k()) {
            return;
        }
        this.f13794e.m1971f();
    }

    /* renamed from: h */
    public Lock m14553h() {
        return this.f13798i.readLock();
    }

    /* renamed from: i */
    public InterfaceC4389c m14554i() {
        return this.f13793d;
    }

    /* renamed from: j */
    public Executor m14555j() {
        return this.f13791b;
    }

    /* renamed from: k */
    public boolean m14556k() {
        return this.f13793d.mo14600U().mo16977q0();
    }

    /* renamed from: l */
    public void m14557l(C3828a c3828a) {
        InterfaceC4389c mo2151f = mo2151f(c3828a);
        this.f13793d = mo2151f;
        if (mo2151f instanceof C3836i) {
            ((C3836i) mo2151f).m14602d(c3828a);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            r2 = c3828a.f13779g == c.WRITE_AHEAD_LOGGING;
            this.f13793d.setWriteAheadLoggingEnabled(r2);
        }
        this.f13797h = c3828a.f13777e;
        this.f13791b = c3828a.f13780h;
        this.f13792c = new ExecutorC3839l(c3828a.f13781i);
        this.f13795f = c3828a.f13778f;
        this.f13796g = r2;
        if (c3828a.f13782j) {
            this.f13794e.m1974i(c3828a.f13774b, c3828a.f13775c);
        }
    }

    /* renamed from: m */
    public void m14558m(InterfaceC4388b interfaceC4388b) {
        this.f13794e.m1969d(interfaceC4388b);
    }

    /* renamed from: o */
    public boolean m14559o() {
        InterfaceC4388b interfaceC4388b = this.f13790a;
        return interfaceC4388b != null && interfaceC4388b.isOpen();
    }

    /* renamed from: p */
    public Cursor m14560p(InterfaceC4391e interfaceC4391e) {
        return m14561q(interfaceC4391e, null);
    }

    /* renamed from: q */
    public Cursor m14561q(InterfaceC4391e interfaceC4391e, CancellationSignal cancellationSignal) {
        m14548a();
        m14549b();
        return (cancellationSignal == null || Build.VERSION.SDK_INT < 16) ? this.f13793d.mo14600U().mo16967G(interfaceC4391e) : this.f13793d.mo14600U().mo16974o(interfaceC4391e, cancellationSignal);
    }

    @Deprecated
    /* renamed from: r */
    public void m14562r() {
        this.f13793d.mo14600U().mo16968N();
    }
}
