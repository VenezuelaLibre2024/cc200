package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzin;
import com.google.android.recaptcha.internal.zzit;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p079f6.C1841a;

/* loaded from: classes.dex */
public abstract class zzit<MessageType extends zzit<MessageType, BuilderType>, BuilderType extends zzin<MessageType, BuilderType>> extends zzgf<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    public zzlm zzc = zzlm.zzc();

    public static Object zzA(zzke zzkeVar, String str, Object[] objArr) {
        return new zzkp(zzkeVar, str, objArr);
    }

    public static void zzD(Class cls, zzit zzitVar) {
        zzitVar.zzC();
        zzb.put(cls, zzitVar);
    }

    public static final boolean zzF(zzit zzitVar, boolean z10) {
        byte byteValue = ((Byte) zzitVar.zzh(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzkn.zza().zzb(zzitVar.getClass()).zzl(zzitVar);
        if (z10) {
            zzitVar.zzh(2, true != zzl ? null : zzitVar, null);
        }
        return zzl;
    }

    private final int zzf(zzkr zzkrVar) {
        return zzkn.zza().zzb(getClass()).zza(this);
    }

    private static zzit zzg(zzit zzitVar) {
        if (zzitVar == null || zzitVar.zzo()) {
            return zzitVar;
        }
        zzje zza = new zzlk(zzitVar).zza();
        zza.zzh(zzitVar);
        throw zza;
    }

    private static zzit zzi(zzit zzitVar, byte[] bArr, int i10, int i11, zzie zzieVar) {
        zzit zzs = zzitVar.zzs();
        try {
            zzkr zzb2 = zzkn.zza().zzb(zzs.getClass());
            zzb2.zzi(zzs, bArr, 0, i11, new zzgj(zzieVar));
            zzb2.zzf(zzs);
            return zzs;
        } catch (zzje e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzje(e);
            }
            e.zzh(zzs);
            throw e;
        } catch (zzlk e11) {
            zzje zza = e11.zza();
            zza.zzh(zzs);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzje) {
                throw ((zzje) e12.getCause());
            }
            zzje zzjeVar = new zzje(e12);
            zzjeVar.zzh(zzs);
            throw zzjeVar;
        } catch (IndexOutOfBoundsException unused) {
            zzje zzj = zzje.zzj();
            zzj.zzh(zzs);
            throw zzj;
        }
    }

    public static zzir zzq(zzke zzkeVar, Object obj, zzke zzkeVar2, zziw zziwVar, int i10, zzmb zzmbVar, Class cls) {
        return new zzir(zzkeVar, "", null, new zziq(null, i10, zzmbVar, false, false), cls);
    }

    public static zzit zzr(Class cls) {
        Map map = zzb;
        zzit zzitVar = (zzit) map.get(cls);
        if (zzitVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzitVar = (zzit) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzitVar == null) {
            zzitVar = (zzit) ((zzit) zzlv.zze(cls)).zzh(6, null, null);
            if (zzitVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzitVar);
        }
        return zzitVar;
    }

    public static zzit zzt(zzit zzitVar, InputStream inputStream) {
        zzhc zzhaVar;
        int i10 = zzhc.zzd;
        if (inputStream == null) {
            byte[] bArr = zzjc.zzd;
            int length = bArr.length;
            zzhaVar = zzhc.zzH(bArr, 0, 0, false);
        } else {
            zzhaVar = new zzha(inputStream, 4096, null);
        }
        zzie zzieVar = zzie.zza;
        zzit zzs = zzitVar.zzs();
        try {
            zzkr zzb2 = zzkn.zza().zzb(zzs.getClass());
            zzb2.zzh(zzs, zzhd.zzq(zzhaVar), zzieVar);
            zzb2.zzf(zzs);
            zzg(zzs);
            return zzs;
        } catch (zzje e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzje(e);
            }
            e.zzh(zzs);
            throw e;
        } catch (zzlk e11) {
            zzje zza = e11.zza();
            zza.zzh(zzs);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzje) {
                throw ((zzje) e12.getCause());
            }
            zzje zzjeVar = new zzje(e12);
            zzjeVar.zzh(zzs);
            throw zzjeVar;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzje) {
                throw ((zzje) e13.getCause());
            }
            throw e13;
        }
    }

    public static zzit zzu(zzit zzitVar, byte[] bArr) {
        zzit zzi = zzi(zzitVar, bArr, 0, bArr.length, zzie.zza);
        zzg(zzi);
        return zzi;
    }

    public static zziy zzv() {
        return zziu.zzf();
    }

    public static zzja zzw() {
        return zzjt.zzf();
    }

    public static zzjb zzx() {
        return zzko.zze();
    }

    public static zzjb zzy(zzjb zzjbVar) {
        int size = zzjbVar.size();
        return zzjbVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzz(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzkn.zza().zzb(getClass()).zzk(this, (zzit) obj);
    }

    public final int hashCode() {
        if (zzG()) {
            return zzm();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zzm = zzm();
        this.zza = zzm;
        return zzm;
    }

    public final String toString() {
        return zzkg.zza(this, super.toString());
    }

    public final void zzB() {
        zzkn.zza().zzb(getClass()).zzf(this);
        zzC();
    }

    public final void zzC() {
        this.zzd &= C1841a.e.API_PRIORITY_OTHER;
    }

    public final void zzE(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | C1841a.e.API_PRIORITY_OTHER;
    }

    public final boolean zzG() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final /* synthetic */ zzkd zzW() {
        return (zzin) zzh(5, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final /* synthetic */ zzkd zzX() {
        zzin zzinVar = (zzin) zzh(5, null, null);
        zzinVar.zzg(this);
        return zzinVar;
    }

    @Override // com.google.android.recaptcha.internal.zzkf
    public final /* synthetic */ zzke zzY() {
        return (zzit) zzh(6, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzgf
    public final int zza(zzkr zzkrVar) {
        if (zzG()) {
            int zza = zzkrVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i10 = this.zzd & C1841a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int zza2 = zzkrVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final void zze(zzhh zzhhVar) {
        zzkn.zza().zzb(getClass()).zzj(this, zzhi.zza(zzhhVar));
    }

    public abstract Object zzh(int i10, Object obj, Object obj2);

    public final int zzm() {
        return zzkn.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.recaptcha.internal.zzke
    public final int zzn() {
        int i10;
        if (zzG()) {
            i10 = zzf(null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & C1841a.e.API_PRIORITY_OTHER;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zzf(null);
                if (i10 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
            }
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkf
    public final boolean zzo() {
        return zzF(this, true);
    }

    public final zzin zzp() {
        return (zzin) zzh(5, null, null);
    }

    public final zzit zzs() {
        return (zzit) zzh(4, null, null);
    }
}
