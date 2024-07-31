package p215oe;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import ne.InterfaceC3817a;
import pe.C4119b;

/* renamed from: oe.e */
/* loaded from: classes2.dex */
public class C3989e implements InterfaceC3817a {

    /* renamed from: b */
    public static final String[] f14368b = {"_id", Constants.CLASS};

    /* renamed from: a */
    public DefaultBadger f14369a;

    public C3989e() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f14369a = new DefaultBadger();
        }
    }

    @Override // ne.InterfaceC3817a
    /* renamed from: a */
    public List<String> mo13372a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // ne.InterfaceC3817a
    /* renamed from: b */
    public void mo13373b(Context context, ComponentName componentName, int i10) {
        DefaultBadger defaultBadger = this.f14369a;
        if (defaultBadger != null && defaultBadger.m13374c(context)) {
            this.f14369a.mo13373b(context, componentName, i10);
            return;
        }
        Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, f14368b, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursor != null) {
                String className = componentName.getClassName();
                boolean z10 = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, m15116c(componentName, i10, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex(Constants.CLASS)))) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    contentResolver.insert(parse, m15116c(componentName, i10, true));
                }
            }
        } finally {
            C4119b.m15893a(cursor);
        }
    }

    /* renamed from: c */
    public final ContentValues m15116c(ComponentName componentName, int i10, boolean z10) {
        ContentValues contentValues = new ContentValues();
        if (z10) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put(Constants.CLASS, componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i10));
        return contentValues;
    }
}
