package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImplApi21;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    /* renamed from: androidx.media.AudioAttributesImplApi26$a */
    /* loaded from: classes.dex */
    public static class C0374a extends AudioAttributesImplApi21.C0373a {
        @Override // androidx.media.AudioAttributesImplApi21.C0373a, androidx.media.AudioAttributesImpl.InterfaceC0372a
        /* renamed from: a */
        public AudioAttributesImpl mo1898a() {
            return new AudioAttributesImplApi26(this.f1783a.build());
        }
    }

    public AudioAttributesImplApi26() {
    }

    public AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
