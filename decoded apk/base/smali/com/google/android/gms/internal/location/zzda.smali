.class public final Lcom/google/android/gms/internal/location/zzda;
.super Lh6/h;
.source ""


# static fields
.field public static final synthetic zze:I


# instance fields
.field private final zzf:Lu/g;

.field private final zzg:Lu/g;

.field private final zzh:Lu/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lh6/e;Lg6/e;Lg6/m;)V
    .locals 7

    const/16 v3, 0x17

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lh6/h;-><init>(Landroid/content/Context;Landroid/os/Looper;ILh6/e;Lg6/e;Lg6/m;)V

    new-instance p1, Lu/g;

    invoke-direct {p1}, Lu/g;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzda;->zzf:Lu/g;

    new-instance p1, Lu/g;

    invoke-direct {p1}, Lu/g;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzda;->zzg:Lu/g;

    new-instance p1, Lu/g;

    invoke-direct {p1}, Lu/g;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzda;->zzh:Lu/g;

    return-void
.end method

.method private final zzE(Le6/d;)Z
    .locals 7

    invoke-virtual {p0}, Lh6/c;->getAvailableFeatures()[Le6/d;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    array-length v2, v0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v0, v3

    invoke-virtual {p1}, Le6/d;->I()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Le6/d;->I()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_3

    return v1

    :cond_3
    invoke-virtual {v4}, Le6/d;->J()J

    move-result-wide v2

    invoke-virtual {p1}, Le6/d;->J()J

    move-result-wide v4

    cmp-long p1, v2, v4

    if-ltz p1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    return v1
.end method


# virtual methods
.method public final synthetic createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/location/zzo;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, Lcom/google/android/gms/internal/location/zzo;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/location/zzn;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/location/zzn;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final getApiFeatures()[Le6/d;
    .locals 1

    sget-object v0, Lw6/m0;->l:[Le6/d;

    return-object v0
.end method

.method public final getMinApkVersion()I
    .locals 1

    const v0, 0xb2c988

    return v0
.end method

.method public final getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    return-object v0
.end method

.method public final getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.location.internal.GoogleLocationManagerService.START"

    return-object v0
.end method

.method public final onConnectionSuspended(I)V
    .locals 1

    invoke-super {p0, p1}, Lh6/c;->onConnectionSuspended(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/location/zzda;->zzf:Lu/g;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzda;->zzf:Lu/g;

    invoke-virtual {v0}, Lu/g;->clear()V

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzda;->zzg:Lu/g;

    monitor-enter v0

    :try_start_1
    iget-object p1, p0, Lcom/google/android/gms/internal/location/zzda;->zzg:Lu/g;

    invoke-virtual {p1}, Lu/g;->clear()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object p1, p0, Lcom/google/android/gms/internal/location/zzda;->zzh:Lu/g;

    monitor-enter p1

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzda;->zzh:Lu/g;

    invoke-virtual {v0}, Lu/g;->clear()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :catchall_2
    move-exception v0

    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0
.end method

.method public final usesClientTelemetry()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzA(ZLcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 3

    sget-object v0, Lw6/m0;->g:Le6/d;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/location/zzda;->zzE(Le6/d;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/location/zzo;

    new-instance v2, Lcom/google/android/gms/internal/location/zzcl;

    invoke-direct {v2, p0, v1, p2}, Lcom/google/android/gms/internal/location/zzcl;-><init>(Lcom/google/android/gms/internal/location/zzda;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v0, p1, v2}, Lcom/google/android/gms/internal/location/zzo;->zzx(ZLg6/g;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/location/zzo;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/location/zzo;->zzw(Z)V

    invoke-virtual {p2, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method public final zzB(Lg6/j$a;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzda;->zzg:Lu/g;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/location/zzda;->zzg:Lu/g;

    invoke-virtual {v1, p1}, Lu/g;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/google/android/gms/internal/location/zzcw;

    if-nez v5, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {v5}, Lcom/google/android/gms/internal/location/zzcw;->zzh()V

    if-eqz p2, :cond_2

    sget-object p1, Lw6/m0;->j:Le6/d;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/location/zzda;->zzE(Le6/d;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/location/zzo;

    const/4 p2, 0x0

    invoke-static {p2, v5, p2, p2}, Lcom/google/android/gms/internal/location/zzdb;->zzb(Landroid/os/IInterface;Lw6/r0;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/location/zzdb;

    move-result-object p2

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v2, Lcom/google/android/gms/internal/location/zzcl;

    invoke-direct {v2, p0, v1, p3}, Lcom/google/android/gms/internal/location/zzcl;-><init>(Lcom/google/android/gms/internal/location/zzda;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {p1, p2, v2}, Lcom/google/android/gms/internal/location/zzo;->zzy(Lcom/google/android/gms/internal/location/zzdb;Lg6/g;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/location/zzo;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v7, Lcom/google/android/gms/internal/location/zzcn;

    invoke-direct {v7, p2, p3}, Lcom/google/android/gms/internal/location/zzcn;-><init>(Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    new-instance p2, Lcom/google/android/gms/internal/location/zzdf;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v1, p2

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/location/zzdf;-><init>(ILcom/google/android/gms/internal/location/zzdd;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/location/zzo;->zzz(Lcom/google/android/gms/internal/location/zzdf;)V

    goto :goto_0

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zzC(Lg6/j$a;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzda;->zzf:Lu/g;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/location/zzda;->zzf:Lu/g;

    invoke-virtual {v1, p1}, Lu/g;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/google/android/gms/internal/location/zzcz;

    if-nez v4, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {v4}, Lcom/google/android/gms/internal/location/zzcz;->zzg()V

    if-eqz p2, :cond_2

    sget-object p1, Lw6/m0;->j:Le6/d;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/location/zzda;->zzE(Le6/d;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/location/zzo;

    const/4 p2, 0x0

    invoke-static {p2, v4, p2, p2}, Lcom/google/android/gms/internal/location/zzdb;->zzc(Landroid/os/IInterface;Lw6/u0;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/location/zzdb;

    move-result-object p2

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v2, Lcom/google/android/gms/internal/location/zzcl;

    invoke-direct {v2, p0, v1, p3}, Lcom/google/android/gms/internal/location/zzcl;-><init>(Lcom/google/android/gms/internal/location/zzda;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {p1, p2, v2}, Lcom/google/android/gms/internal/location/zzo;->zzy(Lcom/google/android/gms/internal/location/zzdb;Lg6/g;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/location/zzo;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v7, Lcom/google/android/gms/internal/location/zzcn;

    invoke-direct {v7, p2, p3}, Lcom/google/android/gms/internal/location/zzcn;-><init>(Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    new-instance p2, Lcom/google/android/gms/internal/location/zzdf;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v1, p2

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/location/zzdf;-><init>(ILcom/google/android/gms/internal/location/zzdd;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/location/zzo;->zzz(Lcom/google/android/gms/internal/location/zzdf;)V

    goto :goto_0

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zzD(Landroid/app/PendingIntent;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;)V
    .locals 9

    sget-object p3, Lw6/m0;->j:Le6/d;

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/location/zzda;->zzE(Le6/d;)Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/location/zzo;

    invoke-static {p1, v0, v0}, Lcom/google/android/gms/internal/location/zzdb;->zza(Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/location/zzdb;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/location/zzcl;

    invoke-direct {v1, p0, v0, p2}, Lcom/google/android/gms/internal/location/zzcl;-><init>(Lcom/google/android/gms/internal/location/zzda;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {p3, p1, v1}, Lcom/google/android/gms/internal/location/zzo;->zzy(Lcom/google/android/gms/internal/location/zzdb;Lg6/g;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/location/zzo;

    new-instance v7, Lcom/google/android/gms/internal/location/zzcn;

    invoke-direct {v7, v0, p2}, Lcom/google/android/gms/internal/location/zzcn;-><init>(Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    new-instance p2, Lcom/google/android/gms/internal/location/zzdf;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object v1, p2

    move-object v6, p1

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/location/zzdf;-><init>(ILcom/google/android/gms/internal/location/zzdd;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Ljava/lang/String;)V

    invoke-interface {p3, p2}, Lcom/google/android/gms/internal/location/zzo;->zzz(Lcom/google/android/gms/internal/location/zzdf;)V

    return-void
.end method

.method public final zzp()Lcom/google/android/gms/location/LocationAvailability;
    .locals 2

    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/location/zzo;

    invoke-virtual {p0}, Lh6/c;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/location/zzo;->zzf(Ljava/lang/String;)Lcom/google/android/gms/location/LocationAvailability;

    move-result-object v0

    return-object v0
.end method

.method public final zzq(Lw6/k;Landroid/app/PendingIntent;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2

    const-string v0, "geofencingRequest can\'t be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "PendingIntent must be specified."

    invoke-static {p2, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/location/zzo;

    new-instance v1, Lcom/google/android/gms/internal/location/zzci;

    invoke-direct {v1, p3}, Lcom/google/android/gms/internal/location/zzci;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/gms/internal/location/zzo;->zzg(Lw6/k;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/location/zzm;)V

    return-void
.end method

.method public final zzr(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 3

    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/location/zzo;

    new-instance v1, Lcom/google/android/gms/internal/location/zzcn;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/internal/location/zzcn;-><init>(Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/location/zzo;->zzi(Lcom/google/android/gms/internal/location/zzk;)V

    return-void
.end method

.method public final zzs(Lw6/e;Lcom/google/android/gms/tasks/CancellationToken;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 7

    invoke-virtual {p0}, Lh6/c;->getContext()Landroid/content/Context;

    sget-object v0, Lw6/m0;->e:Le6/d;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/location/zzda;->zzE(Le6/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/location/zzo;

    new-instance v1, Lcom/google/android/gms/internal/location/zzcm;

    invoke-direct {v1, p0, p3}, Lcom/google/android/gms/internal/location/zzcm;-><init>(Lcom/google/android/gms/internal/location/zzda;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/location/zzo;->zze(Lw6/e;Lcom/google/android/gms/internal/location/zzq;)Lh6/l;

    move-result-object p1

    if-eqz p2, :cond_1

    new-instance p3, Lcom/google/android/gms/internal/location/zzcf;

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/location/zzcf;-><init>(Lh6/l;)V

    invoke-virtual {p2, p3}, Lcom/google/android/gms/tasks/CancellationToken;->onCanceledRequested(Lcom/google/android/gms/tasks/OnTokenCanceledListener;)Lcom/google/android/gms/tasks/CancellationToken;

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/location/zzcj;

    invoke-direct {v0, p0, p3}, Lcom/google/android/gms/internal/location/zzcj;-><init>(Lcom/google/android/gms/internal/location/zzda;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-static {}, Lcom/google/android/gms/internal/location/zzdx;->zza()Ljava/util/concurrent/Executor;

    move-result-object v1

    const-string v2, "GetCurrentLocation"

    invoke-static {v0, v1, v2}, Lg6/k;->b(Ljava/lang/Object;Ljava/util/concurrent/Executor;Ljava/lang/String;)Lg6/j;

    move-result-object v0

    invoke-virtual {v0}, Lg6/j;->b()Lg6/j$a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lcom/google/android/gms/internal/location/zzck;

    invoke-direct {v2, p0, v0, p3}, Lcom/google/android/gms/internal/location/zzck;-><init>(Lcom/google/android/gms/internal/location/zzda;Lg6/j;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v3, Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {p1}, Lw6/e;->L()I

    move-result v4

    const-wide/16 v5, 0x0

    invoke-direct {v3, v4, v5, v6}, Lcom/google/android/gms/location/LocationRequest$a;-><init>(IJ)V

    invoke-virtual {v3, v5, v6}, Lcom/google/android/gms/location/LocationRequest$a;->g(J)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {p1}, Lw6/e;->I()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/location/LocationRequest$a;->b(J)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {p1}, Lw6/e;->J()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/location/LocationRequest$a;->c(I)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {p1}, Lw6/e;->K()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/location/LocationRequest$a;->e(J)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {p1}, Lw6/e;->O()Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/location/LocationRequest$a;->j(Z)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {p1}, Lw6/e;->M()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/location/LocationRequest$a;->l(I)Lcom/google/android/gms/location/LocationRequest$a;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/google/android/gms/location/LocationRequest$a;->i(Z)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {p1}, Lw6/e;->zzd()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/location/LocationRequest$a;->k(Ljava/lang/String;)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {p1}, Lw6/e;->N()Landroid/os/WorkSource;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/android/gms/location/LocationRequest$a;->m(Landroid/os/WorkSource;)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {v3}, Lcom/google/android/gms/location/LocationRequest$a;->a()Lcom/google/android/gms/location/LocationRequest;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v0}, Lcom/google/android/gms/internal/location/zzda;->zzu(Lcom/google/android/gms/internal/location/zzcs;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/location/zzcg;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/location/zzcg;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    if-eqz p2, :cond_1

    new-instance p1, Lcom/google/android/gms/internal/location/zzch;

    invoke-direct {p1, p0, v1}, Lcom/google/android/gms/internal/location/zzch;-><init>(Lcom/google/android/gms/internal/location/zzda;Lg6/j$a;)V

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/CancellationToken;->onCanceledRequested(Lcom/google/android/gms/tasks/OnTokenCanceledListener;)Lcom/google/android/gms/tasks/CancellationToken;

    :cond_1
    return-void
.end method

.method public final zzt(Lw6/l;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2

    invoke-virtual {p0}, Lh6/c;->getContext()Landroid/content/Context;

    sget-object v0, Lw6/m0;->f:Le6/d;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/location/zzda;->zzE(Le6/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/location/zzo;

    new-instance v1, Lcom/google/android/gms/internal/location/zzcm;

    invoke-direct {v1, p0, p2}, Lcom/google/android/gms/internal/location/zzcm;-><init>(Lcom/google/android/gms/internal/location/zzda;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/location/zzo;->zzj(Lw6/l;Lcom/google/android/gms/internal/location/zzq;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/location/zzo;

    invoke-interface {p1}, Lcom/google/android/gms/internal/location/zzo;->zzd()Landroid/location/Location;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method public final zzu(Lcom/google/android/gms/internal/location/zzcs;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/location/zzcs;->zza()Lg6/j;

    move-result-object v3

    invoke-virtual {v3}, Lg6/j;->b()Lg6/j$a;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lw6/m0;->j:Le6/d;

    invoke-direct {v1, v5}, Lcom/google/android/gms/internal/location/zzda;->zzE(Le6/d;)Z

    move-result v5

    iget-object v6, v1, Lcom/google/android/gms/internal/location/zzda;->zzg:Lu/g;

    monitor-enter v6

    :try_start_0
    iget-object v7, v1, Lcom/google/android/gms/internal/location/zzda;->zzg:Lu/g;

    invoke-virtual {v7, v4}, Lu/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/location/zzcw;

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/location/zzcw;->zzg(Lg6/j;)Lcom/google/android/gms/internal/location/zzcw;

    move-object v13, v7

    move-object v7, v8

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v3, Lcom/google/android/gms/internal/location/zzcw;

    move-object/from16 v9, p1

    invoke-direct {v3, v9}, Lcom/google/android/gms/internal/location/zzcw;-><init>(Lcom/google/android/gms/internal/location/zzcs;)V

    iget-object v9, v1, Lcom/google/android/gms/internal/location/zzda;->zzg:Lu/g;

    invoke-virtual {v9, v4, v3}, Lu/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v13, v3

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lh6/c;->getContext()Landroid/content/Context;

    invoke-virtual {v4}, Lg6/j$a;->a()Ljava/lang/String;

    move-result-object v3

    if-eqz v5, :cond_2

    invoke-virtual/range {p0 .. p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/location/zzo;

    invoke-static {v7, v13, v8, v3}, Lcom/google/android/gms/internal/location/zzdb;->zzb(Landroid/os/IInterface;Lw6/r0;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/location/zzdb;

    move-result-object v3

    new-instance v5, Lcom/google/android/gms/internal/location/zzcl;

    invoke-direct {v5, v1, v8, v2}, Lcom/google/android/gms/internal/location/zzcl;-><init>(Lcom/google/android/gms/internal/location/zzda;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v4, v3, v0, v5}, Lcom/google/android/gms/internal/location/zzo;->zzk(Lcom/google/android/gms/internal/location/zzdb;Lcom/google/android/gms/location/LocationRequest;Lg6/g;)V

    goto :goto_2

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/location/zzo;

    new-instance v5, Lcom/google/android/gms/location/LocationRequest$a;

    invoke-direct {v5, v0}, Lcom/google/android/gms/location/LocationRequest$a;-><init>(Lcom/google/android/gms/location/LocationRequest;)V

    invoke-virtual {v5, v8}, Lcom/google/android/gms/location/LocationRequest$a;->k(Ljava/lang/String;)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {v5}, Lcom/google/android/gms/location/LocationRequest$a;->a()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    invoke-static {v8, v0}, Lcom/google/android/gms/internal/location/zzdd;->zza(Ljava/lang/String;Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/internal/location/zzdd;

    move-result-object v11

    new-instance v15, Lcom/google/android/gms/internal/location/zzcp;

    invoke-direct {v15, v2, v13}, Lcom/google/android/gms/internal/location/zzcp;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;Lw6/r0;)V

    new-instance v0, Lcom/google/android/gms/internal/location/zzdf;

    const/4 v10, 0x1

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object v9, v0

    move-object/from16 v16, v3

    invoke-direct/range {v9 .. v16}, Lcom/google/android/gms/internal/location/zzdf;-><init>(ILcom/google/android/gms/internal/location/zzdd;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Lcom/google/android/gms/internal/location/zzo;->zzz(Lcom/google/android/gms/internal/location/zzdf;)V

    :goto_2
    monitor-exit v6

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final zzv(Lcom/google/android/gms/internal/location/zzcs;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/location/zzcs;->zza()Lg6/j;

    move-result-object v3

    invoke-virtual {v3}, Lg6/j;->b()Lg6/j$a;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lw6/m0;->j:Le6/d;

    invoke-direct {v1, v5}, Lcom/google/android/gms/internal/location/zzda;->zzE(Le6/d;)Z

    move-result v5

    iget-object v6, v1, Lcom/google/android/gms/internal/location/zzda;->zzf:Lu/g;

    monitor-enter v6

    :try_start_0
    iget-object v7, v1, Lcom/google/android/gms/internal/location/zzda;->zzf:Lu/g;

    invoke-virtual {v7, v4}, Lu/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/location/zzcz;

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/location/zzcz;->zzf(Lg6/j;)Lcom/google/android/gms/internal/location/zzcz;

    move-object v12, v7

    move-object v7, v8

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v3, Lcom/google/android/gms/internal/location/zzcz;

    move-object/from16 v9, p1

    invoke-direct {v3, v9}, Lcom/google/android/gms/internal/location/zzcz;-><init>(Lcom/google/android/gms/internal/location/zzcs;)V

    iget-object v9, v1, Lcom/google/android/gms/internal/location/zzda;->zzf:Lu/g;

    invoke-virtual {v9, v4, v3}, Lu/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v12, v3

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lh6/c;->getContext()Landroid/content/Context;

    invoke-virtual {v4}, Lg6/j$a;->a()Ljava/lang/String;

    move-result-object v3

    if-eqz v5, :cond_2

    invoke-virtual/range {p0 .. p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/location/zzo;

    invoke-static {v7, v12, v8, v3}, Lcom/google/android/gms/internal/location/zzdb;->zzc(Landroid/os/IInterface;Lw6/u0;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/location/zzdb;

    move-result-object v3

    new-instance v5, Lcom/google/android/gms/internal/location/zzcl;

    invoke-direct {v5, v1, v8, v2}, Lcom/google/android/gms/internal/location/zzcl;-><init>(Lcom/google/android/gms/internal/location/zzda;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v4, v3, v0, v5}, Lcom/google/android/gms/internal/location/zzo;->zzk(Lcom/google/android/gms/internal/location/zzdb;Lcom/google/android/gms/location/LocationRequest;Lg6/g;)V

    goto :goto_2

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/location/zzo;

    new-instance v5, Lcom/google/android/gms/location/LocationRequest$a;

    invoke-direct {v5, v0}, Lcom/google/android/gms/location/LocationRequest$a;-><init>(Lcom/google/android/gms/location/LocationRequest;)V

    invoke-virtual {v5, v8}, Lcom/google/android/gms/location/LocationRequest$a;->k(Ljava/lang/String;)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {v5}, Lcom/google/android/gms/location/LocationRequest$a;->a()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    invoke-static {v8, v0}, Lcom/google/android/gms/internal/location/zzdd;->zza(Ljava/lang/String;Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/internal/location/zzdd;

    move-result-object v11

    new-instance v15, Lcom/google/android/gms/internal/location/zzco;

    invoke-direct {v15, v2, v12}, Lcom/google/android/gms/internal/location/zzco;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;Lw6/u0;)V

    new-instance v0, Lcom/google/android/gms/internal/location/zzdf;

    const/4 v10, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v9, v0

    move-object/from16 v16, v3

    invoke-direct/range {v9 .. v16}, Lcom/google/android/gms/internal/location/zzdf;-><init>(ILcom/google/android/gms/internal/location/zzdd;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Lcom/google/android/gms/internal/location/zzo;->zzz(Lcom/google/android/gms/internal/location/zzdf;)V

    :goto_2
    monitor-exit v6

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final zzw(Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 10

    invoke-virtual {p0}, Lh6/c;->getContext()Landroid/content/Context;

    sget-object v0, Lw6/m0;->j:Le6/d;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/location/zzda;->zzE(Le6/d;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/location/zzo;

    invoke-static {p1, v1, v1}, Lcom/google/android/gms/internal/location/zzdb;->zza(Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/location/zzdb;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/location/zzcl;

    invoke-direct {v2, p0, v1, p3}, Lcom/google/android/gms/internal/location/zzcl;-><init>(Lcom/google/android/gms/internal/location/zzda;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v0, p1, p2, v2}, Lcom/google/android/gms/internal/location/zzo;->zzk(Lcom/google/android/gms/internal/location/zzdb;Lcom/google/android/gms/location/LocationRequest;Lg6/g;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/location/zzo;

    new-instance v2, Lcom/google/android/gms/location/LocationRequest$a;

    invoke-direct {v2, p2}, Lcom/google/android/gms/location/LocationRequest$a;-><init>(Lcom/google/android/gms/location/LocationRequest;)V

    invoke-virtual {v2, v1}, Lcom/google/android/gms/location/LocationRequest$a;->k(Ljava/lang/String;)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {v2}, Lcom/google/android/gms/location/LocationRequest$a;->a()Lcom/google/android/gms/location/LocationRequest;

    move-result-object p2

    invoke-static {v1, p2}, Lcom/google/android/gms/internal/location/zzdd;->zza(Ljava/lang/String;Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/internal/location/zzdd;

    move-result-object v4

    new-instance v8, Lcom/google/android/gms/internal/location/zzcn;

    invoke-direct {v8, v1, p3}, Lcom/google/android/gms/internal/location/zzcn;-><init>(Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    new-instance p2, Lcom/google/android/gms/internal/location/zzdf;

    invoke-virtual {p1}, Landroid/app/PendingIntent;->hashCode()I

    move-result p3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PendingIntent@"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    move-object v2, p2

    move-object v7, p1

    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/internal/location/zzdf;-><init>(ILcom/google/android/gms/internal/location/zzdd;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Ljava/lang/String;)V

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/location/zzo;->zzz(Lcom/google/android/gms/internal/location/zzdf;)V

    return-void
.end method

.method public final zzx(Landroid/app/PendingIntent;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2

    const-string v0, "PendingIntent must be specified."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/location/zzo;

    new-instance v1, Lcom/google/android/gms/internal/location/zzci;

    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/location/zzci;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p0}, Lh6/c;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, v1, p2}, Lcom/google/android/gms/internal/location/zzo;->zzn(Landroid/app/PendingIntent;Lcom/google/android/gms/internal/location/zzm;Ljava/lang/String;)V

    return-void
.end method

.method public final zzy(Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const-string v2, "geofenceRequestIds can\'t be null nor empty."

    invoke-static {v1, v2}, Lh6/s;->b(ZLjava/lang/Object;)V

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/location/zzo;

    new-instance v1, Lcom/google/android/gms/internal/location/zzci;

    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/location/zzci;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p0}, Lh6/c;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, v1, p2}, Lcom/google/android/gms/internal/location/zzo;->zzo([Ljava/lang/String;Lcom/google/android/gms/internal/location/zzm;Ljava/lang/String;)V

    return-void
.end method

.method public final zzz(Landroid/location/Location;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 3

    sget-object v0, Lw6/m0;->h:Le6/d;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/location/zzda;->zzE(Le6/d;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/location/zzo;

    new-instance v2, Lcom/google/android/gms/internal/location/zzcl;

    invoke-direct {v2, p0, v1, p2}, Lcom/google/android/gms/internal/location/zzcl;-><init>(Lcom/google/android/gms/internal/location/zzda;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v0, p1, v2}, Lcom/google/android/gms/internal/location/zzo;->zzv(Landroid/location/Location;Lg6/g;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/location/zzo;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/location/zzo;->zzu(Landroid/location/Location;)V

    invoke-virtual {p2, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method
