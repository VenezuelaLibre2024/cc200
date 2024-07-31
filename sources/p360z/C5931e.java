package p360z;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p102h0.C2277e;
import p313w.C5190i;

/* renamed from: z.e */
/* loaded from: classes.dex */
public class C5931e {

    /* renamed from: z.e$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static int m23726a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* renamed from: z.e$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* renamed from: z.e$c */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a */
        public final d[] f22041a;

        public c(d[] dVarArr) {
            this.f22041a = dVarArr;
        }

        /* renamed from: a */
        public d[] m23727a() {
            return this.f22041a;
        }
    }

    /* renamed from: z.e$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final String f22042a;

        /* renamed from: b */
        public final int f22043b;

        /* renamed from: c */
        public final boolean f22044c;

        /* renamed from: d */
        public final String f22045d;

        /* renamed from: e */
        public final int f22046e;

        /* renamed from: f */
        public final int f22047f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f22042a = str;
            this.f22043b = i10;
            this.f22044c = z10;
            this.f22045d = str2;
            this.f22046e = i11;
            this.f22047f = i12;
        }

        /* renamed from: a */
        public String m23728a() {
            return this.f22042a;
        }

        /* renamed from: b */
        public int m23729b() {
            return this.f22047f;
        }

        /* renamed from: c */
        public int m23730c() {
            return this.f22046e;
        }

        /* renamed from: d */
        public String m23731d() {
            return this.f22045d;
        }

        /* renamed from: e */
        public int m23732e() {
            return this.f22043b;
        }

        /* renamed from: f */
        public boolean m23733f() {
            return this.f22044c;
        }
    }

    /* renamed from: z.e$e */
    /* loaded from: classes.dex */
    public static final class e implements b {

        /* renamed from: a */
        public final C2277e f22048a;

        /* renamed from: b */
        public final int f22049b;

        /* renamed from: c */
        public final int f22050c;

        /* renamed from: d */
        public final String f22051d;

        public e(C2277e c2277e, int i10, int i11, String str) {
            this.f22048a = c2277e;
            this.f22050c = i10;
            this.f22049b = i11;
            this.f22051d = str;
        }

        /* renamed from: a */
        public int m23734a() {
            return this.f22050c;
        }

        /* renamed from: b */
        public C2277e m23735b() {
            return this.f22048a;
        }

        /* renamed from: c */
        public String m23736c() {
            return this.f22051d;
        }

        /* renamed from: d */
        public int m23737d() {
            return this.f22049b;
        }
    }

    /* renamed from: a */
    public static int m23718a(TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.m23726a(typedArray, i10);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        return typedValue.type;
    }

    /* renamed from: b */
    public static b m23719b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m23721d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m23720c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m23718a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(m23725h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m23725h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    public static b m23721d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m23722e(xmlPullParser, resources);
        }
        m23724g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    public static b m23722e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C5190i.f19693h);
        String string = obtainAttributes.getString(C5190i.f19694i);
        String string2 = obtainAttributes.getString(C5190i.f19698m);
        String string3 = obtainAttributes.getString(C5190i.f19699n);
        int resourceId = obtainAttributes.getResourceId(C5190i.f19695j, 0);
        int integer = obtainAttributes.getInteger(C5190i.f19696k, 1);
        int integer2 = obtainAttributes.getInteger(C5190i.f19697l, 500);
        String string4 = obtainAttributes.getString(C5190i.f19700o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m23724g(xmlPullParser);
            }
            return new e(new C2277e(string, string2, string3, m23720c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m23723f(xmlPullParser, resources));
                } else {
                    m23724g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    /* renamed from: f */
    public static d m23723f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C5190i.f19701p);
        int i10 = C5190i.f19710y;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = C5190i.f19703r;
        }
        int i11 = obtainAttributes.getInt(i10, 400);
        int i12 = C5190i.f19708w;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = C5190i.f19704s;
        }
        boolean z10 = 1 == obtainAttributes.getInt(i12, 0);
        int i13 = C5190i.f19711z;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = C5190i.f19705t;
        }
        int i14 = C5190i.f19709x;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = C5190i.f19706u;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = C5190i.f19707v;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = C5190i.f19702q;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m23724g(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    /* renamed from: g */
    public static void m23724g(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    /* renamed from: h */
    public static List<byte[]> m23725h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
