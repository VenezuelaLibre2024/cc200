package p034c7;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;
import p108h6.C2394s;

/* renamed from: c7.u7 */
/* loaded from: classes.dex */
public final class C0908u7 {

    /* renamed from: a */
    public final Context f3628a;

    /* renamed from: b */
    public String f3629b;

    /* renamed from: c */
    public String f3630c;

    /* renamed from: d */
    public String f3631d;

    /* renamed from: e */
    public Boolean f3632e;

    /* renamed from: f */
    public long f3633f;

    /* renamed from: g */
    public zzdd f3634g;

    /* renamed from: h */
    public boolean f3635h;

    /* renamed from: i */
    public Long f3636i;

    /* renamed from: j */
    public String f3637j;

    public C0908u7(Context context, zzdd zzddVar, Long l10) {
        this.f3635h = true;
        C2394s.m9619l(context);
        Context applicationContext = context.getApplicationContext();
        C2394s.m9619l(applicationContext);
        this.f3628a = applicationContext;
        this.f3636i = l10;
        if (zzddVar != null) {
            this.f3634g = zzddVar;
            this.f3629b = zzddVar.zzf;
            this.f3630c = zzddVar.zze;
            this.f3631d = zzddVar.zzd;
            this.f3635h = zzddVar.zzc;
            this.f3633f = zzddVar.zzb;
            this.f3637j = zzddVar.zzh;
            Bundle bundle = zzddVar.zzg;
            if (bundle != null) {
                this.f3632e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
