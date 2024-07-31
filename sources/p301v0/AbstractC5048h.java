package p301v0;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: v0.h */
/* loaded from: classes.dex */
public abstract class AbstractC5048h implements Iterable<Byte>, Serializable {

    /* renamed from: i */
    public static final AbstractC5048h f18921i = new j(C5028a0.f18864c);

    /* renamed from: j */
    public static final f f18922j;

    /* renamed from: k */
    public static final Comparator<AbstractC5048h> f18923k;

    /* renamed from: h */
    public int f18924h = 0;

    /* renamed from: v0.h$a */
    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: h */
        public int f18925h = 0;

        /* renamed from: i */
        public final int f18926i;

        public a() {
            this.f18926i = AbstractC5048h.this.size();
        }

        @Override // p301v0.AbstractC5048h.g
        /* renamed from: b */
        public byte mo19971b() {
            int i10 = this.f18925h;
            if (i10 >= this.f18926i) {
                throw new NoSuchElementException();
            }
            this.f18925h = i10 + 1;
            return AbstractC5048h.this.mo19960m(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18925h < this.f18926i;
        }
    }

    /* renamed from: v0.h$b */
    /* loaded from: classes.dex */
    public static class b implements Comparator<AbstractC5048h> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(AbstractC5048h abstractC5048h, AbstractC5048h abstractC5048h2) {
            g it = abstractC5048h.iterator();
            g it2 = abstractC5048h2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(AbstractC5048h.m19956w(it.mo19971b()), AbstractC5048h.m19956w(it2.mo19971b()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(abstractC5048h.size(), abstractC5048h2.size());
        }
    }

    /* renamed from: v0.h$c */
    /* loaded from: classes.dex */
    public static abstract class c implements g {
        @Override // java.util.Iterator
        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(mo19971b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: v0.h$d */
    /* loaded from: classes.dex */
    public static final class d implements f {
        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        @Override // p301v0.AbstractC5048h.f
        /* renamed from: a */
        public byte[] mo19974a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* renamed from: v0.h$e */
    /* loaded from: classes.dex */
    public static final class e extends j {

        /* renamed from: m */
        public final int f18928m;

        /* renamed from: n */
        public final int f18929n;

        public e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC5048h.m19951d(i10, i10 + i11, bArr.length);
            this.f18928m = i10;
            this.f18929n = i11;
        }

        @Override // p301v0.AbstractC5048h.j
        /* renamed from: G */
        public int mo19975G() {
            return this.f18928m;
        }

        @Override // p301v0.AbstractC5048h.j, p301v0.AbstractC5048h
        /* renamed from: b */
        public byte mo19958b(int i10) {
            AbstractC5048h.m19950c(i10, size());
            return this.f18932l[this.f18928m + i10];
        }

        @Override // p301v0.AbstractC5048h.j, p301v0.AbstractC5048h
        /* renamed from: k */
        public void mo19959k(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f18932l, mo19975G() + i10, bArr, i11, i12);
        }

        @Override // p301v0.AbstractC5048h.j, p301v0.AbstractC5048h
        /* renamed from: m */
        public byte mo19960m(int i10) {
            return this.f18932l[this.f18928m + i10];
        }

        @Override // p301v0.AbstractC5048h.j, p301v0.AbstractC5048h
        public int size() {
            return this.f18929n;
        }
    }

    /* renamed from: v0.h$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        byte[] mo19974a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: v0.h$g */
    /* loaded from: classes.dex */
    public interface g extends Iterator<Byte> {
        /* renamed from: b */
        byte mo19971b();
    }

    /* renamed from: v0.h$h */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a */
        public final AbstractC5057k f18930a;

        /* renamed from: b */
        public final byte[] f18931b;

        public h(int i10) {
            byte[] bArr = new byte[i10];
            this.f18931b = bArr;
            this.f18930a = AbstractC5057k.m20199g0(bArr);
        }

        public /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        /* renamed from: a */
        public AbstractC5048h m19976a() {
            this.f18930a.m20247c();
            return new j(this.f18931b);
        }

        /* renamed from: b */
        public AbstractC5057k m19977b() {
            return this.f18930a;
        }
    }

    /* renamed from: v0.h$i */
    /* loaded from: classes.dex */
    public static abstract class i extends AbstractC5048h {
        @Override // p301v0.AbstractC5048h, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* renamed from: v0.h$j */
    /* loaded from: classes.dex */
    public static class j extends i {

        /* renamed from: l */
        public final byte[] f18932l;

        public j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f18932l = bArr;
        }

        @Override // p301v0.AbstractC5048h
        /* renamed from: D */
        public final void mo19957D(AbstractC5045g abstractC5045g) {
            abstractC5045g.mo19937a(this.f18932l, mo19975G(), size());
        }

        /* renamed from: E */
        public final boolean m19978E(AbstractC5048h abstractC5048h, int i10, int i11) {
            if (i11 > abstractC5048h.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC5048h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC5048h.size());
            }
            if (!(abstractC5048h instanceof j)) {
                return abstractC5048h.mo19966u(i10, i12).equals(mo19966u(0, i11));
            }
            j jVar = (j) abstractC5048h;
            byte[] bArr = this.f18932l;
            byte[] bArr2 = jVar.f18932l;
            int mo19975G = mo19975G() + i11;
            int mo19975G2 = mo19975G();
            int mo19975G3 = jVar.mo19975G() + i10;
            while (mo19975G2 < mo19975G) {
                if (bArr[mo19975G2] != bArr2[mo19975G3]) {
                    return false;
                }
                mo19975G2++;
                mo19975G3++;
            }
            return true;
        }

