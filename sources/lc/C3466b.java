package lc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.scottyab.rootbeer.RootBeerNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import mc.C3609a;

/* renamed from: lc.b */
/* loaded from: classes2.dex */
public class C3466b {

    /* renamed from: a */
    public final Context f12176a;

    /* renamed from: b */
    public boolean f12177b = true;

    public C3466b(Context context) {
        this.f12176a = context;
    }

    /* renamed from: a */
    public boolean m12897a() {
        return new RootBeerNative().m6000a();
    }

    /* renamed from: b */
    public boolean m12898b(String str) {
        boolean z10 = false;
        for (String str2 : C3465a.m12896a()) {
            String str3 = str2 + str;
            if (new File(str2, str).exists()) {
                C3609a.m13361f(str3 + " binary detected!");
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: c */
    public boolean m12899c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", "1");
        hashMap.put("ro.secure", "0");
        String[] m12912p = m12912p();
        if (m12912p == null) {
            return false;
        }
        boolean z10 = false;
        for (String str : m12912p) {
            for (String str2 : hashMap.keySet()) {
                if (str.contains(str2)) {
                    String str3 = "[" + ((String) hashMap.get(str2)) + "]";
                    if (str.contains(str3)) {
                        C3609a.m13361f(str2 + " = " + str3 + " detected!");
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    /* renamed from: d */
    public boolean m12900d() {
        return m12898b("magisk");
    }

    /* renamed from: e */
    public boolean m12901e() {
        String str;
        String str2;
        String[] strArr;
        String[] m12911o = m12911o();
        int i10 = 0;
        if (m12911o == null) {
            return false;
        }
        int i11 = Build.VERSION.SDK_INT;
        int length = m12911o.length;
        int i12 = 0;
        boolean z10 = false;
        while (i12 < length) {
            String str3 = m12911o[i12];
            String[] split = str3.split(" ");
            int i13 = 23;
            if ((i11 > 23 || split.length >= 4) && (i11 <= 23 || split.length >= 6)) {
                if (i11 > 23) {
                    str = split[2];
                    str2 = split[5];
                } else {
                    str = split[1];
                    str2 = split[3];
                }
                String[] strArr2 = C3465a.f12175e;
                int length2 = strArr2.length;
                int i14 = i10;
                while (i14 < length2) {
                    String str4 = strArr2[i14];
                    if (str.equalsIgnoreCase(str4)) {
                        if (Build.VERSION.SDK_INT > i13) {
                            str2 = str2.replace("(", "").replace(")", "");
                        }
                        String[] split2 = str2.split(",");
                        int length3 = split2.length;
                        int i15 = 0;
                        while (i15 < length3) {
                            strArr = m12911o;
                            if (split2[i15].equalsIgnoreCase("rw")) {
                                C3609a.m13361f(str4 + " path is mounted with rw permissions! " + str3);
                                z10 = true;
                                break;
                            }
                            i15++;
                            m12911o = strArr;
                        }
                    }
                    strArr = m12911o;
                    i14++;
                    m12911o = strArr;
                    i13 = 23;
                }
            } else {
                C3609a.m13357b("Error formatting mount line: " + str3);
            }
            i12++;
            m12911o = m12911o;
            i10 = 0;
        }
        return z10;
    }

    /* renamed from: f */
    public boolean m12902f() {
        if (!m12897a()) {
            C3609a.m13357b("We could not load the native library to test for root");
            return false;
        }
        String[] m12896a = C3465a.m12896a();
        int length = m12896a.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = m12896a[i10] + "su";
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.f12177b);
            return rootBeerNative.checkForRoot(strArr) > 0;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    /* renamed from: g */
    public boolean m12903g() {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"which", "su"});
            boolean z10 = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null;
            process.destroy();
            return z10;
        } catch (Throwable unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    /* renamed from: h */
    public boolean m12904h() {
        return m12905i(null);
    }

    /* renamed from: i */
    public boolean m12905i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(C3465a.f12172b));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return m12909m(arrayList);
    }

    /* renamed from: j */
    public boolean m12906j() {
        return m12907k(null);
    }

    /* renamed from: k */
    public boolean m12907k(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(C3465a.f12171a));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return m12909m(arrayList);
    }

    /* renamed from: l */
    public boolean m12908l() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: m */
    public final boolean m12909m(List<String> list) {
        PackageManager packageManager = this.f12176a.getPackageManager();
        boolean z10 = false;
        for (String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                C3609a.m13357b(str + " ROOT management app detected!");
                z10 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z10;
    }

    /* renamed from: n */
    public boolean m12910n() {
        return m12906j() || m12904h() || m12898b("su") || m12899c() || m12901e() || m12908l() || m12903g() || m12902f() || m12900d();
    }

    /* renamed from: o */
    public final String[] m12911o() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e10) {
            C3609a.m13356a(e10);
            return null;
        }
    }

    /* renamed from: p */
    public final String[] m12912p() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e10) {
            C3609a.m13356a(e10);
            return null;
        }
    }
}
