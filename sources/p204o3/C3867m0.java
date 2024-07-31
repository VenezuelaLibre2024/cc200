package p204o3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p045d3.C1531c;
import p045d3.EnumC1533e;
import p086fd.InterfaceC1904a;
import p093g3.AbstractC1971i;
import p093g3.AbstractC1978p;
import p093g3.C1970h;
import p136j3.C3216a;
import p136j3.C3217b;
import p136j3.C3218c;
import p136j3.C3219d;
import p136j3.C3220e;
import p136j3.C3221f;
import p151k3.C3347a;
import p220p3.C3998a;
import p220p3.InterfaceC3999b;
import p234q3.InterfaceC4157a;
import p249r3.C4292a;

/* renamed from: o3.m0 */
/* loaded from: classes.dex */
public class C3867m0 implements InterfaceC3848d, InterfaceC3999b, InterfaceC3846c {

    /* renamed from: m */
    public static final C1531c f13900m = C1531c.m6232b("proto");

    /* renamed from: h */
    public final C3881t0 f13901h;

    /* renamed from: i */
    public final InterfaceC4157a f13902i;

    /* renamed from: j */
    public final InterfaceC4157a f13903j;

    /* renamed from: k */
    public final AbstractC3850e f13904k;

    /* renamed from: l */
    public final InterfaceC1904a<String> f13905l;

    /* renamed from: o3.m0$b */
    /* loaded from: classes.dex */
    public interface b<T, U> {
        U apply(T t10);
    }

    /* renamed from: o3.m0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final String f13906a;

        /* renamed from: b */
        public final String f13907b;

