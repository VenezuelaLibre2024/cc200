package p100gc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import ec.InterfaceC1766b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.Queue;
import p054dc.InterfaceC1610a;
import p311vb.EnumC5160d;
import p325wb.C5472e;
import p325wb.C5473f;
import p341xb.InterfaceC5747a;
import p357yb.InterfaceC5905a;

/* renamed from: gc.c */
/* loaded from: classes.dex */
public class C2223c {

    /* renamed from: q */
    public static final C5472e f8821q = new C5472e(C2223c.class.getSimpleName());

    /* renamed from: c */
    public final MediaCodec f8824c;

    /* renamed from: d */
    public final MediaCodec f8825d;

    /* renamed from: e */
    public final int f8826e;

    /* renamed from: f */
    public final int f8827f;

    /* renamed from: g */
    public final int f8828g;

    /* renamed from: h */
    public final int f8829h;

    /* renamed from: i */
    public final InterfaceC5747a f8830i;

    /* renamed from: j */
    public final InterfaceC5905a f8831j;

    /* renamed from: k */
    public final InterfaceC1610a f8832k;

    /* renamed from: l */
    public final InterfaceC1766b f8833l;

    /* renamed from: o */
    public ShortBuffer f8836o;

    /* renamed from: p */
    public ShortBuffer f8837p;

    /* renamed from: a */
    public final Queue<C2221a> f8822a = new ArrayDeque();

    /* renamed from: b */
    public final Queue<C2221a> f8823b = new ArrayDeque();

    /* renamed from: m */
    public long f8834m = Long.MIN_VALUE;

    /* renamed from: n */
    public long f8835n = Long.MIN_VALUE;

    public C2223c(MediaCodec mediaCodec, MediaFormat mediaFormat, MediaCodec mediaCodec2, MediaFormat mediaFormat2, InterfaceC1766b interfaceC1766b, InterfaceC1610a interfaceC1610a, InterfaceC5905a interfaceC5905a) {
        this.f8824c = mediaCodec;
        this.f8825d = mediaCodec2;
        this.f8833l = interfaceC1766b;
        this.f8827f = mediaFormat2.getInteger("sample-rate");
        this.f8826e = mediaFormat.getInteger("sample-rate");
        int integer = mediaFormat2.getInteger("channel-count");
        this.f8829h = integer;
        int integer2 = mediaFormat.getInteger("channel-count");
        this.f8828g = integer2;
        if (integer != 1 && integer != 2) {
            throw new UnsupportedOperationException("Output channel count (" + integer + ") not supported.");
        }
        if (integer2 == 1 || integer2 == 2) {
            this.f8830i = integer2 > integer ? InterfaceC5747a.f21306a : integer2 < integer ? InterfaceC5747a.f21307b : InterfaceC5747a.f21308c;
            this.f8832k = interfaceC1610a;
            this.f8831j = interfaceC5905a;
        } else {
            throw new UnsupportedOperationException("Input channel count (" + integer2 + ") not supported.");
        }
    }

    /* renamed from: a */
    public void m8934a(int i10, ByteBuffer byteBuffer, long j10, boolean z10) {
        if (this.f8830i == null) {
            throw new RuntimeException("Buffer received before format!");
        }
        C2221a poll = this.f8822a.poll();
        if (poll == null) {
            poll = new C2221a();
        }
        poll.f8817a = i10;
        if (z10) {
            j10 = 0;
        }
        poll.f8818b = j10;
        poll.f8819c = z10 ? null : byteBuffer.asShortBuffer();
        poll.f8820d = z10;
        this.f8823b.add(poll);
    }

