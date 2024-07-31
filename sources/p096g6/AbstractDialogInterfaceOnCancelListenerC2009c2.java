package p096g6;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;
import p064e6.C1667b;
import p064e6.C1673e;

/* renamed from: g6.c2 */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC2009c2 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: h */
    public volatile boolean f8007h;

    /* renamed from: i */
    public final AtomicReference f8008i;

    /* renamed from: j */
    public final Handler f8009j;

    /* renamed from: k */
    public final C1673e f8010k;

    @VisibleForTesting
    public AbstractDialogInterfaceOnCancelListenerC2009c2(InterfaceC2030i interfaceC2030i, C1673e c1673e) {
        super(interfaceC2030i);
        this.f8008i = new AtomicReference(null);
        this.f8009j = new zau(Looper.getMainLooper());
        this.f8010k = c1673e;
    }

    /* renamed from: e */
    public static final int m8101e(C2085z1 c2085z1) {
        if (c2085z1 == null) {
            return -1;
        }
        return c2085z1.m8285a();
    }

    /* renamed from: a */
    public final void m8104a(C1667b c1667b, int i10) {
        this.f8008i.set(null);
        mo8087b(c1667b, i10);
    }

    /* renamed from: b */
    public abstract void mo8087b(C1667b c1667b, int i10);

    /* renamed from: c */
    public abstract void mo8088c();

    /* renamed from: d */
    public final void m8105d() {
        this.f8008i.set(null);
        mo8088c();
    }

    /* renamed from: h */
    public final void m8106h(C1667b c1667b, int i10) {
        C2085z1 c2085z1 = new C2085z1(c1667b, i10);
        AtomicReference atomicReference = this.f8008i;
        while (!atomicReference.compareAndSet(null, c2085z1)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.f8009j.post(new RunnableC2005b2(this, c2085z1));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i10, int i11, Intent intent) {
        C2085z1 c2085z1 = (C2085z1) this.f8008i.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int mo6697g = this.f8010k.mo6697g(getActivity());
                if (mo6697g == 0) {
                    m8105d();
                    return;
                } else {
                    if (c2085z1 == null) {
                        return;
                    }
                    if (c2085z1.m8286b().m6677I() == 18 && mo6697g == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            m8105d();
            return;
        } else if (i11 == 0) {
            if (c2085z1 == null) {
                return;
            }
            m8104a(new C1667b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c2085z1.m8286b().toString()), m8101e(c2085z1));
            return;
        }
        if (c2085z1 != null) {
            m8104a(c2085z1.m8286b(), c2085z1.m8285a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m8104a(new C1667b(13, null), m8101e((C2085z1) this.f8008i.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f8008i.set(bundle.getBoolean("resolving_error", false) ? new C2085z1(new C1667b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C2085z1 c2085z1 = (C2085z1) this.f8008i.get();
        if (c2085z1 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c2085z1.m8285a());
        bundle.putInt("failed_status", c2085z1.m8286b().m6677I());
        bundle.putParcelable("failed_resolution", c2085z1.m8286b().m6679K());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.f8007h = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.f8007h = false;
    }
}
