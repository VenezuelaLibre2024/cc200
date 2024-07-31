package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzaag;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import p195n7.C3767g;
import p321w7.AbstractC5341a0;
import p321w7.AbstractC5368h;
import p321w7.C5376j;
import p321w7.InterfaceC5372i;
import p337x7.AbstractC5716s0;
import p337x7.InterfaceC5683h1;

/* renamed from: com.google.firebase.auth.i */
/* loaded from: classes.dex */
public final class C1267i extends AbstractC5716s0<InterfaceC5372i> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC5341a0 f4796a;

    /* renamed from: b */
    public final /* synthetic */ C5376j f4797b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseAuth f4798c;

    public C1267i(FirebaseAuth firebaseAuth, AbstractC5341a0 abstractC5341a0, C5376j c5376j) {
        this.f4796a = abstractC5341a0;
        this.f4797b = c5376j;
        this.f4798c = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$c, x7.h1] */
    @Override // p337x7.AbstractC5716s0
    /* renamed from: c */
    public final Task<InterfaceC5372i> mo5294c(String str) {
        zzaag zzaagVar;
        C3767g c3767g;
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Linking email account with empty reCAPTCHA token" : "Got reCAPTCHA token for linking email account");
        zzaagVar = this.f4798c.f4734e;
        c3767g = this.f4798c.f4730a;
        return zzaagVar.zza(c3767g, this.f4796a, (AbstractC5368h) this.f4797b, str, (InterfaceC5683h1) new FirebaseAuth.C1257c());
    }
}
