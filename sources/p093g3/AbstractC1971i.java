package p093g3;

import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p093g3.C1964b;

@AutoValue
/* renamed from: g3.i */
/* loaded from: classes.dex */
public abstract class AbstractC1971i {

    @AutoValue.Builder
    /* renamed from: g3.i$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public final a m7986a(String str, int i10) {
            mo7946e().put(str, String.valueOf(i10));
            return this;
        }

        /* renamed from: b */
        public final a m7987b(String str, long j10) {
            mo7946e().put(str, String.valueOf(j10));
            return this;
        }

        /* renamed from: c */
        public final a m7988c(String str, String str2) {
            mo7946e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract AbstractC1971i mo7945d();

        /* renamed from: e */
        public abstract Map<String, String> mo7946e();

        /* renamed from: f */
        public abstract a mo7947f(Map<String, String> map);

        /* renamed from: g */
        public abstract a mo7948g(Integer num);

        /* renamed from: h */
        public abstract a mo7949h(C1970h c1970h);

        /* renamed from: i */
        public abstract a mo7950i(long j10);

        /* renamed from: j */
        public abstract a mo7951j(String str);

        /* renamed from: k */
        public abstract a mo7952k(long j10);
    }

    /* renamed from: a */
    public static a m7980a() {
        return new C1964b.b().mo7947f(new HashMap());
    }

    /* renamed from: b */
    public final String m7981b(String str) {
        String str2 = mo7939c().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: c */
    public abstract Map<String, String> mo7939c();

    /* renamed from: d */
    public abstract Integer mo7940d();

    /* renamed from: e */
    public abstract C1970h mo7941e();

    /* renamed from: f */
    public abstract long mo7942f();

    /* renamed from: g */
    public final int m7982g(String str) {
        String str2 = mo7939c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m7983h(String str) {
        String str2 = mo7939c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> m7984i() {
        return Collections.unmodifiableMap(mo7939c());
    }

    /* renamed from: j */
    public abstract String mo7943j();

    /* renamed from: k */
    public abstract long mo7944k();

    /* renamed from: l */
    public a m7985l() {
        return new C1964b.b().mo7951j(mo7943j()).mo7948g(mo7940d()).mo7949h(mo7941e()).mo7950i(mo7942f()).mo7952k(mo7944k()).mo7947f(new HashMap(mo7939c()));
    }
}
