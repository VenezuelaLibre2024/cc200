package be;

import java.util.concurrent.TimeUnit;

/* renamed from: be.d */
/* loaded from: classes2.dex */
public enum EnumC0553d {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* renamed from: h */
    public final TimeUnit f2493h;

    EnumC0553d(TimeUnit timeUnit) {
        this.f2493h = timeUnit;
    }

    /* renamed from: c */
    public final TimeUnit m2783c() {
        return this.f2493h;
    }
}
