package p036c9;

import com.google.auto.value.AutoValue;
import p036c9.C0991b;

@AutoValue
/* renamed from: c9.f */
/* loaded from: classes.dex */
public abstract class AbstractC0995f {

    @AutoValue.Builder
    /* renamed from: c9.f$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC0995f mo4158a();

        /* renamed from: b */
        public abstract a mo4159b(b bVar);

        /* renamed from: c */
        public abstract a mo4160c(String str);

        /* renamed from: d */
        public abstract a mo4161d(long j10);
    }

    /* renamed from: c9.f$b */
    /* loaded from: classes.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public static a m4188a() {
        return new C0991b.b().mo4161d(0L);
    }

    /* renamed from: b */
    public abstract b mo4155b();

    /* renamed from: c */
    public abstract String mo4156c();

    /* renamed from: d */
    public abstract long mo4157d();
}
