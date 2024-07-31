package p091g1;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p090g0.C1954n;

/* renamed from: g1.a */
/* loaded from: classes.dex */
public abstract class AbstractC1958a<D> extends C1959b<D> {

    /* renamed from: j */
    public Executor f7773j;

    /* renamed from: k */
    public volatile AbstractC1958a<D>.a f7774k;

    /* renamed from: l */
    public volatile AbstractC1958a<D>.a f7775l;

    /* renamed from: m */
    public long f7776m;

    /* renamed from: n */
    public long f7777n;

    /* renamed from: o */
    public Handler f7778o;

    /* renamed from: g1.a$a */
    /* loaded from: classes.dex */
    public final class a extends AbstractC1960c<D> implements Runnable {

        /* renamed from: m */
        public boolean f7779m;

        public a() {
        }

        @Override // p091g1.AbstractC1960c
        /* renamed from: b */
        public D mo7891b() {
            try {
                return (D) AbstractC1958a.this.m7884E();
            } catch (C1954n e10) {
                if (m7918f()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // p091g1.AbstractC1960c
        /* renamed from: g */
        public void mo7892g(D d10) {
            AbstractC1958a.this.m7889y(this, d10);
        }

        @Override // p091g1.AbstractC1960c
        /* renamed from: h */
        public void mo7893h(D d10) {
            AbstractC1958a.this.m7890z(this, d10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7779m = false;
            AbstractC1958a.this.m7881A();
        }
    }

    public AbstractC1958a(Context context) {
        super(context);
        this.f7777n = -10000L;
    }

    /* renamed from: A */
    public void m7881A() {
        if (this.f7775l != null || this.f7774k == null) {
            return;
        }
        if (this.f7774k.f7779m) {
            this.f7774k.f7779m = false;
            this.f7778o.removeCallbacks(this.f7774k);
        }
        if (this.f7776m > 0 && SystemClock.uptimeMillis() < this.f7777n + this.f7776m) {
            this.f7774k.f7779m = true;
            this.f7778o.postAtTime(this.f7774k, this.f7777n + this.f7776m);
        } else {
            if (this.f7773j == null) {
                this.f7773j = m7882B();
            }
            this.f7774k.m7916c(this.f7773j);
        }
    }

    /* renamed from: B */
    public Executor m7882B() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    /* renamed from: C */
    public abstract D mo2432C();

    /* renamed from: D */
    public void m7883D(D d10) {
    }

    /* renamed from: E */
    public D m7884E() {
        return mo2432C();
    }

    @Override // p091g1.C1959b
    @Deprecated
    /* renamed from: g */
    public void mo7885g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.mo7885g(str, fileDescriptor, printWriter, strArr);
        if (this.f7774k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f7774k);
            printWriter.print(" waiting=");
            printWriter.println(this.f7774k.f7779m);
        }
        if (this.f7775l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f7775l);
            printWriter.print(" waiting=");
            printWriter.println(this.f7775l.f7779m);
        }
        if (this.f7776m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f7776m)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f7777n == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f7777n));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // p091g1.C1959b
    /* renamed from: l */
    public boolean mo7886l() {
        if (this.f7774k == null) {
            return false;
        }
        if (!m7902j()) {
            m7904m();
        }
        if (this.f7775l != null) {
            if (this.f7774k.f7779m) {
                this.f7774k.f7779m = false;
                this.f7778o.removeCallbacks(this.f7774k);
            }
            this.f7774k = null;
            return false;
        }
        if (this.f7774k.f7779m) {
            this.f7774k.f7779m = false;
            this.f7778o.removeCallbacks(this.f7774k);
            this.f7774k = null;
            return false;
        }
        boolean m7915a = this.f7774k.m7915a(false);
        if (m7915a) {
            this.f7775l = this.f7774k;
            m7888x();
        }
        this.f7774k = null;
        return m7915a;
    }

    @Override // p091g1.C1959b
    /* renamed from: n */
    public void mo7887n() {
        super.mo7887n();
        m7895b();
        this.f7774k = new a();
        m7881A();
    }

    /* renamed from: x */
    public void m7888x() {
    }

    /* renamed from: y */
    public void m7889y(AbstractC1958a<D>.a aVar, D d10) {
        m7883D(d10);
        if (this.f7775l == aVar) {
            m7909t();
            this.f7777n = SystemClock.uptimeMillis();
            this.f7775l = null;
            m7898e();
            m7881A();
        }
    }

    /* renamed from: z */
    public void m7890z(AbstractC1958a<D>.a aVar, D d10) {
        if (this.f7774k != aVar) {
            m7889y(aVar, d10);
            return;
        }
        if (m7901i()) {
            m7883D(d10);
            return;
        }
        m7896c();
        this.f7777n = SystemClock.uptimeMillis();
        this.f7774k = null;
        m7899f(d10);
    }
}
