package p036c9;

import java.util.concurrent.TimeUnit;
import p369z8.C6092p;

/* renamed from: c9.e */
/* loaded from: classes.dex */
public class C0994e {

    /* renamed from: d */
    public static final long f3895d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f3896e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final C6092p f3897a = C6092p.m24340c();

    /* renamed from: b */
    public long f3898b;

    /* renamed from: c */
    public int f3899c;

    /* renamed from: c */
    public static boolean m4182c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    /* renamed from: d */
    public static boolean m4183d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    /* renamed from: a */
    public final synchronized long m4184a(int i10) {
        if (m4182c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f3899c) + this.f3897a.m24346e(), f3896e);
        }
        return f3895d;
    }

    /* renamed from: b */
    public synchronized boolean m4185b() {
        boolean z10;
        if (this.f3899c != 0) {
            z10 = this.f3897a.m24344a() > this.f3898b;
        }
        return z10;
    }

    /* renamed from: e */
    public final synchronized void m4186e() {
        this.f3899c = 0;
    }

    /* renamed from: f */
    public synchronized void m4187f(int i10) {
        if (m4183d(i10)) {
            m4186e();
            return;
        }
        this.f3899c++;
        this.f3898b = this.f3897a.m24344a() + m4184a(i10);
    }
}
