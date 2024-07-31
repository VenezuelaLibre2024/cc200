package p119i0;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: i0.a */
/* loaded from: classes.dex */
public final class C2573a {

    /* renamed from: d */
    public static final InterfaceC2576d f10090d;

    /* renamed from: e */
    public static final String f10091e;

    /* renamed from: f */
    public static final String f10092f;

    /* renamed from: g */
    public static final C2573a f10093g;

    /* renamed from: h */
    public static final C2573a f10094h;

    /* renamed from: a */
    public final boolean f10095a;

    /* renamed from: b */
    public final int f10096b;

    /* renamed from: c */
    public final InterfaceC2576d f10097c;

    /* renamed from: i0.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public boolean f10098a;

        /* renamed from: b */
        public int f10099b;

        /* renamed from: c */
        public InterfaceC2576d f10100c;

        public a() {
            m10291c(C2573a.m10283e(Locale.getDefault()));
        }

        /* renamed from: b */
        public static C2573a m10289b(boolean z10) {
            return z10 ? C2573a.f10094h : C2573a.f10093g;
        }

        /* renamed from: a */
        public C2573a m10290a() {
            return (this.f10099b == 2 && this.f10100c == C2573a.f10090d) ? m10289b(this.f10098a) : new C2573a(this.f10098a, this.f10099b, this.f10100c);
        }

