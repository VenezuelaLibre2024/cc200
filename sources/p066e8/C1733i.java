package p066e8;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import p023b8.C0515g;

/* renamed from: e8.i */
/* loaded from: classes.dex */
public class C1733i {

    /* renamed from: a */
    public static final char[] f6350a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: e8.i$a */
    /* loaded from: classes.dex */
    public enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* renamed from: r */
        public static final Map<String, a> f6361r;

        static {
            a aVar = X86_32;
            a aVar2 = ARMV6;
            a aVar3 = ARMV7;
            a aVar4 = ARM64;
            HashMap hashMap = new HashMap(4);
            f6361r = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }

        /* renamed from: b */
        public static a m6839b() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C0515g.m2482f().m2490i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = f6361r.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }
    }

    /* renamed from: A */
    public static String m6812A(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    /* renamed from: a */
    public static long m6813a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    public static synchronized long m6814b(Context context) {
        long j10;
        synchronized (C1733i.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j10 = memoryInfo.totalMem;
        }
        return j10;
    }

    /* renamed from: c */
    public static long m6815c(String str) {
        long blockSize = new StatFs(str).getBlockSize();
        return (r0.getBlockCount() * blockSize) - (blockSize * r0.getAvailableBlocks());
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: d */
    public static boolean m6816d(Context context) {
        if (!m6817e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* renamed from: e */
    public static boolean m6817e(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: f */
    public static void m6818f(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                C0515g.m2482f().m2487e(str, e10);
            }
        }
    }

    /* renamed from: g */
    public static void m6819g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public static String m6820h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        String sb3 = sb2.toString();
        if (sb3.length() > 0) {
            return m6838z(sb3);
        }
        return null;
    }

    /* renamed from: i */
    public static boolean m6821i(Context context, String str, boolean z10) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int m6828p = m6828p(context, str, "bool");
            if (m6828p > 0) {
                return resources.getBoolean(m6828p);
            }
            int m6828p2 = m6828p(context, str, "string");
            if (m6828p2 > 0) {
                return Boolean.parseBoolean(context.getString(m6828p2));
            }
        }
        return z10;
    }

    /* renamed from: j */
    public static List<C1727f> m6822j(Context context) {
        ArrayList arrayList = new ArrayList();
        int m6828p = m6828p(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int m6828p2 = m6828p(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int m6828p3 = m6828p(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (m6828p == 0 || m6828p2 == 0 || m6828p3 == 0) {
            C0515g.m2482f().m2484b(String.format("Could not find resources: %d %d %d", Integer.valueOf(m6828p), Integer.valueOf(m6828p2), Integer.valueOf(m6828p3)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(m6828p);
        String[] stringArray2 = context.getResources().getStringArray(m6828p2);
        String[] stringArray3 = context.getResources().getStringArray(m6828p3);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            C0515g.m2482f().m2484b(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i10 = 0; i10 < stringArray3.length; i10++) {
            arrayList.add(new C1727f(stringArray[i10], stringArray2[i10], stringArray3[i10]));
        }
        return arrayList;
    }

    /* renamed from: k */
    public static int m6823k() {
        return a.m6839b().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: l */
    public static int m6824l() {
        boolean m6835w = m6835w();
        ?? r02 = m6835w;
        if (m6836x()) {
            r02 = (m6835w ? 1 : 0) | 2;
        }
        return m6834v() ? r02 | 4 : r02;
    }

    /* renamed from: m */
    public static String m6825m(Context context) {
        int m6828p = m6828p(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (m6828p == 0) {
            m6828p = m6828p(context, "com.crashlytics.android.build_id", "string");
        }
        if (m6828p != 0) {
            return context.getResources().getString(m6828p);
        }
        return null;
    }

    /* renamed from: n */
    public static boolean m6826n(Context context) {
        return (m6835w() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    /* renamed from: o */
    public static String m6827o(Context context) {
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i10);
                return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
            } catch (Resources.NotFoundException unused) {
            }
        }
        return context.getPackageName();
    }

    /* renamed from: p */
    public static int m6828p(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m6827o(context));
    }

    /* renamed from: q */
    public static SharedPreferences m6829q(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: r */
    public static String m6830r(String str, String str2) {
        return m6831s(str.getBytes(), str2);
    }

    /* renamed from: s */
    public static String m6831s(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return m6832t(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            C0515g.m2482f().m2487e("Could not create hashing algorithm: " + str + ", returning empty string.", e10);
            return "";
        }
    }

    /* renamed from: t */
    public static String m6832t(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f6350a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: u */
    public static boolean m6833u(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: v */
    public static boolean m6834v() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: w */
    public static boolean m6835w() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: x */
    public static boolean m6836x() {
        boolean m6835w = m6835w();
        String str = Build.TAGS;
        if ((m6835w || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !m6835w && new File("/system/xbin/su").exists();
        }
        return true;
    }

    /* renamed from: y */
    public static boolean m6837y(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* renamed from: z */
    public static String m6838z(String str) {
        return m6830r(str, "SHA-1");
    }
}
