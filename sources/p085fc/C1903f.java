package p085fc;

import ac.InterfaceC0087b;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import ec.InterfaceC1766b;
import java.nio.ByteBuffer;
import p100gc.AbstractC2226f;
import p100gc.C2224d;
import p100gc.C2225e;
import p311vb.EnumC5160d;
import p325wb.C5472e;
import p325wb.C5473f;
import p371zb.InterfaceC6116a;

/* renamed from: fc.f */
/* loaded from: classes.dex */
public class C1903f extends AbstractC1899b {

    /* renamed from: w */
    public static final C5472e f7211w = new C5472e(C1903f.class.getSimpleName());

    /* renamed from: p */
    public C2224d f7212p;

    /* renamed from: q */
    public C2225e f7213q;

    /* renamed from: r */
    public MediaCodec f7214r;

    /* renamed from: s */
    public AbstractC2226f f7215s;

    /* renamed from: t */
    public final InterfaceC1766b f7216t;

    /* renamed from: u */
    public final int f7217u;

    /* renamed from: v */
    public final int f7218v;

    public C1903f(InterfaceC0087b interfaceC0087b, InterfaceC6116a interfaceC6116a, InterfaceC1766b interfaceC1766b, int i10) {
        super(interfaceC0087b, interfaceC6116a, EnumC5160d.VIDEO);
        this.f7216t = interfaceC1766b;
        this.f7217u = interfaceC0087b.getOrientation();
        this.f7218v = i10;
    }

    @Override // p085fc.AbstractC1899b
    /* renamed from: h */
    public void mo7765h(MediaFormat mediaFormat, MediaFormat mediaFormat2, MediaCodec mediaCodec, MediaCodec mediaCodec2) {
        float f10;
        super.mo7765h(mediaFormat, mediaFormat2, mediaCodec, mediaCodec2);
        this.f7215s = AbstractC2226f.m8954b(mediaFormat.getInteger("frame-rate"), mediaFormat2.getInteger("frame-rate"));
        this.f7214r = mediaCodec2;
        boolean z10 = ((this.f7217u + this.f7218v) % 360) % 180 != 0;
        float integer = mediaFormat.getInteger("width") / mediaFormat.getInteger("height");
        float integer2 = (z10 ? mediaFormat2.getInteger("height") : mediaFormat2.getInteger("width")) / (z10 ? mediaFormat2.getInteger("width") : mediaFormat2.getInteger("height"));
        float f11 = 1.0f;
        if (integer > integer2) {
            float f12 = integer / integer2;
            f10 = 1.0f;
            f11 = f12;
        } else {
            f10 = integer < integer2 ? integer2 / integer : 1.0f;
        }
        this.f7212p.m8950k(f11, f10);
    }

    @Override // p085fc.AbstractC1899b
    /* renamed from: i */
    public void mo7776i(MediaFormat mediaFormat, MediaCodec mediaCodec) {
        int integer = mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : 0;
        if (integer == this.f7217u) {
            mediaFormat.setInteger("rotation-degrees", 0);
            C2224d c2224d = new C2224d();
            this.f7212p = c2224d;
            c2224d.m8949j((this.f7217u + this.f7218v) % 360);
            mediaCodec.configure(mediaFormat, this.f7212p.m8947h(), (MediaCrypto) null, 0);
            return;
        }
        throw new RuntimeException("Unexpected difference in rotation. DataSource:" + this.f7217u + " MediaFormat:" + integer);
    }

    @Override // p085fc.AbstractC1899b
    /* renamed from: j */
    public void mo7777j(MediaFormat mediaFormat, MediaCodec mediaCodec) {
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        boolean z10 = this.f7218v % 180 != 0;
        mediaFormat.setInteger("width", z10 ? integer2 : integer);
        if (!z10) {
            integer = integer2;
        }
        mediaFormat.setInteger("height", integer);
        super.mo7777j(mediaFormat, mediaCodec);
    }

    @Override // p085fc.AbstractC1899b
    /* renamed from: l */
    public void mo7767l(MediaCodec mediaCodec, int i10, ByteBuffer byteBuffer, long j10, boolean z10) {
        if (z10) {
            this.f7214r.signalEndOfInputStream();
        } else {
            long mo7065a = this.f7216t.mo7065a(EnumC5160d.VIDEO, j10);
            if (this.f7215s.mo8955c(mo7065a)) {
                mediaCodec.releaseOutputBuffer(i10, true);
                this.f7212p.m8945f();
                this.f7213q.m8951a(mo7065a);
                return;
            }
        }
        mediaCodec.releaseOutputBuffer(i10, false);
    }

    @Override // p085fc.AbstractC1899b
    /* renamed from: n */
    public boolean mo7768n(MediaCodec mediaCodec, C5473f c5473f, long j10) {
        return false;
    }

    @Override // p085fc.AbstractC1899b
    /* renamed from: p */
    public void mo7780p(MediaFormat mediaFormat, MediaCodec mediaCodec) {
        this.f7213q = new C2225e(mediaCodec.createInputSurface());
        super.mo7780p(mediaFormat, mediaCodec);
    }

    @Override // p085fc.AbstractC1899b, p085fc.InterfaceC1902e
    public void release() {
        C2224d c2224d = this.f7212p;
        if (c2224d != null) {
            c2224d.m8948i();
            this.f7212p = null;
        }
        C2225e c2225e = this.f7213q;
        if (c2225e != null) {
            c2225e.m8952b();
            this.f7213q = null;
        }
        super.release();
        this.f7214r = null;
    }
}
