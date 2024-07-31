package p273t1;

import android.database.sqlite.SQLiteProgram;
import p262s1.InterfaceC4390d;

/* renamed from: t1.d */
/* loaded from: classes.dex */
public class C4612d implements InterfaceC4390d {

    /* renamed from: h */
    public final SQLiteProgram f17293h;

    public C4612d(SQLiteProgram sQLiteProgram) {
        this.f17293h = sQLiteProgram;
    }

    @Override // p262s1.InterfaceC4390d
    /* renamed from: M */
    public void mo14591M(int i10, long j10) {
        this.f17293h.bindLong(i10, j10);
    }

    @Override // p262s1.InterfaceC4390d
    /* renamed from: Q */
    public void mo14592Q(int i10, byte[] bArr) {
        this.f17293h.bindBlob(i10, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17293h.close();
    }

    @Override // p262s1.InterfaceC4390d
    /* renamed from: j0 */
    public void mo14596j0(int i10) {
        this.f17293h.bindNull(i10);
    }

    @Override // p262s1.InterfaceC4390d
    /* renamed from: q */
    public void mo14598q(int i10, String str) {
        this.f17293h.bindString(i10, str);
    }

    @Override // p262s1.InterfaceC4390d
    /* renamed from: y */
    public void mo14599y(int i10, double d10) {
        this.f17293h.bindDouble(i10, d10);
    }
}
