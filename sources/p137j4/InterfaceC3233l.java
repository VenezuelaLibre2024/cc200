package p137j4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p264s3.C4463m1;
import p304v3.C5106c;

/* renamed from: j4.l */
/* loaded from: classes.dex */
public interface InterfaceC3233l {

    /* renamed from: j4.l$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C3235n f11226a;

        /* renamed from: b */
        public final MediaFormat f11227b;

        /* renamed from: c */
        public final C4463m1 f11228c;

        /* renamed from: d */
        public final Surface f11229d;

        /* renamed from: e */
        public final MediaCrypto f11230e;

        /* renamed from: f */
        public final int f11231f;

        public a(C3235n c3235n, MediaFormat mediaFormat, C4463m1 c4463m1, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f11226a = c3235n;
            this.f11227b = mediaFormat;
            this.f11228c = c4463m1;
            this.f11229d = surface;
            this.f11230e = mediaCrypto;
            this.f11231f = i10;
        }

        /* renamed from: a */
        public static a m11565a(C3235n c3235n, MediaFormat mediaFormat, C4463m1 c4463m1, MediaCrypto mediaCrypto) {
            return new a(c3235n, mediaFormat, c4463m1, null, mediaCrypto, 0);
        }

        /* renamed from: b */
        public static a m11566b(C3235n c3235n, MediaFormat mediaFormat, C4463m1 c4463m1, Surface surface, MediaCrypto mediaCrypto) {
            return new a(c3235n, mediaFormat, c4463m1, surface, mediaCrypto, 0);
        }
    }

    /* renamed from: j4.l$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        InterfaceC3233l mo11513a(a aVar);
    }

    /* renamed from: j4.l$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo11567a(InterfaceC3233l interfaceC3233l, long j10, long j11);
    }

    /* renamed from: a */
    boolean mo11493a();

    /* renamed from: b */
    MediaFormat mo11494b();

    /* renamed from: c */
    void mo11495c(int i10, int i11, C5106c c5106c, long j10, int i12);

    /* renamed from: d */
    void mo11496d(Bundle bundle);

    /* renamed from: e */
    void mo11497e(int i10, long j10);

    /* renamed from: f */
    int mo11498f();

    void flush();

    /* renamed from: g */
    int mo11499g(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: h */
    void mo11500h(int i10, boolean z10);

    /* renamed from: i */
    void mo11501i(int i10);

    /* renamed from: j */
    void mo11502j(c cVar, Handler handler);

    /* renamed from: k */
    ByteBuffer mo11503k(int i10);

    /* renamed from: l */
    void mo11504l(Surface surface);

    /* renamed from: m */
    void mo11505m(int i10, int i11, int i12, long j10, int i13);

    /* renamed from: n */
    ByteBuffer mo11506n(int i10);

    void release();
}
