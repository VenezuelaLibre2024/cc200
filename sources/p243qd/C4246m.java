package p243qd;

import ae.C0109o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import td.C4753m;

/* renamed from: qd.m */
/* loaded from: classes2.dex */
public class C4246m extends C4245l {
    /* renamed from: e */
    public static final File m16293e(File file, File file2, boolean z10, int i10) {
        C4753m.m18653f(file, "<this>");
        C4753m.m18653f(file2, "target");
        if (!file.exists()) {
            throw new C4247n(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists()) {
            if (!z10) {
                throw new C4239f(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new C4239f(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    C4235b.m16271a(fileInputStream, fileOutputStream, i10);
                    C4236c.m16274a(fileOutputStream, null);
                    C4236c.m16274a(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!file2.mkdirs()) {
            throw new C4240g(file, file2, "Failed to create target directory.");
        }
        return file2;
    }

    /* renamed from: f */
    public static /* synthetic */ File m16294f(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return m16293e(file, file2, z10, i10);
    }

    /* renamed from: g */
    public static final File m16295g(String str, String str2, File file) {
        C4753m.m18653f(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        C4753m.m18652e(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    /* renamed from: h */
    public static final boolean m16296h(File file) {
        C4753m.m18653f(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : C4245l.m16292d(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                        break;
                    }
                }
                z10 = false;
            }
            return z10;
        }
    }

    /* renamed from: i */
    public static final String m16297i(File file) {
        C4753m.m18653f(file, "<this>");
        String name = file.getName();
        C4753m.m18652e(name, "name");
        return C0109o.m473n0(name, '.', "");
    }
}
