package pe;

import android.database.Cursor;

/* renamed from: pe.b */
/* loaded from: classes2.dex */
public class C4119b {
    /* renamed from: a */
    public static void m15893a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }
}
