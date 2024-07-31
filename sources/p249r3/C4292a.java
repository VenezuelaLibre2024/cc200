package p249r3;

import android.util.SparseArray;
import java.util.HashMap;
import p045d3.EnumC1533e;

/* renamed from: r3.a */
/* loaded from: classes.dex */
public final class C4292a {

    /* renamed from: a */
    public static SparseArray<EnumC1533e> f15574a = new SparseArray<>();

    /* renamed from: b */
    public static HashMap<EnumC1533e, Integer> f15575b;

    static {
        HashMap<EnumC1533e, Integer> hashMap = new HashMap<>();
        f15575b = hashMap;
        hashMap.put(EnumC1533e.DEFAULT, 0);
        f15575b.put(EnumC1533e.VERY_LOW, 1);
        f15575b.put(EnumC1533e.HIGHEST, 2);
        for (EnumC1533e enumC1533e : f15575b.keySet()) {
            f15574a.append(f15575b.get(enumC1533e).intValue(), enumC1533e);
        }
    }

    /* renamed from: a */
    public static int m16516a(EnumC1533e enumC1533e) {
        Integer num = f15575b.get(enumC1533e);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC1533e);
    }

    /* renamed from: b */
    public static EnumC1533e m16517b(int i10) {
        EnumC1533e enumC1533e = f15574a.get(i10);
        if (enumC1533e != null) {
            return enumC1533e;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
