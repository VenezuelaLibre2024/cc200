package p090g0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: g0.k */
/* loaded from: classes.dex */
public final class C1951k implements InterfaceC1952l {

    /* renamed from: c */
    public static final Locale[] f7761c = new Locale[0];

    /* renamed from: d */
    public static final Locale f7762d = new Locale("en", "XA");

    /* renamed from: e */
    public static final Locale f7763e = new Locale("ar", "XB");

    /* renamed from: f */
    public static final Locale f7764f = C1950j.m7864b("en-Latn");

    /* renamed from: a */
    public final Locale[] f7765a;

    /* renamed from: b */
    public final String f7766b;

    public C1951k(Locale... localeArr) {
        String sb2;
        if (localeArr.length == 0) {
            this.f7765a = f7761c;
            sb2 = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb3 = new StringBuilder();
            for (int i10 = 0; i10 < localeArr.length; i10++) {
                Locale locale = localeArr[i10];
                if (locale == null) {
                    throw new NullPointerException("list[" + i10 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m7872b(sb3, locale2);
                    if (i10 < localeArr.length - 1) {
                        sb3.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f7765a = (Locale[]) arrayList.toArray(new Locale[0]);
            sb2 = sb3.toString();
        }
        this.f7766b = sb2;
    }

    /* renamed from: b */
    public static void m7872b(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb2.append('-');
        sb2.append(locale.getCountry());
    }

    @Override // p090g0.InterfaceC1952l
    /* renamed from: a */
    public Object mo7873a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1951k)) {
            return false;
        }
        Locale[] localeArr = ((C1951k) obj).f7765a;
        if (this.f7765a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f7765a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // p090g0.InterfaceC1952l
    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f7765a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        for (Locale locale : this.f7765a) {
            i10 = (i10 * 31) + locale.hashCode();
        }
        return i10;
    }

    @Override // p090g0.InterfaceC1952l
    public int size() {
        return this.f7765a.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f7765a;
            if (i10 >= localeArr.length) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(localeArr[i10]);
            if (i10 < this.f7765a.length - 1) {
                sb2.append(',');
            }
            i10++;
        }
    }
}
