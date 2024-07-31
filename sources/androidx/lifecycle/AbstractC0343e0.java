package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC0343e0 {

    /* renamed from: a */
    public final Map<String, Object> f1699a = new HashMap();

    /* renamed from: b */
    public final Set<Closeable> f1700b = new LinkedHashSet();

    /* renamed from: c */
    public volatile boolean f1701c = false;

    /* renamed from: b */
    public static void m1796b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: a */
    public final void m1797a() {
        this.f1701c = true;
        Map<String, Object> map = this.f1699a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f1699a.values().iterator();
                while (it.hasNext()) {
                    m1796b(it.next());
                }
            }
        }
        Set<Closeable> set = this.f1700b;
        if (set != null) {
            synchronized (set) {
                Iterator<Closeable> it2 = this.f1700b.iterator();
                while (it2.hasNext()) {
                    m1796b(it2.next());
                }
            }
        }
        mo1376d();
    }

    /* renamed from: c */
    public <T> T m1798c(String str) {
        T t10;
        Map<String, Object> map = this.f1699a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = (T) this.f1699a.get(str);
        }
        return t10;
    }

    /* renamed from: d */
    public void mo1376d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public <T> T m1799e(String str, T t10) {
        Object obj;
        synchronized (this.f1699a) {
            obj = this.f1699a.get(str);
            if (obj == 0) {
                this.f1699a.put(str, t10);
            }
        }
        if (obj != 0) {
            t10 = obj;
        }
        if (this.f1701c) {
            m1796b(t10);
        }
        return t10;
    }
}
