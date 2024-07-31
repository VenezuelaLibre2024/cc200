package androidx.work.impl;

import androidx.room.C0391c;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p165l2.C3407c;
import p165l2.C3410f;
import p165l2.C3413i;
import p165l2.C3416l;
import p165l2.C3419o;
import p165l2.C3422r;
import p165l2.C3425u;
import p165l2.InterfaceC3406b;
import p165l2.InterfaceC3409e;
import p165l2.InterfaceC3412h;
import p165l2.InterfaceC3415k;
import p165l2.InterfaceC3418n;
import p165l2.InterfaceC3421q;
import p165l2.InterfaceC3424t;
import p202o1.AbstractC3832e;
import p202o1.C3828a;
import p202o1.C3834g;
import p232q1.C4124c;
import p232q1.C4127f;
import p262s1.InterfaceC4388b;
import p262s1.InterfaceC4389c;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m */
    public volatile InterfaceC3421q f2008m;

    /* renamed from: n */
    public volatile InterfaceC3406b f2009n;

    /* renamed from: o */
    public volatile InterfaceC3424t f2010o;

    /* renamed from: p */
    public volatile InterfaceC3412h f2011p;

    /* renamed from: q */
    public volatile InterfaceC3415k f2012q;

    /* renamed from: r */
    public volatile InterfaceC3418n f2013r;

    /* renamed from: s */
    public volatile InterfaceC3409e f2014s;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    /* loaded from: classes.dex */
    public class C0420a extends C3834g.a {
        public C0420a(int i10) {
            super(i10);
        }

        @Override // p202o1.C3834g.a
        /* renamed from: a */
        public void mo2152a(InterfaceC4388b interfaceC4388b) {
            interfaceC4388b.mo16976p("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC4388b.mo16976p("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            interfaceC4388b.mo16976p("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            interfaceC4388b.mo16976p("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            interfaceC4388b.mo16976p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            interfaceC4388b.mo16976p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            interfaceC4388b.mo16976p("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC4388b.mo16976p("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            interfaceC4388b.mo16976p("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC4388b.mo16976p("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC4388b.mo16976p("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            interfaceC4388b.mo16976p("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC4388b.mo16976p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            interfaceC4388b.mo16976p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC4388b.mo16976p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // p202o1.C3834g.a
        /* renamed from: b */
        public void mo2153b(InterfaceC4388b interfaceC4388b) {
            interfaceC4388b.mo16976p("DROP TABLE IF EXISTS `Dependency`");
            interfaceC4388b.mo16976p("DROP TABLE IF EXISTS `WorkSpec`");
            interfaceC4388b.mo16976p("DROP TABLE IF EXISTS `WorkTag`");
            interfaceC4388b.mo16976p("DROP TABLE IF EXISTS `SystemIdInfo`");
            interfaceC4388b.mo16976p("DROP TABLE IF EXISTS `WorkName`");
            interfaceC4388b.mo16976p("DROP TABLE IF EXISTS `WorkProgress`");
            interfaceC4388b.mo16976p("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f13797h != null) {
                int size = WorkDatabase_Impl.this.f13797h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((AbstractC3832e.b) WorkDatabase_Impl.this.f13797h.get(i10)).m14571b(interfaceC4388b);
                }
            }
        }

        @Override // p202o1.C3834g.a
        /* renamed from: c */
        public void mo2154c(InterfaceC4388b interfaceC4388b) {
            if (WorkDatabase_Impl.this.f13797h != null) {
                int size = WorkDatabase_Impl.this.f13797h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((AbstractC3832e.b) WorkDatabase_Impl.this.f13797h.get(i10)).m14570a(interfaceC4388b);
                }
            }
        }

        @Override // p202o1.C3834g.a
        /* renamed from: d */
        public void mo2155d(InterfaceC4388b interfaceC4388b) {
            WorkDatabase_Impl.this.f13790a = interfaceC4388b;
            interfaceC4388b.mo16976p("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m14558m(interfaceC4388b);
            if (WorkDatabase_Impl.this.f13797h != null) {
                int size = WorkDatabase_Impl.this.f13797h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((AbstractC3832e.b) WorkDatabase_Impl.this.f13797h.get(i10)).mo2138c(interfaceC4388b);
                }
            }
        }

        @Override // p202o1.C3834g.a
        /* renamed from: e */
        public void mo2156e(InterfaceC4388b interfaceC4388b) {
        }

        @Override // p202o1.C3834g.a
        /* renamed from: f */
        public void mo2157f(InterfaceC4388b interfaceC4388b) {
            C4124c.m15900a(interfaceC4388b);
        }

        @Override // p202o1.C3834g.a
        /* renamed from: g */
        public C3834g.b mo2158g(InterfaceC4388b interfaceC4388b) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C4127f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new C4127f.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C4127f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new C4127f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C4127f.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new C4127f.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            C4127f c4127f = new C4127f("Dependency", hashMap, hashSet, hashSet2);
            C4127f m15906a = C4127f.m15906a(interfaceC4388b, "Dependency");
            if (!c4127f.equals(m15906a)) {
                return new C3834g.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c4127f + "\n Found:\n" + m15906a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new C4127f.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new C4127f.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new C4127f.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new C4127f.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new C4127f.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new C4127f.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new C4127f.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new C4127f.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new C4127f.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new C4127f.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new C4127f.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new C4127f.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new C4127f.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new C4127f.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new C4127f.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new C4127f.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new C4127f.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new C4127f.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new C4127f.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new C4127f.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new C4127f.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new C4127f.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new C4127f.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new C4127f.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new C4127f.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C4127f.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new C4127f.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            C4127f c4127f2 = new C4127f("WorkSpec", hashMap2, hashSet3, hashSet4);
            C4127f m15906a2 = C4127f.m15906a(interfaceC4388b, "WorkSpec");
            if (!c4127f2.equals(m15906a2)) {
                return new C3834g.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c4127f2 + "\n Found:\n" + m15906a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C4127f.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new C4127f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C4127f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C4127f.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            C4127f c4127f3 = new C4127f("WorkTag", hashMap3, hashSet5, hashSet6);
            C4127f m15906a3 = C4127f.m15906a(interfaceC4388b, "WorkTag");
            if (!c4127f3.equals(m15906a3)) {
                return new C3834g.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c4127f3 + "\n Found:\n" + m15906a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new C4127f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new C4127f.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C4127f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C4127f c4127f4 = new C4127f("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C4127f m15906a4 = C4127f.m15906a(interfaceC4388b, "SystemIdInfo");
            if (!c4127f4.equals(m15906a4)) {
                return new C3834g.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c4127f4 + "\n Found:\n" + m15906a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C4127f.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new C4127f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C4127f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C4127f.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            C4127f c4127f5 = new C4127f("WorkName", hashMap5, hashSet8, hashSet9);
            C4127f m15906a5 = C4127f.m15906a(interfaceC4388b, "WorkName");
            if (!c4127f5.equals(m15906a5)) {
                return new C3834g.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c4127f5 + "\n Found:\n" + m15906a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C4127f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new C4127f.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C4127f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C4127f c4127f6 = new C4127f("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C4127f m15906a6 = C4127f.m15906a(interfaceC4388b, "WorkProgress");
            if (!c4127f6.equals(m15906a6)) {
                return new C3834g.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c4127f6 + "\n Found:\n" + m15906a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put(Constants.KEY, new C4127f.a(Constants.KEY, "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new C4127f.a("long_value", "INTEGER", false, 0, null, 1));
            C4127f c4127f7 = new C4127f("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C4127f m15906a7 = C4127f.m15906a(interfaceC4388b, "Preference");
            if (c4127f7.equals(m15906a7)) {
                return new C3834g.b(true, null);
            }
            return new C3834g.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c4127f7 + "\n Found:\n" + m15906a7);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: A */
    public InterfaceC3418n mo2130A() {
        InterfaceC3418n interfaceC3418n;
        if (this.f2013r != null) {
            return this.f2013r;
        }
        synchronized (this) {
            if (this.f2013r == null) {
                this.f2013r = new C3419o(this);
            }
            interfaceC3418n = this.f2013r;
        }
        return interfaceC3418n;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: B */
    public InterfaceC3421q mo2131B() {
        InterfaceC3421q interfaceC3421q;
        if (this.f2008m != null) {
            return this.f2008m;
        }
        synchronized (this) {
            if (this.f2008m == null) {
                this.f2008m = new C3422r(this);
            }
            interfaceC3421q = this.f2008m;
        }
        return interfaceC3421q;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: C */
    public InterfaceC3424t mo2132C() {
        InterfaceC3424t interfaceC3424t;
        if (this.f2010o != null) {
            return this.f2010o;
        }
        synchronized (this) {
            if (this.f2010o == null) {
                this.f2010o = new C3425u(this);
            }
            interfaceC3424t = this.f2010o;
        }
        return interfaceC3424t;
    }

    @Override // p202o1.AbstractC3832e
    /* renamed from: e */
    public C0391c mo2150e() {
        return new C0391c(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // p202o1.AbstractC3832e
    /* renamed from: f */
    public InterfaceC4389c mo2151f(C3828a c3828a) {
        return c3828a.f13773a.mo2137a(InterfaceC4389c.b.m16981a(c3828a.f13774b).m16984c(c3828a.f13775c).m16983b(new C3834g(c3828a, new C0420a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).m16982a());
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: t */
    public InterfaceC3406b mo2133t() {
        InterfaceC3406b interfaceC3406b;
        if (this.f2009n != null) {
            return this.f2009n;
        }
        synchronized (this) {
            if (this.f2009n == null) {
                this.f2009n = new C3407c(this);
            }
            interfaceC3406b = this.f2009n;
        }
        return interfaceC3406b;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: x */
    public InterfaceC3409e mo2134x() {
        InterfaceC3409e interfaceC3409e;
        if (this.f2014s != null) {
            return this.f2014s;
        }
        synchronized (this) {
            if (this.f2014s == null) {
                this.f2014s = new C3410f(this);
            }
            interfaceC3409e = this.f2014s;
        }
        return interfaceC3409e;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: y */
    public InterfaceC3412h mo2135y() {
        InterfaceC3412h interfaceC3412h;
        if (this.f2011p != null) {
            return this.f2011p;
        }
        synchronized (this) {
            if (this.f2011p == null) {
                this.f2011p = new C3413i(this);
            }
            interfaceC3412h = this.f2011p;
        }
        return interfaceC3412h;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: z */
    public InterfaceC3415k mo2136z() {
        InterfaceC3415k interfaceC3415k;
        if (this.f2012q != null) {
            return this.f2012q;
        }
        synchronized (this) {
            if (this.f2012q == null) {
                this.f2012q = new C3416l(this);
            }
            interfaceC3415k = this.f2012q;
        }
        return interfaceC3415k;
    }
}
