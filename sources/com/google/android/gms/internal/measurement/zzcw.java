package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;
import p252r6.InterfaceC4307b;

/* loaded from: classes.dex */
public final class zzcw extends zzbu implements zzcu {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        m5026a_.writeLong(j10);
        zzb(23, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        m5026a_.writeString(str2);
        zzbw.zza(m5026a_, bundle);
        zzb(9, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void clearMeasurementEnabled(long j10) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeLong(j10);
        zzb(43, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void endAdUnitExposure(String str, long j10) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        m5026a_.writeLong(j10);
        zzb(24, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void generateEventId(zzcv zzcvVar) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, zzcvVar);
        zzb(22, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getAppInstanceId(zzcv zzcvVar) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, zzcvVar);
        zzb(20, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getCachedAppInstanceId(zzcv zzcvVar) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, zzcvVar);
        zzb(19, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getConditionalUserProperties(String str, String str2, zzcv zzcvVar) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        m5026a_.writeString(str2);
        zzbw.zza(m5026a_, zzcvVar);
        zzb(10, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getCurrentScreenClass(zzcv zzcvVar) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, zzcvVar);
        zzb(17, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getCurrentScreenName(zzcv zzcvVar) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, zzcvVar);
        zzb(16, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getGmpAppId(zzcv zzcvVar) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, zzcvVar);
        zzb(21, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getMaxUserProperties(String str, zzcv zzcvVar) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        zzbw.zza(m5026a_, zzcvVar);
        zzb(6, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getSessionId(zzcv zzcvVar) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, zzcvVar);
        zzb(46, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getTestFlag(zzcv zzcvVar, int i10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, zzcvVar);
        m5026a_.writeInt(i10);
        zzb(38, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void getUserProperties(String str, String str2, boolean z10, zzcv zzcvVar) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        m5026a_.writeString(str2);
        zzbw.zza(m5026a_, z10);
        zzbw.zza(m5026a_, zzcvVar);
        zzb(5, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void initForTests(Map map) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeMap(map);
        zzb(37, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void initialize(InterfaceC4307b interfaceC4307b, zzdd zzddVar, long j10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, interfaceC4307b);
        zzbw.zza(m5026a_, zzddVar);
        m5026a_.writeLong(j10);
        zzb(1, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void isDataCollectionEnabled(zzcv zzcvVar) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, zzcvVar);
        zzb(40, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        m5026a_.writeString(str2);
        zzbw.zza(m5026a_, bundle);
        zzbw.zza(m5026a_, z10);
        zzbw.zza(m5026a_, z11);
        m5026a_.writeLong(j10);
        zzb(2, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcvVar, long j10) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        m5026a_.writeString(str2);
        zzbw.zza(m5026a_, bundle);
        zzbw.zza(m5026a_, zzcvVar);
        m5026a_.writeLong(j10);
        zzb(3, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void logHealthData(int i10, String str, InterfaceC4307b interfaceC4307b, InterfaceC4307b interfaceC4307b2, InterfaceC4307b interfaceC4307b3) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeInt(i10);
        m5026a_.writeString(str);
        zzbw.zza(m5026a_, interfaceC4307b);
        zzbw.zza(m5026a_, interfaceC4307b2);
        zzbw.zza(m5026a_, interfaceC4307b3);
        zzb(33, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityCreated(InterfaceC4307b interfaceC4307b, Bundle bundle, long j10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, interfaceC4307b);
        zzbw.zza(m5026a_, bundle);
        m5026a_.writeLong(j10);
        zzb(27, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityDestroyed(InterfaceC4307b interfaceC4307b, long j10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, interfaceC4307b);
        m5026a_.writeLong(j10);
        zzb(28, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityPaused(InterfaceC4307b interfaceC4307b, long j10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, interfaceC4307b);
        m5026a_.writeLong(j10);
        zzb(29, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityResumed(InterfaceC4307b interfaceC4307b, long j10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, interfaceC4307b);
        m5026a_.writeLong(j10);
        zzb(30, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivitySaveInstanceState(InterfaceC4307b interfaceC4307b, zzcv zzcvVar, long j10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, interfaceC4307b);
        zzbw.zza(m5026a_, zzcvVar);
        m5026a_.writeLong(j10);
        zzb(31, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityStarted(InterfaceC4307b interfaceC4307b, long j10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, interfaceC4307b);
        m5026a_.writeLong(j10);
        zzb(25, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityStopped(InterfaceC4307b interfaceC4307b, long j10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, interfaceC4307b);
        m5026a_.writeLong(j10);
        zzb(26, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void performAction(Bundle bundle, zzcv zzcvVar, long j10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, bundle);
        zzbw.zza(m5026a_, zzcvVar);
        m5026a_.writeLong(j10);
        zzb(32, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void registerOnMeasurementEventListener(zzda zzdaVar) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, zzdaVar);
        zzb(35, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void resetAnalyticsData(long j10) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeLong(j10);
        zzb(12, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, bundle);
        m5026a_.writeLong(j10);
        zzb(8, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setConsent(Bundle bundle, long j10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, bundle);
        m5026a_.writeLong(j10);
        zzb(44, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setConsentThirdParty(Bundle bundle, long j10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, bundle);
        m5026a_.writeLong(j10);
        zzb(45, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setCurrentScreen(InterfaceC4307b interfaceC4307b, String str, String str2, long j10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, interfaceC4307b);
        m5026a_.writeString(str);
        m5026a_.writeString(str2);
        m5026a_.writeLong(j10);
        zzb(15, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, z10);
        zzb(39, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, bundle);
        zzb(42, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setEventInterceptor(zzda zzdaVar) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, zzdaVar);
        zzb(34, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setInstanceIdProvider(zzdb zzdbVar) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, zzdbVar);
        zzb(18, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setMeasurementEnabled(boolean z10, long j10) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, z10);
        m5026a_.writeLong(j10);
        zzb(11, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setMinimumSessionDuration(long j10) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeLong(j10);
        zzb(13, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setSessionTimeoutDuration(long j10) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeLong(j10);
        zzb(14, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setUserId(String str, long j10) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        m5026a_.writeLong(j10);
        zzb(7, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void setUserProperty(String str, String str2, InterfaceC4307b interfaceC4307b, boolean z10, long j10) {
        Parcel m5026a_ = m5026a_();
        m5026a_.writeString(str);
        m5026a_.writeString(str2);
        zzbw.zza(m5026a_, interfaceC4307b);
        zzbw.zza(m5026a_, z10);
        m5026a_.writeLong(j10);
        zzb(4, m5026a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void unregisterOnMeasurementEventListener(zzda zzdaVar) {
        Parcel m5026a_ = m5026a_();
        zzbw.zza(m5026a_, zzdaVar);
        zzb(36, m5026a_);
    }
}
