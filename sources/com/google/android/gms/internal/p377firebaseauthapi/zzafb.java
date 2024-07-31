package com.google.android.gms.internal.p377firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p108h6.C2394s;
import p321w7.C5428z1;

/* loaded from: classes.dex */
public final class zzafb {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzafu zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private C5428z1 zzl;
    private List<zzafq> zzm;
    private zzaq<zzafp> zzn;

    public zzafb() {
        this.zzf = new zzafu();
        this.zzn = zzaq.zzh();
    }

    public zzafb(String str, String str2, boolean z10, String str3, String str4, zzafu zzafuVar, String str5, String str6, long j10, long j11, boolean z11, C5428z1 c5428z1, List<zzafq> list, zzaq<zzafp> zzaqVar) {
        zzafu zzafuVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = str3;
        this.zze = str4;
        if (zzafuVar == null) {
            zzafuVar2 = new zzafu();
        } else {
            List<zzafr> zza = zzafuVar.zza();
            zzafu zzafuVar3 = new zzafu();
            if (zza != null) {
                zzafuVar3.zza().addAll(zza);
            }
            zzafuVar2 = zzafuVar3;
        }
        this.zzf = zzafuVar2;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = j10;
        this.zzj = j11;
        this.zzk = false;
        this.zzl = null;
        this.zzm = list == null ? new ArrayList<>() : list;
        this.zzn = zzaqVar;
    }

    public final long zza() {
        return this.zzi;
    }

    public final zzafb zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzafb zza(List<zzafr> list) {
        C2394s.m9619l(list);
        zzafu zzafuVar = new zzafu();
        this.zzf = zzafuVar;
        zzafuVar.zza().addAll(list);
        return this;
    }

    public final zzafb zza(C5428z1 c5428z1) {
        this.zzl = c5428z1;
        return this;
    }

    public final zzafb zza(boolean z10) {
        this.zzk = z10;
        return this;
    }

    public final long zzb() {
        return this.zzj;
    }

    public final zzafb zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzafb zzc(String str) {
        C2394s.m9613f(str);
        this.zzg = str;
        return this;
    }

    public final zzafb zzd(String str) {
        this.zze = str;
        return this;
    }

    public final zzaq<zzafp> zzd() {
        return this.zzn;
    }

    public final C5428z1 zze() {
        return this.zzl;
    }

    public final zzafu zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzh;
    }

    public final List<zzafq> zzk() {
        return this.zzm;
    }

    public final List<zzafr> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzk;
    }
}
