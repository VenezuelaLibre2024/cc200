package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p079f6.C1841a;

/* loaded from: classes.dex */
public abstract class zzev<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>> extends zzdq<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    public zzha zzc = zzha.zza();

    public static zzev zzb(Class cls) {
        Map map = zzb;
        zzev zzevVar = (zzev) map.get(cls);
        if (zzevVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzevVar = (zzev) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzevVar == null) {
            zzevVar = (zzev) ((zzev) zzhj.zze(cls)).zzn(6, null, null);
            if (zzevVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzevVar);
        }
        return zzevVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r1 != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.auth.zzev zzd(com.google.android.gms.internal.auth.zzev r3, byte[] r4) {
        /*
            int r0 = r4.length
            com.google.android.gms.internal.auth.zzel r1 = com.google.android.gms.internal.auth.zzel.zza
            r2 = 0
            com.google.android.gms.internal.auth.zzev r3 = zzo(r3, r4, r2, r0, r1)
            if (r3 == 0) goto L44
            r4 = 1
            r0 = 0
            java.lang.Object r1 = r3.zzn(r4, r0, r0)
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            if (r1 != r4) goto L19
            goto L44
        L19:
            if (r1 == 0) goto L37
            java.lang.Class r1 = r3.getClass()
            com.google.android.gms.internal.auth.zzgf r2 = com.google.android.gms.internal.auth.zzgf.zza()
            com.google.android.gms.internal.auth.zzgi r1 = r2.zzb(r1)
            boolean r1 = r1.zzi(r3)
            if (r4 == r1) goto L2f
            r4 = r0
            goto L30
        L2f:
            r4 = r3
        L30:
            r2 = 2
            r3.zzn(r2, r4, r0)
            if (r1 == 0) goto L37
            goto L44
        L37:
            com.google.android.gms.internal.auth.zzgy r4 = new com.google.android.gms.internal.auth.zzgy
            r4.<init>(r3)
            com.google.android.gms.internal.auth.zzfb r4 = r4.zza()
            r4.zze(r3)
            throw r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzev.zzd(com.google.android.gms.internal.auth.zzev, byte[]):com.google.android.gms.internal.auth.zzev");
    }

    public static zzez zzf() {
        return zzgg.zze();
    }

    public static Object zzg(Method method, Object obj, Object... objArr) {
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

    public static Object zzh(zzfx zzfxVar, String str, Object[] objArr) {
        return new zzgh(zzfxVar, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    public static void zzk(Class cls, zzev zzevVar) {
        zzevVar.zzj();
        zzb.put(cls, zzevVar);
    }

    private static zzev zzo(zzev zzevVar, byte[] bArr, int i10, int i11, zzel zzelVar) {
        zzev zzc = zzevVar.zzc();
        try {
            zzgi zzb2 = zzgf.zza().zzb(zzc.getClass());
            zzb2.zzg(zzc, bArr, 0, i11, new zzdt(zzelVar));
            zzb2.zze(zzc);
            return zzc;
        } catch (zzfb e10) {
            e10.zze(zzc);
            throw e10;
        } catch (zzgy e11) {
            zzfb zza = e11.zza();
            zza.zze(zzc);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzfb) {
                throw ((zzfb) e12.getCause());
            }
            zzfb zzfbVar = new zzfb(e12);
            zzfbVar.zze(zzc);
            throw zzfbVar;
        } catch (IndexOutOfBoundsException unused) {
            zzfb zzf = zzfb.zzf();
            zzf.zze(zzc);
            throw zzf;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgf.zza().zzb(getClass()).zzh(this, (zzev) obj);
    }

    public final int hashCode() {
        if (zzm()) {
            return zza();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zza = zza();
        this.zza = zza;
        return zza;
    }

    public final String toString() {
        return zzfz.zza(this, super.toString());
    }

    final int zza() {
        return zzgf.zza().zzb(getClass()).zza(this);
    }

    public final zzev zzc() {
        return (zzev) zzn(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* synthetic */ zzfx zze() {
        return (zzev) zzn(6, null, null);
    }

    public final void zzi() {
        zzgf.zza().zzb(getClass()).zze(this);
        zzj();
    }

    public final void zzj() {
        this.zzd &= C1841a.e.API_PRIORITY_OTHER;
    }

    public final void zzl(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | C1841a.e.API_PRIORITY_OTHER;
    }

    public final boolean zzm() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object zzn(int i10, Object obj, Object obj2);
}
