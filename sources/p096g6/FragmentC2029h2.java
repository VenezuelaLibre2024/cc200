package p096g6;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
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

/* renamed from: g6.h2 */
/* loaded from: classes.dex */
public final class FragmentC2029h2 extends Fragment implements InterfaceC2030i {

    /* renamed from: k */
    public static final WeakHashMap f8046k = new WeakHashMap();

    /* renamed from: h */
    public final Map f8047h = Collections.synchronizedMap(new C4771a());

    /* renamed from: i */
    public int f8048i = 0;

    /* renamed from: j */
    public Bundle f8049j;

    /* renamed from: f */
    public static FragmentC2029h2 m8155f(Activity activity) {
        FragmentC2029h2 fragmentC2029h2;
        WeakHashMap weakHashMap = f8046k;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (fragmentC2029h2 = (FragmentC2029h2) weakReference.get()) != null) {
            return fragmentC2029h2;
        }
        try {
            FragmentC2029h2 fragmentC2029h22 = (FragmentC2029h2) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (fragmentC2029h22 == null || fragmentC2029h22.isRemoving()) {
                fragmentC2029h22 = new FragmentC2029h2();
                activity.getFragmentManager().beginTransaction().add(fragmentC2029h22, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(fragmentC2029h22));
            return fragmentC2029h22;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // p096g6.InterfaceC2030i
    /* renamed from: a */
    public final void mo8156a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f8047h.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f8047h.put(str, lifecycleCallback);
        if (this.f8048i > 0) {
            new zzi(Looper.getMainLooper()).post(new RunnableC2025g2(this, lifecycleCallback, str));
        }
    }

    @Override // p096g6.InterfaceC2030i
    /* renamed from: b */
    public final <T extends LifecycleCallback> T mo8157b(String str, Class<T> cls) {
        return cls.cast(this.f8047h.get(str));
    }

    @Override // p096g6.InterfaceC2030i
    /* renamed from: c */
    public final Activity mo8158c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f8047h.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f8047h.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8048i = 1;
        this.f8049j = bundle;
        for (Map.Entry entry : this.f8047h.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f8048i = 5;
        Iterator it = this.f8047h.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f8048i = 3;
        Iterator it = this.f8047h.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f8047h.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f8048i = 2;
        Iterator it = this.f8047h.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f8048i = 4;
        Iterator it = this.f8047h.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}
