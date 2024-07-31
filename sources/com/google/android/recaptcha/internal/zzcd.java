package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import p038ce.C1063k;
import p038ce.InterfaceC1085p0;

/* loaded from: classes.dex */
public final class zzcd {
    private final WebView zza;
    private final InterfaceC1085p0 zzb;

    public zzcd(WebView webView, InterfaceC1085p0 interfaceC1085p0) {
        this.zza = webView;
        this.zzb = interfaceC1085p0;
    }

    public final void zzb(String str, String... strArr) {
        C1063k.m4457d(this.zzb, null, null, new zzcc((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3, null);
    }
}
