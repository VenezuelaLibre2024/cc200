package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzaag;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p108h6.C2394s;
import p195n7.C3767g;
import p321w7.AbstractC5341a0;
import p321w7.InterfaceC5372i;
import p337x7.AbstractC5716s0;

/* renamed from: com.google.firebase.auth.d */
/* loaded from: classes.dex */
public final class C1262d extends AbstractC5716s0<InterfaceC5372i> {

    /* renamed from: a */
    public final /* synthetic */ String f4783a;

    /* renamed from: b */
    public final /* synthetic */ boolean f4784b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC5341a0 f4785c;

    /* renamed from: d */
    public final /* synthetic */ String f4786d;

    /* renamed from: e */
    public final /* synthetic */ String f4787e;

    /* renamed from: f */
    public final /* synthetic */ FirebaseAuth f4788f;

    public C1262d(FirebaseAuth firebaseAuth, String str, boolean z10, AbstractC5341a0 abstractC5341a0, String str2, String str3) {
        this.f4783a = str;
        this.f4784b = z10;
        this.f4785c = abstractC5341a0;
        this.f4786d = str2;
        this.f4787e = str3;
        this.f4788f = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.auth.FirebaseAuth$c, x7.h1] */
    @Override // p337x7.AbstractC5716s0
    /* renamed from: c */
    public final Task<InterfaceC5372i> mo5294c(String str) {
        String str2;
        StringBuilder sb2;
        zzaag zzaagVar;
        C3767g c3767g;
        zzaag zzaagVar2;
        C3767g c3767g2;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f4783a;
            sb2 = new StringBuilder("Logging in as ");
            sb2.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f4783a;
            sb2 = new StringBuilder("Got reCAPTCHA token for login with email ");
        }
        sb2.append(str2);
        Log.i("FirebaseAuth", sb2.toString());
        if (this.f4784b) {
            zzaagVar2 = this.f4788f.f4734e;
            c3767g2 = this.f4788f.f4730a;
            return zzaagVar2.zzb(c3767g2, (AbstractC5341a0) C2394s.m9619l(this.f4785c), this.f4783a, this.f4786d, this.f4787e, str, new FirebaseAuth.C1257c());
        }
        zzaagVar = this.f4788f.f4734e;
        c3767g = this.f4788f.f4730a;
        return zzaagVar.zzb(c3767g, this.f4783a, this.f4786d, this.f4787e, str, new FirebaseAuth.C1258d());
    }
}
