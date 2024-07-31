package p206o5;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import p109h7.C2422e;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4499t2;

/* renamed from: o5.i */
/* loaded from: classes.dex */
public final class C3908i extends AbstractC3902f {

    /* renamed from: e */
    public C3918n f14042e;

    /* renamed from: f */
    public byte[] f14043f;

    /* renamed from: g */
    public int f14044g;

    /* renamed from: h */
    public int f14045h;

    public C3908i() {
        super(false);
    }

    @Override // p206o5.InterfaceC3906h
    /* renamed from: c */
    public int mo14769c(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f14045h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(C4041n0.m15463j(this.f14043f), this.f14044g, bArr, i10, min);
        this.f14044g += min;
        this.f14045h -= min;
        m14821q(min);
        return min;
    }

    @Override // p206o5.InterfaceC3910j
    public void close() {
        if (this.f14043f != null) {
            this.f14043f = null;
            m14822r();
        }
        this.f14042e = null;
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: k */
    public long mo14770k(C3918n c3918n) {
        m14823s(c3918n);
        this.f14042e = c3918n;
        Uri uri = c3918n.f14071a;
        String scheme = uri.getScheme();
        C4014a.m15196b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] m15426Q0 = C4041n0.m15426Q0(uri.getSchemeSpecificPart(), ",");
        if (m15426Q0.length != 2) {
            throw C4499t2.m17595b("Unexpected URI format: " + uri, null);
        }
        String str = m15426Q0[1];
        if (m15426Q0[0].contains(";base64")) {
            try {
                this.f14043f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw C4499t2.m17595b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f14043f = C4041n0.m15468l0(URLDecoder.decode(str, C2422e.f9745a.name()));
        }
        long j10 = c3918n.f14077g;
        byte[] bArr = this.f14043f;
        if (j10 > bArr.length) {
            this.f14043f = null;
            throw new C3912k(2008);
        }
        int i10 = (int) j10;
        this.f14044g = i10;
        int length = bArr.length - i10;
        this.f14045h = length;
        long j11 = c3918n.f14078h;
        if (j11 != -1) {
            this.f14045h = (int) Math.min(length, j11);
        }
        m14824t(c3918n);
        long j12 = c3918n.f14078h;
        return j12 != -1 ? j12 : this.f14045h;
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: o */
    public Uri mo14771o() {
        C3918n c3918n = this.f14042e;
        if (c3918n != null) {
            return c3918n.f14071a;
        }
        return null;
    }
}
