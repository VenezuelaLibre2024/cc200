package p273t1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import p262s1.InterfaceC4388b;
import p262s1.InterfaceC4389c;

/* renamed from: t1.b */
/* loaded from: classes.dex */
public class C4610b implements InterfaceC4389c {

    /* renamed from: h */
    public final Context f17281h;

    /* renamed from: i */
    public final String f17282i;

    /* renamed from: j */
    public final InterfaceC4389c.a f17283j;

    /* renamed from: k */
    public final boolean f17284k;

    /* renamed from: l */
    public final Object f17285l = new Object();

    /* renamed from: m */
    public a f17286m;

    /* renamed from: n */
    public boolean f17287n;

    /* renamed from: t1.b$a */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: h */
        public final C4609a[] f17288h;

        /* renamed from: i */
        public final InterfaceC4389c.a f17289i;

        /* renamed from: j */
        public boolean f17290j;

        /* renamed from: t1.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C6207a implements DatabaseErrorHandler {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4389c.a f17291a;

            /* renamed from: b */
            public final /* synthetic */ C4609a[] f17292b;

            public C6207a(InterfaceC4389c.a aVar, C4609a[] c4609aArr) {
                this.f17291a = aVar;
                this.f17292b = c4609aArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f17291a.m16980c(a.m18189d(this.f17292b, sQLiteDatabase));
            }
        }

        public a(Context context, String str, C4609a[] c4609aArr, InterfaceC4389c.a aVar) {
            super(context, str, null, aVar.f16105a, new C6207a(aVar, c4609aArr));
            this.f17289i = aVar;
            this.f17288h = c4609aArr;
        }

        /* renamed from: d */
        public static C4609a m18189d(C4609a[] c4609aArr, SQLiteDatabase sQLiteDatabase) {
            C4609a c4609a = c4609aArr[0];
            if (c4609a == null || !c4609a.m18187a(sQLiteDatabase)) {
                c4609aArr[0] = new C4609a(sQLiteDatabase);
            }
            return c4609aArr[0];
        }

        /* renamed from: a */
        public C4609a m18190a(SQLiteDatabase sQLiteDatabase) {
            return m18189d(this.f17288h, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f17288h[0] = null;
        }

        /* renamed from: f */
        public synchronized InterfaceC4388b m18191f() {
            this.f17290j = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f17290j) {
                return m18190a(writableDatabase);
            }
            close();
            return m18191f();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f17289i.mo14581b(m18190a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f17289i.mo14582d(m18190a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f17290j = true;
            this.f17289i.mo14583e(m18190a(sQLiteDatabase), i10, i11);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f17290j) {
                return;
            }
            this.f17289i.mo14584f(m18190a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f17290j = true;
            this.f17289i.mo14585g(m18190a(sQLiteDatabase), i10, i11);
        }
    }

    public C4610b(Context context, String str, InterfaceC4389c.a aVar, boolean z10) {
        this.f17281h = context;
        this.f17282i = str;
        this.f17283j = aVar;
        this.f17284k = z10;
    }

    @Override // p262s1.InterfaceC4389c
    /* renamed from: U */
    public InterfaceC4388b mo14600U() {
        return m18188a().m18191f();
    }

    /* renamed from: a */
    public final a m18188a() {
        a aVar;
        synchronized (this.f17285l) {
            if (this.f17286m == null) {
                C4609a[] c4609aArr = new C4609a[1];
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 23 || this.f17282i == null || !this.f17284k) {
                    this.f17286m = new a(this.f17281h, this.f17282i, c4609aArr, this.f17283j);
                } else {
                    this.f17286m = new a(this.f17281h, new File(this.f17281h.getNoBackupFilesDir(), this.f17282i).getAbsolutePath(), c4609aArr, this.f17283j);
                }
                if (i10 >= 16) {
                    this.f17286m.setWriteAheadLoggingEnabled(this.f17287n);
                }
            }
            aVar = this.f17286m;
        }
        return aVar;
    }

    @Override // p262s1.InterfaceC4389c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m18188a().close();
    }

    @Override // p262s1.InterfaceC4389c
    public String getDatabaseName() {
        return this.f17282i;
    }

    @Override // p262s1.InterfaceC4389c
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f17285l) {
            a aVar = this.f17286m;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z10);
            }
            this.f17287n = z10;
        }
    }
}
