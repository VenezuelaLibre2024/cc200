package p137j4;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p109h7.C2420c;
import p126i7.AbstractC2651u;
import p137j4.C3243v;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4050v;
import p236q5.C4170c;
import p264s3.C4463m1;

@SuppressLint({"InlinedApi"})
/* renamed from: j4.v */
/* loaded from: classes.dex */
public final class C3243v {

    /* renamed from: a */
    public static final Pattern f11329a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    public static final HashMap<b, List<C3235n>> f11330b = new HashMap<>();

    /* renamed from: c */
    public static int f11331c = -1;

    /* renamed from: j4.v$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f11332a;

        /* renamed from: b */
        public final boolean f11333b;

        /* renamed from: c */
        public final boolean f11334c;

        public b(String str, boolean z10, boolean z11) {
            this.f11332a = str;
            this.f11333b = z10;
            this.f11334c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f11332a, bVar.f11332a) && this.f11333b == bVar.f11333b && this.f11334c == bVar.f11334c;
        }

        public int hashCode() {
            return ((((this.f11332a.hashCode() + 31) * 31) + (this.f11333b ? 1231 : 1237)) * 31) + (this.f11334c ? 1231 : 1237);
        }
    }

    /* renamed from: j4.v$c */
    /* loaded from: classes.dex */
    public static class c extends Exception {
        public c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }

        public /* synthetic */ c(Throwable th, a aVar) {
            this(th);
        }
    }

    /* renamed from: j4.v$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        MediaCodecInfo mo11737a(int i10);

        /* renamed from: b */
        boolean mo11738b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: c */
        boolean mo11739c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: d */
        int mo11740d();

        /* renamed from: e */
        boolean mo11741e();
    }

    /* renamed from: j4.v$e */
    /* loaded from: classes.dex */
    public static final class e implements d {
        public e() {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        @Override // p137j4.C3243v.d
        /* renamed from: a */
        public MediaCodecInfo mo11737a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // p137j4.C3243v.d
        /* renamed from: b */
        public boolean mo11738b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // p137j4.C3243v.d
        /* renamed from: c */
        public boolean mo11739c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // p137j4.C3243v.d
        /* renamed from: d */
        public int mo11740d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // p137j4.C3243v.d
        /* renamed from: e */
        public boolean mo11741e() {
            return false;
        }
    }

    /* renamed from: j4.v$f */
    /* loaded from: classes.dex */
    public static final class f implements d {

        /* renamed from: a */
        public final int f11335a;

        /* renamed from: b */
        public MediaCodecInfo[] f11336b;

        public f(boolean z10, boolean z11) {
            this.f11335a = (z10 || z11) ? 1 : 0;
        }

        @Override // p137j4.C3243v.d
        /* renamed from: a */
        public MediaCodecInfo mo11737a(int i10) {
            m11742f();
            return this.f11336b[i10];
        }

        @Override // p137j4.C3243v.d
        /* renamed from: b */
        public boolean mo11738b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // p137j4.C3243v.d
        /* renamed from: c */
        public boolean mo11739c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // p137j4.C3243v.d
        /* renamed from: d */
        public int mo11740d() {
            m11742f();
            return this.f11336b.length;
        }

        @Override // p137j4.C3243v.d
        /* renamed from: e */
        public boolean mo11741e() {
            return true;
        }

        /* renamed from: f */
        public final void m11742f() {
            if (this.f11336b == null) {
                this.f11336b = new MediaCodecList(this.f11335a).getCodecInfos();
            }
        }
    }

    /* renamed from: j4.v$g */
    /* loaded from: classes.dex */
    public interface g<T> {
        /* renamed from: a */
        int mo11692a(T t10);
    }

    /* renamed from: A */
    public static boolean m11693A(MediaCodecInfo mediaCodecInfo) {
        return C4041n0.f14513a >= 29 && m11694B(mediaCodecInfo);
    }

    /* renamed from: B */
    public static boolean m11694B(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    /* renamed from: C */
    public static boolean m11695C(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = C4041n0.f14513a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = C4041n0.f14514b;
            if ("a70".equals(str3) || ("Xiaomi".equals(C4041n0.f14515c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = C4041n0.f14514b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = C4041n0.f14514b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(C4041n0.f14515c))) {
            String str6 = C4041n0.f14514b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C4041n0.f14515c)) {
            String str7 = C4041n0.f14514b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && C4041n0.f14514b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* renamed from: D */
    public static boolean m11696D(MediaCodecInfo mediaCodecInfo, String str) {
        return C4041n0.f14513a >= 29 ? m11697E(mediaCodecInfo) : !m11698F(mediaCodecInfo, str);
    }

    /* renamed from: E */
    public static boolean m11697E(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    /* renamed from: F */
    public static boolean m11698F(MediaCodecInfo mediaCodecInfo, String str) {
        if (C4041n0.f14513a >= 29) {
            return m11699G(mediaCodecInfo);
        }
        if (C4050v.m15558o(str)) {
            return true;
        }
        String m9665e = C2420c.m9665e(mediaCodecInfo.getName());
        if (m9665e.startsWith("arc.")) {
            return false;
        }
        if (m9665e.startsWith("omx.google.") || m9665e.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((m9665e.startsWith("omx.sec.") && m9665e.contains(".sw.")) || m9665e.equals("omx.qcom.video.decoder.hevcswvdec") || m9665e.startsWith("c2.android.") || m9665e.startsWith("c2.google.")) {
            return true;
        }
        return (m9665e.startsWith("omx.") || m9665e.startsWith("c2.")) ? false : true;
    }

    /* renamed from: G */
    public static boolean m11699G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    /* renamed from: H */
    public static boolean m11700H(MediaCodecInfo mediaCodecInfo) {
        if (C4041n0.f14513a >= 29) {
            return m11701I(mediaCodecInfo);
        }
        String m9665e = C2420c.m9665e(mediaCodecInfo.getName());
        return (m9665e.startsWith("omx.google.") || m9665e.startsWith("c2.android.") || m9665e.startsWith("c2.google.")) ? false : true;
    }

    /* renamed from: I */
    public static boolean m11701I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* renamed from: J */
    public static /* synthetic */ int m11702J(C3235n c3235n) {
        String str = c3235n.f11234a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (C4041n0.f14513a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* renamed from: K */
    public static /* synthetic */ int m11703K(C3235n c3235n) {
        return c3235n.f11234a.startsWith("OMX.google") ? 1 : 0;
    }

    /* renamed from: L */
    public static /* synthetic */ int m11704L(C4463m1 c4463m1, C3235n c3235n) {
        return c3235n.m11593n(c4463m1) ? 1 : 0;
    }

    /* renamed from: M */
    public static /* synthetic */ int m11705M(g gVar, Object obj, Object obj2) {
        return gVar.mo11692a(obj2) - gVar.mo11692a(obj);
    }

    /* renamed from: N */
    public static int m11706N() {
        if (f11331c == -1) {
            int i10 = 0;
            C3235n m11728r = m11728r("video/avc", false, false);
            if (m11728r != null) {
                MediaCodecInfo.CodecProfileLevel[] m11589h = m11728r.m11589h();
                int length = m11589h.length;
                int i11 = 0;
                while (i10 < length) {
                    i11 = Math.max(m11718h(m11589h[i10].level), i11);
                    i10++;
                }
                i10 = Math.max(i11, C4041n0.f14513a >= 21 ? 345600 : 172800);
            }
            f11331c = i10;
        }
        return f11331c;
    }

    /* renamed from: O */
    public static int m11707O(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    /* renamed from: P */
    public static <T> void m11708P(List<T> list, g<T> gVar) {
        Collections.sort(list, new Comparator() { // from class: j4.u
            public /* synthetic */ C3242u() {
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m11705M;
                m11705M = C3243v.m11705M(C3243v.g.this, obj, obj2);
                return m11705M;
            }
        });
    }

    /* renamed from: Q */
    public static int m11709Q(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case C1417R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return 2048;
            case C1417R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return 4096;
            case C1417R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return 8192;
            default:
                return -1;
        }
    }

    /* renamed from: R */
    public static int m11710R(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    /* renamed from: e */
    public static void m11715e(String str, List<C3235n> list) {
        if ("audio/raw".equals(str)) {
            if (C4041n0.f14513a < 26 && C4041n0.f14514b.equals("R9") && list.size() == 1 && list.get(0).f11234a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(C3235n.m11574F("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            m11708P(list, C3240s.f11326a);
        }
        int i10 = C4041n0.f14513a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).f11234a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m11708P(list, C3241t.f11327a);
            }
        }
        if (i10 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f11234a)) {
            return;
        }
        list.add(list.remove(0));
    }

    /* renamed from: f */
    public static int m11716f(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    /* renamed from: g */
    public static int m11717g(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case C1417R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                return 256;
                            case C1417R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                return 512;
                            case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case C1417R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                        return 4096;
                                    case C1417R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case C1417R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                                return 16384;
                                            case C1417R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                                return 32768;
                                            case C1417R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: h */
    public static int m11718h(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return 101376;
            case C1417R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    /* renamed from: i */
    public static int m11719i(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    /* renamed from: j */
    public static Integer m11720j(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                i10 = 16;
                break;
            case 5:
                i10 = 32;
                break;
            case 6:
                i10 = 64;
                break;
            case 7:
                i10 = 128;
                break;
            case '\b':
                i10 = 256;
                break;
            case '\t':
                i10 = 512;
                break;
            case '\n':
                i10 = 1024;
                break;
            case 11:
                i10 = 2048;
                break;
            case '\f':
                i10 = 4096;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }

    /* renamed from: k */
    public static Integer m11721k(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                i10 = 16;
                break;
            case 5:
                i10 = 32;
                break;
            case 6:
                i10 = 64;
                break;
            case 7:
                i10 = 128;
                break;
            case '\b':
                i10 = 256;
                break;
            case '\t':
                i10 = 512;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }

    /* renamed from: l */
    public static Pair<Integer, Integer> m11722l(String str, String[] strArr) {
        int m11707O;
        if (strArr.length != 3) {
            C4046r.m15529i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(C4050v.m15551h(Integer.parseInt(strArr[1], 16))) && (m11707O = m11707O(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(m11707O), 0);
            }
        } catch (NumberFormatException unused) {
            C4046r.m15529i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    /* renamed from: m */
    public static String m11723m(C4463m1 c4463m1) {
        Pair<Integer, Integer> m11727q;
        if ("audio/eac3-joc".equals(c4463m1.f16506s)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c4463m1.f16506s) || (m11727q = m11727q(c4463m1)) == null) {
            return null;
        }
        int intValue = ((Integer) m11727q.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* renamed from: n */
    public static Pair<Integer, Integer> m11724n(String str, String[] strArr, C4170c c4170c) {
        StringBuilder sb2;
        int parseInt;
        int parseInt2;
        int parseInt3;
        StringBuilder sb3;
        int i10;
        String sb4;
        if (strArr.length >= 4) {
            try {
                parseInt = Integer.parseInt(strArr[1]);
                parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
                parseInt3 = Integer.parseInt(strArr[3]);
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
            }
            if (parseInt != 0) {
                sb3 = new StringBuilder();
                sb3.append("Unknown AV1 profile: ");
                sb3.append(parseInt);
            } else {
                if (parseInt3 != 8 && parseInt3 != 10) {
                    sb2 = new StringBuilder();
                    sb2.append("Unknown AV1 bit depth: ");
                    sb2.append(parseInt3);
                    sb4 = sb2.toString();
                    C4046r.m15529i("MediaCodecUtil", sb4);
                    return null;
                }
                int i11 = parseInt3 != 8 ? (c4170c == null || !(c4170c.f14993k != null || (i10 = c4170c.f14992j) == 7 || i10 == 6)) ? 2 : 4096 : 1;
                int m11716f = m11716f(parseInt2);
                if (m11716f != -1) {
                    return new Pair<>(Integer.valueOf(i11), Integer.valueOf(m11716f));
                }
                sb3 = new StringBuilder();
                sb3.append("Unknown AV1 level: ");
                sb3.append(parseInt2);
            }
            sb4 = sb3.toString();
            C4046r.m15529i("MediaCodecUtil", sb4);
            return null;
        }
        sb2 = new StringBuilder();
        sb2.append("Ignoring malformed AV1 codec string: ");
        sb2.append(str);
        sb4 = sb2.toString();
        C4046r.m15529i("MediaCodecUtil", sb4);
        return null;
    }

    /* renamed from: o */
    public static Pair<Integer, Integer> m11725o(String str, String[] strArr) {
        StringBuilder sb2;
        int parseInt;
        int i10;
        int m11719i;
        String str2;
        if (strArr.length >= 2) {
            try {
                if (strArr[1].length() == 6) {
                    i10 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                    parseInt = Integer.parseInt(strArr[1].substring(4), 16);
                } else {
                    if (strArr.length < 3) {
                        C4046r.m15529i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                        return null;
                    }
                    int parseInt2 = Integer.parseInt(strArr[1]);
                    parseInt = Integer.parseInt(strArr[2]);
                    i10 = parseInt2;
                }
                m11719i = m11719i(i10);
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
            }
            if (m11719i == -1) {
                str2 = "Unknown AVC profile: " + i10;
                C4046r.m15529i("MediaCodecUtil", str2);
                return null;
            }
            int m11717g = m11717g(parseInt);
            if (m11717g != -1) {
                return new Pair<>(Integer.valueOf(m11719i), Integer.valueOf(m11717g));
            }
            sb2 = new StringBuilder();
            sb2.append("Unknown AVC level: ");
            sb2.append(parseInt);
            str2 = sb2.toString();
            C4046r.m15529i("MediaCodecUtil", str2);
            return null;
        }
        sb2 = new StringBuilder();
        sb2.append("Ignoring malformed AVC codec string: ");
        sb2.append(str);
        str2 = sb2.toString();
        C4046r.m15529i("MediaCodecUtil", str2);
        return null;
    }

    /* renamed from: p */
    public static String m11726p(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r3.equals("av01") == false) goto L62;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m11727q(p264s3.C4463m1 r6) {
        /*
            java.lang.String r0 = r6.f16503p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.f16506s
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1d
            java.lang.String r6 = r6.f16503p
            android.util.Pair r6 = m11733w(r6, r0)
            return r6
        L1d:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L6f;
                case 3006243: goto L64;
                case 3006244: goto L59;
                case 3199032: goto L4e;
                case 3214780: goto L43;
                case 3356560: goto L38;
                case 3624515: goto L2d;
                default: goto L2b;
            }
        L2b:
            r2 = r4
            goto L78
        L2d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L36
            goto L2b
        L36:
            r2 = 6
            goto L78
        L38:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L41
            goto L2b
        L41:
            r2 = 5
            goto L78
        L43:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L4c
            goto L2b
        L4c:
            r2 = 4
            goto L78
        L4e:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L57
            goto L2b
        L57:
            r2 = 3
            goto L78
        L59:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L62
            goto L2b
        L62:
            r2 = 2
            goto L78
        L64:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L6d
            goto L2b
        L6d:
            r2 = 1
            goto L78
        L6f:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L78
            goto L2b
        L78:
            switch(r2) {
                case 0: goto L9a;
                case 1: goto L93;
                case 2: goto L93;
                case 3: goto L8a;
                case 4: goto L8a;
                case 5: goto L83;
                case 6: goto L7c;
                default: goto L7b;
            }
        L7b:
            return r1
        L7c:
            java.lang.String r6 = r6.f16503p
            android.util.Pair r6 = m11735y(r6, r0)
            return r6
        L83:
            java.lang.String r6 = r6.f16503p
            android.util.Pair r6 = m11722l(r6, r0)
            return r6
        L8a:
            java.lang.String r1 = r6.f16503p
            q5.c r6 = r6.f16484E
            android.util.Pair r6 = m11734x(r1, r0, r6)
            return r6
        L93:
            java.lang.String r6 = r6.f16503p
            android.util.Pair r6 = m11725o(r6, r0)
            return r6
        L9a:
            java.lang.String r1 = r6.f16503p
            q5.c r6 = r6.f16484E
            android.util.Pair r6 = m11724n(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p137j4.C3243v.m11727q(s3.m1):android.util.Pair");
    }

    /* renamed from: r */
    public static C3235n m11728r(String str, boolean z10, boolean z11) {
        List<C3235n> m11729s = m11729s(str, z10, z11);
        if (m11729s.isEmpty()) {
            return null;
        }
        return m11729s.get(0);
    }

    /* renamed from: s */
    public static synchronized List<C3235n> m11729s(String str, boolean z10, boolean z11) {
        synchronized (C3243v.class) {
            b bVar = new b(str, z10, z11);
            HashMap<b, List<C3235n>> hashMap = f11330b;
            List<C3235n> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i10 = C4041n0.f14513a;
            ArrayList<C3235n> m11730t = m11730t(bVar, i10 >= 21 ? new f(z10, z11) : new e());
            if (z10 && m11730t.isEmpty() && 21 <= i10 && i10 <= 23) {
                m11730t = m11730t(bVar, new e());
                if (!m11730t.isEmpty()) {
                    C4046r.m15529i("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + m11730t.get(0).f11234a);
                }
            }
            m11715e(str, m11730t);
            AbstractC2651u m10768p = AbstractC2651u.m10768p(m11730t);
            hashMap.put(bVar, m10768p);
            return m10768p;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:28|(4:(2:72|73)|53|(9:56|57|58|59|60|61|62|64|65)|9)|32|33|34|36|9) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x007f, code lost:
    
        if (r1.f11333b == false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101 A[Catch: Exception -> 0x014f, TRY_ENTER, TryCatch #1 {Exception -> 0x014f, blocks: (B:3:0x0008, B:5:0x001b, B:9:0x0120, B:10:0x002d, B:13:0x0038, B:39:0x00f9, B:42:0x0101, B:44:0x0107, B:47:0x012a, B:48:0x014d), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<p137j4.C3235n> m11730t(p137j4.C3243v.b r24, p137j4.C3243v.d r25) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p137j4.C3243v.m11730t(j4.v$b, j4.v$d):java.util.ArrayList");
    }

    /* renamed from: u */
    public static List<C3235n> m11731u(List<C3235n> list, C4463m1 c4463m1) {
        ArrayList arrayList = new ArrayList(list);
        m11708P(arrayList, new g() { // from class: j4.r
            public /* synthetic */ C3239r() {
            }

            @Override // p137j4.C3243v.g
            /* renamed from: a */
            public final int mo11692a(Object obj) {
                int m11704L;
                m11704L = C3243v.m11704L(C4463m1.this, (C3235n) obj);
                return m11704L;
            }
        });
        return arrayList;
    }

    /* renamed from: v */
    public static C3235n m11732v() {
        return m11728r("audio/raw", false, false);
    }

    /* renamed from: w */
    public static Pair<Integer, Integer> m11733w(String str, String[] strArr) {
        StringBuilder sb2;
        String str2;
        if (strArr.length < 3) {
            sb2 = new StringBuilder();
        } else {
            Matcher matcher = f11329a.matcher(strArr[1]);
            if (matcher.matches()) {
                str = matcher.group(1);
                Integer m11721k = m11721k(str);
                if (m11721k == null) {
                    sb2 = new StringBuilder();
                    str2 = "Unknown Dolby Vision profile string: ";
                } else {
                    str = strArr[2];
                    Integer m11720j = m11720j(str);
                    if (m11720j != null) {
                        return new Pair<>(m11721k, m11720j);
                    }
                    sb2 = new StringBuilder();
                    str2 = "Unknown Dolby Vision level string: ";
                }
                sb2.append(str2);
                sb2.append(str);
                C4046r.m15529i("MediaCodecUtil", sb2.toString());
                return null;
            }
            sb2 = new StringBuilder();
        }
        sb2.append("Ignoring malformed Dolby Vision codec string: ");
        sb2.append(str);
        C4046r.m15529i("MediaCodecUtil", sb2.toString());
        return null;
    }

    /* renamed from: x */
    public static Pair<Integer, Integer> m11734x(String str, String[] strArr, C4170c c4170c) {
        StringBuilder sb2;
        String str2;
        if (strArr.length < 4) {
            sb2 = new StringBuilder();
        } else {
            int i10 = 1;
            Matcher matcher = f11329a.matcher(strArr[1]);
            if (matcher.matches()) {
                str = matcher.group(1);
                if (!"1".equals(str)) {
                    if (!"2".equals(str)) {
                        sb2 = new StringBuilder();
                        str2 = "Unknown HEVC profile string: ";
                        sb2.append(str2);
                        sb2.append(str);
                        C4046r.m15529i("MediaCodecUtil", sb2.toString());
                        return null;
                    }
                    i10 = (c4170c == null || c4170c.f14992j != 6) ? 2 : 4096;
                }
                str = strArr[3];
                Integer m11736z = m11736z(str);
                if (m11736z != null) {
                    return new Pair<>(Integer.valueOf(i10), m11736z);
                }
                sb2 = new StringBuilder();
                str2 = "Unknown HEVC level string: ";
                sb2.append(str2);
                sb2.append(str);
                C4046r.m15529i("MediaCodecUtil", sb2.toString());
                return null;
            }
            sb2 = new StringBuilder();
        }
        sb2.append("Ignoring malformed HEVC codec string: ");
        sb2.append(str);
        C4046r.m15529i("MediaCodecUtil", sb2.toString());
        return null;
    }

    /* renamed from: y */
    public static Pair<Integer, Integer> m11735y(String str, String[] strArr) {
        StringBuilder sb2;
        int parseInt;
        int parseInt2;
        int m11710R;
        String str2;
        if (strArr.length >= 3) {
            try {
                parseInt = Integer.parseInt(strArr[1]);
                parseInt2 = Integer.parseInt(strArr[2]);
                m11710R = m11710R(parseInt);
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
            }
            if (m11710R == -1) {
                str2 = "Unknown VP9 profile: " + parseInt;
                C4046r.m15529i("MediaCodecUtil", str2);
                return null;
            }
            int m11709Q = m11709Q(parseInt2);
            if (m11709Q != -1) {
                return new Pair<>(Integer.valueOf(m11710R), Integer.valueOf(m11709Q));
            }
            sb2 = new StringBuilder();
            sb2.append("Unknown VP9 level: ");
            sb2.append(parseInt2);
            str2 = sb2.toString();
            C4046r.m15529i("MediaCodecUtil", str2);
            return null;
        }
        sb2 = new StringBuilder();
        sb2.append("Ignoring malformed VP9 codec string: ");
        sb2.append(str);
        str2 = sb2.toString();
        C4046r.m15529i("MediaCodecUtil", str2);
        return null;
    }

    /* renamed from: z */
    public static Integer m11736z(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c10 = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c10 = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c10 = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c10 = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c10 = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c10 = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c10 = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c10 = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c10 = 25;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                i10 = 32;
                break;
            case 3:
                i10 = 128;
                break;
            case 4:
                i10 = 512;
                break;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case '\b':
                i10 = 64;
                break;
            case '\t':
                i10 = 256;
                break;
            case '\n':
                i10 = 2048;
                break;
            case 11:
                i10 = 8192;
                break;
            case '\f':
                i10 = 32768;
                break;
            case '\r':
                i10 = 131072;
                break;
            case 14:
                i10 = 524288;
                break;
            case 15:
                i10 = 2097152;
                break;
            case 16:
                i10 = 8388608;
                break;
            case 17:
                i10 = 33554432;
                break;
            case 18:
                i10 = 1024;
                break;
            case 19:
                i10 = 4096;
                break;
            case 20:
                i10 = 16384;
                break;
            case 21:
                i10 = 65536;
                break;
            case 22:
                i10 = 262144;
                break;
            case 23:
                i10 = 1048576;
                break;
            case 24:
                i10 = 4194304;
                break;
            case 25:
                i10 = 16777216;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }
}
