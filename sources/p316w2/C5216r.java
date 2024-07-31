package p316w2;

import java.util.Map;

/* renamed from: w2.r */
/* loaded from: classes.dex */
public class C5216r {

    /* renamed from: a */
    public final EnumC5210l f19774a;

    /* renamed from: b */
    public final long f19775b;

    /* renamed from: c */
    public final long f19776c;

    /* renamed from: d */
    public final boolean f19777d;

    public C5216r(EnumC5210l enumC5210l, long j10, long j11, boolean z10) {
        this.f19774a = enumC5210l;
        this.f19775b = j10;
        this.f19776c = j11;
        this.f19777d = z10;
    }

    /* renamed from: e */
    public static C5216r m21103e(Map<String, Object> map) {
        if (map == null) {
            return new C5216r(EnumC5210l.best, 0L, 5000L, false);
        }
        Integer num = (Integer) map.get("accuracy");
        Integer num2 = (Integer) map.get("distanceFilter");
        Integer num3 = (Integer) map.get("timeInterval");
        Boolean bool = (Boolean) map.get("useMSLAltitude");
        EnumC5210l enumC5210l = EnumC5210l.best;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                enumC5210l = EnumC5210l.lowest;
            } else if (intValue == 1) {
                enumC5210l = EnumC5210l.low;
            } else if (intValue == 2) {
                enumC5210l = EnumC5210l.medium;
            } else if (intValue == 3) {
                enumC5210l = EnumC5210l.high;
            } else if (intValue == 5) {
                enumC5210l = EnumC5210l.bestForNavigation;
            }
        }
        return new C5216r(enumC5210l, num2 != null ? num2.intValue() : 0L, num3 != null ? num3.intValue() : 5000L, bool != null && bool.booleanValue());
    }

    /* renamed from: a */
    public EnumC5210l m21104a() {
        return this.f19774a;
    }

    /* renamed from: b */
    public long m21105b() {
        return this.f19775b;
    }

    /* renamed from: c */
    public long m21106c() {
        return this.f19776c;
    }

    /* renamed from: d */
    public boolean m21107d() {
        return this.f19777d;
    }
}
