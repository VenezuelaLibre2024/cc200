package p066e8;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p023b8.C0515g;
import p141j8.C3262f;

/* renamed from: e8.l */
/* loaded from: classes.dex */
public class C1739l {

    /* renamed from: d */
    public static final FilenameFilter f6372d = new FilenameFilter() { // from class: e8.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean m6868d;
            m6868d = C1739l.m6868d(file, str);
            return m6868d;
        }
    };

    /* renamed from: e */
    public static final Comparator<File> f6373e = new Comparator() { // from class: e8.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m6869e;
            m6869e = C1739l.m6869e((File) obj, (File) obj2);
            return m6869e;
        }
    };

    /* renamed from: a */
    public final C3262f f6374a;

    /* renamed from: b */
    public String f6375b = null;

    /* renamed from: c */
    public String f6376c = null;

    public C1739l(C3262f c3262f) {
        this.f6374a = c3262f;
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m6868d(File file, String str) {
        return str.startsWith("aqs.");
    }

    /* renamed from: e */
    public static /* synthetic */ int m6869e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    /* renamed from: f */
    public static void m6870f(C3262f c3262f, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            c3262f.m11809o(str, "aqs." + str2).createNewFile();
        } catch (IOException e10) {
            C0515g.m2482f().m2493l("Failed to persist App Quality Sessions session id.", e10);
        }
    }

    /* renamed from: g */
    public static String m6871g(C3262f c3262f, String str) {
        List<File> m11810p = c3262f.m11810p(str, f6372d);
        if (!m11810p.isEmpty()) {
            return ((File) Collections.min(m11810p, f6373e)).getName().substring(4);
        }
        C0515g.m2482f().m2492k("Unable to read App Quality Sessions session id.");
        return null;
    }

    /* renamed from: c */
    public synchronized String m6872c(String str) {
        if (Objects.equals(this.f6375b, str)) {
            return this.f6376c;
        }
        return m6871g(this.f6374a, str);
    }

    /* renamed from: h */
    public synchronized void m6873h(String str) {
        if (!Objects.equals(this.f6376c, str)) {
            m6870f(this.f6374a, this.f6375b, str);
            this.f6376c = str;
        }
    }

    /* renamed from: i */
    public synchronized void m6874i(String str) {
        if (!Objects.equals(this.f6375b, str)) {
            m6870f(this.f6374a, str, this.f6376c);
            this.f6375b = str;
        }
    }
}
