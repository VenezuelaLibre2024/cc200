package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.C0426d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p029c2.AbstractC0592j;
import p104h2.C2285d;
import p165l2.C3420p;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* loaded from: classes.dex */
public class C0424b {

    /* renamed from: e */
    public static final String f2039e = AbstractC0592j.m2972f("ConstraintsCmdHandler");

    /* renamed from: a */
    public final Context f2040a;

    /* renamed from: b */
    public final int f2041b;

    /* renamed from: c */
    public final C0426d f2042c;

    /* renamed from: d */
    public final C2285d f2043d;

    public C0424b(Context context, int i10, C0426d c0426d) {
        this.f2040a = context;
        this.f2041b = i10;
        this.f2042c = c0426d;
        this.f2043d = new C2285d(context, c0426d.m2191f(), null);
    }

    /* renamed from: a */
    public void m2180a() {
        List<C3420p> mo12743f = this.f2042c.m2192g().m6199o().mo2131B().mo12743f();
        ConstraintProxy.m2160a(this.f2040a, mo12743f);
        this.f2043d.m9292d(mo12743f);
        ArrayList arrayList = new ArrayList(mo12743f.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (C3420p c3420p : mo12743f) {
            String str = c3420p.f12010a;
            if (currentTimeMillis >= c3420p.m12731a() && (!c3420p.m12732b() || this.f2043d.m9291c(str))) {
                arrayList.add(c3420p);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((C3420p) it.next()).f12010a;
            Intent m2165b = C0423a.m2165b(this.f2040a, str2);
            AbstractC0592j.m2970c().mo2973a(f2039e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            C0426d c0426d = this.f2042c;
            c0426d.m2196k(new C0426d.b(c0426d, m2165b, this.f2041b));
        }
        this.f2043d.m9293e();
    }
}
