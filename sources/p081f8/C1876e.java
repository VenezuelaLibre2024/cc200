package p081f8;

import java.io.File;
import p141j8.C3262f;

/* renamed from: f8.e */
/* loaded from: classes.dex */
public class C1876e {

    /* renamed from: c */
    public static final b f7081c = new b();

    /* renamed from: a */
    public final C3262f f7082a;

    /* renamed from: b */
    public InterfaceC1874c f7083b;

    /* renamed from: f8.e$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC1874c {
        public b() {
        }

        @Override // p081f8.InterfaceC1874c
        /* renamed from: a */
        public void mo7622a() {
        }

        @Override // p081f8.InterfaceC1874c
        /* renamed from: b */
        public String mo7623b() {
            return null;
        }

        @Override // p081f8.InterfaceC1874c
        /* renamed from: c */
        public byte[] mo7624c() {
            return null;
        }

        @Override // p081f8.InterfaceC1874c
        /* renamed from: d */
        public void mo7625d() {
        }

        @Override // p081f8.InterfaceC1874c
        /* renamed from: e */
        public void mo7626e(long j10, String str) {
        }
    }

    public C1876e(C3262f c3262f) {
        this.f7082a = c3262f;
        this.f7083b = f7081c;
    }

    public C1876e(C3262f c3262f, String str) {
        this(c3262f);
        m7636e(str);
    }

    /* renamed from: a */
    public void m7632a() {
        this.f7083b.mo7625d();
    }

    /* renamed from: b */
    public byte[] m7633b() {
        return this.f7083b.mo7624c();
    }

    /* renamed from: c */
    public String m7634c() {
        return this.f7083b.mo7623b();
    }

    /* renamed from: d */
    public final File m7635d(String str) {
        return this.f7082a.m11809o(str, "userlog");
    }

    /* renamed from: e */
    public final void m7636e(String str) {
        this.f7083b.mo7622a();
        this.f7083b = f7081c;
        if (str == null) {
            return;
        }
        m7637f(m7635d(str), 65536);
    }

    /* renamed from: f */
    public void m7637f(File file, int i10) {
        this.f7083b = new C1879h(file, i10);
    }

    /* renamed from: g */
    public void m7638g(long j10, String str) {
        this.f7083b.mo7626e(j10, str);
    }
}
