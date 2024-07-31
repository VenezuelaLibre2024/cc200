package p222p5;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import com.pichillilorenzo.flutter_inappwebview.Util;
import io.flutter.embedding.android.KeyboardMap;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p109h7.C2420c;
import p109h7.C2422e;
import p264s3.C4463m1;
import p264s3.C4499t2;
import p264s3.InterfaceC4409b3;

/* renamed from: p5.n0 */
/* loaded from: classes.dex */
public final class C4041n0 {

    /* renamed from: a */
    public static final int f14513a;

    /* renamed from: b */
    public static final String f14514b;

    /* renamed from: c */
    public static final String f14515c;

    /* renamed from: d */
    public static final String f14516d;

    /* renamed from: e */
    public static final String f14517e;

    /* renamed from: f */
    public static final byte[] f14518f;

    /* renamed from: g */
    public static final Pattern f14519g;

    /* renamed from: h */
    public static final Pattern f14520h;

    /* renamed from: i */
    public static final Pattern f14521i;

    /* renamed from: j */
    public static final Pattern f14522j;

    /* renamed from: k */
    public static HashMap<String, String> f14523k;

    /* renamed from: l */
    public static final String[] f14524l;

    /* renamed from: m */
    public static final String[] f14525m;

    /* renamed from: n */
    public static final int[] f14526n;

