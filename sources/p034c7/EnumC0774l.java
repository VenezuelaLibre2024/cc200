package p034c7;

/* renamed from: c7.l */
/* loaded from: classes.dex */
public enum EnumC0774l {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    FAILSAFE('9');


    /* renamed from: h */
    public final char f3265h;

    EnumC0774l(char c10) {
        this.f3265h = c10;
    }

    /* renamed from: c */
    public static EnumC0774l m3526c(char c10) {
        for (EnumC0774l enumC0774l : values()) {
            if (enumC0774l.f3265h == c10) {
                return enumC0774l;
            }
        }
        return UNSET;
    }
}
