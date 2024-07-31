package p320w6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: w6.l */
/* loaded from: classes.dex */
public final class C5310l extends AbstractC2601a {
    public static final Parcelable.Creator<C5310l> CREATOR = new C5331v0();

    /* renamed from: h */
    public final long f20102h;

    /* renamed from: i */
    public final int f20103i;

    /* renamed from: j */
    public final boolean f20104j;

    /* renamed from: k */
    public final String f20105k;

    /* renamed from: l */
    public final zzd f20106l;

    /* renamed from: w6.l$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public long f20107a = Long.MAX_VALUE;

        /* renamed from: b */
        public int f20108b = 0;

        /* renamed from: c */
        public boolean f20109c = false;

        /* renamed from: d */
        public String f20110d = null;

        /* renamed from: e */
        public zzd f20111e = null;

        /* renamed from: a */
        public C5310l m21387a() {
            return new C5310l(this.f20107a, this.f20108b, this.f20109c, this.f20110d, this.f20111e);
        }
    }

    public C5310l(long j10, int i10, boolean z10, String str, zzd zzdVar) {
        this.f20102h = j10;
        this.f20103i = i10;
        this.f20104j = z10;
        this.f20105k = str;
        this.f20106l = zzdVar;
    }

    /* renamed from: I */
    public int m21385I() {
        return this.f20103i;
    }

    /* renamed from: J */
    public long m21386J() {
        return this.f20102h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5310l)) {
            return false;
        }
        C5310l c5310l = (C5310l) obj;
        return this.f20102h == c5310l.f20102h && this.f20103i == c5310l.f20103i && this.f20104j == c5310l.f20104j && C2388q.m9592b(this.f20105k, c5310l.f20105k) && C2388q.m9592b(this.f20106l, c5310l.f20106l);
    }

    public int hashCode() {
        return C2388q.m9593c(Long.valueOf(this.f20102h), Integer.valueOf(this.f20103i), Boolean.valueOf(this.f20104j));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LastLocationRequest[");
        if (this.f20102h != Long.MAX_VALUE) {
            sb2.append("maxAge=");
            zzdj.zzb(this.f20102h, sb2);
        }
        if (this.f20103i != 0) {
            sb2.append(", ");
            sb2.append(C5317o0.m21391b(this.f20103i));
        }
        if (this.f20104j) {
            sb2.append(", bypass");
        }
        if (this.f20105k != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f20105k);
        }
        if (this.f20106l != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f20106l);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10489y(parcel, 1, m21386J());
        C2603c.m10485u(parcel, 2, m21385I());
        C2603c.m10471g(parcel, 3, this.f20104j);
        C2603c.m10456F(parcel, 4, this.f20105k, false);
        C2603c.m10454D(parcel, 5, this.f20106l, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
