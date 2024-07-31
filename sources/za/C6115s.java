package za;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import p129ia.C2674f;
import p211oa.C3964a;

/* renamed from: za.s */
/* loaded from: classes.dex */
public final class C6115s {

    /* renamed from: a */
    public final C3964a f22651a;

    /* renamed from: b */
    public final C6109m f22652b = new C6109m();

    /* renamed from: c */
    public final StringBuilder f22653c = new StringBuilder();

    public C6115s(C3964a c3964a) {
        this.f22651a = c3964a;
    }

    /* renamed from: g */
    public static int m24384g(C3964a c3964a, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (c3964a.m15022e(i10 + i13)) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }

    /* renamed from: a */
    public String m24385a(StringBuilder sb2, int i10) {
        String str = null;
        while (true) {
            C6111o m24387c = m24387c(i10, str);
            String m24379a = C6114r.m24379a(m24387c.m24371b());
            if (m24379a != null) {
                sb2.append(m24379a);
            }
            String valueOf = m24387c.m24373d() ? String.valueOf(m24387c.m24372c()) : null;
            if (i10 == m24387c.m24378a()) {
                return sb2.toString();
            }
            i10 = m24387c.m24378a();
            str = valueOf;
        }
    }

    /* renamed from: b */
    public final C6110n m24386b(int i10) {
        char c10;
        int m24390f = m24390f(i10, 5);
        if (m24390f == 15) {
            return new C6110n(i10 + 5, '$');
        }
        if (m24390f >= 5 && m24390f < 15) {
            return new C6110n(i10 + 5, (char) ((m24390f + 48) - 5));
        }
        int m24390f2 = m24390f(i10, 6);
        if (m24390f2 >= 32 && m24390f2 < 58) {
            return new C6110n(i10 + 6, (char) (m24390f2 + 33));
        }
        switch (m24390f2) {
            case C1417R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                c10 = '*';
                break;
            case C1417R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                c10 = ',';
                break;
            case C1417R.styleable.AppCompatTheme_controlBackground /* 60 */:
                c10 = '-';
                break;
            case C1417R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                c10 = '.';
                break;
            case C1417R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                c10 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + m24390f2);
        }
        return new C6110n(i10 + 6, c10);
    }

    /* renamed from: c */
    public C6111o m24387c(int i10, String str) {
        this.f22653c.setLength(0);
        if (str != null) {
            this.f22653c.append(str);
        }
        this.f22652b.m24368h(i10);
        C6111o m24398o = m24398o();
        return (m24398o == null || !m24398o.m24373d()) ? new C6111o(this.f22652b.m24361a(), this.f22653c.toString()) : new C6111o(this.f22652b.m24361a(), this.f22653c.toString(), m24398o.m24372c());
    }

    /* renamed from: d */
    public final C6110n m24388d(int i10) {
        char c10;
        int m24390f = m24390f(i10, 5);
        if (m24390f == 15) {
            return new C6110n(i10 + 5, '$');
        }
        if (m24390f >= 5 && m24390f < 15) {
            return new C6110n(i10 + 5, (char) ((m24390f + 48) - 5));
        }
        int m24390f2 = m24390f(i10, 7);
        if (m24390f2 >= 64 && m24390f2 < 90) {
            return new C6110n(i10 + 7, (char) (m24390f2 + 1));
        }
        if (m24390f2 >= 90 && m24390f2 < 116) {
            return new C6110n(i10 + 7, (char) (m24390f2 + 7));
        }
        switch (m24390f(i10, 8)) {
            case 232:
                c10 = '!';
                break;
            case 233:
                c10 = '\"';
                break;
            case 234:
                c10 = '%';
                break;
            case 235:
                c10 = '&';
                break;
            case 236:
                c10 = '\'';
                break;
            case 237:
                c10 = '(';
                break;
            case 238:
                c10 = ')';
                break;
            case 239:
                c10 = '*';
                break;
            case 240:
                c10 = '+';
                break;
            case 241:
                c10 = ',';
                break;
            case 242:
                c10 = '-';
                break;
            case 243:
                c10 = '.';
                break;
            case 244:
                c10 = '/';
                break;
            case 245:
                c10 = ':';
                break;
            case 246:
                c10 = ';';
                break;
            case 247:
                c10 = '<';
                break;
            case 248:
                c10 = '=';
                break;
            case 249:
                c10 = '>';
                break;
            case 250:
                c10 = '?';
                break;
            case 251:
                c10 = '_';
                break;
            case 252:
                c10 = ' ';
                break;
            default:
                throw C2674f.m10883a();
        }
        return new C6110n(i10 + 8, c10);
    }

    /* renamed from: e */
    public final C6112p m24389e(int i10) {
        int i11 = i10 + 7;
        if (i11 > this.f22651a.m15026i()) {
            int m24390f = m24390f(i10, 4);
            return m24390f == 0 ? new C6112p(this.f22651a.m15026i(), 10, 10) : new C6112p(this.f22651a.m15026i(), m24390f - 1, 10);
        }
        int m24390f2 = m24390f(i10, 7) - 8;
        return new C6112p(i11, m24390f2 / 11, m24390f2 % 11);
    }

    /* renamed from: f */
    public int m24390f(int i10, int i11) {
        return m24384g(this.f22651a, i10, i11);
    }

    /* renamed from: h */
    public final boolean m24391h(int i10) {
        int i11 = i10 + 3;
        if (i11 > this.f22651a.m15026i()) {
            return false;
        }
        while (i10 < i11) {
            if (this.f22651a.m15022e(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m24392i(int i10) {
        int i11;
        if (i10 + 1 > this.f22651a.m15026i()) {
            return false;
        }
        for (int i12 = 0; i12 < 5 && (i11 = i12 + i10) < this.f22651a.m15026i(); i12++) {
            if (i12 == 2) {
                if (!this.f22651a.m15022e(i10 + 2)) {
                    return false;
                }
            } else if (this.f22651a.m15022e(i11)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m24393j(int i10) {
        int i11;
        if (i10 + 1 > this.f22651a.m15026i()) {
            return false;
        }
        for (int i12 = 0; i12 < 4 && (i11 = i12 + i10) < this.f22651a.m15026i(); i12++) {
            if (this.f22651a.m15022e(i11)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m24394k(int i10) {
        int m24390f;
        if (i10 + 5 > this.f22651a.m15026i()) {
            return false;
        }
        int m24390f2 = m24390f(i10, 5);
        if (m24390f2 < 5 || m24390f2 >= 16) {
            return i10 + 6 <= this.f22651a.m15026i() && (m24390f = m24390f(i10, 6)) >= 16 && m24390f < 63;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean m24395l(int i10) {
        int m24390f;
        if (i10 + 5 > this.f22651a.m15026i()) {
            return false;
        }
        int m24390f2 = m24390f(i10, 5);
        if (m24390f2 >= 5 && m24390f2 < 16) {
            return true;
        }
        if (i10 + 7 > this.f22651a.m15026i()) {
            return false;
        }
        int m24390f3 = m24390f(i10, 7);
        if (m24390f3 < 64 || m24390f3 >= 116) {
            return i10 + 8 <= this.f22651a.m15026i() && (m24390f = m24390f(i10, 8)) >= 232 && m24390f < 253;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean m24396m(int i10) {
        if (i10 + 7 > this.f22651a.m15026i()) {
            return i10 + 4 <= this.f22651a.m15026i();
        }
        int i11 = i10;
        while (true) {
            int i12 = i10 + 3;
            if (i11 >= i12) {
                return this.f22651a.m15022e(i12);
            }
            if (this.f22651a.m15022e(i11)) {
                return true;
            }
            i11++;
        }
    }

    /* renamed from: n */
    public final C6108l m24397n() {
        while (m24394k(this.f22652b.m24361a())) {
            C6110n m24386b = m24386b(this.f22652b.m24361a());
            this.f22652b.m24368h(m24386b.m24378a());
            if (m24386b.m24370c()) {
                return new C6108l(new C6111o(this.f22652b.m24361a(), this.f22653c.toString()), true);
            }
            this.f22653c.append(m24386b.m24369b());
        }
        if (m24391h(this.f22652b.m24361a())) {
            this.f22652b.m24362b(3);
            this.f22652b.m24367g();
        } else if (m24392i(this.f22652b.m24361a())) {
            if (this.f22652b.m24361a() + 5 < this.f22651a.m15026i()) {
                this.f22652b.m24362b(5);
            } else {
                this.f22652b.m24368h(this.f22651a.m15026i());
            }
            this.f22652b.m24366f();
        }
        return new C6108l();
    }

    /* renamed from: o */
    public final C6111o m24398o() {
        C6108l m24397n;
        boolean m24360b;
        do {
            int m24361a = this.f22652b.m24361a();
            m24397n = this.f22652b.m24363c() ? m24397n() : this.f22652b.m24364d() ? m24399p() : m24400q();
            m24360b = m24397n.m24360b();
            if (!(m24361a != this.f22652b.m24361a()) && !m24360b) {
                break;
            }
        } while (!m24360b);
        return m24397n.m24359a();
    }

    /* renamed from: p */
    public final C6108l m24399p() {
        while (m24395l(this.f22652b.m24361a())) {
            C6110n m24388d = m24388d(this.f22652b.m24361a());
            this.f22652b.m24368h(m24388d.m24378a());
            if (m24388d.m24370c()) {
                return new C6108l(new C6111o(this.f22652b.m24361a(), this.f22653c.toString()), true);
            }
            this.f22653c.append(m24388d.m24369b());
        }
        if (m24391h(this.f22652b.m24361a())) {
            this.f22652b.m24362b(3);
            this.f22652b.m24367g();
        } else if (m24392i(this.f22652b.m24361a())) {
            if (this.f22652b.m24361a() + 5 < this.f22651a.m15026i()) {
                this.f22652b.m24362b(5);
            } else {
                this.f22652b.m24368h(this.f22651a.m15026i());
            }
            this.f22652b.m24365e();
        }
        return new C6108l();
    }

    /* renamed from: q */
    public final C6108l m24400q() {
        while (m24396m(this.f22652b.m24361a())) {
            C6112p m24389e = m24389e(this.f22652b.m24361a());
            this.f22652b.m24368h(m24389e.m24378a());
            if (m24389e.m24376d()) {
                return new C6108l(m24389e.m24377e() ? new C6111o(this.f22652b.m24361a(), this.f22653c.toString()) : new C6111o(this.f22652b.m24361a(), this.f22653c.toString(), m24389e.m24375c()), true);
            }
            this.f22653c.append(m24389e.m24374b());
            if (m24389e.m24377e()) {
                return new C6108l(new C6111o(this.f22652b.m24361a(), this.f22653c.toString()), true);
            }
            this.f22653c.append(m24389e.m24375c());
        }
        if (m24393j(this.f22652b.m24361a())) {
            this.f22652b.m24365e();
            this.f22652b.m24362b(4);
        }
        return new C6108l();
    }
}
