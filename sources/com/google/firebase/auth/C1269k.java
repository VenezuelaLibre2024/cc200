package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzaag;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p195n7.C3767g;
import p321w7.InterfaceC5372i;
import p337x7.AbstractC5716s0;

/* renamed from: com.google.firebase.auth.k */
/* loaded from: classes.dex */
public final class C1269k extends AbstractC5716s0<InterfaceC5372i> {

    /* renamed from: a */
    public final /* synthetic */ String f4809a;

    /* renamed from: b */
    public final /* synthetic */ String f4810b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseAuth f4811c;

    public C1269k(FirebaseAuth firebaseAuth, String str, String str2) {
        this.f4809a = str;
        this.f4810b = str2;
        this.f4811c = firebaseAuth;
    }

    @Override // p337x7.AbstractC5716s0
    /* renamed from: c */
    public final Task<InterfaceC5372i> mo5294c(String str) {
        String str2;
        StringBuilder sb2;
        zzaag zzaagVar;
        C3767g c3767g;
        String str3;
        if (TextUtils.isEmpty(str)) {
            String str4 = this.f4809a;
            sb2 = new StringBuilder("Creating user with ");
            sb2.append(str4);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f4809a;
            sb2 = new StringBuilder("Got reCAPTCHA token for sign up with email ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        zzaagVar = this.f4811c.f4734e;
        c3767g = this.f4811c.f4730a;
        String str5 = this.f4809a;
        String str6 = this.f4810b;
        str3 = this.f4811c.f4740k;
        return zzaagVar.zza(c3767g, str5, str6, str3, str, new FirebaseAuth.C1258d());
    }
}
