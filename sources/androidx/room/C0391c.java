package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p202o1.AbstractC3832e;
import p202o1.C3830c;
import p216p.C3994b;
import p262s1.C4387a;
import p262s1.InterfaceC4388b;
import p262s1.InterfaceC4392f;

/* renamed from: androidx.room.c */
/* loaded from: classes.dex */
public class C0391c {

    /* renamed from: m */
    public static final String[] f1833m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b */
    public final String[] f1835b;

    /* renamed from: c */
    public Map<String, Set<String>> f1836c;

    /* renamed from: d */
    public final AbstractC3832e f1837d;

    /* renamed from: g */
    public volatile InterfaceC4392f f1840g;

    /* renamed from: h */
    public b f1841h;

    /* renamed from: i */
    public final C3830c f1842i;

    /* renamed from: k */
    public C0392d f1844k;

    /* renamed from: e */
    public AtomicBoolean f1838e = new AtomicBoolean(false);

    /* renamed from: f */
    public volatile boolean f1839f = false;

    /* renamed from: j */
    @SuppressLint({"RestrictedApi"})
    public final C3994b<c, d> f1843j = new C3994b<>();

    /* renamed from: l */
    public Runnable f1845l = new a();

    /* renamed from: a */
    public final HashMap<String, Integer> f1834a = new HashMap<>();

