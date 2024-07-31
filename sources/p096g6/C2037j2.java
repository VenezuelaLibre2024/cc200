package p096g6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.ActivityC0306j;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p285u.C4771a;

/* renamed from: g6.j2 */
/* loaded from: classes.dex */
public final class C2037j2 extends Fragment implements InterfaceC2030i {

    /* renamed from: k */
    public static final WeakHashMap f8063k = new WeakHashMap();

    /* renamed from: h */
    public final Map f8064h = Collections.synchronizedMap(new C4771a());

    /* renamed from: i */
    public int f8065i = 0;

    /* renamed from: j */
    public Bundle f8066j;

    /* renamed from: f */
    public static C2037j2 m8167f(ActivityC0306j activityC0306j) {
        C2037j2 c2037j2;
        WeakHashMap weakHashMap = f8063k;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activityC0306j);
        if (weakReference != null && (c2037j2 = (C2037j2) weakReference.get()) != null) {
            return c2037j2;
        }
        try {
            C2037j2 c2037j22 = (C2037j2) activityC0306j.getSupportFragmentManager().m1699j0("SupportLifecycleFragmentImpl");
            if (c2037j22 == null || c2037j22.isRemoving()) {
                c2037j22 = new C2037j2();
                activityC0306j.getSupportFragmentManager().m1713p().m1487d(c2037j22, "SupportLifecycleFragmentImpl").mo1360g();
            }
            weakHashMap.put(activityC0306j, new WeakReference(c2037j22));
            return c2037j22;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // p096g6.InterfaceC2030i
    /* renamed from: a */
    public final void mo8156a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f8064h.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f8064h.put(str, lifecycleCallback);
        if (this.f8065i > 0) {
            new zzi(Looper.getMainLooper()).post(new RunnableC2033i2(this, lifecycleCallback, str));
        }
    }

    @Override // p096g6.InterfaceC2030i
    /* renamed from: b */
    public final <T extends LifecycleCallback> T mo8157b(String str, Class<T> cls) {
        return cls.cast(this.f8064h.get(str));
    }

    @Override // p096g6.InterfaceC2030i
    /* renamed from: c */
    public final /* synthetic */ Activity mo8158c() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f8064h.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f8064h.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8065i = 1;
        this.f8066j = bundle;
        for (Map.Entry entry : this.f8064h.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f8065i = 5;
        Iterator it = this.f8064h.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f8065i = 3;
        Iterator it = this.f8064h.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f8064h.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f8065i = 2;
        Iterator it = this.f8064h.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f8065i = 4;
        Iterator it = this.f8064h.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}
