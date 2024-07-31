package bf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bf.l */
/* loaded from: classes2.dex */
public final class C0566l {

    /* renamed from: a */
    public static final Logger f2526a = Logger.getLogger(C0566l.class.getName());

    /* renamed from: bf.l$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC0573s {

        /* renamed from: h */
        public final /* synthetic */ C0575u f2527h;

        /* renamed from: i */
        public final /* synthetic */ OutputStream f2528i;

        public a(C0575u c0575u, OutputStream outputStream) {
            this.f2527h = c0575u;
            this.f2528i = outputStream;
        }

        @Override // bf.InterfaceC0573s
        /* renamed from: C0 */
        public void mo2798C0(C0557c c0557c, long j10) {
            C0576v.m2921b(c0557c.f2508i, 0L, j10);
            while (j10 > 0) {
                this.f2527h.mo2883f();
                C0570p c0570p = c0557c.f2507h;
                int min = (int) Math.min(j10, c0570p.f2542c - c0570p.f2541b);
                this.f2528i.write(c0570p.f2540a, c0570p.f2541b, min);
                int i10 = c0570p.f2541b + min;
                c0570p.f2541b = i10;
                long j11 = min;
                j10 -= j11;
                c0557c.f2508i -= j11;
                if (i10 == c0570p.f2542c) {
                    c0557c.f2507h = c0570p.m2910b();
                    C0571q.m2915a(c0570p);
                }
            }
        }

        @Override // bf.InterfaceC0573s
        /* renamed from: c */
        public C0575u mo2799c() {
            return this.f2527h;
        }

        @Override // bf.InterfaceC0573s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f2528i.close();
        }

        @Override // bf.InterfaceC0573s, java.io.Flushable
        public void flush() {
            this.f2528i.flush();
        }

        public String toString() {
            return "sink(" + this.f2528i + ")";
        }
    }

    /* renamed from: bf.l$b */
    /* loaded from: classes2.dex */
    public class b implements InterfaceC0574t {

        /* renamed from: h */
        public final /* synthetic */ C0575u f2529h;

        /* renamed from: i */
        public final /* synthetic */ InputStream f2530i;

        public b(C0575u c0575u, InputStream inputStream) {
            this.f2529h = c0575u;
            this.f2530i = inputStream;
        }

        @Override // bf.InterfaceC0574t
        /* renamed from: T */
        public long mo2800T(C0557c c0557c, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (j10 == 0) {
                return 0L;
            }
            try {
                this.f2529h.mo2883f();
                C0570p m2836l0 = c0557c.m2836l0(1);
                int read = this.f2530i.read(m2836l0.f2540a, m2836l0.f2542c, (int) Math.min(j10, 8192 - m2836l0.f2542c));
                if (read == -1) {
                    return -1L;
                }
                m2836l0.f2542c += read;
                long j11 = read;
                c0557c.f2508i += j11;
                return j11;
            } catch (AssertionError e10) {
                if (C0566l.m2895c(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }

        @Override // bf.InterfaceC0574t
        /* renamed from: c */
        public C0575u mo2801c() {
            return this.f2529h;
        }

        @Override // bf.InterfaceC0574t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f2530i.close();
        }

        public String toString() {
            return "source(" + this.f2530i + ")";
        }
    }

    /* renamed from: bf.l$c */
    /* loaded from: classes2.dex */
    public class c extends C0555a {

        /* renamed from: k */
        public final /* synthetic */ Socket f2531k;

        public c(Socket socket) {
            this.f2531k = socket;
        }

        @Override // bf.C0555a
        /* renamed from: o */
        public IOException mo2793o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // bf.C0555a
        /* renamed from: t */
        public void mo2797t() {
            Level level;
            StringBuilder sb2;
            Logger logger;
            Exception exc;
            try {
                this.f2531k.close();
            } catch (AssertionError e10) {
                if (!C0566l.m2895c(e10)) {
                    throw e10;
                }
                Logger logger2 = C0566l.f2526a;
                level = Level.WARNING;
                sb2 = new StringBuilder();
                exc = e10;
                logger = logger2;
                sb2.append("Failed to close timed out socket ");
                sb2.append(this.f2531k);
                logger.log(level, sb2.toString(), (Throwable) exc);
            } catch (Exception e11) {
                Logger logger3 = C0566l.f2526a;
                level = Level.WARNING;
                sb2 = new StringBuilder();
                exc = e11;
                logger = logger3;
                sb2.append("Failed to close timed out socket ");
                sb2.append(this.f2531k);
                logger.log(level, sb2.toString(), (Throwable) exc);
            }
        }
    }

    /* renamed from: a */
    public static InterfaceC0558d m2893a(InterfaceC0573s interfaceC0573s) {
        return new C0568n(interfaceC0573s);
    }

    /* renamed from: b */
    public static InterfaceC0559e m2894b(InterfaceC0574t interfaceC0574t) {
        return new C0569o(interfaceC0574t);
    }

    /* renamed from: c */
    public static boolean m2895c(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: d */
    public static InterfaceC0573s m2896d(OutputStream outputStream) {
        return m2897e(outputStream, new C0575u());
    }

    /* renamed from: e */
    public static InterfaceC0573s m2897e(OutputStream outputStream, C0575u c0575u) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (c0575u != null) {
            return new a(c0575u, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    /* renamed from: f */
    public static InterfaceC0573s m2898f(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        C0555a m2902j = m2902j(socket);
        return m2902j.m2795r(m2897e(socket.getOutputStream(), m2902j));
    }

    /* renamed from: g */
    public static InterfaceC0574t m2899g(InputStream inputStream) {
        return m2900h(inputStream, new C0575u());
    }

    /* renamed from: h */
    public static InterfaceC0574t m2900h(InputStream inputStream, C0575u c0575u) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (c0575u != null) {
            return new b(c0575u, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    /* renamed from: i */
    public static InterfaceC0574t m2901i(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        C0555a m2902j = m2902j(socket);
        return m2902j.m2796s(m2900h(socket.getInputStream(), m2902j));
    }

    /* renamed from: j */
    public static C0555a m2902j(Socket socket) {
        return new c(socket);
    }
}
