package p034c7;

import p108h6.C2394s;

/* renamed from: c7.c0 */
/* loaded from: classes.dex */
public final class C0648c0 {

    /* renamed from: a */
    public final String f2808a;

    /* renamed from: b */
    public final String f2809b;

    /* renamed from: c */
    public final long f2810c;

    /* renamed from: d */
    public final long f2811d;

    /* renamed from: e */
    public final long f2812e;

    /* renamed from: f */
    public final long f2813f;

    /* renamed from: g */
    public final long f2814g;

    /* renamed from: h */
    public final Long f2815h;

    /* renamed from: i */
    public final Long f2816i;

    /* renamed from: j */
    public final Long f2817j;

    /* renamed from: k */
    public final Boolean f2818k;

    public C0648c0(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9608a(j10 >= 0);
        C2394s.m9608a(j11 >= 0);
        C2394s.m9608a(j12 >= 0);
        C2394s.m9608a(j14 >= 0);
        this.f2808a = str;
        this.f2809b = str2;
        this.f2810c = j10;
        this.f2811d = j11;
        this.f2812e = j12;
        this.f2813f = j13;
        this.f2814g = j14;
        this.f2815h = l10;
        this.f2816i = l11;
        this.f2817j = l12;
        this.f2818k = bool;
    }

    public C0648c0(String str, String str2, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j12, 0L, null, null, null, null);
    }

    /* renamed from: a */
    public final C0648c0 m3115a(long j10) {
        return new C0648c0(this.f2808a, this.f2809b, this.f2810c, this.f2811d, this.f2812e, j10, this.f2814g, this.f2815h, this.f2816i, this.f2817j, this.f2818k);
    }

    /* renamed from: b */
    public final C0648c0 m3116b(long j10, long j11) {
        return new C0648c0(this.f2808a, this.f2809b, this.f2810c, this.f2811d, this.f2812e, this.f2813f, j10, Long.valueOf(j11), this.f2816i, this.f2817j, this.f2818k);
    }

    /* renamed from: c */
    public final C0648c0 m3117c(Long l10, Long l11, Boolean bool) {
        return new C0648c0(this.f2808a, this.f2809b, this.f2810c, this.f2811d, this.f2812e, this.f2813f, this.f2814g, this.f2815h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
