package za;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import p211oa.C3964a;

/* renamed from: za.j */
/* loaded from: classes.dex */
public abstract class AbstractC6106j {

    /* renamed from: a */
    public final C3964a f22628a;

    /* renamed from: b */
    public final C6115s f22629b;

    public AbstractC6106j(C3964a c3964a) {
        this.f22628a = c3964a;
        this.f22629b = new C6115s(c3964a);
    }

    /* renamed from: a */
    public static AbstractC6106j m24356a(C3964a c3964a) {
        if (c3964a.m15022e(1)) {
            return new C6103g(c3964a);
        }
        if (!c3964a.m15022e(2)) {
            return new C6107k(c3964a);
        }
        int m24384g = C6115s.m24384g(c3964a, 1, 4);
        if (m24384g == 4) {
            return new C6097a(c3964a);
        }
        if (m24384g == 5) {
            return new C6098b(c3964a);
        }
        int m24384g2 = C6115s.m24384g(c3964a, 1, 5);
        if (m24384g2 == 12) {
            return new C6099c(c3964a);
        }
        if (m24384g2 == 13) {
            return new C6100d(c3964a);
        }
        switch (C6115s.m24384g(c3964a, 1, 7)) {
            case 56:
                return new C6101e(c3964a, "310", "11");
            case C1417R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                return new C6101e(c3964a, "320", "11");
            case C1417R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return new C6101e(c3964a, "310", "13");
            case C1417R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                return new C6101e(c3964a, "320", "13");
            case C1417R.styleable.AppCompatTheme_controlBackground /* 60 */:
                return new C6101e(c3964a, "310", "15");
            case C1417R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                return new C6101e(c3964a, "320", "15");
            case C1417R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                return new C6101e(c3964a, "310", "17");
            case C1417R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                return new C6101e(c3964a, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: " + c3964a);
        }
    }

    /* renamed from: b */
    public final C6115s m24357b() {
        return this.f22629b;
    }

    /* renamed from: c */
    public final C3964a m24358c() {
        return this.f22628a;
    }

    /* renamed from: d */
    public abstract String mo24350d();
}
