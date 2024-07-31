package p135j2;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p029c2.AbstractC0592j;
import p104h2.InterfaceC2282a;
import p203o2.InterfaceC3840a;

/* renamed from: j2.d */
/* loaded from: classes.dex */
public abstract class AbstractC3212d<T> {

    /* renamed from: f */
    public static final String f11110f = AbstractC0592j.m2972f("ConstraintTracker");

    /* renamed from: a */
    public final InterfaceC3840a f11111a;

    /* renamed from: b */
    public final Context f11112b;

    /* renamed from: c */
    public final Object f11113c = new Object();

    /* renamed from: d */
    public final Set<InterfaceC2282a<T>> f11114d = new LinkedHashSet();

    /* renamed from: e */
    public T f11115e;

    /* renamed from: j2.d$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ List f11116h;

        public a(List list) {
            this.f11116h = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f11116h.iterator();
            while (it.hasNext()) {
                ((InterfaceC2282a) it.next()).mo9284a(AbstractC3212d.this.f11115e);
            }
        }
    }

    public AbstractC3212d(Context context, InterfaceC3840a interfaceC3840a) {
        this.f11112b = context.getApplicationContext();
        this.f11111a = interfaceC3840a;
    }

    /* renamed from: a */
    public void m11433a(InterfaceC2282a<T> interfaceC2282a) {
        synchronized (this.f11113c) {
            if (this.f11114d.add(interfaceC2282a)) {
                if (this.f11114d.size() == 1) {
                    this.f11115e = mo11425b();
                    AbstractC0592j.m2970c().mo2973a(f11110f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f11115e), new Throwable[0]);
                    mo11431e();
                }
                interfaceC2282a.mo9284a(this.f11115e);
            }
        }
    }

    /* renamed from: b */
    public abstract T mo11425b();

    /* renamed from: c */
    public void m11434c(InterfaceC2282a<T> interfaceC2282a) {
        synchronized (this.f11113c) {
            if (this.f11114d.remove(interfaceC2282a) && this.f11114d.isEmpty()) {
                mo11432f();
            }
        }
    }

    /* renamed from: d */
    public void m11435d(T t10) {
        synchronized (this.f11113c) {
            T t11 = this.f11115e;
            if (t11 != t10 && (t11 == null || !t11.equals(t10))) {
                this.f11115e = t10;
                this.f11111a.mo14610a().execute(new a(new ArrayList(this.f11114d)));
            }
        }
    }

    /* renamed from: e */
    public abstract void mo11431e();

    /* renamed from: f */
    public abstract void mo11432f();
}
