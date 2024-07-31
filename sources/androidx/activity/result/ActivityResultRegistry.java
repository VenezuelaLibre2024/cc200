package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.InterfaceC0350i;
import androidx.lifecycle.InterfaceC0354k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p072f.AbstractC1793a;
import p329x.C5485c;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    public Random f488a = new Random();

    /* renamed from: b */
    public final Map<Integer, String> f489b = new HashMap();

    /* renamed from: c */
    public final Map<String, Integer> f490c = new HashMap();

    /* renamed from: d */
    public final Map<String, C0169d> f491d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f492e = new ArrayList<>();

    /* renamed from: f */
    public final transient Map<String, C0168c<?>> f493f = new HashMap();

    /* renamed from: g */
    public final Map<String, Object> f494g = new HashMap();

    /* renamed from: h */
    public final Bundle f495h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    /* loaded from: classes.dex */
    public class C0166a<I> extends AbstractC0172c<I> {

        /* renamed from: a */
        public final /* synthetic */ String f500a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC1793a f501b;

        public C0166a(String str, AbstractC1793a abstractC1793a) {
            this.f500a = str;
            this.f501b = abstractC1793a;
        }

        @Override // androidx.activity.result.AbstractC0172c
        /* renamed from: b */
        public void mo618b(I i10, C5485c c5485c) {
            Integer num = ActivityResultRegistry.this.f490c.get(this.f500a);
            if (num != null) {
                ActivityResultRegistry.this.f492e.add(this.f500a);
                try {
                    ActivityResultRegistry.this.mo572f(num.intValue(), this.f501b, i10, c5485c);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f492e.remove(this.f500a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f501b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.AbstractC0172c
        /* renamed from: c */
        public void mo619c() {
            ActivityResultRegistry.this.m617l(this.f500a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    /* loaded from: classes.dex */
    public class C0167b<I> extends AbstractC0172c<I> {

        /* renamed from: a */
        public final /* synthetic */ String f503a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC1793a f504b;

        public C0167b(String str, AbstractC1793a abstractC1793a) {
            this.f503a = str;
            this.f504b = abstractC1793a;
        }

        @Override // androidx.activity.result.AbstractC0172c
        /* renamed from: b */
        public void mo618b(I i10, C5485c c5485c) {
            Integer num = ActivityResultRegistry.this.f490c.get(this.f503a);
            if (num != null) {
                ActivityResultRegistry.this.f492e.add(this.f503a);
                try {
                    ActivityResultRegistry.this.mo572f(num.intValue(), this.f504b, i10, c5485c);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f492e.remove(this.f503a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f504b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.AbstractC0172c
        /* renamed from: c */
        public void mo619c() {
            ActivityResultRegistry.this.m617l(this.f503a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    /* loaded from: classes.dex */
    public static class C0168c<O> {

        /* renamed from: a */
        public final InterfaceC0171b<O> f506a;

        /* renamed from: b */
        public final AbstractC1793a<?, O> f507b;

        public C0168c(InterfaceC0171b<O> interfaceC0171b, AbstractC1793a<?, O> abstractC1793a) {
            this.f506a = interfaceC0171b;
            this.f507b = abstractC1793a;
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    /* loaded from: classes.dex */
    public static class C0169d {

        /* renamed from: a */
        public final AbstractC0344f f508a;

        /* renamed from: b */
        public final ArrayList<InterfaceC0350i> f509b = new ArrayList<>();

        public C0169d(AbstractC0344f abstractC0344f) {
            this.f508a = abstractC0344f;
        }

        /* renamed from: a */
        public void m620a(InterfaceC0350i interfaceC0350i) {
            this.f508a.mo1800a(interfaceC0350i);
            this.f509b.add(interfaceC0350i);
        }

        /* renamed from: b */
        public void m621b() {
            Iterator<InterfaceC0350i> it = this.f509b.iterator();
            while (it.hasNext()) {
                this.f508a.mo1802c(it.next());
            }
            this.f509b.clear();
        }
    }

    /* renamed from: a */
    public final void m607a(int i10, String str) {
        this.f489b.put(Integer.valueOf(i10), str);
        this.f490c.put(str, Integer.valueOf(i10));
    }

    /* renamed from: b */
    public final boolean m608b(int i10, int i11, Intent intent) {
        String str = this.f489b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        m610d(str, i11, intent, this.f493f.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean m609c(int i10, @SuppressLint({"UnknownNullness"}) O o10) {
        InterfaceC0171b<?> interfaceC0171b;
        String str = this.f489b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        C0168c<?> c0168c = this.f493f.get(str);
        if (c0168c == null || (interfaceC0171b = c0168c.f506a) == null) {
            this.f495h.remove(str);
            this.f494g.put(str, o10);
            return true;
        }
        if (!this.f492e.remove(str)) {
            return true;
        }
        interfaceC0171b.mo627a(o10);
        return true;
    }

    /* renamed from: d */
    public final <O> void m610d(String str, int i10, Intent intent, C0168c<O> c0168c) {
        if (c0168c == null || c0168c.f506a == null || !this.f492e.contains(str)) {
            this.f494g.remove(str);
            this.f495h.putParcelable(str, new C0170a(i10, intent));
        } else {
            c0168c.f506a.mo627a(c0168c.f507b.mo1751c(i10, intent));
            this.f492e.remove(str);
        }
    }

    /* renamed from: e */
    public final int m611e() {
        int nextInt = this.f488a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (!this.f489b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            nextInt = this.f488a.nextInt(2147418112);
        }
    }

    /* renamed from: f */
    public abstract <I, O> void mo572f(int i10, AbstractC1793a<I, O> abstractC1793a, @SuppressLint({"UnknownNullness"}) I i11, C5485c c5485c);

    /* renamed from: g */
    public final void m612g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f492e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f488a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f495h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f490c.containsKey(str)) {
                Integer remove = this.f490c.remove(str);
                if (!this.f495h.containsKey(str)) {
                    this.f489b.remove(remove);
                }
            }
            m607a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
    }

    /* renamed from: h */
    public final void m613h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f490c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f490c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f492e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f495h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f488a);
    }

    /* renamed from: i */
    public final <I, O> AbstractC0172c<I> m614i(final String str, InterfaceC0354k interfaceC0354k, final AbstractC1793a<I, O> abstractC1793a, final InterfaceC0171b<O> interfaceC0171b) {
        AbstractC0344f lifecycle = interfaceC0354k.getLifecycle();
        if (lifecycle.mo1801b().m1811c(AbstractC0344f.b.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC0354k + " is attempting to register while current state is " + lifecycle.mo1801b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        m616k(str);
        C0169d c0169d = this.f491d.get(str);
        if (c0169d == null) {
            c0169d = new C0169d(lifecycle);
        }
        c0169d.m620a(new InterfaceC0350i() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.InterfaceC0350i
            /* renamed from: a */
            public void mo571a(InterfaceC0354k interfaceC0354k2, AbstractC0344f.a aVar) {
                if (!AbstractC0344f.a.ON_START.equals(aVar)) {
                    if (AbstractC0344f.a.ON_STOP.equals(aVar)) {
                        ActivityResultRegistry.this.f493f.remove(str);
                        return;
                    } else {
                        if (AbstractC0344f.a.ON_DESTROY.equals(aVar)) {
                            ActivityResultRegistry.this.m617l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f493f.put(str, new C0168c<>(interfaceC0171b, abstractC1793a));
                if (ActivityResultRegistry.this.f494g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f494g.get(str);
                    ActivityResultRegistry.this.f494g.remove(str);
                    interfaceC0171b.mo627a(obj);
                }
                C0170a c0170a = (C0170a) ActivityResultRegistry.this.f495h.getParcelable(str);
                if (c0170a != null) {
                    ActivityResultRegistry.this.f495h.remove(str);
                    interfaceC0171b.mo627a(abstractC1793a.mo1751c(c0170a.m624b(), c0170a.m623a()));
                }
            }
        });
        this.f491d.put(str, c0169d);
        return new C0166a(str, abstractC1793a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final <I, O> AbstractC0172c<I> m615j(String str, AbstractC1793a<I, O> abstractC1793a, InterfaceC0171b<O> interfaceC0171b) {
        m616k(str);
        this.f493f.put(str, new C0168c<>(interfaceC0171b, abstractC1793a));
        if (this.f494g.containsKey(str)) {
            Object obj = this.f494g.get(str);
            this.f494g.remove(str);
            interfaceC0171b.mo627a(obj);
        }
        C0170a c0170a = (C0170a) this.f495h.getParcelable(str);
        if (c0170a != null) {
            this.f495h.remove(str);
            interfaceC0171b.mo627a(abstractC1793a.mo1751c(c0170a.m624b(), c0170a.m623a()));
        }
        return new C0167b(str, abstractC1793a);
    }

    /* renamed from: k */
    public final void m616k(String str) {
        if (this.f490c.get(str) != null) {
            return;
        }
        m607a(m611e(), str);
    }

    /* renamed from: l */
    public final void m617l(String str) {
        Integer remove;
        if (!this.f492e.contains(str) && (remove = this.f490c.remove(str)) != null) {
            this.f489b.remove(remove);
        }
        this.f493f.remove(str);
        if (this.f494g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f494g.get(str));
            this.f494g.remove(str);
        }
        if (this.f495h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f495h.getParcelable(str));
            this.f495h.remove(str);
        }
        C0169d c0169d = this.f491d.get(str);
        if (c0169d != null) {
            c0169d.m621b();
            this.f491d.remove(str);
        }
    }
}
