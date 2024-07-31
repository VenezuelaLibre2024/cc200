package p320w6;

import p108h6.C2394s;

/* renamed from: w6.w */
/* loaded from: classes.dex */
public final class C5332w {

    /* renamed from: a */
    public long f20144a = Long.MIN_VALUE;

    /* renamed from: a */
    public final C5332w m21403a(long j10) {
        C2394s.m9609b(j10 >= 0, "intervalMillis can't be negative.");
        this.f20144a = j10;
        return this;
    }

    /* renamed from: b */
    public final C5301g0 m21404b() {
        C2394s.m9623p(this.f20144a != Long.MIN_VALUE, "Must set intervalMillis.");
        return new C5301g0(this.f20144a, true, null, null, null, false, null, 0L, null);
    }
}
