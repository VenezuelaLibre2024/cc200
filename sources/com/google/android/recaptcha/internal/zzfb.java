package com.google.android.recaptcha.internal;

import ae.C0108n;
import android.net.Uri;
import android.text.TextUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p115hd.C2502n;
import p115hd.C2503o;
import td.C4753m;

/* loaded from: classes.dex */
public final class zzfb {
    public static final zzfb zza = new zzfb();
    private static final List zzb = zze(C2502n.m9991g("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));

    private zzfb() {
    }

    public static final boolean zza(Uri uri) {
        return zzd(uri) && zzc(uri.toString());
    }

    public static final boolean zzb(Uri uri) {
        return zzd(uri);
    }

    private static final boolean zzc(String str) {
        List list = zzb;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C0108n.m433s(str, (String) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zzd(Uri uri) {
        return (TextUtils.isEmpty(uri.toString()) || !C4753m.m18648a("https", uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) ? false : true;
    }

    private static final List zze(List list) {
        ArrayList arrayList = new ArrayList(C2503o.m9995k(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        }
        return arrayList;
    }
}
