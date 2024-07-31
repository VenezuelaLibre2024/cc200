package p207o6;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import p108h6.C2394s;

/* renamed from: o6.n */
/* loaded from: classes.dex */
public class C3945n {

    /* renamed from: a */
    public static String f14194a;

    /* renamed from: b */
    public static int f14195b;

    /* renamed from: a */
    public static String m14964a() {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        if (f14194a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f14194a = Application.getProcessName();
            } else {
                int i10 = f14195b;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    f14195b = i10;
                }
                String str2 = null;
                str2 = null;
                str2 = null;
                BufferedReader bufferedReader2 = null;
                if (i10 > 0) {
                    try {
                        str = "/proc/" + i10 + "/cmdline";
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        try {
                            String readLine = bufferedReader.readLine();
                            C2394s.m9619l(readLine);
                            str2 = readLine.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            C3941j.m14949a(bufferedReader2);
                            throw th;
                        }
                        C3941j.m14949a(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
                f14194a = str2;
            }
        }
        return f14194a;
    }
}
