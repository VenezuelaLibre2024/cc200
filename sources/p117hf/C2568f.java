package p117hf;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.os.Build;
import io.flutter.plugins.urllauncher.WebViewActivity;
import td.C4753m;

/* renamed from: hf.f */
/* loaded from: classes2.dex */
public final class C2568f extends AbstractC2565c implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnErrorListener {

    /* renamed from: b */
    public final C2563a f10053b;

    /* renamed from: c */
    public final String f10054c;

    /* renamed from: d */
    public final AudioManager.OnAudioFocusChangeListener f10055d;

    /* renamed from: e */
    public AudioFocusRequest f10056e;

    /* renamed from: f */
    public MediaPlayer f10057f;

    /* renamed from: g */
    public String f10058g;

    /* renamed from: h */
    public MediaDataSource f10059h;

    /* renamed from: i */
    public double f10060i;

    /* renamed from: j */
    public float f10061j;

    /* renamed from: k */
    public boolean f10062k;

    /* renamed from: l */
    public boolean f10063l;

    /* renamed from: m */
    public boolean f10064m;

    /* renamed from: n */
    public EnumC2566d f10065n;

    /* renamed from: o */
    public String f10066o;

    /* renamed from: p */
    public boolean f10067p;

    /* renamed from: q */
    public boolean f10068q;

    /* renamed from: r */
    public boolean f10069r;

    /* renamed from: s */
    public int f10070s;

    public C2568f(C2563a c2563a, String str) {
        C4753m.m18653f(c2563a, "ref");
        C4753m.m18653f(str, "playerId");
        this.f10053b = c2563a;
        this.f10054c = str;
        this.f10060i = 1.0d;
        this.f10061j = 1.0f;
        this.f10065n = EnumC2566d.RELEASE;
        this.f10066o = "speakers";
        this.f10067p = true;
        this.f10070s = -1;
    }

