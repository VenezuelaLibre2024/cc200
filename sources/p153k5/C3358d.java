package p153k5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p047d5.C1547b;
import p222p5.C4014a;

/* renamed from: k5.d */
/* loaded from: classes.dex */
public final class C3358d {

    /* renamed from: a */
    public final String f11696a;

    /* renamed from: b */
    public final String f11697b;

    /* renamed from: c */
    public final boolean f11698c;

    /* renamed from: d */
    public final long f11699d;

    /* renamed from: e */
    public final long f11700e;

    /* renamed from: f */
    public final C3361g f11701f;

    /* renamed from: g */
    public final String[] f11702g;

    /* renamed from: h */
    public final String f11703h;

    /* renamed from: i */
    public final String f11704i;

    /* renamed from: j */
    public final C3358d f11705j;

    /* renamed from: k */
    public final HashMap<String, Integer> f11706k;

    /* renamed from: l */
    public final HashMap<String, Integer> f11707l;

    /* renamed from: m */
    public List<C3358d> f11708m;

    public C3358d(String str, String str2, long j10, long j11, C3361g c3361g, String[] strArr, String str3, String str4, C3358d c3358d) {
        this.f11696a = str;
        this.f11697b = str2;
        this.f11704i = str4;
        this.f11701f = c3361g;
        this.f11702g = strArr;
        this.f11698c = str2 != null;
        this.f11699d = j10;
        this.f11700e = j11;
        this.f11703h = (String) C4014a.m15199e(str3);
        this.f11705j = c3358d;
        this.f11706k = new HashMap<>();
        this.f11707l = new HashMap<>();
    }

    /* renamed from: c */
    public static C3358d m12447c(String str, long j10, long j11, C3361g c3361g, String[] strArr, String str2, String str3, C3358d c3358d) {
        return new C3358d(str, null, j10, j11, c3361g, strArr, str2, str3, c3358d);
    }

