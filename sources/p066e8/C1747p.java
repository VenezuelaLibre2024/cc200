package p066e8;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p023b8.C0515g;
import p023b8.InterfaceC0509a;
import p023b8.InterfaceC0516h;
import p035c8.InterfaceC0984a;
import p066e8.C1755v;
import p081f8.C1876e;
import p081f8.C1884m;
import p098g8.AbstractC2135f0;
import p098g8.AbstractC2137g0;
import p141j8.C3262f;
import p171l8.C3453d;
import p171l8.InterfaceC3458i;

/* renamed from: e8.p */
/* loaded from: classes.dex */
public class C1747p {

    /* renamed from: t */
    public static final FilenameFilter f6394t = C1745o.f6392a;

    /* renamed from: a */
    public final Context f6395a;

    /* renamed from: b */
    public final C1757x f6396b;

    /* renamed from: c */
    public final C1752s f6397c;

    /* renamed from: d */
    public final C1884m f6398d;

    /* renamed from: e */
    public final C1743n f6399e;

    /* renamed from: f */
    public final C1720b0 f6400f;

    /* renamed from: g */
    public final C3262f f6401g;

    /* renamed from: h */
    public final C1717a f6402h;

    /* renamed from: i */
    public final C1876e f6403i;

    /* renamed from: j */
    public final InterfaceC0509a f6404j;

    /* renamed from: k */
    public final InterfaceC0984a f6405k;

    /* renamed from: l */
    public final C1741m f6406l;

    /* renamed from: m */
    public final C1736j0 f6407m;

    /* renamed from: n */
    public C1755v f6408n;

    /* renamed from: o */
    public InterfaceC3458i f6409o = null;

    /* renamed from: p */
    public final TaskCompletionSource<Boolean> f6410p = new TaskCompletionSource<>();

    /* renamed from: q */
    public final TaskCompletionSource<Boolean> f6411q = new TaskCompletionSource<>();

    /* renamed from: r */
    public final TaskCompletionSource<Void> f6412r = new TaskCompletionSource<>();

    /* renamed from: s */
    public final AtomicBoolean f6413s = new AtomicBoolean(false);

    /* renamed from: e8.p$a */
    /* loaded from: classes.dex */
    public class a implements C1755v.a {
        public a() {
        }

        @Override // p066e8.C1755v.a
        /* renamed from: a */
        public void mo6948a(InterfaceC3458i interfaceC3458i, Thread thread, Throwable th) {
            C1747p.this.m6922J(interfaceC3458i, thread, th);
        }
    }

    /* renamed from: e8.p$b */
    /* loaded from: classes.dex */
    public class b implements Callable<Task<Void>> {

        /* renamed from: a */
        public final /* synthetic */ long f6415a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f6416b;

        /* renamed from: c */
        public final /* synthetic */ Thread f6417c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC3458i f6418d;

        /* renamed from: e */
        public final /* synthetic */ boolean f6419e;

        /* renamed from: e8.p$b$a */
        /* loaded from: classes.dex */
        public class a implements SuccessContinuation<C3453d, Void> {

            /* renamed from: a */
            public final /* synthetic */ Executor f6421a;

            /* renamed from: b */
            public final /* synthetic */ String f6422b;

            public a(Executor executor, String str) {
                this.f6421a = executor;
                this.f6422b = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: a */
            public Task<Void> then(C3453d c3453d) {
                if (c3453d == null) {
                    C0515g.m2482f().m2492k("Received null app settings, cannot send reports at crash time.");
                    return Tasks.forResult(null);
                }
                Task[] taskArr = new Task[2];
                taskArr[0] = C1747p.this.m6927P();
                taskArr[1] = C1747p.this.f6407m.m6864y(this.f6421a, b.this.f6419e ? this.f6422b : null);
                return Tasks.whenAll((Task<?>[]) taskArr);
            }
        }

