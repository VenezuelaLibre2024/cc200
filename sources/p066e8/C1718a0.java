package p066e8;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p098g8.AbstractC2135f0;

/* renamed from: e8.a0 */
/* loaded from: classes.dex */
public class C1718a0 implements InterfaceC1726e0 {

    /* renamed from: a */
    public final File f6320a;

    /* renamed from: b */
    public final String f6321b;

    /* renamed from: c */
    public final String f6322c;

    public C1718a0(String str, String str2, File file) {
        this.f6321b = str;
        this.f6322c = str2;
        this.f6320a = file;
    }

    /* renamed from: a */
    public final byte[] m6762a() {
        byte[] bArr = new byte[8192];
        try {
            InputStream mo6763g = mo6763g();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (mo6763g == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (mo6763g != null) {
                            mo6763g.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = mo6763g.read(bArr);
                            if (read <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                mo6763g.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, read);
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p066e8.InterfaceC1726e0
    /* renamed from: g */
    public InputStream mo6763g() {
        if (this.f6320a.exists() && this.f6320a.isFile()) {
            try {
                return new FileInputStream(this.f6320a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // p066e8.InterfaceC1726e0
    /* renamed from: h */
    public String mo6764h() {
        return this.f6322c;
    }

    @Override // p066e8.InterfaceC1726e0
    /* renamed from: i */
    public AbstractC2135f0.d.b mo6765i() {
        byte[] m6762a = m6762a();
        if (m6762a != null) {
            return AbstractC2135f0.d.b.m8462a().mo8466b(m6762a).mo8467c(this.f6321b).mo8465a();
        }
        return null;
    }
}
