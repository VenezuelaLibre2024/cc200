package p034c7;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import p207o6.InterfaceC3935d;

/* renamed from: c7.s4 */
/* loaded from: classes.dex */
public final class C0877s4 extends AbstractC0680e3 {

    /* renamed from: c */
    public final C0863r4 f3558c;

    /* renamed from: d */
    public boolean f3559d;

    public C0877s4(C0767k6 c0767k6) {
        super(c0767k6);
        this.f3558c = new C0863r4(this, zza(), "google_app_measurement_local.db");
    }

    /* renamed from: w */
    public static long m3829w(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1L;
            }
            long j10 = cursor.getLong(0);
            cursor.close();
            return j10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: A */
    public final boolean m3830A(C0705g0 c0705g0) {
        Parcel obtain = Parcel.obtain();
        c0705g0.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m3838y(0, marshall);
        }
        zzj().m3916D().m3995a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: B */
    public final boolean m3831B(C0787lc c0787lc) {
        Parcel obtain = Parcel.obtain();
        c0787lc.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m3838y(1, marshall);
        }
        zzj().m3916D().m3995a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: C */
    public final void m3832C() {
        int delete;
        mo3099i();
        try {
            SQLiteDatabase m3835F = m3835F();
            if (m3835F == null || (delete = m3835F.delete("messages", null, null) + 0) <= 0) {
                return;
            }
            zzj().m3918F().m3996b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e10) {
            zzj().m3914B().m3996b("Error resetting local analytics data. error", e10);
        }
    }

    /* renamed from: D */
    public final boolean m3833D() {
        return m3838y(3, new byte[0]);
    }

    /* renamed from: E */
    public final boolean m3834E() {
        int i10;
        mo3099i();
        if (this.f3559d || !m3836G()) {
            return false;
        }
        int i11 = 5;
        for (0; i10 < 5; i10 + 1) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase m3835F = m3835F();
                    if (m3835F == null) {
                        this.f3559d = true;
                        if (m3835F != null) {
                            m3835F.close();
                        }
                        return false;
                    }
                    m3835F.beginTransaction();
                    m3835F.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    m3835F.setTransactionSuccessful();
                    m3835F.endTransaction();
                    m3835F.close();
                    return true;
                } catch (SQLiteFullException e10) {
                    zzj().m3914B().m3996b("Error deleting app launch break from local database", e10);
                    this.f3559d = true;
                    i10 = 0 == 0 ? i10 + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteException e11) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    zzj().m3914B().m3996b("Error deleting app launch break from local database", e11);
                    this.f3559d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep(i11);
                i11 += 20;
                if (0 == 0) {
                }
                sQLiteDatabase.close();
            }
        }
        zzj().m3919G().m3995a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    /* renamed from: F */
    public final SQLiteDatabase m3835F() {
        if (this.f3559d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f3558c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f3559d = true;
        return null;
    }

    /* renamed from: G */
    public final boolean m3836G() {
        return zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override // p034c7.C0754j7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0718h mo3092a() {
        return super.mo3092a();
    }

    @Override // p034c7.C0754j7
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C0970z mo3093c() {
        return super.mo3093c();
    }

    @Override // p034c7.C0754j7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C0905u4 mo3094d() {
        return super.mo3094d();
    }

    @Override // p034c7.C0754j7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C0738i5 mo3095e() {
        return super.mo3095e();
    }

    @Override // p034c7.C0754j7
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0857qc mo3096f() {
        return super.mo3096f();
    }

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo3097g() {
        super.mo3097g();
    }

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo3098h() {
        super.mo3098h();
    }

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo3099i() {
        super.mo3099i();
    }

    @Override // p034c7.C0695f4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C0633b0 mo3100j() {
        return super.mo3100j();
    }

    @Override // p034c7.C0695f4
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C0835p4 mo3101k() {
        return super.mo3101k();
    }

    @Override // p034c7.C0695f4
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C0877s4 mo3102l() {
        return super.mo3102l();
    }

    @Override // p034c7.C0695f4
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0936w7 mo3103m() {
        return super.mo3103m();
    }

    @Override // p034c7.C0695f4
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C0840p9 mo3104n() {
        return super.mo3104n();
    }

    @Override // p034c7.C0695f4
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C0966y9 mo3105o() {
        return super.mo3105o();
    }

    @Override // p034c7.C0695f4
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C0716gb mo3106p() {
        return super.mo3106p();
    }

    @Override // p034c7.AbstractC0680e3
    /* renamed from: v */
    public final boolean mo3160v() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01eb  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<p125i6.AbstractC2601a> m3837x(int r22) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0877s4.m3837x(int):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3838y(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0877s4.m3838y(int, byte[]):boolean");
    }

    /* renamed from: z */
    public final boolean m3839z(C0690f c0690f) {
        mo3096f();
        byte[] m3753l0 = C0857qc.m3753l0(c0690f);
        if (m3753l0.length <= 131072) {
            return m3838y(2, m3753l0);
        }
        zzj().m3916D().m3995a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ InterfaceC3935d zzb() {
        return super.zzb();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0647c zzd() {
        return super.zzd();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0919v4 zzj() {
        return super.zzj();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0669d6 zzl() {
        return super.zzl();
    }
}
