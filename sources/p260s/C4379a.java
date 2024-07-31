package p260s;

import android.os.Bundle;

/* renamed from: s.a */
/* loaded from: classes.dex */
public final class C4379a {

    /* renamed from: a */
    public final Integer f16051a;

    /* renamed from: b */
    public final Integer f16052b;

    /* renamed from: c */
    public final Integer f16053c;

    /* renamed from: d */
    public final Integer f16054d;

    /* renamed from: s.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public Integer f16055a;

        /* renamed from: b */
        public Integer f16056b;

        /* renamed from: c */
        public Integer f16057c;

        /* renamed from: d */
        public Integer f16058d;

        /* renamed from: a */
        public C4379a m16937a() {
            return new C4379a(this.f16055a, this.f16056b, this.f16057c, this.f16058d);
        }

        /* renamed from: b */
        public a m16938b(int i10) {
            this.f16055a = Integer.valueOf(i10 | (-16777216));
            return this;
        }
    }

    public C4379a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f16051a = num;
        this.f16052b = num2;
        this.f16053c = num3;
        this.f16054d = num4;
    }

    /* renamed from: a */
    public Bundle m16936a() {
        Bundle bundle = new Bundle();
        Integer num = this.f16051a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f16052b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f16053c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f16054d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
