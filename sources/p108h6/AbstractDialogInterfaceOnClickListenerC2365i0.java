package p108h6;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import p096g6.InterfaceC2030i;

/* renamed from: h6.i0 */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC2365i0 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static AbstractDialogInterfaceOnClickListenerC2365i0 m9569b(Activity activity, Intent intent, int i10) {
        return new C2359g0(intent, activity, i10);
    }

    /* renamed from: c */
    public static AbstractDialogInterfaceOnClickListenerC2365i0 m9570c(InterfaceC2030i interfaceC2030i, Intent intent, int i10) {
        return new C2362h0(intent, interfaceC2030i, 2);
    }

    /* renamed from: a */
    public abstract void mo9552a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            mo9552a();
        } catch (ActivityNotFoundException e10) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
