package p116he;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p343xd.C5767k;

/* renamed from: he.g0 */
/* loaded from: classes2.dex */
public final class C2528g0<T> {
    private volatile AtomicReferenceArray<T> array;

    public C2528g0(int i10) {
        this.array = new AtomicReferenceArray<>(i10);
    }

    /* renamed from: a */
    public final int m10078a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final T m10079b(int i10) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i10 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i10);
        }
        return null;
    }

    /* renamed from: c */
    public final void m10080c(int i10, T t10) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i10 < length) {
            atomicReferenceArray.set(i10, t10);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(C5767k.m22904a(i10 + 1, length * 2));
        for (int i11 = 0; i11 < length; i11++) {
            atomicReferenceArray2.set(i11, atomicReferenceArray.get(i11));
        }
        atomicReferenceArray2.set(i10, t10);
        this.array = atomicReferenceArray2;
    }
}
