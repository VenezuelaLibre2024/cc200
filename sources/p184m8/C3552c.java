package p184m8;

import java.util.HashMap;

/* renamed from: m8.c */
/* loaded from: classes.dex */
public class C3552c implements InterfaceC3553d {

    /* renamed from: a */
    public final int f12450a;

    public C3552c(int i10) {
        this.f12450a = i10;
    }

    /* renamed from: b */
    public static boolean m13198b(StackTraceElement[] stackTraceElementArr, int i10, int i11) {
        int i12 = i11 - i10;
        if (i11 + i12 > stackTraceElementArr.length) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!stackTraceElementArr[i10 + i13].equals(stackTraceElementArr[i11 + i13])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static StackTraceElement[] m13199c(StackTraceElement[] stackTraceElementArr, int i10) {
        int i11;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (i12 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i12];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num == null || !m13198b(stackTraceElementArr, num.intValue(), i12)) {
                stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                i13++;
                i14 = 1;
                i11 = i12;
            } else {
                int intValue = i12 - num.intValue();
                if (i14 < i10) {
                    System.arraycopy(stackTraceElementArr, i12, stackTraceElementArr2, i13, intValue);
                    i13 += intValue;
                    i14++;
                }
                i11 = (intValue - 1) + i12;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i12));
            i12 = i11 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i13];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i13);
        return stackTraceElementArr3;
    }

    @Override // p184m8.InterfaceC3553d
    /* renamed from: a */
    public StackTraceElement[] mo13197a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] m13199c = m13199c(stackTraceElementArr, this.f12450a);
        return m13199c.length < stackTraceElementArr.length ? m13199c : stackTraceElementArr;
    }
}
