package p334x4;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p126i7.C2610b0;
import p222p5.C4041n0;
import p350y4.C5801b;

/* renamed from: x4.b */
/* loaded from: classes.dex */
public final class C5588b {

    /* renamed from: a */
    public final Map<String, Long> f20968a;

    /* renamed from: b */
    public final Map<Integer, Long> f20969b;

    /* renamed from: c */
    public final Map<List<Pair<String, Integer>>, C5801b> f20970c;

    /* renamed from: d */
    public final Random f20971d;

    public C5588b() {
        this(new Random());
    }

    public C5588b(Random random) {
        this.f20970c = new HashMap();
        this.f20971d = random;
        this.f20968a = new HashMap();
        this.f20969b = new HashMap();
    }

    /* renamed from: b */
    public static <T> void m22504b(T t10, long j10, Map<T, Long> map) {
        if (map.containsKey(t10)) {
            j10 = Math.max(j10, ((Long) C4041n0.m15463j(map.get(t10))).longValue());
        }
        map.put(t10, Long.valueOf(j10));
    }

    /* renamed from: d */
    public static int m22505d(C5801b c5801b, C5801b c5801b2) {
        int compare = Integer.compare(c5801b.f21757c, c5801b2.f21757c);
        return compare != 0 ? compare : c5801b.f21756b.compareTo(c5801b2.f21756b);
    }

    /* renamed from: f */
    public static int m22506f(List<C5801b> list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(list.get(i10).f21757c));
        }
        return hashSet.size();
    }

    /* renamed from: h */
    public static <T> void m22507h(long j10, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    /* renamed from: c */
    public final List<C5801b> m22508c(List<C5801b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m22507h(elapsedRealtime, this.f20968a);
        m22507h(elapsedRealtime, this.f20969b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C5801b c5801b = list.get(i10);
            if (!this.f20968a.containsKey(c5801b.f21756b) && !this.f20969b.containsKey(Integer.valueOf(c5801b.f21757c))) {
                arrayList.add(c5801b);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public void m22509e(C5801b c5801b, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        m22504b(c5801b.f21756b, elapsedRealtime, this.f20968a);
        int i10 = c5801b.f21757c;
        if (i10 != Integer.MIN_VALUE) {
            m22504b(Integer.valueOf(i10), elapsedRealtime, this.f20969b);
        }
    }

    /* renamed from: g */
    public int m22510g(List<C5801b> list) {
        HashSet hashSet = new HashSet();
        List<C5801b> m22508c = m22508c(list);
        for (int i10 = 0; i10 < m22508c.size(); i10++) {
            hashSet.add(Integer.valueOf(m22508c.get(i10).f21757c));
        }
        return hashSet.size();
    }

    /* renamed from: i */
    public void m22511i() {
        this.f20968a.clear();
        this.f20969b.clear();
        this.f20970c.clear();
    }

    /* renamed from: j */
    public C5801b m22512j(List<C5801b> list) {
        Object obj;
        List<C5801b> m22508c = m22508c(list);
        if (m22508c.size() >= 2) {
            Collections.sort(m22508c, new Comparator() { // from class: x4.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int m22505d;
                    m22505d = C5588b.m22505d((C5801b) obj2, (C5801b) obj3);
                    return m22505d;
                }
            });
            ArrayList arrayList = new ArrayList();
            int i10 = m22508c.get(0).f21757c;
            int i11 = 0;
            while (true) {
                if (i11 >= m22508c.size()) {
                    break;
                }
                C5801b c5801b = m22508c.get(i11);
                if (i10 == c5801b.f21757c) {
                    arrayList.add(new Pair(c5801b.f21756b, Integer.valueOf(c5801b.f21758d)));
                    i11++;
                } else if (arrayList.size() == 1) {
                    obj = m22508c.get(0);
                }
            }
            C5801b c5801b2 = this.f20970c.get(arrayList);
            if (c5801b2 != null) {
                return c5801b2;
            }
            C5801b m22513k = m22513k(m22508c.subList(0, arrayList.size()));
            this.f20970c.put(arrayList, m22513k);
            return m22513k;
        }
        obj = C2610b0.m10504c(m22508c, null);
        return (C5801b) obj;
    }

    /* renamed from: k */
    public final C5801b m22513k(List<C5801b> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += list.get(i11).f21758d;
        }
        int nextInt = this.f20971d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            C5801b c5801b = list.get(i13);
            i12 += c5801b.f21758d;
            if (nextInt < i12) {
                return c5801b;
            }
        }
        return (C5801b) C2610b0.m10505d(list);
    }
}
