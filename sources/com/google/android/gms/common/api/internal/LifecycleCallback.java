package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p096g6.C2026h;
import p096g6.C2037j2;
import p096g6.FragmentC2029h2;
import p096g6.InterfaceC2030i;
import p108h6.C2394s;

/* loaded from: classes.dex */
public class LifecycleCallback {
    public final InterfaceC2030i mLifecycleFragment;

    public LifecycleCallback(InterfaceC2030i interfaceC2030i) {
        this.mLifecycleFragment = interfaceC2030i;
    }

    @Keep
    private static InterfaceC2030i getChimeraLifecycleFragmentImpl(C2026h c2026h) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static InterfaceC2030i getFragment(Activity activity) {
        return getFragment(new C2026h(activity));
    }

    public static InterfaceC2030i getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public static InterfaceC2030i getFragment(C2026h c2026h) {
        if (c2026h.m8151d()) {
            return C2037j2.m8167f(c2026h.m8149b());
        }
        if (c2026h.m8150c()) {
            return FragmentC2029h2.m8155f(c2026h.m8148a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity mo8158c = this.mLifecycleFragment.mo8158c();
        C2394s.m9619l(mo8158c);
        return mo8158c;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }
}
