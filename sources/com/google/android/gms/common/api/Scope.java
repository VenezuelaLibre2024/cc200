package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p079f6.C1864x;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* loaded from: classes.dex */
public final class Scope extends AbstractC2601a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C1864x();

    /* renamed from: h */
    public final int f4467h;

    /* renamed from: i */
    public final String f4468i;

    public Scope(int i10, String str) {
        C2394s.m9614g(str, "scopeUri must not be null or empty");
        this.f4467h = i10;
        this.f4468i = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    /* renamed from: I */
    public String m4985I() {
        return this.f4468i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f4468i.equals(((Scope) obj).f4468i);
        }
        return false;
    }

    public int hashCode() {
        return this.f4468i.hashCode();
    }

    public String toString() {
        return this.f4468i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f4467h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, i11);
        C2603c.m10456F(parcel, 2, m4985I(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
