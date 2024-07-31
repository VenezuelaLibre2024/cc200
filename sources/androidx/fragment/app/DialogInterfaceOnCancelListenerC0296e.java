package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.DialogC0155h;
import androidx.lifecycle.C0353j0;
import androidx.lifecycle.C0355k0;
import androidx.lifecycle.InterfaceC0354k;
import androidx.lifecycle.InterfaceC0362r;
import p247r1.C4276e;

/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0296e extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: h */
    public Handler f1428h;

    /* renamed from: q */
    public boolean f1437q;

    /* renamed from: s */
    public Dialog f1439s;

    /* renamed from: t */
    public boolean f1440t;

    /* renamed from: u */
    public boolean f1441u;

    /* renamed from: v */
    public boolean f1442v;

    /* renamed from: i */
    public Runnable f1429i = new a();

    /* renamed from: j */
    public DialogInterface.OnCancelListener f1430j = new b();

    /* renamed from: k */
    public DialogInterface.OnDismissListener f1431k = new c();

    /* renamed from: l */
    public int f1432l = 0;

    /* renamed from: m */
    public int f1433m = 0;

    /* renamed from: n */
    public boolean f1434n = true;

    /* renamed from: o */
    public boolean f1435o = true;

    /* renamed from: p */
    public int f1436p = -1;

    /* renamed from: r */
    public InterfaceC0362r<InterfaceC0354k> f1438r = new d();

    /* renamed from: w */
    public boolean f1443w = false;

    /* renamed from: androidx.fragment.app.e$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogInterfaceOnCancelListenerC0296e.this.f1431k.onDismiss(DialogInterfaceOnCancelListenerC0296e.this.f1439s);
        }
    }

    /* renamed from: androidx.fragment.app.e$b */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0296e.this.f1439s != null) {
                DialogInterfaceOnCancelListenerC0296e dialogInterfaceOnCancelListenerC0296e = DialogInterfaceOnCancelListenerC0296e.this;
                dialogInterfaceOnCancelListenerC0296e.onCancel(dialogInterfaceOnCancelListenerC0296e.f1439s);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$c */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0296e.this.f1439s != null) {
                DialogInterfaceOnCancelListenerC0296e dialogInterfaceOnCancelListenerC0296e = DialogInterfaceOnCancelListenerC0296e.this;
                dialogInterfaceOnCancelListenerC0296e.onDismiss(dialogInterfaceOnCancelListenerC0296e.f1439s);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC0362r<InterfaceC0354k> {
        public d() {
        }

        @Override // androidx.lifecycle.InterfaceC0362r
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo1433a(InterfaceC0354k interfaceC0354k) {
            if (interfaceC0354k == null || !DialogInterfaceOnCancelListenerC0296e.this.f1435o) {
                return;
            }
            View requireView = DialogInterfaceOnCancelListenerC0296e.this.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC0296e.this.f1439s != null) {
                if (AbstractC0326x.m1617I0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC0296e.this.f1439s);
                }
                DialogInterfaceOnCancelListenerC0296e.this.f1439s.setContentView(requireView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$e */
    /* loaded from: classes.dex */
    public class e extends AbstractC0310l {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0310l f1448a;

        public e(AbstractC0310l abstractC0310l) {
            this.f1448a = abstractC0310l;
        }

        @Override // androidx.fragment.app.AbstractC0310l
        /* renamed from: c */
        public View mo1350c(int i10) {
            return this.f1448a.mo1351d() ? this.f1448a.mo1350c(i10) : DialogInterfaceOnCancelListenerC0296e.this.m1427j(i10);
        }

        @Override // androidx.fragment.app.AbstractC0310l
        /* renamed from: d */
        public boolean mo1351d() {
            return this.f1448a.mo1351d() || DialogInterfaceOnCancelListenerC0296e.this.m1428k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public AbstractC0310l createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    /* renamed from: g */
    public final void m1424g(boolean z10, boolean z11, boolean z12) {
        if (this.f1441u) {
            return;
        }
        this.f1441u = true;
        this.f1442v = false;
        Dialog dialog = this.f1439s;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1439s.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f1428h.getLooper()) {
                    onDismiss(this.f1439s);
                } else {
                    this.f1428h.post(this.f1429i);
                }
            }
        }
        this.f1440t = true;
        if (this.f1436p >= 0) {
            if (z12) {
                getParentFragmentManager().m1688e1(this.f1436p, 1);
            } else {
                getParentFragmentManager().m1685c1(this.f1436p, 1, z10);
            }
            this.f1436p = -1;
            return;
        }
        AbstractC0301g0 m1713p = getParentFragmentManager().m1713p();
        m1713p.m1490m(true);
        m1713p.mo1364l(this);
        if (z12) {
            m1713p.mo1361h();
        } else if (z10) {
            m1713p.mo1360g();
        } else {
            m1713p.mo1359f();
        }
    }

    /* renamed from: h */
    public int m1425h() {
        return this.f1433m;
    }

    /* renamed from: i */
    public Dialog mo1426i(Bundle bundle) {
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0155h(requireContext(), m1425h());
    }

    /* renamed from: j */
    public View m1427j(int i10) {
        Dialog dialog = this.f1439s;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    /* renamed from: k */
    public boolean m1428k() {
        return this.f1443w;
    }

    /* renamed from: l */
    public final void m1429l(Bundle bundle) {
        if (this.f1435o && !this.f1443w) {
            try {
                this.f1437q = true;
                Dialog mo1426i = mo1426i(bundle);
                this.f1439s = mo1426i;
                if (this.f1435o) {
                    m1431n(mo1426i, this.f1432l);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f1439s.setOwnerActivity((Activity) context);
                    }
                    this.f1439s.setCancelable(this.f1434n);
                    this.f1439s.setOnCancelListener(this.f1430j);
                    this.f1439s.setOnDismissListener(this.f1431k);
                    this.f1443w = true;
                } else {
                    this.f1439s = null;
                }
            } finally {
                this.f1437q = false;
            }
        }
    }

    /* renamed from: m */
    public void m1430m(boolean z10) {
        this.f1435o = z10;
    }

    /* renamed from: n */
    public void m1431n(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: o */
    public void mo1432o(AbstractC0326x abstractC0326x, String str) {
        this.f1441u = false;
        this.f1442v = true;
        AbstractC0301g0 m1713p = abstractC0326x.m1713p();
        m1713p.m1490m(true);
        m1713p.m1487d(this, str);
        m1713p.mo1359f();
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.f1438r);
        if (this.f1442v) {
            return;
        }
        this.f1441u = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1428h = new Handler();
        this.f1435o = this.mContainerId == 0;
        if (bundle != null) {
            this.f1432l = bundle.getInt("android:style", 0);
            this.f1433m = bundle.getInt("android:theme", 0);
            this.f1434n = bundle.getBoolean("android:cancelable", true);
            this.f1435o = bundle.getBoolean("android:showsDialog", this.f1435o);
            this.f1436p = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f1439s;
        if (dialog != null) {
            this.f1440t = true;
            dialog.setOnDismissListener(null);
            this.f1439s.dismiss();
            if (!this.f1441u) {
                onDismiss(this.f1439s);
            }
            this.f1439s = null;
            this.f1443w = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.f1442v && !this.f1441u) {
            this.f1441u = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.f1438r);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1440t) {
            return;
        }
        if (AbstractC0326x.m1617I0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m1424g(true, true, false);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        StringBuilder sb2;
        String str;
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f1435o && !this.f1437q) {
            m1429l(bundle);
            if (AbstractC0326x.m1617I0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f1439s;
            return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
        }
        if (AbstractC0326x.m1617I0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.f1435o) {
                sb2 = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb2 = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb2.append(str);
            sb2.append(str2);
            Log.d("FragmentManager", sb2.toString());
        }
        return onGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f1439s;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f1432l;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f1433m;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f1434n;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f1435o;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f1436p;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f1439s;
        if (dialog != null) {
            this.f1440t = false;
            dialog.show();
            View decorView = this.f1439s.getWindow().getDecorView();
            C0353j0.m1827a(decorView, this);
            C0355k0.m1828a(decorView, this);
            C4276e.m16407a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f1439s;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f1439s == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1439s.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f1439s == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1439s.onRestoreInstanceState(bundle2);
    }
}
