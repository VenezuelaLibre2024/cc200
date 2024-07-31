package p031c4;

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p031c4.C0609b;
import p126i7.AbstractC2651u;
import p222p5.C4043o0;
import p222p5.C4046r;
import p264s3.C4499t2;

/* renamed from: c4.e */
/* loaded from: classes.dex */
public final class C0612e {

    /* renamed from: a */
    public static final String[] f2673a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    public static final String[] f2674b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    public static final String[] f2675c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static C0609b m3038a(String str) {
        try {
            return m3039b(str);
        } catch (NumberFormatException | XmlPullParserException | C4499t2 unused) {
            C4046r.m15529i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    public static C0609b m3039b(String str) {
        String str2;
        String str3;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!C4043o0.m15502f(newPullParser, "x:xmpmeta")) {
            throw C4499t2.m17594a("Couldn't find xmp metadata", null);
        }
        long j10 = -9223372036854775807L;
        AbstractC2651u<C0609b.a> m10770u = AbstractC2651u.m10770u();
        do {
            newPullParser.next();
            if (!C4043o0.m15502f(newPullParser, "rdf:Description")) {
                if (C4043o0.m15502f(newPullParser, "Container:Directory")) {
                    str2 = "Container";
                    str3 = "Item";
                } else if (C4043o0.m15502f(newPullParser, "GContainer:Directory")) {
                    str2 = "GContainer";
                    str3 = "GContainerItem";
                }
                m10770u = m3043f(newPullParser, str2, str3);
            } else {
                if (!m3041d(newPullParser)) {
                    return null;
                }
                j10 = m3042e(newPullParser);
                m10770u = m3040c(newPullParser);
            }
        } while (!C4043o0.m15500d(newPullParser, "x:xmpmeta"));
        if (m10770u.isEmpty()) {
            return null;
        }
        return new C0609b(j10, m10770u);
    }

    /* renamed from: c */
    public static AbstractC2651u<C0609b.a> m3040c(XmlPullParser xmlPullParser) {
        for (String str : f2675c) {
            String m15497a = C4043o0.m15497a(xmlPullParser, str);
            if (m15497a != null) {
                return AbstractC2651u.m10772w(new C0609b.a("image/jpeg", "Primary", 0L, 0L), new C0609b.a("video/mp4", "MotionPhoto", Long.parseLong(m15497a), 0L));
            }
        }
        return AbstractC2651u.m10770u();
    }

    /* renamed from: d */
    public static boolean m3041d(XmlPullParser xmlPullParser) {
        for (String str : f2673a) {
            String m15497a = C4043o0.m15497a(xmlPullParser, str);
            if (m15497a != null) {
                return Integer.parseInt(m15497a) == 1;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static long m3042e(XmlPullParser xmlPullParser) {
        for (String str : f2674b) {
            String m15497a = C4043o0.m15497a(xmlPullParser, str);
            if (m15497a != null) {
                long parseLong = Long.parseLong(m15497a);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    public static AbstractC2651u<C0609b.a> m3043f(XmlPullParser xmlPullParser, String str, String str2) {
        AbstractC2651u.a m10766n = AbstractC2651u.m10766n();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (C4043o0.m15502f(xmlPullParser, str3)) {
                String m15497a = C4043o0.m15497a(xmlPullParser, str2 + ":Mime");
                String m15497a2 = C4043o0.m15497a(xmlPullParser, str2 + ":Semantic");
                String m15497a3 = C4043o0.m15497a(xmlPullParser, str2 + ":Length");
                String m15497a4 = C4043o0.m15497a(xmlPullParser, str2 + ":Padding");
                if (m15497a == null || m15497a2 == null) {
                    return AbstractC2651u.m10770u();
                }
                m10766n.mo10749a(new C0609b.a(m15497a, m15497a2, m15497a3 != null ? Long.parseLong(m15497a3) : 0L, m15497a4 != null ? Long.parseLong(m15497a4) : 0L));
            }
        } while (!C4043o0.m15500d(xmlPullParser, str4));
        return m10766n.m10784k();
    }
}