        /* renamed from: G */
        public int mo19975G() {
            return 0;
        }

        @Override // p301v0.AbstractC5048h
        /* renamed from: b */
        public byte mo19958b(int i10) {
            return this.f18932l[i10];
        }

        @Override // p301v0.AbstractC5048h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC5048h) || size() != ((AbstractC5048h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int m19965t = m19965t();
            int m19965t2 = jVar.m19965t();
            if (m19965t == 0 || m19965t2 == 0 || m19965t == m19965t2) {
                return m19978E(jVar, 0, size());
            }
            return false;
        }

        @Override // p301v0.AbstractC5048h
        /* renamed from: k */
        public void mo19959k(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f18932l, i10, bArr, i11, i12);
        }

        @Override // p301v0.AbstractC5048h
        /* renamed from: m */
        public byte mo19960m(int i10) {
            return this.f18932l[i10];
        }

        @Override // p301v0.AbstractC5048h
        /* renamed from: n */
        public final boolean mo19961n() {
            int mo19975G = mo19975G();
            return C5083s1.m20541n(this.f18932l, mo19975G, size() + mo19975G);
        }

        @Override // p301v0.AbstractC5048h
        /* renamed from: q */
        public final AbstractC5051i mo19963q() {
            return AbstractC5051i.m19994j(this.f18932l, mo19975G(), size(), true);
        }

        @Override // p301v0.AbstractC5048h
        /* renamed from: s */
        public final int mo19964s(int i10, int i11, int i12) {
            return C5028a0.m19797i(i10, this.f18932l, mo19975G() + i11, i12);
        }

        @Override // p301v0.AbstractC5048h
        public int size() {
            return this.f18932l.length;
        }

        @Override // p301v0.AbstractC5048h
        /* renamed from: u */
        public final AbstractC5048h mo19966u(int i10, int i11) {
            int m19951d = AbstractC5048h.m19951d(i10, i11, size());
            return m19951d == 0 ? AbstractC5048h.f18921i : new e(this.f18932l, mo19975G() + i10, m19951d);
        }

        @Override // p301v0.AbstractC5048h
        /* renamed from: y */
        public final String mo19969y(Charset charset) {
            return new String(this.f18932l, mo19975G(), size(), charset);
        }
    }

    /* renamed from: v0.h$k */
    /* loaded from: classes.dex */
    public static final class k implements f {
        public k() {
        }

        public /* synthetic */ k(a aVar) {
            this();
        }

        @Override // p301v0.AbstractC5048h.f
        /* renamed from: a */
        public byte[] mo19974a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f18922j = C5036d.m19830c() ? new k(null) : new d(null);
        f18923k = new b();
    }

    /* renamed from: B */
    public static AbstractC5048h m19947B(byte[] bArr) {
        return new j(bArr);
    }

    /* renamed from: C */
    public static AbstractC5048h m19948C(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    /* renamed from: c */
    public static void m19950c(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    /* renamed from: d */
    public static int m19951d(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    /* renamed from: e */
    public static AbstractC5048h m19952e(byte[] bArr) {
        return m19953h(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public static AbstractC5048h m19953h(byte[] bArr, int i10, int i11) {
        m19951d(i10, i10 + i11, bArr.length);
        return new j(f18922j.mo19974a(bArr, i10, i11));
    }

    /* renamed from: j */
    public static AbstractC5048h m19954j(String str) {
        return new j(str.getBytes(C5028a0.f18862a));
    }

    /* renamed from: p */
    public static h m19955p(int i10) {
        return new h(i10, null);
    }

    /* renamed from: w */
    public static int m19956w(byte b10) {
        return b10 & 255;
    }

    /* renamed from: D */
    public abstract void mo19957D(AbstractC5045g abstractC5045g);

    /* renamed from: b */
    public abstract byte mo19958b(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f18924h;
        if (i10 == 0) {
            int size = size();
            i10 = mo19964s(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f18924h = i10;
        }
        return i10;
    }

    /* renamed from: k */
    public abstract void mo19959k(byte[] bArr, int i10, int i11, int i12);

    /* renamed from: m */
    public abstract byte mo19960m(int i10);

    /* renamed from: n */
    public abstract boolean mo19961n();

    @Override // java.lang.Iterable
    /* renamed from: o */
    public g iterator() {
        return new a();
    }

    /* renamed from: q */
    public abstract AbstractC5051i mo19963q();

    /* renamed from: s */
    public abstract int mo19964s(int i10, int i11, int i12);

    public abstract int size();

    /* renamed from: t */
    public final int m19965t() {
        return this.f18924h;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* renamed from: u */
    public abstract AbstractC5048h mo19966u(int i10, int i11);

    /* renamed from: v */
    public final byte[] m19967v() {
        int size = size();
        if (size == 0) {
            return C5028a0.f18864c;
        }
        byte[] bArr = new byte[size];
        mo19959k(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: x */
    public final String m19968x(Charset charset) {
        return size() == 0 ? "" : mo19969y(charset);
    }

    /* renamed from: y */
    public abstract String mo19969y(Charset charset);

    /* renamed from: z */
    public final String m19970z() {
        return m19968x(C5028a0.f18862a);
    }
}
