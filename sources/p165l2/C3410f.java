package p165l2;

import android.database.Cursor;
import p202o1.AbstractC3829b;
import p202o1.AbstractC3832e;
import p202o1.C3835h;
import p232q1.C4124c;
import p262s1.InterfaceC4392f;

/* renamed from: l2.f */
/* loaded from: classes.dex */
public final class C3410f implements InterfaceC3409e {

    /* renamed from: a */
    public final AbstractC3832e f11984a;

    /* renamed from: b */
    public final AbstractC3829b<C3408d> f11985b;

    /* renamed from: l2.f$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC3829b<C3408d> {
        public a(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // p202o1.AbstractC3829b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo12715g(InterfaceC4392f interfaceC4392f, C3408d c3408d) {
            String str = c3408d.f11982a;
            if (str == null) {
                interfaceC4392f.mo14596j0(1);
            } else {
                interfaceC4392f.mo14598q(1, str);
            }
            Long l10 = c3408d.f11983b;
            if (l10 == null) {
                interfaceC4392f.mo14596j0(2);
            } else {
                interfaceC4392f.mo14591M(2, l10.longValue());
            }
        }
    }

    public C3410f(AbstractC3832e abstractC3832e) {
        this.f11984a = abstractC3832e;
        this.f11985b = new a(abstractC3832e);
    }

    @Override // p165l2.InterfaceC3409e
    /* renamed from: a */
    public void mo12717a(C3408d c3408d) {
        this.f11984a.m14549b();
        this.f11984a.m14550c();
        try {
            this.f11985b.m14543h(c3408d);
            this.f11984a.m14562r();
        } finally {
            this.f11984a.m14552g();
        }
    }

    @Override // p165l2.InterfaceC3409e
    /* renamed from: b */
    public Long mo12718b(String str) {
        C3835h m14589f = C3835h.m14589f("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            m14589f.mo14596j0(1);
        } else {
            m14589f.mo14598q(1, str);
        }
        this.f11984a.m14549b();
        Long l10 = null;
        Cursor m15901b = C4124c.m15901b(this.f11984a, m14589f, false, null);
        try {
            if (m15901b.moveToFirst() && !m15901b.isNull(0)) {
                l10 = Long.valueOf(m15901b.getLong(0));
            }
            return l10;
        } finally {
            m15901b.close();
            m14589f.m14597n();
        }
    }
}
