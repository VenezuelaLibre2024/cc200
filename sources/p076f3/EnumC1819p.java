package p076f3;

import android.util.SparseArray;

/* renamed from: f3.p */
/* loaded from: classes.dex */
public enum EnumC1819p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* renamed from: o */
    public static final SparseArray<EnumC1819p> f6782o;

    /* renamed from: h */
    public final int f6784h;

    static {
        EnumC1819p enumC1819p = DEFAULT;
        EnumC1819p enumC1819p2 = UNMETERED_ONLY;
        EnumC1819p enumC1819p3 = UNMETERED_OR_DAILY;
        EnumC1819p enumC1819p4 = FAST_IF_RADIO_AWAKE;
        EnumC1819p enumC1819p5 = NEVER;
        EnumC1819p enumC1819p6 = UNRECOGNIZED;
        SparseArray<EnumC1819p> sparseArray = new SparseArray<>();
        f6782o = sparseArray;
        sparseArray.put(0, enumC1819p);
        sparseArray.put(1, enumC1819p2);
        sparseArray.put(2, enumC1819p3);
        sparseArray.put(3, enumC1819p4);
        sparseArray.put(4, enumC1819p5);
        sparseArray.put(-1, enumC1819p6);
    }

    EnumC1819p(int i10) {
        this.f6784h = i10;
    }
}
