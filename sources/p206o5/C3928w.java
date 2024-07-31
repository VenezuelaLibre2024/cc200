package p206o5;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: o5.w */
/* loaded from: classes.dex */
public final class C3928w extends AbstractC3902f {

    /* renamed from: e */
    public RandomAccessFile f14177e;

    /* renamed from: f */
    public Uri f14178f;

    /* renamed from: g */
    public long f14179g;

    /* renamed from: h */
    public boolean f14180h;

    /* renamed from: o5.w$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static boolean m14913b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* renamed from: o5.w$b */
    /* loaded from: classes.dex */
    public static class b extends C3912k {
        public b(String str, Throwable th, int i10) {
            super(str, th, i10);
        }

        public b(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public C3928w() {
        super(false);
    }

    /* renamed from: u */
    public static RandomAccessFile m14911u(Uri uri) {
        try {
            return new RandomAccessFile((String) C4014a.m15199e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e10, (C4041n0.f14513a < 21 || !a.m14913b(e10.getCause())) ? 2005 : 2006);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new b(e11, 2006);
        } catch (RuntimeException e12) {
            throw new b(e12, 2000);
        }
    }

    @Override // p206o5.InterfaceC3906h
    /* renamed from: c */
    public int mo14769c(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f14179g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) C4041n0.m15463j(this.f14177e)).read(bArr, i10, (int) Math.min(this.f14179g, i11));
            if (read > 0) {
                this.f14179g -= read;
                m14821q(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // p206o5.InterfaceC3910j
    public void close() {
        this.f14178f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f14177e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } finally {
            this.f14177e = null;
            if (this.f14180h) {
                this.f14180h = false;
                m14822r();
            }
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: k */
    public long mo14770k(C3918n c3918n) {
        Uri uri = c3918n.f14071a;
        this.f14178f = uri;
        m14823s(c3918n);
        RandomAccessFile m14911u = m14911u(uri);
        this.f14177e = m14911u;
        try {
            m14911u.seek(c3918n.f14077g);
            long j10 = c3918n.f14078h;
            if (j10 == -1) {
                j10 = this.f14177e.length() - c3918n.f14077g;
            }
            this.f14179g = j10;
            if (j10 < 0) {
                throw new b(null, null, 2008);
            }
            this.f14180h = true;
            m14824t(c3918n);
            return this.f14179g;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: o */
    public Uri mo14771o() {
        return this.f14178f;
    }
}
