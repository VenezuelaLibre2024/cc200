package p350y4;

import p222p5.C4041n0;

/* renamed from: y4.h */
/* loaded from: classes.dex */
public final class C5807h {

    /* renamed from: a */
    public final String f21799a;

    /* renamed from: b */
    public final String f21800b;

    /* renamed from: c */
    public final String f21801c;

    /* renamed from: d */
    public final String f21802d;

    /* renamed from: e */
    public final String f21803e;

    public C5807h(String str, String str2, String str3, String str4, String str5) {
        this.f21799a = str;
        this.f21800b = str2;
        this.f21801c = str3;
        this.f21802d = str4;
        this.f21803e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5807h)) {
            return false;
        }
        C5807h c5807h = (C5807h) obj;
        return C4041n0.m15449c(this.f21799a, c5807h.f21799a) && C4041n0.m15449c(this.f21800b, c5807h.f21800b) && C4041n0.m15449c(this.f21801c, c5807h.f21801c) && C4041n0.m15449c(this.f21802d, c5807h.f21802d) && C4041n0.m15449c(this.f21803e, c5807h.f21803e);
    }

    public int hashCode() {
        String str = this.f21799a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21800b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f21801c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f21802d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f21803e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
