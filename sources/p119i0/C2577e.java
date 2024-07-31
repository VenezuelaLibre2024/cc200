package p119i0;

import java.util.Locale;

/* renamed from: i0.e */
/* loaded from: classes.dex */
public final class C2577e {

    /* renamed from: a */
    public static final InterfaceC2576d f10122a = new e(null, false);

    /* renamed from: b */
    public static final InterfaceC2576d f10123b = new e(null, true);

    /* renamed from: c */
    public static final InterfaceC2576d f10124c;

    /* renamed from: d */
    public static final InterfaceC2576d f10125d;

    /* renamed from: e */
    public static final InterfaceC2576d f10126e;

    /* renamed from: f */
    public static final InterfaceC2576d f10127f;

    /* renamed from: i0.e$a */
    /* loaded from: classes.dex */
    public static class a implements c {

        /* renamed from: b */
        public static final a f10128b = new a(true);

        /* renamed from: a */
        public final boolean f10129a;

        public a(boolean z10) {
            this.f10129a = z10;
        }

        @Override // p119i0.C2577e.c
        /* renamed from: a */
        public int mo10322a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int m10320a = C2577e.m10320a(Character.getDirectionality(charSequence.charAt(i10)));
                if (m10320a != 0) {
                    if (m10320a != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f10129a) {
                        return 1;
                    }
                } else if (this.f10129a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f10129a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: i0.e$b */
    /* loaded from: classes.dex */
    public static class b implements c {

        /* renamed from: a */
        public static final b f10130a = new b();

        @Override // p119i0.C2577e.c
        /* renamed from: a */
        public int mo10322a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = C2577e.m10321b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    /* renamed from: i0.e$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        int mo10322a(CharSequence charSequence, int i10, int i11);
    }

    /* renamed from: i0.e$d */
    /* loaded from: classes.dex */
    public static abstract class d implements InterfaceC2576d {

        /* renamed from: a */
        public final c f10131a;

        public d(c cVar) {
            this.f10131a = cVar;
        }

        @Override // p119i0.InterfaceC2576d
        /* renamed from: a */
        public boolean mo10319a(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f10131a == null ? mo10323b() : m10324c(charSequence, i10, i11);
        }

        /* renamed from: b */
        public abstract boolean mo10323b();

        /* renamed from: c */
        public final boolean m10324c(CharSequence charSequence, int i10, int i11) {
            int mo10322a = this.f10131a.mo10322a(charSequence, i10, i11);
            if (mo10322a == 0) {
                return true;
            }
            if (mo10322a != 1) {
                return mo10323b();
            }
            return false;
        }
    }

    /* renamed from: i0.e$e */
    /* loaded from: classes.dex */
    public static class e extends d {

        /* renamed from: b */
        public final boolean f10132b;

        public e(c cVar, boolean z10) {
            super(cVar);
            this.f10132b = z10;
        }

        @Override // p119i0.C2577e.d
        /* renamed from: b */
        public boolean mo10323b() {
            return this.f10132b;
        }
    }

    /* renamed from: i0.e$f */
    /* loaded from: classes.dex */
    public static class f extends d {

        /* renamed from: b */
        public static final f f10133b = new f();

        public f() {
            super(null);
        }

        @Override // p119i0.C2577e.d
        /* renamed from: b */
        public boolean mo10323b() {
            return C2578f.m10326b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f10130a;
        f10124c = new e(bVar, false);
        f10125d = new e(bVar, true);
        f10126e = new e(a.f10128b, false);
        f10127f = f.f10133b;
    }

    /* renamed from: a */
    public static int m10320a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m10321b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
