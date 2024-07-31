package p165l2;

import android.database.Cursor;
import androidx.work.C0417b;
import java.util.ArrayList;
import java.util.List;
import p029c2.C0584b;
import p029c2.C0601s;
import p165l2.C3420p;
import p202o1.AbstractC3829b;
import p202o1.AbstractC3832e;
import p202o1.AbstractC3838k;
import p202o1.C3835h;
import p232q1.C4123b;
import p232q1.C4124c;
import p232q1.C4126e;
import p262s1.InterfaceC4392f;

/* renamed from: l2.r */
/* loaded from: classes.dex */
public final class C3422r implements InterfaceC3421q {

    /* renamed from: a */
    public final AbstractC3832e f12036a;

    /* renamed from: b */
    public final AbstractC3829b<C3420p> f12037b;

    /* renamed from: c */
    public final AbstractC3838k f12038c;

    /* renamed from: d */
    public final AbstractC3838k f12039d;

    /* renamed from: e */
    public final AbstractC3838k f12040e;

    /* renamed from: f */
    public final AbstractC3838k f12041f;

    /* renamed from: g */
    public final AbstractC3838k f12042g;

    /* renamed from: h */
    public final AbstractC3838k f12043h;

    /* renamed from: i */
    public final AbstractC3838k f12044i;

    /* renamed from: j */
    public final AbstractC3838k f12045j;

