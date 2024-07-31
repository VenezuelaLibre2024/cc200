package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.List;
import java.util.Map;
import p034c7.C0767k6;
import p034c7.C0936w7;
import p108h6.C2394s;

/* renamed from: com.google.android.gms.measurement.a */
/* loaded from: classes.dex */
public final class C1182a extends AppMeasurement.AbstractC1181a {

    /* renamed from: a */
    public final C0767k6 f4607a;

    /* renamed from: b */
    public final C0936w7 f4608b;

    public C1182a(C0767k6 c0767k6) {
        super();
        C2394s.m9619l(c0767k6);
        this.f4607a = c0767k6;
        this.f4608b = c0767k6.m3487C();
    }

    @Override // p034c7.InterfaceC0714g9
    /* renamed from: a */
    public final void mo3246a(String str, String str2, Bundle bundle) {
        this.f4607a.m3487C().m3959T(str, str2, bundle);
    }

    @Override // p034c7.InterfaceC0714g9
    /* renamed from: b */
    public final List<Bundle> mo3247b(String str, String str2) {
        return this.f4608b.m3988x(str, str2);
    }

    @Override // p034c7.InterfaceC0714g9
    /* renamed from: c */
    public final Map<String, Object> mo3248c(String str, String str2, boolean z10) {
        return this.f4608b.m3990y(str, str2, z10);
    }

    @Override // p034c7.InterfaceC0714g9
    /* renamed from: d */
    public final void mo3249d(String str, String str2, Bundle bundle) {
        this.f4608b.m3987w0(str, str2, bundle);
    }

    @Override // p034c7.InterfaceC0714g9
    public final int zza(String str) {
        C2394s.m9613f(str);
        return 25;
    }

    @Override // p034c7.InterfaceC0714g9
    public final long zza() {
        return this.f4607a.m3491G().m3778K0();
    }

    @Override // p034c7.InterfaceC0714g9
    public final void zza(Bundle bundle) {
        this.f4608b.m3984s0(bundle);
    }

    @Override // p034c7.InterfaceC0714g9
    public final void zzb(String str) {
        this.f4607a.m3512t().m3109u(str, this.f4607a.zzb().mo14933b());
    }

    @Override // p034c7.InterfaceC0714g9
    public final void zzc(String str) {
        this.f4607a.m3512t().m3112y(str, this.f4607a.zzb().mo14933b());
    }

    @Override // p034c7.InterfaceC0714g9
    public final String zzf() {
        return this.f4608b.m3970e0();
    }

    @Override // p034c7.InterfaceC0714g9
    public final String zzg() {
        return this.f4608b.m3971f0();
    }

    @Override // p034c7.InterfaceC0714g9
    public final String zzh() {
        return this.f4608b.m3972g0();
    }

    @Override // p034c7.InterfaceC0714g9
    public final String zzi() {
        return this.f4608b.m3970e0();
    }
}
