package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzaag;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p108h6.C2394s;
import p195n7.C3767g;
import p321w7.AbstractC5341a0;
import p321w7.C5376j;
import p321w7.InterfaceC5372i;
import p337x7.AbstractC5716s0;
import p337x7.InterfaceC5683h1;
import p337x7.InterfaceC5720t1;

/* renamed from: com.google.firebase.auth.c */
/* loaded from: classes.dex */
public final class C1261c extends AbstractC5716s0<InterfaceC5372i> {

    /* renamed from: a */
    public final /* synthetic */ boolean f4779a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC5341a0 f4780b;

    /* renamed from: c */
    public final /* synthetic */ C5376j f4781c;

    /* renamed from: d */
    public final /* synthetic */ FirebaseAuth f4782d;

    public C1261c(FirebaseAuth firebaseAuth, boolean z10, AbstractC5341a0 abstractC5341a0, C5376j c5376j) {
        this.f4779a = z10;
        this.f4780b = abstractC5341a0;
        this.f4781c = c5376j;
        this.f4782d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$c, x7.h1] */
    @Override // p337x7.AbstractC5716s0
    /* renamed from: c */
    public final Task<InterfaceC5372i> mo5294c(String str) {
        zzaag zzaagVar;
        C3767g c3767g;
        zzaag zzaagVar2;
        C3767g c3767g2;
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Email link login/reauth with empty reCAPTCHA token" : "Got reCAPTCHA token for login/reauth with email link");
        if (this.f4779a) {
            zzaagVar2 = this.f4782d.f4734e;
            c3767g2 = this.f4782d.f4730a;
            return zzaagVar2.zzb(c3767g2, (AbstractC5341a0) C2394s.m9619l(this.f4780b), this.f4781c, str, (InterfaceC5683h1) new FirebaseAuth.C1257c());
        }
        zzaagVar = this.f4782d.f4734e;
        c3767g = this.f4782d.f4730a;
        return zzaagVar.zza(c3767g, this.f4781c, str, (InterfaceC5720t1) new FirebaseAuth.C1258d());
    }
}
