package p185m9;

import p269s8.InterfaceC4555f;

/* renamed from: m9.d */
/* loaded from: classes.dex */
public enum EnumC3561d implements InterfaceC4555f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* renamed from: h */
    public final int f12536h;

    EnumC3561d(int i10) {
        this.f12536h = i10;
    }

    @Override // p269s8.InterfaceC4555f
    /* renamed from: a */
    public int mo13235a() {
        return this.f12536h;
    }
}