        public c(String str, String str2) {
            this.f13906a = str;
            this.f13907b = str2;
        }
    }

    /* renamed from: o3.m0$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        /* renamed from: a */
        T mo14631a();
    }

    public C3867m0(InterfaceC4157a interfaceC4157a, InterfaceC4157a interfaceC4157a2, AbstractC3850e abstractC3850e, C3881t0 c3881t0, InterfaceC1904a<String> interfaceC1904a) {
        this.f13901h = c3881t0;
        this.f13902i = interfaceC4157a;
        this.f13903j = interfaceC4157a2;
        this.f13904k = abstractC3850e;
        this.f13905l = interfaceC1904a;
    }

    /* renamed from: A1 */
    public static <T> T m14662A1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public /* synthetic */ Object m14667T0(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo14630j(cursor.getInt(0), C3218c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public /* synthetic */ Integer m14668U0(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        m14662A1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: o3.h0
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                Object m14667T0;
                m14667T0 = C3867m0.this.m14667T0((Cursor) obj);
                return m14667T0;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* renamed from: V0 */
    public static /* synthetic */ Object m14669V0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* renamed from: W0 */
    public static /* synthetic */ Object m14671W0(Throwable th) {
        throw new C3998a("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: X0 */
    public static /* synthetic */ SQLiteDatabase m14672X0(Throwable th) {
        throw new C3998a("Timed out while trying to open db.", th);
    }

    /* renamed from: Y0 */
    public static /* synthetic */ Long m14673Y0(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    /* renamed from: Z0 */
    public static /* synthetic */ C3221f m14674Z0(long j10, Cursor cursor) {
        cursor.moveToNext();
        return C3221f.m11479c().m11484c(cursor.getLong(0)).m11483b(j10).m11482a();
    }

    /* renamed from: a1 */
    public static /* synthetic */ C3221f m14675a1(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (C3221f) m14662A1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: o3.l
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                C3221f m14674Z0;
                m14674Z0 = C3867m0.m14674Z0(j10, (Cursor) obj);
                return m14674Z0;
            }
        });
    }

    /* renamed from: b1 */
    public static /* synthetic */ Long m14677b1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public /* synthetic */ Boolean m14679c1(AbstractC1978p abstractC1978p, SQLiteDatabase sQLiteDatabase) {
        Long m14725P0 = m14725P0(sQLiteDatabase, abstractC1978p);
        return m14725P0 == null ? Boolean.FALSE : (Boolean) m14662A1(m14720K0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m14725P0.toString()}), new b() { // from class: o3.y
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* renamed from: d1 */
    public static /* synthetic */ List m14680d1(SQLiteDatabase sQLiteDatabase) {
        return (List) m14662A1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: o3.t
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                List m14682e1;
                m14682e1 = C3867m0.m14682e1((Cursor) obj);
                return m14682e1;
            }
        });
    }

    /* renamed from: e1 */
    public static /* synthetic */ List m14682e1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC1978p.m7999a().mo7968b(cursor.getString(1)).mo7970d(C4292a.m16517b(cursor.getInt(2))).mo7969c(m14707u1(cursor.getString(3))).mo7967a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f1 */
    public /* synthetic */ List m14684f1(AbstractC1978p abstractC1978p, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC3862k> m14730s1 = m14730s1(sQLiteDatabase, abstractC1978p, this.f13904k.mo14616d());
        for (EnumC1533e enumC1533e : EnumC1533e.values()) {
            if (enumC1533e != abstractC1978p.mo7966d()) {
                int mo14616d = this.f13904k.mo14616d() - m14730s1.size();
                if (mo14616d <= 0) {
                    break;
                }
                m14730s1.addAll(m14730s1(sQLiteDatabase, abstractC1978p.m8001f(enumC1533e), mo14616d));
            }
        }
        return m14728S0(m14730s1, m14731t1(sQLiteDatabase, m14730s1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public /* synthetic */ C3216a m14686g1(Map map, C3216a.a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C3218c.b m14716G0 = m14716G0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C3218c.m11461c().m11466c(m14716G0).m11465b(j10).m11464a());
        }
        m14732v1(aVar, map);
        aVar.m11456e(m14724O0());
        aVar.m11455d(m14721L0());
        aVar.m11454c(this.f13905l.get());
        return aVar.m11453b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h1 */
    public /* synthetic */ C3216a m14688h1(String str, final Map map, final C3216a.a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C3216a) m14662A1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: o3.r
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                C3216a m14686g1;
                m14686g1 = C3867m0.this.m14686g1(map, aVar, (Cursor) obj);
                return m14686g1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public /* synthetic */ Object m14690i1(List list, AbstractC1978p abstractC1978p, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            AbstractC1971i.a mo7952k = AbstractC1971i.m7980a().mo7951j(cursor.getString(1)).mo7950i(cursor.getLong(2)).mo7952k(cursor.getLong(3));
            mo7952k.mo7949h(z10 ? new C1970h(m14713y1(cursor.getString(4)), cursor.getBlob(5)) : new C1970h(m14713y1(cursor.getString(4)), m14733w1(j10)));
            if (!cursor.isNull(6)) {
                mo7952k.mo7948g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC3862k.m14661a(j10, abstractC1978p, mo7952k.mo7945d()));
        }
        return null;
    }

    /* renamed from: j1 */
    public static /* synthetic */ Object m14691j1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ Long m14692k1(AbstractC1971i abstractC1971i, AbstractC1978p abstractC1978p, SQLiteDatabase sQLiteDatabase) {
        if (m14727R0()) {
            mo14630j(1L, C3218c.b.CACHE_FULL, abstractC1971i.mo7943j());
            return -1L;
        }
        long m14718I0 = m14718I0(sQLiteDatabase, abstractC1978p);
        int mo14617e = this.f13904k.mo14617e();
        byte[] m7978a = abstractC1971i.mo7941e().m7978a();
        boolean z10 = m7978a.length <= mo14617e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m14718I0));
        contentValues.put("transport_name", abstractC1971i.mo7943j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC1971i.mo7942f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC1971i.mo7944k()));
        contentValues.put("payload_encoding", abstractC1971i.mo7941e().m7979b().m6233a());
        contentValues.put("code", abstractC1971i.mo7940d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put(FlutterLocalNotificationsPlugin.PAYLOAD, z10 ? m7978a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(m7978a.length / mo14617e);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(m7978a, (i10 - 1) * mo14617e, Math.min(i10 * mo14617e, m7978a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : abstractC1971i.m7984i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: l1 */
    public static /* synthetic */ byte[] m14695l1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ Object m14696m1(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo14630j(cursor.getInt(0), C3218c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1 */
    public /* synthetic */ Object m14699n1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m14662A1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: o3.i0
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                Object m14696m1;
                m14696m1 = C3867m0.this.m14696m1((Cursor) obj);
                return m14696m1;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: o1 */
    public static /* synthetic */ Boolean m14700o1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* renamed from: p1 */
    public static /* synthetic */ Object m14701p1(String str, C3218c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) m14662A1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo9805a())}), new b() { // from class: o3.x
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                Boolean m14700o1;
                m14700o1 = C3867m0.m14700o1((Cursor) obj);
                return m14700o1;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo9805a())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put(Constants.REASON, Integer.valueOf(bVar.mo9805a()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* renamed from: q1 */
    public static /* synthetic */ Object m14702q1(long j10, AbstractC1978p abstractC1978p, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC1978p.mo7964b(), String.valueOf(C4292a.m16516a(abstractC1978p.mo7966d()))}) < 1) {
            contentValues.put("backend_name", abstractC1978p.mo7964b());
            contentValues.put("priority", Integer.valueOf(C4292a.m16516a(abstractC1978p.mo7966d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1 */
    public /* synthetic */ Object m14704r1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f13902i.mo16002a()).execute();
        return null;
    }

    /* renamed from: u1 */
    public static byte[] m14707u1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: y1 */
    public static C1531c m14713y1(String str) {
        return str == null ? f13900m : C1531c.m6232b(str);
    }

    /* renamed from: z1 */
    public static String m14715z1(Iterable<AbstractC3862k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<AbstractC3862k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().mo14626c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // p204o3.InterfaceC3848d
    /* renamed from: A0 */
    public void mo14632A0(Iterable<AbstractC3862k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m14715z1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            m14726Q0(new b() { // from class: o3.o
                @Override // p204o3.C3867m0.b
                public final Object apply(Object obj) {
                    Object m14699n1;
                    m14699n1 = C3867m0.this.m14699n1(str, str2, (SQLiteDatabase) obj);
                    return m14699n1;
                }
            });
        }
    }

    @Override // p204o3.InterfaceC3848d
    /* renamed from: D */
    public AbstractC3862k mo14633D(final AbstractC1978p abstractC1978p, final AbstractC1971i abstractC1971i) {
        C3347a.m12405c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC1978p.mo7966d(), abstractC1971i.mo7943j(), abstractC1978p.mo7964b());
        long longValue = ((Long) m14726Q0(new b() { // from class: o3.l0
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                Long m14692k1;
                m14692k1 = C3867m0.this.m14692k1(abstractC1971i, abstractC1978p, (SQLiteDatabase) obj);
                return m14692k1;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC3862k.m14661a(longValue, abstractC1978p, abstractC1971i);
    }

    @Override // p204o3.InterfaceC3848d
    /* renamed from: F */
    public Iterable<AbstractC1978p> mo14634F() {
        return (Iterable) m14726Q0(new b() { // from class: o3.z
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                List m14680d1;
                m14680d1 = C3867m0.m14680d1((SQLiteDatabase) obj);
                return m14680d1;
            }
        });
    }

    /* renamed from: G0 */
    public final C3218c.b m14716G0(int i10) {
        C3218c.b bVar = C3218c.b.REASON_UNKNOWN;
        if (i10 == bVar.mo9805a()) {
            return bVar;
        }
        C3218c.b bVar2 = C3218c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.mo9805a()) {
            return bVar2;
        }
        C3218c.b bVar3 = C3218c.b.CACHE_FULL;
        if (i10 == bVar3.mo9805a()) {
            return bVar3;
        }
        C3218c.b bVar4 = C3218c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.mo9805a()) {
            return bVar4;
        }
        C3218c.b bVar5 = C3218c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.mo9805a()) {
            return bVar5;
        }
        C3218c.b bVar6 = C3218c.b.INVALID_PAYLOD;
        if (i10 == bVar6.mo9805a()) {
            return bVar6;
        }
        C3218c.b bVar7 = C3218c.b.SERVER_ERROR;
        if (i10 == bVar7.mo9805a()) {
            return bVar7;
        }
        C3347a.m12404b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    /* renamed from: H0 */
    public final void m14717H0(final SQLiteDatabase sQLiteDatabase) {
        m14734x1(new d() { // from class: o3.c0
            @Override // p204o3.C3867m0.d
            /* renamed from: a */
            public final Object mo14631a() {
                Object m14669V0;
                m14669V0 = C3867m0.m14669V0(sQLiteDatabase);
                return m14669V0;
            }
        }, new b() { // from class: o3.b0
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                Object m14671W0;
                m14671W0 = C3867m0.m14671W0((Throwable) obj);
                return m14671W0;
            }
        });
    }

    /* renamed from: I0 */
    public final long m14718I0(SQLiteDatabase sQLiteDatabase, AbstractC1978p abstractC1978p) {
        Long m14725P0 = m14725P0(sQLiteDatabase, abstractC1978p);
        if (m14725P0 != null) {
            return m14725P0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC1978p.mo7964b());
        contentValues.put("priority", Integer.valueOf(C4292a.m16516a(abstractC1978p.mo7966d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC1978p.mo7965c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC1978p.mo7965c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* renamed from: J0 */
    public long m14719J0() {
        return m14722M0() * m14723N0();
    }

    /* renamed from: K0 */
    public SQLiteDatabase m14720K0() {
        final C3881t0 c3881t0 = this.f13901h;
        Objects.requireNonNull(c3881t0);
        return (SQLiteDatabase) m14734x1(new d() { // from class: o3.d0
            @Override // p204o3.C3867m0.d
            /* renamed from: a */
            public final Object mo14631a() {
                return C3881t0.this.getWritableDatabase();
            }
        }, new b() { // from class: o3.a0
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                SQLiteDatabase m14672X0;
                m14672X0 = C3867m0.m14672X0((Throwable) obj);
                return m14672X0;
            }
        });
    }

    /* renamed from: L0 */
    public final C3217b m14721L0() {
        return C3217b.m11457b().m11460b(C3220e.m11473c().m11477b(m14719J0()).m11478c(AbstractC3850e.f13878a.mo14618f()).m11476a()).m11459a();
    }

    /* renamed from: M0 */
    public final long m14722M0() {
        return m14720K0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: N0 */
    public final long m14723N0() {
        return m14720K0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: O0 */
    public final C3221f m14724O0() {
        final long mo16002a = this.f13902i.mo16002a();
        return (C3221f) m14726Q0(new b() { // from class: o3.w
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                C3221f m14675a1;
                m14675a1 = C3867m0.m14675a1(mo16002a, (SQLiteDatabase) obj);
                return m14675a1;
            }
        });
    }

    /* renamed from: P0 */
    public final Long m14725P0(SQLiteDatabase sQLiteDatabase, AbstractC1978p abstractC1978p) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC1978p.mo7964b(), String.valueOf(C4292a.m16516a(abstractC1978p.mo7966d()))));
        if (abstractC1978p.mo7965c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC1978p.mo7965c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) m14662A1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: o3.v
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                Long m14677b1;
                m14677b1 = C3867m0.m14677b1((Cursor) obj);
                return m14677b1;
            }
        });
    }

    /* renamed from: Q0 */
    public <T> T m14726Q0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase m14720K0 = m14720K0();
        m14720K0.beginTransaction();
        try {
            T apply = bVar.apply(m14720K0);
            m14720K0.setTransactionSuccessful();
            return apply;
        } finally {
            m14720K0.endTransaction();
        }
    }

    @Override // p204o3.InterfaceC3848d
    /* renamed from: R */
    public Iterable<AbstractC3862k> mo14635R(final AbstractC1978p abstractC1978p) {
        return (Iterable) m14726Q0(new b() { // from class: o3.m
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                List m14684f1;
                m14684f1 = C3867m0.this.m14684f1(abstractC1978p, (SQLiteDatabase) obj);
                return m14684f1;
            }
        });
    }

    /* renamed from: R0 */
    public final boolean m14727R0() {
        return m14722M0() * m14723N0() >= this.f13904k.mo14618f();
    }

    /* renamed from: S0 */
    public final List<AbstractC3862k> m14728S0(List<AbstractC3862k> list, Map<Long, Set<c>> map) {
        ListIterator<AbstractC3862k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC3862k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo14626c()))) {
                AbstractC1971i.a m7985l = next.mo14625b().m7985l();
                for (c cVar : map.get(Long.valueOf(next.mo14626c()))) {
                    m7985l.m7988c(cVar.f13906a, cVar.f13907b);
                }
                listIterator.set(AbstractC3862k.m14661a(next.mo14626c(), next.mo14627d(), m7985l.mo7945d()));
            }
        }
        return list;
    }

    @Override // p204o3.InterfaceC3848d
    /* renamed from: X */
    public void mo14636X(final AbstractC1978p abstractC1978p, final long j10) {
        m14726Q0(new b() { // from class: o3.e0
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                Object m14702q1;
                m14702q1 = C3867m0.m14702q1(j10, abstractC1978p, (SQLiteDatabase) obj);
                return m14702q1;
            }
        });
    }

    @Override // p220p3.InterfaceC3999b
    /* renamed from: a */
    public <T> T mo14729a(InterfaceC3999b.a<T> aVar) {
        SQLiteDatabase m14720K0 = m14720K0();
        m14717H0(m14720K0);
        try {
            T mo13061d = aVar.mo13061d();
            m14720K0.setTransactionSuccessful();
            return mo13061d;
        } finally {
            m14720K0.endTransaction();
        }
    }

    @Override // p204o3.InterfaceC3848d
    /* renamed from: a0 */
    public long mo14637a0(AbstractC1978p abstractC1978p) {
        return ((Long) m14662A1(m14720K0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC1978p.mo7964b(), String.valueOf(C4292a.m16516a(abstractC1978p.mo7966d()))}), new b() { // from class: o3.u
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                Long m14673Y0;
                m14673Y0 = C3867m0.m14673Y0((Cursor) obj);
                return m14673Y0;
            }
        })).longValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f13901h.close();
    }

    @Override // p204o3.InterfaceC3846c
    /* renamed from: d */
    public void mo14628d() {
        m14726Q0(new b() { // from class: o3.j0
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                Object m14704r1;
                m14704r1 = C3867m0.this.m14704r1((SQLiteDatabase) obj);
                return m14704r1;
            }
        });
    }

    @Override // p204o3.InterfaceC3846c
    /* renamed from: f */
    public C3216a mo14629f() {
        final C3216a.a m11446e = C3216a.m11446e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C3216a) m14726Q0(new b() { // from class: o3.p
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                C3216a m14688h1;
                m14688h1 = C3867m0.this.m14688h1(str, hashMap, m11446e, (SQLiteDatabase) obj);
                return m14688h1;
            }
        });
    }

    @Override // p204o3.InterfaceC3848d
    /* renamed from: h */
    public int mo14638h() {
        final long mo16002a = this.f13902i.mo16002a() - this.f13904k.mo14615c();
        return ((Integer) m14726Q0(new b() { // from class: o3.k0
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                Integer m14668U0;
                m14668U0 = C3867m0.this.m14668U0(mo16002a, (SQLiteDatabase) obj);
                return m14668U0;
            }
        })).intValue();
    }

    @Override // p204o3.InterfaceC3848d
    /* renamed from: i */
    public void mo14639i(Iterable<AbstractC3862k> iterable) {
        if (iterable.iterator().hasNext()) {
            m14720K0().compileStatement("DELETE FROM events WHERE _id in " + m14715z1(iterable)).execute();
        }
    }

    @Override // p204o3.InterfaceC3846c
    /* renamed from: j */
    public void mo14630j(final long j10, final C3218c.b bVar, final String str) {
        m14726Q0(new b() { // from class: o3.f0
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                Object m14701p1;
                m14701p1 = C3867m0.m14701p1(str, bVar, j10, (SQLiteDatabase) obj);
                return m14701p1;
            }
        });
    }

    /* renamed from: s1 */
    public final List<AbstractC3862k> m14730s1(SQLiteDatabase sQLiteDatabase, final AbstractC1978p abstractC1978p, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long m14725P0 = m14725P0(sQLiteDatabase, abstractC1978p);
        if (m14725P0 == null) {
            return arrayList;
        }
        m14662A1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", FlutterLocalNotificationsPlugin.PAYLOAD, "code", "inline"}, "context_id = ?", new String[]{m14725P0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: o3.q
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                Object m14690i1;
                m14690i1 = C3867m0.this.m14690i1(arrayList, abstractC1978p, (Cursor) obj);
                return m14690i1;
            }
        });
        return arrayList;
    }

    /* renamed from: t1 */
    public final Map<Long, Set<c>> m14731t1(SQLiteDatabase sQLiteDatabase, List<AbstractC3862k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).mo14626c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        m14662A1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: o3.g0
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                Object m14691j1;
                m14691j1 = C3867m0.m14691j1(hashMap, (Cursor) obj);
                return m14691j1;
            }
        });
        return hashMap;
    }

    @Override // p204o3.InterfaceC3848d
    /* renamed from: v */
    public boolean mo14640v(final AbstractC1978p abstractC1978p) {
        return ((Boolean) m14726Q0(new b() { // from class: o3.n
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                Boolean m14679c1;
                m14679c1 = C3867m0.this.m14679c1(abstractC1978p, (SQLiteDatabase) obj);
                return m14679c1;
            }
        })).booleanValue();
    }

    /* renamed from: v1 */
    public final void m14732v1(C3216a.a aVar, Map<String, List<C3218c>> map) {
        for (Map.Entry<String, List<C3218c>> entry : map.entrySet()) {
            aVar.m11452a(C3219d.m11467c().m11472c(entry.getKey()).m11471b(entry.getValue()).m11470a());
        }
    }

    /* renamed from: w1 */
    public final byte[] m14733w1(long j10) {
        return (byte[]) m14662A1(m14720K0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: o3.s
            @Override // p204o3.C3867m0.b
            public final Object apply(Object obj) {
                byte[] m14695l1;
                m14695l1 = C3867m0.m14695l1((Cursor) obj);
                return m14695l1;
            }
        });
    }

    /* renamed from: x1 */
    public final <T> T m14734x1(d<T> dVar, b<Throwable, T> bVar) {
        long mo16002a = this.f13903j.mo16002a();
        while (true) {
            try {
                return dVar.mo14631a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f13903j.mo16002a() >= this.f13904k.mo14614b() + mo16002a) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
