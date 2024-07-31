package p233q2;

/* renamed from: q2.m */
/* loaded from: classes.dex */
public enum EnumC4143m {
    AV_LOG_STDERR(-16),
    AV_LOG_QUIET(-8),
    AV_LOG_PANIC(0),
    AV_LOG_FATAL(8),
    AV_LOG_ERROR(16),
    AV_LOG_WARNING(24),
    AV_LOG_INFO(32),
    AV_LOG_VERBOSE(40),
    AV_LOG_DEBUG(48),
    AV_LOG_TRACE(56);


    /* renamed from: h */
    public final int f14926h;

    EnumC4143m(int i10) {
        this.f14926h = i10;
    }

    /* renamed from: c */
    public static EnumC4143m m15967c(int i10) {
        EnumC4143m enumC4143m = AV_LOG_STDERR;
        if (i10 == enumC4143m.m15968f()) {
            return enumC4143m;
        }
        EnumC4143m enumC4143m2 = AV_LOG_QUIET;
        if (i10 == enumC4143m2.m15968f()) {
            return enumC4143m2;
        }
        EnumC4143m enumC4143m3 = AV_LOG_PANIC;
        if (i10 == enumC4143m3.m15968f()) {
            return enumC4143m3;
        }
        EnumC4143m enumC4143m4 = AV_LOG_FATAL;
        if (i10 == enumC4143m4.m15968f()) {
            return enumC4143m4;
        }
        EnumC4143m enumC4143m5 = AV_LOG_ERROR;
        if (i10 == enumC4143m5.m15968f()) {
            return enumC4143m5;
        }
        EnumC4143m enumC4143m6 = AV_LOG_WARNING;
        if (i10 == enumC4143m6.m15968f()) {
            return enumC4143m6;
        }
        EnumC4143m enumC4143m7 = AV_LOG_INFO;
        if (i10 == enumC4143m7.m15968f()) {
            return enumC4143m7;
        }
        EnumC4143m enumC4143m8 = AV_LOG_VERBOSE;
        if (i10 == enumC4143m8.m15968f()) {
            return enumC4143m8;
        }
        EnumC4143m enumC4143m9 = AV_LOG_DEBUG;
        return i10 == enumC4143m9.m15968f() ? enumC4143m9 : AV_LOG_TRACE;
    }

    /* renamed from: f */
    public int m15968f() {
        return this.f14926h;
    }
}
