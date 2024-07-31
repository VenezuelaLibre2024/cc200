package p165l2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import p202o1.AbstractC3829b;
import p202o1.AbstractC3832e;
import p202o1.C3835h;
import p232q1.C4124c;
import p262s1.InterfaceC4392f;

/* renamed from: l2.c */
/* loaded from: classes.dex */
public final class C3407c implements InterfaceC3406b {

    /* renamed from: a */
    public final AbstractC3832e f11979a;

    /* renamed from: b */
    public final AbstractC3829b<C3405a> f11980b;

    /* renamed from: l2.c$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC3829b<C3405a> {
        public a(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p202o1.AbstractC3829b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo12715g(InterfaceC4392f interfaceC4392f, C3405a c3405a) {
            String str = c3405a.f11977a;
            if (str == null) {
                interfaceC4392f.mo14596j0(1);
            } else {
                interfaceC4392f.mo14598q(1, str);
            }
            String str2 = c3405a.f11978b;
            if (str2 == null) {
                interfaceC4392f.mo14596j0(2);
            } else {
                interfaceC4392f.mo14598q(2, str2);
            }
        }
    }

    public C3407c(AbstractC3832e abstractC3832e) {
        this.f11979a = abstractC3832e;
        this.f11980b = new a(abstractC3832e);
    }

    @Override // p165l2.InterfaceC3406b
    /* renamed from: a */
    public void mo12710a(C3405a c3405a) {
        this.f11979a.m14549b();
        this.f11979a.m14550c();
        try {
            this.f11980b.m14543h(c3405a);
            this.f11979a.m14562r();
        } finally {
            this.f11979a.m14552g();
        }
    }

    @Override // p165l2.InterfaceC3406b
    /* renamed from: b */
    public List<String> mo12711b(String str) {
        C3835h m14589f = C3835h.m14589f("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            m14589f.mo14596j0(1);
        } else {
            m14589f.mo14598q(1, str);
        }
        this.f11979a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f11979a, m14589f, false, null);
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

    @Override // p165l2.InterfaceC3406b
    /* renamed from: c */
    public boolean mo12712c(String str) {
        C3835h m14589f = C3835h.m14589f("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            m14589f.mo14596j0(1);
        } else {
            m14589f.mo14598q(1, str);
        }
        this.f11979a.m14549b();
        boolean z10 = false;
        Cursor m15901b = C4124c.m15901b(this.f11979a, m14589f, false, null);
        try {
            if (m15901b.moveToFirst()) {
                z10 = m15901b.getInt(0) != 0;
            }
            return z10;
        } finally {
            m15901b.close();
            m14589f.m14597n();
        }
    }

    @Override // p165l2.InterfaceC3406b
    /* renamed from: d */
    public boolean mo12713d(String str) {
        C3835h m14589f = C3835h.m14589f("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            m14589f.mo14596j0(1);
        } else {
            m14589f.mo14598q(1, str);
        }
        this.f11979a.m14549b();
        boolean z10 = false;
        Cursor m15901b = C4124c.m15901b(this.f11979a, m14589f, false, null);
        try {
            if (m15901b.moveToFirst()) {
                z10 = m15901b.getInt(0) != 0;
            }
            return z10;
        } finally {
            m15901b.close();
            m14589f.m14597n();
        }
    }
}
