package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzkf implements zzlm {
    private static final zzks zza = new zzki();
    private final zzks zzb;

    public zzkf() {
        this(new zzkk(zzjg.zza(), zza()));
    }

    private zzkf(zzks zzksVar) {
        this.zzb = (zzks) zzjh.zza(zzksVar, "messageInfoFactory");
    }

    private static zzks zza() {
        try {
            return (zzks) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zza;
        }
    }

    private static boolean zza(zzkp zzkpVar) {
        return zzkh.zza[zzkpVar.zzb().ordinal()] != 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final <T> zzlj<T> zza(Class<T> cls) {
        zzll.zza((Class<?>) cls);
        zzkp zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzjf.class.isAssignableFrom(cls) ? zzkx.zza(zzll.zzb(), zziv.zzb(), zza2.zza()) : zzkx.zza(zzll.zza(), zziv.zza(), zza2.zza());
        }
        if (zzjf.class.isAssignableFrom(cls)) {
            boolean zza3 = zza(zza2);
            zzkz zzb = zzlb.zzb();
            zzka zzb2 = zzka.zzb();
            zzmi<?, ?> zzb3 = zzll.zzb();
            return zza3 ? zzkv.zza(cls, zza2, zzb, zzb2, zzb3, zziv.zzb(), zzkq.zzb()) : zzkv.zza(cls, zza2, zzb, zzb2, zzb3, (zziu<?>) null, zzkq.zzb());
        }
        boolean zza4 = zza(zza2);
        zzkz zza5 = zzlb.zza();
        zzka zza6 = zzka.zza();
        zzmi<?, ?> zza7 = zzll.zza();
        return zza4 ? zzkv.zza(cls, zza2, zza5, zza6, zza7, zziv.zza(), zzkq.zza()) : zzkv.zza(cls, zza2, zza5, zza6, zza7, (zziu<?>) null, zzkq.zza());
    }
}
