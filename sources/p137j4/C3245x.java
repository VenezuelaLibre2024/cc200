package p137j4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import p137j4.InterfaceC3233l;
import p222p5.C4014a;
import p222p5.C4035k0;
import p222p5.C4041n0;
import p304v3.C5106c;

/* renamed from: j4.x */
/* loaded from: classes.dex */
public final class C3245x implements InterfaceC3233l {

    /* renamed from: a */
    public final MediaCodec f11339a;

    /* renamed from: b */
    public ByteBuffer[] f11340b;

    /* renamed from: c */
    public ByteBuffer[] f11341c;

    /* renamed from: j4.x$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC3233l.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [j4.x$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // p137j4.InterfaceC3233l.b
        /* renamed from: a */
        public InterfaceC3233l mo11513a(InterfaceC3233l.a aVar) {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec m11745b = m11745b(aVar);
                try {
                    C4035k0.m15372a("configureCodec");
                    m11745b.configure(aVar.f11227b, aVar.f11229d, aVar.f11230e, aVar.f11231f);
                    C4035k0.m15374c();
                    C4035k0.m15372a("startCodec");
                    m11745b.start();
                    C4035k0.m15374c();
                    return new C3245x(m11745b);
                } catch (IOException | RuntimeException e10) {
                    e = e10;
                    mediaCodec = m11745b;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (RuntimeException e12) {
                e = e12;
            }
        }

        /* renamed from: b */
        public MediaCodec m11745b(InterfaceC3233l.a aVar) {
            C4014a.m15199e(aVar.f11226a);
            String str = aVar.f11226a.f11234a;
            C4035k0.m15372a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            C4035k0.m15374c();
            return createByCodecName;
        }
    }

    public C3245x(MediaCodec mediaCodec) {
        this.f11339a = mediaCodec;
        if (C4041n0.f14513a < 21) {
            this.f11340b = mediaCodec.getInputBuffers();
            this.f11341c = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m11744p(InterfaceC3233l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.mo11567a(this, j10, j11);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: a */
    public boolean mo11493a() {
        return false;
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: b */
    public MediaFormat mo11494b() {
        return this.f11339a.getOutputFormat();
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: c */
    public void mo11495c(int i10, int i11, C5106c c5106c, long j10, int i12) {
        this.f11339a.queueSecureInputBuffer(i10, i11, c5106c.m20753a(), j10, i12);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: d */
    public void mo11496d(Bundle bundle) {
        this.f11339a.setParameters(bundle);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: e */
    public void mo11497e(int i10, long j10) {
        this.f11339a.releaseOutputBuffer(i10, j10);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: f */
    public int mo11498f() {
        return this.f11339a.dequeueInputBuffer(0L);
    }

    @Override // p137j4.InterfaceC3233l
    public void flush() {
        this.f11339a.flush();
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: g */
    public int mo11499g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f11339a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && C4041n0.f14513a < 21) {
                this.f11341c = this.f11339a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: h */
    public void mo11500h(int i10, boolean z10) {
        this.f11339a.releaseOutputBuffer(i10, z10);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: i */
    public void mo11501i(int i10) {
        this.f11339a.setVideoScalingMode(i10);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: j */
    public void mo11502j(final InterfaceC3233l.c cVar, Handler handler) {
        this.f11339a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: j4.w
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                C3245x.this.m11744p(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: k */
    public ByteBuffer mo11503k(int i10) {
        return C4041n0.f14513a >= 21 ? this.f11339a.getInputBuffer(i10) : ((ByteBuffer[]) C4041n0.m15463j(this.f11340b))[i10];
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: l */
    public void mo11504l(Surface surface) {
        this.f11339a.setOutputSurface(surface);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: m */
    public void mo11505m(int i10, int i11, int i12, long j10, int i13) {
        this.f11339a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: n */
    public ByteBuffer mo11506n(int i10) {
        return C4041n0.f14513a >= 21 ? this.f11339a.getOutputBuffer(i10) : ((ByteBuffer[]) C4041n0.m15463j(this.f11341c))[i10];
    }

    @Override // p137j4.InterfaceC3233l
    public void release() {
        this.f11340b = null;
        this.f11341c = null;
        this.f11339a.release();
    }
}