        /* renamed from: c */
        public final void m10291c(boolean z10) {
            this.f10098a = z10;
            this.f10100c = C2573a.f10090d;
            this.f10099b = 2;
        }
    }

    /* renamed from: i0.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f */
        public static final byte[] f10101f = new byte[1792];

        /* renamed from: a */
        public final CharSequence f10102a;

        /* renamed from: b */
        public final boolean f10103b;

        /* renamed from: c */
        public final int f10104c;

        /* renamed from: d */
        public int f10105d;

        /* renamed from: e */
        public char f10106e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f10101f[i10] = Character.getDirectionality(i10);
            }
        }

        public b(CharSequence charSequence, boolean z10) {
            this.f10102a = charSequence;
            this.f10103b = z10;
            this.f10104c = charSequence.length();
        }

        /* renamed from: c */
        public static byte m10292c(char c10) {
            return c10 < 1792 ? f10101f[c10] : Character.getDirectionality(c10);
        }

        /* renamed from: a */
        public byte m10293a() {
            char charAt = this.f10102a.charAt(this.f10105d - 1);
            this.f10106e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f10102a, this.f10105d);
                this.f10105d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f10105d--;
            byte m10292c = m10292c(this.f10106e);
            if (!this.f10103b) {
                return m10292c;
            }
            char c10 = this.f10106e;
            return c10 == '>' ? m10299h() : c10 == ';' ? m10297f() : m10292c;
        }

        /* renamed from: b */
        public byte m10294b() {
            char charAt = this.f10102a.charAt(this.f10105d);
            this.f10106e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f10102a, this.f10105d);
                this.f10105d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f10105d++;
            byte m10292c = m10292c(this.f10106e);
            if (!this.f10103b) {
                return m10292c;
            }
            char c10 = this.f10106e;
            return c10 == '<' ? m10300i() : c10 == '&' ? m10298g() : m10292c;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:46:0x0045. Please report as an issue. */
        /* renamed from: d */
        public int m10295d() {
            this.f10105d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f10105d < this.f10104c && i10 == 0) {
                byte m10294b = m10294b();
                if (m10294b != 0) {
                    if (m10294b == 1 || m10294b == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (m10294b != 9) {
                        switch (m10294b) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f10105d > 0) {
                switch (m10293a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        i12--;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        i12--;
                    case 18:
                        i12++;
                }
            }
            return 0;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:33:0x001c. Please report as an issue. */
        /* renamed from: e */
        public int m10296e() {
            this.f10105d = this.f10104c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f10105d > 0) {
                    byte m10293a = m10293a();
                    if (m10293a != 0) {
                        if (m10293a == 1 || m10293a == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                                break;
                            }
                        } else if (m10293a != 9) {
                            switch (m10293a) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }

        /* renamed from: f */
        public final byte m10297f() {
            char charAt;
            int i10 = this.f10105d;
            do {
                int i11 = this.f10105d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f10102a;
                int i12 = i11 - 1;
                this.f10105d = i12;
                charAt = charSequence.charAt(i12);
                this.f10106e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f10105d = i10;
            this.f10106e = ';';
            return (byte) 13;
        }

        /* renamed from: g */
        public final byte m10298g() {
            char charAt;
            do {
                int i10 = this.f10105d;
                if (i10 >= this.f10104c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f10102a;
                this.f10105d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f10106e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        public final byte m10299h() {
            char charAt;
            int i10 = this.f10105d;
            while (true) {
                int i11 = this.f10105d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f10102a;
                int i12 = i11 - 1;
                this.f10105d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f10106e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f10105d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f10102a;
                            int i14 = i13 - 1;
                            this.f10105d = i14;
                            charAt = charSequence2.charAt(i14);
                            this.f10106e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f10105d = i10;
            this.f10106e = '>';
            return (byte) 13;
        }

        /* renamed from: i */
        public final byte m10300i() {
            char charAt;
            int i10 = this.f10105d;
            while (true) {
                int i11 = this.f10105d;
                if (i11 >= this.f10104c) {
                    this.f10105d = i10;
                    this.f10106e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f10102a;
                this.f10105d = i11 + 1;
                char charAt2 = charSequence.charAt(i11);
                this.f10106e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i12 = this.f10105d;
                        if (i12 < this.f10104c) {
                            CharSequence charSequence2 = this.f10102a;
                            this.f10105d = i12 + 1;
                            charAt = charSequence2.charAt(i12);
                            this.f10106e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }
    }

    static {
        InterfaceC2576d interfaceC2576d = C2577e.f10124c;
        f10090d = interfaceC2576d;
        f10091e = Character.toString((char) 8206);
        f10092f = Character.toString((char) 8207);
        f10093g = new C2573a(false, 2, interfaceC2576d);
        f10094h = new C2573a(true, 2, interfaceC2576d);
    }

    public C2573a(boolean z10, int i10, InterfaceC2576d interfaceC2576d) {
        this.f10095a = z10;
        this.f10096b = i10;
        this.f10097c = interfaceC2576d;
    }

    /* renamed from: a */
    public static int m10280a(CharSequence charSequence) {
        return new b(charSequence, false).m10295d();
    }

    /* renamed from: b */
    public static int m10281b(CharSequence charSequence) {
        return new b(charSequence, false).m10296e();
    }

    /* renamed from: c */
    public static C2573a m10282c() {
        return new a().m10290a();
    }

    /* renamed from: e */
    public static boolean m10283e(Locale locale) {
        return C2578f.m10326b(locale) == 1;
    }

    /* renamed from: d */
    public boolean m10284d() {
        return (this.f10096b & 2) != 0;
    }

    /* renamed from: f */
    public final String m10285f(CharSequence charSequence, InterfaceC2576d interfaceC2576d) {
        boolean mo10319a = interfaceC2576d.mo10319a(charSequence, 0, charSequence.length());
        return (this.f10095a || !(mo10319a || m10281b(charSequence) == 1)) ? this.f10095a ? (!mo10319a || m10281b(charSequence) == -1) ? f10092f : "" : "" : f10091e;
    }

    /* renamed from: g */
    public final String m10286g(CharSequence charSequence, InterfaceC2576d interfaceC2576d) {
        boolean mo10319a = interfaceC2576d.mo10319a(charSequence, 0, charSequence.length());
        return (this.f10095a || !(mo10319a || m10280a(charSequence) == 1)) ? this.f10095a ? (!mo10319a || m10280a(charSequence) == -1) ? f10092f : "" : "" : f10091e;
    }

    /* renamed from: h */
    public CharSequence m10287h(CharSequence charSequence) {
        return m10288i(charSequence, this.f10097c, true);
    }

    /* renamed from: i */
    public CharSequence m10288i(CharSequence charSequence, InterfaceC2576d interfaceC2576d, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean mo10319a = interfaceC2576d.mo10319a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m10284d() && z10) {
            spannableStringBuilder.append((CharSequence) m10286g(charSequence, mo10319a ? C2577e.f10123b : C2577e.f10122a));
        }
        if (mo10319a != this.f10095a) {
            spannableStringBuilder.append(mo10319a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) m10285f(charSequence, mo10319a ? C2577e.f10123b : C2577e.f10122a));
        }
        return spannableStringBuilder;
    }
}
