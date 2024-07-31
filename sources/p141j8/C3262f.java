package p141j8;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p023b8.C0515g;

/* renamed from: j8.f */
/* loaded from: classes.dex */
public class C3262f {

    /* renamed from: a */
    public final File f11384a;

    /* renamed from: b */
    public final File f11385b;

    /* renamed from: c */
    public final File f11386c;

    /* renamed from: d */
    public final File f11387d;

    /* renamed from: e */
    public final File f11388e;

    /* renamed from: f */
    public final File f11389f;

    public C3262f(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f11384a = filesDir;
        if (m11794v()) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + m11793u(Application.getProcessName());
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File m11789q = m11789q(new File(filesDir, str));
        this.f11385b = m11789q;
        this.f11386c = m11789q(new File(m11789q, "open-sessions"));
        this.f11387d = m11789q(new File(m11789q, "reports"));
        this.f11388e = m11789q(new File(m11789q, "priority-reports"));
        this.f11389f = m11789q(new File(m11789q, "native-reports"));
    }

    /* renamed from: q */
    public static synchronized File m11789q(File file) {
        synchronized (C3262f.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                C0515g.m2482f().m2484b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                C0515g.m2482f().m2486d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        }
    }

    /* renamed from: r */
    public static File m11790r(File file) {
        file.mkdirs();
        return file;
    }

    /* renamed from: s */
    public static boolean m11791s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                m11791s(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: t */
    public static <T> List<T> m11792t(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    /* renamed from: u */
    public static String m11793u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    @SuppressLint({"AnnotateVersionCheck"})
    /* renamed from: v */
    public static boolean m11794v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: a */
    public final void m11795a(File file) {
        if (file.exists() && m11791s(file)) {
            C0515g.m2482f().m2484b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: b */
    public void m11796b() {
        m11795a(new File(this.f11384a, ".com.google.firebase.crashlytics"));
        m11795a(new File(this.f11384a, ".com.google.firebase.crashlytics-ndk"));
        if (m11794v()) {
            m11795a(new File(this.f11384a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    /* renamed from: c */
    public boolean m11797c(String str) {
        return m11791s(new File(this.f11386c, str));
    }

    /* renamed from: d */
    public List<String> m11798d() {
        return m11792t(this.f11386c.list());
    }

    /* renamed from: e */
    public File m11799e(String str) {
        return new File(this.f11385b, str);
    }

    /* renamed from: f */
    public List<File> m11800f(FilenameFilter filenameFilter) {
        return m11792t(this.f11385b.listFiles(filenameFilter));
    }

    /* renamed from: g */
    public File m11801g(String str) {
        return new File(this.f11389f, str);
    }

    /* renamed from: h */
    public List<File> m11802h() {
        return m11792t(this.f11389f.listFiles());
    }

    /* renamed from: i */
    public File m11803i(String str) {
        return m11790r(new File(m11808n(str), "native"));
    }

    /* renamed from: j */
    public File m11804j(String str) {
        return new File(this.f11388e, str);
    }

    /* renamed from: k */
    public List<File> m11805k() {
        return m11792t(this.f11388e.listFiles());
    }

    /* renamed from: l */
    public File m11806l(String str) {
        return new File(this.f11387d, str);
    }

    /* renamed from: m */
    public List<File> m11807m() {
        return m11792t(this.f11387d.listFiles());
    }

    /* renamed from: n */
    public final File m11808n(String str) {
        return m11790r(new File(this.f11386c, str));
    }

    /* renamed from: o */
    public File m11809o(String str, String str2) {
        return new File(m11808n(str), str2);
    }

    /* renamed from: p */
    public List<File> m11810p(String str, FilenameFilter filenameFilter) {
        return m11792t(m11808n(str).listFiles(filenameFilter));
    }
}
