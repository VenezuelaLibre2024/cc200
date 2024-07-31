package p077f4;

import java.util.ArrayList;
import java.util.List;
import p109h7.C2436s;
import p152k4.C3348a;
import p222p5.C4015a0;
import p235q4.C4165c;
import p264s3.C4499t2;
import p333x3.C5585y;
import p333x3.InterfaceC5572l;

/* renamed from: f4.m */
/* loaded from: classes.dex */
public final class C1832m {

    /* renamed from: d */
    public static final C2436s f6919d = C2436s.m9719d(':');

    /* renamed from: e */
    public static final C2436s f6920e = C2436s.m9719d('*');

    /* renamed from: a */
    public final List<a> f6921a = new ArrayList();

    /* renamed from: b */
    public int f6922b = 0;

    /* renamed from: c */
    public int f6923c;

    /* renamed from: f4.m$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f6924a;

        /* renamed from: b */
        public final long f6925b;

        /* renamed from: c */
        public final int f6926c;

        public a(int i10, long j10, int i11) {
            this.f6924a = i10;
            this.f6925b = j10;
            this.f6926c = i11;
        }
    }

    /* renamed from: b */
    public static int m7536b(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c10 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw C4499t2.m17594a("Invalid SEF name", null);
        }
    }

    /* renamed from: f */
    public static C4165c m7537f(C4015a0 c4015a0, int i10) {
        ArrayList arrayList = new ArrayList();
        List<String> m9721f = f6920e.m9721f(c4015a0.m15207D(i10));
        for (int i11 = 0; i11 < m9721f.size(); i11++) {
            List<String> m9721f2 = f6919d.m9721f(m9721f.get(i11));
            if (m9721f2.size() != 3) {
                throw C4499t2.m17594a(null, null);
            }
            try {
                arrayList.add(new C4165c.b(Long.parseLong(m9721f2.get(0)), Long.parseLong(m9721f2.get(1)), 1 << (Integer.parseInt(m9721f2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw C4499t2.m17594a(null, e10);
            }
        }
        return new C4165c(arrayList);
    }

    /* renamed from: a */
    public final void m7538a(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        C4015a0 c4015a0 = new C4015a0(8);
        interfaceC5572l.readFully(c4015a0.m15230e(), 0, 8);
        this.f6923c = c4015a0.m15245t() + 8;
        if (c4015a0.m15241p() != 1397048916) {
            c5585y.f20962a = 0L;
        } else {
            c5585y.f20962a = interfaceC5572l.getPosition() - (this.f6923c - 12);
            this.f6922b = 2;
        }
    }

    /* renamed from: c */
    public int m7539c(InterfaceC5572l interfaceC5572l, C5585y c5585y, List<C3348a.b> list) {
        int i10 = this.f6922b;
        long j10 = 0;
        if (i10 == 0) {
            long mo3029b = interfaceC5572l.mo3029b();
            if (mo3029b != -1 && mo3029b >= 8) {
                j10 = mo3029b - 8;
            }
            c5585y.f20962a = j10;
            this.f6922b = 1;
        } else if (i10 == 1) {
            m7538a(interfaceC5572l, c5585y);
        } else if (i10 == 2) {
            m7540d(interfaceC5572l, c5585y);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            m7541e(interfaceC5572l, list);
            c5585y.f20962a = 0L;
        }
        return 1;
    }

    /* renamed from: d */
    public final void m7540d(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        long j10;
        long mo3029b = interfaceC5572l.mo3029b();
        int i10 = (this.f6923c - 12) - 8;
        C4015a0 c4015a0 = new C4015a0(i10);
        interfaceC5572l.readFully(c4015a0.m15230e(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            c4015a0.m15224U(2);
            short m15247v = c4015a0.m15247v();
            if (m15247v == 2192 || m15247v == 2816 || m15247v == 2817 || m15247v == 2819 || m15247v == 2820) {
                this.f6921a.add(new a(m15247v, (mo3029b - this.f6923c) - c4015a0.m15245t(), c4015a0.m15245t()));
            } else {
                c4015a0.m15224U(8);
            }
        }
        if (this.f6921a.isEmpty()) {
            j10 = 0;
        } else {
            this.f6922b = 3;
            j10 = this.f6921a.get(0).f6925b;
        }
        c5585y.f20962a = j10;
    }

    /* renamed from: e */
    public final void m7541e(InterfaceC5572l interfaceC5572l, List<C3348a.b> list) {
        long position = interfaceC5572l.getPosition();
        int mo3029b = (int) ((interfaceC5572l.mo3029b() - interfaceC5572l.getPosition()) - this.f6923c);
        C4015a0 c4015a0 = new C4015a0(mo3029b);
        interfaceC5572l.readFully(c4015a0.m15230e(), 0, mo3029b);
        for (int i10 = 0; i10 < this.f6921a.size(); i10++) {
            a aVar = this.f6921a.get(i10);
            c4015a0.m15223T((int) (aVar.f6925b - position));
            c4015a0.m15224U(4);
            int m15245t = c4015a0.m15245t();
            int m7536b = m7536b(c4015a0.m15207D(m15245t));
            int i11 = aVar.f6926c - (m15245t + 8);
            if (m7536b == 2192) {
                list.add(m7537f(c4015a0, i11));
            } else if (m7536b != 2816 && m7536b != 2817 && m7536b != 2819 && m7536b != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: g */
    public void m7542g() {
        this.f6921a.clear();
        this.f6922b = 0;
    }
}
