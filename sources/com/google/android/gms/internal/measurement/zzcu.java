package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import p252r6.InterfaceC4307b;

/* loaded from: classes.dex */
public interface zzcu extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(zzcv zzcvVar);

    void getAppInstanceId(zzcv zzcvVar);

    void getCachedAppInstanceId(zzcv zzcvVar);

    void getConditionalUserProperties(String str, String str2, zzcv zzcvVar);

    void getCurrentScreenClass(zzcv zzcvVar);

    void getCurrentScreenName(zzcv zzcvVar);

    void getGmpAppId(zzcv zzcvVar);

    void getMaxUserProperties(String str, zzcv zzcvVar);

    void getSessionId(zzcv zzcvVar);

    void getTestFlag(zzcv zzcvVar, int i10);

    void getUserProperties(String str, String str2, boolean z10, zzcv zzcvVar);

    void initForTests(Map map);

    void initialize(InterfaceC4307b interfaceC4307b, zzdd zzddVar, long j10);

    void isDataCollectionEnabled(zzcv zzcvVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcvVar, long j10);

    void logHealthData(int i10, String str, InterfaceC4307b interfaceC4307b, InterfaceC4307b interfaceC4307b2, InterfaceC4307b interfaceC4307b3);

    void onActivityCreated(InterfaceC4307b interfaceC4307b, Bundle bundle, long j10);

    void onActivityDestroyed(InterfaceC4307b interfaceC4307b, long j10);

    void onActivityPaused(InterfaceC4307b interfaceC4307b, long j10);

    void onActivityResumed(InterfaceC4307b interfaceC4307b, long j10);

    void onActivitySaveInstanceState(InterfaceC4307b interfaceC4307b, zzcv zzcvVar, long j10);

    void onActivityStarted(InterfaceC4307b interfaceC4307b, long j10);

    void onActivityStopped(InterfaceC4307b interfaceC4307b, long j10);

    void performAction(Bundle bundle, zzcv zzcvVar, long j10);

    void registerOnMeasurementEventListener(zzda zzdaVar);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(InterfaceC4307b interfaceC4307b, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzda zzdaVar);

    void setInstanceIdProvider(zzdb zzdbVar);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, InterfaceC4307b interfaceC4307b, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(zzda zzdaVar);
}
