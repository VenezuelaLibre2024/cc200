package nc;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p213oc.C3983a;

/* renamed from: nc.d0 */
/* loaded from: classes2.dex */
public class C3791d0 {
    /* renamed from: a */
    public static List<Object> m14438a(Cursor cursor, int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Object m14439b = m14439b(cursor, i11);
            if (C3983a.f14364c) {
                String name = m14439b != null ? m14439b.getClass().isArray() ? "array(" + m14439b.getClass().getComponentType().getName() + ")" : m14439b.getClass().getName() : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("column ");
                sb2.append(i11);
                sb2.append(" ");
                sb2.append(cursor.getType(i11));
                sb2.append(": ");
                sb2.append(m14439b);
                sb2.append(name == null ? "" : " (" + name + ")");
                Log.d("Sqflite", sb2.toString());
            }
            arrayList.add(m14439b);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Object m14439b(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i10);
    }

    /* renamed from: c */
    public static Locale m14440c(String str) {
        return Locale.forLanguageTag(str);
    }

    /* renamed from: d */
    public static Locale m14441d(String str) {
        String str2;
        String str3;
        String str4;
        String[] split = str.split("-");
        str2 = "";
        if (split.length > 0) {
            String str5 = split[0];
            if (split.length > 1) {
                str4 = split[1];
                str3 = split.length > 2 ? split[split.length - 1] : "";
            } else {
                str3 = "";
                str4 = str3;
            }
            str2 = str5;
        } else {
            str3 = "";
            str4 = str3;
        }
        return new Locale(str2, str4, str3);
    }

    /* renamed from: e */
    public static Locale m14442e(String str) {
        return Build.VERSION.SDK_INT >= 21 ? m14440c(str) : m14441d(str);
    }
}
