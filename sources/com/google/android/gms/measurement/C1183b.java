package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.List;
import java.util.Map;
import p034c7.InterfaceC0714g9;
import p108h6.C2394s;

/* renamed from: com.google.android.gms.measurement.b */
/* loaded from: classes.dex */
public final class C1183b extends AppMeasurement.AbstractC1181a {

    /* renamed from: a */
    public final InterfaceC0714g9 f4609a;

    public C1183b(InterfaceC0714g9 interfaceC0714g9) {
        super();
        C2394s.m9619l(interfaceC0714g9);
        this.f4609a = interfaceC0714g9;
    }

    @Override // p034c7.InterfaceC0714g9
    /* renamed from: a */
    public final void mo3246a(String str, String str2, Bundle bundle) {
        this.f4609a.mo3246a(str, str2, bundle);
    }

    @Override // p034c7.InterfaceC0714g9
    /* renamed from: b */
    public final List<Bundle> mo3247b(String str, String str2) {
        return this.f4609a.mo3247b(str, str2);
    }

    @Override // p034c7.InterfaceC0714g9
    /* renamed from: c */
    public final Map<String, Object> mo3248c(String str, String str2, boolean z10) {
        return this.f4609a.mo3248c(str, str2, z10);
    }

    @Override // p034c7.InterfaceC0714g9
    /* renamed from: d */
    public final void mo3249d(String str, String str2, Bundle bundle) {
        this.f4609a.mo3249d(str, str2, bundle);
    }

    @Override // p034c7.InterfaceC0714g9
    public final int zza(String str) {
        return this.f4609a.zza(str);
    }

    @Override // p034c7.InterfaceC0714g9
    public final long zza() {
        return this.f4609a.zza();
    }

    @Override // p034c7.InterfaceC0714g9
    public final void zza(Bundle bundle) {
        this.f4609a.zza(bundle);
    }

    @Override // p034c7.InterfaceC0714g9
    public final void zzb(String str) {
        this.f4609a.zzb(str);
    }

    @Override // p034c7.InterfaceC0714g9
    public final void zzc(String str) {
        this.f4609a.zzc(str);
    }

    @Override // p034c7.InterfaceC0714g9
    public final String zzf() {
        return this.f4609a.zzf();
    }

    @Override // p034c7.InterfaceC0714g9
    public final String zzg() {
        return this.f4609a.zzg();
    }

    @Override // p034c7.InterfaceC0714g9
    public final String zzh() {
        return this.f4609a.zzh();
    }

    @Override // p034c7.InterfaceC0714g9
    public final String zzi() {
        return this.f4609a.zzi();
    }
}
