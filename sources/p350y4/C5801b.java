package p350y4;

import p109h7.C2428k;

/* renamed from: y4.b */
/* loaded from: classes.dex */
public final class C5801b {

    /* renamed from: a */
    public final String f21755a;

    /* renamed from: b */
    public final String f21756b;

    /* renamed from: c */
    public final int f21757c;

    /* renamed from: d */
    public final int f21758d;

    public C5801b(String str, String str2, int i10, int i11) {
        this.f21755a = str;
        this.f21756b = str2;
        this.f21757c = i10;
        this.f21758d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5801b)) {
            return false;
        }
        C5801b c5801b = (C5801b) obj;
        return this.f21757c == c5801b.f21757c && this.f21758d == c5801b.f21758d && C2428k.m9688a(this.f21755a, c5801b.f21755a) && C2428k.m9688a(this.f21756b, c5801b.f21756b);
    }

    public int hashCode() {
        return C2428k.m9689b(this.f21755a, this.f21756b, Integer.valueOf(this.f21757c), Integer.valueOf(this.f21758d));
    }
}
