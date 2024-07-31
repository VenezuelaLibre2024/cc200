package p102h0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p002a0.C0008e;
import p102h0.C2279g;
import p133j0.InterfaceC3202a;
import p285u.C4775e;
import p285u.C4777g;

/* renamed from: h0.f */
/* loaded from: classes.dex */
public class C2278f {

    /* renamed from: a */
    public static final C4775e<String, Typeface> f9129a = new C4775e<>(16);

    /* renamed from: b */
    public static final ExecutorService f9130b = C2280h.m9276a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    public static final Object f9131c = new Object();

    /* renamed from: d */
    public static final C4777g<String, ArrayList<InterfaceC3202a<e>>> f9132d = new C4777g<>();

    /* renamed from: h0.f$a */
    /* loaded from: classes.dex */
    public class a implements Callable<e> {

        /* renamed from: a */
        public final /* synthetic */ String f9133a;

        /* renamed from: b */
        public final /* synthetic */ Context f9134b;

        /* renamed from: c */
        public final /* synthetic */ C2277e f9135c;

        /* renamed from: d */
        public final /* synthetic */ int f9136d;

        public a(String str, Context context, C2277e c2277e, int i10) {
            this.f9133a = str;
            this.f9134b = context;
            this.f9135c = c2277e;
            this.f9136d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return C2278f.m9256c(this.f9133a, this.f9134b, this.f9135c, this.f9136d);
        }
    }

    /* renamed from: h0.f$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC3202a<e> {

        /* renamed from: a */
        public final /* synthetic */ C2273a f9137a;

        public b(C2273a c2273a) {
            this.f9137a = c2273a;
        }

        @Override // p133j0.InterfaceC3202a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f9137a.m9235b(eVar);
        }
    }

    /* renamed from: h0.f$c */
    /* loaded from: classes.dex */
    public class c implements Callable<e> {

        /* renamed from: a */
        public final /* synthetic */ String f9138a;

        /* renamed from: b */
        public final /* synthetic */ Context f9139b;

        /* renamed from: c */
        public final /* synthetic */ C2277e f9140c;

        /* renamed from: d */
        public final /* synthetic */ int f9141d;

        public c(String str, Context context, C2277e c2277e, int i10) {
            this.f9138a = str;
            this.f9139b = context;
            this.f9140c = c2277e;
            this.f9141d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return C2278f.m9256c(this.f9138a, this.f9139b, this.f9140c, this.f9141d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* renamed from: h0.f$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC3202a<e> {

        /* renamed from: a */
        public final /* synthetic */ String f9142a;

        public d(String str) {
            this.f9142a = str;
        }

        @Override // p133j0.InterfaceC3202a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (C2278f.f9131c) {
                C4777g<String, ArrayList<InterfaceC3202a<e>>> c4777g = C2278f.f9132d;
                ArrayList<InterfaceC3202a<e>> arrayList = c4777g.get(this.f9142a);
                if (arrayList == null) {
                    return;
                }
                c4777g.remove(this.f9142a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(eVar);
                }
            }
        }
    }

    /* renamed from: h0.f$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final Typeface f9143a;

        /* renamed from: b */
        public final int f9144b;

        public e(int i10) {
            this.f9143a = null;
            this.f9144b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public e(Typeface typeface) {
            this.f9143a = typeface;
            this.f9144b = 0;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean m9263a() {
            return this.f9144b == 0;
        }
    }

    /* renamed from: a */
    public static String m9254a(C2277e c2277e, int i10) {
        return c2277e.m9250d() + "-" + i10;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public static int m9255b(C2279g.a aVar) {
        int i10 = 1;
        if (aVar.m9269c() != 0) {
            return aVar.m9269c() != 1 ? -3 : -2;
        }
        C2279g.b[] m9268b = aVar.m9268b();
        if (m9268b != null && m9268b.length != 0) {
            i10 = 0;
            for (C2279g.b bVar : m9268b) {
                int m9271b = bVar.m9271b();
                if (m9271b != 0) {
                    if (m9271b < 0) {
                        return -3;
                    }
                    return m9271b;
                }
            }
        }
        return i10;
    }

    /* renamed from: c */
    public static e m9256c(String str, Context context, C2277e c2277e, int i10) {
        C4775e<String, Typeface> c4775e = f9129a;
        Typeface typeface = c4775e.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            C2279g.a m9242e = C2276d.m9242e(context, c2277e, null);
            int m9255b = m9255b(m9242e);
            if (m9255b != 0) {
                return new e(m9255b);
            }
            Typeface m37b = C0008e.m37b(context, null, m9242e.m9268b(), i10);
            if (m37b == null) {
                return new e(-3);
            }
            c4775e.put(str, m37b);
            return new e(m37b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* renamed from: d */
    public static Typeface m9257d(Context context, C2277e c2277e, int i10, Executor executor, C2273a c2273a) {
        String m9254a = m9254a(c2277e, i10);
        Typeface typeface = f9129a.get(m9254a);
        if (typeface != null) {
            c2273a.m9235b(new e(typeface));
            return typeface;
        }
        b bVar = new b(c2273a);
        synchronized (f9131c) {
            C4777g<String, ArrayList<InterfaceC3202a<e>>> c4777g = f9132d;
            ArrayList<InterfaceC3202a<e>> arrayList = c4777g.get(m9254a);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<InterfaceC3202a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            c4777g.put(m9254a, arrayList2);
            c cVar = new c(m9254a, context, c2277e, i10);
            if (executor == null) {
                executor = f9130b;
            }
            C2280h.m9277b(executor, cVar, new d(m9254a));
            return null;
        }
    }

    /* renamed from: e */
    public static Typeface m9258e(Context context, C2277e c2277e, C2273a c2273a, int i10, int i11) {
        String m9254a = m9254a(c2277e, i10);
        Typeface typeface = f9129a.get(m9254a);
        if (typeface != null) {
            c2273a.m9235b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e m9256c = m9256c(m9254a, context, c2277e, i10);
            c2273a.m9235b(m9256c);
            return m9256c.f9143a;
        }
        try {
            e eVar = (e) C2280h.m9278c(f9130b, new a(m9254a, context, c2277e, i10), i11);
            c2273a.m9235b(eVar);
            return eVar.f9143a;
        } catch (InterruptedException unused) {
            c2273a.m9235b(new e(-3));
            return null;
        }
    }
}
