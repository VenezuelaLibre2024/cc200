package p222p5;

import android.text.TextUtils;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p109h7.C2420c;

/* renamed from: p5.v */
/* loaded from: classes.dex */
public final class C4050v {

    /* renamed from: a */
    public static final ArrayList<a> f14552a = new ArrayList<>();

    /* renamed from: b */
    public static final Pattern f14553b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: p5.v$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f14554a;

        /* renamed from: b */
        public final String f14555b;

        /* renamed from: c */
        public final int f14556c;
    }

    /* renamed from: p5.v$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f14557a;

        /* renamed from: b */
        public final int f14558b;

        public b(int i10, int i11) {
            this.f14557a = i10;
            this.f14558b = i11;
        }

        /* renamed from: a */
        public int m15564a() {
            int i10 = this.f14558b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    /* renamed from: a */
    public static boolean m15544a(String str, String str2) {
        b m15552i;
        int m15564a;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                return (str2 == null || (m15552i = m15552i(str2)) == null || (m15564a = m15552i.m15564a()) == 0 || m15564a == 16) ? false : true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static boolean m15545b(String str, String str2) {
        return m15547d(str, str2) != null;
    }

    /* renamed from: c */
    public static String m15546c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C4041n0.m15430S0(str)) {
            String m15550g = m15550g(str2);
            if (m15550g != null && m15558o(m15550g)) {
                return m15550g;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m15547d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] m15430S0 = C4041n0.m15430S0(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : m15430S0) {
            if (str2.equals(m15550g(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    /* renamed from: e */
    public static String m15548e(String str) {
        int size = f14552a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f14552a.get(i10);
            if (str.startsWith(aVar.f14555b)) {
                return aVar.f14554a;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static int m15549f(String str, String str2) {
        b m15552i;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (m15552i = m15552i(str2)) == null) {
                    return 0;
                }
                return m15552i.m15564a();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 20;
            case '\b':
                return 8;
            case '\t':
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: g */
    public static String m15550g(String str) {
        b m15552i;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String m9665e = C2420c.m9665e(str.trim());
        if (m9665e.startsWith("avc1") || m9665e.startsWith("avc3")) {
            return "video/avc";
        }
        if (m9665e.startsWith("hev1") || m9665e.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (m9665e.startsWith("dvav") || m9665e.startsWith("dva1") || m9665e.startsWith("dvhe") || m9665e.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (m9665e.startsWith("av01")) {
            return "video/av01";
        }
        if (m9665e.startsWith("vp9") || m9665e.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (m9665e.startsWith("vp8") || m9665e.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!m9665e.startsWith("mp4a")) {
            return m9665e.startsWith("mha1") ? "audio/mha1" : m9665e.startsWith("mhm1") ? "audio/mhm1" : (m9665e.startsWith("ac-3") || m9665e.startsWith("dac3")) ? "audio/ac3" : (m9665e.startsWith("ec-3") || m9665e.startsWith("dec3")) ? "audio/eac3" : m9665e.startsWith("ec+3") ? "audio/eac3-joc" : (m9665e.startsWith("ac-4") || m9665e.startsWith("dac4")) ? "audio/ac4" : m9665e.startsWith("dtsc") ? "audio/vnd.dts" : m9665e.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (m9665e.startsWith("dtsh") || m9665e.startsWith("dtsl")) ? "audio/vnd.dts.hd" : m9665e.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : m9665e.startsWith("opus") ? "audio/opus" : m9665e.startsWith("vorbis") ? "audio/vorbis" : m9665e.startsWith("flac") ? "audio/flac" : m9665e.startsWith("stpp") ? "application/ttml+xml" : m9665e.startsWith("wvtt") ? "text/vtt" : m9665e.contains("cea708") ? "application/cea-708" : (m9665e.contains("eia608") || m9665e.contains("cea608")) ? "application/cea-608" : m15548e(m9665e);
        }
        if (m9665e.startsWith("mp4a.") && (m15552i = m15552i(m9665e)) != null) {
            str2 = m15551h(m15552i.f14557a);
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    /* renamed from: h */
    public static String m15551h(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case C1417R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
            case C1417R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
            case C1417R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
            case C1417R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
            case 100:
            case C1417R.styleable.AppCompatTheme_switchStyle /* 101 */:
                return "video/mpeg2";
            case C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
            case C1417R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
            case C1417R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                return "audio/mp4a-latm";
            case C1417R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
            case C1417R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                return "audio/mpeg";
            case C1417R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: i */
    public static b m15552i(String str) {
        Matcher matcher = f14553b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C4014a.m15199e(matcher.group(1));
        String group = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), group != null ? Integer.parseInt(group) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static String m15553j(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: k */
    public static int m15554k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m15558o(str)) {
            return 1;
        }
        if (m15562s(str)) {
            return 2;
        }
        if (m15561r(str)) {
            return 3;
        }
        if (m15559p(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m15555l(str);
    }

    /* renamed from: l */
    public static int m15555l(String str) {
        int size = f14552a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f14552a.get(i10);
            if (str.equals(aVar.f14554a)) {
                return aVar.f14556c;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public static int m15556m(String str) {
        return m15554k(m15550g(str));
    }

    /* renamed from: n */
    public static String m15557n(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C4041n0.m15430S0(str)) {
            String m15550g = m15550g(str2);
            if (m15550g != null && m15562s(m15550g)) {
                return m15550g;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m15558o(String str) {
        return "audio".equals(m15553j(str));
    }

    /* renamed from: p */
    public static boolean m15559p(String str) {
        return "image".equals(m15553j(str));
    }

    /* renamed from: q */
    public static boolean m15560q(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    /* renamed from: r */
    public static boolean m15561r(String str) {
        return "text".equals(m15553j(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: s */
    public static boolean m15562s(String str) {
        return "video".equals(m15553j(str));
    }

    /* renamed from: t */
    public static String m15563t(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c10 = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "audio/flac";
            case 1:
                return "audio/wav";
            case 2:
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
