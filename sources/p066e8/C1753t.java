package p066e8;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p023b8.C0517i;
import p098g8.AbstractC2135f0;
import p171l8.InterfaceC3458i;
import p184m8.C3554e;
import p184m8.InterfaceC3553d;

/* renamed from: e8.t */
/* loaded from: classes.dex */
public class C1753t {

    /* renamed from: g */
    public static final Map<String, Integer> f6473g;

    /* renamed from: h */
    public static final String f6474h;

    /* renamed from: a */
    public final Context f6475a;

    /* renamed from: b */
    public final C1720b0 f6476b;

    /* renamed from: c */
    public final C1717a f6477c;

    /* renamed from: d */
    public final InterfaceC3553d f6478d;

    /* renamed from: e */
    public final InterfaceC3458i f6479e;

    /* renamed from: f */
    public final C0517i f6480f = C0517i.f2318a;

    static {
        HashMap hashMap = new HashMap();
        f6473g = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f6474h = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.6.2");
    }

    public C1753t(Context context, C1720b0 c1720b0, C1717a c1717a, InterfaceC3553d interfaceC3553d, InterfaceC3458i interfaceC3458i) {
        this.f6475a = context;
        this.f6476b = c1720b0;
        this.f6477c = c1717a;
        this.f6478d = interfaceC3553d;
        this.f6479e = interfaceC3458i;
    }

    /* renamed from: f */
    public static long m7004f(long j10) {
        if (j10 > 0) {
            return j10;
        }
        return 0L;
    }

    /* renamed from: g */
    public static int m7005g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f6473g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    /* renamed from: A */
    public final AbstractC2135f0.e.d.a.c m7006A(AbstractC2135f0.a aVar) {
        return this.f6480f.m2495a(aVar.mo8399e(), aVar.mo8398d(), aVar.mo8397c());
    }

