package nc;

import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: nc.c0 */
/* loaded from: classes2.dex */
public class C3789c0 {

    /* renamed from: a */
    public final String f13662a;

    /* renamed from: b */
    public final List<Object> f13663b;

    public C3789c0(String str, List<Object> list) {
        this.f13662a = str;
        this.f13663b = list == null ? new ArrayList<>() : list;
    }

    /* renamed from: f */
    public static Object m14432f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            bArr[i10] = (byte) ((Integer) list.get(i10)).intValue();
        }
        return bArr;
    }

    /* renamed from: a */
    public void m14433a(SQLiteProgram sQLiteProgram) {
        long j10;
        List<Object> list = this.f13663b;
        if (list != null) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                Object m14432f = m14432f(this.f13663b.get(i10));
                int i11 = i10 + 1;
                if (m14432f == null) {
                    sQLiteProgram.bindNull(i11);
                } else if (m14432f instanceof byte[]) {
                    sQLiteProgram.bindBlob(i11, (byte[]) m14432f);
                } else if (m14432f instanceof Double) {
                    sQLiteProgram.bindDouble(i11, ((Double) m14432f).doubleValue());
                } else {
                    if (m14432f instanceof Integer) {
                        j10 = ((Integer) m14432f).intValue();
                    } else if (m14432f instanceof Long) {
                        j10 = ((Long) m14432f).longValue();
                    } else if (m14432f instanceof String) {
                        sQLiteProgram.bindString(i11, (String) m14432f);
                    } else {
                        if (!(m14432f instanceof Boolean)) {
                            throw new IllegalArgumentException("Could not bind " + m14432f + " from index " + i10 + ": Supported types are null, byte[], double, long, boolean and String");
                        }
                        j10 = ((Boolean) m14432f).booleanValue() ? 1L : 0L;
                    }
                    sQLiteProgram.bindLong(i11, j10);
                }
                i10 = i11;
            }
        }
    }

    /* renamed from: b */
    public List<Object> m14434b() {
        return this.f13663b;
    }

    /* renamed from: c */
    public String m14435c() {
        return this.f13662a;
    }

    /* renamed from: d */
    public Object[] m14436d() {
        return m14437e(this.f13663b);
    }

    /* renamed from: e */
    public final Object[] m14437e(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m14432f(it.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3789c0)) {
            return false;
        }
        C3789c0 c3789c0 = (C3789c0) obj;
        String str = this.f13662a;
        if (str != null) {
            if (!str.equals(c3789c0.f13662a)) {
                return false;
            }
        } else if (c3789c0.f13662a != null) {
            return false;
        }
        if (this.f13663b.size() != c3789c0.f13663b.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f13663b.size(); i10++) {
            if ((this.f13663b.get(i10) instanceof byte[]) && (c3789c0.f13663b.get(i10) instanceof byte[])) {
                if (!Arrays.equals((byte[]) this.f13663b.get(i10), (byte[]) c3789c0.f13663b.get(i10))) {
                    return false;
                }
            } else if (!this.f13663b.get(i10).equals(c3789c0.f13663b.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f13662a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13662a);
        List<Object> list = this.f13663b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + this.f13663b;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
