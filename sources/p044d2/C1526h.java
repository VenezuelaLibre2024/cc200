package p044d2;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p029c2.AbstractC0592j;

/* renamed from: d2.h */
/* loaded from: classes.dex */
public class C1526h {

    /* renamed from: a */
    public static final String f5572a = AbstractC0592j.m2972f("WrkDbPathHelper");

    /* renamed from: b */
    public static final String[] f5573b = {"-journal", "-shm", "-wal"};

    /* renamed from: a */
    public static File m6184a(Context context) {
        return Build.VERSION.SDK_INT < 23 ? m6185b(context) : m6186c(context, "androidx.work.workdb");
    }

    /* renamed from: b */
    public static File m6185b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    /* renamed from: c */
    public static File m6186c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    /* renamed from: d */
    public static String m6187d() {
        return "androidx.work.workdb";
    }

    /* renamed from: e */
    public static void m6188e(Context context) {
        File m6185b = m6185b(context);
        if (Build.VERSION.SDK_INT < 23 || !m6185b.exists()) {
            return;
        }
        AbstractC0592j.m2970c().mo2973a(f5572a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        Map<File, File> m6189f = m6189f(context);
        for (File file : m6189f.keySet()) {
            File file2 = m6189f.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    AbstractC0592j.m2970c().mo2977h(f5572a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                AbstractC0592j.m2970c().mo2973a(f5572a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
            }
        }
    }

    /* renamed from: f */
    public static Map<File, File> m6189f(Context context) {
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            File m6185b = m6185b(context);
            File m6184a = m6184a(context);
            hashMap.put(m6185b, m6184a);
            for (String str : f5573b) {
                hashMap.put(new File(m6185b.getPath() + str), new File(m6184a.getPath() + str));
            }
        }
        return hashMap;
    }
}
