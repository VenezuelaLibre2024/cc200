package p137j4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: j4.g */
/* loaded from: classes.dex */
public final class C3228g extends MediaCodec.Callback {

    /* renamed from: b */
    public final HandlerThread f11201b;

    /* renamed from: c */
    public Handler f11202c;

    /* renamed from: h */
    public MediaFormat f11207h;

    /* renamed from: i */
    public MediaFormat f11208i;

    /* renamed from: j */
    public MediaCodec.CodecException f11209j;

    /* renamed from: k */
    public long f11210k;

    /* renamed from: l */
    public boolean f11211l;

    /* renamed from: m */
    public IllegalStateException f11212m;

    /* renamed from: a */
    public final Object f11200a = new Object();

    /* renamed from: d */
    public final C3232k f11203d = new C3232k();

    /* renamed from: e */
    public final C3232k f11204e = new C3232k();

    /* renamed from: f */
    public final ArrayDeque<MediaCodec.BufferInfo> f11205f = new ArrayDeque<>();

    /* renamed from: g */
    public final ArrayDeque<MediaFormat> f11206g = new ArrayDeque<>();

    public C3228g(HandlerThread handlerThread) {
        this.f11201b = handlerThread;
    }

    /* renamed from: b */
    public final void m11535b(MediaFormat mediaFormat) {
        this.f11204e.m11560a(-2);
        this.f11206g.add(mediaFormat);
    }

    /* renamed from: c */
    public int m11536c() {
        synchronized (this.f11200a) {
            int i10 = -1;
            if (m11542i()) {
                return -1;
            }
            m11543j();
            if (!this.f11203d.m11563d()) {
                i10 = this.f11203d.m11564e();
            }
            return i10;
        }
    }

    /* renamed from: d */
    public int m11537d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f11200a) {
            if (m11542i()) {
                return -1;
            }
            m11543j();
            if (this.f11204e.m11563d()) {
                return -1;
            }
            int m11564e = this.f11204e.m11564e();
            if (m11564e >= 0) {
                C4014a.m15202h(this.f11207h);
                MediaCodec.BufferInfo remove = this.f11205f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (m11564e == -2) {
                this.f11207h = this.f11206g.remove();
            }
            return m11564e;
        }
    }

    /* renamed from: e */
    public void m11538e() {
        synchronized (this.f11200a) {
            this.f11210k++;
            ((Handler) C4041n0.m15463j(this.f11202c)).post(new Runnable() { // from class: j4.f
                @Override // java.lang.Runnable
                public final void run() {
                    C3228g.this.m11546m();
                }
            });
        }
    }

    /* renamed from: f */
    public final void m11539f() {
        if (!this.f11206g.isEmpty()) {
            this.f11208i = this.f11206g.getLast();
        }
        this.f11203d.m11561b();
        this.f11204e.m11561b();
        this.f11205f.clear();
        this.f11206g.clear();
    }

    /* renamed from: g */
    public MediaFormat m11540g() {
        MediaFormat mediaFormat;
        synchronized (this.f11200a) {
            mediaFormat = this.f11207h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: h */
    public void m11541h(MediaCodec mediaCodec) {
        C4014a.m15200f(this.f11202c == null);
        this.f11201b.start();
        Handler handler = new Handler(this.f11201b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f11202c = handler;
    }

    /* renamed from: i */
    public final boolean m11542i() {
        return this.f11210k > 0 || this.f11211l;
    }

    /* renamed from: j */
    public final void m11543j() {
        m11544k();
        m11545l();
    }

    /* renamed from: k */
    public final void m11544k() {
        IllegalStateException illegalStateException = this.f11212m;
        if (illegalStateException == null) {
            return;
        }
        this.f11212m = null;
        throw illegalStateException;
    }

    /* renamed from: l */
    public final void m11545l() {
        MediaCodec.CodecException codecException = this.f11209j;
        if (codecException == null) {
            return;
        }
        this.f11209j = null;
        throw codecException;
    }

    /* renamed from: m */
    public final void m11546m() {
        synchronized (this.f11200a) {
            if (this.f11211l) {
                return;
            }
            long j10 = this.f11210k - 1;
            this.f11210k = j10;
            if (j10 > 0) {
                return;
            }
            if (j10 < 0) {
                m11547n(new IllegalStateException());
            } else {
                m11539f();
            }
        }
    }

    /* renamed from: n */
    public final void m11547n(IllegalStateException illegalStateException) {
        synchronized (this.f11200a) {
            this.f11212m = illegalStateException;
        }
    }

    /* renamed from: o */
    public void m11548o() {
        synchronized (this.f11200a) {
            this.f11211l = true;
            this.f11201b.quit();
            m11539f();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f11200a) {
            this.f11209j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f11200a) {
            this.f11203d.m11560a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f11200a) {
            MediaFormat mediaFormat = this.f11208i;
            if (mediaFormat != null) {
                m11535b(mediaFormat);
                this.f11208i = null;
            }
            this.f11204e.m11560a(i10);
            this.f11205f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f11200a) {
            m11535b(mediaFormat);
            this.f11208i = null;
        }
    }
}
