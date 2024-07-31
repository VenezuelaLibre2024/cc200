package p185m9;

import p269s8.InterfaceC4555f;

/* renamed from: m9.s */
/* loaded from: classes.dex */
public enum EnumC3584s implements InterfaceC4555f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: h */
    public final int f12600h;

    EnumC3584s(int i10) {
        this.f12600h = i10;
    }

    @Override // p269s8.InterfaceC4555f
    /* renamed from: a */
    public int mo13235a() {
        return this.f12600h;
    }
}
