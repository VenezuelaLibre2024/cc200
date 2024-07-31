package p371zb;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import p311vb.EnumC5159c;
import p311vb.EnumC5160d;

/* renamed from: zb.a */
/* loaded from: classes.dex */
public interface InterfaceC6116a {
    /* renamed from: a */
    void mo24401a(EnumC5160d enumC5160d, EnumC5159c enumC5159c);

    /* renamed from: b */
    void mo24402b(EnumC5160d enumC5160d, MediaFormat mediaFormat);

    /* renamed from: c */
    void mo24403c(EnumC5160d enumC5160d, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    /* renamed from: d */
    void mo24404d(int i10);

    /* renamed from: e */
    void mo24405e(double d10, double d11);

    void release();

    void stop();
}