    /* renamed from: androidx.room.c$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* renamed from: a */
        public final Set<Integer> m1979a() {
            HashSet hashSet = new HashSet();
            Cursor m14560p = C0391c.this.f1837d.m14560p(new C4387a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (m14560p.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(m14560p.getInt(0)));
                } catch (Throwable th) {
                    m14560p.close();
                    throw th;
                }
            }
            m14560p.close();
            if (!hashSet.isEmpty()) {
                C0391c.this.f1840g.mo16987s();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock m14553h = C0391c.this.f1837d.m14553h();
            Set<Integer> set = null;
            try {
                try {
                    m14553h.lock();
                } catch (SQLiteException | IllegalStateException e10) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                }
                if (C0391c.this.m1968c()) {
                    if (C0391c.this.f1838e.compareAndSet(true, false)) {
                        if (C0391c.this.f1837d.m14556k()) {
                            return;
                        }
                        AbstractC3832e abstractC3832e = C0391c.this.f1837d;
                        if (abstractC3832e.f13796g) {
                            InterfaceC4388b mo14600U = abstractC3832e.m14554i().mo14600U();
                            mo14600U.mo16972g();
                            try {
                                set = m1979a();
                                mo14600U.mo16968N();
                                mo14600U.mo16971Z();
                            } catch (Throwable th) {
                                mo14600U.mo16971Z();
                                throw th;
                            }
                        } else {
                            set = m1979a();
                        }
                        if (set == null || set.isEmpty()) {
                            return;
                        }
                        synchronized (C0391c.this.f1843j) {
                            Iterator<Map.Entry<c, d>> it = C0391c.this.f1843j.iterator();
                            while (it.hasNext()) {
                                it.next().getValue().m1986a(set);
                            }
                        }
                    }
                }
            } finally {
                m14553h.unlock();
            }
        }
    }

    /* renamed from: androidx.room.c$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final long[] f1847a;

        /* renamed from: b */
        public final boolean[] f1848b;

        /* renamed from: c */
        public final int[] f1849c;

        /* renamed from: d */
        public boolean f1850d;

        /* renamed from: e */
        public boolean f1851e;

        public b(int i10) {
            long[] jArr = new long[i10];
            this.f1847a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f1848b = zArr;
            this.f1849c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        /* renamed from: a */
        public int[] m1980a() {
            synchronized (this) {
                if (this.f1850d && !this.f1851e) {
                    int length = this.f1847a.length;
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 >= length) {
                            this.f1851e = true;
                            this.f1850d = false;
                            return this.f1849c;
                        }
                        boolean z10 = this.f1847a[i10] > 0;
                        boolean[] zArr = this.f1848b;
                        if (z10 != zArr[i10]) {
                            int[] iArr = this.f1849c;
                            if (!z10) {
                                i11 = 2;
                            }
                            iArr[i10] = i11;
                        } else {
                            this.f1849c[i10] = 0;
                        }
                        zArr[i10] = z10;
                        i10++;
                    }
                }
                return null;
            }
        }

        /* renamed from: b */
        public boolean m1981b(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f1847a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        this.f1850d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        /* renamed from: c */
        public boolean m1982c(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f1847a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        this.f1850d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        /* renamed from: d */
        public void m1983d() {
            synchronized (this) {
                this.f1851e = false;
            }
        }
    }

    /* renamed from: androidx.room.c$c */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        public final String[] f1852a;

        public c(String[] strArr) {
            this.f1852a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* renamed from: a */
        public boolean mo1984a() {
            return false;
        }

        /* renamed from: b */
        public abstract void mo1985b(Set<String> set);
    }

    /* renamed from: androidx.room.c$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final int[] f1853a;

        /* renamed from: b */
        public final String[] f1854b;

        /* renamed from: c */
        public final c f1855c;

        /* renamed from: d */
        public final Set<String> f1856d;

        public d(c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f1855c = cVar;
            this.f1853a = iArr;
            this.f1854b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.f1856d = set;
        }

        /* renamed from: a */
        public void m1986a(Set<Integer> set) {
            int length = this.f1853a.length;
            Set<String> set2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (set.contains(Integer.valueOf(this.f1853a[i10]))) {
                    if (length == 1) {
                        set2 = this.f1856d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.f1854b[i10]);
                    }
                }
            }
            if (set2 != null) {
                this.f1855c.mo1985b(set2);
            }
        }

        /* renamed from: b */
        public void m1987b(String[] strArr) {
            Set<String> set = null;
            if (this.f1854b.length == 1) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (strArr[i10].equalsIgnoreCase(this.f1854b[0])) {
                        set = this.f1856d;
                        break;
                    }
                    i10++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f1854b;
                    int length2 = strArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            String str2 = strArr2[i11];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i11++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f1855c.mo1985b(set);
            }
        }
    }

    public C0391c(AbstractC3832e abstractC3832e, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f1837d = abstractC3832e;
        this.f1841h = new b(strArr.length);
        this.f1836c = map2;
        this.f1842i = new C3830c(abstractC3832e);
        int length = strArr.length;
        this.f1835b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f1834a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f1835b[i10] = str2.toLowerCase(locale);
            } else {
                this.f1835b[i10] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f1834a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f1834a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* renamed from: b */
    public static void m1966b(StringBuilder sb2, String str, String str2) {
        sb2.append("`");
        sb2.append("room_table_modification_trigger_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("`");
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void m1967a(c cVar) {
        d mo15124h;
        String[] m1973h = m1973h(cVar.f1852a);
        int[] iArr = new int[m1973h.length];
        int length = m1973h.length;
        for (int i10 = 0; i10 < length; i10++) {
            Integer num = this.f1834a.get(m1973h[i10].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + m1973h[i10]);
            }
            iArr[i10] = num.intValue();
        }
        d dVar = new d(cVar, iArr, m1973h);
        synchronized (this.f1843j) {
            mo15124h = this.f1843j.mo15124h(cVar, dVar);
        }
        if (mo15124h == null && this.f1841h.m1981b(iArr)) {
            m1977l();
        }
    }

    /* renamed from: c */
    public boolean m1968c() {
        if (!this.f1837d.m14559o()) {
            return false;
        }
        if (!this.f1839f) {
            this.f1837d.m14554i().mo14600U();
        }
        if (this.f1839f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: d */
    public void m1969d(InterfaceC4388b interfaceC4388b) {
        synchronized (this) {
            if (this.f1839f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            interfaceC4388b.mo16976p("PRAGMA temp_store = MEMORY;");
            interfaceC4388b.mo16976p("PRAGMA recursive_triggers='ON';");
            interfaceC4388b.mo16976p("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m1978m(interfaceC4388b);
            this.f1840g = interfaceC4388b.mo16978t("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f1839f = true;
        }
    }

    /* renamed from: e */
    public void m1970e(String... strArr) {
        synchronized (this.f1843j) {
            Iterator<Map.Entry<c, d>> it = this.f1843j.iterator();
            while (it.hasNext()) {
                Map.Entry<c, d> next = it.next();
                if (!next.getKey().mo1984a()) {
                    next.getValue().m1987b(strArr);
                }
            }
        }
    }

    /* renamed from: f */
    public void m1971f() {
        if (this.f1838e.compareAndSet(false, true)) {
            this.f1837d.m14555j().execute(this.f1845l);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: g */
    public void m1972g(c cVar) {
        d mo15125j;
        synchronized (this.f1843j) {
            mo15125j = this.f1843j.mo15125j(cVar);
        }
        if (mo15125j == null || !this.f1841h.m1982c(mo15125j.f1853a)) {
            return;
        }
        m1977l();
    }

    /* renamed from: h */
    public final String[] m1973h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f1836c.containsKey(lowerCase)) {
                hashSet.addAll(this.f1836c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: i */
    public void m1974i(Context context, String str) {
        this.f1844k = new C0392d(context, str, this, this.f1837d.m14555j());
    }

    /* renamed from: j */
    public final void m1975j(InterfaceC4388b interfaceC4388b, int i10) {
        interfaceC4388b.mo16976p("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f1835b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f1833m) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m1966b(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            interfaceC4388b.mo16976p(sb2.toString());
        }
    }

    /* renamed from: k */
    public final void m1976k(InterfaceC4388b interfaceC4388b, int i10) {
        String str = this.f1835b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f1833m) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            m1966b(sb2, str, str2);
            interfaceC4388b.mo16976p(sb2.toString());
        }
    }

    /* renamed from: l */
    public void m1977l() {
        if (this.f1837d.m14559o()) {
            m1978m(this.f1837d.m14554i().mo14600U());
        }
    }

    /* renamed from: m */
    public void m1978m(InterfaceC4388b interfaceC4388b) {
        if (interfaceC4388b.mo16977q0()) {
            return;
        }
        while (true) {
            try {
                Lock m14553h = this.f1837d.m14553h();
                m14553h.lock();
                try {
                    int[] m1980a = this.f1841h.m1980a();
                    if (m1980a == null) {
                        return;
                    }
                    int length = m1980a.length;
                    interfaceC4388b.mo16972g();
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            int i11 = m1980a[i10];
                            if (i11 == 1) {
                                m1975j(interfaceC4388b, i10);
                            } else if (i11 == 2) {
                                m1976k(interfaceC4388b, i10);
                            }
                        } finally {
                        }
                    }
                    interfaceC4388b.mo16968N();
                    interfaceC4388b.mo16971Z();
                    this.f1841h.m1983d();
                } finally {
                    m14553h.unlock();
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                return;
            }
        }
    }
}
