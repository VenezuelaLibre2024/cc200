package p126i7;

/* renamed from: i7.r */
/* loaded from: classes.dex */
public final class C2645r {
    /* renamed from: a */
    public static int m10733a(int i10, double d10) {
        int max = Math.max(i10, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d10 * highestOneBit))) {
            return highestOneBit;
        }
        int i11 = highestOneBit << 1;
        if (i11 > 0) {
            return i11;
        }
        return 1073741824;
    }

    /* renamed from: b */
    public static int m10734b(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    /* renamed from: c */
    public static int m10735c(Object obj) {
        return m10734b(obj == null ? 0 : obj.hashCode());
    }
}