    /* renamed from: a */
    public final AbstractC2135f0.a m7007a(AbstractC2135f0.a aVar) {
        List<AbstractC2135f0.a.AbstractC6164a> list;
        if (!this.f6479e.mo12858b().f12123b.f12132c || this.f6477c.f6314c.size() <= 0) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C1727f c1727f : this.f6477c.f6314c) {
                arrayList.add(AbstractC2135f0.a.AbstractC6164a.m8459a().mo8427d(c1727f.m6797c()).mo8425b(c1727f.m6795a()).mo8426c(c1727f.m6796b()).mo8424a());
            }
            list = Collections.unmodifiableList(arrayList);
        }
        return AbstractC2135f0.a.m8458a().mo8407c(aVar.mo8397c()).mo8409e(aVar.mo8399e()).mo8411g(aVar.mo8401g()).mo8413i(aVar.mo8403i()).mo8408d(aVar.mo8398d()).mo8410f(aVar.mo8400f()).mo8412h(aVar.mo8402h()).mo8414j(aVar.mo8404j()).mo8406b(list).mo8405a();
    }

    /* renamed from: b */
    public final AbstractC2135f0.b m7008b() {
        return AbstractC2135f0.m8451b().mo8391k("18.6.2").mo8387g(this.f6477c.f6312a).mo8388h(this.f6476b.mo6772a().mo6783c()).mo8386f(this.f6476b.mo6772a().mo6784d()).mo8384d(this.f6477c.f6317f).mo8385e(this.f6477c.f6318g).mo8390j(4);
    }

    /* renamed from: c */
    public AbstractC2135f0.e.d m7009c(AbstractC2135f0.a aVar) {
        int i10 = this.f6475a.getResources().getConfiguration().orientation;
        return AbstractC2135f0.e.d.m8536a().mo8641g("anr").mo8640f(aVar.mo8403i()).mo8636b(m7014j(i10, m7007a(aVar))).mo8637c(m7016l(i10)).mo8635a();
    }

    /* renamed from: d */
    public AbstractC2135f0.e.d m7010d(Throwable th, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f6475a.getResources().getConfiguration().orientation;
        return AbstractC2135f0.e.d.m8536a().mo8641g(str).mo8640f(j10).mo8636b(m7015k(i12, C3554e.m13200a(th, this.f6478d), thread, i10, i11, z10)).mo8637c(m7016l(i12)).mo8635a();
    }

    /* renamed from: e */
    public AbstractC2135f0 m7011e(String str, long j10) {
        return m7008b().mo8392l(m7024t(str, j10)).mo8381a();
    }

    /* renamed from: h */
    public final AbstractC2135f0.e.d.a.b.AbstractC6168a m7012h() {
        return AbstractC2135f0.e.d.a.b.AbstractC6168a.m8567a().mo8574b(0L).mo8576d(0L).mo8575c(this.f6477c.f6316e).mo8577e(this.f6477c.f6313b).mo8573a();
    }

    /* renamed from: i */
    public final List<AbstractC2135f0.e.d.a.b.AbstractC6168a> m7013i() {
        return Collections.singletonList(m7012h());
    }

    /* renamed from: j */
    public final AbstractC2135f0.e.d.a m7014j(int i10, AbstractC2135f0.a aVar) {
        return AbstractC2135f0.e.d.a.m8544a().mo8555c(Boolean.valueOf(aVar.mo8397c() != 100)).mo8556d(m7006A(aVar)).mo8560h(i10).mo8558f(m7019o(aVar)).mo8553a();
    }

    /* renamed from: k */
    public final AbstractC2135f0.e.d.a m7015k(int i10, C3554e c3554e, Thread thread, int i11, int i12, boolean z10) {
        Boolean bool;
        AbstractC2135f0.e.d.a.c m2498e = this.f6480f.m2498e(this.f6475a);
        if (m2498e.mo8626b() > 0) {
            bool = Boolean.valueOf(m2498e.mo8626b() != 100);
        } else {
            bool = null;
        }
        return AbstractC2135f0.e.d.a.m8544a().mo8555c(bool).mo8556d(m2498e).mo8554b(this.f6480f.m2497d(this.f6475a)).mo8560h(i10).mo8558f(m7020p(c3554e, thread, i11, i12, z10)).mo8553a();
    }

    /* renamed from: l */
    public final AbstractC2135f0.e.d.c m7016l(int i10) {
        C1725e m6790a = C1725e.m6790a(this.f6475a);
        Float m6793b = m6790a.m6793b();
        Double valueOf = m6793b != null ? Double.valueOf(m6793b.doubleValue()) : null;
        int m6794c = m6790a.m6794c();
        boolean m6826n = C1733i.m6826n(this.f6475a);
        return AbstractC2135f0.e.d.c.m8642a().mo8650b(valueOf).mo8651c(m6794c).mo8654f(m6826n).mo8653e(i10).mo8655g(m7004f(C1733i.m6814b(this.f6475a) - C1733i.m6813a(this.f6475a))).mo8652d(C1733i.m6815c(Environment.getDataDirectory().getPath())).mo8649a();
    }

    /* renamed from: m */
    public final AbstractC2135f0.e.d.a.b.c m7017m(C3554e c3554e, int i10, int i11) {
        return m7018n(c3554e, i10, i11, 0);
    }

    /* renamed from: n */
    public final AbstractC2135f0.e.d.a.b.c m7018n(C3554e c3554e, int i10, int i11, int i12) {
        String str = c3554e.f12452b;
        String str2 = c3554e.f12451a;
        StackTraceElement[] stackTraceElementArr = c3554e.f12453c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C3554e c3554e2 = c3554e.f12454d;
        if (i12 >= i11) {
            C3554e c3554e3 = c3554e2;
            while (c3554e3 != null) {
                c3554e3 = c3554e3.f12454d;
                i13++;
            }
        }
        AbstractC2135f0.e.d.a.b.c.AbstractC6171a mo8594d = AbstractC2135f0.e.d.a.b.c.m8585a().mo8596f(str).mo8595e(str2).mo8593c(m7022r(stackTraceElementArr, i10)).mo8594d(i13);
        if (c3554e2 != null && i13 == 0) {
            mo8594d.mo8592b(m7018n(c3554e2, i10, i11, i12 + 1));
        }
        return mo8594d.mo8591a();
    }

    /* renamed from: o */
    public final AbstractC2135f0.e.d.a.b m7019o(AbstractC2135f0.a aVar) {
        return AbstractC2135f0.e.d.a.b.m8561a().mo8580b(aVar).mo8583e(m7027w()).mo8581c(m7013i()).mo8579a();
    }

    /* renamed from: p */
    public final AbstractC2135f0.e.d.a.b m7020p(C3554e c3554e, Thread thread, int i10, int i11, boolean z10) {
        return AbstractC2135f0.e.d.a.b.m8561a().mo8584f(m7030z(c3554e, thread, i10, z10)).mo8582d(m7017m(c3554e, i10, i11)).mo8583e(m7027w()).mo8581c(m7013i()).mo8579a();
    }

    /* renamed from: q */
    public final AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b m7021q(StackTraceElement stackTraceElement, AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.AbstractC6177a abstractC6177a) {
        long j10 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j10 = stackTraceElement.getLineNumber();
        }
        return abstractC6177a.mo8623e(max).mo8624f(str).mo8620b(fileName).mo8622d(j10).mo8619a();
    }

    /* renamed from: r */
    public final List<AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b> m7022r(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(m7021q(stackTraceElement, AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.m8613a().mo8621c(i10)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: s */
    public final AbstractC2135f0.e.a m7023s() {
        return AbstractC2135f0.e.a.m8486a().mo8498e(this.f6476b.m6775f()).mo8500g(this.f6477c.f6317f).mo8497d(this.f6477c.f6318g).mo8499f(this.f6476b.mo6772a().mo6783c()).mo8495b(this.f6477c.f6319h.m2477d()).mo8496c(this.f6477c.f6319h.m2478e()).mo8494a();
    }

    /* renamed from: t */
    public final AbstractC2135f0.e m7024t(String str, long j10) {
        return AbstractC2135f0.e.m8468a().mo8514m(j10).mo8511j(str).mo8509h(f6474h).mo8503b(m7023s()).mo8513l(m7026v()).mo8506e(m7025u()).mo8510i(3).mo8502a();
    }

    /* renamed from: u */
    public final AbstractC2135f0.e.c m7025u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int m7005g = m7005g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long m6814b = C1733i.m6814b(this.f6475a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean m6835w = C1733i.m6835w();
        int m6824l = C1733i.m6824l();
        return AbstractC2135f0.e.c.m8516a().mo8527b(m7005g).mo8531f(Build.MODEL).mo8528c(availableProcessors).mo8533h(m6814b).mo8529d(blockCount).mo8534i(m6835w).mo8535j(m6824l).mo8530e(Build.MANUFACTURER).mo8532g(Build.PRODUCT).mo8526a();
    }

    /* renamed from: v */
    public final AbstractC2135f0.e.AbstractC6181e m7026v() {
        return AbstractC2135f0.e.AbstractC6181e.m8680a().mo8688d(3).mo8689e(Build.VERSION.RELEASE).mo8686b(Build.VERSION.CODENAME).mo8687c(C1733i.m6836x()).mo8685a();
    }

    /* renamed from: w */
    public final AbstractC2135f0.e.d.a.b.AbstractC6172d m7027w() {
        return AbstractC2135f0.e.d.a.b.AbstractC6172d.m8597a().mo8604d("0").mo8603c("0").mo8602b(0L).mo8601a();
    }

    /* renamed from: x */
    public final AbstractC2135f0.e.d.a.b.AbstractC6174e m7028x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m7029y(thread, stackTraceElementArr, 0);
    }

    /* renamed from: y */
    public final AbstractC2135f0.e.d.a.b.AbstractC6174e m7029y(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return AbstractC2135f0.e.d.a.b.AbstractC6174e.m8605a().mo8612d(thread.getName()).mo8611c(i10).mo8610b(m7022r(stackTraceElementArr, i10)).mo8609a();
    }

    /* renamed from: z */
    public final List<AbstractC2135f0.e.d.a.b.AbstractC6174e> m7030z(C3554e c3554e, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m7029y(thread, c3554e.f12453c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(m7028x(key, this.f6478d.mo13197a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
