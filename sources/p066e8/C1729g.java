package p066e8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p098g8.AbstractC2135f0;

/* renamed from: e8.g */
/* loaded from: classes.dex */
public class C1729g implements InterfaceC1726e0 {

    /* renamed from: a */
    public final byte[] f6342a;

    /* renamed from: b */
    public final String f6343b;

    /* renamed from: c */
    public final String f6344c;

    public C1729g(String str, String str2, byte[] bArr) {
        this.f6343b = str;
        this.f6344c = str2;
        this.f6342a = bArr;
    }

    /* renamed from: a */
    public final byte[] m6800a() {
        if (m6801b()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f6342a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final boolean m6801b() {
        byte[] bArr = this.f6342a;
        return bArr == null || bArr.length == 0;
    }

    @Override // p066e8.InterfaceC1726e0
    /* renamed from: g */
    public InputStream mo6763g() {
        if (m6801b()) {
            return null;
        }
        return new ByteArrayInputStream(this.f6342a);
    }

    @Override // p066e8.InterfaceC1726e0
    /* renamed from: h */
    public String mo6764h() {
        return this.f6344c;
    }

    @Override // p066e8.InterfaceC1726e0
    /* renamed from: i */
    public AbstractC2135f0.d.b mo6765i() {
        byte[] m6800a = m6800a();
        if (m6800a == null) {
            return null;
        }
        return AbstractC2135f0.d.b.m8462a().mo8466b(m6800a).mo8467c(this.f6343b).mo8465a();
    }
}
