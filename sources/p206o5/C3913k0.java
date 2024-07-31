package p206o5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p206o5.C3913k0;

/* renamed from: o5.k0 */
/* loaded from: classes.dex */
public class C3913k0 {

    /* renamed from: h */
    public static final Comparator<b> f14049h = new Comparator() { // from class: o5.j0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m14834g;
            m14834g = C3913k0.m14834g((C3913k0.b) obj, (C3913k0.b) obj2);
            return m14834g;
        }
    };

    /* renamed from: i */
    public static final Comparator<b> f14050i = new Comparator() { // from class: o5.i0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m14835h;
            m14835h = C3913k0.m14835h((C3913k0.b) obj, (C3913k0.b) obj2);
            return m14835h;
        }
    };

    /* renamed from: a */
    public final int f14051a;

    /* renamed from: e */
    public int f14055e;

    /* renamed from: f */
    public int f14056f;

    /* renamed from: g */
    public int f14057g;

    /* renamed from: c */
    public final b[] f14053c = new b[5];

    /* renamed from: b */
    public final ArrayList<b> f14052b = new ArrayList<>();

    /* renamed from: d */
    public int f14054d = -1;

    /* renamed from: o5.k0$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f14058a;

        /* renamed from: b */
        public int f14059b;

        /* renamed from: c */
        public float f14060c;

        public b() {
        }
    }

    public C3913k0(int i10) {
        this.f14051a = i10;
    }

    /* renamed from: g */
    public static /* synthetic */ int m14834g(b bVar, b bVar2) {
        return bVar.f14058a - bVar2.f14058a;
    }

    /* renamed from: h */
    public static /* synthetic */ int m14835h(b bVar, b bVar2) {
        return Float.compare(bVar.f14060c, bVar2.f14060c);
    }

    /* renamed from: c */
    public void m14836c(int i10, float f10) {
        b bVar;
        int i11;
        b bVar2;
        int i12;
        m14837d();
        int i13 = this.f14057g;
        if (i13 > 0) {
            b[] bVarArr = this.f14053c;
            int i14 = i13 - 1;
            this.f14057g = i14;
            bVar = bVarArr[i14];
        } else {
            bVar = new b();
        }
        int i15 = this.f14055e;
        this.f14055e = i15 + 1;
        bVar.f14058a = i15;
        bVar.f14059b = i10;
        bVar.f14060c = f10;
        this.f14052b.add(bVar);
        int i16 = this.f14056f + i10;
        while (true) {
            this.f14056f = i16;
            while (true) {
                int i17 = this.f14056f;
                int i18 = this.f14051a;
                if (i17 <= i18) {
                    return;
                }
                i11 = i17 - i18;
                bVar2 = this.f14052b.get(0);
                i12 = bVar2.f14059b;
                if (i12 <= i11) {
                    this.f14056f -= i12;
                    this.f14052b.remove(0);
                    int i19 = this.f14057g;
                    if (i19 < 5) {
                        b[] bVarArr2 = this.f14053c;
                        this.f14057g = i19 + 1;
                        bVarArr2[i19] = bVar2;
                    }
                }
            }
            bVar2.f14059b = i12 - i11;
            i16 = this.f14056f - i11;
        }
    }

    /* renamed from: d */
    public final void m14837d() {
        if (this.f14054d != 1) {
            Collections.sort(this.f14052b, f14049h);
            this.f14054d = 1;
        }
    }

    /* renamed from: e */
    public final void m14838e() {
        if (this.f14054d != 0) {
            Collections.sort(this.f14052b, f14050i);
            this.f14054d = 0;
        }
    }

    /* renamed from: f */
    public float m14839f(float f10) {
        m14838e();
        float f11 = f10 * this.f14056f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f14052b.size(); i11++) {
            b bVar = this.f14052b.get(i11);
            i10 += bVar.f14059b;
            if (i10 >= f11) {
                return bVar.f14060c;
            }
        }
        if (this.f14052b.isEmpty()) {
            return Float.NaN;
        }
        return this.f14052b.get(r5.size() - 1).f14060c;
    }

    /* renamed from: i */
    public void m14840i() {
        this.f14052b.clear();
        this.f14054d = -1;
        this.f14055e = 0;
        this.f14056f = 0;
    }
}
