package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p277t5.C4707p;

/* loaded from: classes.dex */
public class TokenData extends AbstractC2601a implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new C4707p();

    /* renamed from: h */
    public final int f4374h;

    /* renamed from: i */
    public final String f4375i;

    /* renamed from: j */
    public final Long f4376j;

    /* renamed from: k */
    public final boolean f4377k;

    /* renamed from: l */
    public final boolean f4378l;

    /* renamed from: m */
    public final List f4379m;

    /* renamed from: n */
    public final String f4380n;

    public TokenData(int i10, String str, Long l10, boolean z10, boolean z11, List list, String str2) {
        this.f4374h = i10;
        this.f4375i = C2394s.m9613f(str);
        this.f4376j = l10;
        this.f4377k = z10;
        this.f4378l = z11;
        this.f4379m = list;
        this.f4380n = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f4375i, tokenData.f4375i) && C2388q.m9592b(this.f4376j, tokenData.f4376j) && this.f4377k == tokenData.f4377k && this.f4378l == tokenData.f4378l && C2388q.m9592b(this.f4379m, tokenData.f4379m) && C2388q.m9592b(this.f4380n, tokenData.f4380n);
    }

    public final int hashCode() {
        return C2388q.m9593c(this.f4375i, this.f4376j, Boolean.valueOf(this.f4377k), Boolean.valueOf(this.f4378l), this.f4379m, this.f4380n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f4374h);
        C2603c.m10456F(parcel, 2, this.f4375i, false);
        C2603c.m10451A(parcel, 3, this.f4376j, false);
        C2603c.m10471g(parcel, 4, this.f4377k);
        C2603c.m10471g(parcel, 5, this.f4378l);
        C2603c.m10458H(parcel, 6, this.f4379m, false);
        C2603c.m10456F(parcel, 7, this.f4380n, false);
        C2603c.m10466b(parcel, m10465a);
    }

    public final String zza() {
        return this.f4375i;
    }
}
