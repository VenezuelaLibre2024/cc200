package p165l2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p202o1.AbstractC3829b;
import p202o1.AbstractC3832e;
import p202o1.AbstractC3838k;
import p202o1.C3835h;
import p232q1.C4123b;
import p232q1.C4124c;
import p262s1.InterfaceC4392f;

/* renamed from: l2.i */
/* loaded from: classes.dex */
public final class C3413i implements InterfaceC3412h {

    /* renamed from: a */
    public final AbstractC3832e f11989a;

    /* renamed from: b */
    public final AbstractC3829b<C3411g> f11990b;

    /* renamed from: c */
    public final AbstractC3838k f11991c;

    /* renamed from: l2.i$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC3829b<C3411g> {
        public a(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // p202o1.AbstractC3829b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo12715g(InterfaceC4392f interfaceC4392f, C3411g c3411g) {
            String str = c3411g.f11987a;
            if (str == null) {
                interfaceC4392f.mo14596j0(1);
            } else {
                interfaceC4392f.mo14598q(1, str);
            }
            interfaceC4392f.mo14591M(2, c3411g.f11988b);
        }
    }

    /* renamed from: l2.i$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC3838k {
        public b(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C3413i(AbstractC3832e abstractC3832e) {
        this.f11989a = abstractC3832e;
        this.f11990b = new a(abstractC3832e);
        this.f11991c = new b(abstractC3832e);
    }

    @Override // p165l2.InterfaceC3412h
    /* renamed from: a */
    public List<String> mo12720a() {
        C3835h m14589f = C3835h.m14589f("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f11989a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f11989a, m14589f, false, null);
        try {
            ArrayList arrayList = new ArrayList(m15901b.getCount());
            while (m15901b.moveToNext()) {
                arrayList.add(m15901b.getString(0));
            }
            return arrayList;
        } finally {
            m15901b.close();
            m14589f.m14597n();
        }
    }

    @Override // p165l2.InterfaceC3412h
    /* renamed from: b */
    public void mo12721b(C3411g c3411g) {
        this.f11989a.m14549b();
        this.f11989a.m14550c();
        try {
            this.f11990b.m14543h(c3411g);
            this.f11989a.m14562r();
        } finally {
            this.f11989a.m14552g();
        }
    }

    @Override // p165l2.InterfaceC3412h
    /* renamed from: c */
    public C3411g mo12722c(String str) {
        C3835h m14589f = C3835h.m14589f("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            m14589f.mo14596j0(1);
        } else {
            m14589f.mo14598q(1, str);
        }
        this.f11989a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f11989a, m14589f, false, null);
        try {
            return m15901b.moveToFirst() ? new C3411g(m15901b.getString(C4123b.m15899b(m15901b, "work_spec_id")), m15901b.getInt(C4123b.m15899b(m15901b, "system_id"))) : null;
        } finally {
            m15901b.close();
            m14589f.m14597n();
        }
    }

    @Override // p165l2.InterfaceC3412h
    /* renamed from: d */
    public void mo12723d(String str) {
        this.f11989a.m14549b();
        InterfaceC4392f m14604a = this.f11991c.m14604a();
        if (str == null) {
            m14604a.mo14596j0(1);
        } else {
            m14604a.mo14598q(1, str);
        }
        this.f11989a.m14550c();
        try {
            m14604a.mo16987s();
            this.f11989a.m14562r();
        } finally {
            this.f11989a.m14552g();
            this.f11991c.m14608f(m14604a);
        }
    }
}
