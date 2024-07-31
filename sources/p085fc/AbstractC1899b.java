package p085fc;

import ac.InterfaceC0087b;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import p311vb.EnumC5160d;
import p325wb.C5473f;
import p371zb.InterfaceC6116a;

/* renamed from: fc.b */
/* loaded from: classes.dex */
public abstract class AbstractC1899b implements InterfaceC1902e {

    /* renamed from: a */
    public final InterfaceC0087b f7187a;

    /* renamed from: c */
    public final InterfaceC6116a f7189c;

    /* renamed from: d */
    public final EnumC5160d f7190d;

    /* renamed from: f */
    public MediaCodec f7192f;

    /* renamed from: g */
    public MediaCodec f7193g;

    /* renamed from: h */
    public C5473f f7194h;

    /* renamed from: i */
    public C5473f f7195i;

    /* renamed from: j */
    public boolean f7196j;

    /* renamed from: k */
    public boolean f7197k;

    /* renamed from: l */
    public MediaFormat f7198l;

    /* renamed from: m */
    public boolean f7199m;

    /* renamed from: n */
    public boolean f7200n;

    /* renamed from: o */
    public boolean f7201o;

    /* renamed from: e */
    public final MediaCodec.BufferInfo f7191e = new MediaCodec.BufferInfo();

    /* renamed from: b */
    public final InterfaceC0087b.a f7188b = new InterfaceC0087b.a();

    public AbstractC1899b(InterfaceC0087b interfaceC0087b, InterfaceC6116a interfaceC6116a, EnumC5160d enumC5160d) {
        this.f7187a = interfaceC0087b;
        this.f7189c = interfaceC6116a;
        this.f7190d = enumC5160d;
    }

    @Override // p085fc.InterfaceC1902e
    /* renamed from: a */
    public final boolean mo7769a() {
        return this.f7200n;
    }

    @Override // p085fc.InterfaceC1902e
    /* renamed from: b */
    public final void mo7770b(MediaFormat mediaFormat) {
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(mediaFormat.getString("mime"));
            this.f7193g = createEncoderByType;
            mo7777j(mediaFormat, createEncoderByType);
            mo7780p(mediaFormat, this.f7193g);
            MediaFormat mo380e = this.f7187a.mo380e(this.f7190d);
            if (mo380e == null) {
                throw new IllegalArgumentException("Input format is null!");
            }
            try {
                MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mo380e.getString("mime"));
                this.f7192f = createDecoderByType;
                mo7776i(mo380e, createDecoderByType);
                m7779o(mo380e, this.f7192f);
                mo7765h(mo380e, mediaFormat, this.f7192f, this.f7193g);
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        } catch (IOException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Override // p085fc.InterfaceC1902e
    /* renamed from: c */
    public final boolean mo7771c(boolean z10) {
        int m7772d;
        boolean z11 = false;
        while (m7773e(0L) != 0) {
            z11 = true;
        }
        do {
            m7772d = m7772d(0L);
            if (m7772d != 0) {
                z11 = true;
            }
        } while (m7772d == 1);
        while (m7775g(0L)) {
            z11 = true;
        }
        while (m7774f(0L, z10) != 0) {
            z11 = true;
        }
        return z11;
    }

    /* renamed from: d */
    public final int m7772d(long j10) {
        if (this.f7199m) {
            return 0;
        }
        int dequeueOutputBuffer = this.f7192f.dequeueOutputBuffer(this.f7191e, j10);
        if (dequeueOutputBuffer != -3) {
            if (dequeueOutputBuffer != -2) {
                if (dequeueOutputBuffer == -1) {
                    return 0;
                }
                MediaCodec.BufferInfo bufferInfo = this.f7191e;
                boolean z10 = (bufferInfo.flags & 4) != 0;
                boolean z11 = bufferInfo.size > 0;
                if (z10) {
                    this.f7199m = true;
                }
                if (!z10 && !z11) {
                    return 2;
                }
                mo7767l(this.f7192f, dequeueOutputBuffer, this.f7194h.m21691b(dequeueOutputBuffer), this.f7191e.presentationTimeUs, z10);
                return 2;
            }
            MediaCodec mediaCodec = this.f7192f;
            mo7766k(mediaCodec, mediaCodec.getOutputFormat());
        }
        return 1;
    }

    /* renamed from: e */
    public final int m7773e(long j10) {
        if (this.f7200n) {
            return 0;
        }
        int dequeueOutputBuffer = this.f7193g.dequeueOutputBuffer(this.f7191e, j10);
        if (dequeueOutputBuffer == -3) {
            this.f7195i.m21692c();
            return 1;
        }
        if (dequeueOutputBuffer == -2) {
            MediaCodec mediaCodec = this.f7193g;
            m7778m(mediaCodec, mediaCodec.getOutputFormat());
            return 1;
        }
        if (dequeueOutputBuffer == -1) {
            return 0;
        }
        if (this.f7198l == null) {
            throw new RuntimeException("Could not determine actual output format.");
        }
        MediaCodec.BufferInfo bufferInfo = this.f7191e;
        int i10 = bufferInfo.flags;
        if ((i10 & 4) != 0) {
            this.f7200n = true;
            bufferInfo.set(0, 0, 0L, i10);
        }
        if ((this.f7191e.flags & 2) != 0) {
            this.f7193g.releaseOutputBuffer(dequeueOutputBuffer, false);
            return 1;
        }
        this.f7189c.mo24403c(this.f7190d, this.f7195i.m21691b(dequeueOutputBuffer), this.f7191e);
        this.f7193g.releaseOutputBuffer(dequeueOutputBuffer, false);
        return 2;
    }

    /* renamed from: f */
    public final int m7774f(long j10, boolean z10) {
        int dequeueInputBuffer;
        if (this.f7201o) {
            return 0;
        }
        if (this.f7187a.mo383h() || z10) {
            int dequeueInputBuffer2 = this.f7192f.dequeueInputBuffer(j10);
            if (dequeueInputBuffer2 < 0) {
                return 0;
            }
            this.f7201o = true;
            this.f7192f.queueInputBuffer(dequeueInputBuffer2, 0, 0, 0L, 4);
            return 0;
        }
        if (!this.f7187a.mo387l(this.f7190d) || (dequeueInputBuffer = this.f7192f.dequeueInputBuffer(j10)) < 0) {
            return 0;
        }
        this.f7188b.f306a = this.f7194h.m21690a(dequeueInputBuffer);
        this.f7187a.mo385j(this.f7188b);
        MediaCodec mediaCodec = this.f7192f;
        InterfaceC0087b.a aVar = this.f7188b;
        mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, aVar.f309d, aVar.f308c, aVar.f307b ? 1 : 0);
        return 2;
    }

