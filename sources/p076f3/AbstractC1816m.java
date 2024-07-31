package p076f3;

import com.google.auto.value.AutoValue;
import java.util.List;
import p076f3.C1810g;

@AutoValue
/* renamed from: f3.m */
/* loaded from: classes.dex */
public abstract class AbstractC1816m {

    @AutoValue.Builder
    /* renamed from: f3.m$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC1816m mo7359a();

        /* renamed from: b */
        public abstract a mo7360b(AbstractC1814k abstractC1814k);

        /* renamed from: c */
        public abstract a mo7361c(List<AbstractC1815l> list);

        /* renamed from: d */
        public abstract a mo7362d(Integer num);

        /* renamed from: e */
        public abstract a mo7363e(String str);

        /* renamed from: f */
        public abstract a mo7364f(EnumC1819p enumC1819p);

        /* renamed from: g */
        public abstract a mo7365g(long j10);

        /* renamed from: h */
        public abstract a mo7366h(long j10);

        /* renamed from: i */
        public a m7380i(int i10) {
            return mo7362d(Integer.valueOf(i10));
        }

        /* renamed from: j */
        public a m7381j(String str) {
            return mo7363e(str);
        }
    }

    /* renamed from: a */
    public static a m7379a() {
        return new C1810g.b();
    }

    /* renamed from: b */
    public abstract AbstractC1814k mo7352b();

    /* renamed from: c */
    public abstract List<AbstractC1815l> mo7353c();

    /* renamed from: d */
    public abstract Integer mo7354d();

    /* renamed from: e */
    public abstract String mo7355e();

    /* renamed from: f */
    public abstract EnumC1819p mo7356f();

    /* renamed from: g */
    public abstract long mo7357g();

    /* renamed from: h */
    public abstract long mo7358h();
}
