package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.C0421a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p044d2.C1526h;
import p165l2.InterfaceC3406b;
import p165l2.InterfaceC3409e;
import p165l2.InterfaceC3412h;
import p165l2.InterfaceC3415k;
import p165l2.InterfaceC3418n;
import p165l2.InterfaceC3421q;
import p165l2.InterfaceC3424t;
import p202o1.AbstractC3832e;
import p202o1.C3831d;
import p262s1.InterfaceC4388b;
import p262s1.InterfaceC4389c;
import p273t1.C4611c;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends AbstractC3832e {

    /* renamed from: l */
    public static final long f2006l = TimeUnit.DAYS.toMillis(1);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    /* loaded from: classes.dex */
    public class C0418a implements InterfaceC4389c.c {

        /* renamed from: a */
        public final /* synthetic */ Context f2007a;

        public C0418a(Context context) {
            this.f2007a = context;
        }

        @Override // p262s1.InterfaceC4389c.c
        /* renamed from: a */
        public InterfaceC4389c mo2137a(InterfaceC4389c.b bVar) {
            InterfaceC4389c.b.a m16981a = InterfaceC4389c.b.m16981a(this.f2007a);
            m16981a.m16984c(bVar.f16107b).m16983b(bVar.f16108c).m16985d(true);
            return new C4611c().mo2137a(m16981a.m16982a());
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabase$b */
    /* loaded from: classes.dex */
    public class C0419b extends AbstractC3832e.b {
        @Override // p202o1.AbstractC3832e.b
        /* renamed from: c */
        public void mo2138c(InterfaceC4388b interfaceC4388b) {
            super.mo2138c(interfaceC4388b);
            interfaceC4388b.mo16972g();
            try {
                interfaceC4388b.mo16976p(WorkDatabase.m2129w());
                interfaceC4388b.mo16968N();
            } finally {
                interfaceC4388b.mo16971Z();
            }
        }
    }

    /* renamed from: s */
    public static WorkDatabase m2126s(Context context, Executor executor, boolean z10) {
        AbstractC3832e.a m14544a;
        if (z10) {
            m14544a = C3831d.m14546c(context, WorkDatabase.class).m14565c();
        } else {
            m14544a = C3831d.m14544a(context, WorkDatabase.class, C1526h.m6187d());
            m14544a.m14568f(new C0418a(context));
        }
        return (WorkDatabase) m14544a.m14569g(executor).m14563a(m2127u()).m14564b(C0421a.f2016a).m14564b(new C0421a.h(context, 2, 3)).m14564b(C0421a.f2017b).m14564b(C0421a.f2018c).m14564b(new C0421a.h(context, 5, 6)).m14564b(C0421a.f2019d).m14564b(C0421a.f2020e).m14564b(C0421a.f2021f).m14564b(new C0421a.i(context)).m14564b(new C0421a.h(context, 10, 11)).m14564b(C0421a.f2022g).m14567e().m14566d();
    }

    /* renamed from: u */
    public static AbstractC3832e.b m2127u() {
        return new C0419b();
    }

    /* renamed from: v */
    public static long m2128v() {
        return System.currentTimeMillis() - f2006l;
    }

    /* renamed from: w */
    public static String m2129w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + m2128v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* renamed from: A */
    public abstract InterfaceC3418n mo2130A();

    /* renamed from: B */
    public abstract InterfaceC3421q mo2131B();

    /* renamed from: C */
    public abstract InterfaceC3424t mo2132C();

    /* renamed from: t */
    public abstract InterfaceC3406b mo2133t();

    /* renamed from: x */
    public abstract InterfaceC3409e mo2134x();

    /* renamed from: y */
    public abstract InterfaceC3412h mo2135y();

    /* renamed from: z */
    public abstract InterfaceC3415k mo2136z();
}
