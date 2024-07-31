package androidx.media;

import android.media.AudioAttributes;
import p362z1.AbstractC5943b;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC5943b abstractC5943b) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f1781a = (AudioAttributes) abstractC5943b.m23827r(audioAttributesImplApi21.f1781a, 1);
        audioAttributesImplApi21.f1782b = abstractC5943b.m23825p(audioAttributesImplApi21.f1782b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC5943b abstractC5943b) {
        abstractC5943b.m23833x(false, false);
        abstractC5943b.m23803H(audioAttributesImplApi21.f1781a, 1);
        abstractC5943b.m23801F(audioAttributesImplApi21.f1782b, 2);
    }
}
