package com.google.android.gms.internal.p377firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import p154k6.C3363a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadx extends BroadcastReceiver {
    private final String zza;
    private final /* synthetic */ zzadt zzb;

    public zzadx(zzadt zzadtVar, String str) {
        this.zzb = zzadtVar;
        this.zza = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        HashMap hashMap;
        C3363a c3363a;
        C3363a c3363a2;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).m4987J() == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                hashMap = this.zzb.zzd;
                zzaea zzaeaVar = (zzaea) hashMap.get(this.zza);
                if (zzaeaVar == null) {
                    c3363a2 = zzadt.zza;
                    c3363a2.m12508c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String zza = zzadt.zza(str);
                    zzaeaVar.zze = zza;
                    if (zza == null) {
                        c3363a = zzadt.zza;
                        c3363a.m12508c("Unable to extract verification code.", new Object[0]);
                    } else if (!zzah.zzc(zzaeaVar.zzd)) {
                        zzadt.zza(this.zzb, this.zza);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
