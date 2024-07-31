package p137j4;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.List;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4050v;
import p264s3.C4463m1;
import p304v3.C5112i;

/* renamed from: j4.n */
/* loaded from: classes.dex */
public final class C3235n {

    /* renamed from: a */
    public final String f11234a;

    /* renamed from: b */
    public final String f11235b;

    /* renamed from: c */
    public final String f11236c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f11237d;

    /* renamed from: e */
    public final boolean f11238e;

    /* renamed from: f */
    public final boolean f11239f;

    /* renamed from: g */
    public final boolean f11240g;

    /* renamed from: h */
    public final boolean f11241h;

    /* renamed from: i */
    public final boolean f11242i;

    /* renamed from: j */
    public final boolean f11243j;

    /* renamed from: k */
    public final boolean f11244k;

    /* renamed from: j4.n$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static int m11601a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || C3235n.m11575a()) {
                return 0;
            }
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10);
            for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                if (supportedPerformancePoints.get(i12).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    public C3235n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f11234a = (String) C4014a.m15199e(str);
        this.f11235b = str2;
        this.f11236c = str3;
        this.f11237d = codecCapabilities;
        this.f11241h = z10;
        this.f11242i = z11;
        this.f11243j = z12;
        this.f11238e = z13;
        this.f11239f = z14;
        this.f11240g = z15;
        this.f11244k = C4050v.m15562s(str2);
    }

    /* renamed from: A */
    public static boolean m11569A(String str) {
        return C4041n0.f14516d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* renamed from: B */
    public static boolean m11570B(String str) {
        if (C4041n0.f14513a <= 22) {
            String str2 = C4041n0.f14516d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public static boolean m11571C() {
        String str = C4041n0.f14514b;
        if (!str.equals("sabrina") && !str.equals("boreal")) {
            String str2 = C4041n0.f14516d;
            if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public static boolean m11572D(String str, int i10) {
        if ("video/hevc".equals(str) && 2 == i10) {
            String str2 = C4041n0.f14514b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m11573E(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(C4041n0.f14514b)) ? false : true;
    }

    /* renamed from: F */
    public static C3235n m11574F(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new C3235n(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !m11580i(codecCapabilities) || m11570B(str)) ? false : true, codecCapabilities != null && m11584u(codecCapabilities), z14 || (codecCapabilities != null && m11582s(codecCapabilities)));
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m11575a() {
        return m11571C();
    }

    /* renamed from: b */
    public static int m11576b(String str, String str2, int i10) {
        if (i10 > 1 || ((C4041n0.f14513a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        C4046r.m15529i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    /* renamed from: d */
    public static Point m11577d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(C4041n0.m15467l(i10, widthAlignment) * widthAlignment, C4041n0.m15467l(i11, heightAlignment) * heightAlignment);
    }

    /* renamed from: e */
    public static boolean m11578e(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point m11577d = m11577d(videoCapabilities, i10, i11);
        int i12 = m11577d.x;
        int i13 = m11577d.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    /* renamed from: g */
    public static MediaCodecInfo.CodecProfileLevel[] m11579g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i10 = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    /* renamed from: i */
    public static boolean m11580i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C4041n0.f14513a >= 19 && m11581j(codecCapabilities);
    }

    /* renamed from: j */
    public static boolean m11581j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: s */
    public static boolean m11582s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C4041n0.f14513a >= 21 && m11583t(codecCapabilities);
    }

    /* renamed from: t */
    public static boolean m11583t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: u */
    public static boolean m11584u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C4041n0.f14513a >= 21 && m11585v(codecCapabilities);
    }

    /* renamed from: v */
    public static boolean m11585v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: z */
    public static boolean m11586z(String str) {
        return "audio/opus".equals(str);
    }

    /* renamed from: c */
    public Point m11587c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11237d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m11577d(videoCapabilities, i10, i11);
    }

    /* renamed from: f */
    public C5112i m11588f(C4463m1 c4463m1, C4463m1 c4463m12) {
        int i10 = !C4041n0.m15449c(c4463m1.f16506s, c4463m12.f16506s) ? 8 : 0;
        if (this.f11244k) {
            if (c4463m1.f16480A != c4463m12.f16480A) {
                i10 |= 1024;
            }
            if (!this.f11238e && (c4463m1.f16511x != c4463m12.f16511x || c4463m1.f16512y != c4463m12.f16512y)) {
                i10 |= 512;
            }
            if (!C4041n0.m15449c(c4463m1.f16484E, c4463m12.f16484E)) {
                i10 |= 2048;
            }
            if (m11569A(this.f11234a) && !c4463m1.m17414g(c4463m12)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C5112i(this.f11234a, c4463m1, c4463m12, c4463m1.m17414g(c4463m12) ? 3 : 2, 0);
            }
        } else {
            if (c4463m1.f16485F != c4463m12.f16485F) {
                i10 |= 4096;
            }
            if (c4463m1.f16486G != c4463m12.f16486G) {
                i10 |= 8192;
            }
            if (c4463m1.f16487H != c4463m12.f16487H) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f11235b)) {
                Pair<Integer, Integer> m11727q = C3243v.m11727q(c4463m1);
                Pair<Integer, Integer> m11727q2 = C3243v.m11727q(c4463m12);
                if (m11727q != null && m11727q2 != null) {
                    int intValue = ((Integer) m11727q.first).intValue();
                    int intValue2 = ((Integer) m11727q2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C5112i(this.f11234a, c4463m1, c4463m12, 3, 0);
                    }
                }
            }
            if (!c4463m1.m17414g(c4463m12)) {
                i10 |= 32;
            }
            if (m11586z(this.f11235b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C5112i(this.f11234a, c4463m1, c4463m12, 1, 0);
            }
        }
        return new C5112i(this.f11234a, c4463m1, c4463m12, 0, i10);
    }

    /* renamed from: h */
    public MediaCodecInfo.CodecProfileLevel[] m11589h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11237d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* renamed from: k */
    public boolean m11590k(int i10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11237d;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else {
                if (m11576b(this.f11234a, this.f11235b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
                    return true;
                }
                str = "channelCount.support, " + i10;
            }
        }
        m11600y(str);
        return false;
    }

    /* renamed from: l */
    public boolean m11591l(int i10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11237d;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else {
                if (audioCapabilities.isSampleRateSupported(i10)) {
                    return true;
                }
                str = "sampleRate.support, " + i10;
            }
        }
        m11600y(str);
        return false;
    }

    /* renamed from: m */
    public final boolean m11592m(C4463m1 c4463m1, boolean z10) {
        Pair<Integer, Integer> m11727q = C3243v.m11727q(c4463m1);
        if (m11727q == null) {
            return true;
        }
        int intValue = ((Integer) m11727q.first).intValue();
        int intValue2 = ((Integer) m11727q.second).intValue();
        if ("video/dolby-vision".equals(c4463m1.f16506s)) {
            if (!"video/avc".equals(this.f11235b)) {
                intValue = "video/hevc".equals(this.f11235b) ? 2 : 8;
            }
            intValue2 = 0;
        }
        if (!this.f11244k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] m11589h = m11589h();
        if (C4041n0.f14513a <= 23 && "video/x-vnd.on2.vp9".equals(this.f11235b) && m11589h.length == 0) {
            m11589h = m11579g(this.f11237d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m11589h) {
            if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z10) && !m11572D(this.f11235b, intValue))) {
                return true;
            }
        }
        m11600y("codec.profileLevel, " + c4463m1.f16503p + ", " + this.f11236c);
        return false;
    }

    /* renamed from: n */
    public boolean m11593n(C4463m1 c4463m1) {
        return m11596q(c4463m1) && m11592m(c4463m1, false);
    }

    /* renamed from: o */
    public boolean m11594o(C4463m1 c4463m1) {
        int i10;
        if (!m11596q(c4463m1) || !m11592m(c4463m1, true)) {
            return false;
        }
        if (!this.f11244k) {
            if (C4041n0.f14513a >= 21) {
                int i11 = c4463m1.f16486G;
                if (i11 != -1 && !m11591l(i11)) {
                    return false;
                }
                int i12 = c4463m1.f16485F;
                if (i12 != -1 && !m11590k(i12)) {
                    return false;
                }
            }
            return true;
        }
        int i13 = c4463m1.f16511x;
        if (i13 <= 0 || (i10 = c4463m1.f16512y) <= 0) {
            return true;
        }
        if (C4041n0.f14513a >= 21) {
            return m11598w(i13, i10, c4463m1.f16513z);
        }
        boolean z10 = i13 * i10 <= C3243v.m11706N();
        if (!z10) {
            m11600y("legacyFrameSize, " + c4463m1.f16511x + "x" + c4463m1.f16512y);
        }
        return z10;
    }

    /* renamed from: p */
    public boolean m11595p() {
        if (C4041n0.f14513a >= 29 && "video/x-vnd.on2.vp9".equals(this.f11235b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m11589h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m11596q(C4463m1 c4463m1) {
        return this.f11235b.equals(c4463m1.f16506s) || this.f11235b.equals(C3243v.m11723m(c4463m1));
    }

    /* renamed from: r */
    public boolean m11597r(C4463m1 c4463m1) {
        if (this.f11244k) {
            return this.f11238e;
        }
        Pair<Integer, Integer> m11727q = C3243v.m11727q(c4463m1);
        return m11727q != null && ((Integer) m11727q.first).intValue() == 42;
    }

    public String toString() {
        return this.f11234a;
    }

    /* renamed from: w */
    public boolean m11598w(int i10, int i11, double d10) {
        StringBuilder sb2;
        String str;
        String sb3;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11237d;
        if (codecCapabilities == null) {
            sb3 = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                if (C4041n0.f14513a >= 29) {
                    int m11601a = a.m11601a(videoCapabilities, i10, i11, d10);
                    if (m11601a == 2) {
                        return true;
                    }
                    if (m11601a == 1) {
                        sb2 = new StringBuilder();
                        str = "sizeAndRate.cover, ";
                        sb2.append(str);
                        sb2.append(i10);
                        sb2.append("x");
                        sb2.append(i11);
                        sb2.append("@");
                        sb2.append(d10);
                        sb3 = sb2.toString();
                    }
                }
                if (!m11578e(videoCapabilities, i10, i11, d10)) {
                    if (i10 < i11 && m11573E(this.f11234a) && m11578e(videoCapabilities, i11, i10, d10)) {
                        m11599x("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
                    } else {
                        sb2 = new StringBuilder();
                        str = "sizeAndRate.support, ";
                        sb2.append(str);
                        sb2.append(i10);
                        sb2.append("x");
                        sb2.append(i11);
                        sb2.append("@");
                        sb2.append(d10);
                        sb3 = sb2.toString();
                    }
                }
                return true;
            }
            sb3 = "sizeAndRate.vCaps";
        }
        m11600y(sb3);
        return false;
    }

    /* renamed from: x */
    public final void m11599x(String str) {
        C4046r.m15522b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f11234a + ", " + this.f11235b + "] [" + C4041n0.f14517e + "]");
    }

    /* renamed from: y */
    public final void m11600y(String str) {
        C4046r.m15522b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f11234a + ", " + this.f11235b + "] [" + C4041n0.f14517e + "]");
    }
}
