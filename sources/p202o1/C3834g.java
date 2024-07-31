package p202o1;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import p218p1.AbstractC3996a;
import p262s1.C4387a;
import p262s1.InterfaceC4388b;
import p262s1.InterfaceC4389c;

/* renamed from: o1.g */
/* loaded from: classes.dex */
public class C3834g extends InterfaceC4389c.a {

    /* renamed from: b */
    public C3828a f13823b;

    /* renamed from: c */
    public final a f13824c;

    /* renamed from: d */
    public final String f13825d;

    /* renamed from: e */
    public final String f13826e;

    /* renamed from: o1.g$a */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        public final int f13827a;

        public a(int i10) {
            this.f13827a = i10;
        }

        /* renamed from: a */
        public abstract void mo2152a(InterfaceC4388b interfaceC4388b);

        /* renamed from: b */
        public abstract void mo2153b(InterfaceC4388b interfaceC4388b);

        /* renamed from: c */
        public abstract void mo2154c(InterfaceC4388b interfaceC4388b);

        /* renamed from: d */
        public abstract void mo2155d(InterfaceC4388b interfaceC4388b);

        /* renamed from: e */
        public abstract void mo2156e(InterfaceC4388b interfaceC4388b);

        /* renamed from: f */
        public abstract void mo2157f(InterfaceC4388b interfaceC4388b);

        /* renamed from: g */
        public abstract b mo2158g(InterfaceC4388b interfaceC4388b);
    }

    /* renamed from: o1.g$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final boolean f13828a;

        /* renamed from: b */
        public final String f13829b;

        public b(boolean z10, String str) {
            this.f13828a = z10;
            this.f13829b = str;
        }
    }

    public C3834g(C3828a c3828a, a aVar, String str, String str2) {
        super(aVar.f13827a);
        this.f13823b = c3828a;
        this.f13824c = aVar;
        this.f13825d = str;
        this.f13826e = str2;
    }

    /* renamed from: j */
    public static boolean m14579j(InterfaceC4388b interfaceC4388b) {
        Cursor mo16970V = interfaceC4388b.mo16970V("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (mo16970V.moveToFirst()) {
                if (mo16970V.getInt(0) == 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            mo16970V.close();
        }
    }

    /* renamed from: k */
    public static boolean m14580k(InterfaceC4388b interfaceC4388b) {
        Cursor mo16970V = interfaceC4388b.mo16970V("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (mo16970V.moveToFirst()) {
                if (mo16970V.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            mo16970V.close();
        }
    }

    @Override // p262s1.InterfaceC4389c.a
    /* renamed from: b */
    public void mo14581b(InterfaceC4388b interfaceC4388b) {
        super.mo14581b(interfaceC4388b);
    }

    @Override // p262s1.InterfaceC4389c.a
    /* renamed from: d */
    public void mo14582d(InterfaceC4388b interfaceC4388b) {
        boolean m14579j = m14579j(interfaceC4388b);
        this.f13824c.mo2152a(interfaceC4388b);
        if (!m14579j) {
            b mo2158g = this.f13824c.mo2158g(interfaceC4388b);
            if (!mo2158g.f13828a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mo2158g.f13829b);
            }
        }
        m14588l(interfaceC4388b);
        this.f13824c.mo2154c(interfaceC4388b);
    }

    @Override // p262s1.InterfaceC4389c.a
    /* renamed from: e */
    public void mo14583e(InterfaceC4388b interfaceC4388b, int i10, int i11) {
        mo14585g(interfaceC4388b, i10, i11);
    }

    @Override // p262s1.InterfaceC4389c.a
    /* renamed from: f */
    public void mo14584f(InterfaceC4388b interfaceC4388b) {
        super.mo14584f(interfaceC4388b);
        m14586h(interfaceC4388b);
        this.f13824c.mo2155d(interfaceC4388b);
        this.f13823b = null;
    }

    @Override // p262s1.InterfaceC4389c.a
    /* renamed from: g */
    public void mo14585g(InterfaceC4388b interfaceC4388b, int i10, int i11) {
        boolean z10;
        List<AbstractC3996a> m14576c;
        C3828a c3828a = this.f13823b;
        if (c3828a == null || (m14576c = c3828a.f13776d.m14576c(i10, i11)) == null) {
            z10 = false;
        } else {
            this.f13824c.mo2157f(interfaceC4388b);
            Iterator<AbstractC3996a> it = m14576c.iterator();
            while (it.hasNext()) {
                it.next().mo2159a(interfaceC4388b);
            }
            b mo2158g = this.f13824c.mo2158g(interfaceC4388b);
            if (!mo2158g.f13828a) {
                throw new IllegalStateException("Migration didn't properly handle: " + mo2158g.f13829b);
            }
            this.f13824c.mo2156e(interfaceC4388b);
            m14588l(interfaceC4388b);
            z10 = true;
        }
        if (z10) {
            return;
        }
        C3828a c3828a2 = this.f13823b;
        if (c3828a2 != null && !c3828a2.m14542a(i10, i11)) {
            this.f13824c.mo2153b(interfaceC4388b);
            this.f13824c.mo2152a(interfaceC4388b);
            return;
        }
        throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    /* renamed from: h */
    public final void m14586h(InterfaceC4388b interfaceC4388b) {
        if (!m14580k(interfaceC4388b)) {
            b mo2158g = this.f13824c.mo2158g(interfaceC4388b);
            if (mo2158g.f13828a) {
                this.f13824c.mo2156e(interfaceC4388b);
                m14588l(interfaceC4388b);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mo2158g.f13829b);
            }
        }
        Cursor mo16967G = interfaceC4388b.mo16967G(new C4387a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = mo16967G.moveToFirst() ? mo16967G.getString(0) : null;
            mo16967G.close();
            if (!this.f13825d.equals(string) && !this.f13826e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            mo16967G.close();
            throw th;
        }
    }

    /* renamed from: i */
    public final void m14587i(InterfaceC4388b interfaceC4388b) {
        interfaceC4388b.mo16976p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: l */
    public final void m14588l(InterfaceC4388b interfaceC4388b) {
        m14587i(interfaceC4388b);
        interfaceC4388b.mo16976p(C3833f.m14578a(this.f13825d));
    }
}
