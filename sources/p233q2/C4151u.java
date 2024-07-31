package p233q2;

import android.os.Build;
import android.util.Log;
import com.arthenica.ffmpegkit.AbiDetect;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p274t2.C4614a;

/* renamed from: q2.u */
/* loaded from: classes.dex */
public class C4151u {

    /* renamed from: a */
    public static final String[] f14941a = {"avutil", "swscale", "swresample", "avcodec", "avformat", "avfilter", "avdevice"};

    /* renamed from: b */
    public static final String[] f14942b = {"chromaprint", "openh264", "rubberband", "snappy", "srt", "tesseract", "x265", "zimg", "libilbc"};

    /* renamed from: a */
    public static String m15981a() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("brand: ");
        sb2.append(Build.BRAND);
        sb2.append(", model: ");
        sb2.append(Build.MODEL);
        sb2.append(", device: ");
        sb2.append(Build.DEVICE);
        sb2.append(", api level: ");
        int i10 = Build.VERSION.SDK_INT;
        sb2.append(i10);
        if (i10 >= 21) {
            sb2.append(", abis: ");
            sb2.append(FFmpegKitConfig.m4641c(Build.SUPPORTED_ABIS));
            sb2.append(", 32bit abis: ");
            sb2.append(FFmpegKitConfig.m4641c(Build.SUPPORTED_32_BIT_ABIS));
            sb2.append(", 64bit abis: ");
            str = FFmpegKitConfig.m4641c(Build.SUPPORTED_64_BIT_ABIS);
        } else {
            sb2.append(", cpu abis: ");
            sb2.append(Build.CPU_ABI);
            sb2.append(", cpu abi2s: ");
            str = Build.CPU_ABI2;
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: b */
    public static boolean m15982b() {
        return System.getProperty("enable.ffmpeg.kit.test.mode") == null;
    }

    /* renamed from: c */
    public static String m15983c() {
        return m15982b() ? AbiDetect.m4615a() : EnumC4128a.ABI_X86_64.m15916c();
    }

    /* renamed from: d */
    public static String m15984d() {
        return m15982b() ? FFmpegKitConfig.m4658t() : new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
    }

    /* renamed from: e */
    public static List<String> m15985e() {
        return m15982b() ? C4152v.m15995a() : Collections.emptyList();
    }

    /* renamed from: f */
    public static boolean m15986f() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 21) {
            return false;
        }
        List<String> m15985e = m15985e();
        String[] strArr = f14942b;
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (m15985e.contains(strArr[i10])) {
                m15990j("c++_shared");
                break;
            }
            i10++;
        }
        boolean z11 = true;
        if ("arm-v7a".equals(m15992l())) {
            try {
                for (String str : f14941a) {
                    m15990j(str + "_neon");
                }
                z10 = false;
            } catch (Error e10) {
                Log.i("ffmpeg-kit", String.format("NEON supported armeabi-v7a ffmpeg library not found. Loading default armeabi-v7a library.%s", C4614a.m18192a(e10)));
                z10 = true;
                z11 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        if (!z11) {
            for (String str2 : f14941a) {
                m15990j(str2);
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m15987g(boolean r3) {
        /*
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L33
            java.lang.String r3 = m15992l()
            java.lang.String r2 = "arm-v7a"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L33
            java.lang.String r3 = "ffmpegkit_armv7a_neon"
            m15990j(r3)     // Catch: java.lang.Error -> L1c
            com.arthenica.ffmpegkit.AbiDetect.m4616b()     // Catch: java.lang.Error -> L19
            goto L34
        L19:
            r3 = move-exception
            r2 = r0
            goto L1e
        L1c:
            r3 = move-exception
            r2 = r1
        L1e:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = p274t2.C4614a.m18192a(r3)
            r0[r1] = r3
            java.lang.String r3 = "NEON supported armeabi-v7a ffmpegkit library not found. Loading default armeabi-v7a library.%s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r0 = "ffmpeg-kit"
            android.util.Log.i(r0, r3)
            r0 = r2
            goto L34
        L33:
            r0 = r1
        L34:
            if (r0 != 0) goto L3b
            java.lang.String r3 = "ffmpegkit"
            m15990j(r3)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p233q2.C4151u.m15987g(boolean):void");
    }

    /* renamed from: h */
    public static void m15988h() {
        m15990j("ffmpegkit_abidetect");
    }

    /* renamed from: i */
    public static boolean m15989i() {
        if (m15982b()) {
            return AbiDetect.isNativeLTSBuild();
        }
        return true;
    }

    /* renamed from: j */
    public static void m15990j(String str) {
        if (m15982b()) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e10) {
                throw new Error(String.format("FFmpegKit failed to start on %s.", m15981a()), e10);
            }
        }
    }

    /* renamed from: k */
    public static int m15991k() {
        return m15982b() ? FFmpegKitConfig.getNativeLogLevel() : EnumC4143m.AV_LOG_DEBUG.m15968f();
    }

    /* renamed from: l */
    public static String m15992l() {
        return m15982b() ? AbiDetect.getNativeAbi() : EnumC4128a.ABI_X86_64.m15916c();
    }

    /* renamed from: m */
    public static String m15993m() {
        return m15982b() ? C4152v.m15996b() : "test";
    }

    /* renamed from: n */
    public static String m15994n() {
        return m15982b() ? FFmpegKitConfig.m4628L() : m15989i() ? String.format("%s-lts", "6.0") : "6.0";
    }
}
