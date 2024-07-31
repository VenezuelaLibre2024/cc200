package nc;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p228pc.C4115g;
import p228pc.C4116h;
import p228pc.InterfaceC4113e;

/* renamed from: nc.i */
/* loaded from: classes2.dex */
public class C3796i {

    /* renamed from: n */
    public static Boolean f13674n;

    /* renamed from: a */
    public final boolean f13675a;

    /* renamed from: b */
    public final String f13676b;

    /* renamed from: c */
    public final int f13677c;

    /* renamed from: d */
    public final int f13678d;

    /* renamed from: e */
    public final Context f13679e;

    /* renamed from: h */
    public InterfaceC3801n f13682h;

    /* renamed from: i */
    public SQLiteDatabase f13683i;

    /* renamed from: l */
    public Integer f13686l;

    /* renamed from: f */
    public final List<C4115g> f13680f = new ArrayList();

    /* renamed from: g */
    public final Map<Integer, C3806s> f13681g = new HashMap();

    /* renamed from: j */
    public int f13684j = 0;

    /* renamed from: k */
    public int f13685k = 0;

    /* renamed from: m */
    public int f13687m = 0;

    /* renamed from: nc.i$a */
    /* loaded from: classes2.dex */
    public class a implements DatabaseErrorHandler {
        public a() {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    public C3796i(Context context, String str, int i10, boolean z10, int i11) {
        this.f13679e = context;
        this.f13676b = str;
        this.f13675a = z10;
        this.f13677c = i10;
        this.f13678d = i11;
    }

    /* renamed from: G */
    public static /* synthetic */ Cursor m14443G(C3789c0 c3789c0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        c3789c0.m14433a(sQLiteQuery);
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* renamed from: H */
    public /* synthetic */ void m14444H(InterfaceC4113e interfaceC4113e) {
        Boolean mo15874h = interfaceC4113e.mo15874h();
        boolean z10 = Boolean.TRUE.equals(mo15874h) && interfaceC4113e.mo15873e();
        if (z10) {
            int i10 = this.f13685k + 1;
            this.f13685k = i10;
            this.f13686l = Integer.valueOf(i10);
        }
        if (!m14486w(interfaceC4113e)) {
            if (z10) {
                this.f13686l = null;
            }
        } else if (z10) {
            HashMap hashMap = new HashMap();
            hashMap.put("transactionId", this.f13686l);
            interfaceC4113e.success(hashMap);
        } else {
            if (Boolean.FALSE.equals(mo15874h)) {
                this.f13686l = null;
            }
            interfaceC4113e.success(null);
        }
    }

    /* renamed from: i */
    public static boolean m14456i(Context context, String str, boolean z10) {
        try {
            String packageName = context.getPackageName();
            return (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : m14460y(context, packageName, 128)).metaData.getBoolean(str, z10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: j */
    public static boolean m14457j(Context context) {
        return m14456i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    /* renamed from: o */
    public static void m14458o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    /* renamed from: x */
    public static boolean m14459x(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: y */
    public static ApplicationInfo m14460y(Context context, String str, int i10) {
        return context.getPackageManager().getApplicationInfo(str, i10);
    }

    /* renamed from: A */
    public String m14461A() {
        return "[" + m14462B() + "] ";
    }

    /* renamed from: B */
    public String m14462B() {
        Thread currentThread = Thread.currentThread();
        return "" + this.f13677c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    /* renamed from: C */
    public SQLiteDatabase m14463C() {
        return this.f13683i;
    }

    /* renamed from: D */
    public void m14464D(Exception exc, InterfaceC4113e interfaceC4113e) {
        String message;
        Map<String, Object> m15888a;
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            message = "open_failed " + this.f13676b;
            m15888a = null;
        } else {
            boolean z10 = exc instanceof SQLException;
            message = exc.getMessage();
            m15888a = C4116h.m15888a(interfaceC4113e);
        }
        interfaceC4113e.error("sqlite_error", message, m15888a);
    }

    /* renamed from: E */
    public void m14465E(InterfaceC4113e interfaceC4113e) {
        m14473S(interfaceC4113e, new Runnable() { // from class: nc.d

            /* renamed from: i */
            public final /* synthetic */ InterfaceC4113e f13665i;

            public /* synthetic */ RunnableC3790d(InterfaceC4113e interfaceC4113e2) {
                r2 = interfaceC4113e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3796i.this.m14445I(r2);
            }
        });
    }

    /* renamed from: F */
    public synchronized boolean m14466F() {
        return this.f13684j > 0;
    }

    /* renamed from: M */
    public void m14467M() {
        if (f13674n == null) {
            Boolean valueOf = Boolean.valueOf(m14457j(this.f13679e));
            f13674n = valueOf;
            if (valueOf.booleanValue() && C3804q.m14512c(this.f13678d)) {
                Log.d("Sqflite", m14461A() + "[sqflite] WAL enabled");
            }
        }
        this.f13683i = SQLiteDatabase.openDatabase(this.f13676b, null, f13674n.booleanValue() ? 805306368 : 268435456);
    }

    /* renamed from: N */
    public void m14468N() {
        this.f13683i = SQLiteDatabase.openDatabase(this.f13676b, null, 1, new a());
    }

    /* renamed from: O */
    public void m14469O(InterfaceC4113e interfaceC4113e) {
        m14473S(interfaceC4113e, new Runnable() { // from class: nc.f

            /* renamed from: i */
            public final /* synthetic */ InterfaceC4113e f13669i;

            public /* synthetic */ RunnableC3793f(InterfaceC4113e interfaceC4113e2) {
                r2 = interfaceC4113e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3796i.this.m14446J(r2);
            }
        });
    }

    /* renamed from: P */
    public void m14470P(InterfaceC4113e interfaceC4113e) {
        m14473S(interfaceC4113e, new Runnable() { // from class: nc.e

            /* renamed from: i */
            public final /* synthetic */ InterfaceC4113e f13667i;

            public /* synthetic */ RunnableC3792e(InterfaceC4113e interfaceC4113e2) {
                r2 = interfaceC4113e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3796i.this.m14447K(r2);
            }
        });
    }

    /* renamed from: Q */
    public final void m14471Q() {
        while (!this.f13680f.isEmpty() && this.f13686l == null) {
            this.f13680f.get(0).m15887a();
            this.f13680f.remove(0);
        }
    }

    /* renamed from: R */
    public void m14472R(InterfaceC4113e interfaceC4113e) {
        m14473S(interfaceC4113e, new Runnable() { // from class: nc.g

            /* renamed from: i */
            public final /* synthetic */ InterfaceC4113e f13671i;

            public /* synthetic */ RunnableC3794g(InterfaceC4113e interfaceC4113e2) {
                r2 = interfaceC4113e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3796i.this.m14448L(r2);
            }
        });
    }

    /* renamed from: S */
    public final void m14473S(InterfaceC4113e interfaceC4113e, Runnable runnable) {
        Integer mo15872d = interfaceC4113e.mo15872d();
        Integer num = this.f13686l;
        if (num == null) {
            runnable.run();
            return;
        }
        if (mo15872d == null || !(mo15872d.equals(num) || mo15872d.intValue() == -1)) {
            this.f13680f.add(new C4115g(interfaceC4113e, runnable));
            return;
        }
        runnable.run();
        if (this.f13686l != null || this.f13680f.isEmpty()) {
            return;
        }
        this.f13682h.m14503d(this, new Runnable() { // from class: nc.c
            public /* synthetic */ RunnableC3788c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3796i.this.m14471Q();
            }
        });
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x006b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006e A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m14474h(io.flutter.plugin.common.MethodCall r9, io.flutter.plugin.common.MethodChannel.Result r10) {
        /*
            r8 = this;
            pc.d r0 = new pc.d
            r0.<init>(r9, r10)
            boolean r9 = r0.mo15871c()
            boolean r1 = r0.m15876j()
            java.lang.String r2 = "operations"
            java.lang.Object r0 = r0.mo15879a(r2)
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto Lca
            java.lang.Object r3 = r0.next()
            java.util.Map r3 = (java.util.Map) r3
            pc.c r5 = new pc.c
            r5.<init>(r3, r9)
            java.lang.String r3 = r5.mo15880f()
            r3.hashCode()
            r6 = -1
            int r7 = r3.hashCode()
            switch(r7) {
                case -1319569547: goto L61;
                case -1183792455: goto L56;
                case -838846263: goto L4b;
                case 107944136: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L6b
        L40:
            java.lang.String r7 = "query"
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L49
            goto L6b
        L49:
            r6 = 3
            goto L6b
        L4b:
            java.lang.String r7 = "update"
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L54
            goto L6b
        L54:
            r6 = 2
            goto L6b
        L56:
            java.lang.String r7 = "insert"
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L5f
            goto L6b
        L5f:
            r6 = 1
            goto L6b
        L61:
            java.lang.String r7 = "execute"
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L6a
            goto L6b
        L6a:
            r6 = 0
        L6b:
            switch(r6) {
                case 0: goto Lb4;
                case 1: goto La6;
                case 2: goto L98;
                case 3: goto L8a;
                default: goto L6e;
            }
        L6e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Batch method '"
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = "' not supported"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "bad_param"
            r10.error(r0, r9, r4)
            return
        L8a:
            boolean r3 = r8.m14446J(r5)
            if (r3 == 0) goto L91
            goto Lba
        L91:
            if (r1 == 0) goto L94
            goto Laf
        L94:
            r5.m15884p(r10)
            return
        L98:
            boolean r3 = r8.m14448L(r5)
            if (r3 == 0) goto L9f
            goto Lba
        L9f:
            if (r1 == 0) goto La2
            goto Laf
        La2:
            r5.m15884p(r10)
            return
        La6:
            boolean r3 = r8.m14445I(r5)
            if (r3 == 0) goto Lad
            goto Lba
        Lad:
            if (r1 == 0) goto Lb0
        Laf:
            goto Lc1
        Lb0:
            r5.m15884p(r10)
            return
        Lb4:
            boolean r3 = r8.m14479p(r5)
            if (r3 == 0) goto Lbf
        Lba:
            r5.m15886r(r2)
            goto L1e
        Lbf:
            if (r1 == 0) goto Lc6
        Lc1:
            r5.m15885q(r2)
            goto L1e
        Lc6:
            r5.m15884p(r10)
            return
        Lca:
            if (r9 == 0) goto Ld0
            r10.success(r4)
            goto Ld3
        Ld0:
            r10.success(r2)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.C3796i.m14474h(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    /* renamed from: k */
    public void m14475k() {
        if (!this.f13681g.isEmpty() && C3804q.m14511b(this.f13678d)) {
            Log.d("Sqflite", m14461A() + this.f13681g.size() + " cursor(s) are left opened");
        }
        this.f13683i.close();
    }

    /* renamed from: l */
    public final void m14476l(int i10) {
        C3806s c3806s = this.f13681g.get(Integer.valueOf(i10));
        if (c3806s != null) {
            m14477m(c3806s);
        }
    }

    /* renamed from: m */
    public final void m14477m(C3806s c3806s) {
        try {
            int i10 = c3806s.f13714a;
            if (C3804q.m14512c(this.f13678d)) {
                Log.d("Sqflite", m14461A() + "closing cursor " + i10);
            }
            this.f13681g.remove(Integer.valueOf(i10));
            c3806s.f13716c.close();
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public final Map<String, Object> m14478n(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        int i10 = 0;
        ArrayList arrayList = null;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                i10 = cursor.getColumnCount();
                hashMap2.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap2.put("rows", arrayList2);
                arrayList = arrayList2;
                hashMap = hashMap2;
            }
            arrayList.add(C3791d0.m14438a(cursor, i10));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    /* renamed from: p */
    public final boolean m14479p(InterfaceC4113e interfaceC4113e) {
        if (!m14486w(interfaceC4113e)) {
            return false;
        }
        interfaceC4113e.success(null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m14445I(p228pc.InterfaceC4113e r10) {
        /*
            r9 = this;
            boolean r0 = r9.m14486w(r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r10.mo15871c()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
            r10.success(r2)
            return r3
        L14:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r9.m14463C()     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> Lbc java.lang.Exception -> Lbe
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L9b
            int r5 = r0.getCount()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r5 <= 0) goto L9b
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r5 == 0) goto L9b
            int r5 = r0.getInt(r1)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r5 != 0) goto L67
            int r5 = r9.f13678d     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            boolean r5 = nc.C3804q.m14511b(r5)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r5 == 0) goto L60
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r5.<init>()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r6 = r9.m14461A()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r5.append(r6)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            long r6 = r0.getLong(r3)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r5.append(r6)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            android.util.Log.d(r4, r5)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
        L60:
            r10.success(r2)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r0.close()
            return r3
        L67:
            long r5 = r0.getLong(r3)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            int r2 = r9.f13678d     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            boolean r2 = nc.C3804q.m14511b(r2)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r2 == 0) goto L8e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r2.<init>()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r7 = r9.m14461A()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r2.append(r7)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r7 = "inserted "
            r2.append(r7)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r2.append(r5)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            android.util.Log.d(r4, r2)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
        L8e:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r10.success(r2)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r0.close()
            return r3
        L99:
            r2 = move-exception
            goto Lc2
        L9b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r5.<init>()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r6 = r9.m14461A()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r5.append(r6)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            android.util.Log.e(r4, r5)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            r10.success(r2)     // Catch: java.lang.Exception -> L99 java.lang.Throwable -> Lcb
            if (r0 == 0) goto Lbb
            r0.close()
        Lbb:
            return r3
        Lbc:
            r10 = move-exception
            goto Lcd
        Lbe:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        Lc2:
            r9.m14464D(r2, r10)     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto Lca
            r0.close()
        Lca:
            return r1
        Lcb:
            r10 = move-exception
            r2 = r0
        Lcd:
            if (r2 == 0) goto Ld2
            r2.close()
        Ld2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.C3796i.m14445I(pc.e):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [pc.e, pc.f] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, nc.c0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [nc.i] */
    /* renamed from: r */
    public final boolean m14446J(InterfaceC4113e interfaceC4113e) {
        Integer num = (Integer) interfaceC4113e.mo15879a("cursorPageSize");
        ?? mo15870b = interfaceC4113e.mo15870b();
        if (C3804q.m14511b(this.f13678d)) {
            Log.d("Sqflite", m14461A() + mo15870b);
        }
        C3806s c3806s = null;
        try {
            try {
                mo15870b = m14487z().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: nc.b
                    public /* synthetic */ C3786b() {
                    }

                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        Cursor m14443G;
                        m14443G = C3796i.m14443G(C3789c0.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                        return m14443G;
                    }
                }, mo15870b.m14435c(), C3784a.f13632a, null);
                try {
                    Map<String, Object> m14478n = m14478n(mo15870b, num);
                    if ((num == null || mo15870b.isLast() || mo15870b.isAfterLast()) ? false : true) {
                        int i10 = this.f13687m + 1;
                        this.f13687m = i10;
                        m14478n.put("cursorId", Integer.valueOf(i10));
                        C3806s c3806s2 = new C3806s(i10, num.intValue(), mo15870b);
                        try {
                            this.f13681g.put(Integer.valueOf(i10), c3806s2);
                            c3806s = c3806s2;
                        } catch (Exception e10) {
                            e = e10;
                            c3806s = c3806s2;
                            m14464D(e, interfaceC4113e);
                            if (c3806s != null) {
                                m14477m(c3806s);
                            }
                            if (c3806s == null && mo15870b != 0) {
                                mo15870b.close();
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            c3806s = c3806s2;
                            if (c3806s == null && mo15870b != 0) {
                                mo15870b.close();
                            }
                            throw th;
                        }
                    }
                    interfaceC4113e.success(m14478n);
                    if (c3806s == null && mo15870b != 0) {
                        mo15870b.close();
                    }
                    return true;
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                mo15870b = 0;
            } catch (Throwable th2) {
                th = th2;
                mo15870b = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: s */
    public final boolean m14447K(InterfaceC4113e interfaceC4113e) {
        boolean z10;
        int intValue = ((Integer) interfaceC4113e.mo15879a("cursorId")).intValue();
        boolean equals = Boolean.TRUE.equals(interfaceC4113e.mo15879a("cancel"));
        if (C3804q.m14512c(this.f13678d)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m14461A());
            sb2.append("cursor ");
            sb2.append(intValue);
            sb2.append(equals ? " cancel" : " next");
            Log.d("Sqflite", sb2.toString());
        }
        C3806s c3806s = null;
        if (equals) {
            m14476l(intValue);
            interfaceC4113e.success(null);
            return true;
        }
        C3806s c3806s2 = this.f13681g.get(Integer.valueOf(intValue));
        boolean z11 = false;
        try {
            if (c3806s2 == null) {
                throw new IllegalStateException("Cursor " + intValue + " not found");
            }
            Cursor cursor = c3806s2.f13716c;
            Map<String, Object> m14478n = m14478n(cursor, Integer.valueOf(c3806s2.f13715b));
            z10 = (cursor.isLast() || cursor.isAfterLast()) ? false : true;
            if (z10) {
                try {
                    try {
                        m14478n.put("cursorId", Integer.valueOf(intValue));
                    } catch (Throwable th) {
                        th = th;
                        z11 = z10;
                        if (!z11 && c3806s2 != null) {
                            m14477m(c3806s2);
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    m14464D(e, interfaceC4113e);
                    if (c3806s2 != null) {
                        m14477m(c3806s2);
                    } else {
                        c3806s = c3806s2;
                    }
                    if (!z10 && c3806s != null) {
                        m14477m(c3806s);
                    }
                    return false;
                }
            }
            interfaceC4113e.success(m14478n);
            if (!z10) {
                m14477m(c3806s2);
            }
            return true;
        } catch (Exception e11) {
            e = e11;
            z10 = false;
        } catch (Throwable th2) {
            th = th2;
            if (!z11) {
                m14477m(c3806s2);
            }
            throw th;
        }
    }

    /* renamed from: t */
    public final boolean m14448L(InterfaceC4113e interfaceC4113e) {
        if (!m14486w(interfaceC4113e)) {
            return false;
        }
        Cursor cursor = null;
        if (interfaceC4113e.mo15871c()) {
            interfaceC4113e.success(null);
            return true;
        }
        try {
            try {
                Cursor rawQuery = m14463C().rawQuery("SELECT changes()", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                            int i10 = rawQuery.getInt(0);
                            if (C3804q.m14511b(this.f13678d)) {
                                Log.d("Sqflite", m14461A() + "changed " + i10);
                            }
                            interfaceC4113e.success(Integer.valueOf(i10));
                            rawQuery.close();
                            return true;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        cursor = rawQuery;
                        m14464D(e, interfaceC4113e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", m14461A() + "fail to read changes for Update/Delete");
                interfaceC4113e.success(null);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* renamed from: u */
    public synchronized void m14484u(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            this.f13684j++;
        } else if (Boolean.FALSE.equals(bool)) {
            this.f13684j--;
        }
    }

    /* renamed from: v */
    public void m14485v(InterfaceC4113e interfaceC4113e) {
        m14473S(interfaceC4113e, new Runnable() { // from class: nc.h

            /* renamed from: i */
            public final /* synthetic */ InterfaceC4113e f13673i;

            public /* synthetic */ RunnableC3795h(InterfaceC4113e interfaceC4113e2) {
                r2 = interfaceC4113e2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3796i.this.m14444H(r2);
            }
        });
    }

    /* renamed from: w */
    public final boolean m14486w(InterfaceC4113e interfaceC4113e) {
        C3789c0 mo15870b = interfaceC4113e.mo15870b();
        if (C3804q.m14511b(this.f13678d)) {
            Log.d("Sqflite", m14461A() + mo15870b);
        }
        Boolean mo15874h = interfaceC4113e.mo15874h();
        try {
            m14463C().execSQL(mo15870b.m14435c(), mo15870b.m14436d());
            m14484u(mo15874h);
            return true;
        } catch (Exception e10) {
            m14464D(e10, interfaceC4113e);
            return false;
        }
    }

    /* renamed from: z */
    public SQLiteDatabase m14487z() {
        return this.f13683i;
    }
}
