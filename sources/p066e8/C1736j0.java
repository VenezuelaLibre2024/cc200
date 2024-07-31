package p066e8;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p023b8.C0515g;
import p081f8.C1876e;
import p081f8.C1884m;
import p098g8.AbstractC2135f0;
import p141j8.C3261e;
import p141j8.C3262f;
import p156k8.C3373b;
import p171l8.InterfaceC3458i;
import p184m8.InterfaceC3553d;

/* renamed from: e8.j0 */
/* loaded from: classes.dex */
public class C1736j0 {

    /* renamed from: a */
    public final C1753t f6365a;

    /* renamed from: b */
    public final C3261e f6366b;

    /* renamed from: c */
    public final C3373b f6367c;

    /* renamed from: d */
    public final C1876e f6368d;

    /* renamed from: e */
    public final C1884m f6369e;

    /* renamed from: f */
    public final C1720b0 f6370f;

    public C1736j0(C1753t c1753t, C3261e c3261e, C3373b c3373b, C1876e c1876e, C1884m c1884m, C1720b0 c1720b0) {
        this.f6365a = c1753t;
        this.f6366b = c3261e;
        this.f6367c = c3373b;
        this.f6368d = c1876e;
        this.f6369e = c1884m;
        this.f6370f = c1720b0;
    }

