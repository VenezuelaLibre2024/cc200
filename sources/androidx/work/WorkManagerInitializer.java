package androidx.work;

import android.content.Context;
import androidx.work.C0416a;
import java.util.Collections;
import java.util.List;
import p029c2.AbstractC0592j;
import p029c2.AbstractC0602t;
import p287u1.InterfaceC4788b;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC4788b<AbstractC0602t> {

    /* renamed from: a */
    public static final String f1960a = AbstractC0592j.m2972f("WrkMgrInitializer");

    @Override // p287u1.InterfaceC4788b
    /* renamed from: a */
    public List<Class<? extends InterfaceC4788b<?>>> mo1211a() {
        return Collections.emptyList();
    }

    @Override // p287u1.InterfaceC4788b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC0602t mo1212b(Context context) {
        AbstractC0592j.m2970c().mo2973a(f1960a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        AbstractC0602t.m2988f(context, new C0416a.b().m2101a());
        return AbstractC0602t.m2987e(context);
    }
}
