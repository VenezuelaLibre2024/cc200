.class public Lcom/google/android/gms/internal/measurement/zzdf;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/zzdf$zza;,
        Lcom/google/android/gms/internal/measurement/zzdf$zzc;,
        Lcom/google/android/gms/internal/measurement/zzdf$zzb;,
        Lcom/google/android/gms/internal/measurement/zzdf$zzd;
    }
.end annotation


# static fields
.field private static volatile zzb:Lcom/google/android/gms/internal/measurement/zzdf;


# instance fields
.field public final zza:Lo6/d;

.field private final zzc:Ljava/lang/String;

.field private final zzd:Ljava/util/concurrent/ExecutorService;

.field private final zze:Lb7/a;

.field private final zzf:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Lc7/r7;",
            "Lcom/google/android/gms/internal/measurement/zzdf$zzb;",
            ">;>;"
        }
    .end annotation
.end field

.field private zzg:I

.field private zzh:Z

.field private zzi:Ljava/lang/String;

.field private volatile zzj:Lcom/google/android/gms/internal/measurement/zzcu;


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    invoke-direct {p0, p3, p4}, Lcom/google/android/gms/internal/measurement/zzdf;->zzc(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string p2, "FA"

    :cond_1
    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Ljava/lang/String;

    invoke-static {}, Lo6/g;->d()Lo6/d;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zza:Lo6/d;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzch;->zza()Lcom/google/android/gms/internal/measurement/zzci;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdr;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzdr;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;)V

    sget v1, Lcom/google/android/gms/internal/measurement/zzcq;->zza:I

    invoke-interface {p2, v0, v1}, Lcom/google/android/gms/internal/measurement/zzci;->zza(Ljava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzd:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Lb7/a;

    invoke-direct {p2, p0}, Lb7/a;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zze:Lb7/a;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzf:Ljava/util/List;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zzb(Landroid/content/Context;)Z

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_3

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzdf;->zzk()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    move p2, v0

    goto :goto_1

    :cond_3
    :goto_0
    move p2, v1

    :goto_1
    if-nez p2, :cond_4

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzi:Ljava/lang/String;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzh:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Ljava/lang/String;

    const-string p2, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    invoke-direct {p0, p3, p4}, Lcom/google/android/gms/internal/measurement/zzdf;->zzc(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_8

    const-string p2, "fa"

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzi:Ljava/lang/String;

    if-eqz p3, :cond_5

    if-eqz p4, :cond_5

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Ljava/lang/String;

    const-string v0, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics"

    invoke-static {p2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_5
    if-nez p3, :cond_6

    move p2, v1

    goto :goto_2

    :cond_6
    move p2, v0

    :goto_2
    if-nez p4, :cond_7

    move v0, v1

    :cond_7
    xor-int/2addr p2, v0

    if-eqz p2, :cond_9

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Ljava/lang/String;

    const-string v0, "Specified origin or custom app id is null. Both parameters will be ignored."

    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_8
    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzi:Ljava/lang/String;

    :cond_9
    :goto_3
    new-instance p2, Lcom/google/android/gms/internal/measurement/zzdi;

    move-object v1, p2

    move-object v2, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p1

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/zzdi;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/os/Bundle;)V

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    if-nez p1, :cond_a

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Ljava/lang/String;

    const-string p2, "Unable to register lifecycle notifications. Application null."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_a
    new-instance p2, Lcom/google/android/gms/internal/measurement/zzdf$zzd;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/measurement/zzdf$zzd;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;)V

    invoke-virtual {p1, p2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public static bridge synthetic zza(Lcom/google/android/gms/internal/measurement/zzdf;)Lcom/google/android/gms/internal/measurement/zzcu;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzj:Lcom/google/android/gms/internal/measurement/zzcu;

    return-object p0
.end method

.method public static zza(Landroid/content/Context;)Lcom/google/android/gms/internal/measurement/zzdf;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0, v0, v0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/internal/measurement/zzdf;

    move-result-object p0

    return-object p0
.end method

.method public static zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/internal/measurement/zzdf;
    .locals 8

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzdf;->zzb:Lcom/google/android/gms/internal/measurement/zzdf;

    if-nez v0, :cond_1

    const-class v0, Lcom/google/android/gms/internal/measurement/zzdf;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzdf;->zzb:Lcom/google/android/gms/internal/measurement/zzdf;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzdf;

    move-object v2, v1

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/measurement/zzdf;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzdf;->zzb:Lcom/google/android/gms/internal/measurement/zzdf;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzb:Lcom/google/android/gms/internal/measurement/zzdf;

    return-object p0
.end method

.method private final zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzd:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic zza(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzcu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzj:Lcom/google/android/gms/internal/measurement/zzcu;

    return-void
.end method

.method public static bridge synthetic zza(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzdf$zza;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public static bridge synthetic zza(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/Exception;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Ljava/lang/Exception;ZZ)V

    return-void
.end method

.method private final zza(Ljava/lang/Exception;ZZ)V
    .locals 6

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzh:Z

    or-int/2addr v0, p2

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzh:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Ljava/lang/String;

    const-string p3, "Data collection startup failed. No data will be collected."

    invoke-static {p2, p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_0
    const-string p2, "Error with data collection. Data lost."

    if-eqz p3, :cond_1

    const/4 v1, 0x5

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p2

    move-object v3, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Ljava/lang/String;

    invoke-static {p3, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method private final zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/lang/Long;)V
    .locals 9

    new-instance v8, Lcom/google/android/gms/internal/measurement/zzel;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p6

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/measurement/zzel;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZ)V

    invoke-direct {p0, v8}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzdf;->zzc(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic zzb(Lcom/google/android/gms/internal/measurement/zzdf;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Ljava/lang/String;

    return-object p0
.end method

.method private static zzb(Landroid/content/Context;)Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, Lc7/e6;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "google_app_id"

    new-instance v3, Lc7/e6;

    invoke-direct {v3, p0, v1}, Lc7/e6;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lc7/e6;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_0
    return v0
.end method

.method public static bridge synthetic zzc(Lcom/google/android/gms/internal/measurement/zzdf;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzh:Z

    return p0
.end method

.method private final zzc(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzdf;->zzk()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final zzk()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.google.firebase.analytics.FirebaseAnalytics"

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :catch_0
    return v0
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)I
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzed;

    invoke-direct {v1, p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzed;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcs;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzcs;->zza(J)Landroid/os/Bundle;

    move-result-object p1

    const-class v0, Ljava/lang/Integer;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzcs;->zza(Landroid/os/Bundle;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    const/16 p1, 0x19

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final zza()J
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzdy;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/zzdy;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzcs;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzcs;->zzb(J)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Random;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zza:Lo6/d;

    invoke-interface {v3}, Lo6/d;->a()J

    move-result-wide v3

    xor-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v0

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzg:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzg:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zza(Landroid/os/Bundle;Z)Landroid/os/Bundle;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzeb;

    invoke-direct {v1, p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzeb;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;Lcom/google/android/gms/internal/measurement/zzcs;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    if-eqz p2, :cond_0

    const-wide/16 p1, 0x1388

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzcs;->zza(J)Landroid/os/Bundle;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final zza(Landroid/content/Context;Z)Lcom/google/android/gms/internal/measurement/zzcu;
    .locals 1

    :try_start_0
    sget-object p2, Lcom/google/android/gms/dynamite/DynamiteModule;->e:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    const-string v0, "com.google.android.gms.measurement.dynamite"

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object p1

    const-string p2, "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzct;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/internal/measurement/zzcu;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Ljava/lang/Exception;ZZ)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final zza(I)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzei;

    invoke-direct {v1, p0, v0, p1}, Lcom/google/android/gms/internal/measurement/zzei;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzcs;I)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    const-wide/16 v1, 0x3a98

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzcs;->zza(J)Landroid/os/Bundle;

    move-result-object p1

    const-class v0, Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/zzcs;->zza(Landroid/os/Bundle;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzdj;

    invoke-direct {v1, p0, p1, p2, v0}, Lcom/google/android/gms/internal/measurement/zzdj;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcs;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    const-wide/16 p1, 0x1388

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzcs;->zza(J)Landroid/os/Bundle;

    move-result-object p1

    const-class p2, Ljava/util/List;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/zzcs;->zza(Landroid/os/Bundle;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v6, Lcom/google/android/gms/internal/measurement/zzcs;

    invoke-direct {v6}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/measurement/zzdz;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzdz;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/measurement/zzcs;)V

    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    const-wide/16 p1, 0x1388

    invoke-virtual {v6, p1, p2}, Lcom/google/android/gms/internal/measurement/zzcs;->zza(J)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/os/Bundle;->size()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    new-instance p2, Ljava/util/HashMap;

    invoke-virtual {p1}, Landroid/os/Bundle;->size()I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/HashMap;-><init>(I)V

    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Double;

    if-nez v2, :cond_2

    instance-of v2, v1, Ljava/lang/Long;

    if-nez v2, :cond_2

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1

    :cond_2
    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-object p2

    :cond_4
    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final zza(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzec;

    const/4 v2, 0x0

    const/4 v3, 0x5

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    move-object v1, p0

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/measurement/zzec;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;ZILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zza(J)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzds;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzds;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;J)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zza(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdl;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzdl;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zza(Landroid/os/Bundle;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdh;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzdh;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zza(Lc7/r7;)V
    .locals 4

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzf:Ljava/util/List;

    monitor-enter v0

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzf:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzf:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Ljava/lang/String;

    const-string v1, "OnEventListener already registered."

    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    monitor-exit v0

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzdf$zzb;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/measurement/zzdf$zzb;-><init>(Lc7/r7;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzf:Ljava/util/List;

    new-instance v3, Landroid/util/Pair;

    invoke-direct {v3, p1, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzj:Lcom/google/android/gms/internal/measurement/zzcu;

    if-eqz p1, :cond_2

    :try_start_1
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzj:Lcom/google/android/gms/internal/measurement/zzcu;

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/measurement/zzcu;->registerOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/zzda;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/BadParcelableException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/NetworkOnMainThreadException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Ljava/lang/String;

    const-string v0, "Failed to register event listener on calling thread. Trying again on the dynamite thread."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzej;

    invoke-direct {p1, p0, v1}, Lcom/google/android/gms/internal/measurement/zzej;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzdf$zzb;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final zza(Lc7/s7;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdf$zzc;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/measurement/zzdf$zzc;-><init>(Lc7/s7;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzj:Lcom/google/android/gms/internal/measurement/zzcu;

    if-eqz p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzj:Lcom/google/android/gms/internal/measurement/zzcu;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/measurement/zzcu;->setEventInterceptor(Lcom/google/android/gms/internal/measurement/zzda;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/NetworkOnMainThreadException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Ljava/lang/String;

    const-string v1, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread."

    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzee;

    invoke-direct {p1, p0, v0}, Lcom/google/android/gms/internal/measurement/zzee;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzdf$zzc;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zza(Ljava/lang/Boolean;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdo;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzdo;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/Boolean;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/lang/Long;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdk;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzdk;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 7

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/lang/Long;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 7

    new-instance v6, Lcom/google/android/gms/internal/measurement/zzen;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzen;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    invoke-direct {p0, v6}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zza(Z)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzeh;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzeh;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Z)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zzb()Lb7/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zze:Lb7/a;

    return-object v0
.end method

.method public final zzb(Landroid/os/Bundle;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdn;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzdn;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zzb(Lc7/r7;)V
    .locals 4

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzf:Ljava/util/List;

    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzf:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzf:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Pair;

    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzf:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/util/Pair;

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-nez v1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Ljava/lang/String;

    const-string v1, "OnEventListener had not been registered."

    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    monitor-exit v0

    return-void

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzf:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzdf$zzb;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzj:Lcom/google/android/gms/internal/measurement/zzcu;

    if-eqz v0, :cond_3

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzj:Lcom/google/android/gms/internal/measurement/zzcu;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/measurement/zzcu;->unregisterOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/zzda;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/BadParcelableException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/NetworkOnMainThreadException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzc:Ljava/lang/String;

    const-string v1, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzem;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzem;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzdf$zzb;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final zzb(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdu;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzdu;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zzb(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void
.end method

.method public final zzb(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/lang/Long;)V

    return-void
.end method

.method public final zzc()Ljava/lang/Long;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzef;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/zzef;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzcs;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    const-wide/32 v1, 0x1d4c0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzcs;->zzb(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final zzc(Landroid/os/Bundle;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdq;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzdq;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zzc(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdt;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzdt;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdf;->zzi:Ljava/lang/String;

    return-object v0
.end method

.method public final zzd(Landroid/os/Bundle;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzek;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzek;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zzd(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdm;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/zzdm;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method

.method public final zze()Ljava/lang/String;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzeg;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/zzeg;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzcs;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    const-wide/32 v1, 0x1d4c0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzcs;->zzc(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzf()Ljava/lang/String;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzdv;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/zzdv;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzcs;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzcs;->zzc(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzg()Ljava/lang/String;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzea;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/zzea;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzcs;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzcs;->zzc(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzh()Ljava/lang/String;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzdx;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/zzdx;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzcs;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzcs;->zzc(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzi()Ljava/lang/String;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcs;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzdw;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/measurement/zzdw;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzcs;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzcs;->zzc(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzj()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdp;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/zzdp;-><init>(Lcom/google/android/gms/internal/measurement/zzdf;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Lcom/google/android/gms/internal/measurement/zzdf$zza;)V

    return-void
.end method
