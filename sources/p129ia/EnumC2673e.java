package p129ia;

import java.util.List;

/* renamed from: ia.e */
/* loaded from: classes.dex */
public enum EnumC2673e {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(InterfaceC2685q.class),
    ALLOWED_EAN_EXTENSIONS(int[].class),
    ALSO_INVERTED(Void.class);


    /* renamed from: h */
    public final Class<?> f10452h;

    EnumC2673e(Class cls) {
        this.f10452h = cls;
    }

    /* renamed from: b */
    public Class<?> m10882b() {
        return this.f10452h;
    }
}
