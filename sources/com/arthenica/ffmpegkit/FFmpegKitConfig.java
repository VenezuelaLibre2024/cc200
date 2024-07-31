package com.arthenica.ffmpegkit;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.SparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p233q2.C4129a0;
import p233q2.C4138h;
import p233q2.C4141k;
import p233q2.C4144n;
import p233q2.C4148r;
import p233q2.C4149s;
import p233q2.C4151u;
import p233q2.C4153w;
import p233q2.EnumC4143m;
import p233q2.EnumC4146p;
import p233q2.EnumC4155y;
import p233q2.EnumC4156z;
import p233q2.InterfaceC4131b0;
import p233q2.InterfaceC4139i;
import p233q2.InterfaceC4142l;
import p233q2.InterfaceC4145o;
import p233q2.InterfaceC4150t;
import p233q2.InterfaceC4154x;
import p233q2.RunnableC4132c;
import p233q2.RunnableC4134d;
import p233q2.RunnableC4135e;
import p274t2.C4614a;

/* loaded from: classes.dex */
public class FFmpegKitConfig {

    /* renamed from: a */
    public static final AtomicInteger f4106a;

    /* renamed from: b */
    public static EnumC4143m f4107b;

    /* renamed from: c */
    public static int f4108c;

    /* renamed from: d */
    public static final Map<Long, InterfaceC4154x> f4109d;

    /* renamed from: e */
    public static final List<InterfaceC4154x> f4110e;

    /* renamed from: f */
    public static final Object f4111f;

    /* renamed from: g */
    public static int f4112g;

    /* renamed from: h */
    public static ExecutorService f4113h;

    /* renamed from: i */
    public static InterfaceC4145o f4114i;

    /* renamed from: j */
    public static InterfaceC4131b0 f4115j;

    /* renamed from: k */
    public static InterfaceC4139i f4116k;

    /* renamed from: l */
    public static InterfaceC4142l f4117l;

    /* renamed from: m */
    public static InterfaceC4150t f4118m;

    /* renamed from: n */
    public static final SparseArray<C1131c> f4119n;

    /* renamed from: o */
    public static final SparseArray<C1131c> f4120o;

    /* renamed from: p */
    public static EnumC4146p f4121p;

