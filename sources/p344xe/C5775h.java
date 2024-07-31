package p344xe;

import bf.C0557c;
import bf.C0560f;
import bf.C0575u;
import bf.InterfaceC0559e;
import bf.InterfaceC0574t;
import java.io.Closeable;
import java.io.EOFException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p079f6.C1841a;
import p344xe.C5771d;
import se.C4596e;

/* renamed from: xe.h */
/* loaded from: classes2.dex */
public final class C5775h implements Closeable {

    /* renamed from: l */
    public static final Logger f21477l = Logger.getLogger(C5772e.class.getName());

    /* renamed from: h */
    public final InterfaceC0559e f21478h;

    /* renamed from: i */
    public final a f21479i;

    /* renamed from: j */
    public final boolean f21480j;

    /* renamed from: k */
    public final C5771d.a f21481k;

    /* renamed from: xe.h$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC0574t {

        /* renamed from: h */
        public final InterfaceC0559e f21482h;

        /* renamed from: i */
        public int f21483i;

        /* renamed from: j */
        public byte f21484j;

        /* renamed from: k */
        public int f21485k;

        /* renamed from: l */
        public int f21486l;

        /* renamed from: m */
        public short f21487m;

        public a(InterfaceC0559e interfaceC0559e) {
            this.f21482h = interfaceC0559e;
        }

        @Override // bf.InterfaceC0574t
        /* renamed from: T */
        public long mo2800T(C0557c c0557c, long j10) {
            while (true) {
                int i10 = this.f21486l;
                if (i10 != 0) {
                    long mo2800T = this.f21482h.mo2800T(c0557c, Math.min(j10, i10));
                    if (mo2800T == -1) {
                        return -1L;
                    }
                    this.f21486l = (int) (this.f21486l - mo2800T);
                    return mo2800T;
                }
                this.f21482h.mo2827e(this.f21487m);
                this.f21487m = (short) 0;
                if ((this.f21484j & 4) != 0) {
                    return -1L;
                }
                m23012a();
            }
        }

