package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import p109h7.AbstractC2429l;
import p285u.C4777g;

/* loaded from: classes.dex */
public final class zzgr {

    /* loaded from: classes.dex */
    public static class zza {
        private static volatile AbstractC2429l<zzgp> zza;

        private zza() {
        }

        public static AbstractC2429l<zzgp> zza(Context context) {
            AbstractC2429l<zzgp> abstractC2429l;
            AbstractC2429l<zzgp> zza2;
            synchronized (zza.class) {
                abstractC2429l = zza;
                if (abstractC2429l == null) {
                    new zzgr();
                    if (zzgs.zza(Build.TYPE, Build.TAGS)) {
                        if (zzge.zza() && !context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        zza2 = zzgr.zza(context);
                    } else {
                        zza2 = AbstractC2429l.m9690a();
                    }
                    abstractC2429l = zza2;
                    zza = abstractC2429l;
                }
            }
            return abstractC2429l;
        }
    }

    private static zzgp zza(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                C4777g c4777g = new C4777g();
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        zzgk zzgkVar = new zzgk(c4777g);
                        bufferedReader.close();
                        return zzgkVar;
                    }
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String zza2 = zza(split[0]);
                        String decode = Uri.decode(zza(split[1]));
                        String str = (String) hashMap.get(split[2]);
                        if (str == null) {
                            String zza3 = zza(split[2]);
                            str = Uri.decode(zza3);
                            if (str.length() < 1024 || str == zza3) {
                                hashMap.put(zza3, str);
                            }
                        }
                        if (!c4777g.containsKey(zza2)) {
                            c4777g.put(zza2, new C4777g());
                        }
                        ((C4777g) c4777g.get(zza2)).put(decode, str);
                    }
                }
            } finally {
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static AbstractC2429l<zzgp> zza(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            AbstractC2429l<File> zzb = zzb(context);
            return zzb.mo9656c() ? AbstractC2429l.m9691d(zza(context, zzb.mo9655b())) : AbstractC2429l.m9690a();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }

    private static AbstractC2429l<File> zzb(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? AbstractC2429l.m9691d(file) : AbstractC2429l.m9690a();
        } catch (RuntimeException e10) {
            Log.e("HermeticFileOverrides", "no data dir", e10);
            return AbstractC2429l.m9690a();
        }
    }
}