    /* renamed from: l2.r$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC3829b<C3420p> {
        public a(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p202o1.AbstractC3829b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo12715g(InterfaceC4392f interfaceC4392f, C3420p c3420p) {
            String str = c3420p.f12010a;
            if (str == null) {
                interfaceC4392f.mo14596j0(1);
            } else {
                interfaceC4392f.mo14598q(1, str);
            }
            interfaceC4392f.mo14591M(2, C3426v.m12772j(c3420p.f12011b));
            String str2 = c3420p.f12012c;
            if (str2 == null) {
                interfaceC4392f.mo14596j0(3);
            } else {
                interfaceC4392f.mo14598q(3, str2);
            }
            String str3 = c3420p.f12013d;
            if (str3 == null) {
                interfaceC4392f.mo14596j0(4);
            } else {
                interfaceC4392f.mo14598q(4, str3);
            }
            byte[] m2111n = C0417b.m2111n(c3420p.f12014e);
            if (m2111n == null) {
                interfaceC4392f.mo14596j0(5);
            } else {
                interfaceC4392f.mo14592Q(5, m2111n);
            }
            byte[] m2111n2 = C0417b.m2111n(c3420p.f12015f);
            if (m2111n2 == null) {
                interfaceC4392f.mo14596j0(6);
            } else {
                interfaceC4392f.mo14592Q(6, m2111n2);
            }
            interfaceC4392f.mo14591M(7, c3420p.f12016g);
            interfaceC4392f.mo14591M(8, c3420p.f12017h);
            interfaceC4392f.mo14591M(9, c3420p.f12018i);
            interfaceC4392f.mo14591M(10, c3420p.f12020k);
            interfaceC4392f.mo14591M(11, C3426v.m12763a(c3420p.f12021l));
            interfaceC4392f.mo14591M(12, c3420p.f12022m);
            interfaceC4392f.mo14591M(13, c3420p.f12023n);
            interfaceC4392f.mo14591M(14, c3420p.f12024o);
            interfaceC4392f.mo14591M(15, c3420p.f12025p);
            interfaceC4392f.mo14591M(16, c3420p.f12026q ? 1L : 0L);
            interfaceC4392f.mo14591M(17, C3426v.m12771i(c3420p.f12027r));
            C0584b c0584b = c3420p.f12019j;
            if (c0584b != null) {
                interfaceC4392f.mo14591M(18, C3426v.m12770h(c0584b.m2937b()));
                interfaceC4392f.mo14591M(19, c0584b.m2942g() ? 1L : 0L);
                interfaceC4392f.mo14591M(20, c0584b.m2943h() ? 1L : 0L);
                interfaceC4392f.mo14591M(21, c0584b.m2941f() ? 1L : 0L);
                interfaceC4392f.mo14591M(22, c0584b.m2944i() ? 1L : 0L);
                interfaceC4392f.mo14591M(23, c0584b.m2938c());
                interfaceC4392f.mo14591M(24, c0584b.m2939d());
                byte[] m12765c = C3426v.m12765c(c0584b.m2936a());
                if (m12765c != null) {
                    interfaceC4392f.mo14592Q(25, m12765c);
                    return;
                }
            } else {
                interfaceC4392f.mo14596j0(18);
                interfaceC4392f.mo14596j0(19);
                interfaceC4392f.mo14596j0(20);
                interfaceC4392f.mo14596j0(21);
                interfaceC4392f.mo14596j0(22);
                interfaceC4392f.mo14596j0(23);
                interfaceC4392f.mo14596j0(24);
            }
            interfaceC4392f.mo14596j0(25);
        }
    }

    /* renamed from: l2.r$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC3838k {
        public b(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: l2.r$c */
    /* loaded from: classes.dex */
    public class c extends AbstractC3838k {
        public c(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: l2.r$d */
    /* loaded from: classes.dex */
    public class d extends AbstractC3838k {
        public d(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: l2.r$e */
    /* loaded from: classes.dex */
    public class e extends AbstractC3838k {
        public e(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: l2.r$f */
    /* loaded from: classes.dex */
    public class f extends AbstractC3838k {
        public f(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: l2.r$g */
    /* loaded from: classes.dex */
    public class g extends AbstractC3838k {
        public g(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: l2.r$h */
    /* loaded from: classes.dex */
    public class h extends AbstractC3838k {
        public h(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: l2.r$i */
    /* loaded from: classes.dex */
    public class i extends AbstractC3838k {
        public i(AbstractC3832e abstractC3832e) {
            super(abstractC3832e);
        }

        @Override // p202o1.AbstractC3838k
        /* renamed from: d */
        public String mo12714d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C3422r(AbstractC3832e abstractC3832e) {
        this.f12036a = abstractC3832e;
        this.f12037b = new a(abstractC3832e);
        this.f12038c = new b(abstractC3832e);
        this.f12039d = new c(abstractC3832e);
        this.f12040e = new d(abstractC3832e);
        this.f12041f = new e(abstractC3832e);
        this.f12042g = new f(abstractC3832e);
        this.f12043h = new g(abstractC3832e);
        this.f12044i = new h(abstractC3832e);
        this.f12045j = new i(abstractC3832e);
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: a */
    public void mo12738a(String str) {
        this.f12036a.m14549b();
        InterfaceC4392f m14604a = this.f12038c.m14604a();
        if (str == null) {
            m14604a.mo14596j0(1);
        } else {
            m14604a.mo14598q(1, str);
        }
        this.f12036a.m14550c();
        try {
            m14604a.mo16987s();
            this.f12036a.m14562r();
        } finally {
            this.f12036a.m14552g();
            this.f12038c.m14608f(m14604a);
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: b */
    public int mo12739b(String str, long j10) {
        this.f12036a.m14549b();
        InterfaceC4392f m14604a = this.f12043h.m14604a();
        m14604a.mo14591M(1, j10);
        if (str == null) {
            m14604a.mo14596j0(2);
        } else {
            m14604a.mo14598q(2, str);
        }
        this.f12036a.m14550c();
        try {
            int mo16987s = m14604a.mo16987s();
            this.f12036a.m14562r();
            return mo16987s;
        } finally {
            this.f12036a.m14552g();
            this.f12043h.m14608f(m14604a);
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: c */
    public List<C3420p.b> mo12740c(String str) {
        C3835h m14589f = C3835h.m14589f("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m14589f.mo14596j0(1);
        } else {
            m14589f.mo14598q(1, str);
        }
        this.f12036a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f12036a, m14589f, false, null);
        try {
            int m15899b = C4123b.m15899b(m15901b, "id");
            int m15899b2 = C4123b.m15899b(m15901b, "state");
            ArrayList arrayList = new ArrayList(m15901b.getCount());
            while (m15901b.moveToNext()) {
                C3420p.b bVar = new C3420p.b();
                bVar.f12028a = m15901b.getString(m15899b);
                bVar.f12029b = C3426v.m12769g(m15901b.getInt(m15899b2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            m15901b.close();
            m14589f.m14597n();
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: d */
    public List<C3420p> mo12741d(long j10) {
        C3835h c3835h;
        int m15899b;
        int m15899b2;
        int m15899b3;
        int m15899b4;
        int m15899b5;
        int m15899b6;
        int m15899b7;
        int m15899b8;
        int m15899b9;
        int m15899b10;
        int m15899b11;
        int m15899b12;
        int m15899b13;
        int m15899b14;
        C3835h m14589f = C3835h.m14589f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        m14589f.mo14591M(1, j10);
        this.f12036a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f12036a, m14589f, false, null);
        try {
            m15899b = C4123b.m15899b(m15901b, "required_network_type");
            m15899b2 = C4123b.m15899b(m15901b, "requires_charging");
            m15899b3 = C4123b.m15899b(m15901b, "requires_device_idle");
            m15899b4 = C4123b.m15899b(m15901b, "requires_battery_not_low");
            m15899b5 = C4123b.m15899b(m15901b, "requires_storage_not_low");
            m15899b6 = C4123b.m15899b(m15901b, "trigger_content_update_delay");
            m15899b7 = C4123b.m15899b(m15901b, "trigger_max_content_delay");
            m15899b8 = C4123b.m15899b(m15901b, "content_uri_triggers");
            m15899b9 = C4123b.m15899b(m15901b, "id");
            m15899b10 = C4123b.m15899b(m15901b, "state");
            m15899b11 = C4123b.m15899b(m15901b, "worker_class_name");
            m15899b12 = C4123b.m15899b(m15901b, "input_merger_class_name");
            m15899b13 = C4123b.m15899b(m15901b, "input");
            m15899b14 = C4123b.m15899b(m15901b, "output");
            c3835h = m14589f;
        } catch (Throwable th) {
            th = th;
            c3835h = m14589f;
        }
        try {
            int m15899b15 = C4123b.m15899b(m15901b, "initial_delay");
            int m15899b16 = C4123b.m15899b(m15901b, "interval_duration");
            int m15899b17 = C4123b.m15899b(m15901b, "flex_duration");
            int m15899b18 = C4123b.m15899b(m15901b, "run_attempt_count");
            int m15899b19 = C4123b.m15899b(m15901b, "backoff_policy");
            int m15899b20 = C4123b.m15899b(m15901b, "backoff_delay_duration");
            int m15899b21 = C4123b.m15899b(m15901b, "period_start_time");
            int m15899b22 = C4123b.m15899b(m15901b, "minimum_retention_duration");
            int m15899b23 = C4123b.m15899b(m15901b, "schedule_requested_at");
            int m15899b24 = C4123b.m15899b(m15901b, "run_in_foreground");
            int m15899b25 = C4123b.m15899b(m15901b, "out_of_quota_policy");
            int i10 = m15899b14;
            ArrayList arrayList = new ArrayList(m15901b.getCount());
            while (m15901b.moveToNext()) {
                String string = m15901b.getString(m15899b9);
                int i11 = m15899b9;
                String string2 = m15901b.getString(m15899b11);
                int i12 = m15899b11;
                C0584b c0584b = new C0584b();
                int i13 = m15899b;
                c0584b.m2946k(C3426v.m12767e(m15901b.getInt(m15899b)));
                c0584b.m2948m(m15901b.getInt(m15899b2) != 0);
                c0584b.m2949n(m15901b.getInt(m15899b3) != 0);
                c0584b.m2947l(m15901b.getInt(m15899b4) != 0);
                c0584b.m2950o(m15901b.getInt(m15899b5) != 0);
                int i14 = m15899b2;
                int i15 = m15899b3;
                c0584b.m2951p(m15901b.getLong(m15899b6));
                c0584b.m2952q(m15901b.getLong(m15899b7));
                c0584b.m2945j(C3426v.m12764b(m15901b.getBlob(m15899b8)));
                C3420p c3420p = new C3420p(string, string2);
                c3420p.f12011b = C3426v.m12769g(m15901b.getInt(m15899b10));
                c3420p.f12013d = m15901b.getString(m15899b12);
                c3420p.f12014e = C0417b.m2110g(m15901b.getBlob(m15899b13));
                int i16 = i10;
                c3420p.f12015f = C0417b.m2110g(m15901b.getBlob(i16));
                int i17 = m15899b15;
                i10 = i16;
                c3420p.f12016g = m15901b.getLong(i17);
                int i18 = m15899b12;
                int i19 = m15899b16;
                c3420p.f12017h = m15901b.getLong(i19);
                int i20 = m15899b4;
                int i21 = m15899b17;
                c3420p.f12018i = m15901b.getLong(i21);
                int i22 = m15899b18;
                c3420p.f12020k = m15901b.getInt(i22);
                int i23 = m15899b19;
                c3420p.f12021l = C3426v.m12766d(m15901b.getInt(i23));
                m15899b17 = i21;
                int i24 = m15899b20;
                c3420p.f12022m = m15901b.getLong(i24);
                int i25 = m15899b21;
                c3420p.f12023n = m15901b.getLong(i25);
                m15899b21 = i25;
                int i26 = m15899b22;
                c3420p.f12024o = m15901b.getLong(i26);
                int i27 = m15899b23;
                c3420p.f12025p = m15901b.getLong(i27);
                int i28 = m15899b24;
                c3420p.f12026q = m15901b.getInt(i28) != 0;
                int i29 = m15899b25;
                c3420p.f12027r = C3426v.m12768f(m15901b.getInt(i29));
                c3420p.f12019j = c0584b;
                arrayList.add(c3420p);
                m15899b2 = i14;
                m15899b25 = i29;
                m15899b12 = i18;
                m15899b15 = i17;
                m15899b16 = i19;
                m15899b18 = i22;
                m15899b23 = i27;
                m15899b9 = i11;
                m15899b11 = i12;
                m15899b = i13;
                m15899b24 = i28;
                m15899b22 = i26;
                m15899b3 = i15;
                m15899b20 = i24;
                m15899b4 = i20;
                m15899b19 = i23;
            }
            m15901b.close();
            c3835h.m14597n();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            m15901b.close();
            c3835h.m14597n();
            throw th;
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: e */
    public List<C3420p> mo12742e(int i10) {
        C3835h c3835h;
        int m15899b;
        int m15899b2;
        int m15899b3;
        int m15899b4;
        int m15899b5;
        int m15899b6;
        int m15899b7;
        int m15899b8;
        int m15899b9;
        int m15899b10;
        int m15899b11;
        int m15899b12;
        int m15899b13;
        int m15899b14;
        C3835h m14589f = C3835h.m14589f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        m14589f.mo14591M(1, i10);
        this.f12036a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f12036a, m14589f, false, null);
        try {
            m15899b = C4123b.m15899b(m15901b, "required_network_type");
            m15899b2 = C4123b.m15899b(m15901b, "requires_charging");
            m15899b3 = C4123b.m15899b(m15901b, "requires_device_idle");
            m15899b4 = C4123b.m15899b(m15901b, "requires_battery_not_low");
            m15899b5 = C4123b.m15899b(m15901b, "requires_storage_not_low");
            m15899b6 = C4123b.m15899b(m15901b, "trigger_content_update_delay");
            m15899b7 = C4123b.m15899b(m15901b, "trigger_max_content_delay");
            m15899b8 = C4123b.m15899b(m15901b, "content_uri_triggers");
            m15899b9 = C4123b.m15899b(m15901b, "id");
            m15899b10 = C4123b.m15899b(m15901b, "state");
            m15899b11 = C4123b.m15899b(m15901b, "worker_class_name");
            m15899b12 = C4123b.m15899b(m15901b, "input_merger_class_name");
            m15899b13 = C4123b.m15899b(m15901b, "input");
            m15899b14 = C4123b.m15899b(m15901b, "output");
            c3835h = m14589f;
        } catch (Throwable th) {
            th = th;
            c3835h = m14589f;
        }
        try {
            int m15899b15 = C4123b.m15899b(m15901b, "initial_delay");
            int m15899b16 = C4123b.m15899b(m15901b, "interval_duration");
            int m15899b17 = C4123b.m15899b(m15901b, "flex_duration");
            int m15899b18 = C4123b.m15899b(m15901b, "run_attempt_count");
            int m15899b19 = C4123b.m15899b(m15901b, "backoff_policy");
            int m15899b20 = C4123b.m15899b(m15901b, "backoff_delay_duration");
            int m15899b21 = C4123b.m15899b(m15901b, "period_start_time");
            int m15899b22 = C4123b.m15899b(m15901b, "minimum_retention_duration");
            int m15899b23 = C4123b.m15899b(m15901b, "schedule_requested_at");
            int m15899b24 = C4123b.m15899b(m15901b, "run_in_foreground");
            int m15899b25 = C4123b.m15899b(m15901b, "out_of_quota_policy");
            int i11 = m15899b14;
            ArrayList arrayList = new ArrayList(m15901b.getCount());
            while (m15901b.moveToNext()) {
                String string = m15901b.getString(m15899b9);
                int i12 = m15899b9;
                String string2 = m15901b.getString(m15899b11);
                int i13 = m15899b11;
                C0584b c0584b = new C0584b();
                int i14 = m15899b;
                c0584b.m2946k(C3426v.m12767e(m15901b.getInt(m15899b)));
                c0584b.m2948m(m15901b.getInt(m15899b2) != 0);
                c0584b.m2949n(m15901b.getInt(m15899b3) != 0);
                c0584b.m2947l(m15901b.getInt(m15899b4) != 0);
                c0584b.m2950o(m15901b.getInt(m15899b5) != 0);
                int i15 = m15899b2;
                int i16 = m15899b3;
                c0584b.m2951p(m15901b.getLong(m15899b6));
                c0584b.m2952q(m15901b.getLong(m15899b7));
                c0584b.m2945j(C3426v.m12764b(m15901b.getBlob(m15899b8)));
                C3420p c3420p = new C3420p(string, string2);
                c3420p.f12011b = C3426v.m12769g(m15901b.getInt(m15899b10));
                c3420p.f12013d = m15901b.getString(m15899b12);
                c3420p.f12014e = C0417b.m2110g(m15901b.getBlob(m15899b13));
                int i17 = i11;
                c3420p.f12015f = C0417b.m2110g(m15901b.getBlob(i17));
                i11 = i17;
                int i18 = m15899b15;
                c3420p.f12016g = m15901b.getLong(i18);
                int i19 = m15899b12;
                int i20 = m15899b16;
                c3420p.f12017h = m15901b.getLong(i20);
                int i21 = m15899b4;
                int i22 = m15899b17;
                c3420p.f12018i = m15901b.getLong(i22);
                int i23 = m15899b18;
                c3420p.f12020k = m15901b.getInt(i23);
                int i24 = m15899b19;
                c3420p.f12021l = C3426v.m12766d(m15901b.getInt(i24));
                m15899b17 = i22;
                int i25 = m15899b20;
                c3420p.f12022m = m15901b.getLong(i25);
                int i26 = m15899b21;
                c3420p.f12023n = m15901b.getLong(i26);
                m15899b21 = i26;
                int i27 = m15899b22;
                c3420p.f12024o = m15901b.getLong(i27);
                int i28 = m15899b23;
                c3420p.f12025p = m15901b.getLong(i28);
                int i29 = m15899b24;
                c3420p.f12026q = m15901b.getInt(i29) != 0;
                int i30 = m15899b25;
                c3420p.f12027r = C3426v.m12768f(m15901b.getInt(i30));
                c3420p.f12019j = c0584b;
                arrayList.add(c3420p);
                m15899b25 = i30;
                m15899b2 = i15;
                m15899b12 = i19;
                m15899b15 = i18;
                m15899b16 = i20;
                m15899b18 = i23;
                m15899b23 = i28;
                m15899b9 = i12;
                m15899b11 = i13;
                m15899b = i14;
                m15899b24 = i29;
                m15899b22 = i27;
                m15899b3 = i16;
                m15899b20 = i25;
                m15899b4 = i21;
                m15899b19 = i24;
            }
            m15901b.close();
            c3835h.m14597n();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            m15901b.close();
            c3835h.m14597n();
            throw th;
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: f */
    public List<C3420p> mo12743f() {
        C3835h c3835h;
        int m15899b;
        int m15899b2;
        int m15899b3;
        int m15899b4;
        int m15899b5;
        int m15899b6;
        int m15899b7;
        int m15899b8;
        int m15899b9;
        int m15899b10;
        int m15899b11;
        int m15899b12;
        int m15899b13;
        int m15899b14;
        C3835h m14589f = C3835h.m14589f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f12036a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f12036a, m14589f, false, null);
        try {
            m15899b = C4123b.m15899b(m15901b, "required_network_type");
            m15899b2 = C4123b.m15899b(m15901b, "requires_charging");
            m15899b3 = C4123b.m15899b(m15901b, "requires_device_idle");
            m15899b4 = C4123b.m15899b(m15901b, "requires_battery_not_low");
            m15899b5 = C4123b.m15899b(m15901b, "requires_storage_not_low");
            m15899b6 = C4123b.m15899b(m15901b, "trigger_content_update_delay");
            m15899b7 = C4123b.m15899b(m15901b, "trigger_max_content_delay");
            m15899b8 = C4123b.m15899b(m15901b, "content_uri_triggers");
            m15899b9 = C4123b.m15899b(m15901b, "id");
            m15899b10 = C4123b.m15899b(m15901b, "state");
            m15899b11 = C4123b.m15899b(m15901b, "worker_class_name");
            m15899b12 = C4123b.m15899b(m15901b, "input_merger_class_name");
            m15899b13 = C4123b.m15899b(m15901b, "input");
            m15899b14 = C4123b.m15899b(m15901b, "output");
            c3835h = m14589f;
        } catch (Throwable th) {
            th = th;
            c3835h = m14589f;
        }
        try {
            int m15899b15 = C4123b.m15899b(m15901b, "initial_delay");
            int m15899b16 = C4123b.m15899b(m15901b, "interval_duration");
            int m15899b17 = C4123b.m15899b(m15901b, "flex_duration");
            int m15899b18 = C4123b.m15899b(m15901b, "run_attempt_count");
            int m15899b19 = C4123b.m15899b(m15901b, "backoff_policy");
            int m15899b20 = C4123b.m15899b(m15901b, "backoff_delay_duration");
            int m15899b21 = C4123b.m15899b(m15901b, "period_start_time");
            int m15899b22 = C4123b.m15899b(m15901b, "minimum_retention_duration");
            int m15899b23 = C4123b.m15899b(m15901b, "schedule_requested_at");
            int m15899b24 = C4123b.m15899b(m15901b, "run_in_foreground");
            int m15899b25 = C4123b.m15899b(m15901b, "out_of_quota_policy");
            int i10 = m15899b14;
            ArrayList arrayList = new ArrayList(m15901b.getCount());
            while (m15901b.moveToNext()) {
                String string = m15901b.getString(m15899b9);
                int i11 = m15899b9;
                String string2 = m15901b.getString(m15899b11);
                int i12 = m15899b11;
                C0584b c0584b = new C0584b();
                int i13 = m15899b;
                c0584b.m2946k(C3426v.m12767e(m15901b.getInt(m15899b)));
                c0584b.m2948m(m15901b.getInt(m15899b2) != 0);
                c0584b.m2949n(m15901b.getInt(m15899b3) != 0);
                c0584b.m2947l(m15901b.getInt(m15899b4) != 0);
                c0584b.m2950o(m15901b.getInt(m15899b5) != 0);
                int i14 = m15899b2;
                int i15 = m15899b3;
                c0584b.m2951p(m15901b.getLong(m15899b6));
                c0584b.m2952q(m15901b.getLong(m15899b7));
                c0584b.m2945j(C3426v.m12764b(m15901b.getBlob(m15899b8)));
                C3420p c3420p = new C3420p(string, string2);
                c3420p.f12011b = C3426v.m12769g(m15901b.getInt(m15899b10));
                c3420p.f12013d = m15901b.getString(m15899b12);
                c3420p.f12014e = C0417b.m2110g(m15901b.getBlob(m15899b13));
                int i16 = i10;
                c3420p.f12015f = C0417b.m2110g(m15901b.getBlob(i16));
                i10 = i16;
                int i17 = m15899b15;
                c3420p.f12016g = m15901b.getLong(i17);
                int i18 = m15899b13;
                int i19 = m15899b16;
                c3420p.f12017h = m15901b.getLong(i19);
                int i20 = m15899b4;
                int i21 = m15899b17;
                c3420p.f12018i = m15901b.getLong(i21);
                int i22 = m15899b18;
                c3420p.f12020k = m15901b.getInt(i22);
                int i23 = m15899b19;
                c3420p.f12021l = C3426v.m12766d(m15901b.getInt(i23));
                m15899b17 = i21;
                int i24 = m15899b20;
                c3420p.f12022m = m15901b.getLong(i24);
                int i25 = m15899b21;
                c3420p.f12023n = m15901b.getLong(i25);
                m15899b21 = i25;
                int i26 = m15899b22;
                c3420p.f12024o = m15901b.getLong(i26);
                int i27 = m15899b23;
                c3420p.f12025p = m15901b.getLong(i27);
                int i28 = m15899b24;
                c3420p.f12026q = m15901b.getInt(i28) != 0;
                int i29 = m15899b25;
                c3420p.f12027r = C3426v.m12768f(m15901b.getInt(i29));
                c3420p.f12019j = c0584b;
                arrayList.add(c3420p);
                m15899b25 = i29;
                m15899b2 = i14;
                m15899b13 = i18;
                m15899b15 = i17;
                m15899b16 = i19;
                m15899b18 = i22;
                m15899b23 = i27;
                m15899b9 = i11;
                m15899b11 = i12;
                m15899b = i13;
                m15899b24 = i28;
                m15899b22 = i26;
                m15899b3 = i15;
                m15899b20 = i24;
                m15899b4 = i20;
                m15899b19 = i23;
            }
            m15901b.close();
            c3835h.m14597n();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            m15901b.close();
            c3835h.m14597n();
            throw th;
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: g */
    public void mo12744g(String str, C0417b c0417b) {
        this.f12036a.m14549b();
        InterfaceC4392f m14604a = this.f12039d.m14604a();
        byte[] m2111n = C0417b.m2111n(c0417b);
        if (m2111n == null) {
            m14604a.mo14596j0(1);
        } else {
            m14604a.mo14592Q(1, m2111n);
        }
        if (str == null) {
            m14604a.mo14596j0(2);
        } else {
            m14604a.mo14598q(2, str);
        }
        this.f12036a.m14550c();
        try {
            m14604a.mo16987s();
            this.f12036a.m14562r();
        } finally {
            this.f12036a.m14552g();
            this.f12039d.m14608f(m14604a);
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: h */
    public void mo12745h(C3420p c3420p) {
        this.f12036a.m14549b();
        this.f12036a.m14550c();
        try {
            this.f12037b.m14543h(c3420p);
            this.f12036a.m14562r();
        } finally {
            this.f12036a.m14552g();
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: i */
    public int mo12746i(C0601s.a aVar, String... strArr) {
        this.f12036a.m14549b();
        StringBuilder m15905b = C4126e.m15905b();
        m15905b.append("UPDATE workspec SET state=");
        m15905b.append("?");
        m15905b.append(" WHERE id IN (");
        C4126e.m15904a(m15905b, strArr.length);
        m15905b.append(")");
        InterfaceC4392f m14551d = this.f12036a.m14551d(m15905b.toString());
        m14551d.mo14591M(1, C3426v.m12772j(aVar));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                m14551d.mo14596j0(i10);
            } else {
                m14551d.mo14598q(i10, str);
            }
            i10++;
        }
        this.f12036a.m14550c();
        try {
            int mo16987s = m14551d.mo16987s();
            this.f12036a.m14562r();
            return mo16987s;
        } finally {
            this.f12036a.m14552g();
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: j */
    public List<C3420p> mo12747j() {
        C3835h c3835h;
        int m15899b;
        int m15899b2;
        int m15899b3;
        int m15899b4;
        int m15899b5;
        int m15899b6;
        int m15899b7;
        int m15899b8;
        int m15899b9;
        int m15899b10;
        int m15899b11;
        int m15899b12;
        int m15899b13;
        int m15899b14;
        C3835h m14589f = C3835h.m14589f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f12036a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f12036a, m14589f, false, null);
        try {
            m15899b = C4123b.m15899b(m15901b, "required_network_type");
            m15899b2 = C4123b.m15899b(m15901b, "requires_charging");
            m15899b3 = C4123b.m15899b(m15901b, "requires_device_idle");
            m15899b4 = C4123b.m15899b(m15901b, "requires_battery_not_low");
            m15899b5 = C4123b.m15899b(m15901b, "requires_storage_not_low");
            m15899b6 = C4123b.m15899b(m15901b, "trigger_content_update_delay");
            m15899b7 = C4123b.m15899b(m15901b, "trigger_max_content_delay");
            m15899b8 = C4123b.m15899b(m15901b, "content_uri_triggers");
            m15899b9 = C4123b.m15899b(m15901b, "id");
            m15899b10 = C4123b.m15899b(m15901b, "state");
            m15899b11 = C4123b.m15899b(m15901b, "worker_class_name");
            m15899b12 = C4123b.m15899b(m15901b, "input_merger_class_name");
            m15899b13 = C4123b.m15899b(m15901b, "input");
            m15899b14 = C4123b.m15899b(m15901b, "output");
            c3835h = m14589f;
        } catch (Throwable th) {
            th = th;
            c3835h = m14589f;
        }
        try {
            int m15899b15 = C4123b.m15899b(m15901b, "initial_delay");
            int m15899b16 = C4123b.m15899b(m15901b, "interval_duration");
            int m15899b17 = C4123b.m15899b(m15901b, "flex_duration");
            int m15899b18 = C4123b.m15899b(m15901b, "run_attempt_count");
            int m15899b19 = C4123b.m15899b(m15901b, "backoff_policy");
            int m15899b20 = C4123b.m15899b(m15901b, "backoff_delay_duration");
            int m15899b21 = C4123b.m15899b(m15901b, "period_start_time");
            int m15899b22 = C4123b.m15899b(m15901b, "minimum_retention_duration");
            int m15899b23 = C4123b.m15899b(m15901b, "schedule_requested_at");
            int m15899b24 = C4123b.m15899b(m15901b, "run_in_foreground");
            int m15899b25 = C4123b.m15899b(m15901b, "out_of_quota_policy");
            int i10 = m15899b14;
            ArrayList arrayList = new ArrayList(m15901b.getCount());
            while (m15901b.moveToNext()) {
                String string = m15901b.getString(m15899b9);
                int i11 = m15899b9;
                String string2 = m15901b.getString(m15899b11);
                int i12 = m15899b11;
                C0584b c0584b = new C0584b();
                int i13 = m15899b;
                c0584b.m2946k(C3426v.m12767e(m15901b.getInt(m15899b)));
                c0584b.m2948m(m15901b.getInt(m15899b2) != 0);
                c0584b.m2949n(m15901b.getInt(m15899b3) != 0);
                c0584b.m2947l(m15901b.getInt(m15899b4) != 0);
                c0584b.m2950o(m15901b.getInt(m15899b5) != 0);
                int i14 = m15899b2;
                int i15 = m15899b3;
                c0584b.m2951p(m15901b.getLong(m15899b6));
                c0584b.m2952q(m15901b.getLong(m15899b7));
                c0584b.m2945j(C3426v.m12764b(m15901b.getBlob(m15899b8)));
                C3420p c3420p = new C3420p(string, string2);
                c3420p.f12011b = C3426v.m12769g(m15901b.getInt(m15899b10));
                c3420p.f12013d = m15901b.getString(m15899b12);
                c3420p.f12014e = C0417b.m2110g(m15901b.getBlob(m15899b13));
                int i16 = i10;
                c3420p.f12015f = C0417b.m2110g(m15901b.getBlob(i16));
                i10 = i16;
                int i17 = m15899b15;
                c3420p.f12016g = m15901b.getLong(i17);
                int i18 = m15899b13;
                int i19 = m15899b16;
                c3420p.f12017h = m15901b.getLong(i19);
                int i20 = m15899b4;
                int i21 = m15899b17;
                c3420p.f12018i = m15901b.getLong(i21);
                int i22 = m15899b18;
                c3420p.f12020k = m15901b.getInt(i22);
                int i23 = m15899b19;
                c3420p.f12021l = C3426v.m12766d(m15901b.getInt(i23));
                m15899b17 = i21;
                int i24 = m15899b20;
                c3420p.f12022m = m15901b.getLong(i24);
                int i25 = m15899b21;
                c3420p.f12023n = m15901b.getLong(i25);
                m15899b21 = i25;
                int i26 = m15899b22;
                c3420p.f12024o = m15901b.getLong(i26);
                int i27 = m15899b23;
                c3420p.f12025p = m15901b.getLong(i27);
                int i28 = m15899b24;
                c3420p.f12026q = m15901b.getInt(i28) != 0;
                int i29 = m15899b25;
                c3420p.f12027r = C3426v.m12768f(m15901b.getInt(i29));
                c3420p.f12019j = c0584b;
                arrayList.add(c3420p);
                m15899b25 = i29;
                m15899b2 = i14;
                m15899b13 = i18;
                m15899b15 = i17;
                m15899b16 = i19;
                m15899b18 = i22;
                m15899b23 = i27;
                m15899b9 = i11;
                m15899b11 = i12;
                m15899b = i13;
                m15899b24 = i28;
                m15899b22 = i26;
                m15899b3 = i15;
                m15899b20 = i24;
                m15899b4 = i20;
                m15899b19 = i23;
            }
            m15901b.close();
            c3835h.m14597n();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            m15901b.close();
            c3835h.m14597n();
            throw th;
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: k */
    public boolean mo12748k() {
        boolean z10 = false;
        C3835h m14589f = C3835h.m14589f("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f12036a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f12036a, m14589f, false, null);
        try {
            if (m15901b.moveToFirst()) {
                if (m15901b.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            m15901b.close();
            m14589f.m14597n();
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: l */
    public List<String> mo12749l(String str) {
        C3835h m14589f = C3835h.m14589f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m14589f.mo14596j0(1);
        } else {
            m14589f.mo14598q(1, str);
        }
        this.f12036a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f12036a, m14589f, false, null);
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

    @Override // p165l2.InterfaceC3421q
    /* renamed from: m */
    public C0601s.a mo12750m(String str) {
        C3835h m14589f = C3835h.m14589f("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            m14589f.mo14596j0(1);
        } else {
            m14589f.mo14598q(1, str);
        }
        this.f12036a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f12036a, m14589f, false, null);
        try {
            return m15901b.moveToFirst() ? C3426v.m12769g(m15901b.getInt(0)) : null;
        } finally {
            m15901b.close();
            m14589f.m14597n();
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: n */
    public C3420p mo12751n(String str) {
        C3835h c3835h;
        int m15899b;
        int m15899b2;
        int m15899b3;
        int m15899b4;
        int m15899b5;
        int m15899b6;
        int m15899b7;
        int m15899b8;
        int m15899b9;
        int m15899b10;
        int m15899b11;
        int m15899b12;
        int m15899b13;
        int m15899b14;
        C3420p c3420p;
        C3835h m14589f = C3835h.m14589f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            m14589f.mo14596j0(1);
        } else {
            m14589f.mo14598q(1, str);
        }
        this.f12036a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f12036a, m14589f, false, null);
        try {
            m15899b = C4123b.m15899b(m15901b, "required_network_type");
            m15899b2 = C4123b.m15899b(m15901b, "requires_charging");
            m15899b3 = C4123b.m15899b(m15901b, "requires_device_idle");
            m15899b4 = C4123b.m15899b(m15901b, "requires_battery_not_low");
            m15899b5 = C4123b.m15899b(m15901b, "requires_storage_not_low");
            m15899b6 = C4123b.m15899b(m15901b, "trigger_content_update_delay");
            m15899b7 = C4123b.m15899b(m15901b, "trigger_max_content_delay");
            m15899b8 = C4123b.m15899b(m15901b, "content_uri_triggers");
            m15899b9 = C4123b.m15899b(m15901b, "id");
            m15899b10 = C4123b.m15899b(m15901b, "state");
            m15899b11 = C4123b.m15899b(m15901b, "worker_class_name");
            m15899b12 = C4123b.m15899b(m15901b, "input_merger_class_name");
            m15899b13 = C4123b.m15899b(m15901b, "input");
            m15899b14 = C4123b.m15899b(m15901b, "output");
            c3835h = m14589f;
        } catch (Throwable th) {
            th = th;
            c3835h = m14589f;
        }
        try {
            int m15899b15 = C4123b.m15899b(m15901b, "initial_delay");
            int m15899b16 = C4123b.m15899b(m15901b, "interval_duration");
            int m15899b17 = C4123b.m15899b(m15901b, "flex_duration");
            int m15899b18 = C4123b.m15899b(m15901b, "run_attempt_count");
            int m15899b19 = C4123b.m15899b(m15901b, "backoff_policy");
            int m15899b20 = C4123b.m15899b(m15901b, "backoff_delay_duration");
            int m15899b21 = C4123b.m15899b(m15901b, "period_start_time");
            int m15899b22 = C4123b.m15899b(m15901b, "minimum_retention_duration");
            int m15899b23 = C4123b.m15899b(m15901b, "schedule_requested_at");
            int m15899b24 = C4123b.m15899b(m15901b, "run_in_foreground");
            int m15899b25 = C4123b.m15899b(m15901b, "out_of_quota_policy");
            if (m15901b.moveToFirst()) {
                String string = m15901b.getString(m15899b9);
                String string2 = m15901b.getString(m15899b11);
                C0584b c0584b = new C0584b();
                c0584b.m2946k(C3426v.m12767e(m15901b.getInt(m15899b)));
                c0584b.m2948m(m15901b.getInt(m15899b2) != 0);
                c0584b.m2949n(m15901b.getInt(m15899b3) != 0);
                c0584b.m2947l(m15901b.getInt(m15899b4) != 0);
                c0584b.m2950o(m15901b.getInt(m15899b5) != 0);
                c0584b.m2951p(m15901b.getLong(m15899b6));
                c0584b.m2952q(m15901b.getLong(m15899b7));
                c0584b.m2945j(C3426v.m12764b(m15901b.getBlob(m15899b8)));
                C3420p c3420p2 = new C3420p(string, string2);
                c3420p2.f12011b = C3426v.m12769g(m15901b.getInt(m15899b10));
                c3420p2.f12013d = m15901b.getString(m15899b12);
                c3420p2.f12014e = C0417b.m2110g(m15901b.getBlob(m15899b13));
                c3420p2.f12015f = C0417b.m2110g(m15901b.getBlob(m15899b14));
                c3420p2.f12016g = m15901b.getLong(m15899b15);
                c3420p2.f12017h = m15901b.getLong(m15899b16);
                c3420p2.f12018i = m15901b.getLong(m15899b17);
                c3420p2.f12020k = m15901b.getInt(m15899b18);
                c3420p2.f12021l = C3426v.m12766d(m15901b.getInt(m15899b19));
                c3420p2.f12022m = m15901b.getLong(m15899b20);
                c3420p2.f12023n = m15901b.getLong(m15899b21);
                c3420p2.f12024o = m15901b.getLong(m15899b22);
                c3420p2.f12025p = m15901b.getLong(m15899b23);
                c3420p2.f12026q = m15901b.getInt(m15899b24) != 0;
                c3420p2.f12027r = C3426v.m12768f(m15901b.getInt(m15899b25));
                c3420p2.f12019j = c0584b;
                c3420p = c3420p2;
            } else {
                c3420p = null;
            }
            m15901b.close();
            c3835h.m14597n();
            return c3420p;
        } catch (Throwable th2) {
            th = th2;
            m15901b.close();
            c3835h.m14597n();
            throw th;
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: o */
    public int mo12752o(String str) {
        this.f12036a.m14549b();
        InterfaceC4392f m14604a = this.f12042g.m14604a();
        if (str == null) {
            m14604a.mo14596j0(1);
        } else {
            m14604a.mo14598q(1, str);
        }
        this.f12036a.m14550c();
        try {
            int mo16987s = m14604a.mo16987s();
            this.f12036a.m14562r();
            return mo16987s;
        } finally {
            this.f12036a.m14552g();
            this.f12042g.m14608f(m14604a);
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: p */
    public List<String> mo12753p(String str) {
        C3835h m14589f = C3835h.m14589f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            m14589f.mo14596j0(1);
        } else {
            m14589f.mo14598q(1, str);
        }
        this.f12036a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f12036a, m14589f, false, null);
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

    @Override // p165l2.InterfaceC3421q
    /* renamed from: q */
    public List<C0417b> mo12754q(String str) {
        C3835h m14589f = C3835h.m14589f("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            m14589f.mo14596j0(1);
        } else {
            m14589f.mo14598q(1, str);
        }
        this.f12036a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f12036a, m14589f, false, null);
        try {
            ArrayList arrayList = new ArrayList(m15901b.getCount());
            while (m15901b.moveToNext()) {
                arrayList.add(C0417b.m2110g(m15901b.getBlob(0)));
            }
            return arrayList;
        } finally {
            m15901b.close();
            m14589f.m14597n();
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: r */
    public int mo12755r(String str) {
        this.f12036a.m14549b();
        InterfaceC4392f m14604a = this.f12041f.m14604a();
        if (str == null) {
            m14604a.mo14596j0(1);
        } else {
            m14604a.mo14598q(1, str);
        }
        this.f12036a.m14550c();
        try {
            int mo16987s = m14604a.mo16987s();
            this.f12036a.m14562r();
            return mo16987s;
        } finally {
            this.f12036a.m14552g();
            this.f12041f.m14608f(m14604a);
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: s */
    public void mo12756s(String str, long j10) {
        this.f12036a.m14549b();
        InterfaceC4392f m14604a = this.f12040e.m14604a();
        m14604a.mo14591M(1, j10);
        if (str == null) {
            m14604a.mo14596j0(2);
        } else {
            m14604a.mo14598q(2, str);
        }
        this.f12036a.m14550c();
        try {
            m14604a.mo16987s();
            this.f12036a.m14562r();
        } finally {
            this.f12036a.m14552g();
            this.f12040e.m14608f(m14604a);
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: t */
    public List<C3420p> mo12757t(int i10) {
        C3835h c3835h;
        int m15899b;
        int m15899b2;
        int m15899b3;
        int m15899b4;
        int m15899b5;
        int m15899b6;
        int m15899b7;
        int m15899b8;
        int m15899b9;
        int m15899b10;
        int m15899b11;
        int m15899b12;
        int m15899b13;
        int m15899b14;
        C3835h m14589f = C3835h.m14589f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        m14589f.mo14591M(1, i10);
        this.f12036a.m14549b();
        Cursor m15901b = C4124c.m15901b(this.f12036a, m14589f, false, null);
        try {
            m15899b = C4123b.m15899b(m15901b, "required_network_type");
            m15899b2 = C4123b.m15899b(m15901b, "requires_charging");
            m15899b3 = C4123b.m15899b(m15901b, "requires_device_idle");
            m15899b4 = C4123b.m15899b(m15901b, "requires_battery_not_low");
            m15899b5 = C4123b.m15899b(m15901b, "requires_storage_not_low");
            m15899b6 = C4123b.m15899b(m15901b, "trigger_content_update_delay");
            m15899b7 = C4123b.m15899b(m15901b, "trigger_max_content_delay");
            m15899b8 = C4123b.m15899b(m15901b, "content_uri_triggers");
            m15899b9 = C4123b.m15899b(m15901b, "id");
            m15899b10 = C4123b.m15899b(m15901b, "state");
            m15899b11 = C4123b.m15899b(m15901b, "worker_class_name");
            m15899b12 = C4123b.m15899b(m15901b, "input_merger_class_name");
            m15899b13 = C4123b.m15899b(m15901b, "input");
            m15899b14 = C4123b.m15899b(m15901b, "output");
            c3835h = m14589f;
        } catch (Throwable th) {
            th = th;
            c3835h = m14589f;
        }
        try {
            int m15899b15 = C4123b.m15899b(m15901b, "initial_delay");
            int m15899b16 = C4123b.m15899b(m15901b, "interval_duration");
            int m15899b17 = C4123b.m15899b(m15901b, "flex_duration");
            int m15899b18 = C4123b.m15899b(m15901b, "run_attempt_count");
            int m15899b19 = C4123b.m15899b(m15901b, "backoff_policy");
            int m15899b20 = C4123b.m15899b(m15901b, "backoff_delay_duration");
            int m15899b21 = C4123b.m15899b(m15901b, "period_start_time");
            int m15899b22 = C4123b.m15899b(m15901b, "minimum_retention_duration");
            int m15899b23 = C4123b.m15899b(m15901b, "schedule_requested_at");
            int m15899b24 = C4123b.m15899b(m15901b, "run_in_foreground");
            int m15899b25 = C4123b.m15899b(m15901b, "out_of_quota_policy");
            int i11 = m15899b14;
            ArrayList arrayList = new ArrayList(m15901b.getCount());
            while (m15901b.moveToNext()) {
                String string = m15901b.getString(m15899b9);
                int i12 = m15899b9;
                String string2 = m15901b.getString(m15899b11);
                int i13 = m15899b11;
                C0584b c0584b = new C0584b();
                int i14 = m15899b;
                c0584b.m2946k(C3426v.m12767e(m15901b.getInt(m15899b)));
                c0584b.m2948m(m15901b.getInt(m15899b2) != 0);
                c0584b.m2949n(m15901b.getInt(m15899b3) != 0);
                c0584b.m2947l(m15901b.getInt(m15899b4) != 0);
                c0584b.m2950o(m15901b.getInt(m15899b5) != 0);
                int i15 = m15899b2;
                int i16 = m15899b3;
                c0584b.m2951p(m15901b.getLong(m15899b6));
                c0584b.m2952q(m15901b.getLong(m15899b7));
                c0584b.m2945j(C3426v.m12764b(m15901b.getBlob(m15899b8)));
                C3420p c3420p = new C3420p(string, string2);
                c3420p.f12011b = C3426v.m12769g(m15901b.getInt(m15899b10));
                c3420p.f12013d = m15901b.getString(m15899b12);
                c3420p.f12014e = C0417b.m2110g(m15901b.getBlob(m15899b13));
                int i17 = i11;
                c3420p.f12015f = C0417b.m2110g(m15901b.getBlob(i17));
                i11 = i17;
                int i18 = m15899b15;
                c3420p.f12016g = m15901b.getLong(i18);
                int i19 = m15899b12;
                int i20 = m15899b16;
                c3420p.f12017h = m15901b.getLong(i20);
                int i21 = m15899b4;
                int i22 = m15899b17;
                c3420p.f12018i = m15901b.getLong(i22);
                int i23 = m15899b18;
                c3420p.f12020k = m15901b.getInt(i23);
                int i24 = m15899b19;
                c3420p.f12021l = C3426v.m12766d(m15901b.getInt(i24));
                m15899b17 = i22;
                int i25 = m15899b20;
                c3420p.f12022m = m15901b.getLong(i25);
                int i26 = m15899b21;
                c3420p.f12023n = m15901b.getLong(i26);
                m15899b21 = i26;
                int i27 = m15899b22;
                c3420p.f12024o = m15901b.getLong(i27);
                int i28 = m15899b23;
                c3420p.f12025p = m15901b.getLong(i28);
                int i29 = m15899b24;
                c3420p.f12026q = m15901b.getInt(i29) != 0;
                int i30 = m15899b25;
                c3420p.f12027r = C3426v.m12768f(m15901b.getInt(i30));
                c3420p.f12019j = c0584b;
                arrayList.add(c3420p);
                m15899b25 = i30;
                m15899b2 = i15;
                m15899b12 = i19;
                m15899b15 = i18;
                m15899b16 = i20;
                m15899b18 = i23;
                m15899b23 = i28;
                m15899b9 = i12;
                m15899b11 = i13;
                m15899b = i14;
                m15899b24 = i29;
                m15899b22 = i27;
                m15899b3 = i16;
                m15899b20 = i25;
                m15899b4 = i21;
                m15899b19 = i24;
            }
            m15901b.close();
            c3835h.m14597n();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            m15901b.close();
            c3835h.m14597n();
            throw th;
        }
    }

    @Override // p165l2.InterfaceC3421q
    /* renamed from: u */
    public int mo12758u() {
        this.f12036a.m14549b();
        InterfaceC4392f m14604a = this.f12044i.m14604a();
        this.f12036a.m14550c();
        try {
            int mo16987s = m14604a.mo16987s();
            this.f12036a.m14562r();
            return mo16987s;
        } finally {
            this.f12036a.m14552g();
            this.f12044i.m14608f(m14604a);
        }
    }
}
