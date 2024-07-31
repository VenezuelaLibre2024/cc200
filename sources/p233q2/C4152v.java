package p233q2;

import com.arthenica.ffmpegkit.AbiDetect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: q2.v */
/* loaded from: classes.dex */
public class C4152v {

    /* renamed from: a */
    public static final List<String> f14943a;

    static {
        ArrayList arrayList = new ArrayList();
        f14943a = arrayList;
        arrayList.add("dav1d");
        arrayList.add("fontconfig");
        arrayList.add("freetype");
        arrayList.add("fribidi");
        arrayList.add("gmp");
        arrayList.add("gnutls");
        arrayList.add("kvazaar");
        arrayList.add("mp3lame");
        arrayList.add("libass");
        arrayList.add("iconv");
        arrayList.add("libilbc");
        arrayList.add("libtheora");
        arrayList.add("libvidstab");
        arrayList.add("libvorbis");
        arrayList.add("libvpx");
        arrayList.add("libwebp");
        arrayList.add("libxml2");
        arrayList.add("opencore-amr");
        arrayList.add("openh264");
        arrayList.add("openssl");
        arrayList.add("opus");
        arrayList.add("rubberband");
        arrayList.add("sdl2");
        arrayList.add("shine");
        arrayList.add("snappy");
        arrayList.add("soxr");
        arrayList.add("speex");
        arrayList.add("srt");
        arrayList.add("tesseract");
        arrayList.add("twolame");
        arrayList.add("x264");
        arrayList.add("x265");
        arrayList.add("xvid");
        arrayList.add("zimg");
    }

    /* renamed from: a */
    public static List<String> m15995a() {
        String nativeBuildConf = AbiDetect.getNativeBuildConf();
        ArrayList arrayList = new ArrayList();
        for (String str : f14943a) {
            if (!nativeBuildConf.contains("enable-" + str)) {
                if (nativeBuildConf.contains("enable-lib" + str)) {
                }
            }
            arrayList.add(str);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static String m15996b() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        List<String> m15995a = m15995a();
        boolean contains = m15995a.contains("speex");
        boolean contains2 = m15995a.contains("fribidi");
        boolean contains3 = m15995a.contains("gnutls");
        boolean contains4 = m15995a.contains("xvid");
        boolean z15 = true;
        boolean z16 = false;
        if (contains && contains2) {
            z10 = false;
            z11 = false;
            z13 = false;
            if (contains4) {
                z12 = false;
                z14 = false;
            } else {
                z12 = false;
                z14 = false;
                z16 = true;
                z15 = false;
            }
        } else {
            if (contains) {
                z11 = true;
                z10 = false;
                z13 = false;
            } else {
                if (contains2) {
                    z10 = true;
                    z11 = false;
                } else if (contains4) {
                    if (contains3) {
                        z13 = true;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        z15 = z12;
                        z14 = z15;
                    } else {
                        z14 = true;
                        z10 = false;
                        z11 = false;
                        z13 = false;
                        z12 = false;
                        z15 = false;
                    }
                } else if (contains3) {
                    z12 = true;
                    z10 = false;
                    z11 = false;
                    z13 = false;
                    z15 = false;
                    z14 = z15;
                } else {
                    z10 = false;
                    z11 = false;
                }
                z13 = z11;
            }
            z12 = z13;
            z15 = z12;
            z14 = z15;
        }
        return z15 ? (m15995a.contains("dav1d") && m15995a.contains("fontconfig") && m15995a.contains("freetype") && m15995a.contains("fribidi") && m15995a.contains("gmp") && m15995a.contains("gnutls") && m15995a.contains("kvazaar") && m15995a.contains("mp3lame") && m15995a.contains("libass") && m15995a.contains("iconv") && m15995a.contains("libilbc") && m15995a.contains("libtheora") && m15995a.contains("libvidstab") && m15995a.contains("libvorbis") && m15995a.contains("libvpx") && m15995a.contains("libwebp") && m15995a.contains("libxml2") && m15995a.contains("opencore-amr") && m15995a.contains("opus") && m15995a.contains("shine") && m15995a.contains("snappy") && m15995a.contains("soxr") && m15995a.contains("speex") && m15995a.contains("twolame") && m15995a.contains("x264") && m15995a.contains("x265") && m15995a.contains("xvid") && m15995a.contains("zimg")) ? "full-gpl" : "custom" : z16 ? (m15995a.contains("dav1d") && m15995a.contains("fontconfig") && m15995a.contains("freetype") && m15995a.contains("fribidi") && m15995a.contains("gmp") && m15995a.contains("gnutls") && m15995a.contains("kvazaar") && m15995a.contains("mp3lame") && m15995a.contains("libass") && m15995a.contains("iconv") && m15995a.contains("libilbc") && m15995a.contains("libtheora") && m15995a.contains("libvorbis") && m15995a.contains("libvpx") && m15995a.contains("libwebp") && m15995a.contains("libxml2") && m15995a.contains("opencore-amr") && m15995a.contains("opus") && m15995a.contains("shine") && m15995a.contains("snappy") && m15995a.contains("soxr") && m15995a.contains("speex") && m15995a.contains("twolame") && m15995a.contains("zimg")) ? "full" : "custom" : z10 ? (m15995a.contains("dav1d") && m15995a.contains("fontconfig") && m15995a.contains("freetype") && m15995a.contains("fribidi") && m15995a.contains("kvazaar") && m15995a.contains("libass") && m15995a.contains("iconv") && m15995a.contains("libtheora") && m15995a.contains("libvpx") && m15995a.contains("libwebp") && m15995a.contains("snappy") && m15995a.contains("zimg")) ? "video" : "custom" : z11 ? (m15995a.contains("mp3lame") && m15995a.contains("libilbc") && m15995a.contains("libvorbis") && m15995a.contains("opencore-amr") && m15995a.contains("opus") && m15995a.contains("shine") && m15995a.contains("soxr") && m15995a.contains("speex") && m15995a.contains("twolame")) ? "audio" : "custom" : z13 ? (m15995a.contains("gmp") && m15995a.contains("gnutls") && m15995a.contains("libvidstab") && m15995a.contains("x264") && m15995a.contains("x265") && m15995a.contains("xvid")) ? "https-gpl" : "custom" : z12 ? (m15995a.contains("gmp") && m15995a.contains("gnutls")) ? "https" : "custom" : z14 ? (m15995a.contains("libvidstab") && m15995a.contains("x264") && m15995a.contains("x265") && m15995a.contains("xvid")) ? "min-gpl" : "custom" : m15995a.size() == 0 ? "min" : "custom";
    }
}
