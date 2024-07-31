package p109h7;

/* renamed from: h7.d */
/* loaded from: classes.dex */
public abstract class AbstractC2421d implements InterfaceC2433p<Character> {

    /* renamed from: h7.d$a */
    /* loaded from: classes.dex */
    public static abstract class a extends AbstractC2421d {
        @Override // p109h7.InterfaceC2433p
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.m9671b(ch);
        }
    }

    /* renamed from: h7.d$b */
    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: h */
        public final char f9742h;

        public b(char c10) {
            this.f9742h = c10;
        }

        @Override // p109h7.AbstractC2421d
        /* renamed from: e */
        public boolean mo9673e(char c10) {
            return c10 == this.f9742h;
        }

        public String toString() {
            return "CharMatcher.is('" + AbstractC2421d.m9670g(this.f9742h) + "')";
        }
    }

    /* renamed from: h7.d$c */
    /* loaded from: classes.dex */
    public static abstract class c extends a {

        /* renamed from: h */
        public final String f9743h;

        public c(String str) {
            this.f9743h = (String) C2432o.m9704j(str);
        }

        public final String toString() {
            return this.f9743h;
        }
    }

    /* renamed from: h7.d$d */
    /* loaded from: classes.dex */
    public static final class d extends c {

        /* renamed from: i */
        public static final d f9744i = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override // p109h7.AbstractC2421d
        /* renamed from: c */
        public int mo9672c(CharSequence charSequence, int i10) {
            C2432o.m9706l(i10, charSequence.length());
            return -1;
        }

        @Override // p109h7.AbstractC2421d
        /* renamed from: e */
        public boolean mo9673e(char c10) {
            return false;
        }
    }

    /* renamed from: d */
    public static AbstractC2421d m9668d(char c10) {
        return new b(c10);
    }

    /* renamed from: f */
    public static AbstractC2421d m9669f() {
        return d.f9744i;
    }

    /* renamed from: g */
    public static String m9670g(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    /* renamed from: b */
    public boolean m9671b(Character ch) {
        return mo9673e(ch.charValue());
    }

    /* renamed from: c */
    public int mo9672c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        C2432o.m9706l(i10, length);
        while (i10 < length) {
            if (mo9673e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: e */
    public abstract boolean mo9673e(char c10);
}
