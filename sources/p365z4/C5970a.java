package p365z4;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p206o5.C3914l;
import p206o5.C3918n;
import p206o5.InterfaceC3910j;
import p206o5.InterfaceC3917m0;
import p222p5.C4014a;

/* renamed from: z4.a */
/* loaded from: classes.dex */
public class C5970a implements InterfaceC3910j {

    /* renamed from: a */
    public final InterfaceC3910j f22174a;

    /* renamed from: b */
    public final byte[] f22175b;

    /* renamed from: c */
    public final byte[] f22176c;

    /* renamed from: d */
    public CipherInputStream f22177d;

    public C5970a(InterfaceC3910j interfaceC3910j, byte[] bArr, byte[] bArr2) {
        this.f22174a = interfaceC3910j;
        this.f22175b = bArr;
        this.f22176c = bArr2;
    }

    @Override // p206o5.InterfaceC3906h
    /* renamed from: c */
    public final int mo14769c(byte[] bArr, int i10, int i11) {
        C4014a.m15199e(this.f22177d);
        int read = this.f22177d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // p206o5.InterfaceC3910j
    public void close() {
        if (this.f22177d != null) {
            this.f22177d = null;
            this.f22174a.close();
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: g */
    public final void mo14820g(InterfaceC3917m0 interfaceC3917m0) {
        C4014a.m15199e(interfaceC3917m0);
        this.f22174a.mo14820g(interfaceC3917m0);
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: j */
    public final Map<String, List<String>> mo14829j() {
        return this.f22174a.mo14829j();
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: k */
    public final long mo14770k(C3918n c3918n) {
        try {
            Cipher m23922q = m23922q();
            try {
                m23922q.init(2, new SecretKeySpec(this.f22175b, "AES"), new IvParameterSpec(this.f22176c));
                C3914l c3914l = new C3914l(this.f22174a, c3918n);
                this.f22177d = new CipherInputStream(c3914l, m23922q);
                c3914l.m14842d();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: o */
    public final Uri mo14771o() {
        return this.f22174a.mo14771o();
    }

    /* renamed from: q */
    public Cipher m23922q() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }
}
