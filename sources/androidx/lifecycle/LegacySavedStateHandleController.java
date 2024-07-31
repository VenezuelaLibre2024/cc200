package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.savedstate.C0395a;
import java.util.Iterator;
import p247r1.InterfaceC4275d;
import td.C4753m;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* renamed from: a */
    public static final LegacySavedStateHandleController f1658a = new LegacySavedStateHandleController();

    /* renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    /* loaded from: classes.dex */
    public static final class C0330a implements C0395a.a {
        @Override // androidx.savedstate.C0395a.a
        /* renamed from: a */
        public void mo1762a(InterfaceC4275d interfaceC4275d) {
            C4753m.m18653f(interfaceC4275d, "owner");
            if (!(interfaceC4275d instanceof InterfaceC0351i0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            C0349h0 viewModelStore = ((InterfaceC0351i0) interfaceC4275d).getViewModelStore();
            C0395a savedStateRegistry = interfaceC4275d.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.m1825c().iterator();
            while (it.hasNext()) {
                AbstractC0343e0 m1824b = viewModelStore.m1824b(it.next());
                C4753m.m18650c(m1824b);
                LegacySavedStateHandleController.m1759a(m1824b, savedStateRegistry, interfaceC4275d.getLifecycle());
            }
            if (!viewModelStore.m1825c().isEmpty()) {
                savedStateRegistry.m1998i(C0330a.class);
            }
        }
    }

    /* renamed from: a */
    public static final void m1759a(AbstractC0343e0 abstractC0343e0, C0395a c0395a, AbstractC0344f abstractC0344f) {
        C4753m.m18653f(abstractC0343e0, "viewModel");
        C4753m.m18653f(c0395a, "registry");
        C4753m.m18653f(abstractC0344f, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) abstractC0343e0.m1798c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.m1772d()) {
            return;
        }
        savedStateHandleController.m1770b(c0395a, abstractC0344f);
        f1658a.m1761c(c0395a, abstractC0344f);
    }

    /* renamed from: b */
    public static final SavedStateHandleController m1760b(C0395a c0395a, AbstractC0344f abstractC0344f, String str, Bundle bundle) {
        C4753m.m18653f(c0395a, "registry");
        C4753m.m18653f(abstractC0344f, "lifecycle");
        C4753m.m18650c(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C0368x.f1760f.m1881a(c0395a.m1992b(str), bundle));
        savedStateHandleController.m1770b(c0395a, abstractC0344f);
        f1658a.m1761c(c0395a, abstractC0344f);
        return savedStateHandleController;
    }

    /* renamed from: c */
    public final void m1761c(final C0395a c0395a, final AbstractC0344f abstractC0344f) {
        AbstractC0344f.b mo1801b = abstractC0344f.mo1801b();
        if (mo1801b == AbstractC0344f.b.INITIALIZED || mo1801b.m1811c(AbstractC0344f.b.STARTED)) {
            c0395a.m1998i(C0330a.class);
        } else {
            abstractC0344f.mo1800a(new InterfaceC0350i() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.InterfaceC0350i
                /* renamed from: a */
                public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
                    C4753m.m18653f(interfaceC0354k, "source");
                    C4753m.m18653f(aVar, "event");
                    if (aVar == AbstractC0344f.a.ON_START) {
                        AbstractC0344f.this.mo1802c(this);
                        c0395a.m1998i(LegacySavedStateHandleController.C0330a.class);
                    }
                }
            });
        }
    }
}