        public b(long j10, Throwable th, Thread thread, InterfaceC3458i interfaceC3458i, boolean z10) {
            this.f6415a = j10;
            this.f6416b = th;
            this.f6417c = thread;
            this.f6418d = interfaceC3458i;
            this.f6419e = z10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Task<Void> call() {
            long m6894H = C1747p.m6894H(this.f6415a);
            String m6919D = C1747p.this.m6919D();
            if (m6919D == null) {
                C0515g.m2482f().m2486d("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            C1747p.this.f6397c.m7000a();
            C1747p.this.f6407m.m6859t(this.f6416b, this.f6417c, m6919D, m6894H);
            C1747p.this.m6946y(this.f6415a);
            C1747p.this.m6943v(this.f6418d);
            C1747p.this.m6945x(new C1731h(C1747p.this.f6400f).toString(), Boolean.valueOf(this.f6419e));
            if (!C1747p.this.f6396b.m7039d()) {
                return Tasks.forResult(null);
            }
            Executor m6882c = C1747p.this.f6399e.m6882c();
            return this.f6418d.mo12857a().onSuccessTask(m6882c, new a(m6882c, m6919D));
        }
    }

    /* renamed from: e8.p$c */
    /* loaded from: classes.dex */
    public class c implements SuccessContinuation<Void, Boolean> {
        public c() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task<Boolean> then(Void r12) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* renamed from: e8.p$d */
    /* loaded from: classes.dex */
    public class d implements SuccessContinuation<Boolean, Void> {

        /* renamed from: a */
        public final /* synthetic */ Task f6425a;

        /* renamed from: e8.p$d$a */
        /* loaded from: classes.dex */
        public class a implements Callable<Task<Void>> {

            /* renamed from: a */
            public final /* synthetic */ Boolean f6427a;

            /* renamed from: e8.p$d$a$a */
            /* loaded from: classes.dex */
            public class C6160a implements SuccessContinuation<C3453d, Void> {

                /* renamed from: a */
                public final /* synthetic */ Executor f6429a;

                public C6160a(Executor executor) {
                    this.f6429a = executor;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                /* renamed from: a */
                public Task<Void> then(C3453d c3453d) {
                    if (c3453d == null) {
                        C0515g.m2482f().m2492k("Received null app settings at app startup. Cannot send cached reports");
                    } else {
                        C1747p.this.m6927P();
                        C1747p.this.f6407m.m6863x(this.f6429a);
                        C1747p.this.f6412r.trySetResult(null);
                    }
                    return Tasks.forResult(null);
                }
            }

            public a(Boolean bool) {
                this.f6427a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Task<Void> call() {
                if (this.f6427a.booleanValue()) {
                    C0515g.m2482f().m2484b("Sending cached crash reports...");
                    C1747p.this.f6396b.m7038c(this.f6427a.booleanValue());
                    Executor m6882c = C1747p.this.f6399e.m6882c();
                    return d.this.f6425a.onSuccessTask(m6882c, new C6160a(m6882c));
                }
                C0515g.m2482f().m2490i("Deleting cached crash reports...");
                C1747p.m6916s(C1747p.this.m6925N());
                C1747p.this.f6407m.m6862w();
                C1747p.this.f6412r.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        public d(Task task) {
            this.f6425a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task<Void> then(Boolean bool) {
            return C1747p.this.f6399e.m6888i(new a(bool));
        }
    }

    /* renamed from: e8.p$e */
    /* loaded from: classes.dex */
    public class e implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ long f6431a;

        /* renamed from: b */
        public final /* synthetic */ String f6432b;

        public e(long j10, String str) {
            this.f6431a = j10;
            this.f6432b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            if (C1747p.this.m6924L()) {
                return null;
            }
            C1747p.this.f6403i.m7638g(this.f6431a, this.f6432b);
            return null;
        }
    }

    /* renamed from: e8.p$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ long f6434h;

        /* renamed from: i */
        public final /* synthetic */ Throwable f6435i;

        /* renamed from: j */
        public final /* synthetic */ Thread f6436j;

        public f(long j10, Throwable th, Thread thread) {
            this.f6434h = j10;
            this.f6435i = th;
            this.f6436j = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1747p.this.m6924L()) {
                return;
            }
            long m6894H = C1747p.m6894H(this.f6434h);
            String m6919D = C1747p.this.m6919D();
            if (m6919D == null) {
                C0515g.m2482f().m2492k("Tried to write a non-fatal exception while no session was open.");
            } else {
                C1747p.this.f6407m.m6860u(this.f6435i, this.f6436j, m6919D, m6894H);
            }
        }
    }

    /* renamed from: e8.p$g */
    /* loaded from: classes.dex */
    public class g implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ String f6438a;

        public g(String str) {
            this.f6438a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            C1747p.this.m6945x(this.f6438a, Boolean.FALSE);
            return null;
        }
    }

    /* renamed from: e8.p$h */
    /* loaded from: classes.dex */
    public class h implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ long f6440a;

        public h(long j10) {
            this.f6440a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt(Constants.FATAL, 1);
            bundle.putLong(Constants.TIMESTAMP, this.f6440a);
            C1747p.this.f6405k.mo301a(Constants.FIREBASE_APPLICATION_EXCEPTION, bundle);
            return null;
        }
    }

    public C1747p(Context context, C1743n c1743n, C1720b0 c1720b0, C1757x c1757x, C3262f c3262f, C1752s c1752s, C1717a c1717a, C1884m c1884m, C1876e c1876e, C1736j0 c1736j0, InterfaceC0509a interfaceC0509a, InterfaceC0984a interfaceC0984a, C1741m c1741m) {
        this.f6395a = context;
        this.f6399e = c1743n;
        this.f6400f = c1720b0;
        this.f6396b = c1757x;
        this.f6401g = c3262f;
        this.f6397c = c1752s;
        this.f6402h = c1717a;
        this.f6398d = c1884m;
        this.f6403i = c1876e;
        this.f6404j = interfaceC0509a;
        this.f6405k = interfaceC0984a;
        this.f6406l = c1741m;
        this.f6407m = c1736j0;
    }

    /* renamed from: C */
    public static boolean m6891C() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: E */
    public static long m6892E() {
        return m6894H(System.currentTimeMillis());
    }

    /* renamed from: F */
    public static List<InterfaceC1726e0> m6893F(InterfaceC0516h interfaceC0516h, String str, C3262f c3262f, byte[] bArr) {
        File m11809o = c3262f.m11809o(str, "user-data");
        File m11809o2 = c3262f.m11809o(str, "keys");
        File m11809o3 = c3262f.m11809o(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1729g("logs_file", "logs", bArr));
        arrayList.add(new C1718a0("crash_meta_file", "metadata", interfaceC0516h.mo2473g()));
        arrayList.add(new C1718a0("session_meta_file", "session", interfaceC0516h.mo2472f()));
        arrayList.add(new C1718a0("app_meta_file", "app", interfaceC0516h.mo2467a()));
        arrayList.add(new C1718a0("device_meta_file", "device", interfaceC0516h.mo2469c()));
        arrayList.add(new C1718a0("os_meta_file", "os", interfaceC0516h.mo2468b()));
        arrayList.add(m6897S(interfaceC0516h));
        arrayList.add(new C1718a0("user_meta_file", io.flutter.plugins.firebase.auth.Constants.USER, m11809o));
        arrayList.add(new C1718a0("keys_file", "keys", m11809o2));
        arrayList.add(new C1718a0("rollouts_file", "rollouts", m11809o3));
        return arrayList;
    }

    /* renamed from: H */
    public static long m6894H(long j10) {
        return j10 / 1000;
    }

    /* renamed from: M */
    public static /* synthetic */ boolean m6895M(File file, String str) {
        return str.startsWith(".ae");
    }

    /* renamed from: R */
    public static boolean m6896R(String str, File file, AbstractC2135f0.a aVar) {
        if (file == null || !file.exists()) {
            C0515g.m2482f().m2492k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            C0515g.m2482f().m2488g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    /* renamed from: S */
    public static InterfaceC1726e0 m6897S(InterfaceC0516h interfaceC0516h) {
        File mo2471e = interfaceC0516h.mo2471e();
        return (mo2471e == null || !mo2471e.exists()) ? new C1729g("minidump_file", "minidump", new byte[]{0}) : new C1718a0("minidump_file", "minidump", mo2471e);
    }

    /* renamed from: U */
    public static byte[] m6898U(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: p */
    public static AbstractC2137g0.a m6913p(C1720b0 c1720b0, C1717a c1717a) {
        return AbstractC2137g0.a.m8692b(c1720b0.m6775f(), c1717a.f6317f, c1717a.f6318g, c1720b0.mo6772a().mo6783c(), EnumC1758y.m7045b(c1717a.f6315d).m7046c(), c1717a.f6319h);
    }

    /* renamed from: q */
    public static AbstractC2137g0.b m6914q(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return AbstractC2137g0.b.m8693c(C1733i.m6823k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C1733i.m6814b(context), statFs.getBlockCount() * statFs.getBlockSize(), C1733i.m6835w(), C1733i.m6824l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: r */
    public static AbstractC2137g0.c m6915r() {
        return AbstractC2137g0.c.m8694a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C1733i.m6836x());
    }

    /* renamed from: s */
    public static void m6916s(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* renamed from: A */
    public final void m6917A(String str) {
        C0515g.m2482f().m2490i("Finalizing native report for session " + str);
        InterfaceC0516h mo2459a = this.f6404j.mo2459a(str);
        File mo2471e = mo2459a.mo2471e();
        AbstractC2135f0.a mo2470d = mo2459a.mo2470d();
        if (m6896R(str, mo2471e, mo2470d)) {
            C0515g.m2482f().m2492k("No native core present");
            return;
        }
        long lastModified = mo2471e.lastModified();
        C1876e c1876e = new C1876e(this.f6401g, str);
        File m11803i = this.f6401g.m11803i(str);
        if (!m11803i.isDirectory()) {
            C0515g.m2482f().m2492k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        m6946y(lastModified);
        List<InterfaceC1726e0> m6893F = m6893F(mo2459a, str, this.f6401g, c1876e.m7633b());
        C1728f0.m6799b(m11803i, m6893F);
        C0515g.m2482f().m2484b("CrashlyticsController#finalizePreviousNativeSession");
        this.f6407m.m6851j(str, m6893F, mo2470d);
        c1876e.m7632a();
    }

    /* renamed from: B */
    public boolean m6918B(InterfaceC3458i interfaceC3458i) {
        this.f6399e.m6881b();
        if (m6924L()) {
            C0515g.m2482f().m2492k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C0515g.m2482f().m2490i("Finalizing previously open sessions.");
        try {
            m6944w(true, interfaceC3458i);
            C0515g.m2482f().m2490i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            C0515g.m2482f().m2487e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    /* renamed from: D */
    public final String m6919D() {
        SortedSet<String> m6855p = this.f6407m.m6855p();
        if (m6855p.isEmpty()) {
            return null;
        }
        return m6855p.first();
    }

    /* renamed from: G */
    public final InputStream m6920G(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            C0515g.m2482f().m2492k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        C0515g.m2482f().m2488g("No version control information found");
        return null;
    }

    /* renamed from: I */
    public String m6921I() {
        InputStream m6920G = m6920G("META-INF/version-control-info.textproto");
        if (m6920G == null) {
            return null;
        }
        C0515g.m2482f().m2484b("Read version control info");
        return Base64.encodeToString(m6898U(m6920G), 0);
    }

    /* renamed from: J */
    public void m6922J(InterfaceC3458i interfaceC3458i, Thread thread, Throwable th) {
        m6923K(interfaceC3458i, thread, th, false);
    }

    /* renamed from: K */
    public synchronized void m6923K(InterfaceC3458i interfaceC3458i, Thread thread, Throwable th, boolean z10) {
        C0515g.m2482f().m2484b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            C1750q0.m6963f(this.f6399e.m6888i(new b(System.currentTimeMillis(), th, thread, interfaceC3458i, z10)));
        } catch (TimeoutException unused) {
            C0515g.m2482f().m2486d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e10) {
            C0515g.m2482f().m2487e("Error handling uncaught exception", e10);
        }
    }

    /* renamed from: L */
    public boolean m6924L() {
        C1755v c1755v = this.f6408n;
        return c1755v != null && c1755v.m7032a();
    }

    /* renamed from: N */
    public List<File> m6925N() {
        return this.f6401g.m11800f(f6394t);
    }

    /* renamed from: O */
    public final Task<Void> m6926O(long j10) {
        if (m6891C()) {
            C0515g.m2482f().m2492k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        C0515g.m2482f().m2484b("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new h(j10));
    }

    /* renamed from: P */
    public final Task<Void> m6927P() {
        ArrayList arrayList = new ArrayList();
        for (File file : m6925N()) {
            try {
                arrayList.add(m6926O(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C0515g.m2482f().m2492k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* renamed from: Q */
    public void m6928Q(Thread thread, Throwable th) {
        InterfaceC3458i interfaceC3458i = this.f6409o;
        if (interfaceC3458i == null) {
            C0515g.m2482f().m2492k("settingsProvider not set");
        } else {
            m6923K(interfaceC3458i, thread, th, true);
        }
    }

    /* renamed from: T */
    public void m6929T(String str) {
        this.f6399e.m6887h(new g(str));
    }

    /* renamed from: V */
    public void m6930V() {
        try {
            String m6921I = m6921I();
            if (m6921I != null) {
                m6933Y("com.crashlytics.version-control-info", m6921I);
                C0515g.m2482f().m2488g("Saved version control info");
            }
        } catch (IOException e10) {
            C0515g.m2482f().m2493l("Unable to save version control info", e10);
        }
    }

    /* renamed from: W */
    public Task<Void> m6931W() {
        this.f6411q.trySetResult(Boolean.TRUE);
        return this.f6412r.getTask();
    }

    /* renamed from: X */
    public void m6932X(String str, String str2) {
        try {
            this.f6398d.m7707m(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f6395a;
            if (context != null && C1733i.m6833u(context)) {
                throw e10;
            }
            C0515g.m2482f().m2486d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* renamed from: Y */
    public void m6933Y(String str, String str2) {
        try {
            this.f6398d.m7708n(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f6395a;
            if (context != null && C1733i.m6833u(context)) {
                throw e10;
            }
            C0515g.m2482f().m2486d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* renamed from: Z */
    public void m6934Z(String str) {
        this.f6398d.m7710p(str);
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: a0 */
    public Task<Void> m6935a0(Task<C3453d> task) {
        if (this.f6407m.m6854n()) {
            C0515g.m2482f().m2490i("Crash reports are available to be sent.");
            return m6936b0().onSuccessTask(new d(task));
        }
        C0515g.m2482f().m2490i("No crash reports are available to be sent.");
        this.f6410p.trySetResult(Boolean.FALSE);
        return Tasks.forResult(null);
    }

    /* renamed from: b0 */
    public final Task<Boolean> m6936b0() {
        if (this.f6396b.m7039d()) {
            C0515g.m2482f().m2484b("Automatic data collection is enabled. Allowing upload.");
            this.f6410p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        C0515g.m2482f().m2484b("Automatic data collection is disabled.");
        C0515g.m2482f().m2490i("Notifying that unsent reports are available.");
        this.f6410p.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> onSuccessTask = this.f6396b.m7043j().onSuccessTask(new c());
        C0515g.m2482f().m2484b("Waiting for send/deleteUnsentReports to be called.");
        return C1750q0.m6971n(onSuccessTask, this.f6411q.getTask());
    }

    /* renamed from: c0 */
    public final void m6937c0(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            C0515g.m2482f().m2490i("ANR feature enabled, but device is API " + i10);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f6395a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f6407m.m6861v(str, historicalProcessExitReasons, new C1876e(this.f6401g, str), C1884m.m7700j(str, this.f6401g, this.f6399e));
        } else {
            C0515g.m2482f().m2490i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    /* renamed from: d0 */
    public void m6938d0(Thread thread, Throwable th) {
        this.f6399e.m6886g(new f(System.currentTimeMillis(), th, thread));
    }

    /* renamed from: e0 */
    public void m6939e0(long j10, String str) {
        this.f6399e.m6887h(new e(j10, str));
    }

    /* renamed from: o */
    public Task<Boolean> m6940o() {
        if (this.f6413s.compareAndSet(false, true)) {
            return this.f6410p.getTask();
        }
        C0515g.m2482f().m2492k("checkForUnsentReports should only be called once per execution.");
        return Tasks.forResult(Boolean.FALSE);
    }

    /* renamed from: t */
    public Task<Void> m6941t() {
        this.f6411q.trySetResult(Boolean.FALSE);
        return this.f6412r.getTask();
    }

    /* renamed from: u */
    public boolean m6942u() {
        if (!this.f6397c.m7002c()) {
            String m6919D = m6919D();
            return m6919D != null && this.f6404j.mo2461c(m6919D);
        }
        C0515g.m2482f().m2490i("Found previous crash marker.");
        this.f6397c.m7003d();
        return true;
    }

    /* renamed from: v */
    public void m6943v(InterfaceC3458i interfaceC3458i) {
        m6944w(false, interfaceC3458i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public final void m6944w(boolean z10, InterfaceC3458i interfaceC3458i) {
        ArrayList arrayList = new ArrayList(this.f6407m.m6855p());
        if (arrayList.size() <= z10) {
            C0515g.m2482f().m2490i("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z10 ? 1 : 0);
        if (interfaceC3458i.mo12858b().f12123b.f12131b) {
            m6937c0(str);
        } else {
            C0515g.m2482f().m2490i("ANR feature disabled.");
        }
        if (this.f6404j.mo2461c(str)) {
            m6917A(str);
        }
        String str2 = null;
        if (z10 != 0) {
            str2 = (String) arrayList.get(0);
        } else {
            this.f6406l.m6879e(null);
        }
        this.f6407m.m6852k(m6892E(), str2);
    }

    /* renamed from: x */
    public final void m6945x(String str, Boolean bool) {
        long m6892E = m6892E();
        C0515g.m2482f().m2484b("Opening a new session with ID " + str);
        this.f6404j.mo2462d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C1751r.m6976l()), m6892E, AbstractC2137g0.m8691b(m6913p(this.f6400f, this.f6402h), m6915r(), m6914q(this.f6395a)));
        if (bool.booleanValue() && str != null) {
            this.f6398d.m7709o(str);
        }
        this.f6403i.m7636e(str);
        this.f6406l.m6879e(str);
        this.f6407m.m6856q(str, m6892E);
    }

    /* renamed from: y */
    public final void m6946y(long j10) {
        try {
            if (this.f6401g.m11799e(".ae" + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            C0515g.m2482f().m2493l("Could not create app exception marker file.", e10);
        }
    }

    /* renamed from: z */
    public void m6947z(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC3458i interfaceC3458i) {
        this.f6409o = interfaceC3458i;
        m6929T(str);
        C1755v c1755v = new C1755v(new a(), interfaceC3458i, uncaughtExceptionHandler, this.f6404j);
        this.f6408n = c1755v;
        Thread.setDefaultUncaughtExceptionHandler(c1755v);
    }
}
