package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.C0365u;
import java.util.List;
import p115hd.C2502n;
import p287u1.C4787a;
import p287u1.InterfaceC4788b;
import td.C4753m;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC4788b<InterfaceC0354k> {
    @Override // p287u1.InterfaceC4788b
    /* renamed from: a */
    public List<Class<? extends InterfaceC4788b<?>>> mo1211a() {
        return C2502n.m9989e();
    }

    @Override // p287u1.InterfaceC4788b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0354k mo1212b(Context context) {
        C4753m.m18653f(context, "context");
        C4787a m18809e = C4787a.m18809e(context);
        C4753m.m18652e(m18809e, "getInstance(context)");
        if (!m18809e.m18815g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        C0348h.m1822a(context);
        C0365u.b bVar = C0365u.f1745p;
        bVar.m1864b(context);
        return bVar.m1863a();
    }
}
