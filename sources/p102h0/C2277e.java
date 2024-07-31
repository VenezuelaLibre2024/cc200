package p102h0;

import android.util.Base64;
import java.util.List;
import p133j0.C3205d;

/* renamed from: h0.e */
/* loaded from: classes.dex */
public final class C2277e {

    /* renamed from: a */
    public final String f9123a;

    /* renamed from: b */
    public final String f9124b;

    /* renamed from: c */
    public final String f9125c;

    /* renamed from: d */
    public final List<List<byte[]>> f9126d;

    /* renamed from: e */
    public final int f9127e = 0;

    /* renamed from: f */
    public final String f9128f;

    public C2277e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f9123a = (String) C3205d.m11414j(str);
        this.f9124b = (String) C3205d.m11414j(str2);
        this.f9125c = (String) C3205d.m11414j(str3);
        this.f9126d = (List) C3205d.m11414j(list);
        this.f9128f = m9247a(str, str2, str3);
    }

    /* renamed from: a */
    public final String m9247a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> m9248b() {
        return this.f9126d;
    }

    /* renamed from: c */
    public int m9249c() {
        return this.f9127e;
    }

    /* renamed from: d */
    public String m9250d() {
        return this.f9128f;
    }

    /* renamed from: e */
    public String m9251e() {
        return this.f9123a;
    }

    /* renamed from: f */
    public String m9252f() {
        return this.f9124b;
    }

    /* renamed from: g */
    public String m9253g() {
        return this.f9125c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f9123a + ", mProviderPackage: " + this.f9124b + ", mQuery: " + this.f9125c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f9126d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f9126d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f9127e);
        return sb2.toString();
    }
}
