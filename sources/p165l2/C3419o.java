package p165l2;

import androidx.work.C0417b;
import p202o1.AbstractC3829b;
import p202o1.AbstractC3832e;
import p202o1.AbstractC3838k;
import p262s1.InterfaceC4392f;

/* renamed from: l2.o */
/* loaded from: classes.dex */
public final class C3419o implements InterfaceC3418n {

    /* renamed from: a */
    public final AbstractC3832e f12001a;

    /* renamed from: b */
    public final AbstractC3829b<C3417m> f12002b;

    /* renamed from: c */
    public final AbstractC3838k f12003c;

    /* renamed from: d */
    public final AbstractC3838k f12004d;

    /* renamed from: l2.o$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC3829b<C3417m> {
        public a(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p202o1.AbstractC3829b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo12715g(InterfaceC4392f interfaceC4392f, C3417m c3417m) {
            String str = c3417m.f11999a;
            if (str == null) {
                interfaceC4392f.mo14596j0(1);
            } else {
                interfaceC4392f.mo14598q(1, str);
            }
            byte[] m2111n = C0417b.m2111n(c3417m.f12000b);
            if (m2111n == null) {
                interfaceC4392f.mo14596j0(2);
            } else {
                interfaceC4392f.mo14592Q(2, m2111n);
            }
        }
    }

    /* renamed from: l2.o$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC3838k {
        public b(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: l2.o$c */
    /* loaded from: classes.dex */
    public class c extends AbstractC3838k {
        public c(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C3419o(AbstractC3832e abstractC3832e) {
        this.f12001a = abstractC3832e;
        this.f12002b = new a(abstractC3832e);
        this.f12003c = new b(abstractC3832e);
        this.f12004d = new c(abstractC3832e);
    }

    @Override // p165l2.InterfaceC3418n
    /* renamed from: a */
    public void mo12728a(String str) {
        this.f12001a.m14549b();
        InterfaceC4392f m14604a = this.f12003c.m14604a();
        if (str == null) {
            m14604a.mo14596j0(1);
        } else {
            m14604a.mo14598q(1, str);
        }
        this.f12001a.m14550c();
        try {
            m14604a.mo16987s();
            this.f12001a.m14562r();
        } finally {
            this.f12001a.m14552g();
            this.f12003c.m14608f(m14604a);
        }
    }

    @Override // p165l2.InterfaceC3418n
    /* renamed from: b */
    public void mo12729b() {
        this.f12001a.m14549b();
        InterfaceC4392f m14604a = this.f12004d.m14604a();
        this.f12001a.m14550c();
        try {
            m14604a.mo16987s();
            this.f12001a.m14562r();
        } finally {
            this.f12001a.m14552g();
            this.f12004d.m14608f(m14604a);
        }
    }
}