    /* renamed from: f */
    public static AbstractC2135f0.a m6842f(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = m6843g(traceInputStream);
            }
        } catch (IOException e10) {
            C0515g.m2482f().m2492k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return AbstractC2135f0.a.m8458a().mo8407c(applicationExitInfo.getImportance()).mo8409e(applicationExitInfo.getProcessName()).mo8411g(applicationExitInfo.getReason()).mo8413i(applicationExitInfo.getTimestamp()).mo8408d(applicationExitInfo.getPid()).mo8410f(applicationExitInfo.getPss()).mo8412h(applicationExitInfo.getRss()).mo8414j(str).mo8405a();
    }

    /* renamed from: g */
    public static String m6843g(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: h */
    public static C1736j0 m6844h(Context context, C1720b0 c1720b0, C3262f c3262f, C1717a c1717a, C1876e c1876e, C1884m c1884m, InterfaceC3553d interfaceC3553d, InterfaceC3458i interfaceC3458i, C1730g0 c1730g0, C1741m c1741m) {
        return new C1736j0(new C1753t(context, c1720b0, c1717a, interfaceC3553d, interfaceC3458i), new C3261e(c3262f, interfaceC3458i, c1741m), C3373b.m12542b(context, interfaceC3458i, c1730g0), c1876e, c1884m, c1720b0);
    }

    /* renamed from: m */
    public static List<AbstractC2135f0.c> m6845m(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(AbstractC2135f0.c.m8460a().mo8440b(entry.getKey()).mo8441c(entry.getValue()).mo8439a());
        }
        Collections.sort(arrayList, C1734i0.f6363h);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: o */
    public static /* synthetic */ int m6846o(AbstractC2135f0.c cVar, AbstractC2135f0.c cVar2) {
        return cVar.mo8437b().compareTo(cVar2.mo8437b());
    }

    /* renamed from: c */
    public final AbstractC2135f0.e.d m6847c(AbstractC2135f0.e.d dVar, C1876e c1876e, C1884m c1884m) {
        AbstractC2135f0.e.d.b mo8543h = dVar.mo8543h();
        String m7634c = c1876e.m7634c();
        if (m7634c != null) {
            mo8543h.mo8638d(AbstractC2135f0.e.d.AbstractC6179d.m8656a().mo8659b(m7634c).mo8658a());
        } else {
            C0515g.m2482f().m2490i("No log data to include with this event.");
        }
        List<AbstractC2135f0.c> m6845m = m6845m(c1884m.m7702e());
        List<AbstractC2135f0.c> m6845m2 = m6845m(c1884m.m7703f());
        if (!m6845m.isEmpty() || !m6845m2.isEmpty()) {
            mo8543h.mo8636b(dVar.mo8537b().mo8552i().mo8557e(m6845m).mo8559g(m6845m2).mo8553a());
        }
        return mo8543h.mo8635a();
    }

    /* renamed from: d */
    public final AbstractC2135f0.e.d m6848d(AbstractC2135f0.e.d dVar) {
        return m6849e(m6847c(dVar, this.f6368d, this.f6369e), this.f6369e);
    }

    /* renamed from: e */
    public final AbstractC2135f0.e.d m6849e(AbstractC2135f0.e.d dVar, C1884m c1884m) {
        List<AbstractC2135f0.e.d.AbstractC6180e> m7704g = c1884m.m7704g();
        if (m7704g.isEmpty()) {
            return dVar;
        }
        AbstractC2135f0.e.d.b mo8543h = dVar.mo8543h();
        mo8543h.mo8639e(AbstractC2135f0.e.d.f.m8676a().mo8679b(m7704g).mo8678a());
        return mo8543h.mo8635a();
    }

    /* renamed from: i */
    public final AbstractC1754u m6850i(AbstractC1754u abstractC1754u) {
        if (abstractC1754u.mo6766b().mo8373g() != null) {
            return abstractC1754u;
        }
        return AbstractC1754u.m7031a(abstractC1754u.mo6766b().m8455r(this.f6370f.m6774d()), abstractC1754u.mo6768d(), abstractC1754u.mo6767c());
    }

    /* renamed from: j */
    public void m6851j(String str, List<InterfaceC1726e0> list, AbstractC2135f0.a aVar) {
        C0515g.m2482f().m2484b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC1726e0> it = list.iterator();
        while (it.hasNext()) {
            AbstractC2135f0.d.b mo6765i = it.next().mo6765i();
            if (mo6765i != null) {
                arrayList.add(mo6765i);
            }
        }
        this.f6366b.m11781l(str, AbstractC2135f0.d.m8461a().mo8448b(Collections.unmodifiableList(arrayList)).mo8447a(), aVar);
    }

    /* renamed from: k */
    public void m6852k(long j10, String str) {
        this.f6366b.m11780k(str, j10);
    }

    /* renamed from: l */
    public final ApplicationExitInfo m6853l(String str, List<ApplicationExitInfo> list) {
        long m11784q = this.f6366b.m11784q(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < m11784q) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    /* renamed from: n */
    public boolean m6854n() {
        return this.f6366b.m11785r();
    }

    /* renamed from: p */
    public SortedSet<String> m6855p() {
        return this.f6366b.m11783p();
    }

    /* renamed from: q */
    public void m6856q(String str, long j10) {
        this.f6366b.m11788z(this.f6365a.m7011e(str, j10));
    }

    /* renamed from: r */
    public final boolean m6857r(Task<AbstractC1754u> task) {
        if (!task.isSuccessful()) {
            C0515g.m2482f().m2493l("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        AbstractC1754u result = task.getResult();
        C0515g.m2482f().m2484b("Crashlytics report successfully enqueued to DataTransport: " + result.mo6768d());
        File mo6767c = result.mo6767c();
        if (mo6767c.delete()) {
            C0515g.m2482f().m2484b("Deleted report file: " + mo6767c.getPath());
            return true;
        }
        C0515g.m2482f().m2492k("Crashlytics could not delete report file: " + mo6767c.getPath());
        return true;
    }

    /* renamed from: s */
    public final void m6858s(Throwable th, Thread thread, String str, String str2, long j10, boolean z10) {
        this.f6366b.m11787y(m6848d(this.f6365a.m7010d(th, thread, str2, j10, 4, 8, z10)), str, str2.equals("crash"));
    }

    /* renamed from: t */
    public void m6859t(Throwable th, Thread thread, String str, long j10) {
        C0515g.m2482f().m2490i("Persisting fatal event for session " + str);
        m6858s(th, thread, str, "crash", j10, true);
    }

    /* renamed from: u */
    public void m6860u(Throwable th, Thread thread, String str, long j10) {
        C0515g.m2482f().m2490i("Persisting non-fatal event for session " + str);
        m6858s(th, thread, str, ImagePickerCache.MAP_KEY_ERROR, j10, false);
    }

    /* renamed from: v */
    public void m6861v(String str, List<ApplicationExitInfo> list, C1876e c1876e, C1884m c1884m) {
        ApplicationExitInfo m6853l = m6853l(str, list);
        if (m6853l == null) {
            C0515g.m2482f().m2490i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        AbstractC2135f0.e.d m7009c = this.f6365a.m7009c(m6842f(m6853l));
        C0515g.m2482f().m2484b("Persisting anr for session " + str);
        this.f6366b.m11787y(m6849e(m6847c(m7009c, c1876e, c1884m), c1884m), str, true);
    }

    /* renamed from: w */
    public void m6862w() {
        this.f6366b.m11778i();
    }

    /* renamed from: x */
    public Task<Void> m6863x(Executor executor) {
        return m6864y(executor, null);
    }

    /* renamed from: y */
    public Task<Void> m6864y(Executor executor, String str) {
        List<AbstractC1754u> m11786w = this.f6366b.m11786w();
        ArrayList arrayList = new ArrayList();
        for (AbstractC1754u abstractC1754u : m11786w) {
            if (str == null || str.equals(abstractC1754u.mo6768d())) {
                arrayList.add(this.f6367c.m12545c(m6850i(abstractC1754u), str != null).continueWith(executor, new Continuation() { // from class: e8.h0
                    public /* synthetic */ C1732h0() {
                    }

                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        boolean m6857r;
                        m6857r = C1736j0.this.m6857r(task);
                        return Boolean.valueOf(m6857r);
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
