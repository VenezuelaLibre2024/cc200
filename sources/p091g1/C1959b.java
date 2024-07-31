package p091g1;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: g1.b */
/* loaded from: classes.dex */
public class C1959b<D> {

    /* renamed from: a */
    public int f7781a;

    /* renamed from: b */
    public b<D> f7782b;

    /* renamed from: c */
    public a<D> f7783c;

    /* renamed from: d */
    public Context f7784d;

    /* renamed from: e */
    public boolean f7785e = false;

    /* renamed from: f */
    public boolean f7786f = false;

    /* renamed from: g */
    public boolean f7787g = true;

    /* renamed from: h */
    public boolean f7788h = false;

    /* renamed from: i */
    public boolean f7789i = false;

    /* renamed from: g1.b$a */
    /* loaded from: classes.dex */
    public interface a<D> {
        /* renamed from: a */
        void m7913a(C1959b<D> c1959b);
    }

    /* renamed from: g1.b$b */
    /* loaded from: classes.dex */
    public interface b<D> {
        /* renamed from: a */
        void mo7275a(C1959b<D> c1959b, D d10);
    }

    public C1959b(Context context) {
        this.f7784d = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m7894a() {
        this.f7786f = true;
        m7903k();
    }

    /* renamed from: b */
    public boolean m7895b() {
        return mo7886l();
    }

    /* renamed from: c */
    public void m7896c() {
        this.f7789i = false;
    }

    /* renamed from: d */
    public String m7897d(D d10) {
        String str;
        StringBuilder sb2 = new StringBuilder(64);
        if (d10 == null) {
            str = "null";
        } else {
            Class<?> cls = d10.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            str = "}";
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: e */
    public void m7898e() {
        a<D> aVar = this.f7783c;
        if (aVar != null) {
            aVar.m7913a(this);
        }
    }

    /* renamed from: f */
    public void m7899f(D d10) {
        b<D> bVar = this.f7782b;
        if (bVar != null) {
            bVar.mo7275a(this, d10);
        }
    }

    @Deprecated
    /* renamed from: g */
    public void mo7885g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f7781a);
        printWriter.print(" mListener=");
        printWriter.println(this.f7782b);
        if (this.f7785e || this.f7788h || this.f7789i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f7785e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f7788h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f7789i);
        }
        if (this.f7786f || this.f7787g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f7786f);
            printWriter.print(" mReset=");
            printWriter.println(this.f7787g);
        }
    }

    /* renamed from: h */
    public void m7900h() {
        mo7887n();
    }

    /* renamed from: i */
    public boolean m7901i() {
        return this.f7786f;
    }

    /* renamed from: j */
    public boolean m7902j() {
        return this.f7785e;
    }

    /* renamed from: k */
    public void m7903k() {
    }

    /* renamed from: l */
    public boolean mo7886l() {
        throw null;
    }

    /* renamed from: m */
    public void m7904m() {
        if (this.f7785e) {
            m7900h();
        } else {
            this.f7788h = true;
        }
    }

    /* renamed from: n */
    public void mo7887n() {
    }

    /* renamed from: o */
    public void m7905o() {
    }

    /* renamed from: p */
    public void mo2433p() {
        throw null;
    }

    /* renamed from: q */
    public void m7906q() {
    }

    /* renamed from: r */
    public void m7907r(int i10, b<D> bVar) {
        if (this.f7782b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f7782b = bVar;
        this.f7781a = i10;
    }

    /* renamed from: s */
    public void m7908s() {
        m7905o();
        this.f7787g = true;
        this.f7785e = false;
        this.f7786f = false;
        this.f7788h = false;
        this.f7789i = false;
    }

    /* renamed from: t */
    public void m7909t() {
        if (this.f7789i) {
            m7904m();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        sb2.append(this.f7781a);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: u */
    public final void m7910u() {
        this.f7785e = true;
        this.f7787g = false;
        this.f7786f = false;
        mo2433p();
    }

    /* renamed from: v */
    public void m7911v() {
        this.f7785e = false;
        m7906q();
    }

    /* renamed from: w */
    public void m7912w(b<D> bVar) {
        b<D> bVar2 = this.f7782b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f7782b = null;
    }
}