    /* renamed from: o */
    public static final int[] f14527o;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f14513a = i10;
        String str = Build.DEVICE;
        f14514b = str;
        String str2 = Build.MANUFACTURER;
        f14515c = str2;
        String str3 = Build.MODEL;
        f14516d = str3;
        f14517e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f14518f = new byte[0];
        f14519g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f14520h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f14521i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f14522j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f14524l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f14525m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f14526n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f14527o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 119, 126, 121, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 98, C1417R.styleable.AppCompatTheme_switchStyle, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, C1417R.styleable.AppCompatTheme_textColorSearchUrl, C1417R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 97, C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, C1417R.styleable.AppCompatTheme_tooltipFrameBackground, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, C1417R.styleable.AppCompatTheme_textAppearanceListItemSmall, C1417R.styleable.AppCompatTheme_textColorAlertDialogListItem, C1417R.styleable.AppCompatTheme_textAppearanceListItem, 96, 117, C1417R.styleable.AppCompatTheme_tooltipForegroundColor, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, C1417R.styleable.AppCompatTheme_toolbarStyle, 120, 127, C1417R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, C1417R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* renamed from: A */
    public static HashMap<String, String> m15393A() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f14524l.length);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f14524l;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    /* renamed from: A0 */
    public static <T> void m15394A0(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    /* renamed from: B */
    public static Uri m15395B(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f14522j.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    /* renamed from: B0 */
    public static long m15396B0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    /* renamed from: C */
    public static String m15397C(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: C0 */
    public static ExecutorService m15398C0(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: p5.m0

            /* renamed from: a */
            public final /* synthetic */ String f14512a;

            public /* synthetic */ ThreadFactoryC4039m0(String str2) {
                r1 = str2;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m15492x0;
                m15492x0 = C4041n0.m15492x0(r1, runnable);
                return m15492x0;
            }
        });
    }

    /* renamed from: D */
    public static String m15399D(byte[] bArr) {
        return new String(bArr, C2422e.f9747c);
    }

    /* renamed from: D0 */
    public static String m15400D0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String m9665e = C2420c.m9665e(str);
        String str2 = m15428R0(m9665e, "-")[0];
        if (f14523k == null) {
            f14523k = m15393A();
        }
        String str3 = f14523k.get(str2);
        if (str3 != null) {
            m9665e = str3 + m9665e.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? m15496z0(m9665e) : m9665e;
    }

    /* renamed from: E */
    public static String m15401E(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, C2422e.f9747c);
    }

    /* renamed from: E0 */
    public static <T> T[] m15402E0(T[] tArr, T t10) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t10;
        return (T[]) m15465k(copyOf);
    }

    /* renamed from: F */
    public static int m15403F(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: F0 */
    public static <T> T[] m15404F0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: G */
    public static int m15405G(int i10) {
        if (i10 == 12) {
            return 743676;
        }
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    /* renamed from: G0 */
    public static <T> T[] m15406G0(T[] tArr, int i10) {
        C4014a.m15195a(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    /* renamed from: H */
    public static InterfaceC4409b3.b m15407H(InterfaceC4409b3 interfaceC4409b3, InterfaceC4409b3.b bVar) {
        boolean mo17087g = interfaceC4409b3.mo17087g();
        boolean mo17099u = interfaceC4409b3.mo17099u();
        boolean mo17092n = interfaceC4409b3.mo17092n();
        boolean mo17102y = interfaceC4409b3.mo17102y();
        boolean mo17080I = interfaceC4409b3.mo17080I();
        boolean mo17074C = interfaceC4409b3.mo17074C();
        boolean m17676u = interfaceC4409b3.mo17077F().m17676u();
        boolean z10 = false;
        InterfaceC4409b3.b.a m17110d = new InterfaceC4409b3.b.a().m17108b(bVar).m17110d(4, !mo17087g).m17110d(5, mo17099u && !mo17087g).m17110d(6, mo17092n && !mo17087g).m17110d(7, !m17676u && (mo17092n || !mo17080I || mo17099u) && !mo17087g).m17110d(8, mo17102y && !mo17087g).m17110d(9, !m17676u && (mo17102y || (mo17080I && mo17074C)) && !mo17087g).m17110d(10, !mo17087g).m17110d(11, mo17099u && !mo17087g);
        if (mo17099u && !mo17087g) {
            z10 = true;
        }
        return m17110d.m17110d(12, z10).m17111e();
    }

    /* renamed from: H0 */
    public static <T> T[] m15408H0(T[] tArr, int i10, int i11) {
        C4014a.m15195a(i10 >= 0);
        C4014a.m15195a(i11 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    /* renamed from: I */
    public static int m15409I(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    /* renamed from: I0 */
    public static long m15410I0(String str) {
        Matcher matcher = f14519g.matcher(str);
        if (!matcher.matches()) {
            throw C4499t2.m17594a("Invalid date/time format: " + str, null);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - (i10 * 60000) : timeInMillis;
    }

    /* renamed from: J */
    public static byte[] m15411J(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    /* renamed from: J0 */
    public static long m15412J0(String str) {
        Matcher matcher = f14520h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return isEmpty ? -parseDouble6 : parseDouble6;
    }

    /* renamed from: K */
    public static int m15413K(String str, int i10) {
        int i11 = 0;
        for (String str2 : m15430S0(str)) {
            if (i10 == C4050v.m15556m(str2)) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: K0 */
    public static boolean m15414K0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: L */
    public static String m15415L(String str, int i10) {
        String[] m15430S0 = m15430S0(str);
        if (m15430S0.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : m15430S0) {
            if (i10 == C4050v.m15556m(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    /* renamed from: L0 */
    public static boolean m15416L0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: M */
    public static String m15417M(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    /* renamed from: M0 */
    public static <T> void m15418M0(List<T> list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    /* renamed from: N */
    public static String m15419N(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE)) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C2420c.m9666f(networkCountryIso);
            }
        }
        return C2420c.m9666f(Locale.getDefault().getCountry());
    }

    /* renamed from: N0 */
    public static long m15420N0(long j10, long j11, long j12) {
        if (j12 >= j11 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return j10 * (j11 / j12);
        }
        return (long) (j10 * (j11 / j12));
    }

    /* renamed from: O */
    public static Point m15421O(Context context) {
        DisplayManager displayManager;
        Display display = (f14513a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) C4014a.m15199e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return m15423P(context, display);
    }

    /* renamed from: O0 */
    public static long[] m15422O0(List<Long> list, long j10, long j11) {
        int size = list.size();
        long[] jArr = new long[size];
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < size) {
                jArr[i10] = list.get(i10).longValue() / j12;
                i10++;
            }
        } else if (j11 >= j10 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = (long) (list.get(i10).longValue() * d10);
                i10++;
            }
        } else {
            long j13 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = list.get(i10).longValue() * j13;
                i10++;
            }
        }
        return jArr;
    }

    /* renamed from: P */
    public static Point m15423P(Context context, Display display) {
        if (display.getDisplayId() == 0 && m15490w0(context)) {
            String m15464j0 = m15464j0(f14513a < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(m15464j0)) {
                try {
                    String[] m15426Q0 = m15426Q0(m15464j0.trim(), "x");
                    if (m15426Q0.length == 2) {
                        int parseInt = Integer.parseInt(m15426Q0[0]);
                        int parseInt2 = Integer.parseInt(m15426Q0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                C4046r.m15523c(Util.LOG_TAG, "Invalid display size: " + m15464j0);
            }
            if ("Sony".equals(f14515c) && f14516d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i10 = f14513a;
        if (i10 >= 23) {
            m15431T(display, point);
        } else if (i10 >= 17) {
            m15429S(display, point);
        } else {
            m15427R(display, point);
        }
        return point;
    }

    /* renamed from: P0 */
    public static void m15424P0(long[] jArr, long j10, long j11) {
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
            return;
        }
        if (j11 >= j10 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = (long) (jArr[i10] * d10);
                i10++;
            }
            return;
        }
        long j13 = j10 / j11;
        while (i10 < jArr.length) {
            jArr[i10] = jArr[i10] * j13;
            i10++;
        }
    }

    /* renamed from: Q */
    public static Looper m15425Q() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* renamed from: Q0 */
    public static String[] m15426Q0(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: R */
    public static void m15427R(Display display, Point point) {
        display.getSize(point);
    }

    /* renamed from: R0 */
    public static String[] m15428R0(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: S */
    public static void m15429S(Display display, Point point) {
        display.getRealSize(point);
    }

    /* renamed from: S0 */
    public static String[] m15430S0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : m15426Q0(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: T */
    public static void m15431T(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    /* renamed from: T0 */
    public static long m15432T0(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    /* renamed from: U */
    public static int m15433U(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* renamed from: U0 */
    public static byte[] m15434U0(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: V */
    public static int m15435V(String str) {
        String[] m15426Q0;
        int length;
        if (str == null || (length = (m15426Q0 = m15426Q0(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = m15426Q0[length - 1];
        boolean z10 = length >= 3 && "neg".equals(m15426Q0[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) C4014a.m15199e(str2));
            return z10 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: V0 */
    public static long m15436V0(int i10, int i11) {
        return m15438W0(i11) | (m15438W0(i10) << 32);
    }

    /* renamed from: W */
    public static String m15437W(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* renamed from: W0 */
    public static long m15438W0(int i10) {
        return i10 & KeyboardMap.kValueMask;
    }

    /* renamed from: X */
    public static String m15439X(Locale locale) {
        return f14513a >= 21 ? m15441Y(locale) : locale.toString();
    }

    /* renamed from: X0 */
    public static CharSequence m15440X0(CharSequence charSequence, int i10) {
        return charSequence.length() <= i10 ? charSequence : charSequence.subSequence(0, i10);
    }

    /* renamed from: Y */
    public static String m15441Y(Locale locale) {
        return locale.toLanguageTag();
    }

    /* renamed from: Y0 */
    public static long m15442Y0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    /* renamed from: Z */
    public static long m15443Z(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    /* renamed from: Z0 */
    public static void m15444Z0(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* renamed from: a0 */
    public static long m15446a0(long j10) {
        return j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public static long m15447b(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    /* renamed from: b0 */
    public static int m15448b0(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* renamed from: c */
    public static boolean m15449c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c0 */
    public static C4463m1 m15450c0(int i10, int i11, int i12) {
        return new C4463m1.b().m17474g0("audio/raw").m17451J(i11).m17475h0(i12).m17468a0(i10).m17448G();
    }

    /* renamed from: d */
    public static <T extends Comparable<? super T>> int m15451d(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Collections.binarySearch(list, t10);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t10) == 0);
            i10 = z10 ? binarySearch - 1 : binarySearch;
        }
        return z11 ? Math.min(list.size() - 1, i10) : i10;
    }

    /* renamed from: d0 */
    public static int m15452d0(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 268435456) {
                    if (i10 == 536870912) {
                        return i11 * 3;
                    }
                    if (i10 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m15453e(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L8
            int r4 = ~r0
            goto L1a
        L8:
            int r0 = r0 + 1
            int r1 = r3.length
            if (r0 >= r1) goto L14
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L14
            goto L8
        L14:
            if (r6 == 0) goto L19
            int r4 = r0 + (-1)
            goto L1a
        L19:
            r4 = r0
        L1a:
            if (r7 == 0) goto L23
            int r3 = r3.length
            int r3 = r3 + (-1)
            int r4 = java.lang.Math.min(r3, r4)
        L23:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p222p5.C4041n0.m15453e(long[], long, boolean, boolean):int");
    }

    /* renamed from: e0 */
    public static long m15454e0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends java.lang.Comparable<? super T>> int m15455f(java.util.List<? extends java.lang.Comparable<? super T>> r2, T r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L21
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L1b
            goto La
        L1b:
            if (r4 == 0) goto L20
            int r2 = r0 + 1
            goto L21
        L20:
            r2 = r0
        L21:
            if (r5 == 0) goto L28
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p222p5.C4041n0.m15455f(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    /* renamed from: f0 */
    public static int m15456f0(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
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
            default:
                return 3;
        }
    }

    /* renamed from: g */
    public static int m15457g(C4047s c4047s, long j10, boolean z10, boolean z11) {
        int i10;
        int m15537c = c4047s.m15537c() - 1;
        int i11 = 0;
        while (i11 <= m15537c) {
            int i12 = (i11 + m15537c) >>> 1;
            if (c4047s.m15536b(i12) < j10) {
                i11 = i12 + 1;
            } else {
                m15537c = i12 - 1;
            }
        }
        if (z10 && (i10 = m15537c + 1) < c4047s.m15537c() && c4047s.m15536b(i10) == j10) {
            return i10;
        }
        if (z11 && m15537c == -1) {
            return 0;
        }
        return m15537c;
    }

    /* renamed from: g0 */
    public static String[] m15458g0() {
        String[] m15460h0 = m15460h0();
        for (int i10 = 0; i10 < m15460h0.length; i10++) {
            m15460h0[i10] = m15400D0(m15460h0[i10]);
        }
        return m15460h0;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m15459h(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L19
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L13
            r1 = r2[r0]
            if (r1 != r3) goto L13
            goto La
        L13:
            if (r4 == 0) goto L18
            int r2 = r0 + 1
            goto L19
        L18:
            r2 = r0
        L19:
            if (r5 == 0) goto L20
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p222p5.C4041n0.m15459h(int[], int, boolean, boolean):int");
    }

    /* renamed from: h0 */
    public static String[] m15460h0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f14513a >= 24 ? m15462i0(configuration) : new String[]{m15439X(configuration.locale)};
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m15461i(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r3 = -r0
            goto L1b
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L15
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L15
            goto La
        L15:
            if (r6 == 0) goto L1a
            int r3 = r0 + 1
            goto L1b
        L1a:
            r3 = r0
        L1b:
            if (r7 == 0) goto L22
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L22:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p222p5.C4041n0.m15461i(long[], long, boolean, boolean):int");
    }

    /* renamed from: i0 */
    public static String[] m15462i0(Configuration configuration) {
        return m15426Q0(configuration.getLocales().toLanguageTags(), ",");
    }

    /* renamed from: j */
    public static <T> T m15463j(T t10) {
        return t10;
    }

    /* renamed from: j0 */
    public static String m15464j0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            C4046r.m15524d(Util.LOG_TAG, "Failed to read system property " + str, e10);
            return null;
        }
    }

    /* renamed from: k */
    public static <T> T[] m15465k(T[] tArr) {
        return tArr;
    }

    /* renamed from: k0 */
    public static String m15466k0(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i10 < 10000) {
                    return "?";
                }
                return "custom (" + i10 + ")";
        }
    }

    /* renamed from: l */
    public static int m15467l(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    /* renamed from: l0 */
    public static byte[] m15468l0(String str) {
        return str.getBytes(C2422e.f9747c);
    }

    /* renamed from: m */
    public static long m15469m(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    /* renamed from: m0 */
    public static int m15470m0(Uri uri) {
        int m15472n0;
        String scheme = uri.getScheme();
        if (scheme != null && C2420c.m9661a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (m15472n0 = m15472n0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return m15472n0;
        }
        Matcher matcher = f14522j.matcher((CharSequence) C4014a.m15199e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    /* renamed from: n */
    public static void m15471n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: n0 */
    public static int m15472n0(String str) {
        String m9665e = C2420c.m9665e(str);
        m9665e.hashCode();
        char c10 = 65535;
        switch (m9665e.hashCode()) {
            case 104579:
                if (m9665e.equals("ism")) {
                    c10 = 0;
                    break;
                }
                break;
            case 108321:
                if (m9665e.equals("mpd")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3242057:
                if (m9665e.equals("isml")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3299913:
                if (m9665e.equals("m3u8")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 2:
                return 1;
            case 1:
                return 0;
            case 3:
                return 2;
            default:
                return 4;
        }
    }

    /* renamed from: o */
    public static int m15473o(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    /* renamed from: o0 */
    public static int m15474o0(Uri uri, String str) {
        if (str == null) {
            return m15470m0(uri);
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c10 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c10 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    /* renamed from: p */
    public static float m15475p(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    /* renamed from: p0 */
    public static boolean m15476p0(C4015a0 c4015a0, C4015a0 c4015a02, Inflater inflater) {
        if (c4015a0.m15226a() <= 0) {
            return false;
        }
        if (c4015a02.m15227b() < c4015a0.m15226a()) {
            c4015a02.m15228c(c4015a0.m15226a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c4015a0.m15230e(), c4015a0.m15231f(), c4015a0.m15226a());
        int i10 = 0;
        while (true) {
            try {
                i10 += inflater.inflate(c4015a02.m15230e(), i10, c4015a02.m15227b() - i10);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i10 == c4015a02.m15227b()) {
                        c4015a02.m15228c(c4015a02.m15227b() * 2);
                    }
                } else {
                    c4015a02.m15222S(i10);
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* renamed from: q */
    public static int m15477q(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    /* renamed from: q0 */
    public static String m15478q0(int i10) {
        return Integer.toString(i10, 36);
    }

    /* renamed from: r */
    public static long m15479r(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    /* renamed from: r0 */
    public static boolean m15480r0(Context context) {
        return f14513a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    /* renamed from: s */
    public static boolean m15481s(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (m15449c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s0 */
    public static boolean m15482s0(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    /* renamed from: t */
    public static int m15483t(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f14526n[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    /* renamed from: t0 */
    public static boolean m15484t0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    /* renamed from: u */
    public static int m15485u(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f14527o[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    /* renamed from: u0 */
    public static boolean m15486u0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    /* renamed from: v */
    public static Handler m15487v(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: v0 */
    public static boolean m15488v0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || io.flutter.plugins.firebase.crashlytics.Constants.FILE.equals(scheme);
    }

    /* renamed from: w */
    public static Handler m15489w() {
        return m15491x(null);
    }

    /* renamed from: w0 */
    public static boolean m15490w0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: x */
    public static Handler m15491x(Handler.Callback callback) {
        return m15487v((Looper) C4014a.m15202h(Looper.myLooper()), callback);
    }

    /* renamed from: x0 */
    public static /* synthetic */ Thread m15492x0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* renamed from: y */
    public static Handler m15493y() {
        return m15495z(null);
    }

    /* renamed from: y0 */
    public static int m15494y0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: z */
    public static Handler m15495z(Handler.Callback callback) {
        return m15487v(m15425Q(), callback);
    }

    /* renamed from: z0 */
    public static String m15496z0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f14525m;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }
}
