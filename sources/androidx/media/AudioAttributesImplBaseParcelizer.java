package androidx.media;

import p362z1.AbstractC5943b;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC5943b abstractC5943b) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1784a = abstractC5943b.m23825p(audioAttributesImplBase.f1784a, 1);
        audioAttributesImplBase.f1785b = abstractC5943b.m23825p(audioAttributesImplBase.f1785b, 2);
        audioAttributesImplBase.f1786c = abstractC5943b.m23825p(audioAttributesImplBase.f1786c, 3);
        audioAttributesImplBase.f1787d = abstractC5943b.m23825p(audioAttributesImplBase.f1787d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC5943b abstractC5943b) {
        abstractC5943b.m23833x(false, false);
        abstractC5943b.m23801F(audioAttributesImplBase.f1784a, 1);
        abstractC5943b.m23801F(audioAttributesImplBase.f1785b, 2);
        abstractC5943b.m23801F(audioAttributesImplBase.f1786c, 3);
        abstractC5943b.m23801F(audioAttributesImplBase.f1787d, 4);
    }
}
