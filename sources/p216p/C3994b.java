package p216p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: p.b */
/* loaded from: classes.dex */
public class C3994b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: h */
    public c<K, V> f14380h;

    /* renamed from: i */
    public c<K, V> f14381i;

    /* renamed from: j */
    public final WeakHashMap<f<K, V>, Boolean> f14382j = new WeakHashMap<>();

    /* renamed from: k */
    public int f14383k = 0;

    /* renamed from: p.b$a */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p216p.C3994b.e
        /* renamed from: c */
        public c<K, V> mo15131c(c<K, V> cVar) {
            return cVar.f14387k;
        }

        @Override // p216p.C3994b.e
        /* renamed from: d */
        public c<K, V> mo15132d(c<K, V> cVar) {
            return cVar.f14386j;
        }
    }

    /* renamed from: p.b$b */
    /* loaded from: classes.dex */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p216p.C3994b.e
        /* renamed from: c */
        public c<K, V> mo15131c(c<K, V> cVar) {
            return cVar.f14386j;
        }

        @Override // p216p.C3994b.e
        /* renamed from: d */
        public c<K, V> mo15132d(c<K, V> cVar) {
            return cVar.f14387k;
        }
    }

    /* renamed from: p.b$c */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: h */
        public final K f14384h;

        /* renamed from: i */
        public final V f14385i;

        /* renamed from: j */
        public c<K, V> f14386j;

        /* renamed from: k */
        public c<K, V> f14387k;

        public c(K k10, V v10) {
            this.f14384h = k10;
            this.f14385i = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f14384h.equals(cVar.f14384h) && this.f14385i.equals(cVar.f14385i);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f14384h;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f14385i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f14384h.hashCode() ^ this.f14385i.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f14384h + "=" + this.f14385i;
        }
    }

    /* renamed from: p.b$d */
    /* loaded from: classes.dex */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: h */
        public c<K, V> f14388h;

        /* renamed from: i */
        public boolean f14389i = true;

        public d() {
        }

        @Override // p216p.C3994b.f
        /* renamed from: a */
        public void mo15133a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f14388h;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f14387k;
                this.f14388h = cVar3;
                this.f14389i = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f14389i) {
                this.f14389i = false;
                cVar = C3994b.this.f14380h;
            } else {
                c<K, V> cVar2 = this.f14388h;
                cVar = cVar2 != null ? cVar2.f14386j : null;
            }
            this.f14388h = cVar;
            return this.f14388h;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f14389i) {
                return C3994b.this.f14380h != null;
            }
            c<K, V> cVar = this.f14388h;
            return (cVar == null || cVar.f14386j == null) ? false : true;
        }
    }

    /* renamed from: p.b$e */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: h */
        public c<K, V> f14391h;

        /* renamed from: i */
        public c<K, V> f14392i;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f14391h = cVar2;
            this.f14392i = cVar;
        }

        @Override // p216p.C3994b.f
        /* renamed from: a */
        public void mo15133a(c<K, V> cVar) {
            if (this.f14391h == cVar && cVar == this.f14392i) {
                this.f14392i = null;
                this.f14391h = null;
            }
            c<K, V> cVar2 = this.f14391h;
            if (cVar2 == cVar) {
                this.f14391h = mo15131c(cVar2);
            }
            if (this.f14392i == cVar) {
                this.f14392i = m15136f();
            }
        }

        /* renamed from: c */
        public abstract c<K, V> mo15131c(c<K, V> cVar);

        /* renamed from: d */
        public abstract c<K, V> mo15132d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f14392i;
            this.f14392i = m15136f();
            return cVar;
        }

        /* renamed from: f */
        public final c<K, V> m15136f() {
            c<K, V> cVar = this.f14392i;
            c<K, V> cVar2 = this.f14391h;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo15132d(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14392i != null;
        }
    }

    /* renamed from: p.b$f */
    /* loaded from: classes.dex */
    public static abstract class f<K, V> {
        /* renamed from: a */
        public abstract void mo15133a(c<K, V> cVar);
    }

    /* renamed from: a */
    public Map.Entry<K, V> m15127a() {
        return this.f14380h;
    }

    /* renamed from: b */
    public c<K, V> mo15123b(K k10) {
        c<K, V> cVar = this.f14380h;
        while (cVar != null && !cVar.f14384h.equals(k10)) {
            cVar = cVar.f14386j;
        }
        return cVar;
    }

    /* renamed from: c */
    public C3994b<K, V>.d m15128c() {
        C3994b<K, V>.d dVar = new d();
        this.f14382j.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: d */
    public Map.Entry<K, V> m15129d() {
        return this.f14381i;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.f14381i, this.f14380h);
        this.f14382j.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* renamed from: e */
    public c<K, V> m15130e(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f14383k++;
        c<K, V> cVar2 = this.f14381i;
        if (cVar2 == null) {
            this.f14380h = cVar;
        } else {
            cVar2.f14386j = cVar;
            cVar.f14387k = cVar2;
        }
        this.f14381i = cVar;
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3994b)) {
            return false;
        }
        C3994b c3994b = (C3994b) obj;
        if (size() != c3994b.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c3994b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* renamed from: h */
    public V mo15124h(K k10, V v10) {
        c<K, V> mo15123b = mo15123b(k10);
        if (mo15123b != null) {
            return mo15123b.f14385i;
        }
        m15130e(k10, v10);
        return null;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().hashCode();
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f14380h, this.f14381i);
        this.f14382j.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* renamed from: j */
    public V mo15125j(K k10) {
        c<K, V> mo15123b = mo15123b(k10);
        if (mo15123b == null) {
            return null;
        }
        this.f14383k--;
        if (!this.f14382j.isEmpty()) {
            Iterator<f<K, V>> it = this.f14382j.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo15133a(mo15123b);
            }
        }
        c<K, V> cVar = mo15123b.f14387k;
        c<K, V> cVar2 = mo15123b.f14386j;
        if (cVar != null) {
            cVar.f14386j = cVar2;
        } else {
            this.f14380h = cVar2;
        }
        c<K, V> cVar3 = mo15123b.f14386j;
        if (cVar3 != null) {
            cVar3.f14387k = cVar;
        } else {
            this.f14381i = cVar;
        }
        mo15123b.f14386j = null;
        mo15123b.f14387k = null;
        return mo15123b.f14385i;
    }

    public int size() {
        return this.f14383k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
