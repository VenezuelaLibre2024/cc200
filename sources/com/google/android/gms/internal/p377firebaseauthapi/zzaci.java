package com.google.android.gms.internal.p377firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
import p154k6.C3363a;
import p308v7.InterfaceC5140b;
import p354y8.InterfaceC5896b;

/* loaded from: classes.dex */
public interface zzaci {
    public static final C3363a zza = new C3363a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context zza();

    Uri.Builder zza(Intent intent, String str, String str2);

    String zza(String str);

    HttpURLConnection zza(URL url);

    void zza(Uri uri, String str, InterfaceC5896b<InterfaceC5140b> interfaceC5896b);

    void zza(String str, Status status);
}
