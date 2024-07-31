package p052da;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p052da.AbstractC1606a.b;
import p336x6.C5629c;

/* renamed from: da.a */
/* loaded from: classes.dex */
public abstract class AbstractC1606a<O, C extends b> {

    /* renamed from: h */
    public final C5629c f5931h;

    /* renamed from: i */
    public final Map<String, C> f5932i = new HashMap();

    /* renamed from: j */
    public final Map<O, C> f5933j = new HashMap();

    /* renamed from: da.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1606a.this.mo6439f();
        }
    }

    /* renamed from: da.a$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        public final Set<O> f5935a = new LinkedHashSet();

        public b() {
        }

        /* renamed from: a */
        public void m6440a(O o10) {
            this.f5935a.add(o10);
            AbstractC1606a.this.f5933j.put(o10, this);
        }

        /* renamed from: b */
        public void m6441b() {
            for (O o10 : this.f5935a) {
                AbstractC1606a.this.mo6438e(o10);
                AbstractC1606a.this.f5933j.remove(o10);
            }
            this.f5935a.clear();
        }

        /* renamed from: c */
        public boolean m6442c(O o10) {
            if (!this.f5935a.remove(o10)) {
                return false;
            }
            AbstractC1606a.this.f5933j.remove(o10);
            AbstractC1606a.this.mo6438e(o10);
            return true;
        }
    }

    public AbstractC1606a(C5629c c5629c) {
        this.f5931h = c5629c;
        new Handler(Looper.getMainLooper()).post(new a());
    }

    /* renamed from: d */
    public boolean mo6437d(O o10) {
        C c10 = this.f5933j.get(o10);
        return c10 != null && c10.m6442c(o10);
    }

    /* renamed from: e */
    public abstract void mo6438e(O o10);

    /* renamed from: f */
    public abstract void mo6439f();
}
