package p262s1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: s1.c */
/* loaded from: classes.dex */
public interface InterfaceC4389c extends Closeable {

    /* renamed from: s1.c$a */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        public final int f16105a;

        public a(int i10) {
            this.f16105a = i10;
        }

        /* renamed from: a */
        public final void m16979a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } else {
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e10) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e10);
                    }
                }
            } catch (Exception e11) {
                Log.w("SupportSQLite", "delete failed: ", e11);
            }
        }

        /* renamed from: b */
        public void mo14581b(InterfaceC4388b interfaceC4388b) {
        }

        /* renamed from: c */
        public void m16980c(InterfaceC4388b interfaceC4388b) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + interfaceC4388b.mo16975o0());
            if (!interfaceC4388b.isOpen()) {
                m16979a(interfaceC4388b.mo16975o0());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = interfaceC4388b.mo16973k();
                } finally {
                    if (list != null) {
                        Iterator<Pair<String, String>> it = list.iterator();
                        while (it.hasNext()) {
                            m16979a((String) it.next().second);
                        }
                    } else {
                        m16979a(interfaceC4388b.mo16975o0());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                interfaceC4388b.close();
            } catch (IOException unused2) {
            }
        }

        /* renamed from: d */
        public abstract void mo14582d(InterfaceC4388b interfaceC4388b);

        /* renamed from: e */
        public abstract void mo14583e(InterfaceC4388b interfaceC4388b, int i10, int i11);

        /* renamed from: f */
        public void mo14584f(InterfaceC4388b interfaceC4388b) {
        }

        /* renamed from: g */
        public abstract void mo14585g(InterfaceC4388b interfaceC4388b, int i10, int i11);
    }

    /* renamed from: s1.c$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final Context f16106a;

        /* renamed from: b */
        public final String f16107b;

        /* renamed from: c */
        public final a f16108c;

        /* renamed from: d */
        public final boolean f16109d;

        /* renamed from: s1.c$b$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            public Context f16110a;

            /* renamed from: b */
            public String f16111b;

            /* renamed from: c */
            public a f16112c;

            /* renamed from: d */
            public boolean f16113d;

            public a(Context context) {
                this.f16110a = context;
            }

            /* renamed from: a */
            public b m16982a() {
                if (this.f16112c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f16110a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f16113d && TextUtils.isEmpty(this.f16111b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f16110a, this.f16111b, this.f16112c, this.f16113d);
            }

            /* renamed from: b */
            public a m16983b(a aVar) {
                this.f16112c = aVar;
                return this;
            }

            /* renamed from: c */
            public a m16984c(String str) {
                this.f16111b = str;
                return this;
            }

            /* renamed from: d */
            public a m16985d(boolean z10) {
                this.f16113d = z10;
                return this;
            }
        }

        public b(Context context, String str, a aVar, boolean z10) {
            this.f16106a = context;
            this.f16107b = str;
            this.f16108c = aVar;
            this.f16109d = z10;
        }

        /* renamed from: a */
        public static a m16981a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: s1.c$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        InterfaceC4389c mo2137a(b bVar);
    }

    /* renamed from: U */
    InterfaceC4388b mo14600U();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
