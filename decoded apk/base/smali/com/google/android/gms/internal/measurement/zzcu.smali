.class public interface abstract Lcom/google/android/gms/internal/measurement/zzcu;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/IInterface;


# virtual methods
.method public abstract beginAdUnitExposure(Ljava/lang/String;J)V
.end method

.method public abstract clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract clearMeasurementEnabled(J)V
.end method

.method public abstract endAdUnitExposure(Ljava/lang/String;J)V
.end method

.method public abstract generateEventId(Lcom/google/android/gms/internal/measurement/zzcv;)V
.end method

.method public abstract getAppInstanceId(Lcom/google/android/gms/internal/measurement/zzcv;)V
.end method

.method public abstract getCachedAppInstanceId(Lcom/google/android/gms/internal/measurement/zzcv;)V
.end method

.method public abstract getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V
.end method

.method public abstract getCurrentScreenClass(Lcom/google/android/gms/internal/measurement/zzcv;)V
.end method

.method public abstract getCurrentScreenName(Lcom/google/android/gms/internal/measurement/zzcv;)V
.end method

.method public abstract getGmpAppId(Lcom/google/android/gms/internal/measurement/zzcv;)V
.end method

.method public abstract getMaxUserProperties(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V
.end method

.method public abstract getSessionId(Lcom/google/android/gms/internal/measurement/zzcv;)V
.end method

.method public abstract getTestFlag(Lcom/google/android/gms/internal/measurement/zzcv;I)V
.end method

.method public abstract getUserProperties(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/measurement/zzcv;)V
.end method

.method public abstract initForTests(Ljava/util/Map;)V
.end method

.method public abstract initialize(Lr6/b;Lcom/google/android/gms/internal/measurement/zzdd;J)V
.end method

.method public abstract isDataCollectionEnabled(Lcom/google/android/gms/internal/measurement/zzcv;)V
.end method

.method public abstract logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
.end method

.method public abstract logEventAndBundle(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/google/android/gms/internal/measurement/zzcv;J)V
.end method

.method public abstract logHealthData(ILjava/lang/String;Lr6/b;Lr6/b;Lr6/b;)V
.end method

.method public abstract onActivityCreated(Lr6/b;Landroid/os/Bundle;J)V
.end method

.method public abstract onActivityDestroyed(Lr6/b;J)V
.end method

.method public abstract onActivityPaused(Lr6/b;J)V
.end method

.method public abstract onActivityResumed(Lr6/b;J)V
.end method

.method public abstract onActivitySaveInstanceState(Lr6/b;Lcom/google/android/gms/internal/measurement/zzcv;J)V
.end method

.method public abstract onActivityStarted(Lr6/b;J)V
.end method

.method public abstract onActivityStopped(Lr6/b;J)V
.end method

.method public abstract performAction(Landroid/os/Bundle;Lcom/google/android/gms/internal/measurement/zzcv;J)V
.end method

.method public abstract registerOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/zzda;)V
.end method

.method public abstract resetAnalyticsData(J)V
.end method

.method public abstract setConditionalUserProperty(Landroid/os/Bundle;J)V
.end method

.method public abstract setConsent(Landroid/os/Bundle;J)V
.end method

.method public abstract setConsentThirdParty(Landroid/os/Bundle;J)V
.end method

.method public abstract setCurrentScreen(Lr6/b;Ljava/lang/String;Ljava/lang/String;J)V
.end method

.method public abstract setDataCollectionEnabled(Z)V
.end method

.method public abstract setDefaultEventParameters(Landroid/os/Bundle;)V
.end method

.method public abstract setEventInterceptor(Lcom/google/android/gms/internal/measurement/zzda;)V
.end method

.method public abstract setInstanceIdProvider(Lcom/google/android/gms/internal/measurement/zzdb;)V
.end method

.method public abstract setMeasurementEnabled(ZJ)V
.end method

.method public abstract setMinimumSessionDuration(J)V
.end method

.method public abstract setSessionTimeoutDuration(J)V
.end method

.method public abstract setUserId(Ljava/lang/String;J)V
.end method

.method public abstract setUserProperty(Ljava/lang/String;Ljava/lang/String;Lr6/b;ZJ)V
.end method

.method public abstract unregisterOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/zzda;)V
.end method
