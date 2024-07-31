package p204o3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: o3.t0 */
/* loaded from: classes.dex */
public final class C3881t0 extends SQLiteOpenHelper {

    /* renamed from: j */
    public static final String f13935j = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: k */
    public static int f13936k = 5;

    /* renamed from: l */
    public static final a f13937l;

    /* renamed from: m */
    public static final a f13938m;

    /* renamed from: n */
    public static final a f13939n;

    /* renamed from: o */
    public static final a f13940o;

    /* renamed from: p */
    public static final a f13941p;

    /* renamed from: q */
    public static final List<a> f13942q;

    /* renamed from: h */
    public final int f13943h;

    /* renamed from: i */
    public boolean f13944i;

    /* renamed from: o3.t0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo14738a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C3877r0 c3877r0 = new a() { // from class: o3.r0
            @Override // p204o3.C3881t0.a
            /* renamed from: a */
            public final void mo14738a(SQLiteDatabase sQLiteDatabase) {
                C3881t0.m14747w(sQLiteDatabase);
            }
        };
        f13937l = c3877r0;
        C3871o0 c3871o0 = new a() { // from class: o3.o0
            @Override // p204o3.C3881t0.a
            /* renamed from: a */
            public final void mo14738a(SQLiteDatabase sQLiteDatabase) {
                C3881t0.m14748x(sQLiteDatabase);
            }
        };
        f13938m = c3871o0;
        C3873p0 c3873p0 = new a() { // from class: o3.p0
            @Override // p204o3.C3881t0.a
            /* renamed from: a */
            public final void mo14738a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f13939n = c3873p0;
        C3875q0 c3875q0 = new a() { // from class: o3.q0
            @Override // p204o3.C3881t0.a
            /* renamed from: a */
            public final void mo14738a(SQLiteDatabase sQLiteDatabase) {
                C3881t0.m14740I(sQLiteDatabase);
            }
        };
        f13940o = c3875q0;
        C3879s0 c3879s0 = new a() { // from class: o3.s0
            @Override // p204o3.C3881t0.a
            /* renamed from: a */
            public final void mo14738a(SQLiteDatabase sQLiteDatabase) {
                C3881t0.m14741K(sQLiteDatabase);
            }
        };
        f13941p = c3879s0;
        f13942q = Arrays.asList(c3877r0, c3871o0, c3873p0, c3875q0, c3879s0);
    }

    public C3881t0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f13944i = false;
        this.f13943h = i10;
    }

    /* renamed from: I */
    public static /* synthetic */ void m14740I(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* renamed from: K */
    public static /* synthetic */ void m14741K(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f13935j);
    }

    /* renamed from: w */
    public static /* synthetic */ void m14747w(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: x */
    public static /* synthetic */ void m14748x(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: P */
    public final void m14749P(SQLiteDatabase sQLiteDatabase, int i10) {
        m14751n(sQLiteDatabase);
        m14750W(sQLiteDatabase, 0, i10);
    }

    /* renamed from: W */
    public final void m14750W(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f13942q;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f13942q.get(i10).mo14738a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    /* renamed from: n */
    public final void m14751n(SQLiteDatabase sQLiteDatabase) {
        if (this.f13944i) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f13944i = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m14749P(sQLiteDatabase, this.f13943h);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m14749P(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m14751n(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        m14751n(sQLiteDatabase);
        m14750W(sQLiteDatabase, i10, i11);
    }
}
