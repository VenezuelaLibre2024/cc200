package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p021b6.C0483b;
import p021b6.C0506y;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* loaded from: classes.dex */
public final class SignInConfiguration extends AbstractC2601a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C0506y();

    /* renamed from: h */
    public final String f4457h;

    /* renamed from: i */
    public final GoogleSignInOptions f4458i;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f4457h = C2394s.m9613f(str);
        this.f4458i = googleSignInOptions;
    }

    /* renamed from: I */
    public final GoogleSignInOptions m4977I() {
        return this.f4458i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f4457h.equals(signInConfiguration.f4457h)) {
            GoogleSignInOptions googleSignInOptions = this.f4458i;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f4458i;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C0483b().m2416a(this.f4457h).m2416a(this.f4458i).m2417b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f4457h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 2, str, false);
        C2603c.m10454D(parcel, 5, this.f4458i, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
