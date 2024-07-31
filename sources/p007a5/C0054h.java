package p007a5;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p264s3.C4463m1;
import p276t4.C4691c;
import p317w3.C5247m;

/* renamed from: a5.h */
/* loaded from: classes.dex */
public class C0054h extends AbstractC0055i {

    /* renamed from: n */
    public static final C0054h f169n = new C0054h("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d */
    public final List<Uri> f170d;

    /* renamed from: e */
    public final List<b> f171e;

    /* renamed from: f */
    public final List<a> f172f;

    /* renamed from: g */
    public final List<a> f173g;

    /* renamed from: h */
    public final List<a> f174h;

    /* renamed from: i */
    public final List<a> f175i;

    /* renamed from: j */
    public final C4463m1 f176j;

    /* renamed from: k */
    public final List<C4463m1> f177k;

    /* renamed from: l */
    public final Map<String, String> f178l;

    /* renamed from: m */
    public final List<C5247m> f179m;

    /* renamed from: a5.h$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Uri f180a;

        /* renamed from: b */
        public final C4463m1 f181b;

        /* renamed from: c */
        public final String f182c;

        /* renamed from: d */
        public final String f183d;

        public a(Uri uri, C4463m1 c4463m1, String str, String str2) {
            this.f180a = uri;
            this.f181b = c4463m1;
            this.f182c = str;
            this.f183d = str2;
        }
    }

    /* renamed from: a5.h$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final Uri f184a;

        /* renamed from: b */
        public final C4463m1 f185b;

        /* renamed from: c */
        public final String f186c;

        /* renamed from: d */
        public final String f187d;

        /* renamed from: e */
        public final String f188e;

        /* renamed from: f */
        public final String f189f;

        public b(Uri uri, C4463m1 c4463m1, String str, String str2, String str3, String str4) {
            this.f184a = uri;
            this.f185b = c4463m1;
            this.f186c = str;
            this.f187d = str2;
            this.f188e = str3;
            this.f189f = str4;
        }

        /* renamed from: b */
        public static b m261b(Uri uri) {
            return new b(uri, new C4463m1.b().m17462U("0").m17454M("application/x-mpegURL").m17448G(), null, null, null, null);
        }

        /* renamed from: a */
        public b m262a(C4463m1 c4463m1) {
            return new b(this.f184a, c4463m1, this.f186c, this.f187d, this.f188e, this.f189f);
        }
    }

    public C0054h(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, C4463m1 c4463m1, List<C4463m1> list7, boolean z10, Map<String, String> map, List<C5247m> list8) {
        super(str, list, z10);
        this.f170d = Collections.unmodifiableList(m259f(list2, list3, list4, list5, list6));
        this.f171e = Collections.unmodifiableList(list2);
        this.f172f = Collections.unmodifiableList(list3);
        this.f173g = Collections.unmodifiableList(list4);
        this.f174h = Collections.unmodifiableList(list5);
        this.f175i = Collections.unmodifiableList(list6);
        this.f176j = c4463m1;
        this.f177k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f178l = Collections.unmodifiableMap(map);
        this.f179m = Collections.unmodifiableList(list8);
    }

    /* renamed from: b */
    public static void m256b(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f180a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* renamed from: d */
    public static <T> List<T> m257d(List<T> list, int i10, List<C4691c> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    C4691c c4691c = list2.get(i12);
                    if (c4691c.f17523i == i10 && c4691c.f17524j == i11) {
                        arrayList.add(t10);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static C0054h m258e(String str) {
        return new C0054h("", Collections.emptyList(), Collections.singletonList(b.m261b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    /* renamed from: f */
    public static List<Uri> m259f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f184a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m256b(list2, arrayList);
        m256b(list3, arrayList);
        m256b(list4, arrayList);
        m256b(list5, arrayList);
        return arrayList;
    }

    @Override // p276t4.InterfaceC4689a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0054h mo247a(List<C4691c> list) {
        return new C0054h(this.f190a, this.f191b, m257d(this.f171e, 0, list), Collections.emptyList(), m257d(this.f173g, 1, list), m257d(this.f174h, 2, list), Collections.emptyList(), this.f176j, this.f177k, this.f192c, this.f178l, this.f179m);
    }
}
