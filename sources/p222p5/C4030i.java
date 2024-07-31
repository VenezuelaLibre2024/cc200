package p222p5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: p5.i */
/* loaded from: classes.dex */
public final class C4030i<E> implements Iterable<E> {

    /* renamed from: h */
    public final Object f14486h = new Object();

    /* renamed from: i */
    public final Map<E, Integer> f14487i = new HashMap();

    /* renamed from: j */
    public Set<E> f14488j = Collections.emptySet();

    /* renamed from: k */
    public List<E> f14489k = Collections.emptyList();

    /* renamed from: a */
    public void m15334a(E e10) {
        synchronized (this.f14486h) {
            ArrayList arrayList = new ArrayList(this.f14489k);
            arrayList.add(e10);
            this.f14489k = Collections.unmodifiableList(arrayList);
            Integer num = this.f14487i.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f14488j);
                hashSet.add(e10);
                this.f14488j = Collections.unmodifiableSet(hashSet);
            }
            this.f14487i.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    /* renamed from: b */
    public int m15335b(E e10) {
        int intValue;
        synchronized (this.f14486h) {
            intValue = this.f14487i.containsKey(e10) ? this.f14487i.get(e10).intValue() : 0;
        }
        return intValue;
    }

    /* renamed from: c */
    public void m15336c(E e10) {
        synchronized (this.f14486h) {
            Integer num = this.f14487i.get(e10);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f14489k);
            arrayList.remove(e10);
            this.f14489k = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f14487i.remove(e10);
                HashSet hashSet = new HashSet(this.f14488j);
                hashSet.remove(e10);
                this.f14488j = Collections.unmodifiableSet(hashSet);
            } else {
                this.f14487i.put(e10, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    /* renamed from: g */
    public Set<E> m15337g() {
        Set<E> set;
        synchronized (this.f14486h) {
            set = this.f14488j;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f14486h) {
            it = this.f14489k.iterator();
        }
        return it;
    }
}
