package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f1781a;

    /* renamed from: b */
    public int f1782b;

    /* renamed from: androidx.media.AudioAttributesImplApi21$a */
    /* loaded from: classes.dex */
    public static class C0373a implements AudioAttributesImpl.InterfaceC0372a {

        /* renamed from: a */
        public final AudioAttributes.Builder f1783a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0372a
        /* renamed from: a */
        public AudioAttributesImpl mo1898a() {
            return new AudioAttributesImplApi21(this.f1783a.build());
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0372a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0373a mo1899b(int i10) {
            this.f1783a.setLegacyStreamType(i10);
            return this;
        }
    }

    public AudioAttributesImplApi21() {
        this.f1782b = -1;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f1782b = -1;
        this.f1781a = audioAttributes;
        this.f1782b = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f1781a.equals(((AudioAttributesImplApi21) obj).f1781a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1781a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1781a;
    }
}
