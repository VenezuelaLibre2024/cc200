package p290u4;

import android.util.SparseArray;
import p222p5.C4014a;
import p222p5.InterfaceC4028h;

/* renamed from: u4.q0 */
/* loaded from: classes.dex */
public final class C4877q0<V> {

    /* renamed from: c */
    public final InterfaceC4028h<V> f18455c;

    /* renamed from: b */
    public final SparseArray<V> f18454b = new SparseArray<>();

    /* renamed from: a */
    public int f18453a = -1;

    public C4877q0(InterfaceC4028h<V> interfaceC4028h) {
        this.f18455c = interfaceC4028h;
    }

    /* renamed from: a */
    public void m19430a(int i10, V v10) {
        if (this.f18453a == -1) {
            C4014a.m15200f(this.f18454b.size() == 0);
            this.f18453a = 0;
        }
        if (this.f18454b.size() > 0) {
            SparseArray<V> sparseArray = this.f18454b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            C4014a.m15195a(i10 >= keyAt);
            if (keyAt == i10) {
                InterfaceC4028h<V> interfaceC4028h = this.f18455c;
                SparseArray<V> sparseArray2 = this.f18454b;
                interfaceC4028h.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f18454b.append(i10, v10);
    }

    /* renamed from: b */
    public void m19431b() {
        for (int i10 = 0; i10 < this.f18454b.size(); i10++) {
            this.f18455c.accept(this.f18454b.valueAt(i10));
        }
        this.f18453a = -1;
        this.f18454b.clear();
    }

    /* renamed from: c */
    public void m19432c(int i10) {
        for (int size = this.f18454b.size() - 1; size >= 0 && i10 < this.f18454b.keyAt(size); size--) {
            this.f18455c.accept(this.f18454b.valueAt(size));
            this.f18454b.removeAt(size);
        }
        this.f18453a = this.f18454b.size() > 0 ? Math.min(this.f18453a, this.f18454b.size() - 1) : -1;
    }

    /* renamed from: d */
    public void m19433d(int i10) {
        int i11 = 0;
        while (i11 < this.f18454b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f18454b.keyAt(i12)) {
                return;
            }
            this.f18455c.accept(this.f18454b.valueAt(i11));
            this.f18454b.removeAt(i11);
            int i13 = this.f18453a;
            if (i13 > 0) {
                this.f18453a = i13 - 1;
            }
            i11 = i12;
        }
    }

    /* renamed from: e */
    public V m19434e(int i10) {
        if (this.f18453a == -1) {
            this.f18453a = 0;
        }
        while (true) {
            int i11 = this.f18453a;
            if (i11 <= 0 || i10 >= this.f18454b.keyAt(i11)) {
                break;
            }
            this.f18453a--;
        }
        while (this.f18453a < this.f18454b.size() - 1 && i10 >= this.f18454b.keyAt(this.f18453a + 1)) {
            this.f18453a++;
        }
        return this.f18454b.valueAt(this.f18453a);
    }

    /* renamed from: f */
    public V m19435f() {
        return this.f18454b.valueAt(r0.size() - 1);
    }

    /* renamed from: g */
    public boolean m19436g() {
        return this.f18454b.size() == 0;
    }
}
