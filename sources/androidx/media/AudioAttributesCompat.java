package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import p362z1.InterfaceC5945d;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC5945d {

    /* renamed from: b */
    public static final SparseIntArray f1776b;

    /* renamed from: c */
    public static boolean f1777c;

    /* renamed from: d */
    public static final int[] f1778d;

    /* renamed from: a */
    public AudioAttributesImpl f1779a;

    /* renamed from: androidx.media.AudioAttributesCompat$a */
    /* loaded from: classes.dex */
    public static class C0371a {

        /* renamed from: a */
        public final AudioAttributesImpl.InterfaceC0372a f1780a;

        public C0371a() {
            AudioAttributesImpl.InterfaceC0372a c0374a;
            if (AudioAttributesCompat.f1777c) {
                c0374a = new AudioAttributesImplBase.C0375a();
            } else {
                int i10 = Build.VERSION.SDK_INT;
                c0374a = i10 >= 26 ? new AudioAttributesImplApi26.C0374a() : i10 >= 21 ? new AudioAttributesImplApi21.C0373a() : new AudioAttributesImplBase.C0375a();
            }
            this.f1780a = c0374a;
        }

        /* renamed from: a */
        public AudioAttributesCompat m1896a() {
            return new AudioAttributesCompat(this.f1780a.mo1898a());
        }

        /* renamed from: b */
        public C0371a m1897b(int i10) {
            this.f1780a.mo1899b(i10);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1776b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f1778d = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f1779a = audioAttributesImpl;
    }

    /* renamed from: a */
    public static int m1893a(boolean z10, int i10, int i11) {
        if ((i10 & 1) == 1) {
            return z10 ? 1 : 7;
        }
        if ((i10 & 4) == 4) {
            return z10 ? 0 : 6;
        }
        switch (i11) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z10 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z10) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i11 + " in audio attributes");
        }
    }

    /* renamed from: b */
    public static String m1894b(int i10) {
        switch (i10) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i10;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    /* renamed from: c */
    public static AudioAttributesCompat m1895c(Object obj) {
        if (f1777c) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj));
        }
        if (i10 >= 21) {
            return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.f1779a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f1779a;
        return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public int hashCode() {
        return this.f1779a.hashCode();
    }

    public String toString() {
        return this.f1779a.toString();
    }
}
