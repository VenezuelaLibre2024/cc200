package p371zb;

import android.media.MediaFormat;
import p311vb.EnumC5160d;
import p325wb.C5468a;
import p325wb.C5469b;
import p325wb.C5472e;

/* renamed from: zb.c */
/* loaded from: classes.dex */
public class C6118c {

    /* renamed from: a */
    public static final C5472e f22667a = new C5472e(C6118c.class.getSimpleName());

    /* renamed from: a */
    public final void m24413a(MediaFormat mediaFormat) {
        String string = mediaFormat.getString("mime");
        if ("audio/mp4a-latm".equals(string)) {
            return;
        }
        throw new C6119d("Audio codecs other than AAC is not supported, actual mime type: " + string);
    }

    /* renamed from: b */
    public void m24414b(EnumC5160d enumC5160d, MediaFormat mediaFormat) {
        if (enumC5160d == EnumC5160d.VIDEO) {
            m24415c(mediaFormat);
        } else if (enumC5160d == EnumC5160d.AUDIO) {
            m24413a(mediaFormat);
        }
    }

    /* renamed from: c */
    public final void m24415c(MediaFormat mediaFormat) {
        String string = mediaFormat.getString("mime");
        if (!"video/avc".equals(string)) {
            throw new C6119d("Video codecs other than AVC is not supported, actual mime type: " + string);
        }
        byte m21675a = C5469b.m21675a(C5468a.m21673a(mediaFormat));
        String m21676b = C5469b.m21676b(m21675a);
        if (m21675a == 66) {
            f22667a.m21682b("Output H.264 profile: " + m21676b);
            return;
        }
        f22667a.m21688i("Output H.264 profile: " + m21676b + ". This might not be supported.");
    }
}
