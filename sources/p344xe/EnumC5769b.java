package p344xe;

/* renamed from: xe.b */
/* loaded from: classes2.dex */
public enum EnumC5769b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* renamed from: h */
    public final int f21365h;

    EnumC5769b(int i10) {
        this.f21365h = i10;
    }

    /* renamed from: b */
    public static EnumC5769b m22912b(int i10) {
        for (EnumC5769b enumC5769b : values()) {
            if (enumC5769b.f21365h == i10) {
                return enumC5769b;
            }
        }
        return null;
    }
}
