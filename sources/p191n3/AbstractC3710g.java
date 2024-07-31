package p191n3;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p045d3.EnumC1533e;
import p191n3.C3707d;
import p234q3.InterfaceC4157a;

@AutoValue
/* renamed from: n3.g */
/* loaded from: classes.dex */
public abstract class AbstractC3710g {

    /* renamed from: n3.g$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public InterfaceC4157a f13220a;

        /* renamed from: b */
        public Map<EnumC1533e, b> f13221b = new HashMap();

        /* renamed from: a */
        public a m14005a(EnumC1533e enumC1533e, b bVar) {
            this.f13221b.put(enumC1533e, bVar);
            return this;
        }

        /* renamed from: b */
        public AbstractC3710g m14006b() {
            Objects.requireNonNull(this.f13220a, "missing required property: clock");
            if (this.f13221b.keySet().size() < EnumC1533e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<EnumC1533e, b> map = this.f13221b;
            this.f13221b = new HashMap();
            return AbstractC3710g.m13998d(this.f13220a, map);
        }

        /* renamed from: c */
        public a m14007c(InterfaceC4157a interfaceC4157a) {
            this.f13220a = interfaceC4157a;
            return this;
        }
    }

    @AutoValue
    /* renamed from: n3.g$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        @AutoValue.Builder
        /* renamed from: n3.g$b$a */
        /* loaded from: classes.dex */
        public static abstract class a {
            /* renamed from: a */
            public abstract b mo13991a();

            /* renamed from: b */
            public abstract a mo13992b(long j10);

            /* renamed from: c */
            public abstract a mo13993c(Set<c> set);

            /* renamed from: d */
            public abstract a mo13994d(long j10);
        }

        /* renamed from: a */
        public static a m14008a() {
            return new C3707d.b().mo13993c(Collections.emptySet());
        }

        /* renamed from: b */
        public abstract long mo13988b();

        /* renamed from: c */
        public abstract Set<c> mo13989c();

        /* renamed from: d */
        public abstract long mo13990d();
    }

    /* renamed from: n3.g$c */
    /* loaded from: classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: b */
    public static a m13997b() {
        return new a();
    }

    /* renamed from: d */
    public static AbstractC3710g m13998d(InterfaceC4157a interfaceC4157a, Map<EnumC1533e, b> map) {
        return new C3706c(interfaceC4157a, map);
    }

    /* renamed from: f */
    public static AbstractC3710g m13999f(InterfaceC4157a interfaceC4157a) {
        return m13997b().m14005a(EnumC1533e.DEFAULT, b.m14008a().mo13992b(30000L).mo13994d(86400000L).mo13991a()).m14005a(EnumC1533e.HIGHEST, b.m14008a().mo13992b(1000L).mo13994d(86400000L).mo13991a()).m14005a(EnumC1533e.VERY_LOW, b.m14008a().mo13992b(86400000L).mo13994d(86400000L).mo13993c(m14000i(c.DEVICE_IDLE)).mo13991a()).m14007c(interfaceC4157a).m14006b();
    }

    /* renamed from: i */
    public static <T> Set<T> m14000i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: a */
    public final long m14001a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r7)));
    }

    /* renamed from: c */
    public JobInfo.Builder m14002c(JobInfo.Builder builder, EnumC1533e enumC1533e, long j10, int i10) {
        builder.setMinimumLatency(m14003g(enumC1533e, j10, i10));
        m14004j(builder, mo13987h().get(enumC1533e).mo13989c());
        return builder;
    }

    /* renamed from: e */
    public abstract InterfaceC4157a mo13986e();

    /* renamed from: g */
    public long m14003g(EnumC1533e enumC1533e, long j10, int i10) {
        long mo16002a = j10 - mo13986e().mo16002a();
        b bVar = mo13987h().get(enumC1533e);
        return Math.min(Math.max(m14001a(i10, bVar.mo13988b()), mo16002a), bVar.mo13990d());
    }

    /* renamed from: h */
    public abstract Map<EnumC1533e, b> mo13987h();

    /* renamed from: j */
    public final void m14004j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