    /* renamed from: w */
    public static final void m10252w(C2568f c2568f, int i10) {
        C4753m.m18653f(c2568f, "this$0");
        c2568f.m10253s();
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: a */
    public void mo10233a(boolean z10, boolean z11, boolean z12) {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        MediaPlayer mediaPlayer3;
        if (this.f10062k != z10) {
            this.f10062k = z10;
            if (!this.f10067p && (mediaPlayer3 = this.f10057f) != null) {
                m10258y(mediaPlayer3);
            }
        }
        if (this.f10064m != z12) {
            this.f10064m = z12;
            if (!this.f10067p && (mediaPlayer2 = this.f10057f) != null) {
                m10258y(mediaPlayer2);
            }
        }
        if (this.f10063l != z11) {
            this.f10063l = z11;
            if (this.f10067p || !z11 || (mediaPlayer = this.f10057f) == null) {
                return;
            }
            mediaPlayer.setWakeMode(this.f10053b.m10218e(), 1);
        }
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: b */
    public Integer mo10234b() {
        MediaPlayer mediaPlayer = this.f10057f;
        if (mediaPlayer != null) {
            return Integer.valueOf(mediaPlayer.getCurrentPosition());
        }
        return null;
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: c */
    public Integer mo10235c() {
        MediaPlayer mediaPlayer = this.f10057f;
        if (mediaPlayer != null) {
            return Integer.valueOf(mediaPlayer.getDuration());
        }
        return null;
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: d */
    public String mo10236d() {
        return this.f10054c;
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: e */
    public boolean mo10237e() {
        return this.f10069r && this.f10068q;
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: g */
    public void mo10238g() {
        if (this.f10069r) {
            this.f10069r = false;
            MediaPlayer mediaPlayer = this.f10057f;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            }
        }
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: h */
    public void mo10239h() {
        if (this.f10064m) {
            AudioManager m10255u = m10255u();
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest build = new AudioFocusRequest.Builder(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(this.f10062k ? 6 : 1).setContentType(2).build()).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: hf.e
                    public /* synthetic */ C2567e() {
                    }

                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i10) {
                        C2568f.m10252w(C2568f.this, i10);
                    }
                }).build();
                this.f10056e = build;
                m10255u.requestAudioFocus(build);
                return;
            } else if (m10255u.requestAudioFocus(this.f10055d, 3, 3) != 1) {
                return;
            }
        }
        m10253s();
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: i */
    public void mo10240i() {
        MediaPlayer mediaPlayer;
        if (this.f10067p) {
            return;
        }
        if (this.f10069r && (mediaPlayer = this.f10057f) != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer2 = this.f10057f;
        if (mediaPlayer2 != null) {
            mediaPlayer2.reset();
        }
        MediaPlayer mediaPlayer3 = this.f10057f;
        if (mediaPlayer3 != null) {
            mediaPlayer3.release();
        }
        this.f10057f = null;
        this.f10068q = false;
        this.f10067p = true;
        this.f10069r = false;
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: j */
    public void mo10241j(int i10) {
        if (!this.f10068q) {
            this.f10070s = i10;
            return;
        }
        MediaPlayer mediaPlayer = this.f10057f;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(i10);
        }
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: k */
    public void mo10242k(MediaDataSource mediaDataSource) {
        if (Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("setDataSource is only available on API >= 23");
        }
        if (AbstractC2565c.m10232f(this.f10059h, mediaDataSource)) {
            return;
        }
        this.f10059h = mediaDataSource;
        MediaPlayer m10256v = m10256v();
        m10256v.setDataSource(mediaDataSource);
        m10257x(m10256v);
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: l */
    public void mo10243l(String str) {
        C4753m.m18653f(str, "playingRoute");
        if (C4753m.m18648a(this.f10066o, str)) {
            return;
        }
        boolean z10 = this.f10069r;
        if (z10) {
            mo10238g();
        }
        this.f10066o = str;
        MediaPlayer mediaPlayer = this.f10057f;
        int currentPosition = mediaPlayer != null ? mediaPlayer.getCurrentPosition() : 0;
        this.f10067p = false;
        MediaPlayer m10254t = m10254t();
        m10254t.setDataSource(this.f10058g);
        m10254t.prepare();
        mo10241j(currentPosition);
        if (z10) {
            this.f10069r = true;
            m10254t.start();
        }
        this.f10057f = m10254t;
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: m */
    public void mo10244m(double d10) {
        this.f10061j = (float) d10;
        MediaPlayer mediaPlayer = this.f10057f;
        if (mediaPlayer != null && Build.VERSION.SDK_INT >= 23) {
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(this.f10061j));
        }
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: n */
    public void mo10245n(EnumC2566d enumC2566d) {
        MediaPlayer mediaPlayer;
        C4753m.m18653f(enumC2566d, "releaseMode");
        if (this.f10065n != enumC2566d) {
            this.f10065n = enumC2566d;
            if (this.f10067p || (mediaPlayer = this.f10057f) == null) {
                return;
            }
            mediaPlayer.setLooping(enumC2566d == EnumC2566d.LOOP);
        }
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: o */
    public void mo10246o(String str, boolean z10) {
        C4753m.m18653f(str, WebViewActivity.URL_EXTRA);
        if (!C4753m.m18648a(this.f10058g, str)) {
            this.f10058g = str;
            MediaPlayer m10256v = m10256v();
            m10256v.setDataSource(str);
            m10257x(m10256v);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.f10059h = null;
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i10) {
        if (i10 == 1) {
            m10253s();
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        C4753m.m18653f(mediaPlayer, "mediaPlayer");
        if (this.f10065n != EnumC2566d.LOOP) {
            mo10248q();
        }
        this.f10053b.m10220g(this);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        String str;
        String str2;
        C4753m.m18653f(mediaPlayer, "mp");
        if (i10 == 100) {
            str = "MEDIA_ERROR_SERVER_DIED";
        } else {
            str = "MEDIA_ERROR_UNKNOWN {what:" + i10 + '}';
        }
        if (i11 == Integer.MIN_VALUE) {
            str2 = "MEDIA_ERROR_SYSTEM";
        } else if (i11 == -1010) {
            str2 = "MEDIA_ERROR_UNSUPPORTED";
        } else if (i11 == -1007) {
            str2 = "MEDIA_ERROR_MALFORMED";
        } else if (i11 == -1004) {
            str2 = "MEDIA_ERROR_IO";
        } else if (i11 != -110) {
            str = "MEDIA_ERROR_UNKNOWN {extra:" + i11 + '}';
            str2 = str;
        } else {
            str2 = "MEDIA_ERROR_TIMED_OUT";
        }
        this.f10053b.m10222i(this, "MediaPlayer error with what:" + str + " extra:" + str2);
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        C4753m.m18653f(mediaPlayer, "mediaPlayer");
        this.f10068q = true;
        this.f10053b.m10221h(this);
        if (this.f10069r) {
            MediaPlayer mediaPlayer2 = this.f10057f;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
            }
            this.f10053b.m10223j();
        }
        int i10 = this.f10070s;
        if (i10 >= 0) {
            MediaPlayer mediaPlayer3 = this.f10057f;
            if (mediaPlayer3 != null) {
                mediaPlayer3.seekTo(i10);
            }
            this.f10070s = -1;
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        C4753m.m18653f(mediaPlayer, "mediaPlayer");
        this.f10053b.m10225l();
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: p */
    public void mo10247p(double d10) {
        MediaPlayer mediaPlayer;
        if (this.f10060i == d10) {
            return;
        }
        this.f10060i = d10;
        if (this.f10067p || (mediaPlayer = this.f10057f) == null) {
            return;
        }
        float f10 = (float) d10;
        mediaPlayer.setVolume(f10, f10);
    }

    @Override // p117hf.AbstractC2565c
    /* renamed from: q */
    public void mo10248q() {
        if (this.f10064m) {
            AudioManager m10255u = m10255u();
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = this.f10056e;
                if (audioFocusRequest != null) {
                    m10255u.abandonAudioFocusRequest(audioFocusRequest);
                }
            } else {
                m10255u.abandonAudioFocus(this.f10055d);
            }
        }
        if (this.f10067p) {
            return;
        }
        if (this.f10065n == EnumC2566d.RELEASE) {
            mo10240i();
            return;
        }
        if (this.f10069r) {
            this.f10069r = false;
            MediaPlayer mediaPlayer = this.f10057f;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            }
            MediaPlayer mediaPlayer2 = this.f10057f;
            if (mediaPlayer2 != null) {
                mediaPlayer2.seekTo(0);
            }
        }
    }

    /* renamed from: s */
    public final void m10253s() {
        MediaDataSource mediaDataSource;
        if (this.f10069r) {
            return;
        }
        MediaPlayer mediaPlayer = this.f10057f;
        this.f10069r = true;
        if (!this.f10067p && mediaPlayer != null) {
            if (this.f10068q) {
                mediaPlayer.start();
                this.f10053b.m10223j();
                return;
            }
            return;
        }
        this.f10067p = false;
        MediaPlayer m10254t = m10254t();
        if (Build.VERSION.SDK_INT < 23 || (mediaDataSource = this.f10059h) == null) {
            m10254t.setDataSource(this.f10058g);
        } else {
            m10254t.setDataSource(mediaDataSource);
        }
        m10254t.prepareAsync();
        this.f10057f = m10254t;
    }

    /* renamed from: t */
    public final MediaPlayer m10254t() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnSeekCompleteListener(this);
        mediaPlayer.setOnErrorListener(this);
        m10258y(mediaPlayer);
        double d10 = this.f10060i;
        mediaPlayer.setVolume((float) d10, (float) d10);
        mediaPlayer.setLooping(this.f10065n == EnumC2566d.LOOP);
        return mediaPlayer;
    }

    /* renamed from: u */
    public final AudioManager m10255u() {
        Object systemService = this.f10053b.m10218e().getSystemService("audio");
        C4753m.m18651d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    /* renamed from: v */
    public final MediaPlayer m10256v() {
        MediaPlayer mediaPlayer = this.f10057f;
        if (this.f10067p || mediaPlayer == null) {
            MediaPlayer m10254t = m10254t();
            this.f10057f = m10254t;
            this.f10067p = false;
            return m10254t;
        }
        if (!this.f10068q) {
            return mediaPlayer;
        }
        mediaPlayer.reset();
        this.f10068q = false;
        return mediaPlayer;
    }

    /* renamed from: x */
    public final void m10257x(MediaPlayer mediaPlayer) {
        double d10 = this.f10060i;
        mediaPlayer.setVolume((float) d10, (float) d10);
        mediaPlayer.setLooping(this.f10065n == EnumC2566d.LOOP);
        mediaPlayer.prepareAsync();
    }

    /* renamed from: y */
    public final void m10258y(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT < 21) {
            if (C4753m.m18648a(this.f10066o, "speakers")) {
                mediaPlayer.setAudioStreamType(this.f10062k ? 2 : 3);
                return;
            } else {
                mediaPlayer.setAudioStreamType(0);
                return;
            }
        }
        int i10 = !C4753m.m18648a(this.f10066o, "speakers") ? 2 : this.f10062k ? 6 : 1;
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(i10).setContentType(2).build());
        if (i10 == 2) {
            m10255u().setSpeakerphoneOn(false);
        }
    }
}
