package p141j8;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import p023b8.C0515g;
import p066e8.AbstractC1754u;
import p066e8.C1741m;
import p081f8.C1884m;
import p098g8.AbstractC2135f0;
import p110h8.C2450j;
import p171l8.InterfaceC3458i;

/* renamed from: j8.e */
/* loaded from: classes.dex */
public class C3261e {

    /* renamed from: e */
    public static final Charset f11375e = Charset.forName("UTF-8");

    /* renamed from: f */
    public static final int f11376f = 15;

    /* renamed from: g */
    public static final C2450j f11377g = new C2450j();

    /* renamed from: h */
    public static final Comparator<? super File> f11378h = new Comparator() { // from class: j8.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m11769u;
            m11769u = C3261e.m11769u((File) obj, (File) obj2);
            return m11769u;
        }
    };

    /* renamed from: i */
    public static final FilenameFilter f11379i = new FilenameFilter() { // from class: j8.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean m11770v;
            m11770v = C3261e.m11770v(file, str);
            return m11770v;
        }
    };

    /* renamed from: a */
    public final AtomicInteger f11380a = new AtomicInteger(0);

    /* renamed from: b */
    public final C3262f f11381b;

    /* renamed from: c */
    public final InterfaceC3458i f11382c;

    /* renamed from: d */
    public final C1741m f11383d;

    public C3261e(C3262f c3262f, InterfaceC3458i interfaceC3458i, C1741m c1741m) {
        this.f11381b = c3262f;
        this.f11382c = interfaceC3458i;
        this.f11383d = c1741m;
    }

    /* renamed from: A */
    public static String m11756A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f11375e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* renamed from: F */
    public static void m11757F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f11375e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: G */
    public static void m11758G(File file, String str, long j10) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f11375e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m11764h(j10));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: f */
    public static int m11763f(List<File> list, int i10) {
        int size = list.size();
        for (File file : list) {
            if (size <= i10) {
                return size;
            }
            C3262f.m11791s(file);
            size--;
        }
        return size;
    }

    /* renamed from: h */
    public static long m11764h(long j10) {
        return j10 * 1000;
    }

    /* renamed from: m */
    public static String m11765m(int i10, boolean z10) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i10)) + (z10 ? "_" : "");
    }

    /* renamed from: o */
    public static String m11766o(String str) {
        return str.substring(0, f11376f);
    }

    /* renamed from: s */
    public static boolean m11767s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* renamed from: t */
    public static boolean m11768t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* renamed from: u */
    public static /* synthetic */ int m11769u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* renamed from: v */
    public static /* synthetic */ boolean m11770v(File file, String str) {
        return str.startsWith("event");
    }

    /* renamed from: x */
    public static int m11771x(File file, File file2) {
        return m11766o(file.getName()).compareTo(m11766o(file2.getName()));
    }

    /* renamed from: B */
    public final void m11772B(File file, AbstractC2135f0.d dVar, String str, AbstractC2135f0.a aVar) {
        String m6878d = this.f11383d.m6878d(str);
        try {
            C2450j c2450j = f11377g;
            m11757F(this.f11381b.m11801g(str), c2450j.m9773M(c2450j.m9772L(m11756A(file)).m8456s(dVar).m8453p(aVar).m8452o(m6878d)));
        } catch (IOException e10) {
            C0515g.m2482f().m2493l("Could not synthesize final native report file for " + file, e10);
        }
    }

    /* renamed from: C */
    public final void m11773C(String str, long j10) {
        boolean z10;
        List<File> m11810p = this.f11381b.m11810p(str, f11379i);
        if (m11810p.isEmpty()) {
            C0515g.m2482f().m2490i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(m11810p);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z10 = false;
            for (File file : m11810p) {
                try {
                    arrayList.add(f11377g.m9774j(m11756A(file)));
                } catch (IOException e10) {
                    C0515g.m2482f().m2493l("Could not add event to report for " + file, e10);
                }
                if (z10 || m11767s(file.getName())) {
                    z10 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            m11774D(this.f11381b.m11809o(str, "report"), arrayList, j10, z10, C1884m.m7701k(str, this.f11381b), this.f11383d.m6878d(str));
        } else {
            C0515g.m2482f().m2492k("Could not parse event files for session " + str);
        }
    }

    /* renamed from: D */
    public final void m11774D(File file, List<AbstractC2135f0.e.d> list, long j10, boolean z10, String str, String str2) {
        try {
            C2450j c2450j = f11377g;
            AbstractC2135f0 m8454q = c2450j.m9772L(m11756A(file)).m8457t(j10, z10, str).m8452o(str2).m8454q(list);
            AbstractC2135f0.e mo8379m = m8454q.mo8379m();
            if (mo8379m == null) {
                return;
            }
            C0515g.m2482f().m2484b("appQualitySessionId: " + str2);
            m11757F(z10 ? this.f11381b.m11804j(mo8379m.mo8476i()) : this.f11381b.m11806l(mo8379m.mo8476i()), c2450j.m9773M(m8454q));
        } catch (IOException e10) {
            C0515g.m2482f().m2493l("Could not synthesize final report file for " + file, e10);
        }
    }

    /* renamed from: E */
    public final int m11775E(String str, int i10) {
        List<File> m11810p = this.f11381b.m11810p(str, new FilenameFilter() { // from class: j8.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean m11768t;
                m11768t = C3261e.m11768t(file, str2);
                return m11768t;
            }
        });
        Collections.sort(m11810p, new Comparator() { // from class: j8.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m11771x;
                m11771x = C3261e.m11771x((File) obj, (File) obj2);
                return m11771x;
            }
        });
        return m11763f(m11810p, i10);
    }

    /* renamed from: e */
    public final SortedSet<String> m11776e(String str) {
        this.f11381b.m11796b();
        SortedSet<String> m11783p = m11783p();
        if (str != null) {
            m11783p.remove(str);
        }
        if (m11783p.size() <= 8) {
            return m11783p;
        }
        while (m11783p.size() > 8) {
            String last = m11783p.last();
            C0515g.m2482f().m2484b("Removing session over cap: " + last);
            this.f11381b.m11797c(last);
            m11783p.remove(last);
        }
        return m11783p;
    }

    /* renamed from: g */
    public final void m11777g() {
        int i10 = this.f11382c.mo12858b().f12122a.f12134b;
        List<File> m11782n = m11782n();
        int size = m11782n.size();
        if (size <= i10) {
            return;
        }
        Iterator<File> it = m11782n.subList(i10, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* renamed from: i */
    public void m11778i() {
        m11779j(this.f11381b.m11807m());
        m11779j(this.f11381b.m11805k());
        m11779j(this.f11381b.m11802h());
    }

    /* renamed from: j */
    public final void m11779j(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* renamed from: k */
    public void m11780k(String str, long j10) {
        for (String str2 : m11776e(str)) {
            C0515g.m2482f().m2490i("Finalizing report for session " + str2);
            m11773C(str2, j10);
            this.f11381b.m11797c(str2);
        }
        m11777g();
    }

    /* renamed from: l */
    public void m11781l(String str, AbstractC2135f0.d dVar, AbstractC2135f0.a aVar) {
        File m11809o = this.f11381b.m11809o(str, "report");
        C0515g.m2482f().m2484b("Writing native session report for " + str + " to file: " + m11809o);
        m11772B(m11809o, dVar, str, aVar);
    }

    /* renamed from: n */
    public final List<File> m11782n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f11381b.m11805k());
        arrayList.addAll(this.f11381b.m11802h());
        Comparator<? super File> comparator = f11378h;
        Collections.sort(arrayList, comparator);
        List<File> m11807m = this.f11381b.m11807m();
        Collections.sort(m11807m, comparator);
        arrayList.addAll(m11807m);
        return arrayList;
    }

    /* renamed from: p */
    public SortedSet<String> m11783p() {
        return new TreeSet(this.f11381b.m11798d()).descendingSet();
    }

    /* renamed from: q */
    public long m11784q(String str) {
        return this.f11381b.m11809o(str, "start-time").lastModified();
    }

    /* renamed from: r */
    public boolean m11785r() {
        return (this.f11381b.m11807m().isEmpty() && this.f11381b.m11805k().isEmpty() && this.f11381b.m11802h().isEmpty()) ? false : true;
    }

    /* renamed from: w */
    public List<AbstractC1754u> m11786w() {
        List<File> m11782n = m11782n();
        ArrayList arrayList = new ArrayList();
        for (File file : m11782n) {
            try {
                arrayList.add(AbstractC1754u.m7031a(f11377g.m9772L(m11756A(file)), file.getName(), file));
            } catch (IOException e10) {
                C0515g.m2482f().m2493l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public void m11787y(AbstractC2135f0.e.d dVar, String str, boolean z10) {
        int i10 = this.f11382c.mo12858b().f12122a.f12133a;
        try {
            m11757F(this.f11381b.m11809o(str, m11765m(this.f11380a.getAndIncrement(), z10)), f11377g.m9775k(dVar));
        } catch (IOException e10) {
            C0515g.m2482f().m2493l("Could not persist event for session " + str, e10);
        }
        m11775E(str, i10);
    }

    /* renamed from: z */
    public void m11788z(AbstractC2135f0 abstractC2135f0) {
        AbstractC2135f0.e mo8379m = abstractC2135f0.mo8379m();
        if (mo8379m == null) {
            C0515g.m2482f().m2484b("Could not get session for report");
            return;
        }
        String mo8476i = mo8379m.mo8476i();
        try {
            m11757F(this.f11381b.m11809o(mo8476i, "report"), f11377g.m9773M(abstractC2135f0));
            m11758G(this.f11381b.m11809o(mo8476i, "start-time"), "", mo8379m.mo8479l());
        } catch (IOException e10) {
            C0515g.m2482f().m2485c("Could not persist report for session " + mo8476i, e10);
        }
    }
}
