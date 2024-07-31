package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import p178m2.C3502c;
import p178m2.C3504e;
import p218p1.AbstractC3996a;
import p262s1.InterfaceC4388b;

/* renamed from: androidx.work.impl.a */
/* loaded from: classes.dex */
public class C0421a {

    /* renamed from: a */
    public static AbstractC3996a f2016a = new a(1, 2);

    /* renamed from: b */
    public static AbstractC3996a f2017b = new b(3, 4);

    /* renamed from: c */
    public static AbstractC3996a f2018c = new c(4, 5);

    /* renamed from: d */
    public static AbstractC3996a f2019d = new d(6, 7);

    /* renamed from: e */
    public static AbstractC3996a f2020e = new e(7, 8);

    /* renamed from: f */
    public static AbstractC3996a f2021f = new f(8, 9);

    /* renamed from: g */
    public static AbstractC3996a f2022g = new g(11, 12);

    /* renamed from: androidx.work.impl.a$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC3996a {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p218p1.AbstractC3996a
        /* renamed from: a */
        public void mo2159a(InterfaceC4388b interfaceC4388b) {
            interfaceC4388b.mo16976p("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC4388b.mo16976p("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            interfaceC4388b.mo16976p("DROP TABLE IF EXISTS alarmInfo");
            interfaceC4388b.mo16976p("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.a$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC3996a {
        public b(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p218p1.AbstractC3996a
        /* renamed from: a */
        public void mo2159a(InterfaceC4388b interfaceC4388b) {
            if (Build.VERSION.SDK_INT >= 23) {
                interfaceC4388b.mo16976p("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* renamed from: androidx.work.impl.a$c */
    /* loaded from: classes.dex */
    public class c extends AbstractC3996a {
        public c(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p218p1.AbstractC3996a
        /* renamed from: a */
        public void mo2159a(InterfaceC4388b interfaceC4388b) {
            interfaceC4388b.mo16976p("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            interfaceC4388b.mo16976p("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.a$d */
    /* loaded from: classes.dex */
    public class d extends AbstractC3996a {
        public d(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p218p1.AbstractC3996a
        /* renamed from: a */
        public void mo2159a(InterfaceC4388b interfaceC4388b) {
            interfaceC4388b.mo16976p("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* renamed from: androidx.work.impl.a$e */
    /* loaded from: classes.dex */
    public class e extends AbstractC3996a {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p218p1.AbstractC3996a
        /* renamed from: a */
        public void mo2159a(InterfaceC4388b interfaceC4388b) {
            interfaceC4388b.mo16976p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* renamed from: androidx.work.impl.a$f */
    /* loaded from: classes.dex */
    public class f extends AbstractC3996a {
        public f(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p218p1.AbstractC3996a
        /* renamed from: a */
        public void mo2159a(InterfaceC4388b interfaceC4388b) {
            interfaceC4388b.mo16976p("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$g */
    /* loaded from: classes.dex */
    public class g extends AbstractC3996a {
        public g(int i10, int i11) {
            super(i10, i11);
        }

        @Override // p218p1.AbstractC3996a
        /* renamed from: a */
        public void mo2159a(InterfaceC4388b interfaceC4388b) {
            interfaceC4388b.mo16976p("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$h */
    /* loaded from: classes.dex */
    public static class h extends AbstractC3996a {

        /* renamed from: c */
        public final Context f2023c;

        public h(Context context, int i10, int i11) {
            super(i10, i11);
            this.f2023c = context;
        }

        @Override // p218p1.AbstractC3996a
        /* renamed from: a */
        public void mo2159a(InterfaceC4388b interfaceC4388b) {
            if (this.f14396b >= 10) {
                interfaceC4388b.mo16969O("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f2023c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* renamed from: androidx.work.impl.a$i */
    /* loaded from: classes.dex */
    public static class i extends AbstractC3996a {

        /* renamed from: c */
        public final Context f2024c;

        public i(Context context) {
            super(9, 10);
            this.f2024c = context;
        }

        @Override // p218p1.AbstractC3996a
        /* renamed from: a */
        public void mo2159a(InterfaceC4388b interfaceC4388b) {
            interfaceC4388b.mo16976p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            C3504e.m13048b(this.f2024c, interfaceC4388b);
            C3502c.m13042a(this.f2024c, interfaceC4388b);
        }
    }
}
