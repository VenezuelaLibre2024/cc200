package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import p090g0.C1956p;
import p133j0.C3205d;
import p314w0.C5192b;

/* renamed from: androidx.emoji2.text.m */
/* loaded from: classes.dex */
public final class C0269m {

    /* renamed from: a */
    public final C5192b f1283a;

    /* renamed from: b */
    public final char[] f1284b;

    /* renamed from: c */
    public final a f1285c = new a(1024);

    /* renamed from: d */
    public final Typeface f1286d;

    /* renamed from: androidx.emoji2.text.m$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final SparseArray<a> f1287a;

        /* renamed from: b */
        public C0263g f1288b;

        public a() {
            this(1);
        }

        public a(int i10) {
            this.f1287a = new SparseArray<>(i10);
        }

        /* renamed from: a */
        public a m1327a(int i10) {
            SparseArray<a> sparseArray = this.f1287a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        /* renamed from: b */
        public final C0263g m1328b() {
            return this.f1288b;
        }

        /* renamed from: c */
        public void m1329c(C0263g c0263g, int i10, int i11) {
            a m1327a = m1327a(c0263g.m1272b(i10));
            if (m1327a == null) {
                m1327a = new a();
                this.f1287a.put(c0263g.m1272b(i10), m1327a);
            }
            if (i11 > i10) {
                m1327a.m1329c(c0263g, i10 + 1, i11);
            } else {
                m1327a.f1288b = c0263g;
            }
        }
    }

    public C0269m(Typeface typeface, C5192b c5192b) {
        this.f1286d = typeface;
        this.f1283a = c5192b;
        this.f1284b = new char[c5192b.m21025k() * 2];
        m1320a(c5192b);
    }

    /* renamed from: b */
    public static C0269m m1319b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            C1956p.m7875a("EmojiCompat.MetadataRepo.create");
            return new C0269m(typeface, C0268l.m1312b(byteBuffer));
        } finally {
            C1956p.m7876b();
        }
    }

    /* renamed from: a */
    public final void m1320a(C5192b c5192b) {
        int m21025k = c5192b.m21025k();
        for (int i10 = 0; i10 < m21025k; i10++) {
            C0263g c0263g = new C0263g(this, i10);
            Character.toChars(c0263g.m1276f(), this.f1284b, i10 * 2);
            m1326h(c0263g);
        }
    }

    /* renamed from: c */
    public char[] m1321c() {
        return this.f1284b;
    }

    /* renamed from: d */
    public C5192b m1322d() {
        return this.f1283a;
    }

    /* renamed from: e */
    public int m1323e() {
        return this.f1283a.m21026l();
    }

    /* renamed from: f */
    public a m1324f() {
        return this.f1285c;
    }

    /* renamed from: g */
    public Typeface m1325g() {
        return this.f1286d;
    }

    /* renamed from: h */
    public void m1326h(C0263g c0263g) {
        C3205d.m11415k(c0263g, "emoji metadata cannot be null");
        C3205d.m11405a(c0263g.m1273c() > 0, "invalid metadata codepoint length");
        this.f1285c.m1329c(c0263g, 0, c0263g.m1273c() - 1);
    }
}
