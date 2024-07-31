package p326wc;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wc.b */
/* loaded from: classes2.dex */
public class C5477b {

    /* renamed from: a */
    public static final Map<String, String> f20367a = new HashMap();

    static {
        m21703a("epub", "application/epub+zip");
        m21703a("ogx", "application/ogg");
        m21703a("odp", "application/vnd.oasis.opendocument.presentation");
        m21703a("otp", "application/vnd.oasis.opendocument.presentation-template");
        m21703a("yt", "application/vnd.youtube.yt");
        m21703a("hwp", "application/x-hwp");
        m21703a("3gpp", "video/3gpp");
        m21703a("3gp", "video/3gpp");
        m21703a("3gpp2", "video/3gpp2");
        m21703a("3g2", "video/3gpp2");
        m21703a("oga", "audio/ogg");
        m21703a("ogg", "audio/ogg");
        m21703a("spx", "audio/ogg");
        m21703a("dng", "image/x-adobe-dng");
        m21703a("cr2", "image/x-canon-cr2");
        m21703a("raf", "image/x-fuji-raf");
        m21703a("nef", "image/x-nikon-nef");
        m21703a("nrw", "image/x-nikon-nrw");
        m21703a("orf", "image/x-olympus-orf");
        m21703a("rw2", "image/x-panasonic-rw2");
        m21703a("pef", "image/x-pentax-pef");
        m21703a("srw", "image/x-samsung-srw");
        m21703a("arw", "image/x-sony-arw");
        m21703a("ogv", "video/ogg");
        m21703a("tgz", "application/x-gtar-compressed");
        m21703a("taz", "application/x-gtar-compressed");
        m21703a("csv", "text/csv");
        m21703a("gz", "application/gzip");
        m21703a("cab", "application/vnd.ms-cab-compressed");
        m21703a("7z", "application/x-7z-compressed");
        m21703a("bz", "application/x-bzip");
        m21703a("bz2", "application/x-bzip2");
        m21703a("z", "application/x-compress");
        m21703a("jar", "application/x-java-archive");
        m21703a("lzma", "application/x-lzma");
        m21703a("xz", "application/x-xz");
        m21703a("m3u", "audio/x-mpegurl");
        m21703a("m3u8", "audio/x-mpegurl");
        m21703a("p7b", "application/x-pkcs7-certificates");
        m21703a("spc", "application/x-pkcs7-certificates");
        m21703a("p7c", "application/pkcs7-mime");
        m21703a("p7s", "application/pkcs7-signature");
        m21703a("es", "application/ecmascript");
        m21703a("js", "application/javascript");
        m21703a("json", "application/json");
        m21703a("ts", "application/typescript");
        m21703a("perl", "text/x-perl");
        m21703a("pl", "text/x-perl");
        m21703a("pm", "text/x-perl");
        m21703a("py", "text/x-python");
        m21703a("py3", "text/x-python");
        m21703a("py3x", "text/x-python");
        m21703a("pyx", "text/x-python");
        m21703a("wsgi", "text/x-python");
        m21703a("rb", "text/ruby");
        m21703a("sh", "application/x-sh");
        m21703a("yaml", "text/x-yaml");
        m21703a("yml", "text/x-yaml");
        m21703a("asm", "text/x-asm");
        m21703a("s", "text/x-asm");
        m21703a("cs", "text/x-csharp");
        m21703a("azw", "application/vnd.amazon.ebook");
        m21703a("ibooks", "application/x-ibooks+zip");
        m21703a("mobi", "application/x-mobipocket-ebook");
        m21703a("woff", "font/woff");
        m21703a("woff2", "font/woff2");
        m21703a("msg", "application/vnd.ms-outlook");
        m21703a("eml", "message/rfc822");
        m21703a("eot", "application/vnd.ms-fontobject");
        m21703a("ttf", "font/ttf");
        m21703a("otf", "font/otf");
        m21703a("ttc", "font/collection");
        m21703a("markdown", "text/markdown");
        m21703a("md", "text/markdown");
        m21703a("mkd", "text/markdown");
        m21703a("conf", "text/plain");
        m21703a("ini", "text/plain");
        m21703a("list", "text/plain");
        m21703a("log", "text/plain");
        m21703a("prop", "text/plain");
        m21703a("properties", "text/plain");
        m21703a("rc", "text/plain");
        m21703a("flv", "video/x-flv");
    }

    /* renamed from: a */
    public static void m21703a(String str, String str2) {
        Map<String, String> map = f20367a;
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, str2);
    }

    /* renamed from: b */
    public static String m21704b(File file) {
        int lastIndexOf = file.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String lowerCase = file.getName().substring(lastIndexOf + 1).toLowerCase();
        String str = f20367a.get(lowerCase);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
        return !TextUtils.isEmpty(mimeTypeFromExtension) ? mimeTypeFromExtension : "application/octet-stream";
    }
}
