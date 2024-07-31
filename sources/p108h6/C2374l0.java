package p108h6;

import android.content.Context;
import android.util.SparseIntArray;
import p064e6.C1675f;
import p079f6.C1841a;

/* renamed from: h6.l0 */
/* loaded from: classes.dex */
public final class C2374l0 {

    /* renamed from: a */
    public final SparseIntArray f9655a = new SparseIntArray();

    /* renamed from: b */
    public C1675f f9656b;

    public C2374l0(C1675f c1675f) {
        C2394s.m9619l(c1675f);
        this.f9656b = c1675f;
    }

    /* renamed from: a */
    public final int m9581a(Context context, int i10) {
        return this.f9655a.get(i10, -1);
    }

    /* renamed from: b */
    public final int m9582b(Context context, C1841a.f fVar) {
        C2394s.m9619l(context);
        C2394s.m9619l(fVar);
        int i10 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int m9581a = m9581a(context, minApkVersion);
        if (m9581a == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f9655a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f9655a.keyAt(i11);
                if (keyAt > minApkVersion && this.f9655a.get(keyAt) == 0) {
                    break;
                }
                i11++;
            }
            m9581a = i10 == -1 ? this.f9656b.mo6698h(context, minApkVersion) : i10;
            this.f9655a.put(minApkVersion, m9581a);
        }
        return m9581a;
    }

    /* renamed from: c */
    public final void m9583c() {
        this.f9655a.clear();
    }
}
