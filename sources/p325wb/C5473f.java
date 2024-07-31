package p325wb;

import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;

/* renamed from: wb.f */
/* loaded from: classes.dex */
public class C5473f {

    /* renamed from: a */
    public final MediaCodec f20362a;

    /* renamed from: b */
    public final ByteBuffer[] f20363b;

    /* renamed from: c */
    public ByteBuffer[] f20364c;

    public C5473f(MediaCodec mediaCodec) {
        this.f20362a = mediaCodec;
        if (Build.VERSION.SDK_INT < 21) {
            this.f20363b = mediaCodec.getInputBuffers();
            this.f20364c = mediaCodec.getOutputBuffers();
        } else {
            this.f20364c = null;
            this.f20363b = null;
        }
    }

    /* renamed from: a */
    public ByteBuffer m21690a(int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f20362a.getInputBuffer(i10);
        }
        ByteBuffer byteBuffer = this.f20363b[i10];
        byteBuffer.clear();
        return byteBuffer;
    }

    /* renamed from: b */
    public ByteBuffer m21691b(int i10) {
        return Build.VERSION.SDK_INT >= 21 ? this.f20362a.getOutputBuffer(i10) : this.f20364c[i10];
    }

    /* renamed from: c */
    public void m21692c() {
        if (Build.VERSION.SDK_INT < 21) {
            this.f20364c = this.f20362a.getOutputBuffers();
        }
    }
}
