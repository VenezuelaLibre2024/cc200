package p137j4;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p222p5.C4014a;
import p222p5.C4026g;
import p222p5.C4041n0;
import p304v3.C5106c;

/* renamed from: j4.e */
/* loaded from: classes.dex */
public class C3226e {

    /* renamed from: g */
    public static final ArrayDeque<b> f11184g = new ArrayDeque<>();

    /* renamed from: h */
    public static final Object f11185h = new Object();

    /* renamed from: a */
    public final MediaCodec f11186a;

    /* renamed from: b */
    public final HandlerThread f11187b;

    /* renamed from: c */
    public Handler f11188c;

    /* renamed from: d */
    public final AtomicReference<RuntimeException> f11189d;

    /* renamed from: e */
    public final C4026g f11190e;

    /* renamed from: f */
    public boolean f11191f;

    /* renamed from: j4.e$a */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C3226e.this.m11522f(message);
        }
    }

    /* renamed from: j4.e$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f11193a;

        /* renamed from: b */
        public int f11194b;

        /* renamed from: c */
        public int f11195c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f11196d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f11197e;

        /* renamed from: f */
        public int f11198f;

        /* renamed from: a */
        public void m11533a(int i10, int i11, int i12, long j10, int i13) {
            this.f11193a = i10;
            this.f11194b = i11;
            this.f11195c = i12;
            this.f11197e = j10;
            this.f11198f = i13;
        }
    }

    public C3226e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C4026g());
    }

    public C3226e(MediaCodec mediaCodec, HandlerThread handlerThread, C4026g c4026g) {
        this.f11186a = mediaCodec;
        this.f11187b = handlerThread;
        this.f11190e = c4026g;
        this.f11189d = new AtomicReference<>();
    }

    /* renamed from: c */
    public static void m11516c(C5106c c5106c, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = c5106c.f19264f;
        cryptoInfo.numBytesOfClearData = m11518e(c5106c.f19262d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m11518e(c5106c.f19263e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C4014a.m15199e(m11517d(c5106c.f19260b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C4014a.m15199e(m11517d(c5106c.f19259a, cryptoInfo.iv));
        cryptoInfo.mode = c5106c.f19261c;
        if (C4041n0.f14513a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c5106c.f19265g, c5106c.f19266h));
        }
    }

    /* renamed from: d */
    public static byte[] m11517d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: e */
    public static int[] m11518e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* renamed from: k */
    public static b m11519k() {
        ArrayDeque<b> arrayDeque = f11184g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    /* renamed from: o */
    public static void m11520o(b bVar) {
        ArrayDeque<b> arrayDeque = f11184g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    /* renamed from: b */
    public final void m11521b() {
        this.f11190e.m15312c();
        ((Handler) C4014a.m15199e(this.f11188c)).obtainMessage(2).sendToTarget();
        this.f11190e.m15310a();
    }

    /* renamed from: f */
    public final void m11522f(Message message) {
        int i10 = message.what;
        b bVar = null;
        if (i10 == 0) {
            bVar = (b) message.obj;
            m11523g(bVar.f11193a, bVar.f11194b, bVar.f11195c, bVar.f11197e, bVar.f11198f);
        } else if (i10 == 1) {
            bVar = (b) message.obj;
            m11524h(bVar.f11193a, bVar.f11194b, bVar.f11196d, bVar.f11197e, bVar.f11198f);
        } else if (i10 != 2) {
            this.f11189d.compareAndSet(null, new IllegalStateException(String.valueOf(message.what)));
        } else {
            this.f11190e.m15314e();
        }
        if (bVar != null) {
            m11520o(bVar);
        }
    }

    /* renamed from: g */
    public final void m11523g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f11186a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            this.f11189d.compareAndSet(null, e10);
        }
    }

    /* renamed from: h */
    public final void m11524h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f11185h) {
                this.f11186a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            this.f11189d.compareAndSet(null, e10);
        }
    }

    /* renamed from: i */
    public void m11525i() {
        if (this.f11191f) {
            try {
                m11526j();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    /* renamed from: j */
    public final void m11526j() {
        ((Handler) C4014a.m15199e(this.f11188c)).removeCallbacksAndMessages(null);
        m11521b();
    }

    /* renamed from: l */
    public void m11527l() {
        RuntimeException andSet = this.f11189d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    /* renamed from: m */
    public void m11528m(int i10, int i11, int i12, long j10, int i13) {
        m11527l();
        b m11519k = m11519k();
        m11519k.m11533a(i10, i11, i12, j10, i13);
        ((Handler) C4041n0.m15463j(this.f11188c)).obtainMessage(0, m11519k).sendToTarget();
    }

    /* renamed from: n */
    public void m11529n(int i10, int i11, C5106c c5106c, long j10, int i12) {
        m11527l();
        b m11519k = m11519k();
        m11519k.m11533a(i10, i11, 0, j10, i12);
        m11516c(c5106c, m11519k.f11196d);
        ((Handler) C4041n0.m15463j(this.f11188c)).obtainMessage(1, m11519k).sendToTarget();
    }

    /* renamed from: p */
    public void m11530p() {
        if (this.f11191f) {
            m11525i();
            this.f11187b.quit();
        }
        this.f11191f = false;
    }

    /* renamed from: q */
    public void m11531q() {
        if (this.f11191f) {
            return;
        }
        this.f11187b.start();
        this.f11188c = new a(this.f11187b.getLooper());
        this.f11191f = true;
    }

    /* renamed from: r */
    public void m11532r() {
        m11521b();
    }
}
