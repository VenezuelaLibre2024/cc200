package p304v3;

import java.util.ArrayDeque;
import p222p5.C4014a;
import p304v3.AbstractC5111h;
import p304v3.C5109f;
import p304v3.C5110g;

/* renamed from: v3.j */
/* loaded from: classes.dex */
public abstract class AbstractC5113j<I extends C5110g, O extends AbstractC5111h, E extends C5109f> implements InterfaceC5107d<I, O, E> {

    /* renamed from: a */
    public final Thread f19299a;

    /* renamed from: b */
    public final Object f19300b = new Object();

    /* renamed from: c */
    public final ArrayDeque<I> f19301c = new ArrayDeque<>();

    /* renamed from: d */
    public final ArrayDeque<O> f19302d = new ArrayDeque<>();

    /* renamed from: e */
    public final I[] f19303e;

    /* renamed from: f */
    public final O[] f19304f;

    /* renamed from: g */
    public int f19305g;

    /* renamed from: h */
    public int f19306h;

    /* renamed from: i */
    public I f19307i;

    /* renamed from: j */
    public E f19308j;

    /* renamed from: k */
    public boolean f19309k;

    /* renamed from: l */
    public boolean f19310l;

    /* renamed from: m */
    public int f19311m;

    /* renamed from: v3.j$a */
    /* loaded from: classes.dex */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AbstractC5113j.this.m20778t();
        }
    }

    public AbstractC5113j(I[] iArr, O[] oArr) {
        this.f19303e = iArr;
        this.f19305g = iArr.length;
        for (int i10 = 0; i10 < this.f19305g; i10++) {
            this.f19303e[i10] = mo6356g();
        }
        this.f19304f = oArr;
        this.f19306h = oArr.length;
        for (int i11 = 0; i11 < this.f19306h; i11++) {
            this.f19304f[i11] = mo6357h();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f19299a = aVar;
        aVar.start();
    }

    /* renamed from: f */
    public final boolean m20768f() {
        return !this.f19301c.isEmpty() && this.f19306h > 0;
    }

    @Override // p304v3.InterfaceC5107d
    public final void flush() {
        synchronized (this.f19300b) {
            this.f19309k = true;
            this.f19311m = 0;
            I i10 = this.f19307i;
            if (i10 != null) {
                m20775q(i10);
                this.f19307i = null;
            }
            while (!this.f19301c.isEmpty()) {
                m20775q(this.f19301c.removeFirst());
            }
            while (!this.f19302d.isEmpty()) {
                this.f19302d.removeFirst().mo6349v();
            }
        }
    }

    /* renamed from: g */
    public abstract I mo6356g();

    /* renamed from: h */
    public abstract O mo6357h();

    /* renamed from: i */
    public abstract E mo6358i(Throwable th);

    /* renamed from: j */
    public abstract E mo6359j(I i10, O o10, boolean z10);

    /* renamed from: k */
    public final boolean m20769k() {
        E mo6358i;
        synchronized (this.f19300b) {
            while (!this.f19310l && !m20768f()) {
                this.f19300b.wait();
            }
            if (this.f19310l) {
                return false;
            }
            I removeFirst = this.f19301c.removeFirst();
            O[] oArr = this.f19304f;
            int i10 = this.f19306h - 1;
            this.f19306h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f19309k;
            this.f19309k = false;
            if (removeFirst.m20748q()) {
                o10.m20743i(4);
            } else {
                if (removeFirst.m20747p()) {
                    o10.m20743i(Integer.MIN_VALUE);
                }
                if (removeFirst.m20749r()) {
                    o10.m20743i(134217728);
                }
                try {
                    mo6358i = mo6359j(removeFirst, o10, z10);
                } catch (OutOfMemoryError | RuntimeException e10) {
                    mo6358i = mo6358i(e10);
                }
                if (mo6358i != null) {
                    synchronized (this.f19300b) {
                        this.f19308j = mo6358i;
                    }
                    return false;
                }
            }
            synchronized (this.f19300b) {
                if (!this.f19309k) {
                    if (o10.m20747p()) {
                        this.f19311m++;
                    } else {
                        o10.f19293j = this.f19311m;
                        this.f19311m = 0;
                        this.f19302d.addLast(o10);
                        m20775q(removeFirst);
                    }
                }
                o10.mo6349v();
                m20775q(removeFirst);
            }
            return true;
        }
    }

    @Override // p304v3.InterfaceC5107d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final I mo6343c() {
        I i10;
        synchronized (this.f19300b) {
            m20773o();
            C4014a.m15200f(this.f19307i == null);
            int i11 = this.f19305g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f19303e;
                int i12 = i11 - 1;
                this.f19305g = i12;
                i10 = iArr[i12];
            }
            this.f19307i = i10;
        }
        return i10;
    }

    @Override // p304v3.InterfaceC5107d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final O mo6342b() {
        synchronized (this.f19300b) {
            m20773o();
            if (this.f19302d.isEmpty()) {
                return null;
            }
            return this.f19302d.removeFirst();
        }
    }

    /* renamed from: n */
    public final void m20772n() {
        if (m20768f()) {
            this.f19300b.notify();
        }
    }

    /* renamed from: o */
    public final void m20773o() {
        E e10 = this.f19308j;
        if (e10 != null) {
            throw e10;
        }
    }

    @Override // p304v3.InterfaceC5107d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void mo6344d(I i10) {
        synchronized (this.f19300b) {
            m20773o();
            C4014a.m15195a(i10 == this.f19307i);
            this.f19301c.addLast(i10);
            m20772n();
            this.f19307i = null;
        }
    }

    /* renamed from: q */
    public final void m20775q(I i10) {
        i10.mo6366l();
        I[] iArr = this.f19303e;
        int i11 = this.f19305g;
        this.f19305g = i11 + 1;
        iArr[i11] = i10;
    }

    /* renamed from: r */
    public void m20776r(O o10) {
        synchronized (this.f19300b) {
            m20777s(o10);
            m20772n();
        }
    }

    @Override // p304v3.InterfaceC5107d
    public void release() {
        synchronized (this.f19300b) {
            this.f19310l = true;
            this.f19300b.notify();
        }
        try {
            this.f19299a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: s */
    public final void m20777s(O o10) {
        o10.mo6366l();
        O[] oArr = this.f19304f;
        int i10 = this.f19306h;
        this.f19306h = i10 + 1;
        oArr[i10] = o10;
    }

    /* renamed from: t */
    public final void m20778t() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (m20769k());
    }

    /* renamed from: u */
    public final void m20779u(int i10) {
        C4014a.m15200f(this.f19305g == this.f19303e.length);
        for (I i11 : this.f19303e) {
            i11.m20764w(i10);
        }
    }
}
