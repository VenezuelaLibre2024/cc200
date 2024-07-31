package p350y4;

import p222p5.C4041n0;

/* renamed from: y4.e */
/* loaded from: classes.dex */
public final class C5804e {

    /* renamed from: a */
    public final String f21786a;

    /* renamed from: b */
    public final String f21787b;

    /* renamed from: c */
    public final String f21788c;

    public C5804e(String str, String str2, String str3) {
        this.f21786a = str;
        this.f21787b = str2;
        this.f21788c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5804e.class != obj.getClass()) {
            return false;
        }
        C5804e c5804e = (C5804e) obj;
        return C4041n0.m15449c(this.f21786a, c5804e.f21786a) && C4041n0.m15449c(this.f21787b, c5804e.f21787b) && C4041n0.m15449c(this.f21788c, c5804e.f21788c);
    }

    public int hashCode() {
        int hashCode = this.f21786a.hashCode() * 31;
        String str = this.f21787b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21788c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
