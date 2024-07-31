package za;

import java.util.HashMap;
import java.util.Map;
import p129ia.C2678j;

/* renamed from: za.r */
/* loaded from: classes.dex */
public final class C6114r {

    /* renamed from: a */
    public static final Map<String, a> f22645a;

    /* renamed from: b */
    public static final Map<String, a> f22646b;

    /* renamed from: c */
    public static final Map<String, a> f22647c;

    /* renamed from: d */
    public static final Map<String, a> f22648d;

    /* renamed from: za.r$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final boolean f22649a;

        /* renamed from: b */
        public final int f22650b;

        public a(boolean z10, int i10) {
            this.f22649a = z10;
            this.f22650b = i10;
        }

        /* renamed from: a */
        public static a m24382a(int i10) {
            return new a(false, i10);
        }

        /* renamed from: b */
        public static a m24383b(int i10) {
            return new a(true, i10);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f22645a = hashMap;
        hashMap.put("00", a.m24382a(18));
        hashMap.put("01", a.m24382a(14));
        hashMap.put("02", a.m24382a(14));
        hashMap.put("10", a.m24383b(20));
        hashMap.put("11", a.m24382a(6));
        hashMap.put("12", a.m24382a(6));
        hashMap.put("13", a.m24382a(6));
        hashMap.put("15", a.m24382a(6));
        hashMap.put("17", a.m24382a(6));
        hashMap.put("20", a.m24382a(2));
        hashMap.put("21", a.m24383b(20));
        hashMap.put("22", a.m24383b(29));
        hashMap.put("30", a.m24383b(8));
        hashMap.put("37", a.m24383b(8));
        for (int i10 = 90; i10 <= 99; i10++) {
            f22645a.put(String.valueOf(i10), a.m24383b(30));
        }
        HashMap hashMap2 = new HashMap();
        f22646b = hashMap2;
        hashMap2.put("240", a.m24383b(30));
        hashMap2.put("241", a.m24383b(30));
        hashMap2.put("242", a.m24383b(6));
        hashMap2.put("250", a.m24383b(30));
        hashMap2.put("251", a.m24383b(30));
        hashMap2.put("253", a.m24383b(17));
        hashMap2.put("254", a.m24383b(20));
        hashMap2.put("400", a.m24383b(30));
        hashMap2.put("401", a.m24383b(30));
        hashMap2.put("402", a.m24382a(17));
        hashMap2.put("403", a.m24383b(30));
        hashMap2.put("410", a.m24382a(13));
        hashMap2.put("411", a.m24382a(13));
        hashMap2.put("412", a.m24382a(13));
        hashMap2.put("413", a.m24382a(13));
        hashMap2.put("414", a.m24382a(13));
        hashMap2.put("420", a.m24383b(20));
        hashMap2.put("421", a.m24383b(15));
        hashMap2.put("422", a.m24382a(3));
        hashMap2.put("423", a.m24383b(15));
        hashMap2.put("424", a.m24382a(3));
        hashMap2.put("425", a.m24382a(3));
        hashMap2.put("426", a.m24382a(3));
        f22647c = new HashMap();
        for (int i11 = 310; i11 <= 316; i11++) {
            f22647c.put(String.valueOf(i11), a.m24382a(6));
        }
        for (int i12 = 320; i12 <= 336; i12++) {
            f22647c.put(String.valueOf(i12), a.m24382a(6));
        }
        for (int i13 = 340; i13 <= 357; i13++) {
            f22647c.put(String.valueOf(i13), a.m24382a(6));
        }
        for (int i14 = 360; i14 <= 369; i14++) {
            f22647c.put(String.valueOf(i14), a.m24382a(6));
        }
        Map<String, a> map = f22647c;
        map.put("390", a.m24383b(15));
        map.put("391", a.m24383b(18));
        map.put("392", a.m24383b(15));
        map.put("393", a.m24383b(18));
        map.put("703", a.m24383b(30));
        HashMap hashMap3 = new HashMap();
        f22648d = hashMap3;
        hashMap3.put("7001", a.m24382a(13));
        hashMap3.put("7002", a.m24383b(30));
        hashMap3.put("7003", a.m24382a(10));
        hashMap3.put("8001", a.m24382a(14));
        hashMap3.put("8002", a.m24383b(20));
        hashMap3.put("8003", a.m24383b(30));
        hashMap3.put("8004", a.m24383b(30));
        hashMap3.put("8005", a.m24382a(6));
        hashMap3.put("8006", a.m24382a(18));
        hashMap3.put("8007", a.m24383b(30));
        hashMap3.put("8008", a.m24383b(12));
        hashMap3.put("8018", a.m24382a(18));
        hashMap3.put("8020", a.m24383b(25));
        hashMap3.put("8100", a.m24382a(6));
        hashMap3.put("8101", a.m24382a(10));
        hashMap3.put("8102", a.m24382a(2));
        hashMap3.put("8110", a.m24383b(70));
        hashMap3.put("8200", a.m24383b(70));
    }

    /* renamed from: a */
    public static String m24379a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw C2678j.m10895a();
        }
        a aVar = f22645a.get(str.substring(0, 2));
        if (aVar != null) {
            boolean z10 = aVar.f22649a;
            int i10 = aVar.f22650b;
            return z10 ? m24381c(2, i10, str) : m24380b(2, i10, str);
        }
        if (str.length() < 3) {
            throw C2678j.m10895a();
        }
        String substring = str.substring(0, 3);
        a aVar2 = f22646b.get(substring);
        if (aVar2 != null) {
            return aVar2.f22649a ? m24381c(3, aVar2.f22650b, str) : m24380b(3, aVar2.f22650b, str);
        }
        if (str.length() < 4) {
            throw C2678j.m10895a();
        }
        a aVar3 = f22647c.get(substring);
        if (aVar3 != null) {
            boolean z11 = aVar3.f22649a;
            int i11 = aVar3.f22650b;
            return z11 ? m24381c(4, i11, str) : m24380b(4, i11, str);
        }
        a aVar4 = f22648d.get(str.substring(0, 4));
        if (aVar4 == null) {
            throw C2678j.m10895a();
        }
        boolean z12 = aVar4.f22649a;
        int i12 = aVar4.f22650b;
        return z12 ? m24381c(4, i12, str) : m24380b(4, i12, str);
    }

    /* renamed from: b */
    public static String m24380b(int i10, int i11, String str) {
        if (str.length() < i10) {
            throw C2678j.m10895a();
        }
        String substring = str.substring(0, i10);
        int i12 = i11 + i10;
        if (str.length() < i12) {
            throw C2678j.m10895a();
        }
        String substring2 = str.substring(i10, i12);
        String str2 = '(' + substring + ')' + substring2;
        String m24379a = m24379a(str.substring(i12));
        if (m24379a == null) {
            return str2;
        }
        return str2 + m24379a;
    }

    /* renamed from: c */
    public static String m24381c(int i10, int i11, String str) {
        String substring = str.substring(0, i10);
        int min = Math.min(str.length(), i11 + i10);
        String substring2 = str.substring(i10, min);
        String str2 = '(' + substring + ')' + substring2;
        String m24379a = m24379a(str.substring(min));
        if (m24379a == null) {
            return str2;
        }
        return str2 + m24379a;
    }
}
