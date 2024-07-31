package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.firebase-auth-api.zzaja.zzb;
import com.google.android.gms.internal.p377firebaseauthapi.zzaja;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p079f6.C1841a;

/* loaded from: classes.dex */
public abstract class zzaja<MessageType extends zzaja<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzahd<MessageType, BuilderType> {
    private static Map<Object, zzaja<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    public zzame zzb = zzame.zzc();

    /* loaded from: classes.dex */
    public static class zza<T extends zzaja<T, ?>> extends zzahh<T> {
        private final T zza;

        public zza(T t10) {
            this.zza = t10;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class zzb<MessageType extends zzaja<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzahf<MessageType, BuilderType> {
        public MessageType zza;
        private final MessageType zzb;

        public zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzv()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzn();
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzaky.zza().zza((zzaky) messagetype).zza(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahf
        public /* synthetic */ Object clone() {
            zzb zzbVar = (zzb) this.zzb.zza(zze.zze, null, null);
            zzbVar.zza = (MessageType) zzg();
            return zzbVar;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzv()) {
                zzi();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahf
        /* renamed from: zzc */
        public final /* synthetic */ zzahf clone() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakn
        /* renamed from: zzd */
        public final MessageType zzf() {
            MessageType messagetype = (MessageType) zzg();
            if (messagetype.zzu()) {
                return messagetype;
            }
            throw new zzamc(messagetype);
        }

        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakn
        /* renamed from: zze */
        public MessageType zzg() {
            if (!this.zza.zzv()) {
                return this.zza;
            }
            this.zza.zzs();
            return this.zza;
        }

        public final void zzh() {
            if (this.zza.zzv()) {
                return;
            }
            zzi();
        }

        public void zzi() {
            MessageType messagetype = (MessageType) this.zzb.zzn();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakm
        public final /* synthetic */ zzakk zzr() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakm
        public final boolean zzu() {
            return zzaja.zza(this.zza, false);
        }
    }

    /* loaded from: classes.dex */
    public static final class zzc implements zzaiu<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaiu
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaiu
        public final zzakn zza(zzakn zzaknVar, zzakk zzakkVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaiu
        public final zzakt zza(zzakt zzaktVar, zzakt zzaktVar2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaiu
        public final zzamo zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaiu
        public final zzamy zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaiu
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaiu
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzaja<MessageType, BuilderType> implements zzakm {
        public zzais<zzc> zzc = zzais.zzb();

        public final zzais<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzais) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* loaded from: classes.dex */
    public enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    /* loaded from: classes.dex */
    public static class zzf<ContainingType extends zzakk, Type> extends zzaim<ContainingType, Type> {
    }

    private final int zza() {
        return zzaky.zza().zza((zzaky) this).zzb(this);
    }

    private static <T extends zzaja<T, ?>> T zza(T t10) {
        if (t10 == null || t10.zzu()) {
            return t10;
        }
        throw new zzamc(t10).zza().zza(t10);
    }

    public static <T extends zzaja<T, ?>> T zza(T t10, zzahm zzahmVar, zzaip zzaipVar) {
        return (T) zza(zzb(t10, zzahmVar, zzaipVar));
    }

    private static <T extends zzaja<T, ?>> T zza(T t10, zzaib zzaibVar, zzaip zzaipVar) {
        T t11 = (T) t10.zzn();
        try {
            zzalc zza2 = zzaky.zza().zza((zzaky) t11);
            zza2.zza(t11, zzaig.zza(zzaibVar), zzaipVar);
            zza2.zzc(t11);
            return t11;
        } catch (zzajj e10) {
            e = e10;
            if (e.zzk()) {
                e = new zzajj(e);
            }
            throw e.zza(t11);
        } catch (zzamc e11) {
            throw e11.zza().zza(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzajj) {
                throw ((zzajj) e12.getCause());
            }
            throw new zzajj(e12).zza(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzajj) {
                throw ((zzajj) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends zzaja<T, ?>> T zza(T t10, InputStream inputStream, zzaip zzaipVar) {
        zzaib zzaicVar;
        if (inputStream == null) {
            byte[] bArr = zzajc.zzb;
            zzaicVar = zzaib.zza(bArr, 0, bArr.length, false);
        } else {
            zzaicVar = new zzaic(inputStream);
        }
        return (T) zza(zza(t10, zzaicVar, zzaipVar));
    }

    private static <T extends zzaja<T, ?>> T zza(T t10, byte[] bArr, int i10, int i11, zzaip zzaipVar) {
        T t11 = (T) t10.zzn();
        try {
            zzalc zza2 = zzaky.zza().zza((zzaky) t11);
            zza2.zza(t11, bArr, 0, i11, new zzahl(zzaipVar));
            zza2.zzc(t11);
            return t11;
        } catch (zzajj e10) {
            e = e10;
            if (e.zzk()) {
                e = new zzajj(e);
            }
            throw e.zza(t11);
        } catch (zzamc e11) {
            throw e11.zza().zza(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzajj) {
                throw ((zzajj) e12.getCause());
            }
            throw new zzajj(e12).zza(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzajj.zzi().zza(t11);
        }
    }

    public static <T extends zzaja<T, ?>> T zza(T t10, byte[] bArr, zzaip zzaipVar) {
        return (T) zza(zza(t10, bArr, 0, bArr.length, zzaipVar));
    }

    public static <T extends zzaja<?, ?>> T zza(Class<T> cls) {
        zzaja<?, ?> zzajaVar = zzc.get(cls);
        if (zzajaVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzajaVar = zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzajaVar == null) {
            zzajaVar = (T) ((zzaja) zzamh.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (zzajaVar == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzajaVar);
        }
        return (T) zzajaVar;
    }

    public static <E> zzajg<E> zza(zzajg<E> zzajgVar) {
        int size = zzajgVar.size();
        return zzajgVar.zza(size == 0 ? 10 : size << 1);
    }

    public static Object zza(zzakk zzakkVar, String str, Object[] objArr) {
        return new zzala(zzakkVar, str, objArr);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
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

    public static <T extends zzaja<?, ?>> void zza(Class<T> cls, T t10) {
        t10.zzt();
        zzc.put(cls, t10);
    }

    public static final <T extends zzaja<T, ?>> boolean zza(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.zza(zze.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzaky.zza().zza((zzaky) t10).zzd(t10);
        if (z10) {
            t10.zza(zze.zzb, zzd2 ? t10 : null, null);
        }
        return zzd2;
    }

    private final int zzb(zzalc<?> zzalcVar) {
        return zzalcVar == null ? zzaky.zza().zza((zzaky) this).zza(this) : zzalcVar.zza(this);
    }

    private static <T extends zzaja<T, ?>> T zzb(T t10, zzahm zzahmVar, zzaip zzaipVar) {
        zzaib zzc2 = zzahmVar.zzc();
        T t11 = (T) zza(t10, zzc2, zzaipVar);
        try {
            zzc2.zzb(0);
            return t11;
        } catch (zzajj e10) {
            throw e10.zza(t11);
        }
    }

    public static <E> zzajg<E> zzo() {
        return zzalb.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzaky.zza().zza((zzaky) this).zzb(this, (zzaja) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzv()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzakp.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahd
    public final int zza(zzalc zzalcVar) {
        if (!zzv()) {
            if (zzh() != Integer.MAX_VALUE) {
                return zzh();
            }
            int zzb2 = zzb((zzalc<?>) zzalcVar);
            zzb(zzb2);
            return zzb2;
        }
        int zzb3 = zzb((zzalc<?>) zzalcVar);
        if (zzb3 >= 0) {
            return zzb3;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zzb3);
    }

    public abstract Object zza(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakk
    public final void zza(zzaii zzaiiVar) {
        zzaky.zza().zza((zzaky) this).zza((zzalc) this, (zzanb) zzaik.zza(zzaiiVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahd
    public final void zzb(int i10) {
        if (i10 >= 0) {
            this.zzd = (i10 & C1841a.e.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahd
    public final int zzh() {
        return this.zzd & C1841a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakk
    public final int zzk() {
        return zza((zzalc) null);
    }

    public final <MessageType extends zzaja<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzl() {
        return (BuilderType) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzm() {
        return (BuilderType) ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    public final MessageType zzn() {
        return (MessageType) zza(zze.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakk
    public final /* synthetic */ zzakn zzp() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakk
    public final /* synthetic */ zzakn zzq() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakm
    public final /* synthetic */ zzakk zzr() {
        return (zzaja) zza(zze.zzf, (Object) null, (Object) null);
    }

    public final void zzs() {
        zzaky.zza().zza((zzaky) this).zzc(this);
        zzt();
    }

    public final void zzt() {
        this.zzd &= C1841a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakm
    public final boolean zzu() {
        return zza(this, true);
    }

    public final boolean zzv() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
