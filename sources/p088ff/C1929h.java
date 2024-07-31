package p088ff;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.ArrayList;
import java.util.List;
import td.C4753m;
import vn.hunghd.flutterdownloader.C5181b;

/* renamed from: ff.h */
/* loaded from: classes2.dex */
public final class C1929h {

    /* renamed from: a */
    public final C5181b f7313a;

    /* renamed from: b */
    public final String[] f7314b;

    public C1929h(C5181b c5181b) {
        C4753m.m18653f(c5181b, "dbHelper");
        this.f7313a = c5181b;
        this.f7314b = new String[]{"_id", "task_id", "progress", "status", WebViewActivity.URL_EXTRA, "file_name", "saved_dir", "headers", "mime_type", "resumable", "open_file_from_notification", "show_notification", "time_created", "save_in_public_storage", "allow_cellular"};
    }

    /* renamed from: a */
    public final void m7835a(String str) {
        C4753m.m18653f(str, "taskId");
        SQLiteDatabase writableDatabase = this.f7313a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.delete("task", "task_id = ?", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: b */
    public final void m7836b(String str, String str2, EnumC1922a enumC1922a, int i10, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13) {
        C4753m.m18653f(enumC1922a, "status");
        SQLiteDatabase writableDatabase = this.f7313a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("task_id", str);
        contentValues.put(WebViewActivity.URL_EXTRA, str2);
        contentValues.put("status", Integer.valueOf(enumC1922a.ordinal()));
        contentValues.put("progress", Integer.valueOf(i10));
        contentValues.put("file_name", str3);
        contentValues.put("saved_dir", str4);
        contentValues.put("headers", str5);
        contentValues.put("mime_type", "unknown");
        contentValues.put("show_notification", Integer.valueOf(z10 ? 1 : 0));
        contentValues.put("open_file_from_notification", Integer.valueOf(z11 ? 1 : 0));
        contentValues.put("resumable", (Integer) 0);
        contentValues.put("time_created", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("save_in_public_storage", Integer.valueOf(z12 ? 1 : 0));
        contentValues.put("allow_cellular", Integer.valueOf(z13 ? 1 : 0));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.insertWithOnConflict("task", null, contentValues, 5);
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: c */
    public final List<C1923b> m7837c() {
        Cursor query = this.f7313a.getReadableDatabase().query("task", this.f7314b, null, null, null, null, null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            C4753m.m18652e(query, "cursor");
            arrayList.add(m7840f(query));
        }
        query.close();
        return arrayList;
    }

    /* renamed from: d */
    public final C1923b m7838d(String str) {
        C4753m.m18653f(str, "taskId");
        Cursor query = this.f7313a.getReadableDatabase().query("task", this.f7314b, "task_id = ?", new String[]{str}, null, null, "_id DESC", "1");
        C1923b c1923b = null;
        while (query.moveToNext()) {
            C4753m.m18652e(query, "cursor");
            c1923b = m7840f(query);
        }
        query.close();
        return c1923b;
    }

    /* renamed from: e */
    public final List<C1923b> m7839e(String str) {
        Cursor rawQuery = this.f7313a.getReadableDatabase().rawQuery(str, null);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            C4753m.m18652e(rawQuery, "cursor");
            arrayList.add(m7840f(rawQuery));
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: f */
    public final C1923b m7840f(Cursor cursor) {
        int i10 = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("task_id"));
        int i11 = cursor.getInt(cursor.getColumnIndexOrThrow("status"));
        int i12 = cursor.getInt(cursor.getColumnIndexOrThrow("progress"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(WebViewActivity.URL_EXTRA));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("file_name"));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("saved_dir"));
        String string5 = cursor.getString(cursor.getColumnIndexOrThrow("headers"));
        String string6 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        short s10 = cursor.getShort(cursor.getColumnIndexOrThrow("resumable"));
        short s11 = cursor.getShort(cursor.getColumnIndexOrThrow("show_notification"));
        short s12 = cursor.getShort(cursor.getColumnIndexOrThrow("open_file_from_notification"));
        long j10 = cursor.getLong(cursor.getColumnIndexOrThrow("time_created"));
        short s13 = cursor.getShort(cursor.getColumnIndexOrThrow("save_in_public_storage"));
        short s14 = cursor.getShort(cursor.getColumnIndexOrThrow("allow_cellular"));
        C4753m.m18652e(string, "taskId");
        EnumC1922a enumC1922a = EnumC1922a.values()[i11];
        C4753m.m18652e(string2, WebViewActivity.URL_EXTRA);
        C4753m.m18652e(string4, "savedDir");
        C4753m.m18652e(string5, "headers");
        C4753m.m18652e(string6, "mimeType");
        return new C1923b(i10, string, enumC1922a, i12, string2, string3, string4, string5, string6, s10 == 1, s11 == 1, s12 == 1, j10, s13 == 1, s14 == 1);
    }

    /* renamed from: g */
    public final void m7841g(String str, EnumC1922a enumC1922a, int i10) {
        C4753m.m18653f(str, "taskId");
        C4753m.m18653f(enumC1922a, "status");
        SQLiteDatabase writableDatabase = this.f7313a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(enumC1922a.ordinal()));
        contentValues.put("progress", Integer.valueOf(i10));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: h */
    public final void m7842h(String str, String str2, EnumC1922a enumC1922a, int i10, boolean z10) {
        C4753m.m18653f(str, "currentTaskId");
        C4753m.m18653f(enumC1922a, "status");
        SQLiteDatabase writableDatabase = this.f7313a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("task_id", str2);
        contentValues.put("status", Integer.valueOf(enumC1922a.ordinal()));
        contentValues.put("progress", Integer.valueOf(i10));
        contentValues.put("resumable", Integer.valueOf(z10 ? 1 : 0));
        contentValues.put("time_created", Long.valueOf(System.currentTimeMillis()));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: i */
    public final void m7843i(String str, String str2, String str3) {
        C4753m.m18653f(str, "taskId");
        SQLiteDatabase writableDatabase = this.f7313a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("file_name", str2);
        contentValues.put("mime_type", str3);
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* renamed from: j */
    public final void m7844j(String str, boolean z10) {
        C4753m.m18653f(str, "taskId");
        SQLiteDatabase writableDatabase = this.f7313a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("resumable", Integer.valueOf(z10 ? 1 : 0));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }
}
