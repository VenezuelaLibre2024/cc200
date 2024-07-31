package p090g0;

import android.os.Build;
import android.os.CancellationSignal;

/* renamed from: g0.e */
/* loaded from: classes.dex */
public final class C1945e {

    /* renamed from: a */
    public boolean f7753a;

    /* renamed from: b */
    public b f7754b;

    /* renamed from: c */
    public Object f7755c;

    /* renamed from: d */
    public boolean f7756d;

    /* renamed from: g0.e$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static void m7856a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        /* renamed from: b */
        public static CancellationSignal m7857b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: g0.e$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo1406a();
    }

    /* renamed from: a */
    public void m7853a() {
        synchronized (this) {
            if (this.f7753a) {
                return;
            }
            this.f7753a = true;
            this.f7756d = true;
            b bVar = this.f7754b;
            Object obj = this.f7755c;
            if (bVar != null) {
                try {
                    bVar.mo1406a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f7756d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                a.m7856a(obj);
            }
            synchronized (this) {
                this.f7756d = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public void m7854b(b bVar) {
        synchronized (this) {
            m7855c();
            if (this.f7754b == bVar) {
                return;
            }
            this.f7754b = bVar;
            if (this.f7753a && bVar != null) {
                bVar.mo1406a();
            }
        }
    }

    /* renamed from: c */
    public final void m7855c() {
        while (this.f7756d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
