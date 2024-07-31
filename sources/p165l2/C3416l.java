package p165l2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p202o1.AbstractC3829b;
import p202o1.AbstractC3832e;
import p202o1.C3835h;
import p232q1.C4124c;
import p262s1.InterfaceC4392f;

/* renamed from: l2.l */
/* loaded from: classes.dex */
public final class C3416l implements InterfaceC3415k {

    /* renamed from: a */
    public final AbstractC3832e f11996a;

    /* renamed from: b */
    public final AbstractC3829b<C3414j> f11997b;

    /* renamed from: l2.l$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC3829b<C3414j> {
        public a(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p202o1.AbstractC3829b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo12715g(InterfaceC4392f interfaceC4392f, C3414j c3414j) {
            String str = c3414j.f11994a;
            if (str == null) {
                interfaceC4392f.mo14596j0(1);
            } else {
                interfaceC4392f.mo14598q(1, str);
            }
            String str2 = c3414j.f11995b;
            if (str2 == null) {
                interfaceC4392f.mo14596j0(2);
            } else {
                interfaceC4392f.mo14598q(2, str2);
            }
        }
    }

    public C3416l(AbstractC3832e abstractC3832e) {
        this.f11996a = abstractC3832e;
        this.f11997b = new a(abstractC3832e);
    }

    @Override // p165l2.InterfaceC3415k
    /* renamed from: a */
    public void mo12725a(C3414j c3414j) {
        this.f11996a.m14549b();
        this.f11996a.m14550c();
        try {
            this.f11997b.m14543h(c3414j);
            this.f11996a.m14562r();
        } finally {
            this.f11996a.m14552g();
        }
    }

    @Override // p165l2.InterfaceC3415k
    /* renamed from: b */
    public List<String> mo12726b(String str) {
        C3835h m14589f = C3835h.m14589f("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            m14589f.mo14596j0(1);
        } else {
            m14589f.mo14598q(1, str);
        }
        this.f11996a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f11996a, m14589f, false, null);
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
}