    /* renamed from: g */
    public final boolean m7775g(long j10) {
        return mo7768n(this.f7193g, this.f7195i, j10);
    }

    /* renamed from: h */
    public void mo7765h(MediaFormat mediaFormat, MediaFormat mediaFormat2, MediaCodec mediaCodec, MediaCodec mediaCodec2) {
    }

    /* renamed from: i */
    public void mo7776i(MediaFormat mediaFormat, MediaCodec mediaCodec) {
        mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
    }

    /* renamed from: j */
    public void mo7777j(MediaFormat mediaFormat, MediaCodec mediaCodec) {
        mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
    }

    /* renamed from: k */
    public void mo7766k(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    /* renamed from: l */
    public abstract void mo7767l(MediaCodec mediaCodec, int i10, ByteBuffer byteBuffer, long j10, boolean z10);

    /* renamed from: m */
    public void m7778m(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (this.f7198l != null) {
            throw new RuntimeException("Audio output format changed twice.");
        }
        this.f7198l = mediaFormat;
        this.f7189c.mo24402b(this.f7190d, mediaFormat);
    }

    /* renamed from: n */
    public abstract boolean mo7768n(MediaCodec mediaCodec, C5473f c5473f, long j10);

    /* renamed from: o */
    public void m7779o(MediaFormat mediaFormat, MediaCodec mediaCodec) {
        mediaCodec.start();
        this.f7196j = true;
        this.f7194h = new C5473f(mediaCodec);
    }

    /* renamed from: p */
    public void mo7780p(MediaFormat mediaFormat, MediaCodec mediaCodec) {
        mediaCodec.start();
        this.f7197k = true;
        this.f7195i = new C5473f(mediaCodec);
    }

    @Override // p085fc.InterfaceC1902e
    public void release() {
        MediaCodec mediaCodec = this.f7192f;
        if (mediaCodec != null) {
            if (this.f7196j) {
                mediaCodec.stop();
                this.f7196j = false;
            }
            this.f7192f.release();
            this.f7192f = null;
        }
        MediaCodec mediaCodec2 = this.f7193g;
        if (mediaCodec2 != null) {
            if (this.f7197k) {
                mediaCodec2.stop();
                this.f7197k = false;
            }
            this.f7193g.release();
            this.f7193g = null;
        }
    }
}
