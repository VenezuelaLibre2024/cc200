package p036c9;

import com.google.auto.value.AutoValue;
import p036c9.C0990a;

@AutoValue
/* renamed from: c9.d */
/* loaded from: classes.dex */
public abstract class AbstractC0993d {

    @AutoValue.Builder
    /* renamed from: c9.d$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC0993d mo4149a();

        /* renamed from: b */
        public abstract a mo4150b(AbstractC0995f abstractC0995f);

        /* renamed from: c */
        public abstract a mo4151c(String str);

        /* renamed from: d */
        public abstract a mo4152d(String str);

        /* renamed from: e */
        public abstract a mo4153e(b bVar);

        /* renamed from: f */
        public abstract a mo4154f(String str);
    }

    /* renamed from: c9.d$b */
    /* loaded from: classes.dex */
    public enum b {
        OK,
        BAD_CONFIG
    }

    /* renamed from: a */
    public static a m4181a() {
        return new C0990a.b();
    }

    /* renamed from: b */
    public abstract AbstractC0995f mo4144b();

    /* renamed from: c */
    public abstract String mo4145c();

    /* renamed from: d */
    public abstract String mo4146d();

    /* renamed from: e */
    public abstract b mo4147e();

    /* renamed from: f */
    public abstract String mo4148f();
}
