package p350y4;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p126i7.AbstractC2651u;
import p222p5.C4014a;
import p264s3.C4463m1;
import p334x4.InterfaceC5592f;
import p350y4.AbstractC5810k;

/* renamed from: y4.j */
/* loaded from: classes.dex */
public abstract class AbstractC5809j {

    /* renamed from: a */
    public final long f21808a;

    /* renamed from: b */
    public final C4463m1 f21809b;

    /* renamed from: c */
    public final AbstractC2651u<C5801b> f21810c;

    /* renamed from: d */
    public final long f21811d;

    /* renamed from: e */
    public final List<C5804e> f21812e;

    /* renamed from: f */
    public final List<C5804e> f21813f;

    /* renamed from: g */
    public final List<C5804e> f21814g;

    /* renamed from: h */
    public final C5808i f21815h;

    /* renamed from: y4.j$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC5809j implements InterfaceC5592f {

        /* renamed from: i */
        public final AbstractC5810k.a f21816i;

        public b(long j10, C4463m1 c4463m1, List<C5801b> list, AbstractC5810k.a aVar, List<C5804e> list2, List<C5804e> list3, List<C5804e> list4) {
            super(j10, c4463m1, list, aVar, list2, list3, list4);
            this.f21816i = aVar;
        }

        @Override // p334x4.InterfaceC5592f
        /* renamed from: a */
        public long mo22514a(long j10) {
            return this.f21816i.m23376j(j10);
        }

        @Override // p334x4.InterfaceC5592f
        /* renamed from: b */
        public long mo22515b(long j10, long j11) {
            return this.f21816i.m23374h(j10, j11);
        }

        @Override // p334x4.InterfaceC5592f
        /* renamed from: c */
        public long mo22516c(long j10, long j11) {
            return this.f21816i.m23370d(j10, j11);
        }

        @Override // p334x4.InterfaceC5592f
        /* renamed from: d */
        public long mo22517d(long j10, long j11) {
            return this.f21816i.m23372f(j10, j11);
        }

        @Override // p334x4.InterfaceC5592f
        /* renamed from: e */
        public C5808i mo22518e(long j10) {
            return this.f21816i.mo23377k(this, j10);
        }

        @Override // p334x4.InterfaceC5592f
        /* renamed from: f */
        public long mo22519f(long j10, long j11) {
            return this.f21816i.m23375i(j10, j11);
        }

        @Override // p334x4.InterfaceC5592f
        /* renamed from: g */
        public boolean mo22520g() {
            return this.f21816i.mo23378l();
        }

        @Override // p334x4.InterfaceC5592f
        /* renamed from: h */
        public long mo22521h() {
            return this.f21816i.m23371e();
        }

        @Override // p334x4.InterfaceC5592f
        /* renamed from: i */
        public long mo22522i(long j10) {
            return this.f21816i.mo23373g(j10);
        }

        @Override // p334x4.InterfaceC5592f
        /* renamed from: j */
        public long mo22523j(long j10, long j11) {
            return this.f21816i.m23369c(j10, j11);
        }

        @Override // p350y4.AbstractC5809j
        /* renamed from: k */
        public String mo23363k() {
            return null;
        }

        @Override // p350y4.AbstractC5809j
        /* renamed from: l */
        public InterfaceC5592f mo23364l() {
            return this;
        }

        @Override // p350y4.AbstractC5809j
        /* renamed from: m */
        public C5808i mo23365m() {
            return null;
        }
    }

    /* renamed from: y4.j$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC5809j {

        /* renamed from: i */
        public final Uri f21817i;

        /* renamed from: j */
        public final long f21818j;

        /* renamed from: k */
        public final String f21819k;

        /* renamed from: l */
        public final C5808i f21820l;

        /* renamed from: m */
        public final C5812m f21821m;

        public c(long j10, C4463m1 c4463m1, List<C5801b> list, AbstractC5810k.e eVar, List<C5804e> list2, List<C5804e> list3, List<C5804e> list4, String str, long j11) {
            super(j10, c4463m1, list, eVar, list2, list3, list4);
            this.f21817i = Uri.parse(list.get(0).f21755a);
            C5808i m23379c = eVar.m23379c();
            this.f21820l = m23379c;
            this.f21819k = str;
            this.f21818j = j11;
            this.f21821m = m23379c != null ? null : new C5812m(new C5808i(null, 0L, j11));
        }

        @Override // p350y4.AbstractC5809j
        /* renamed from: k */
        public String mo23363k() {
            return this.f21819k;
        }

        @Override // p350y4.AbstractC5809j
        /* renamed from: l */
        public InterfaceC5592f mo23364l() {
            return this.f21821m;
        }

        @Override // p350y4.AbstractC5809j
        /* renamed from: m */
        public C5808i mo23365m() {
            return this.f21820l;
        }
    }

    public AbstractC5809j(long j10, C4463m1 c4463m1, List<C5801b> list, AbstractC5810k abstractC5810k, List<C5804e> list2, List<C5804e> list3, List<C5804e> list4) {
        C4014a.m15195a(!list.isEmpty());
        this.f21808a = j10;
        this.f21809b = c4463m1;
        this.f21810c = AbstractC2651u.m10768p(list);
        this.f21812e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f21813f = list3;
        this.f21814g = list4;
        this.f21815h = abstractC5810k.mo23367a(this);
        this.f21811d = abstractC5810k.m23368b();
    }

    public /* synthetic */ AbstractC5809j(long j10, C4463m1 c4463m1, List list, AbstractC5810k abstractC5810k, List list2, List list3, List list4, a aVar) {
        this(j10, c4463m1, list, abstractC5810k, list2, list3, list4);
    }

    /* renamed from: o */
    public static AbstractC5809j m23362o(long j10, C4463m1 c4463m1, List<C5801b> list, AbstractC5810k abstractC5810k, List<C5804e> list2, List<C5804e> list3, List<C5804e> list4, String str) {
        if (abstractC5810k instanceof AbstractC5810k.e) {
            return new c(j10, c4463m1, list, (AbstractC5810k.e) abstractC5810k, list2, list3, list4, str, -1L);
        }
        if (abstractC5810k instanceof AbstractC5810k.a) {
            return new b(j10, c4463m1, list, (AbstractC5810k.a) abstractC5810k, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    /* renamed from: k */
    public abstract String mo23363k();

    /* renamed from: l */
    public abstract InterfaceC5592f mo23364l();

    /* renamed from: m */
    public abstract C5808i mo23365m();

    /* renamed from: n */
    public C5808i m23366n() {
        return this.f21815h;
    }
}
