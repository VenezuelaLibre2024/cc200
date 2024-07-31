package p137j4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import p109h7.InterfaceC2438u;
import p137j4.C3223b;
import p137j4.InterfaceC3233l;
import p222p5.C4035k0;
import p304v3.C5106c;

/* renamed from: j4.b */
/* loaded from: classes.dex */
public final class C3223b implements InterfaceC3233l {

    /* renamed from: a */
    public final MediaCodec f11173a;

    /* renamed from: b */
    public final C3228g f11174b;

    /* renamed from: c */
    public final C3226e f11175c;

    /* renamed from: d */
    public final boolean f11176d;

    /* renamed from: e */
    public boolean f11177e;

    /* renamed from: f */
    public int f11178f;

    /* renamed from: j4.b$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC3233l.b {

        /* renamed from: a */
        public final InterfaceC2438u<HandlerThread> f11179a;

        /* renamed from: b */
        public final InterfaceC2438u<HandlerThread> f11180b;

        /* renamed from: c */
        public final boolean f11181c;

        public b(final int i10, boolean z10) {
            this(new InterfaceC2438u() { // from class: j4.c
                @Override // p109h7.InterfaceC2438u
                public final Object get() {
                    HandlerThread m11511e;
                    m11511e = C3223b.b.m11511e(i10);
                    return m11511e;
                }
            }, new InterfaceC2438u() { // from class: j4.d
                @Override // p109h7.InterfaceC2438u
                public final Object get() {
                    HandlerThread m11512f;
                    m11512f = C3223b.b.m11512f(i10);
                    return m11512f;
                }
            }, z10);
        }

        public b(InterfaceC2438u<HandlerThread> interfaceC2438u, InterfaceC2438u<HandlerThread> interfaceC2438u2, boolean z10) {
            this.f11179a = interfaceC2438u;
            this.f11180b = interfaceC2438u2;
            this.f11181c = z10;
        }

        /* renamed from: e */
        public static /* synthetic */ HandlerThread m11511e(int i10) {
            return new HandlerThread(C3223b.m11489s(i10));
        }

        /* renamed from: f */
        public static /* synthetic */ HandlerThread m11512f(int i10) {
            return new HandlerThread(C3223b.m11490t(i10));
        }

        @Override // p137j4.InterfaceC3233l.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C3223b mo11513a(InterfaceC3233l.a aVar) {
            MediaCodec mediaCodec;
            String str = aVar.f11226a.f11234a;
            C3223b c3223b = null;
            try {
                C4035k0.m15372a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    C3223b c3223b2 = new C3223b(mediaCodec, this.f11179a.get(), this.f11180b.get(), this.f11181c);
                    try {
                        C4035k0.m15374c();
                        c3223b2.m11507v(aVar.f11227b, aVar.f11229d, aVar.f11230e, aVar.f11231f);
                        return c3223b2;
                    } catch (Exception e10) {
                        e = e10;
                        c3223b = c3223b2;
                        if (c3223b != null) {
                            c3223b.release();
                        } else if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                mediaCodec = null;
            }
        }
    }

    public C3223b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f11173a = mediaCodec;
        this.f11174b = new C3228g(handlerThread);
        this.f11175c = new C3226e(mediaCodec, handlerThread2);
        this.f11176d = z10;
        this.f11178f = 0;
    }

    /* renamed from: s */
    public static String m11489s(int i10) {
        return m11491u(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* renamed from: t */
    public static String m11490t(int i10) {
        return m11491u(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* renamed from: u */
    public static String m11491u(int i10, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            str2 = "Audio";
        } else if (i10 == 2) {
            str2 = "Video";
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            str2 = ")";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m11492w(InterfaceC3233l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
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
        return this.f11174b.m11540g();
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: c */
    public void mo11495c(int i10, int i11, C5106c c5106c, long j10, int i12) {
        this.f11175c.m11529n(i10, i11, c5106c, j10, i12);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: d */
    public void mo11496d(Bundle bundle) {
        m11508x();
        this.f11173a.setParameters(bundle);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: e */
    public void mo11497e(int i10, long j10) {
        this.f11173a.releaseOutputBuffer(i10, j10);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: f */
    public int mo11498f() {
        this.f11175c.m11527l();
        return this.f11174b.m11536c();
    }

    @Override // p137j4.InterfaceC3233l
    public void flush() {
        this.f11175c.m11525i();
        this.f11173a.flush();
        this.f11174b.m11538e();
        this.f11173a.start();
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: g */
    public int mo11499g(MediaCodec.BufferInfo bufferInfo) {
        this.f11175c.m11527l();
        return this.f11174b.m11537d(bufferInfo);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: h */
    public void mo11500h(int i10, boolean z10) {
        this.f11173a.releaseOutputBuffer(i10, z10);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: i */
    public void mo11501i(int i10) {
        m11508x();
        this.f11173a.setVideoScalingMode(i10);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: j */
    public void mo11502j(final InterfaceC3233l.c cVar, Handler handler) {
        m11508x();
        this.f11173a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: j4.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                C3223b.this.m11492w(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: k */
    public ByteBuffer mo11503k(int i10) {
        return this.f11173a.getInputBuffer(i10);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: l */
    public void mo11504l(Surface surface) {
        m11508x();
        this.f11173a.setOutputSurface(surface);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: m */
    public void mo11505m(int i10, int i11, int i12, long j10, int i13) {
        this.f11175c.m11528m(i10, i11, i12, j10, i13);
    }

    @Override // p137j4.InterfaceC3233l
    /* renamed from: n */
    public ByteBuffer mo11506n(int i10) {
        return this.f11173a.getOutputBuffer(i10);
    }

    @Override // p137j4.InterfaceC3233l
    public void release() {
        try {
            if (this.f11178f == 1) {
                this.f11175c.m11530p();
                this.f11174b.m11548o();
            }
            this.f11178f = 2;
        } finally {
            if (!this.f11177e) {
                this.f11173a.release();
                this.f11177e = true;
            }
        }
    }

    /* renamed from: v */
    public final void m11507v(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f11174b.m11541h(this.f11173a);
        C4035k0.m15372a("configureCodec");
        this.f11173a.configure(mediaFormat, surface, mediaCrypto, i10);
        C4035k0.m15374c();
        this.f11175c.m11531q();
        C4035k0.m15372a("startCodec");
        this.f11173a.start();
        C4035k0.m15374c();
        this.f11178f = 1;
    }

    /* renamed from: x */
    public final void m11508x() {
        if (this.f11176d) {
            try {
                this.f11175c.m11532r();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }
}
