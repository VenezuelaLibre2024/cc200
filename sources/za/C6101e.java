package za;

import p129ia.C2678j;
import p211oa.C3964a;

/* renamed from: za.e */
/* loaded from: classes.dex */
public final class C6101e extends AbstractC6105i {

    /* renamed from: c */
    public final String f22626c;

    /* renamed from: d */
    public final String f22627d;

    public C6101e(C3964a c3964a, String str, String str2) {
        super(c3964a);
        this.f22626c = str2;
        this.f22627d = str;
    }

    @Override // za.AbstractC6106j
    /* renamed from: d */
    public String mo24350d() {
        if (m24358c().m15026i() != 84) {
            throw C2678j.m10895a();
        }
        StringBuilder sb2 = new StringBuilder();
        m24353f(sb2, 8);
        m24355j(sb2, 48, 20);
        m24351k(sb2, 68);
        return sb2.toString();
    }

    @Override // za.AbstractC6105i
    /* renamed from: h */
    public void mo24348h(StringBuilder sb2, int i10) {
        sb2.append('(');
        sb2.append(this.f22627d);
        sb2.append(i10 / 100000);
        sb2.append(')');
    }

    @Override // za.AbstractC6105i
    /* renamed from: i */
    public int mo24349i(int i10) {
        return i10 % 100000;
    }

    /* renamed from: k */
    public final void m24351k(StringBuilder sb2, int i10) {
        int m24390f = m24357b().m24390f(i10, 16);
        if (m24390f == 38400) {
            return;
        }
        sb2.append('(');
        sb2.append(this.f22626c);
        sb2.append(')');
        int i11 = m24390f % 32;
        int i12 = m24390f / 32;
        int i13 = (i12 % 12) + 1;
        int i14 = i12 / 12;
        if (i14 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i14);
        if (i13 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i13);
        if (i11 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i11);
    }
}
