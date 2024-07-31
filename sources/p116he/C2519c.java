package p116he;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sd.InterfaceC4580l;
import td.C4753m;

@IgnoreJRERequirement
/* renamed from: he.c */
/* loaded from: classes2.dex */
public final class C2519c extends AbstractC2533j {

    /* renamed from: a */
    public static final C2519c f9955a = new C2519c();

    /* renamed from: b */
    public static final a f9956b = new a();

    /* renamed from: he.c$a */
    /* loaded from: classes2.dex */
    public static final class a extends ClassValue<InterfaceC4580l<? super Throwable, ? extends Throwable>> {
        @Override // java.lang.ClassValue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC4580l<Throwable, Throwable> computeValue(Class<?> cls) {
            InterfaceC4580l<Throwable, Throwable> m10123b;
            C4753m.m18651d(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            m10123b = C2543o.m10123b(cls);
            return m10123b;
        }
    }

    @Override // p116he.AbstractC2533j
    /* renamed from: a */
    public InterfaceC4580l<Throwable, Throwable> mo10053a(Class<? extends Throwable> cls) {
        return (InterfaceC4580l) f9956b.get(cls);
    }
}
