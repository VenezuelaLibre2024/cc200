package androidx.media;

import p362z1.AbstractC5943b;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC5943b abstractC5943b) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f1779a = (AudioAttributesImpl) abstractC5943b.m23831v(audioAttributesCompat.f1779a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC5943b abstractC5943b) {
        abstractC5943b.m23833x(false, false);
        abstractC5943b.m23808M(audioAttributesCompat.f1779a, 1);
    }
}
