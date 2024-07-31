package vn.hunghd.flutterdownloader;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import td.C4747g;
import td.C4753m;

/* renamed from: vn.hunghd.flutterdownloader.b */
/* loaded from: classes2.dex */
public final class C5181b extends SQLiteOpenHelper {

    /* renamed from: h */
    public static final a f19564h = new a(null);

    /* renamed from: i */
    public static C5181b f19565i;

    /* renamed from: vn.hunghd.flutterdownloader.b$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final C5181b m21010a(Context context) {
            if (C5181b.f19565i == null) {
                C4753m.m18650c(context);
                Context applicationContext = context.getApplicationContext();
                C4753m.m18652e(applicationContext, "ctx!!.applicationContext");
                C5181b.f19565i = new C5181b(applicationContext, null);
            }
            C5181b c5181b = C5181b.f19565i;
            C4753m.m18650c(c5181b);
            return c5181b;
        }
    }

    public C5181b(Context context) {
        super(context, "download_tasks.db", (SQLiteDatabase.CursorFactory) null, 4);
    }

    public /* synthetic */ C5181b(Context context, C4747g c4747g) {
        this(context);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C4753m.m18653f(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE task (_id INTEGER PRIMARY KEY,task_id VARCHAR(256), url TEXT, status INTEGER DEFAULT 0, progress INTEGER DEFAULT 0, file_name TEXT, saved_dir TEXT, headers TEXT, mime_type VARCHAR(128), resumable TINYINT DEFAULT 0, show_notification TINYINT DEFAULT 0, open_file_from_notification TINYINT DEFAULT 0, time_created INTEGER DEFAULT 0, save_in_public_storage TINYINT DEFAULT 0, allow_cellular TINYINT DEFAULT 1)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        C4753m.m18653f(sQLiteDatabase, "db");
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        String str;
        C4753m.m18653f(sQLiteDatabase, "db");
        if (i11 == 4) {
            str = "ALTER TABLE task ADD COLUMN allow_cellular TINYINT DEFAULT 1";
        } else {
            if (i10 != 2 || i11 != 3) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS task");
                onCreate(sQLiteDatabase);
                return;
            }
            str = "ALTER TABLE task ADD COLUMN save_in_public_storage TINYINT DEFAULT 0";
        }
        sQLiteDatabase.execSQL(str);
    }
}
