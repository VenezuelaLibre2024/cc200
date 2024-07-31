package p264s3;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4046r;
import p264s3.C4416d;
import p289u3.C4813e;

/* renamed from: s3.d */
/* loaded from: classes.dex */
public final class C4416d {

    /* renamed from: a */
    public final AudioManager f16214a;

    /* renamed from: b */
    public final a f16215b;

    /* renamed from: c */
    public b f16216c;

    /* renamed from: d */
    public C4813e f16217d;

    /* renamed from: f */
    public int f16219f;

    /* renamed from: h */
    public AudioFocusRequest f16221h;

    /* renamed from: i */
    public boolean f16222i;

    /* renamed from: g */
    public float f16220g = 1.0f;

    /* renamed from: e */
    public int f16218e = 0;

    /* renamed from: s3.d$a */
    /* loaded from: classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        public final Handler f16223a;

        public a(Handler handler) {
            this.f16223a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m17135b(int i10) {
            C4416d.this.m17124h(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f16223a.post(new Runnable() { // from class: s3.c
                @Override // java.lang.Runnable
                public final void run() {
                    C4416d.a.this.m17135b(i10);
                }
            });
        }
    }

    /* renamed from: s3.d$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: w */
        void mo17136w(float f10);

        /* renamed from: x */
        void mo17137x(int i10);
    }

    public C4416d(Context context, Handler handler, b bVar) {
        this.f16214a = (AudioManager) C4014a.m15199e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f16216c = bVar;
        this.f16215b = new a(handler);
    }

    /* renamed from: e */
    public static int m17118e(C4813e c4813e) {
        if (c4813e == null) {
            return 0;
        }
        switch (c4813e.f18007j) {
            case 0:
                C4046r.m15529i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (c4813e.f18005h == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                C4046r.m15529i("AudioFocusManager", "Unidentified audio usage: " + c4813e.f18007j);
                return 0;
            case 16:
                return C4041n0.f14513a >= 19 ? 4 : 2;
        }
    }

    /* renamed from: a */
    public final void m17119a() {
        this.f16214a.abandonAudioFocus(this.f16215b);
    }

    /* renamed from: b */
    public final void m17120b() {
        if (this.f16218e == 0) {
            return;
        }
        if (C4041n0.f14513a >= 26) {
            m17121c();
        } else {
            m17119a();
        }
        m17130n(0);
    }

    /* renamed from: c */
    public final void m17121c() {
        AudioFocusRequest audioFocusRequest = this.f16221h;
        if (audioFocusRequest != null) {
            this.f16214a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* renamed from: f */
    public final void m17122f(int i10) {
        b bVar = this.f16216c;
        if (bVar != null) {
            bVar.mo17137x(i10);
        }
    }

    /* renamed from: g */
    public float m17123g() {
        return this.f16220g;
    }

    /* renamed from: h */
    public final void m17124h(int i10) {
        int i11;
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2 || m17133q()) {
                m17122f(0);
                i11 = 2;
            } else {
                i11 = 3;
            }
            m17130n(i11);
            return;
        }
        if (i10 == -1) {
            m17122f(-1);
            m17120b();
        } else if (i10 == 1) {
            m17130n(1);
            m17122f(1);
        } else {
            C4046r.m15529i("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    /* renamed from: i */
    public void m17125i() {
        this.f16216c = null;
        m17120b();
    }

    /* renamed from: j */
    public final int m17126j() {
        if (this.f16218e == 1) {
            return 1;
        }
        if ((C4041n0.f14513a >= 26 ? m17128l() : m17127k()) == 1) {
            m17130n(1);
            return 1;
        }
        m17130n(0);
        return -1;
    }

    /* renamed from: k */
    public final int m17127k() {
        return this.f16214a.requestAudioFocus(this.f16215b, C4041n0.m15456f0(((C4813e) C4014a.m15199e(this.f16217d)).f18007j), this.f16219f);
    }

    /* renamed from: l */
    public final int m17128l() {
        AudioFocusRequest audioFocusRequest = this.f16221h;
        if (audioFocusRequest == null || this.f16222i) {
            this.f16221h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f16219f) : new AudioFocusRequest.Builder(this.f16221h)).setAudioAttributes(((C4813e) C4014a.m15199e(this.f16217d)).m19013b().f18011a).setWillPauseWhenDucked(m17133q()).setOnAudioFocusChangeListener(this.f16215b).build();
            this.f16222i = false;
        }
        return this.f16214a.requestAudioFocus(this.f16221h);
    }

    /* renamed from: m */
    public void m17129m(C4813e c4813e) {
        if (C4041n0.m15449c(this.f16217d, c4813e)) {
            return;
        }
        this.f16217d = c4813e;
        int m17118e = m17118e(c4813e);
        this.f16219f = m17118e;
        boolean z10 = true;
        if (m17118e != 1 && m17118e != 0) {
            z10 = false;
        }
        C4014a.m15196b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    /* renamed from: n */
    public final void m17130n(int i10) {
        if (this.f16218e == i10) {
            return;
        }
        this.f16218e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f16220g == f10) {
            return;
        }
        this.f16220g = f10;
        b bVar = this.f16216c;
        if (bVar != null) {
            bVar.mo17136w(f10);
        }
    }

    /* renamed from: o */
    public final boolean m17131o(int i10) {
        return i10 == 1 || this.f16219f != 1;
    }

    /* renamed from: p */
    public int m17132p(boolean z10, int i10) {
        if (m17131o(i10)) {
            m17120b();
            return z10 ? 1 : -1;
        }
        if (z10) {
            return m17126j();
        }
        return -1;
    }

    /* renamed from: q */
    public final boolean m17133q() {
        C4813e c4813e = this.f16217d;
        return c4813e != null && c4813e.f18005h == 1;
    }
}
