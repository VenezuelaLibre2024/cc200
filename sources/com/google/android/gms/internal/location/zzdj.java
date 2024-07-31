package com.google.android.gms.internal.location;

import java.text.SimpleDateFormat;
import java.util.Locale;
import p130ib.C2693h;

/* loaded from: classes.dex */
public final class zzdj {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;
    private static final StringBuilder zzc;

    static {
        Locale locale = Locale.ROOT;
        zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        zzc = new StringBuilder(33);
    }

    public static String zza(long j10) {
        String sb2;
        StringBuilder sb3 = zzc;
        synchronized (sb3) {
            sb3.setLength(0);
            zzb(j10, sb3);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    public static void zzb(long j10, StringBuilder sb2) {
        String str;
        if (j10 == 0) {
            str = "0s";
        } else {
            sb2.ensureCapacity(sb2.length() + 27);
            boolean z10 = false;
            if (j10 < 0) {
                sb2.append("-");
                if (j10 != Long.MIN_VALUE) {
                    j10 = -j10;
                } else {
                    j10 = Long.MAX_VALUE;
                    z10 = true;
                }
            }
            if (j10 >= 86400000) {
                sb2.append(j10 / 86400000);
                sb2.append("d");
                j10 %= 86400000;
            }
            if (true == z10) {
                j10 = 25975808;
            }
            if (j10 >= 3600000) {
                sb2.append(j10 / 3600000);
                sb2.append(C2693h.f10528n);
                j10 %= 3600000;
            }
            if (j10 >= 60000) {
                sb2.append(j10 / 60000);
                sb2.append("m");
                j10 %= 60000;
            }
            if (j10 >= 1000) {
                sb2.append(j10 / 1000);
                sb2.append("s");
                j10 %= 1000;
            }
            if (j10 <= 0) {
                return;
            }
            sb2.append(j10);
            str = "ms";
        }
        sb2.append(str);
    }
}
