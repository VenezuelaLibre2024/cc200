package p289u3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import java.util.Arrays;
import p126i7.AbstractC2617d1;
import p126i7.AbstractC2651u;
import p126i7.AbstractC2653v;
import p155k7.C3368e;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4050v;
import p264s3.C4463m1;

/* renamed from: u3.f */
/* loaded from: classes.dex */
public final class C4815f {

    /* renamed from: c */
    public static final C4815f f18031c = new C4815f(new int[]{2}, 8);

    /* renamed from: d */
    public static final C4815f f18032d = new C4815f(new int[]{2, 5, 6}, 8);

    /* renamed from: e */
    public static final AbstractC2653v<Integer, Integer> f18033e = new AbstractC2653v.a().m10810f(5, 6).m10810f(17, 6).m10810f(7, 6).m10810f(18, 6).m10810f(6, 8).m10810f(8, 8).m10810f(14, 8).m10807c();

    /* renamed from: a */
    public final int[] f18034a;

    /* renamed from: b */
    public final int f18035b;

    /* renamed from: u3.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final AudioAttributes f18036a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static int[] m19048a() {
            AbstractC2651u.a m10766n = AbstractC2651u.m10766n();
            AbstractC2617d1 it = C4815f.f18033e.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f18036a)) {
                    m10766n.mo10749a(Integer.valueOf(intValue));
                }
            }
            m10766n.mo10749a(2);
            return C3368e.m12533l(m10766n.m10784k());
        }

        /* renamed from: b */
        public static int m19049b(int i10, int i11) {
            for (int i12 = 8; i12 > 0; i12--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(C4041n0.m15405G(i12)).build(), f18036a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    public C4815f(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f18034a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f18034a = new int[0];
        }
        this.f18035b = i10;
    }

    /* renamed from: b */
    public static boolean m19040b() {
        if (C4041n0.f14513a >= 17) {
            String str = C4041n0.f14515c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static C4815f m19041c(Context context) {
        return m19042d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: d */
    public static C4815f m19042d(Context context, Intent intent) {
        return (m19040b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) ? f18032d : (C4041n0.f14513a < 29 || !(C4041n0.m15490w0(context) || C4041n0.m15480r0(context))) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f18031c : new C4815f(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new C4815f(a.m19048a(), 8);
    }

    /* renamed from: e */
    public static int m19043e(int i10) {
        int i11 = C4041n0.f14513a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(C4041n0.f14514b) && i10 == 1) {
            i10 = 2;
        }
        return C4041n0.m15405G(i10);
    }

    /* renamed from: g */
    public static int m19044g(int i10, int i11) {
        return C4041n0.f14513a >= 29 ? a.m19049b(i10, i11) : ((Integer) C4014a.m15199e(f18033e.getOrDefault(Integer.valueOf(i10), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4815f)) {
            return false;
        }
        C4815f c4815f = (C4815f) obj;
        return Arrays.equals(this.f18034a, c4815f.f18034a) && this.f18035b == c4815f.f18035b;
    }

    /* renamed from: f */
    public Pair<Integer, Integer> m19045f(C4463m1 c4463m1) {
        int m15549f = C4050v.m15549f((String) C4014a.m15199e(c4463m1.f16506s), c4463m1.f16503p);
        if (!f18033e.containsKey(Integer.valueOf(m15549f))) {
            return null;
        }
        if (m15549f == 18 && !m19047i(18)) {
            m15549f = 6;
        } else if (m15549f == 8 && !m19047i(8)) {
            m15549f = 7;
        }
        if (!m19047i(m15549f)) {
            return null;
        }
        int i10 = c4463m1.f16485F;
        if (i10 == -1 || m15549f == 18) {
            int i11 = c4463m1.f16486G;
            if (i11 == -1) {
                i11 = 48000;
            }
            i10 = m19044g(m15549f, i11);
        } else if (i10 > this.f18035b) {
            return null;
        }
        int m19043e = m19043e(i10);
        if (m19043e == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(m15549f), Integer.valueOf(m19043e));
    }

    /* renamed from: h */
    public boolean m19046h(C4463m1 c4463m1) {
        return m19045f(c4463m1) != null;
    }

    public int hashCode() {
        return this.f18035b + (Arrays.hashCode(this.f18034a) * 31);
    }

    /* renamed from: i */
    public boolean m19047i(int i10) {
        return Arrays.binarySearch(this.f18034a, i10) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f18035b + ", supportedEncodings=" + Arrays.toString(this.f18034a) + "]";
    }
}
