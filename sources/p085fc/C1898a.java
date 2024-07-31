package p085fc;

import ac.InterfaceC0087b;
import android.media.MediaCodec;
import android.media.MediaFormat;
import ec.InterfaceC1766b;
import java.nio.ByteBuffer;
import p054dc.InterfaceC1610a;
import p100gc.C2223c;
import p311vb.EnumC5160d;
import p325wb.C5473f;
import p357yb.InterfaceC5905a;
import p371zb.InterfaceC6116a;

/* renamed from: fc.a */
/* loaded from: classes.dex */
public class C1898a extends AbstractC1899b {

    /* renamed from: p */
    public InterfaceC1766b f7181p;

    /* renamed from: q */
    public InterfaceC1610a f7182q;

    /* renamed from: r */
    public InterfaceC5905a f7183r;

    /* renamed from: s */
    public C2223c f7184s;

    /* renamed from: t */
    public MediaCodec f7185t;

    /* renamed from: u */
    public MediaFormat f7186u;

    public C1898a(InterfaceC0087b interfaceC0087b, InterfaceC6116a interfaceC6116a, InterfaceC1766b interfaceC1766b, InterfaceC1610a interfaceC1610a, InterfaceC5905a interfaceC5905a) {
        super(interfaceC0087b, interfaceC6116a, EnumC5160d.AUDIO);
        this.f7181p = interfaceC1766b;
        this.f7182q = interfaceC1610a;
        this.f7183r = interfaceC5905a;
    }

    @Override // p085fc.AbstractC1899b
    /* renamed from: h */
    public void mo7765h(MediaFormat mediaFormat, MediaFormat mediaFormat2, MediaCodec mediaCodec, MediaCodec mediaCodec2) {
        super.mo7765h(mediaFormat, mediaFormat2, mediaCodec, mediaCodec2);
        this.f7185t = mediaCodec2;
        this.f7186u = mediaFormat2;
    }

    @Override // p085fc.AbstractC1899b
    /* renamed from: k */
    public void mo7766k(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        super.mo7766k(mediaCodec, mediaFormat);
        this.f7184s = new C2223c(mediaCodec, mediaFormat, this.f7185t, this.f7186u, this.f7181p, this.f7182q, this.f7183r);
        this.f7185t = null;
        this.f7186u = null;
        this.f7181p = null;
        this.f7182q = null;
        this.f7183r = null;
    }

    @Override // p085fc.AbstractC1899b
    /* renamed from: l */
    public void mo7767l(MediaCodec mediaCodec, int i10, ByteBuffer byteBuffer, long j10, boolean z10) {
        this.f7184s.m8934a(i10, byteBuffer, j10, z10);
    }

    @Override // p085fc.AbstractC1899b
    /* renamed from: n */
    public boolean mo7768n(MediaCodec mediaCodec, C5473f c5473f, long j10) {
        C2223c c2223c = this.f7184s;
        if (c2223c == null) {
            return false;
        }
        return c2223c.m8937d(c5473f, j10);
    }
}
