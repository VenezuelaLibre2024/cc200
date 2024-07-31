package androidx.media;

import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f1784a;

    /* renamed from: b */
    public int f1785b;

    /* renamed from: c */
    public int f1786c;

    /* renamed from: d */
    public int f1787d;

    /* renamed from: androidx.media.AudioAttributesImplBase$a */
    /* loaded from: classes.dex */
    public static class C0375a implements AudioAttributesImpl.InterfaceC0372a {

        /* renamed from: a */
        public int f1788a = 0;

        /* renamed from: b */
        public int f1789b = 0;

        /* renamed from: c */
        public int f1790c = 0;

        /* renamed from: d */
        public int f1791d = -1;

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0372a
        /* renamed from: a */
        public AudioAttributesImpl mo1898a() {
            return new AudioAttributesImplBase(this.f1789b, this.f1790c, this.f1788a, this.f1791d);
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0372a
        /* renamed from: c */
        public C0375a mo1899b(int i10) {
            if (i10 == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.f1791d = i10;
            return this;
        }
    }

    public AudioAttributesImplBase() {
        this.f1784a = 0;
        this.f1785b = 0;
        this.f1786c = 0;
        this.f1787d = -1;
    }

    public AudioAttributesImplBase(int i10, int i11, int i12, int i13) {
        this.f1784a = 0;
        this.f1785b = 0;
        this.f1786c = 0;
        this.f1787d = -1;
        this.f1785b = i10;
        this.f1786c = i11;
        this.f1784a = i12;
        this.f1787d = i13;
    }

    /* renamed from: a */
    public int m1901a() {
        return this.f1785b;
    }

    /* renamed from: b */
    public int m1902b() {
        int i10 = this.f1786c;
        int m1903c = m1903c();
        if (m1903c == 6) {
            i10 |= 4;
        } else if (m1903c == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    /* renamed from: c */
    public int m1903c() {
        int i10 = this.f1787d;
        return i10 != -1 ? i10 : AudioAttributesCompat.m1893a(false, this.f1786c, this.f1784a);
    }

    /* renamed from: d */
    public int m1904d() {
        return this.f1784a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f1785b == audioAttributesImplBase.m1901a() && this.f1786c == audioAttributesImplBase.m1902b() && this.f1784a == audioAttributesImplBase.m1904d() && this.f1787d == audioAttributesImplBase.f1787d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1785b), Integer.valueOf(this.f1786c), Integer.valueOf(this.f1784a), Integer.valueOf(this.f1787d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f1787d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f1787d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.m1894b(this.f1784a));
        sb2.append(" content=");
        sb2.append(this.f1785b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f1786c).toUpperCase());
        return sb2.toString();
    }
}
