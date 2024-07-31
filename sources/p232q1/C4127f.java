package p232q1;

import android.database.Cursor;
import android.os.Build;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p262s1.InterfaceC4388b;

/* renamed from: q1.f */
/* loaded from: classes.dex */
public class C4127f {

    /* renamed from: a */
    public final String f14847a;

    /* renamed from: b */
    public final Map<String, a> f14848b;

    /* renamed from: c */
    public final Set<b> f14849c;

    /* renamed from: d */
    public final Set<d> f14850d;

    /* renamed from: q1.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final String f14851a;

        /* renamed from: b */
        public final String f14852b;

        /* renamed from: c */
        public final int f14853c;

        /* renamed from: d */
        public final boolean f14854d;

        /* renamed from: e */
        public final int f14855e;

        /* renamed from: f */
        public final String f14856f;

        /* renamed from: g */
        public final int f14857g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f14851a = str;
            this.f14852b = str2;
            this.f14854d = z10;
            this.f14855e = i10;
            this.f14853c = m15912a(str2);
            this.f14856f = str3;
            this.f14857g = i11;
        }

        /* renamed from: a */
        public static int m15912a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        /* renamed from: b */
        public boolean m15913b() {
            return this.f14855e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f14855e != aVar.f14855e) {
                    return false;
                }
            } else if (m15913b() != aVar.m15913b()) {
                return false;
            }
            if (!this.f14851a.equals(aVar.f14851a) || this.f14854d != aVar.f14854d) {
                return false;
            }
            if (this.f14857g == 1 && aVar.f14857g == 2 && (str3 = this.f14856f) != null && !str3.equals(aVar.f14856f)) {
                return false;
            }
            if (this.f14857g == 2 && aVar.f14857g == 1 && (str2 = aVar.f14856f) != null && !str2.equals(this.f14856f)) {
                return false;
            }
            int i10 = this.f14857g;
            return (i10 == 0 || i10 != aVar.f14857g || ((str = this.f14856f) == null ? aVar.f14856f == null : str.equals(aVar.f14856f))) && this.f14853c == aVar.f14853c;
        }

        public int hashCode() {
            return (((((this.f14851a.hashCode() * 31) + this.f14853c) * 31) + (this.f14854d ? 1231 : 1237)) * 31) + this.f14855e;
        }

        public String toString() {
            return "Column{name='" + this.f14851a + "', type='" + this.f14852b + "', affinity='" + this.f14853c + "', notNull=" + this.f14854d + ", primaryKeyPosition=" + this.f14855e + ", defaultValue='" + this.f14856f + "'}";
        }
    }

    /* renamed from: q1.f$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final String f14858a;

        /* renamed from: b */
        public final String f14859b;

        /* renamed from: c */
        public final String f14860c;

        /* renamed from: d */
        public final List<String> f14861d;

        /* renamed from: e */
        public final List<String> f14862e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f14858a = str;
            this.f14859b = str2;
            this.f14860c = str3;
            this.f14861d = Collections.unmodifiableList(list);
            this.f14862e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f14858a.equals(bVar.f14858a) && this.f14859b.equals(bVar.f14859b) && this.f14860c.equals(bVar.f14860c) && this.f14861d.equals(bVar.f14861d)) {
                return this.f14862e.equals(bVar.f14862e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f14858a.hashCode() * 31) + this.f14859b.hashCode()) * 31) + this.f14860c.hashCode()) * 31) + this.f14861d.hashCode()) * 31) + this.f14862e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f14858a + "', onDelete='" + this.f14859b + "', onUpdate='" + this.f14860c + "', columnNames=" + this.f14861d + ", referenceColumnNames=" + this.f14862e + '}';
        }
    }

    /* renamed from: q1.f$c */
    /* loaded from: classes.dex */
    public static class c implements Comparable<c> {

        /* renamed from: h */
        public final int f14863h;

        /* renamed from: i */
        public final int f14864i;

        /* renamed from: j */
        public final String f14865j;

        /* renamed from: k */
        public final String f14866k;

        public c(int i10, int i11, String str, String str2) {
            this.f14863h = i10;
            this.f14864i = i11;
            this.f14865j = str;
            this.f14866k = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i10 = this.f14863h - cVar.f14863h;
            return i10 == 0 ? this.f14864i - cVar.f14864i : i10;
        }
    }

    /* renamed from: q1.f$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final String f14867a;

        /* renamed from: b */
        public final boolean f14868b;

        /* renamed from: c */
        public final List<String> f14869c;

        public d(String str, boolean z10, List<String> list) {
            this.f14867a = str;
            this.f14868b = z10;
            this.f14869c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f14868b == dVar.f14868b && this.f14869c.equals(dVar.f14869c)) {
                return this.f14867a.startsWith("index_") ? dVar.f14867a.startsWith("index_") : this.f14867a.equals(dVar.f14867a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f14867a.startsWith("index_") ? -1184239155 : this.f14867a.hashCode()) * 31) + (this.f14868b ? 1 : 0)) * 31) + this.f14869c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f14867a + "', unique=" + this.f14868b + ", columns=" + this.f14869c + '}';
        }
    }

    public C4127f(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f14847a = str;
        this.f14848b = Collections.unmodifiableMap(map);
        this.f14849c = Collections.unmodifiableSet(set);
        this.f14850d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* renamed from: a */
    public static C4127f m15906a(InterfaceC4388b interfaceC4388b, String str) {
        return new C4127f(str, m15907b(interfaceC4388b, str), m15909d(interfaceC4388b, str), m15911f(interfaceC4388b, str));
    }

    /* renamed from: b */
    public static Map<String, a> m15907b(InterfaceC4388b interfaceC4388b, String str) {
        Cursor mo16970V = interfaceC4388b.mo16970V("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (mo16970V.getColumnCount() > 0) {
                int columnIndex = mo16970V.getColumnIndex("name");
                int columnIndex2 = mo16970V.getColumnIndex(ImagePickerCache.MAP_KEY_TYPE);
                int columnIndex3 = mo16970V.getColumnIndex("notnull");
                int columnIndex4 = mo16970V.getColumnIndex("pk");
                int columnIndex5 = mo16970V.getColumnIndex("dflt_value");
                while (mo16970V.moveToNext()) {
                    String string = mo16970V.getString(columnIndex);
                    hashMap.put(string, new a(string, mo16970V.getString(columnIndex2), mo16970V.getInt(columnIndex3) != 0, mo16970V.getInt(columnIndex4), mo16970V.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            mo16970V.close();
        }
    }

    /* renamed from: c */
    public static List<c> m15908c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public static Set<b> m15909d(InterfaceC4388b interfaceC4388b, String str) {
        HashSet hashSet = new HashSet();
        Cursor mo16970V = interfaceC4388b.mo16970V("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = mo16970V.getColumnIndex("id");
            int columnIndex2 = mo16970V.getColumnIndex("seq");
            int columnIndex3 = mo16970V.getColumnIndex("table");
            int columnIndex4 = mo16970V.getColumnIndex("on_delete");
            int columnIndex5 = mo16970V.getColumnIndex("on_update");
            List<c> m15908c = m15908c(mo16970V);
            int count = mo16970V.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                mo16970V.moveToPosition(i10);
                if (mo16970V.getInt(columnIndex2) == 0) {
                    int i11 = mo16970V.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : m15908c) {
                        if (cVar.f14863h == i11) {
                            arrayList.add(cVar.f14865j);
                            arrayList2.add(cVar.f14866k);
                        }
                    }
                    hashSet.add(new b(mo16970V.getString(columnIndex3), mo16970V.getString(columnIndex4), mo16970V.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            mo16970V.close();
        }
    }

    /* renamed from: e */
    public static d m15910e(InterfaceC4388b interfaceC4388b, String str, boolean z10) {
        Cursor mo16970V = interfaceC4388b.mo16970V("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = mo16970V.getColumnIndex("seqno");
            int columnIndex2 = mo16970V.getColumnIndex("cid");
            int columnIndex3 = mo16970V.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (mo16970V.moveToNext()) {
                    if (mo16970V.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(mo16970V.getInt(columnIndex)), mo16970V.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z10, arrayList);
            }
            return null;
        } finally {
            mo16970V.close();
        }
    }

    /* renamed from: f */
    public static Set<d> m15911f(InterfaceC4388b interfaceC4388b, String str) {
        Cursor mo16970V = interfaceC4388b.mo16970V("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = mo16970V.getColumnIndex("name");
            int columnIndex2 = mo16970V.getColumnIndex("origin");
            int columnIndex3 = mo16970V.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (mo16970V.moveToNext()) {
                    if ("c".equals(mo16970V.getString(columnIndex2))) {
                        String string = mo16970V.getString(columnIndex);
                        boolean z10 = true;
                        if (mo16970V.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        d m15910e = m15910e(interfaceC4388b, string, z10);
                        if (m15910e == null) {
                            return null;
                        }
                        hashSet.add(m15910e);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            mo16970V.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4127f c4127f = (C4127f) obj;
        String str = this.f14847a;
        if (str == null ? c4127f.f14847a != null : !str.equals(c4127f.f14847a)) {
            return false;
        }
        Map<String, a> map = this.f14848b;
        if (map == null ? c4127f.f14848b != null : !map.equals(c4127f.f14848b)) {
            return false;
        }
        Set<b> set2 = this.f14849c;
        if (set2 == null ? c4127f.f14849c != null : !set2.equals(c4127f.f14849c)) {
            return false;
        }
        Set<d> set3 = this.f14850d;
        if (set3 == null || (set = c4127f.f14850d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f14847a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f14848b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f14849c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f14847a + "', columns=" + this.f14848b + ", foreignKeys=" + this.f14849c + ", indices=" + this.f14850d + '}';
    }
}
