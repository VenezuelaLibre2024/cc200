package re;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import se.C4596e;
import ve.C5169d;

/* renamed from: re.m */
/* loaded from: classes2.dex */
public final class C4365m {

    /* renamed from: j */
    public static final Pattern f15938j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f15939k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f15940l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f15941m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f15942a;

    /* renamed from: b */
    public final String f15943b;

    /* renamed from: c */
    public final long f15944c;

    /* renamed from: d */
    public final String f15945d;

    /* renamed from: e */
    public final String f15946e;

    /* renamed from: f */
    public final boolean f15947f;

    /* renamed from: g */
    public final boolean f15948g;

    /* renamed from: h */
    public final boolean f15949h;

    /* renamed from: i */
    public final boolean f15950i;

    public C4365m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f15942a = str;
        this.f15943b = str2;
        this.f15944c = j10;
        this.f15945d = str3;
        this.f15946e = str4;
        this.f15947f = z10;
        this.f15948g = z11;
        this.f15950i = z12;
        this.f15949h = z13;
    }

    /* renamed from: a */
    public static int m16770a(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: b */
    public static boolean m16771b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !C4596e.m18092L(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static re.C4365m m16772d(long r23, re.C4374v r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: re.C4365m.m16772d(long, re.v, java.lang.String):re.m");
    }

    /* renamed from: e */
    public static C4365m m16773e(C4374v c4374v, String str) {
        return m16772d(System.currentTimeMillis(), c4374v, str);
    }

    /* renamed from: f */
    public static List<C4365m> m16774f(C4374v c4374v, C4373u c4373u) {
        List<String> m16833j = c4373u.m16833j("Set-Cookie");
        int size = m16833j.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            C4365m m16773e = m16773e(c4374v, m16833j.get(i10));
            if (m16773e != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m16773e);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    /* renamed from: g */
    public static String m16775g(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String m18095c = C4596e.m18095c(str);
        if (m18095c != null) {
            return m18095c;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public static long m16776h(String str, int i10, int i11) {
        int m16770a = m16770a(str, i10, i11, false);
        Matcher matcher = f15941m.matcher(str);
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        while (m16770a < i11) {
            int m16770a2 = m16770a(str, m16770a + 1, i11, true);
            matcher.region(m16770a, m16770a2);
            if (i13 == -1 && matcher.usePattern(f15941m).matches()) {
                i13 = Integer.parseInt(matcher.group(1));
                i16 = Integer.parseInt(matcher.group(2));
                i17 = Integer.parseInt(matcher.group(3));
            } else if (i14 == -1 && matcher.usePattern(f15940l).matches()) {
                i14 = Integer.parseInt(matcher.group(1));
            } else {
                if (i15 == -1) {
                    Pattern pattern = f15939k;
                    if (matcher.usePattern(pattern).matches()) {
                        i15 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i12 == -1 && matcher.usePattern(f15938j).matches()) {
                    i12 = Integer.parseInt(matcher.group(1));
                }
            }
            m16770a = m16770a(str, m16770a2 + 1, i11, false);
        }
        if (i12 >= 70 && i12 <= 99) {
            i12 += 1900;
        }
        if (i12 >= 0 && i12 <= 69) {
            i12 += 2000;
        }
        if (i12 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i15 == -1) {
            throw new IllegalArgumentException();
        }
        if (i14 < 1 || i14 > 31) {
            throw new IllegalArgumentException();
        }
        if (i13 < 0 || i13 > 23) {
            throw new IllegalArgumentException();
        }
        if (i16 < 0 || i16 > 59) {
            throw new IllegalArgumentException();
        }
        if (i17 < 0 || i17 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(C4596e.f17238i);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i12);
        gregorianCalendar.set(2, i15 - 1);
        gregorianCalendar.set(5, i14);
        gregorianCalendar.set(11, i13);
        gregorianCalendar.set(12, i16);
        gregorianCalendar.set(13, i17);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* renamed from: i */
    public static long m16777i(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e10) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e10;
        }
    }

    /* renamed from: c */
    public String m16778c() {
        return this.f15942a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4365m)) {
            return false;
        }
        C4365m c4365m = (C4365m) obj;
        return c4365m.f15942a.equals(this.f15942a) && c4365m.f15943b.equals(this.f15943b) && c4365m.f15945d.equals(this.f15945d) && c4365m.f15946e.equals(this.f15946e) && c4365m.f15944c == this.f15944c && c4365m.f15947f == this.f15947f && c4365m.f15948g == this.f15948g && c4365m.f15949h == this.f15949h && c4365m.f15950i == this.f15950i;
    }

    public int hashCode() {
        int hashCode = (((((((527 + this.f15942a.hashCode()) * 31) + this.f15943b.hashCode()) * 31) + this.f15945d.hashCode()) * 31) + this.f15946e.hashCode()) * 31;
        long j10 = this.f15944c;
        return ((((((((hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (!this.f15947f ? 1 : 0)) * 31) + (!this.f15948g ? 1 : 0)) * 31) + (!this.f15949h ? 1 : 0)) * 31) + (!this.f15950i ? 1 : 0);
    }

    /* renamed from: j */
    public String m16779j(boolean z10) {
        String m20931a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15942a);
        sb2.append('=');
        sb2.append(this.f15943b);
        if (this.f15949h) {
            if (this.f15944c == Long.MIN_VALUE) {
                m20931a = "; max-age=0";
            } else {
                sb2.append("; expires=");
                m20931a = C5169d.m20931a(new Date(this.f15944c));
            }
            sb2.append(m20931a);
        }
        if (!this.f15950i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f15945d);
        }
        sb2.append("; path=");
        sb2.append(this.f15946e);
        if (this.f15947f) {
            sb2.append("; secure");
        }
        if (this.f15948g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }

    /* renamed from: k */
    public String m16780k() {
        return this.f15943b;
    }

    public String toString() {
        return m16779j(false);
    }
}
