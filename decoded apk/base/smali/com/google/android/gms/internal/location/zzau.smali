.class public final Lcom/google/android/gms/internal/location/zzau;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw6/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic zza(Lg6/d;)Lcom/google/android/gms/tasks/TaskCompletionSource;
    .locals 3

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/location/zzah;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/location/zzah;-><init>(Lg6/d;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-object v0
.end method


# virtual methods
.method public final flushLocations(Lf6/f;)Lf6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            ")",
            "Lf6/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/location/zzaj;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/location/zzaj;-><init>(Lcom/google/android/gms/internal/location/zzau;Lf6/f;)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final getLastLocation(Lf6/f;)Landroid/location/Location;
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    const-string v3, "GoogleApiClient parameter is required."

    invoke-static {v2, v3}, Lh6/s;->b(ZLjava/lang/Object;)V

    sget-object v2, Lcom/google/android/gms/internal/location/zzbp;->zza:Lf6/a$g;

    invoke-virtual {p1, v2}, Lf6/f;->d(Lf6/a$c;)Lf6/a$f;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/location/zzda;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v3, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v3, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    new-instance v4, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    const/4 v5, 0x0

    :try_start_0
    new-instance v6, Lw6/l$a;

    invoke-direct {v6}, Lw6/l$a;-><init>()V

    invoke-virtual {v6}, Lw6/l$a;->a()Lw6/l;

    move-result-object v6

    invoke-virtual {p1, v6, v4}, Lcom/google/android/gms/internal/location/zzda;->zzt(Lw6/l;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    invoke-virtual {v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v4, Lcom/google/android/gms/internal/location/zzai;

    invoke-direct {v4, v2, v3}, Lcom/google/android/gms/internal/location/zzai;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {p1, v4}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0x1e

    :try_start_1
    invoke-virtual {p1, v6, v7}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v6

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-long/2addr v8, v6

    :goto_1
    :try_start_2
    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v6, v7, p1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/Location;

    return-object p1

    :cond_2
    return-object v5

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    sub-long v6, v8, v6

    move v0, v1

    goto :goto_1

    :catchall_1
    move-exception p1

    move v0, v1

    :goto_2
    if-eqz v0, :cond_3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_3
    throw p1

    :catch_1
    return-object v5
.end method

.method public final getLocationAvailability(Lf6/f;)Lcom/google/android/gms/location/LocationAvailability;
    .locals 2

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "GoogleApiClient parameter is required."

    invoke-static {v0, v1}, Lh6/s;->b(ZLjava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/internal/location/zzbp;->zza:Lf6/a$g;

    invoke-virtual {p1, v0}, Lf6/f;->d(Lf6/a$c;)Lf6/a$f;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/location/zzda;

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/location/zzda;->zzp()Lcom/google/android/gms/location/LocationAvailability;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final removeLocationUpdates(Lf6/f;Landroid/app/PendingIntent;)Lf6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lf6/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/location/zzao;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/location/zzao;-><init>(Lcom/google/android/gms/internal/location/zzau;Lf6/f;Landroid/app/PendingIntent;)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final removeLocationUpdates(Lf6/f;Lw6/m;)Lf6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Lw6/m;",
            ")",
            "Lf6/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/location/zzap;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/location/zzap;-><init>(Lcom/google/android/gms/internal/location/zzau;Lf6/f;Lw6/m;)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final removeLocationUpdates(Lf6/f;Lw6/n;)Lf6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Lw6/n;",
            ")",
            "Lf6/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/location/zzan;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/location/zzan;-><init>(Lcom/google/android/gms/internal/location/zzau;Lf6/f;Lw6/n;)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final requestLocationUpdates(Lf6/f;Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lf6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Lcom/google/android/gms/location/LocationRequest;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lf6/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/location/zzam;

    invoke-direct {v0, p0, p1, p3, p2}, Lcom/google/android/gms/internal/location/zzam;-><init>(Lcom/google/android/gms/internal/location/zzau;Lf6/f;Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationRequest;)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final requestLocationUpdates(Lf6/f;Lcom/google/android/gms/location/LocationRequest;Lw6/m;Landroid/os/Looper;)Lf6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Lcom/google/android/gms/location/LocationRequest;",
            "Lw6/m;",
            "Landroid/os/Looper;",
            ")",
            "Lf6/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    if-nez p4, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    const-string v0, "invalid null looper"

    invoke-static {p4, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-class v0, Lw6/m;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, p4, v0}, Lg6/k;->a(Ljava/lang/Object;Landroid/os/Looper;Ljava/lang/String;)Lg6/j;

    move-result-object p3

    new-instance p4, Lcom/google/android/gms/internal/location/zzal;

    invoke-direct {p4, p0, p1, p3, p2}, Lcom/google/android/gms/internal/location/zzal;-><init>(Lcom/google/android/gms/internal/location/zzau;Lf6/f;Lg6/j;Lcom/google/android/gms/location/LocationRequest;)V

    invoke-virtual {p1, p4}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final requestLocationUpdates(Lf6/f;Lcom/google/android/gms/location/LocationRequest;Lw6/n;)Lf6/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Lcom/google/android/gms/location/LocationRequest;",
            "Lw6/n;",
            ")",
            "Lf6/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    const-string v1, "invalid null looper"

    invoke-static {v0, v1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lw6/n;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p3, v0, v1}, Lg6/k;->a(Ljava/lang/Object;Landroid/os/Looper;Ljava/lang/String;)Lg6/j;

    move-result-object p3

    new-instance v0, Lcom/google/android/gms/internal/location/zzak;

    invoke-direct {v0, p0, p1, p3, p2}, Lcom/google/android/gms/internal/location/zzak;-><init>(Lcom/google/android/gms/internal/location/zzau;Lf6/f;Lg6/j;Lcom/google/android/gms/location/LocationRequest;)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final requestLocationUpdates(Lf6/f;Lcom/google/android/gms/location/LocationRequest;Lw6/n;Landroid/os/Looper;)Lf6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Lcom/google/android/gms/location/LocationRequest;",
            "Lw6/n;",
            "Landroid/os/Looper;",
            ")",
            "Lf6/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    if-nez p4, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    const-string v0, "invalid null looper"

    invoke-static {p4, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-class v0, Lw6/n;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, p4, v0}, Lg6/k;->a(Ljava/lang/Object;Landroid/os/Looper;Ljava/lang/String;)Lg6/j;

    move-result-object p3

    new-instance p4, Lcom/google/android/gms/internal/location/zzak;

    invoke-direct {p4, p0, p1, p3, p2}, Lcom/google/android/gms/internal/location/zzak;-><init>(Lcom/google/android/gms/internal/location/zzau;Lf6/f;Lg6/j;Lcom/google/android/gms/location/LocationRequest;)V

    invoke-virtual {p1, p4}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final setMockLocation(Lf6/f;Landroid/location/Location;)Lf6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Landroid/location/Location;",
            ")",
            "Lf6/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/location/zzar;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/location/zzar;-><init>(Lcom/google/android/gms/internal/location/zzau;Lf6/f;Landroid/location/Location;)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final setMockMode(Lf6/f;Z)Lf6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Z)",
            "Lf6/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/location/zzaq;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/location/zzaq;-><init>(Lcom/google/android/gms/internal/location/zzau;Lf6/f;Z)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method
