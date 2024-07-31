package p371zb;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import p311vb.EnumC5159c;
import p311vb.EnumC5160d;
import p325wb.C5472e;
import p325wb.C5474g;

/* renamed from: zb.b */
/* loaded from: classes.dex */
public class C6117b implements InterfaceC6116a {

    /* renamed from: i */
    public static final C5472e f22654i = new C5472e(C6117b.class.getSimpleName());

    /* renamed from: a */
    public boolean f22655a;

    /* renamed from: b */
    public final MediaMuxer f22656b;

    /* renamed from: c */
    public final List<b> f22657c;

    /* renamed from: d */
    public ByteBuffer f22658d;

    /* renamed from: e */
    public C5474g<EnumC5159c> f22659e;

    /* renamed from: f */
    public C5474g<MediaFormat> f22660f;

    /* renamed from: g */
    public C5474g<Integer> f22661g;

    /* renamed from: h */
    public final C6118c f22662h;

    /* renamed from: zb.b$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final EnumC5160d f22663a;

        /* renamed from: b */
        public final int f22664b;

        /* renamed from: c */
        public final long f22665c;

        /* renamed from: d */
        public final int f22666d;

        public b(EnumC5160d enumC5160d, MediaCodec.BufferInfo bufferInfo) {
            this.f22663a = enumC5160d;
            this.f22664b = bufferInfo.size;
            this.f22665c = bufferInfo.presentationTimeUs;
            this.f22666d = bufferInfo.flags;
        }
    }

    public C6117b(String str) {
        this(str, 0);
    }

    public C6117b(String str, int i10) {
        this.f22655a = false;
        this.f22657c = new ArrayList();
        this.f22659e = new C5474g<>();
        this.f22660f = new C5474g<>();
        this.f22661g = new C5474g<>();
        this.f22662h = new C6118c();
        try {
            this.f22656b = new MediaMuxer(str, i10);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // p371zb.InterfaceC6116a
    /* renamed from: a */
    public void mo24401a(EnumC5160d enumC5160d, EnumC5159c enumC5159c) {
        this.f22659e.m21700h(enumC5160d, enumC5159c);
    }

    @Override // p371zb.InterfaceC6116a
    /* renamed from: b */
    public void mo24402b(EnumC5160d enumC5160d, MediaFormat mediaFormat) {
        if (this.f22659e.m21697e(enumC5160d) == EnumC5159c.COMPRESSING) {
            this.f22662h.m24414b(enumC5160d, mediaFormat);
        }
        this.f22660f.m21700h(enumC5160d, mediaFormat);
        m24408h();
    }

    @Override // p371zb.InterfaceC6116a
    /* renamed from: c */
    public void mo24403c(EnumC5160d enumC5160d, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f22655a) {
            this.f22656b.writeSampleData(this.f22661g.m21697e(enumC5160d).intValue(), byteBuffer, bufferInfo);
        } else {
            m24407g(enumC5160d, byteBuffer, bufferInfo);
        }
    }

    @Override // p371zb.InterfaceC6116a
    /* renamed from: d */
    public void mo24404d(int i10) {
        this.f22656b.setOrientationHint(i10);
    }

    @Override // p371zb.InterfaceC6116a
    /* renamed from: e */
    public void mo24405e(double d10, double d11) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f22656b.setLocation((float) d10, (float) d11);
        }
    }

    /* renamed from: f */
    public final void m24406f() {
        if (this.f22657c.isEmpty()) {
            return;
        }
        this.f22658d.flip();
        f22654i.m21682b("Output format determined, writing pending data into the muxer. samples:" + this.f22657c.size() + " bytes:" + this.f22658d.limit());
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int i10 = 0;
        for (b bVar : this.f22657c) {
            bufferInfo.set(i10, bVar.f22664b, bVar.f22665c, bVar.f22666d);
            mo24403c(bVar.f22663a, this.f22658d, bufferInfo);
            i10 += bVar.f22664b;
        }
        this.f22657c.clear();
        this.f22658d = null;
    }

    /* renamed from: g */
    public final void m24407g(EnumC5160d enumC5160d, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f22658d == null) {
            this.f22658d = ByteBuffer.allocateDirect(65536).order(ByteOrder.nativeOrder());
        }
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        this.f22658d.put(byteBuffer);
        this.f22657c.add(new b(enumC5160d, bufferInfo));
    }

    /* renamed from: h */
    public final void m24408h() {
        if (this.f22655a) {
            return;
        }
        C5474g<EnumC5159c> c5474g = this.f22659e;
        EnumC5160d enumC5160d = EnumC5160d.VIDEO;
        boolean m20886b = c5474g.m21697e(enumC5160d).m20886b();
        C5474g<EnumC5159c> c5474g2 = this.f22659e;
        EnumC5160d enumC5160d2 = EnumC5160d.AUDIO;
        boolean m20886b2 = c5474g2.m21697e(enumC5160d2).m20886b();
        MediaFormat m21693a = this.f22660f.m21693a(enumC5160d);
        MediaFormat m21693a2 = this.f22660f.m21693a(enumC5160d2);
        boolean z10 = (m21693a == null && m20886b) ? false : true;
        boolean z11 = (m21693a2 == null && m20886b2) ? false : true;
        if (z10 && z11) {
            if (m20886b) {
                int addTrack = this.f22656b.addTrack(m21693a);
                this.f22661g.m21700h(enumC5160d, Integer.valueOf(addTrack));
                f22654i.m21686g("Added track #" + addTrack + " with " + m21693a.getString("mime") + " to muxer");
            }
            if (m20886b2) {
                int addTrack2 = this.f22656b.addTrack(m21693a2);
                this.f22661g.m21700h(enumC5160d2, Integer.valueOf(addTrack2));
                f22654i.m21686g("Added track #" + addTrack2 + " with " + m21693a2.getString("mime") + " to muxer");
            }
            this.f22656b.start();
            this.f22655a = true;
            m24406f();
        }
    }

    @Override // p371zb.InterfaceC6116a
    public void release() {
        try {
            this.f22656b.release();
        } catch (Exception e10) {
            f22654i.m21689j("Failed to release the muxer.", e10);
        }
    }

    @Override // p371zb.InterfaceC6116a
    public void stop() {
        this.f22656b.stop();
    }
}