    /* renamed from: b */
    public final void m8935b(int i10) {
        C5472e c5472e = f8821q;
        c5472e.m21688i("ensureTempBuffer1 - desiredSize:" + i10);
        ShortBuffer shortBuffer = this.f8836o;
        if (shortBuffer == null || shortBuffer.capacity() < i10) {
            c5472e.m21688i("ensureTempBuffer1 - creating new buffer.");
            this.f8836o = ByteBuffer.allocateDirect(i10 * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        }
        this.f8836o.clear();
        this.f8836o.limit(i10);
    }

    /* renamed from: c */
    public final void m8936c(int i10) {
        C5472e c5472e = f8821q;
        c5472e.m21688i("ensureTempBuffer2 - desiredSize:" + i10);
        ShortBuffer shortBuffer = this.f8837p;
        if (shortBuffer == null || shortBuffer.capacity() < i10) {
            c5472e.m21688i("ensureTempBuffer2 - creating new buffer.");
            this.f8837p = ByteBuffer.allocateDirect(i10 * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        }
        this.f8837p.clear();
        this.f8837p.limit(i10);
    }

    /* renamed from: d */
    public boolean m8937d(C5473f c5473f, long j10) {
        int dequeueInputBuffer;
        if (!m8938e() || (dequeueInputBuffer = this.f8825d.dequeueInputBuffer(j10)) < 0) {
            return false;
        }
        ShortBuffer asShortBuffer = c5473f.m21690a(dequeueInputBuffer).asShortBuffer();
        asShortBuffer.clear();
        C2221a peek = this.f8823b.peek();
        if (peek.f8820d) {
            this.f8825d.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
            return false;
        }
        if (m8939f(peek, asShortBuffer, dequeueInputBuffer)) {
            return true;
        }
        this.f8823b.remove();
        this.f8822a.add(peek);
        this.f8824c.releaseOutputBuffer(peek.f8817a, false);
        return true;
    }

    /* renamed from: e */
    public final boolean m8938e() {
        return !this.f8823b.isEmpty();
    }

    /* renamed from: f */
    public final boolean m8939f(C2221a c2221a, ShortBuffer shortBuffer, int i10) {
        int remaining = shortBuffer.remaining();
        int remaining2 = c2221a.f8819c.remaining();
        long mo7065a = this.f8833l.mo7065a(EnumC5160d.AUDIO, c2221a.f8818b);
        if (this.f8834m == Long.MIN_VALUE) {
            this.f8834m = c2221a.f8818b;
            this.f8835n = mo7065a;
        }
        long j10 = c2221a.f8818b;
        long j11 = j10 - this.f8834m;
        long j12 = mo7065a - this.f8835n;
        this.f8834m = j10;
        this.f8835n = mo7065a;
        double d10 = j12 / j11;
        C5472e c5472e = f8821q;
        c5472e.m21682b("process - time stretching - decoderDurationUs:" + j11 + " encoderDeltaUs:" + j12 + " stretchFactor:" + d10);
        double d11 = (double) remaining2;
        int ceil = (int) Math.ceil((((double) this.f8830i.mo22870b((int) Math.ceil(d11 * d10))) * ((double) this.f8827f)) / ((double) this.f8826e));
        int i11 = 0;
        boolean z10 = ceil > remaining;
        if (z10) {
            i11 = remaining2 - ((int) Math.floor(remaining / (ceil / d11)));
            c5472e.m21688i("process - overflowing! Reduction:" + i11);
            ShortBuffer shortBuffer2 = c2221a.f8819c;
            shortBuffer2.limit(shortBuffer2.limit() - i11);
        }
        int remaining3 = c2221a.f8819c.remaining();
        c5472e.m21682b("process - totalInputSize:" + remaining2 + " processedTotalInputSize:" + ceil + " outputSize:" + remaining + " inputSize:" + remaining3);
        double d12 = ((double) remaining3) * d10;
        m8935b((int) Math.ceil(d12));
        this.f8832k.mo6467a(c2221a.f8819c, this.f8836o, this.f8828g);
        this.f8836o.rewind();
        m8936c(this.f8830i.mo22870b((int) Math.ceil(d12)));
        this.f8830i.mo22869a(this.f8836o, this.f8837p);
        this.f8837p.rewind();
        this.f8831j.mo23631a(this.f8837p, this.f8826e, shortBuffer, this.f8827f, this.f8828g);
        if (z10) {
            c2221a.f8818b += C2222b.m8933b(remaining3, this.f8826e, this.f8828g);
            ShortBuffer shortBuffer3 = c2221a.f8819c;
            shortBuffer3.limit(shortBuffer3.limit() + i11);
        }
        this.f8825d.queueInputBuffer(i10, 0, shortBuffer.position() * 2, mo7065a, 0);
        return z10;
    }
}