    /* renamed from: d */
    public static C3358d m12448d(String str) {
        return new C3358d(null, C3360f.m12464b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: e */
    public static void m12449e(SpannableStringBuilder spannableStringBuilder) {
        for (C3355a c3355a : (C3355a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C3355a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c3355a), spannableStringBuilder.getSpanEnd(c3355a), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    /* renamed from: k */
    public static SpannableStringBuilder m12450k(String str, Map<String, C1547b.b> map) {
        if (!map.containsKey(str)) {
            C1547b.b bVar = new C1547b.b();
            bVar.m6332o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) C4014a.m15199e(map.get(str).m6322e());
    }

    /* renamed from: a */
    public void m12451a(C3358d c3358d) {
        if (this.f11708m == null) {
            this.f11708m = new ArrayList();
        }
        this.f11708m.add(c3358d);
    }

    /* renamed from: b */
    public final void m12452b(Map<String, C3361g> map, C1547b.b bVar, int i10, int i11, int i12) {
        C3361g m12468f = C3360f.m12468f(this.f11701f, this.f11702g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.m6322e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.m6332o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (m12468f != null) {
            C3360f.m12463a(spannableStringBuilder2, i10, i11, m12468f, this.f11705j, map, i12);
            if ("p".equals(this.f11696a)) {
                if (m12468f.m12490k() != Float.MAX_VALUE) {
                    bVar.m6330m((m12468f.m12490k() * (-90.0f)) / 100.0f);
                }
                if (m12468f.m12492m() != null) {
                    bVar.m6333p(m12468f.m12492m());
                }
                if (m12468f.m12487h() != null) {
                    bVar.m6327j(m12468f.m12487h());
                }
            }
        }
    }

    /* renamed from: f */
    public C3358d m12453f(int i10) {
        List<C3358d> list = this.f11708m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int m12454g() {
        List<C3358d> list = this.f11708m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public List<C1547b> m12455h(long j10, Map<String, C3361g> map, Map<String, C3359e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        m12460n(j10, this.f11703h, arrayList);
        TreeMap treeMap = new TreeMap();
        m12462p(j10, false, this.f11703h, treeMap);
        m12461o(j10, map, map2, this.f11703h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C3359e c3359e = (C3359e) C4014a.m15199e(map2.get(pair.first));
                arrayList2.add(new C1547b.b().m6323f(decodeByteArray).m6328k(c3359e.f11710b).m6329l(0).m6325h(c3359e.f11711c, 0).m6326i(c3359e.f11713e).m6331n(c3359e.f11714f).m6324g(c3359e.f11715g).m6335r(c3359e.f11718j).m6318a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C3359e c3359e2 = (C3359e) C4014a.m15199e(map2.get(entry.getKey()));
            C1547b.b bVar = (C1547b.b) entry.getValue();
            m12449e((SpannableStringBuilder) C4014a.m15199e(bVar.m6322e()));
            bVar.m6325h(c3359e2.f11711c, c3359e2.f11712d);
            bVar.m6326i(c3359e2.f11713e);
            bVar.m6328k(c3359e2.f11710b);
            bVar.m6331n(c3359e2.f11714f);
            bVar.m6334q(c3359e2.f11717i, c3359e2.f11716h);
            bVar.m6335r(c3359e2.f11718j);
            arrayList2.add(bVar.m6318a());
        }
        return arrayList2;
    }

    /* renamed from: i */
    public final void m12456i(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = "p".equals(this.f11696a);
        boolean equals2 = "div".equals(this.f11696a);
        if (z10 || equals || (equals2 && this.f11704i != null)) {
            long j10 = this.f11699d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f11700e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f11708m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f11708m.size(); i10++) {
            this.f11708m.get(i10).m12456i(treeSet, z10 || equals);
        }
    }

    /* renamed from: j */
    public long[] m12457j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        m12456i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    /* renamed from: l */
    public String[] m12458l() {
        return this.f11702g;
    }

    /* renamed from: m */
    public boolean m12459m(long j10) {
        long j11 = this.f11699d;
        return (j11 == -9223372036854775807L && this.f11700e == -9223372036854775807L) || (j11 <= j10 && this.f11700e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f11700e) || (j11 <= j10 && j10 < this.f11700e));
    }

    /* renamed from: n */
    public final void m12460n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f11703h)) {
            str = this.f11703h;
        }
        if (m12459m(j10) && "div".equals(this.f11696a) && this.f11704i != null) {
            list.add(new Pair<>(str, this.f11704i));
            return;
        }
        for (int i10 = 0; i10 < m12454g(); i10++) {
            m12453f(i10).m12460n(j10, str, list);
        }
    }

    /* renamed from: o */
    public final void m12461o(long j10, Map<String, C3361g> map, Map<String, C3359e> map2, String str, Map<String, C1547b.b> map3) {
        int i10;
        if (m12459m(j10)) {
            String str2 = "".equals(this.f11703h) ? str : this.f11703h;
            Iterator<Map.Entry<String, Integer>> it = this.f11707l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int intValue = this.f11706k.containsKey(key) ? this.f11706k.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    m12452b(map, (C1547b.b) C4014a.m15199e(map3.get(key)), intValue, intValue2, ((C3359e) C4014a.m15199e(map2.get(str2))).f11718j);
                }
            }
            while (i10 < m12454g()) {
                m12453f(i10).m12461o(j10, map, map2, str2, map3);
                i10++;
            }
        }
    }

    /* renamed from: p */
    public final void m12462p(long j10, boolean z10, String str, Map<String, C1547b.b> map) {
        this.f11706k.clear();
        this.f11707l.clear();
        if ("metadata".equals(this.f11696a)) {
            return;
        }
        if (!"".equals(this.f11703h)) {
            str = this.f11703h;
        }
        if (this.f11698c && z10) {
            m12450k(str, map).append((CharSequence) C4014a.m15199e(this.f11697b));
            return;
        }
        if ("br".equals(this.f11696a) && z10) {
            m12450k(str, map).append('\n');
            return;
        }
        if (m12459m(j10)) {
            for (Map.Entry<String, C1547b.b> entry : map.entrySet()) {
                this.f11706k.put(entry.getKey(), Integer.valueOf(((CharSequence) C4014a.m15199e(entry.getValue().m6322e())).length()));
            }
            boolean equals = "p".equals(this.f11696a);
            for (int i10 = 0; i10 < m12454g(); i10++) {
                m12453f(i10).m12462p(j10, z10 || equals, str, map);
            }
            if (equals) {
                C3360f.m12465c(m12450k(str, map));
            }
            for (Map.Entry<String, C1547b.b> entry2 : map.entrySet()) {
                this.f11707l.put(entry2.getKey(), Integer.valueOf(((CharSequence) C4014a.m15199e(entry2.getValue().m6322e())).length()));
            }
        }
    }
}
