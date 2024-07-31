package p064e6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import p108h6.C2394s;

/* renamed from: e6.c */
/* loaded from: classes.dex */
public class DialogFragmentC1669c extends DialogFragment {

    /* renamed from: h */
    public Dialog f6240h;

    /* renamed from: i */
    public DialogInterface.OnCancelListener f6241i;

    /* renamed from: j */
    public Dialog f6242j;

    /* renamed from: a */
    public static DialogFragmentC1669c m6690a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC1669c dialogFragmentC1669c = new DialogFragmentC1669c();
        Dialog dialog2 = (Dialog) C2394s.m9620m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC1669c.f6240h = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC1669c.f6241i = onCancelListener;
        }
        return dialogFragmentC1669c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6241i;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f6240h;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f6242j == null) {
            this.f6242j = new AlertDialog.Builder((Context) C2394s.m9619l(getActivity())).create();
        }
        return this.f6242j;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