    /* renamed from: com.arthenica.ffmpegkit.FFmpegKitConfig$a */
    /* loaded from: classes.dex */
    public class C1129a extends LinkedHashMap<Long, InterfaceC4154x> {
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Long, InterfaceC4154x> entry) {
            return size() > FFmpegKitConfig.f4108c;
        }
    }

    /* renamed from: com.arthenica.ffmpegkit.FFmpegKitConfig$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C1130b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4122a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f4123b;

        static {
            int[] iArr = new int[EnumC4143m.values().length];
            f4123b = iArr;
            try {
                iArr[EnumC4143m.AV_LOG_QUIET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4123b[EnumC4143m.AV_LOG_TRACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4123b[EnumC4143m.AV_LOG_DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4123b[EnumC4143m.AV_LOG_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4123b[EnumC4143m.AV_LOG_WARNING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4123b[EnumC4143m.AV_LOG_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4123b[EnumC4143m.AV_LOG_FATAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4123b[EnumC4143m.AV_LOG_PANIC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4123b[EnumC4143m.AV_LOG_STDERR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4123b[EnumC4143m.AV_LOG_VERBOSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[EnumC4146p.values().length];
            f4122a = iArr2;
            try {
                iArr2[EnumC4146p.NEVER_PRINT_LOGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4122a[EnumC4146p.PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4122a[EnumC4146p.PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4122a[EnumC4146p.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4122a[EnumC4146p.ALWAYS_PRINT_LOGS.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: com.arthenica.ffmpegkit.FFmpegKitConfig$c */
    /* loaded from: classes.dex */
    public static class C1131c {

        /* renamed from: a */
        public final Integer f4124a;

        /* renamed from: b */
        public final Uri f4125b;

        /* renamed from: c */
        public final String f4126c;

        /* renamed from: d */
        public final ContentResolver f4127d;

        /* renamed from: e */
        public ParcelFileDescriptor f4128e;

        public C1131c(Integer num, Uri uri, String str, ContentResolver contentResolver) {
            this.f4124a = num;
            this.f4125b = uri;
            this.f4126c = str;
            this.f4127d = contentResolver;
        }

        /* renamed from: a */
        public ContentResolver m4665a() {
            return this.f4127d;
        }

        /* renamed from: b */
        public String m4666b() {
            return this.f4126c;
        }

        /* renamed from: c */
        public ParcelFileDescriptor m4667c() {
            return this.f4128e;
        }

        /* renamed from: d */
        public Integer m4668d() {
            return this.f4124a;
        }

        /* renamed from: e */
        public Uri m4669e() {
            return this.f4125b;
        }

        /* renamed from: f */
        public void m4670f(ParcelFileDescriptor parcelFileDescriptor) {
            this.f4128e = parcelFileDescriptor;
        }
    }

    static {
        C4614a.m18193b("com.arthenica");
        Log.i("ffmpeg-kit", "Loading ffmpeg-kit.");
        C4151u.m15987g(C4151u.m15986f());
        f4106a = new AtomicInteger(1);
        f4107b = EnumC4143m.m15967c(C4151u.m15991k());
        f4112g = 10;
        f4113h = Executors.newFixedThreadPool(10);
        f4108c = 10;
        f4109d = new C1129a();
        f4110e = new LinkedList();
        f4111f = new Object();
        f4114i = null;
        f4115j = null;
        f4116k = null;
        f4117l = null;
        f4118m = null;
        f4119n = new SparseArray<>();
        f4120o = new SparseArray<>();
        f4121p = EnumC4146p.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED;
        Log.i("ffmpeg-kit", String.format("Loaded ffmpeg-kit-%s-%s-%s-%s.", C4151u.m15993m(), C4151u.m15983c(), C4151u.m15994n(), C4151u.m15984d()));
    }

    /* renamed from: A */
    public static InterfaceC4154x m4617A() {
        synchronized (f4111f) {
            List<InterfaceC4154x> list = f4110e;
            if (list.size() <= 0) {
                return null;
            }
            return list.get(list.size() - 1);
        }
    }

    /* renamed from: B */
    public static EnumC4143m m4618B() {
        return f4107b;
    }

    /* renamed from: C */
    public static EnumC4146p m4619C() {
        return f4121p;
    }

    /* renamed from: D */
    public static void m4620D(C4149s c4149s, int i10) {
        c4149s.m15945x();
        try {
            C4153w c4153w = new C4153w(nativeFFprobeExecute(c4149s.mo15940q(), c4149s.m15942u()));
            c4149s.m15925a(c4153w);
            if (c4153w.m15998b()) {
                List<C4144n> mo15932i = c4149s.mo15932i(i10);
                StringBuilder sb2 = new StringBuilder();
                int size = mo15932i.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C4144n c4144n = mo15932i.get(i11);
                    if (c4144n.m15969a() == EnumC4143m.AV_LOG_STDERR) {
                        sb2.append(c4144n.m15970b());
                    }
                }
                c4149s.m15979C(C4148r.m15975a(sb2.toString()));
            }
        } catch (Exception e10) {
            c4149s.m15926b(e10);
            Log.w("ffmpeg-kit", String.format("Get media information execute failed: %s.%s", m4641c(c4149s.m15942u()), C4614a.m18192a(e10)));
        }
    }

    /* renamed from: E */
    public static InterfaceC4150t m4621E() {
        return f4118m;
    }

    /* renamed from: F */
    public static List<C4149s> m4622F() {
        LinkedList linkedList = new LinkedList();
        synchronized (f4111f) {
            for (InterfaceC4154x interfaceC4154x : f4110e) {
                if (interfaceC4154x.mo15958s()) {
                    linkedList.add((C4149s) interfaceC4154x);
                }
            }
        }
        return linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c A[Catch: all -> 0x0085, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0085, blocks: (B:7:0x0020, B:11:0x004c, B:22:0x0047, B:25:0x0044, B:21:0x003f, B:15:0x002f, B:17:0x0035), top: B:6:0x0020, inners: #0, #2 }] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m4623G(android.content.Context r11, android.net.Uri r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "_display_name"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 1
            java.lang.String r4 = "ffmpeg-kit"
            r5 = 19
            if (r1 >= r5) goto L20
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r2] = r12
            java.lang.String r12 = "getSafParameter is not supported on API Level %d"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            android.util.Log.i(r4, r11)
            java.lang.String r11 = ""
            return r11
        L20:
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L85
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r12
            android.database.Cursor r1 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L48
            boolean r5 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L48
            int r5 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = r1.getString(r5)     // Catch: java.lang.Throwable -> L3e
            goto L4a
        L3e:
            r11 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r13 = move-exception
            r11.addSuppressed(r13)     // Catch: java.lang.Throwable -> L85
        L47:
            throw r11     // Catch: java.lang.Throwable -> L85
        L48:
            java.lang.String r5 = "unknown"
        L4a:
            if (r1 == 0) goto L4f
            r1.close()     // Catch: java.lang.Throwable -> L85
        L4f:
            java.util.concurrent.atomic.AtomicInteger r0 = com.arthenica.ffmpegkit.FFmpegKitConfig.f4106a
            int r0 = r0.getAndIncrement()
            android.util.SparseArray<com.arthenica.ffmpegkit.FFmpegKitConfig$c> r1 = com.arthenica.ffmpegkit.FFmpegKitConfig.f4119n
            com.arthenica.ffmpegkit.FFmpegKitConfig$c r2 = new com.arthenica.ffmpegkit.FFmpegKitConfig$c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            android.content.ContentResolver r11 = r11.getContentResolver()
            r2.<init>(r3, r12, r13, r11)
            r1.put(r0, r2)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "saf:"
            r11.append(r12)
            r11.append(r0)
            java.lang.String r12 = "."
            r11.append(r12)
            java.lang.String r12 = m4655q(r5)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            return r11
        L85:
            r11 = move-exception
            r13 = 3
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r2] = r0
            java.lang.String r12 = r12.toString()
            r13[r3] = r12
            r12 = 2
            java.lang.String r0 = p274t2.C4614a.m18192a(r11)
            r13[r12] = r0
            java.lang.String r12 = "Failed to get %s column for %s.%s"
            java.lang.String r12 = java.lang.String.format(r12, r13)
            android.util.Log.e(r4, r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arthenica.ffmpegkit.FFmpegKitConfig.m4623G(android.content.Context, android.net.Uri, java.lang.String):java.lang.String");
    }

    /* renamed from: H */
    public static InterfaceC4154x m4624H(long j10) {
        InterfaceC4154x interfaceC4154x;
        synchronized (f4111f) {
            interfaceC4154x = f4109d.get(Long.valueOf(j10));
        }
        return interfaceC4154x;
    }

    /* renamed from: I */
    public static int m4625I() {
        return f4108c;
    }

    /* renamed from: J */
    public static List<InterfaceC4154x> m4626J() {
        LinkedList linkedList;
        synchronized (f4111f) {
            linkedList = new LinkedList(f4110e);
        }
        return linkedList;
    }

    /* renamed from: K */
    public static List<InterfaceC4154x> m4627K(EnumC4155y enumC4155y) {
        LinkedList linkedList = new LinkedList();
        synchronized (f4111f) {
            for (InterfaceC4154x interfaceC4154x : f4110e) {
                if (interfaceC4154x.getState() == enumC4155y) {
                    linkedList.add(interfaceC4154x);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: L */
    public static String m4628L() {
        return m4630N() ? String.format("%s-lts", getNativeVersion()) : getNativeVersion();
    }

    /* renamed from: M */
    public static void m4629M(EnumC4156z enumC4156z) {
        ignoreNativeSignal(enumC4156z.m16001c());
    }

    /* renamed from: N */
    public static boolean m4630N() {
        return AbiDetect.isNativeLTSBuild();
    }

    /* renamed from: O */
    public static String m4631O(Context context) {
        String format;
        File file = new File(context.getCacheDir(), "pipes");
        if (file.exists() || file.mkdirs()) {
            String format2 = MessageFormat.format("{0}{1}{2}{3}", file, File.separator, "fk_pipe_", Integer.valueOf(f4106a.getAndIncrement()));
            m4646h(format2);
            int registerNewNativeFFmpegPipe = registerNewNativeFFmpegPipe(format2);
            if (registerNewNativeFFmpegPipe == 0) {
                return format2;
            }
            format = String.format("Failed to register new FFmpeg pipe %s. Operation failed with rc=%d.", format2, Integer.valueOf(registerNewNativeFFmpegPipe));
        } else {
            format = String.format("Failed to create pipes directory: %s.", file.getAbsolutePath());
        }
        Log.e("ffmpeg-kit", format);
        return null;
    }

    /* renamed from: P */
    public static int m4632P(String str, String str2) {
        return setNativeEnvironmentVariable(str, str2);
    }

    /* renamed from: Q */
    public static void m4633Q(Context context, String str, Map<String, String> map) {
        m4634R(context, Collections.singletonList(str), map);
    }

    /* renamed from: R */
    public static void m4634R(Context context, List<String> list, Map<String, String> map) {
        int i10;
        Object obj;
        File file = new File(context.getCacheDir(), "fontconfig");
        if (!file.exists()) {
            Log.d("ffmpeg-kit", String.format("Created temporary font conf directory: %s.", Boolean.valueOf(file.mkdirs())));
        }
        File file2 = new File(file, "fonts.conf");
        if (file2.exists()) {
            Log.d("ffmpeg-kit", String.format("Deleted old temporary font configuration: %s.", Boolean.valueOf(file2.delete())));
        }
        StringBuilder sb2 = new StringBuilder("");
        if (map == null || map.size() <= 0) {
            i10 = 0;
        } else {
            map.entrySet();
            i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null && key.trim().length() > 0 && value.trim().length() > 0) {
                    sb2.append("    <match target=\"pattern\">\n");
                    sb2.append("        <test qual=\"any\" name=\"family\">\n");
                    sb2.append(String.format("            <string>%s</string>\n", key));
                    sb2.append("        </test>\n");
                    sb2.append("        <edit name=\"family\" mode=\"assign\" binding=\"same\">\n");
                    sb2.append(String.format("            <string>%s</string>\n", value));
                    sb2.append("        </edit>\n");
                    sb2.append("    </match>\n");
                    i10++;
                }
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("<?xml version=\"1.0\"?>\n");
        sb3.append("<!DOCTYPE fontconfig SYSTEM \"fonts.dtd\">\n");
        sb3.append("<fontconfig>\n");
        sb3.append("    <dir prefix=\"cwd\">.</dir>\n");
        for (String str : list) {
            sb3.append("    <dir>");
            sb3.append(str);
            sb3.append("</dir>\n");
        }
        sb3.append((CharSequence) sb2);
        sb3.append("</fontconfig>\n");
        AtomicReference atomicReference = new AtomicReference();
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    atomicReference.set(fileOutputStream);
                    fileOutputStream.write(sb3.toString().getBytes());
                    fileOutputStream.flush();
                    Log.d("ffmpeg-kit", String.format("Saved new temporary font configuration with %d font name mappings.", Integer.valueOf(i10)));
                    m4635S(file.getAbsolutePath());
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        Log.d("ffmpeg-kit", String.format("Font directory %s registered successfully.", it.next()));
                    }
                } catch (IOException e10) {
                    Log.e("ffmpeg-kit", String.format("Failed to set font directory: %s.%s", Arrays.toString(list.toArray()), C4614a.m18192a(e10)));
                    if (atomicReference.get() == null) {
                        return;
                    } else {
                        obj = atomicReference.get();
                    }
                }
                if (atomicReference.get() == null) {
                    return;
                }
                obj = atomicReference.get();
                ((FileOutputStream) obj).close();
            } catch (Throwable th) {
                if (atomicReference.get() != null) {
                    try {
                        ((FileOutputStream) atomicReference.get()).close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
    }

    /* renamed from: S */
    public static int m4635S(String str) {
        return setNativeEnvironmentVariable("FONTCONFIG_PATH", str);
    }

    /* renamed from: T */
    public static void m4636T(EnumC4143m enumC4143m) {
        if (enumC4143m != null) {
            f4107b = enumC4143m;
            setNativeLogLevel(enumC4143m.m15968f());
        }
    }

    /* renamed from: U */
    public static void m4637U(EnumC4146p enumC4146p) {
        f4121p = enumC4146p;
    }

    /* renamed from: V */
    public static void m4638V(int i10) {
        if (i10 >= 1000) {
            throw new IllegalArgumentException("Session history size must not exceed the hard limit!");
        }
        if (i10 > 0) {
            f4108c = i10;
            m4647i();
        }
    }

    /* renamed from: b */
    public static void m4640b(InterfaceC4154x interfaceC4154x) {
        synchronized (f4111f) {
            Map<Long, InterfaceC4154x> map = f4109d;
            if (!map.containsKey(Long.valueOf(interfaceC4154x.mo15940q()))) {
                map.put(Long.valueOf(interfaceC4154x.mo15940q()), interfaceC4154x);
                f4110e.add(interfaceC4154x);
                m4647i();
            }
        }
    }

    /* renamed from: c */
    public static String m4641c(String[] strArr) {
        if (strArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(" ");
            }
            sb2.append(strArr[i10]);
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static void m4642d(C4138h c4138h) {
        c4138h.m15944w(f4113h.submit(new RunnableC4132c(c4138h)));
    }

    private static native void disableNativeRedirection();

    /* renamed from: e */
    public static void m4643e(C4141k c4141k) {
        c4141k.m15944w(f4113h.submit(new RunnableC4134d(c4141k)));
    }

    private static native void enableNativeRedirection();

    /* renamed from: f */
    public static void m4644f(C4149s c4149s, int i10) {
        c4149s.m15944w(f4113h.submit(new RunnableC4135e(c4149s, Integer.valueOf(i10))));
    }

    /* renamed from: g */
    public static void m4645g() {
        synchronized (f4111f) {
            f4110e.clear();
            f4109d.clear();
        }
    }

    private static native String getNativeBuildDate();

    private static native String getNativeFFmpegVersion();

    public static native int getNativeLogLevel();

    private static native String getNativeVersion();

    /* renamed from: h */
    public static void m4646h(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    /* renamed from: i */
    public static void m4647i() {
        while (true) {
            List<InterfaceC4154x> list = f4110e;
            if (list.size() <= f4108c) {
                return;
            }
            try {
                InterfaceC4154x remove = list.remove(0);
                if (remove != null) {
                    f4109d.remove(Long.valueOf(remove.mo15940q()));
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    private static native void ignoreNativeSignal(int i10);

    /* renamed from: j */
    public static void m4648j() {
        disableNativeRedirection();
    }

    /* renamed from: k */
    public static void m4649k(InterfaceC4139i interfaceC4139i) {
        f4116k = interfaceC4139i;
    }

    /* renamed from: l */
    public static void m4650l(InterfaceC4142l interfaceC4142l) {
        f4117l = interfaceC4142l;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void log(long r5, int r7, byte[] r8) {
        /*
            q2.m r0 = p233q2.EnumC4143m.m15967c(r7)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r8)
            q2.n r8 = new q2.n
            r8.<init>(r5, r0, r1)
            q2.p r2 = com.arthenica.ffmpegkit.FFmpegKitConfig.f4121p
            q2.m r3 = com.arthenica.ffmpegkit.FFmpegKitConfig.f4107b
            q2.m r4 = p233q2.EnumC4143m.AV_LOG_QUIET
            if (r3 != r4) goto L1e
            q2.m r3 = p233q2.EnumC4143m.AV_LOG_STDERR
            int r3 = r3.m15968f()
            if (r7 != r3) goto L26
        L1e:
            q2.m r3 = com.arthenica.ffmpegkit.FFmpegKitConfig.f4107b
            int r3 = r3.m15968f()
            if (r7 <= r3) goto L27
        L26:
            return
        L27:
            q2.x r5 = m4624H(r5)
            r6 = 0
            r7 = 1
            java.lang.String r3 = "ffmpeg-kit"
            if (r5 == 0) goto L5a
            q2.p r2 = r5.mo15936m()
            r5.mo15930g(r8)
            q2.o r4 = r5.mo15939p()
            if (r4 == 0) goto L5a
            q2.o r5 = r5.mo15939p()     // Catch: java.lang.Exception -> L46
            r5.mo15972a(r8)     // Catch: java.lang.Exception -> L46
            goto L58
        L46:
            r5 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r5 = p274t2.C4614a.m18192a(r5)
            r4[r6] = r5
            java.lang.String r5 = "Exception thrown inside session log callback.%s"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            android.util.Log.e(r3, r5)
        L58:
            r5 = r7
            goto L5b
        L5a:
            r5 = r6
        L5b:
            q2.o r4 = com.arthenica.ffmpegkit.FFmpegKitConfig.f4114i
            if (r4 == 0) goto L76
            r4.mo15972a(r8)     // Catch: java.lang.Exception -> L63
            goto L75
        L63:
            r8 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r8 = p274t2.C4614a.m18192a(r8)
            r4[r6] = r8
            java.lang.String r6 = "Exception thrown inside global log callback.%s"
            java.lang.String r6 = java.lang.String.format(r6, r4)
            android.util.Log.e(r3, r6)
        L75:
            r6 = r7
        L76:
            int[] r8 = com.arthenica.ffmpegkit.FFmpegKitConfig.C1130b.f4122a
            int r2 = r2.ordinal()
            r8 = r8[r2]
            if (r8 == r7) goto Lb3
            r7 = 2
            if (r8 == r7) goto L92
            r7 = 3
            if (r8 == r7) goto L8f
            r7 = 4
            if (r8 == r7) goto L8a
            goto L95
        L8a:
            if (r6 != 0) goto L8e
            if (r5 == 0) goto L95
        L8e:
            return
        L8f:
            if (r5 == 0) goto L95
            return
        L92:
            if (r6 == 0) goto L95
            return
        L95:
            int[] r5 = com.arthenica.ffmpegkit.FFmpegKitConfig.C1130b.f4123b
            int r6 = r0.ordinal()
            r5 = r5[r6]
            switch(r5) {
                case 1: goto Lb3;
                case 2: goto Lb0;
                case 3: goto Lb0;
                case 4: goto Lac;
                case 5: goto La8;
                case 6: goto La4;
                case 7: goto La4;
                case 8: goto La4;
                default: goto La0;
            }
        La0:
            android.util.Log.v(r3, r1)
            goto Lb3
        La4:
            android.util.Log.e(r3, r1)
            goto Lb3
        La8:
            android.util.Log.w(r3, r1)
            goto Lb3
        Lac:
            android.util.Log.i(r3, r1)
            goto Lb3
        Lb0:
            android.util.Log.d(r3, r1)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arthenica.ffmpegkit.FFmpegKitConfig.log(long, int, byte[]):void");
    }

    /* renamed from: m */
    public static void m4651m(InterfaceC4145o interfaceC4145o) {
        f4114i = interfaceC4145o;
    }

    public static native int messagesInTransmit(long j10);

    /* renamed from: n */
    public static void m4652n(InterfaceC4150t interfaceC4150t) {
        f4118m = interfaceC4150t;
    }

    public static native void nativeFFmpegCancel(long j10);

    private static native int nativeFFmpegExecute(long j10, String[] strArr);

    public static native int nativeFFprobeExecute(long j10, String[] strArr);

    /* renamed from: o */
    public static void m4653o() {
        enableNativeRedirection();
    }

    /* renamed from: p */
    public static void m4654p(InterfaceC4131b0 interfaceC4131b0) {
        f4115j = interfaceC4131b0;
    }

    /* renamed from: q */
    public static String m4655q(String str) {
        try {
            return new StringTokenizer(str.lastIndexOf(".") >= 0 ? str.substring(str.lastIndexOf(".")) : str, " .").nextToken();
        } catch (Exception e10) {
            Log.w("ffmpeg-kit", String.format("Failed to extract extension from saf display name: %s.%s", str, C4614a.m18192a(e10)));
            return "raw";
        }
    }

    /* renamed from: r */
    public static void m4656r(C4138h c4138h) {
        c4138h.m15945x();
        try {
            c4138h.m15925a(new C4153w(nativeFFmpegExecute(c4138h.mo15940q(), c4138h.m15942u())));
        } catch (Exception e10) {
            c4138h.m15926b(e10);
            Log.w("ffmpeg-kit", String.format("FFmpeg execute failed: %s.%s", m4641c(c4138h.m15942u()), C4614a.m18192a(e10)));
        }
    }

    private static native int registerNewNativeFFmpegPipe(String str);

    /* renamed from: s */
    public static void m4657s(C4141k c4141k) {
        c4141k.m15945x();
        try {
            c4141k.m15925a(new C4153w(nativeFFprobeExecute(c4141k.mo15940q(), c4141k.m15942u())));
        } catch (Exception e10) {
            c4141k.m15926b(e10);
            Log.w("ffmpeg-kit", String.format("FFprobe execute failed: %s.%s", m4641c(c4141k.m15942u()), C4614a.m18192a(e10)));
        }
    }

    private static int safClose(int i10) {
        String format;
        try {
            SparseArray<C1131c> sparseArray = f4120o;
            C1131c c1131c = sparseArray.get(i10);
            if (c1131c != null) {
                ParcelFileDescriptor m4667c = c1131c.m4667c();
                if (m4667c != null) {
                    sparseArray.delete(i10);
                    f4119n.delete(c1131c.m4668d().intValue());
                    m4667c.close();
                    return 1;
                }
                format = String.format("ParcelFileDescriptor for SAF fd %d not found.", Integer.valueOf(i10));
            } else {
                format = String.format("SAF fd %d not found.", Integer.valueOf(i10));
            }
            Log.e("ffmpeg-kit", format);
        } catch (Throwable th) {
            Log.e("ffmpeg-kit", String.format("Failed to close SAF fd: %d.%s", Integer.valueOf(i10), C4614a.m18192a(th)));
        }
        return 0;
    }

    private static int safOpen(int i10) {
        C1131c c1131c;
        try {
            c1131c = f4119n.get(i10);
        } catch (Throwable th) {
            Log.e("ffmpeg-kit", String.format("Failed to open SAF id: %d.%s", Integer.valueOf(i10), C4614a.m18192a(th)));
        }
        if (c1131c == null) {
            Log.e("ffmpeg-kit", String.format("SAF id %d not found.", Integer.valueOf(i10)));
            return 0;
        }
        ParcelFileDescriptor openFileDescriptor = c1131c.m4665a().openFileDescriptor(c1131c.m4669e(), c1131c.m4666b());
        c1131c.m4670f(openFileDescriptor);
        int fd2 = openFileDescriptor.getFd();
        f4120o.put(fd2, c1131c);
        return fd2;
    }

    private static native int setNativeEnvironmentVariable(String str, String str2);

    private static native void setNativeLogLevel(int i10);

    private static void statistics(long j10, int i10, float f10, float f11, long j11, double d10, double d11, double d12) {
        C4129a0 c4129a0 = new C4129a0(j10, i10, f10, f11, j11, d10, d11, d12);
        InterfaceC4154x m4624H = m4624H(j10);
        if (m4624H != null && m4624H.mo15956d()) {
            C4138h c4138h = (C4138h) m4624H;
            c4138h.m15959z(c4129a0);
            if (c4138h.m15955E() != null) {
                try {
                    c4138h.m15955E().mo15947a(c4129a0);
                } catch (Exception e10) {
                    Log.e("ffmpeg-kit", String.format("Exception thrown inside session statistics callback.%s", C4614a.m18192a(e10)));
                }
            }
        }
        InterfaceC4131b0 interfaceC4131b0 = f4115j;
        if (interfaceC4131b0 != null) {
            try {
                interfaceC4131b0.mo15947a(c4129a0);
            } catch (Exception e11) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside global statistics callback.%s", C4614a.m18192a(e11)));
            }
        }
    }

    /* renamed from: t */
    public static String m4658t() {
        return getNativeBuildDate();
    }

    /* renamed from: u */
    public static InterfaceC4139i m4659u() {
        return f4116k;
    }

    /* renamed from: v */
    public static List<C4138h> m4660v() {
        LinkedList linkedList = new LinkedList();
        synchronized (f4111f) {
            for (InterfaceC4154x interfaceC4154x : f4110e) {
                if (interfaceC4154x.mo15956d()) {
                    linkedList.add((C4138h) interfaceC4154x);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: w */
    public static String m4661w() {
        return getNativeFFmpegVersion();
    }

    /* renamed from: x */
    public static InterfaceC4142l m4662x() {
        return f4117l;
    }

    /* renamed from: y */
    public static List<C4141k> m4663y() {
        LinkedList linkedList = new LinkedList();
        synchronized (f4111f) {
            for (InterfaceC4154x interfaceC4154x : f4110e) {
                if (interfaceC4154x.mo15957r()) {
                    linkedList.add((C4141k) interfaceC4154x);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: z */
    public static InterfaceC4154x m4664z() {
        synchronized (f4111f) {
            for (int size = f4110e.size() - 1; size >= 0; size--) {
                InterfaceC4154x interfaceC4154x = f4110e.get(size);
                if (interfaceC4154x.getState() == EnumC4155y.COMPLETED) {
                    return interfaceC4154x;
                }
            }
            return null;
        }
    }
}
