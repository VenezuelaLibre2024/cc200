package p064e6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0326x;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0296e;
import p108h6.C2394s;

/* renamed from: e6.m */
/* loaded from: classes.dex */
public class C1689m extends DialogInterfaceOnCancelListenerC0296e {

    /* renamed from: x */
    public Dialog f6284x;

    /* renamed from: y */
    public DialogInterface.OnCancelListener f6285y;

    /* renamed from: z */
    public Dialog f6286z;

    /* renamed from: p */
    public static C1689m m6748p(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C1689m c1689m = new C1689m();
        Dialog dialog2 = (Dialog) C2394s.m9620m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c1689m.f6284x = dialog2;
        if (onCancelListener != null) {
            c1689m.f6285y = onCancelListener;
        }
        return c1689m;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0296e
    /* renamed from: i */
    public Dialog mo1426i(Bundle bundle) {
        Dialog dialog = this.f6284x;
        if (dialog != null) {
            return dialog;
        }
        m1430m(false);
        if (this.f6286z == null) {
            this.f6286z = new AlertDialog.Builder((Context) C2394s.m9619l(getContext())).create();
        }
        return this.f6286z;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0296e
    /* renamed from: o */
    public void mo1432o(AbstractC0326x abstractC0326x, String str) {
        super.mo1432o(abstractC0326x, str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0296e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6285y;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
