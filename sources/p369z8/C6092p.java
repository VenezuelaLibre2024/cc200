package p369z8;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p024b9.AbstractC0523d;
import p051d9.C1605b;
import p051d9.InterfaceC1604a;

/* renamed from: z8.p */
/* loaded from: classes.dex */
public final class C6092p {

    /* renamed from: b */
    public static final long f22615b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final Pattern f22616c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    public static C6092p f22617d;

    /* renamed from: a */
    public final InterfaceC1604a f22618a;

    public C6092p(InterfaceC1604a interfaceC1604a) {
        this.f22618a = interfaceC1604a;
    }

    /* renamed from: c */
    public static C6092p m24340c() {
        return m24341d(C1605b.m6436b());
    }

    /* renamed from: d */
    public static C6092p m24341d(InterfaceC1604a interfaceC1604a) {
        if (f22617d == null) {
            f22617d = new C6092p(interfaceC1604a);
        }
        return f22617d;
    }

    /* renamed from: g */
    public static boolean m24342g(String str) {
        return f22616c.matcher(str).matches();
    }

    /* renamed from: h */
    public static boolean m24343h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long m24344a() {
        return this.f22618a.mo6435a();
    }

    /* renamed from: b */
    public long m24345b() {
        return TimeUnit.MILLISECONDS.toSeconds(m24344a());
    }

    /* renamed from: e */
    public long m24346e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m24347f(AbstractC0523d abstractC0523d) {
        return TextUtils.isEmpty(abstractC0523d.mo2503b()) || abstractC0523d.mo2509h() + abstractC0523d.mo2504c() < m24345b() + f22615b;
    }
}
