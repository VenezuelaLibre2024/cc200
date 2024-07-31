package p088ff;

import io.flutter.plugins.urllauncher.WebViewActivity;
import td.C4753m;

/* renamed from: ff.b */
/* loaded from: classes2.dex */
public final class C1923b {

    /* renamed from: a */
    public int f7284a;

    /* renamed from: b */
    public String f7285b;

    /* renamed from: c */
    public EnumC1922a f7286c;

    /* renamed from: d */
    public int f7287d;

    /* renamed from: e */
    public String f7288e;

    /* renamed from: f */
    public String f7289f;

    /* renamed from: g */
    public String f7290g;

    /* renamed from: h */
    public String f7291h;

    /* renamed from: i */
    public String f7292i;

    /* renamed from: j */
    public boolean f7293j;

    /* renamed from: k */
    public boolean f7294k;

    /* renamed from: l */
    public boolean f7295l;

    /* renamed from: m */
    public long f7296m;

    /* renamed from: n */
    public boolean f7297n;

    /* renamed from: o */
    public boolean f7298o;

    public C1923b(int i10, String str, EnumC1922a enumC1922a, int i11, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, boolean z12, long j10, boolean z13, boolean z14) {
        C4753m.m18653f(str, "taskId");
        C4753m.m18653f(enumC1922a, "status");
        C4753m.m18653f(str2, WebViewActivity.URL_EXTRA);
        C4753m.m18653f(str4, "savedDir");
        C4753m.m18653f(str5, "headers");
        C4753m.m18653f(str6, "mimeType");
        this.f7284a = i10;
        this.f7285b = str;
        this.f7286c = enumC1922a;
        this.f7287d = i11;
        this.f7288e = str2;
        this.f7289f = str3;
        this.f7290g = str4;
        this.f7291h = str5;
        this.f7292i = str6;
        this.f7293j = z10;
        this.f7294k = z11;
        this.f7295l = z12;
        this.f7296m = j10;
        this.f7297n = z13;
        this.f7298o = z14;
    }

    /* renamed from: a */
    public final boolean m7817a() {
        return this.f7298o;
    }

    /* renamed from: b */
    public final String m7818b() {
        return this.f7289f;
    }

    /* renamed from: c */
    public final String m7819c() {
        return this.f7291h;
    }

    /* renamed from: d */
    public final String m7820d() {
        return this.f7292i;
    }

    /* renamed from: e */
    public final boolean m7821e() {
        return this.f7295l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1923b)) {
            return false;
        }
        C1923b c1923b = (C1923b) obj;
        return this.f7284a == c1923b.f7284a && C4753m.m18648a(this.f7285b, c1923b.f7285b) && this.f7286c == c1923b.f7286c && this.f7287d == c1923b.f7287d && C4753m.m18648a(this.f7288e, c1923b.f7288e) && C4753m.m18648a(this.f7289f, c1923b.f7289f) && C4753m.m18648a(this.f7290g, c1923b.f7290g) && C4753m.m18648a(this.f7291h, c1923b.f7291h) && C4753m.m18648a(this.f7292i, c1923b.f7292i) && this.f7293j == c1923b.f7293j && this.f7294k == c1923b.f7294k && this.f7295l == c1923b.f7295l && this.f7296m == c1923b.f7296m && this.f7297n == c1923b.f7297n && this.f7298o == c1923b.f7298o;
    }

    /* renamed from: f */
    public final int m7822f() {
        return this.f7284a;
    }

    /* renamed from: g */
    public final int m7823g() {
        return this.f7287d;
    }

    /* renamed from: h */
    public final boolean m7824h() {
        return this.f7293j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f7284a) * 31) + this.f7285b.hashCode()) * 31) + this.f7286c.hashCode()) * 31) + Integer.hashCode(this.f7287d)) * 31) + this.f7288e.hashCode()) * 31;
        String str = this.f7289f;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f7290g.hashCode()) * 31) + this.f7291h.hashCode()) * 31) + this.f7292i.hashCode()) * 31;
        boolean z10 = this.f7293j;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z11 = this.f7294k;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f7295l;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int hashCode3 = (((i13 + i14) * 31) + Long.hashCode(this.f7296m)) * 31;
        boolean z13 = this.f7297n;
        int i15 = z13;
        if (z13 != 0) {
            i15 = 1;
        }
        int i16 = (hashCode3 + i15) * 31;
        boolean z14 = this.f7298o;
        return i16 + (z14 ? 1 : z14 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean m7825i() {
        return this.f7297n;
    }

    /* renamed from: j */
    public final String m7826j() {
        return this.f7290g;
    }

    /* renamed from: k */
    public final boolean m7827k() {
        return this.f7294k;
    }

    /* renamed from: l */
    public final EnumC1922a m7828l() {
        return this.f7286c;
    }

    /* renamed from: m */
    public final String m7829m() {
        return this.f7285b;
    }

    /* renamed from: n */
    public final long m7830n() {
        return this.f7296m;
    }

    /* renamed from: o */
    public final String m7831o() {
        return this.f7288e;
    }

    public String toString() {
        return "DownloadTask(primaryId=" + this.f7284a + ", taskId=" + this.f7285b + ", status=" + this.f7286c + ", progress=" + this.f7287d + ", url=" + this.f7288e + ", filename=" + this.f7289f + ", savedDir=" + this.f7290g + ", headers=" + this.f7291h + ", mimeType=" + this.f7292i + ", resumable=" + this.f7293j + ", showNotification=" + this.f7294k + ", openFileFromNotification=" + this.f7295l + ", timeCreated=" + this.f7296m + ", saveInPublicStorage=" + this.f7297n + ", allowCellular=" + this.f7298o + ')';
    }
}
