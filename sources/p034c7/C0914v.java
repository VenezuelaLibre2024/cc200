package p034c7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: c7.v */
/* loaded from: classes.dex */
public final class C0914v {
    /* renamed from: a */
    public static Set<String> m3901a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: b */
    public static void m3902b(C0919v4 c0919v4, SQLiteDatabase sQLiteDatabase) {
        if (c0919v4 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            c0919v4.m3919G().m3995a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c0919v4.m3919G().m3995a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c0919v4.m3919G().m3995a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c0919v4.m3919G().m3995a("Failed to turn on database write permission for owner");
    }

    /* renamed from: c */
    public static void m3903c(C0919v4 c0919v4, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (c0919v4 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!m3904d(c0919v4, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set<String> m3901a = m3901a(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!m3901a.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                    if (!m3901a.remove(strArr[i10])) {
                        sQLiteDatabase.execSQL(strArr[i10 + 1]);
                    }
                }
            }
            if (m3901a.isEmpty()) {
                return;
            }
            c0919v4.m3919G().m3997c("Table has extra columns. table, columns", str, TextUtils.join(", ", m3901a));
        } catch (SQLiteException e10) {
            c0919v4.m3914B().m3996b("Failed to verify columns on table that was just created", str);
            throw e10;
        }
    }

    /* renamed from: d */
    public static boolean m3904d(C0919v4 c0919v4, SQLiteDatabase sQLiteDatabase, String str) {
        if (c0919v4 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (SQLiteException e10) {
                c0919v4.m3919G().m3997c("Error querying for table", str, e10);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