        /* renamed from: a */
        public final void m23012a() {
            int i10 = this.f21485k;
            int m22998x = C5775h.m22998x(this.f21482h);
            this.f21486l = m22998x;
            this.f21483i = m22998x;
            byte readByte = (byte) (this.f21482h.readByte() & 255);
            this.f21484j = (byte) (this.f21482h.readByte() & 255);
            Logger logger = C5775h.f21477l;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C5772e.m22941b(true, this.f21485k, this.f21483i, readByte, this.f21484j));
            }
            int readInt = this.f21482h.readInt() & C1841a.e.API_PRIORITY_OTHER;
            this.f21485k = readInt;
            if (readByte != 9) {
                throw C5772e.m22943d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            }
            if (readInt != i10) {
                throw C5772e.m22943d("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // bf.InterfaceC0574t
        /* renamed from: c */
        public C0575u mo2801c() {
            return this.f21482h.mo2801c();
        }

        @Override // bf.InterfaceC0574t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* renamed from: xe.h$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo22984a();

        /* renamed from: b */
        void mo22985b(boolean z10, int i10, int i11, List<C5770c> list);

        /* renamed from: c */
        void mo22986c(int i10, EnumC5769b enumC5769b, C0560f c0560f);

        /* renamed from: d */
        void mo22987d(int i10, long j10);

        /* renamed from: e */
        void mo22988e(int i10, EnumC5769b enumC5769b);

        /* renamed from: f */
        void mo22989f(boolean z10, int i10, InterfaceC0559e interfaceC0559e, int i11);

        /* renamed from: g */
        void mo22990g(boolean z10, int i10, int i11);

        /* renamed from: h */
        void mo22991h(int i10, int i11, int i12, boolean z10);

        /* renamed from: i */
        void mo22992i(boolean z10, C5780m c5780m);

        /* renamed from: j */
        void mo22993j(int i10, int i11, List<C5770c> list);
    }

    public C5775h(InterfaceC0559e interfaceC0559e, boolean z10) {
        this.f21478h = interfaceC0559e;
        this.f21480j = z10;
        a aVar = new a(interfaceC0559e);
        this.f21479i = aVar;
        this.f21481k = new C5771d.a(4096, aVar);
    }

    /* renamed from: a */
    public static int m22997a(int i10, byte b10, short s10) {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        throw C5772e.m22943d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }

    /* renamed from: x */
    public static int m22998x(InterfaceC0559e interfaceC0559e) {
        return (interfaceC0559e.readByte() & 255) | ((interfaceC0559e.readByte() & 255) << 16) | ((interfaceC0559e.readByte() & 255) << 8);
    }

    /* renamed from: E */
    public final void m22999E(b bVar, int i10, byte b10, int i11) {
        if (i10 != 8) {
            throw C5772e.m22943d("TYPE_PING length != 8: %s", Integer.valueOf(i10));
        }
        if (i11 != 0) {
            throw C5772e.m22943d("TYPE_PING streamId != 0", new Object[0]);
        }
        bVar.mo22990g((b10 & 1) != 0, this.f21478h.readInt(), this.f21478h.readInt());
    }

    /* renamed from: I */
    public final void m23000I(b bVar, int i10) {
        int readInt = this.f21478h.readInt();
        bVar.mo22991h(i10, readInt & C1841a.e.API_PRIORITY_OTHER, (this.f21478h.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: K */
    public final void m23001K(b bVar, int i10, byte b10, int i11) {
        if (i10 != 5) {
            throw C5772e.m22943d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
        }
        if (i11 == 0) {
            throw C5772e.m22943d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        m23000I(bVar, i11);
    }

    /* renamed from: P */
    public final void m23002P(b bVar, int i10, byte b10, int i11) {
        if (i11 == 0) {
            throw C5772e.m22943d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short readByte = (b10 & 8) != 0 ? (short) (this.f21478h.readByte() & 255) : (short) 0;
        bVar.mo22993j(i11, this.f21478h.readInt() & C1841a.e.API_PRIORITY_OTHER, m23010n(m22997a(i10 - 4, b10, readByte), readByte, b10, i11));
    }

    /* renamed from: W */
    public final void m23003W(b bVar, int i10, byte b10, int i11) {
        if (i10 != 4) {
            throw C5772e.m22943d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
        }
        if (i11 == 0) {
            throw C5772e.m22943d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int readInt = this.f21478h.readInt();
        EnumC5769b m22912b = EnumC5769b.m22912b(readInt);
        if (m22912b == null) {
            throw C5772e.m22943d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
        }
        bVar.mo22988e(i11, m22912b);
    }

    /* renamed from: b0 */
    public final void m23004b0(b bVar, int i10, byte b10, int i11) {
        if (i11 != 0) {
            throw C5772e.m22943d("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b10 & 1) != 0) {
            if (i10 != 0) {
                throw C5772e.m22943d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            bVar.mo22984a();
            return;
        }
        if (i10 % 6 != 0) {
            throw C5772e.m22943d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
        }
        C5780m c5780m = new C5780m();
        for (int i12 = 0; i12 < i10; i12 += 6) {
            int readShort = this.f21478h.readShort() & 65535;
            int readInt = this.f21478h.readInt();
            if (readShort != 2) {
                if (readShort == 3) {
                    readShort = 4;
                } else if (readShort == 4) {
                    readShort = 7;
                    if (readInt < 0) {
                        throw C5772e.m22943d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                    }
                } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                    throw C5772e.m22943d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                }
            } else if (readInt != 0 && readInt != 1) {
                throw C5772e.m22943d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
            }
            c5780m.m23069i(readShort, readInt);
        }
        bVar.mo22992i(false, c5780m);
    }

    /* renamed from: c0 */
    public final void m23005c0(b bVar, int i10, byte b10, int i11) {
        if (i10 != 4) {
            throw C5772e.m22943d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
        }
        long readInt = this.f21478h.readInt() & 2147483647L;
        if (readInt == 0) {
            throw C5772e.m22943d("windowSizeIncrement was 0", Long.valueOf(readInt));
        }
        bVar.mo22987d(i11, readInt);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21478h.close();
    }

    /* renamed from: d */
    public boolean m23006d(boolean z10, b bVar) {
        try {
            this.f21478h.mo2806B0(9L);
            int m22998x = m22998x(this.f21478h);
            if (m22998x < 0 || m22998x > 16384) {
                throw C5772e.m22943d("FRAME_SIZE_ERROR: %s", Integer.valueOf(m22998x));
            }
            byte readByte = (byte) (this.f21478h.readByte() & 255);
            if (z10 && readByte != 4) {
                throw C5772e.m22943d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            }
            byte readByte2 = (byte) (this.f21478h.readByte() & 255);
            int readInt = this.f21478h.readInt() & C1841a.e.API_PRIORITY_OTHER;
            Logger logger = f21477l;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C5772e.m22941b(true, readInt, m22998x, readByte, readByte2));
            }
            switch (readByte) {
                case 0:
                    m23008j(bVar, m22998x, readByte2, readInt);
                    return true;
                case 1:
                    m23011w(bVar, m22998x, readByte2, readInt);
                    return true;
                case 2:
                    m23001K(bVar, m22998x, readByte2, readInt);
                    return true;
                case 3:
                    m23003W(bVar, m22998x, readByte2, readInt);
                    return true;
                case 4:
                    m23004b0(bVar, m22998x, readByte2, readInt);
                    return true;
                case 5:
                    m23002P(bVar, m22998x, readByte2, readInt);
                    return true;
                case 6:
                    m22999E(bVar, m22998x, readByte2, readInt);
                    return true;
                case 7:
                    m23009l(bVar, m22998x, readByte2, readInt);
                    return true;
                case 8:
                    m23005c0(bVar, m22998x, readByte2, readInt);
                    return true;
                default:
                    this.f21478h.mo2827e(m22998x);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public void m23007f(b bVar) {
        if (this.f21480j) {
            if (!m23006d(true, bVar)) {
                throw C5772e.m22943d("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        InterfaceC0559e interfaceC0559e = this.f21478h;
        C0560f c0560f = C5772e.f21395a;
        C0560f mo2837m = interfaceC0559e.mo2837m(c0560f.mo2871u());
        Logger logger = f21477l;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C4596e.m18108p("<< CONNECTION %s", mo2837m.mo2866o()));
        }
        if (!c0560f.equals(mo2837m)) {
            throw C5772e.m22943d("Expected a connection header but was %s", mo2837m.mo2876z());
        }
    }

    /* renamed from: j */
    public final void m23008j(b bVar, int i10, byte b10, int i11) {
        if (i11 == 0) {
            throw C5772e.m22943d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z10 = (b10 & 1) != 0;
        if ((b10 & 32) != 0) {
            throw C5772e.m22943d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short readByte = (b10 & 8) != 0 ? (short) (this.f21478h.readByte() & 255) : (short) 0;
        bVar.mo22989f(z10, i11, this.f21478h, m22997a(i10, b10, readByte));
        this.f21478h.mo2827e(readByte);
    }

    /* renamed from: l */
    public final void m23009l(b bVar, int i10, byte b10, int i11) {
        if (i10 < 8) {
            throw C5772e.m22943d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
        }
        if (i11 != 0) {
            throw C5772e.m22943d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int readInt = this.f21478h.readInt();
        int readInt2 = this.f21478h.readInt();
        int i12 = i10 - 8;
        EnumC5769b m22912b = EnumC5769b.m22912b(readInt2);
        if (m22912b == null) {
            throw C5772e.m22943d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
        }
        C0560f c0560f = C0560f.f2510l;
        if (i12 > 0) {
            c0560f = this.f21478h.mo2837m(i12);
        }
        bVar.mo22986c(readInt, m22912b, c0560f);
    }

    /* renamed from: n */
    public final List<C5770c> m23010n(int i10, short s10, byte b10, int i11) {
        a aVar = this.f21479i;
        aVar.f21486l = i10;
        aVar.f21483i = i10;
        aVar.f21487m = s10;
        aVar.f21484j = b10;
        aVar.f21485k = i11;
        this.f21481k.m22925k();
        return this.f21481k.m22919e();
    }

    /* renamed from: w */
    public final void m23011w(b bVar, int i10, byte b10, int i11) {
        if (i11 == 0) {
            throw C5772e.m22943d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z10 = (b10 & 1) != 0;
        short readByte = (b10 & 8) != 0 ? (short) (this.f21478h.readByte() & 255) : (short) 0;
        if ((b10 & 32) != 0) {
            m23000I(bVar, i11);
            i10 -= 5;
        }
        bVar.mo22985b(z10, i11, -1, m23010n(m22997a(i10, b10, readByte), readByte, b10, i11));
    }
}
