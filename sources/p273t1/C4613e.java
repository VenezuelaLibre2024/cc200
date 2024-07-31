package p273t1;

import android.database.sqlite.SQLiteStatement;
import p262s1.InterfaceC4392f;

/* renamed from: t1.e */
/* loaded from: classes.dex */
public class C4613e extends C4612d implements InterfaceC4392f {

    /* renamed from: i */
    public final SQLiteStatement f17294i;

    public C4613e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f17294i = sQLiteStatement;
    }

    @Override // p262s1.InterfaceC4392f
    /* renamed from: D0 */
    public long mo16986D0() {
        return this.f17294i.executeInsert();
    }

    @Override // p262s1.InterfaceC4392f
    /* renamed from: s */
    public int mo16987s() {
        return this.f17294i.executeUpdateDelete();
    }
}
