package p081f8;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import p023b8.C0515g;
import p066e8.C1733i;
import p081f8.C1878g;

/* renamed from: f8.h */
/* loaded from: classes.dex */
public class C1879h implements InterfaceC1874c {

    /* renamed from: d */
    public static final Charset f7103d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f7104a;

    /* renamed from: b */
    public final int f7105b;

    /* renamed from: c */
    public C1878g f7106c;

    /* renamed from: f8.h$a */
    /* loaded from: classes.dex */
    public class a implements C1878g.d {

        /* renamed from: a */
        public final /* synthetic */ byte[] f7107a;

        /* renamed from: b */
        public final /* synthetic */ int[] f7108b;

        public a(byte[] bArr, int[] iArr) {
            this.f7107a = bArr;
            this.f7108b = iArr;
        }

        @Override // p081f8.C1878g.d
        /* renamed from: a */
        public void mo7684a(InputStream inputStream, int i10) {
            try {
                inputStream.read(this.f7107a, this.f7108b[0], i10);
                int[] iArr = this.f7108b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: f8.h$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final byte[] f7110a;

        /* renamed from: b */
        public final int f7111b;

        public b(byte[] bArr, int i10) {
            this.f7110a = bArr;
            this.f7111b = i10;
        }
    }

    public C1879h(File file, int i10) {
        this.f7104a = file;
        this.f7105b = i10;
    }

    @Override // p081f8.InterfaceC1874c
    /* renamed from: a */
    public void mo7622a() {
        C1733i.m6818f(this.f7106c, "There was a problem closing the Crashlytics log file.");
        this.f7106c = null;
    }

    @Override // p081f8.InterfaceC1874c
    /* renamed from: b */
    public String mo7623b() {
        byte[] mo7624c = mo7624c();
        if (mo7624c != null) {
            return new String(mo7624c, f7103d);
        }
        return null;
    }

    @Override // p081f8.InterfaceC1874c
    /* renamed from: c */
    public byte[] mo7624c() {
        b m7686g = m7686g();
        if (m7686g == null) {
            return null;
        }
        int i10 = m7686g.f7111b;
        byte[] bArr = new byte[i10];
        System.arraycopy(m7686g.f7110a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // p081f8.InterfaceC1874c
    /* renamed from: d */
    public void mo7625d() {
        mo7622a();
        this.f7104a.delete();
    }

    @Override // p081f8.InterfaceC1874c
    /* renamed from: e */
    public void mo7626e(long j10, String str) {
        m7687h();
        m7685f(j10, str);
    }

    /* renamed from: f */
    public final void m7685f(long j10, String str) {
        if (this.f7106c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i10 = this.f7105b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f7106c.m7676l(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f7103d));
            while (!this.f7106c.m7669K() && this.f7106c.m7679n0() > this.f7105b) {
                this.f7106c.m7673g0();
            }
        } catch (IOException e10) {
            C0515g.m2482f().m2487e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    /* renamed from: g */
    public final b m7686g() {
        if (!this.f7104a.exists()) {
            return null;
        }
        m7687h();
        C1878g c1878g = this.f7106c;
        if (c1878g == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[c1878g.m7679n0()];
        try {
            this.f7106c.m7668E(new a(bArr, iArr));
        } catch (IOException e10) {
            C0515g.m2482f().m2487e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    /* renamed from: h */
    public final void m7687h() {
        if (this.f7106c == null) {
            try {
                this.f7106c = new C1878g(this.f7104a);
            } catch (IOException e10) {
                C0515g.m2482f().m2487e("Could not open log file: " + this.f7104a, e10);
            }
        }
    }
}
