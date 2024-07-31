package androidx.media;

import android.media.AudioAttributes;
import p362z1.AbstractC5943b;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC5943b abstractC5943b) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f1781a = (AudioAttributes) abstractC5943b.m23827r(audioAttributesImplApi26.f1781a, 1);
        audioAttributesImplApi26.f1782b = abstractC5943b.m23825p(audioAttributesImplApi26.f1782b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC5943b abstractC5943b) {
        abstractC5943b.m23833x(false, false);
        abstractC5943b.m23803H(audioAttributesImplApi26.f1781a, 1);
        abstractC5943b.m23801F(audioAttributesImplApi26.f1782b, 2);
    }
}
