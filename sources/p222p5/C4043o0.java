package p222p5;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: p5.o0 */
/* loaded from: classes.dex */
public final class C4043o0 {
    /* renamed from: a */
    public static String m15497a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m15498b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (m15504h(xmlPullParser.getAttributeName(i10)).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m15499c(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: d */
    public static boolean m15500d(XmlPullParser xmlPullParser, String str) {
        return m15499c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: e */
    public static boolean m15501e(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: f */
    public static boolean m15502f(XmlPullParser xmlPullParser, String str) {
        return m15501e(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: g */
    public static boolean m15503g(XmlPullParser xmlPullParser, String str) {
        return m15501e(xmlPullParser) && m15504h(xmlPullParser.getName()).equals(str);
    }

    /* renamed from: h */
    public static String m15504h(String str) {
        int indexOf = str.indexOf(58);
        return indexOf == -1 ? str : str.substring(indexOf + 1);
    }
}
