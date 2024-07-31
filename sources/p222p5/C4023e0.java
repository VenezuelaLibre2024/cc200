package p222p5;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import p206o5.C3901e0;

/* renamed from: p5.e0 */
/* loaded from: classes.dex */
public final class C4023e0 {

    /* renamed from: a */
    public static final Object f14465a = new Object();

    /* renamed from: b */
    public static final Object f14466b = new Object();

    /* renamed from: c */
    public static boolean f14467c = false;

    /* renamed from: d */
    public static long f14468d = 0;

    /* renamed from: e */
    public static String f14469e = "time.android.com";

    /* renamed from: p5.e0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo4740a(IOException iOException);

        /* renamed from: b */
        void mo4741b();
    }

    /* renamed from: p5.e0$c */
    /* loaded from: classes.dex */
    public static final class c implements C3901e0.b<C3901e0.e> {

        /* renamed from: h */
        public final b f14470h;

        public c(b bVar) {
            this.f14470h = bVar;
        }

        @Override // p206o5.C3901e0.b
        /* renamed from: k */
        public C3901e0.c mo219k(C3901e0.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f14470h;
            if (bVar != null) {
                bVar.mo4740a(iOException);
            }
            return C3901e0.f14001f;
        }

        @Override // p206o5.C3901e0.b
        /* renamed from: o */
        public void mo222o(C3901e0.e eVar, long j10, long j11) {
            if (this.f14470h != null) {
                if (C4023e0.m15296k()) {
                    this.f14470h.mo4741b();
                } else {
                    this.f14470h.mo4740a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // p206o5.C3901e0.b
        /* renamed from: r */
        public void mo223r(C3901e0.e eVar, long j10, long j11, boolean z10) {
        }
    }

    /* renamed from: p5.e0$d */
    /* loaded from: classes.dex */
    public static final class d implements C3901e0.e {
        public d() {
        }

        @Override // p206o5.C3901e0.e
        /* renamed from: b */
        public void mo14817b() {
            synchronized (C4023e0.f14465a) {
                synchronized (C4023e0.f14466b) {
                    if (C4023e0.f14467c) {
                        return;
                    }
                    long m15290e = C4023e0.m15290e();
                    synchronized (C4023e0.f14466b) {
                        long unused = C4023e0.f14468d = m15290e;
                        boolean unused2 = C4023e0.f14467c = true;
                    }
                }
            }
        }

        @Override // p206o5.C3901e0.e
        /* renamed from: c */
        public void mo14818c() {
        }
    }

    /* renamed from: e */
    public static /* synthetic */ long m15290e() {
        return m15297l();
    }

    /* renamed from: g */
    public static void m15292g(byte b10, byte b11, int i10, long j10) {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        }
        if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    /* renamed from: h */
    public static long m15293h() {
        long j10;
        synchronized (f14466b) {
            j10 = f14467c ? f14468d : -9223372036854775807L;
        }
        return j10;
    }

    /* renamed from: i */
    public static String m15294i() {
        String str;
        synchronized (f14466b) {
            str = f14469e;
        }
        return str;
    }

    /* renamed from: j */
    public static void m15295j(C3901e0 c3901e0, b bVar) {
        if (m15296k()) {
            if (bVar != null) {
                bVar.mo4741b();
            }
        } else {
            if (c3901e0 == null) {
                c3901e0 = new C3901e0("SntpClient");
            }
            c3901e0.m14807n(new d(), new c(bVar), 1);
        }
    }

    /* renamed from: k */
    public static boolean m15296k() {
        boolean z10;
        synchronized (f14466b) {
            z10 = f14467c;
        }
        return z10;
    }

    /* renamed from: l */
    public static long m15297l() {
        InetAddress byName = InetAddress.getByName(m15294i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m15300o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b10 = (byte) ((bArr[0] >> 6) & 3);
            byte b11 = (byte) (bArr[0] & 7);
            int i10 = bArr[1] & 255;
            long m15299n = m15299n(bArr, 24);
            long m15299n2 = m15299n(bArr, 32);
            long m15299n3 = m15299n(bArr, 40);
            m15292g(b10, b11, i10, m15299n3);
            long j11 = (j10 + (((m15299n2 - m15299n) + (m15299n3 - j10)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j11;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static long m15298m(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    /* renamed from: n */
    public static long m15299n(byte[] bArr, int i10) {
        long m15298m = m15298m(bArr, i10);
        long m15298m2 = m15298m(bArr, i10 + 4);
        if (m15298m == 0 && m15298m2 == 0) {
            return 0L;
        }
        return ((m15298m - 2208988800L) * 1000) + ((m15298m2 * 1000) / 4294967296L);
    }

    /* renamed from: o */
    public static void m15300o(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        long j13 = j11 + 2208988800L;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (j13 >> 24);
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j13 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j13 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (j13 >> 0);
        long j14 = (j12 * 4294967296L) / 1000;
        int i15 = i14 + 1;
        bArr[i14] = (byte) (j14 >> 24);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (j14 >> 16);
        bArr[i16] = (byte) (j14 >> 8);
        bArr[i16 + 1] = (byte) (Math.random() * 255.0d);
    }
}
