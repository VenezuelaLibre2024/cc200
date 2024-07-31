package p077f4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p222p5.C4015a0;

/* renamed from: f4.a */
/* loaded from: classes.dex */
public abstract class AbstractC1820a {

    /* renamed from: a */
    public final int f6785a;

    /* renamed from: f4.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1820a {

        /* renamed from: b */
        public final long f6786b;

        /* renamed from: c */
        public final List<b> f6787c;

        /* renamed from: d */
        public final List<a> f6788d;

        public a(int i10, long j10) {
            super(i10);
            this.f6786b = j10;
            this.f6787c = new ArrayList();
            this.f6788d = new ArrayList();
        }

        /* renamed from: d */
        public void m7392d(a aVar) {
            this.f6788d.add(aVar);
        }

        /* renamed from: e */
        public void m7393e(b bVar) {
            this.f6787c.add(bVar);
        }

        /* renamed from: f */
        public a m7394f(int i10) {
            int size = this.f6788d.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = this.f6788d.get(i11);
                if (aVar.f6785a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: g */
        public b m7395g(int i10) {
            int size = this.f6787c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f6787c.get(i11);
                if (bVar.f6785a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // p077f4.AbstractC1820a
        public String toString() {
            return AbstractC1820a.m7389a(this.f6785a) + " leaves: " + Arrays.toString(this.f6787c.toArray()) + " containers: " + Arrays.toString(this.f6788d.toArray());
        }
    }

    /* renamed from: f4.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1820a {

        /* renamed from: b */
        public final C4015a0 f6789b;

        public b(int i10, C4015a0 c4015a0) {
            super(i10);
            this.f6789b = c4015a0;
        }
    }

    public AbstractC1820a(int i10) {
        this.f6785a = i10;
    }

    /* renamed from: a */
    public static String m7389a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    /* renamed from: b */
    public static int m7390b(int i10) {
        return i10 & 16777215;
    }

    /* renamed from: c */
    public static int m7391c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return m7389a(this.f6785a);
    }
}
