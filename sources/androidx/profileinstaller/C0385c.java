package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.profileinstaller.C0385c;
import androidx.window.layout.ExecutorC0412c;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: androidx.profileinstaller.c */
/* loaded from: classes.dex */
public class C0385c {

    /* renamed from: a */
    public static final c f1813a = new a();

    /* renamed from: b */
    public static final c f1814b = new b();

    /* renamed from: androidx.profileinstaller.c$a */
    /* loaded from: classes.dex */
    public class a implements c {
        @Override // androidx.profileinstaller.C0385c.c
        /* renamed from: a */
        public void mo1907a(int i10, Object obj) {
        }

        @Override // androidx.profileinstaller.C0385c.c
        /* renamed from: b */
        public void mo1908b(int i10, Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.c$b */
    /* loaded from: classes.dex */
    public class b implements c {
        @Override // androidx.profileinstaller.C0385c.c
        /* renamed from: a */
        public void mo1907a(int i10, Object obj) {
            Log.d("ProfileInstaller", i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }

        @Override // androidx.profileinstaller.C0385c.c
        /* renamed from: b */
        public void mo1908b(int i10, Object obj) {
            String str;
            switch (i10) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* renamed from: androidx.profileinstaller.c$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo1907a(int i10, Object obj);

        /* renamed from: b */
        void mo1908b(int i10, Object obj);
    }

    /* renamed from: b */
    public static boolean m1942b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    /* renamed from: c */
    public static void m1943c(Context context, Executor executor, c cVar) {
        m1942b(context.getFilesDir());
        m1947g(executor, cVar, 11, null);
    }

    /* renamed from: d */
    public static boolean m1944d(PackageInfo packageInfo, File file, c cVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                boolean z10 = readLong == packageInfo.lastUpdateTime;
                if (z10) {
                    cVar.mo1908b(2, null);
                }
                return z10;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static void m1946f(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: g */
    public static void m1947g(Executor executor, c cVar, int i10, Object obj) {
        executor.execute(new Runnable() { // from class: n1.e

            /* renamed from: i */
            public final /* synthetic */ int f13152i;

            /* renamed from: j */
            public final /* synthetic */ Object f13153j;

            public /* synthetic */ RunnableC3693e(int i102, Object obj2) {
                r2 = i102;
                r3 = obj2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0385c.c.this.mo1908b(r2, r3);
            }
        });
    }

    /* renamed from: h */
    public static boolean m1948h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) {
        if (Build.VERSION.SDK_INT < 19) {
            m1947g(executor, cVar, 3, null);
            return false;
        }
        C0384b c0384b = new C0384b(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!c0384b.m1933e()) {
            return false;
        }
        boolean m1940n = c0384b.m1936i().m1939m().m1940n();
        if (m1940n) {
            m1946f(packageInfo, file);
        }
        return m1940n;
    }

    /* renamed from: i */
    public static void m1949i(Context context) {
        m1950j(context, ExecutorC0412c.f1952h, f1813a);
    }

    /* renamed from: j */
    public static void m1950j(Context context, Executor executor, c cVar) {
        m1951k(context, executor, cVar, false);
    }

    /* renamed from: k */
    public static void m1951k(Context context, Executor executor, c cVar, boolean z10) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z11 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (z10 || !m1944d(packageInfo, filesDir, cVar)) {
                Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
                if (m1948h(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z10) {
                    z11 = true;
                }
            } else {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
            }
            C0386d.m1955c(context, z11);
        } catch (PackageManager.NameNotFoundException e10) {
            cVar.mo1908b(7, e10);
            C0386d.m1955c(context, false);
        }
    }

    /* renamed from: l */
    public static void m1952l(Context context, Executor executor, c cVar) {
        try {
            m1946f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m1947g(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e10) {
            m1947g(executor, cVar, 7, e10);
        }
    }
}
