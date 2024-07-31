package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.C0384b;
import androidx.profileinstaller.C0385c;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p189n1.C3690b;
import p189n1.C3691c;
import p189n1.C3698j;
import p189n1.C3699k;

/* renamed from: androidx.profileinstaller.b */
/* loaded from: classes.dex */
public class C0384b {

    /* renamed from: a */
    public final AssetManager f1802a;

    /* renamed from: b */
    public final Executor f1803b;

    /* renamed from: c */
    public final C0385c.c f1804c;

    /* renamed from: e */
    public final File f1806e;

    /* renamed from: f */
    public final String f1807f;

    /* renamed from: g */
    public final String f1808g;

    /* renamed from: h */
    public final String f1809h;

    /* renamed from: j */
    public C3690b[] f1811j;

    /* renamed from: k */
    public byte[] f1812k;

    /* renamed from: i */
    public boolean f1810i = false;

    /* renamed from: d */
    public final byte[] f1805d = m1928d();

    public C0384b(AssetManager assetManager, Executor executor, C0385c.c cVar, String str, String str2, String str3, File file) {
        this.f1802a = assetManager;
        this.f1803b = executor;
        this.f1804c = cVar;
        this.f1807f = str;
        this.f1808g = str2;
        this.f1809h = str3;
        this.f1806e = file;
    }

    /* renamed from: d */
    public static byte[] m1928d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 33) {
            return null;
        }
        switch (i10) {
            case 24:
            case 25:
                return C3699k.f13165e;
            case 26:
                return C3699k.f13164d;
            case 27:
                return C3699k.f13163c;
            case 28:
            case 29:
            case C1417R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return C3699k.f13162b;
            case C1417R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
            case C1417R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return C3699k.f13161a;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m1929g(int i10, Object obj) {
        this.f1804c.mo1908b(i10, obj);
    }

    /* renamed from: k */
    public static boolean m1930k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 33) {
            return false;
        }
        if (i10 != 24 && i10 != 25) {
            switch (i10) {
                case C1417R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                case C1417R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final C0384b m1931b(C3690b[] c3690bArr, byte[] bArr) {
        C0385c.c cVar;
        int i10;
        InputStream m1935h;
        try {
            m1935h = m1935h(this.f1802a, this.f1809h);
        } catch (FileNotFoundException e10) {
            e = e10;
            cVar = this.f1804c;
            i10 = 9;
            cVar.mo1908b(i10, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            cVar = this.f1804c;
            i10 = 7;
            cVar.mo1908b(i10, e);
            return null;
        } catch (IllegalStateException e12) {
            e = e12;
            this.f1811j = null;
            cVar = this.f1804c;
            i10 = 8;
            cVar.mo1908b(i10, e);
            return null;
        }
        if (m1935h == null) {
            if (m1935h != null) {
                m1935h.close();
            }
            return null;
        }
        try {
            this.f1811j = C3698j.m13946q(m1935h, C3698j.m13944o(m1935h, C3698j.f13160b), bArr, c3690bArr);
            m1935h.close();
            return this;
        } finally {
        }
    }

    /* renamed from: c */
    public final void m1932c() {
        if (!this.f1810i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    /* renamed from: e */
    public boolean m1933e() {
        int i10;
        Integer num;
        if (this.f1805d == null) {
            i10 = 3;
            num = Integer.valueOf(Build.VERSION.SDK_INT);
        } else {
            if (this.f1806e.canWrite()) {
                this.f1810i = true;
                return true;
            }
            i10 = 4;
            num = null;
        }
        m1938l(i10, num);
        return false;
    }

    /* renamed from: f */
    public final InputStream m1934f(AssetManager assetManager) {
        C0385c.c cVar;
        int i10;
        try {
            return m1935h(assetManager, this.f1808g);
        } catch (FileNotFoundException e10) {
            e = e10;
            cVar = this.f1804c;
            i10 = 6;
            cVar.mo1908b(i10, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            cVar = this.f1804c;
            i10 = 7;
            cVar.mo1908b(i10, e);
            return null;
        }
    }

    /* renamed from: h */
    public final InputStream m1935h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f1804c.mo1907a(5, null);
            return null;
        }
    }

    /* renamed from: i */
    public C0384b m1936i() {
        C0384b m1931b;
        m1932c();
        if (this.f1805d == null) {
            return this;
        }
        InputStream m1934f = m1934f(this.f1802a);
        if (m1934f != null) {
            this.f1811j = m1937j(m1934f);
        }
        C3690b[] c3690bArr = this.f1811j;
        return (c3690bArr == null || !m1930k() || (m1931b = m1931b(c3690bArr, this.f1805d)) == null) ? this : m1931b;
    }

    /* renamed from: j */
    public final C3690b[] m1937j(InputStream inputStream) {
        try {
            try {
                try {
                    C3690b[] m13952w = C3698j.m13952w(inputStream, C3698j.m13944o(inputStream, C3698j.f13159a), this.f1807f);
                    try {
                        inputStream.close();
                        return m13952w;
                    } catch (IOException e10) {
                        this.f1804c.mo1908b(7, e10);
                        return m13952w;
                    }
                } catch (IOException e11) {
                    this.f1804c.mo1908b(7, e11);
                    inputStream.close();
                    return null;
                } catch (IllegalStateException e12) {
                    this.f1804c.mo1908b(8, e12);
                    inputStream.close();
                    return null;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    this.f1804c.mo1908b(7, e13);
                }
                throw th;
            }
        } catch (IOException e14) {
            this.f1804c.mo1908b(7, e14);
        }
    }

    /* renamed from: l */
    public final void m1938l(final int i10, final Object obj) {
        this.f1803b.execute(new Runnable() { // from class: n1.a
            @Override // java.lang.Runnable
            public final void run() {
                C0384b.this.m1929g(i10, obj);
            }
        });
    }

    /* renamed from: m */
    public C0384b m1939m() {
        C0385c.c cVar;
        int i10;
        ByteArrayOutputStream byteArrayOutputStream;
        C3690b[] c3690bArr = this.f1811j;
        byte[] bArr = this.f1805d;
        if (c3690bArr != null && bArr != null) {
            m1932c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e10) {
                e = e10;
                cVar = this.f1804c;
                i10 = 7;
                cVar.mo1908b(i10, e);
                this.f1811j = null;
                return this;
            } catch (IllegalStateException e11) {
                e = e11;
                cVar = this.f1804c;
                i10 = 8;
                cVar.mo1908b(i10, e);
                this.f1811j = null;
                return this;
            }
            try {
                C3698j.m13919E(byteArrayOutputStream, bArr);
                if (!C3698j.m13916B(byteArrayOutputStream, bArr, c3690bArr)) {
                    this.f1804c.mo1908b(5, null);
                    this.f1811j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f1812k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f1811j = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    /* renamed from: n */
    public boolean m1940n() {
        byte[] bArr = this.f1812k;
        if (bArr == null) {
            return false;
        }
        m1932c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f1806e);
                    try {
                        C3691c.m13906l(byteArrayInputStream, fileOutputStream);
                        m1938l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                m1938l(6, e10);
                return false;
            } catch (IOException e11) {
                m1938l(7, e11);
                return false;
            }
        } finally {
            this.f1812k = null;
            this.f1811j = null;
        }
    }
}
