package p113hb;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p129ia.EnumC2683o;

/* renamed from: hb.b */
/* loaded from: classes.dex */
public class C2457b {

    /* renamed from: a */
    public C2682n f9858a;

    /* renamed from: b */
    public C2475t f9859b;

    /* renamed from: c */
    public final int f9860c = 2;

    public C2457b(C2682n c2682n, C2475t c2475t) {
        this.f9858a = c2682n;
        this.f9859b = c2475t;
    }

    /* renamed from: f */
    public static List<C2684p> m9822f(List<C2684p> list, C2475t c2475t) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C2684p> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c2475t.m9872f(it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public EnumC2669a m9823a() {
        return this.f9858a.m10898b();
    }

    /* renamed from: b */
    public Bitmap m9824b() {
        return this.f9859b.m9868b(null, 2);
    }

    /* renamed from: c */
    public byte[] m9825c() {
        return this.f9858a.m10899c();
    }

    /* renamed from: d */
    public Map<EnumC2683o, Object> m9826d() {
        return this.f9858a.m10900d();
    }

    /* renamed from: e */
    public String m9827e() {
        return this.f9858a.m10902f();
    }

    public String toString() {
        return this.f9858a.m10902f();
    }
}
