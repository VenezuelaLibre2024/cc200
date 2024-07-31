package p006a4;

import java.util.Objects;
import p333x3.AbstractC5556a;
import p333x3.C5577q;
import p333x3.C5580t;
import p333x3.InterfaceC5572l;

/* renamed from: a4.b */
/* loaded from: classes.dex */
public final class C0044b extends AbstractC5556a {

    /* renamed from: a4.b$b */
    /* loaded from: classes.dex */
    public static final class b implements AbstractC5556a.f {

        /* renamed from: a */
        public final C5580t f75a;

        /* renamed from: b */
        public final int f76b;

        /* renamed from: c */
        public final C5577q.a f77c;

        public b(C5580t c5580t, int i10) {
            this.f75a = c5580t;
            this.f76b = i10;
            this.f77c = new C5577q.a();
        }

        @Override // p333x3.AbstractC5556a.f
        /* renamed from: a */
        public AbstractC5556a.e mo159a(InterfaceC5572l interfaceC5572l, long j10) {
            long position = interfaceC5572l.getPosition();
            long m160c = m160c(interfaceC5572l);
            long mo3030f = interfaceC5572l.mo3030f();
            interfaceC5572l.mo22425h(Math.max(6, this.f75a.f20941c));
            long m160c2 = m160c(interfaceC5572l);
            return (m160c > j10 || m160c2 <= j10) ? m160c2 <= j10 ? AbstractC5556a.e.m22403f(m160c2, interfaceC5572l.mo3030f()) : AbstractC5556a.e.m22401d(m160c, position) : AbstractC5556a.e.m22402e(mo3030f);
        }

        /* renamed from: c */
        public final long m160c(InterfaceC5572l interfaceC5572l) {
            while (interfaceC5572l.mo3030f() < interfaceC5572l.mo3029b() - 6 && !C5577q.m22474h(interfaceC5572l, this.f75a, this.f76b, this.f77c)) {
                interfaceC5572l.mo22425h(1);
            }
            if (interfaceC5572l.mo3030f() < interfaceC5572l.mo3029b() - 6) {
                return this.f77c.f20935a;
            }
            interfaceC5572l.mo22425h((int) (interfaceC5572l.mo3029b() - interfaceC5572l.mo3030f()));
            return this.f75a.f20948j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0044b(final C5580t c5580t, int i10, long j10, long j11) {
        super(new AbstractC5556a.d() { // from class: a4.a
            @Override // p333x3.AbstractC5556a.d
            /* renamed from: a */
            public final long mo158a(long j12) {
                return C5580t.this.m22497i(j12);
            }
        }, new b(c5580t, i10), c5580t.m22494f(), 0L, c5580t.f20948j, j10, j11, c5580t.m22493d(), Math.max(6, c5580t.f20941c));
        Objects.requireNonNull(c5580t);
    }
}
