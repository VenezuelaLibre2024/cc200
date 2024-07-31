package p311vb;

import ac.InterfaceC0087b;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import p325wb.C5473f;

/* renamed from: vb.b */
/* loaded from: classes.dex */
public class C5158b {

    /* renamed from: vb.b$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19441a;

        static {
            int[] iArr = new int[EnumC5160d.values().length];
            f19441a = iArr;
            try {
                iArr[EnumC5160d.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19441a[EnumC5160d.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: a */
    public final MediaFormat m20878a(InterfaceC0087b interfaceC0087b, EnumC5160d enumC5160d, MediaFormat mediaFormat) {
        interfaceC0087b.mo382g(enumC5160d);
        try {
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
            MediaFormat mediaFormat2 = null;
            createDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
            createDecoderByType.start();
            C5473f c5473f = new C5473f(createDecoderByType);
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            InterfaceC0087b.a aVar = new InterfaceC0087b.a();
            while (mediaFormat2 == null) {
                mediaFormat2 = m20879b(enumC5160d, interfaceC0087b, aVar, createDecoderByType, c5473f, bufferInfo);
            }
            interfaceC0087b.mo386k();
            return mediaFormat2;
        } catch (IOException e10) {
            throw new RuntimeException("Can't decode this track", e10);
        }
    }

    /* renamed from: b */
    public final MediaFormat m20879b(EnumC5160d enumC5160d, InterfaceC0087b interfaceC0087b, InterfaceC0087b.a aVar, MediaCodec mediaCodec, C5473f c5473f, MediaCodec.BufferInfo bufferInfo) {
        MediaFormat m20880c = m20880c(mediaCodec, c5473f, bufferInfo);
        if (m20880c != null) {
            return m20880c;
        }
        m20881d(enumC5160d, interfaceC0087b, aVar, mediaCodec, c5473f);
        return null;
    }

    /* renamed from: c */
    public final MediaFormat m20880c(MediaCodec mediaCodec, C5473f c5473f, MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
        if (dequeueOutputBuffer == -3) {
            c5473f.m21692c();
            return m20880c(mediaCodec, c5473f, bufferInfo);
        }
        if (dequeueOutputBuffer == -2) {
            return mediaCodec.getOutputFormat();
        }
        if (dequeueOutputBuffer != -1) {
            mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
        }
        return null;
    }

    /* renamed from: d */
    public final void m20881d(EnumC5160d enumC5160d, InterfaceC0087b interfaceC0087b, InterfaceC0087b.a aVar, MediaCodec mediaCodec, C5473f c5473f) {
        if (!interfaceC0087b.mo387l(enumC5160d)) {
            throw new RuntimeException("This should never happen!");
        }
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
        if (dequeueInputBuffer < 0) {
            return;
        }
        aVar.f306a = c5473f.m21690a(dequeueInputBuffer);
        interfaceC0087b.mo385j(aVar);
        mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, aVar.f309d, aVar.f308c, aVar.f307b ? 1 : 0);
    }

    /* renamed from: e */
    public final boolean m20882e(EnumC5160d enumC5160d, MediaFormat mediaFormat) {
        if (enumC5160d == EnumC5160d.VIDEO && !mediaFormat.containsKey("frame-rate")) {
            mediaFormat.setInteger("frame-rate", 24);
        }
        int i10 = a.f19441a[enumC5160d.ordinal()];
        if (i10 == 1) {
            return m20883f(mediaFormat);
        }
        if (i10 == 2) {
            return m20884g(mediaFormat);
        }
        throw new RuntimeException("Unexpected type: " + enumC5160d);
    }

    /* renamed from: f */
    public final boolean m20883f(MediaFormat mediaFormat) {
        return mediaFormat.containsKey("mime") && mediaFormat.containsKey("channel-count") && mediaFormat.containsKey("sample-rate");
    }

    /* renamed from: g */
    public final boolean m20884g(MediaFormat mediaFormat) {
        return mediaFormat.containsKey("mime") && mediaFormat.containsKey("height") && mediaFormat.containsKey("width") && mediaFormat.containsKey("frame-rate");
    }

    /* renamed from: h */
    public MediaFormat m20885h(InterfaceC0087b interfaceC0087b, EnumC5160d enumC5160d, MediaFormat mediaFormat) {
        StringBuilder sb2;
        String str;
        if (m20882e(enumC5160d, mediaFormat)) {
            return mediaFormat;
        }
        MediaFormat m20878a = m20878a(interfaceC0087b, enumC5160d, mediaFormat);
        if (m20882e(enumC5160d, m20878a)) {
            return m20878a;
        }
        String str2 = "Could not get a complete format! hasMimeType:" + m20878a.containsKey("mime");
        if (enumC5160d != EnumC5160d.VIDEO) {
            if (enumC5160d == EnumC5160d.AUDIO) {
                String str3 = str2 + " hasChannels:" + m20878a.containsKey("channel-count");
                sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(" hasSampleRate:");
                str = "sample-rate";
            }
            throw new RuntimeException(str2);
        }
        String str4 = (str2 + " hasWidth:" + m20878a.containsKey("width")) + " hasHeight:" + m20878a.containsKey("height");
        sb2 = new StringBuilder();
        sb2.append(str4);
        sb2.append(" hasFrameRate:");
        str = "frame-rate";
        sb2.append(m20878a.containsKey(str));
        str2 = sb2.toString();
        throw new RuntimeException(str2);
    }
}
