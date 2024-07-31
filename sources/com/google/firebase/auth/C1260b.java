package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p154k6.C3363a;
import p195n7.C3773m;
import p321w7.C5394o0;

/* renamed from: com.google.firebase.auth.b */
/* loaded from: classes.dex */
public class C1260b {

    /* renamed from: com.google.firebase.auth.b$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC2601a {
        public static final Parcelable.Creator<a> CREATOR = new C1263e();

        /* renamed from: I */
        public static a m5293I() {
            return new a();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            C2603c.m10466b(parcel, C2603c.m10465a(parcel));
        }
    }

    /* renamed from: com.google.firebase.auth.b$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        private static final C3363a zza = new C3363a("PhoneAuthProvider", new String[0]);

        public void onCodeAutoRetrievalTimeOut(String str) {
            zza.m12510e("Sms auto retrieval timed-out.", new Object[0]);
        }

        public void onCodeSent(String str, a aVar) {
        }

        public abstract void onVerificationCompleted(C5394o0 c5394o0);

        public abstract void onVerificationFailed(C3773m c3773m);
    }

    /* renamed from: a */
    public static C5394o0 m5291a(String str, String str2) {
        return C5394o0.m21541M(str, str2);
    }

    /* renamed from: b */
    public static void m5292b(C1259a c1259a) {
        C2394s.m9619l(c1259a);
        FirebaseAuth.m5188f0(c1259a);
    }
}
