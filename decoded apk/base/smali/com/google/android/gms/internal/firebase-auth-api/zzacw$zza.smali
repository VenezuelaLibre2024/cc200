.class Lcom/google/android/gms/internal/firebase-auth-api/zzacw$zza;
.super Lcom/google/android/gms/common/api/internal/LifecycleCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/firebase-auth-api/zzacw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation


# instance fields
.field private final zza:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/b$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lg6/i;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg6/i;",
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/b$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;-><init>(Lg6/i;)V

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->mLifecycleFragment:Lg6/i;

    const-string v0, "PhoneAuthActivityStopCallback"

    invoke-interface {p1, v0, p0}, Lg6/i;->a(Ljava/lang/String;Lcom/google/android/gms/common/api/internal/LifecycleCallback;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacw$zza;->zza:Ljava/util/List;

    return-void
.end method

.method public static zza(Landroid/app/Activity;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/b$b;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getFragment(Landroid/app/Activity;)Lg6/i;

    move-result-object p0

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacw$zza;

    const-string v1, "PhoneAuthActivityStopCallback"

    invoke-interface {p0, v1, v0}, Lg6/i;->b(Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacw$zza;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacw$zza;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw$zza;-><init>(Lg6/i;Ljava/util/List;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onStop()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacw$zza;->zza:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzacw$zza;->zza:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
