package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Arrays;
import java.util.List;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* loaded from: classes.dex */
public final class zzd extends AbstractC2601a {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();
    private final int zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;
    private final int zze;
    private final String zzf;
    private final zzd zzg;
    private final List zzh;

    static {
        Process.myUid();
        Process.myPid();
    }

    public zzd(int i10, int i11, String str, String str2, String str3, int i12, List list, zzd zzdVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = str3;
        this.zze = i12;
        this.zzh = zzds.zzj(list);
        this.zzg = zzdVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzd) {
            zzd zzdVar = (zzd) obj;
            if (this.zza == zzdVar.zza && this.zzb == zzdVar.zzb && this.zze == zzdVar.zze && this.zzc.equals(zzdVar.zzc) && zzdl.zza(this.zzd, zzdVar.zzd) && zzdl.zza(this.zzf, zzdVar.zzf) && zzdl.zza(this.zzg, zzdVar.zzg) && this.zzh.equals(zzdVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzc, this.zzd, this.zzf});
    }

    public final String toString() {
        int length = this.zzc.length() + 18;
        String str = this.zzd;
        if (str != null) {
            length += str.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.zza);
        sb2.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        sb2.append(this.zzc);
        if (this.zzd != null) {
            sb2.append("[");
            if (this.zzd.startsWith(this.zzc)) {
                sb2.append((CharSequence) this.zzd, this.zzc.length(), this.zzd.length());
            } else {
                sb2.append(this.zzd);
            }
            sb2.append("]");
        }
        if (this.zzf != null) {
            sb2.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            sb2.append(Integer.toHexString(this.zzf.hashCode()));
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.zza);
        C2603c.m10485u(parcel, 2, this.zzb);
        C2603c.m10456F(parcel, 3, this.zzc, false);
        C2603c.m10456F(parcel, 4, this.zzd, false);
        C2603c.m10485u(parcel, 5, this.zze);
        C2603c.m10456F(parcel, 6, this.zzf, false);
        C2603c.m10454D(parcel, 7, this.zzg, i10, false);
        C2603c.m10460J(parcel, 8, this.zzh, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
