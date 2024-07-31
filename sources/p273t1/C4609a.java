package p273t1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import p262s1.C4387a;
import p262s1.InterfaceC4388b;
import p262s1.InterfaceC4391e;
import p262s1.InterfaceC4392f;

/* renamed from: t1.a */
/* loaded from: classes.dex */
public class C4609a implements InterfaceC4388b {

    /* renamed from: i */
    public static final String[] f17274i = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: j */
    public static final String[] f17275j = new String[0];

    /* renamed from: h */
    public final SQLiteDatabase f17276h;

    /* renamed from: t1.a$a */
    /* loaded from: classes.dex */
    public class a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4391e f17277a;

        public a(InterfaceC4391e interfaceC4391e) {
            this.f17277a = interfaceC4391e;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f17277a.mo14594d(new C4612d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: t1.a$b */
    /* loaded from: classes.dex */
    public class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4391e f17279a;

        public b(InterfaceC4391e interfaceC4391e) {
            this.f17279a = interfaceC4391e;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f17279a.mo14594d(new C4612d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C4609a(SQLiteDatabase sQLiteDatabase) {
        this.f17276h = sQLiteDatabase;
    }

    @Override // p262s1.InterfaceC4388b
    /* renamed from: G */
    public Cursor mo16967G(InterfaceC4391e interfaceC4391e) {
        return this.f17276h.rawQueryWithFactory(new a(interfaceC4391e), interfaceC4391e.mo14593a(), f17275j, null);
    }

    @Override // p262s1.InterfaceC4388b
    /* renamed from: N */
    public void mo16968N() {
        this.f17276h.setTransactionSuccessful();
    }

    @Override // p262s1.InterfaceC4388b
    /* renamed from: O */
    public void mo16969O(String str, Object[] objArr) {
        this.f17276h.execSQL(str, objArr);
    }

    @Override // p262s1.InterfaceC4388b
    /* renamed from: V */
    public Cursor mo16970V(String str) {
        return mo16967G(new C4387a(str));
    }

    @Override // p262s1.InterfaceC4388b
    /* renamed from: Z */
    public void mo16971Z() {
        this.f17276h.endTransaction();
    }

    /* renamed from: a */
    public boolean m18187a(SQLiteDatabase sQLiteDatabase) {
        return this.f17276h == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17276h.close();
    }

    @Override // p262s1.InterfaceC4388b
    /* renamed from: g */
    public void mo16972g() {
        this.f17276h.beginTransaction();
    }

    @Override // p262s1.InterfaceC4388b
    public boolean isOpen() {
        return this.f17276h.isOpen();
    }

    @Override // p262s1.InterfaceC4388b
    /* renamed from: k */
    public List<Pair<String, String>> mo16973k() {
        return this.f17276h.getAttachedDbs();
    }

    @Override // p262s1.InterfaceC4388b
    /* renamed from: o */
    public Cursor mo16974o(InterfaceC4391e interfaceC4391e, CancellationSignal cancellationSignal) {
        return this.f17276h.rawQueryWithFactory(new b(interfaceC4391e), interfaceC4391e.mo14593a(), f17275j, null, cancellationSignal);
    }

    @Override // p262s1.InterfaceC4388b
    /* renamed from: o0 */
    public String mo16975o0() {
        return this.f17276h.getPath();
    }

    @Override // p262s1.InterfaceC4388b
    /* renamed from: p */
    public void mo16976p(String str) {
        this.f17276h.execSQL(str);
    }

    @Override // p262s1.InterfaceC4388b
    /* renamed from: q0 */
    public boolean mo16977q0() {
        return this.f17276h.inTransaction();
    }

    @Override // p262s1.InterfaceC4388b
    /* renamed from: t */
    public InterfaceC4392f mo16978t(String str) {
        return new C4613e(this.f17276h.compileStatement(str));
    }
}
