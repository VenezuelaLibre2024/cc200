package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import gd.C2238l;
import gd.C2245s;
import java.util.ArrayList;
import p038ce.InterfaceC1085p0;
import p115hd.C2510v;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcc extends AbstractC3478l implements InterfaceC4584p {
    public final /* synthetic */ String[] zza;
    public final /* synthetic */ zzcd zzb;
    public final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcc(String[] strArr, zzcd zzcdVar, String str, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zza = strArr;
        this.zzb = zzcdVar;
        this.zzc = str;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzcc(this.zza, this.zzb, this.zzc, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        C3385c.m12581c();
        C2238l.m8975b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        zzcd zzcdVar = this.zzb;
        String str2 = this.zzc;
        webView = zzcdVar.zza;
        webView.evaluateJavascript(str2 + "(" + C2510v.m10025x(arrayList, ",", null, null, 0, null, null, 62, null) + ")", null);
        return C2245s.f8873a;
    }
}
