package com.google.android.gms.internal.p377firebaseauthapi;

/* loaded from: classes.dex */
public abstract class zzj {
    public int zza(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        zzz.zza(i10, length, "index");
        while (i10 < length) {
            if (zza(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean zza(char c10);
}
