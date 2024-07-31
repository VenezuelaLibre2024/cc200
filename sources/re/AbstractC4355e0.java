package re;

import bf.C0557c;
import bf.InterfaceC0559e;
import java.io.Closeable;
import java.io.IOException;
import java.util.Objects;
import se.C4596e;

/* renamed from: re.e0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4355e0 implements Closeable {

    /* renamed from: re.e0$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractC4355e0 {

        /* renamed from: h */
        public final /* synthetic */ long f15780h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC0559e f15781i;

        public a(C4376x c4376x, long j10, InterfaceC0559e interfaceC0559e) {
            this.f15780h = j10;
            this.f15781i = interfaceC0559e;
        }

        @Override // re.AbstractC4355e0
        /* renamed from: f */
        public long mo16733f() {
            return this.f15780h;
        }

        @Override // re.AbstractC4355e0
        /* renamed from: n */
        public InterfaceC0559e mo16734n() {
            return this.f15781i;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m16729a(Throwable th, AutoCloseable autoCloseable) {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    /* renamed from: j */
    public static AbstractC4355e0 m16730j(C4376x c4376x, long j10, InterfaceC0559e interfaceC0559e) {
        Objects.requireNonNull(interfaceC0559e, "source == null");
        return new a(c4376x, j10, interfaceC0559e);
    }

    /* renamed from: l */
    public static AbstractC4355e0 m16731l(C4376x c4376x, byte[] bArr) {
        return m16730j(c4376x, bArr.length, new C0557c().mo2845t0(bArr));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C4596e.m18098f(mo16734n());
    }

    /* renamed from: d */
    public final byte[] m16732d() {
        long mo16733f = mo16733f();
        if (mo16733f > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + mo16733f);
        }
        InterfaceC0559e mo16734n = mo16734n();
        try {
            byte[] mo2854z = mo16734n.mo2854z();
            m16729a(null, mo16734n);
            if (mo16733f == -1 || mo16733f == mo2854z.length) {
                return mo2854z;
            }
            throw new IOException("Content-Length (" + mo16733f + ") and stream length (" + mo2854z.length + ") disagree");
        } finally {
        }
    }

    /* renamed from: f */
    public abstract long mo16733f();

    /* renamed from: n */
    public abstract InterfaceC0559e mo16734n();
}
