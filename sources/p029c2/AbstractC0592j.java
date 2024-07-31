package p029c2;

import android.util.Log;

/* renamed from: c2.j */
/* loaded from: classes.dex */
public abstract class AbstractC0592j {

    /* renamed from: a */
    public static AbstractC0592j f2597a = null;

    /* renamed from: b */
    public static final int f2598b = 20;

    /* renamed from: c2.j$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC0592j {

        /* renamed from: c */
        public int f2599c;

        public a(int i10) {
            super(i10);
            this.f2599c = i10;
        }

        @Override // p029c2.AbstractC0592j
        /* renamed from: a */
        public void mo2973a(String str, String str2, Throwable... thArr) {
            if (this.f2599c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // p029c2.AbstractC0592j
        /* renamed from: b */
        public void mo2974b(String str, String str2, Throwable... thArr) {
            if (this.f2599c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // p029c2.AbstractC0592j
        /* renamed from: d */
        public void mo2975d(String str, String str2, Throwable... thArr) {
            if (this.f2599c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // p029c2.AbstractC0592j
        /* renamed from: g */
        public void mo2976g(String str, String str2, Throwable... thArr) {
            if (this.f2599c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // p029c2.AbstractC0592j
        /* renamed from: h */
        public void mo2977h(String str, String str2, Throwable... thArr) {
            if (this.f2599c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public AbstractC0592j(int i10) {
    }

    /* renamed from: c */
    public static synchronized AbstractC0592j m2970c() {
        AbstractC0592j abstractC0592j;
        synchronized (AbstractC0592j.class) {
            if (f2597a == null) {
                f2597a = new a(3);
            }
            abstractC0592j = f2597a;
        }
        return abstractC0592j;
    }

    /* renamed from: e */
    public static synchronized void m2971e(AbstractC0592j abstractC0592j) {
        synchronized (AbstractC0592j.class) {
            f2597a = abstractC0592j;
        }
    }

    /* renamed from: f */
    public static String m2972f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f2598b;
        if (length >= i10) {
            str = str.substring(0, i10);
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    public abstract void mo2973a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo2974b(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo2975d(String str, String str2, Throwable... thArr);

    /* renamed from: g */
    public abstract void mo2976g(String str, String str2, Throwable... thArr);

    /* renamed from: h */
    public abstract void mo2977h(String str, String str2, Throwable... thArr);
}
