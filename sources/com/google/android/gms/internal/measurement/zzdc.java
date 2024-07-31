package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzdc extends zzbu implements zzda {
    public zzdc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zza() {
        Parcel zza = zza(2, m5026a_());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zza(String str, String str2, Bundle bundle, long j10) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        m5026a_.writeString(str2);
        zzbw.zza(m5026a_, bundle);
        m5026a_.writeLong(j10);
        zzb(1, m5026a_);
    }
}
