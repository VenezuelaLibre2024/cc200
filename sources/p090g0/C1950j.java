package p090g0;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: g0.j */
/* loaded from: classes.dex */
public final class C1950j {

    /* renamed from: b */
    public static final C1950j f7759b = m7863a(new Locale[0]);

    /* renamed from: a */
    public final InterfaceC1952l f7760a;

    /* renamed from: g0.j$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static LocaleList m7869a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        public static LocaleList m7870b() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: c */
        public static LocaleList m7871c() {
            return LocaleList.getDefault();
        }
    }

    public C1950j(InterfaceC1952l interfaceC1952l) {
        this.f7760a = interfaceC1952l;
    }

    /* renamed from: a */
    public static C1950j m7863a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? m7866f(a.m7869a(localeArr)) : new C1950j(new C1951k(localeArr));
    }

    /* renamed from: b */
    public static Locale m7864b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: d */
    public static C1950j m7865d() {
        return Build.VERSION.SDK_INT >= 24 ? m7866f(a.m7870b()) : m7863a(Locale.getDefault());
    }

    /* renamed from: f */
    public static C1950j m7866f(LocaleList localeList) {
        return new C1950j(new C1953m(localeList));
    }

    /* renamed from: c */
    public Locale m7867c(int i10) {
        return this.f7760a.get(i10);
    }

    /* renamed from: e */
    public int m7868e() {
        return this.f7760a.size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1950j) && this.f7760a.equals(((C1950j) obj).f7760a);
    }

    public int hashCode() {
        return this.f7760a.hashCode();
    }

    public String toString() {
        return this.f7760a.toString();
    }
}
