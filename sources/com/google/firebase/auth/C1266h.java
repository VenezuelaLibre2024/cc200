package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzaag;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.C1260b;
import p108h6.C2394s;
import p195n7.C3773m;
import p321w7.C5403r0;
import p337x7.AbstractC5714r1;
import p337x7.C5666d0;
import p337x7.C5706p;

/* renamed from: com.google.firebase.auth.h */
/* loaded from: classes.dex */
public final class C1266h implements OnCompleteListener<AbstractC5714r1> {

    /* renamed from: a */
    public final /* synthetic */ C1259a f4793a;

    /* renamed from: b */
    public final /* synthetic */ String f4794b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseAuth f4795c;

    public C1266h(FirebaseAuth firebaseAuth, C1259a c1259a, String str) {
        this.f4793a = c1259a;
        this.f4794b = str;
        this.f4795c = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<AbstractC5714r1> task) {
        String mo22814a;
        String str;
        C1260b.b m5228b0;
        zzaag zzaagVar;
        String str2;
        zzaag zzaagVar2;
        String str3;
        if (task.isSuccessful()) {
            String mo22816c = task.getResult().mo22816c();
            mo22814a = task.getResult().mo22814a();
            str = mo22816c;
        } else {
            String str4 = "Error while validating application identity: ";
            Exception exception = task.getException();
            if (exception != null) {
                str4 = "Error while validating application identity: " + exception.getMessage();
            }
            Log.e("FirebaseAuth", str4);
            if (exception != null && C5666d0.m22740h(exception)) {
                FirebaseAuth.m5189h0((C3773m) exception, this.f4793a, this.f4794b);
                return;
            } else {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                str = null;
                mo22814a = null;
            }
        }
        long longValue = this.f4793a.m5277h().longValue();
        m5228b0 = this.f4795c.m5228b0(this.f4793a.m5278i(), this.f4793a.m5275f());
        if (TextUtils.isEmpty(str)) {
            m5228b0 = this.f4795c.m5226a0(this.f4793a, m5228b0);
        }
        C1260b.b bVar = m5228b0;
        C5706p c5706p = (C5706p) C2394s.m9619l(this.f4793a.m5273d());
        if (c5706p.m22797M()) {
            zzaagVar2 = this.f4795c.f4734e;
            String str5 = (String) C2394s.m9619l(this.f4793a.m5278i());
            str3 = this.f4795c.f4738i;
            zzaagVar2.zza(c5706p, str5, str3, longValue, this.f4793a.m5274e() != null, this.f4793a.m5281l(), str, mo22814a, this.f4795c.m5208I0(), bVar, this.f4793a.m5279j(), this.f4793a.m5270a());
            return;
        }
        zzaagVar = this.f4795c.f4734e;
        C5403r0 c5403r0 = (C5403r0) C2394s.m9619l(this.f4793a.m5276g());
        str2 = this.f4795c.f4738i;
        zzaagVar.zza(c5706p, c5403r0, str2, longValue, this.f4793a.m5274e() != null, this.f4793a.m5281l(), str, mo22814a, this.f4795c.m5208I0(), bVar, this.f4793a.m5279j(), this.f4793a.m5270a());
    }
}
