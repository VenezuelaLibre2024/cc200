.class public final Lcom/google/android/gms/internal/location/zzbv;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw6/j;


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

    new-instance v2, Lcom/google/android/gms/internal/location/zzbq;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/location/zzbq;-><init>(Lg6/d;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-object v0
.end method


# virtual methods
.method public final addGeofences(Lf6/f;Ljava/util/List;Landroid/app/PendingIntent;)Lf6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Ljava/util/List<",
            "Lw6/h;",
            ">;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lf6/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lw6/k$a;

    invoke-direct {v0}, Lw6/k$a;-><init>()V

    invoke-virtual {v0, p2}, Lw6/k$a;->b(Ljava/util/List;)Lw6/k$a;

    const/4 p2, 0x5

    invoke-virtual {v0, p2}, Lw6/k$a;->d(I)Lw6/k$a;

    invoke-virtual {v0}, Lw6/k$a;->c()Lw6/k;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/location/zzbr;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/location/zzbr;-><init>(Lcom/google/android/gms/internal/location/zzbv;Lf6/f;Lw6/k;Landroid/app/PendingIntent;)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final addGeofences(Lf6/f;Lw6/k;Landroid/app/PendingIntent;)Lf6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Lw6/k;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lf6/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/location/zzbr;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/location/zzbr;-><init>(Lcom/google/android/gms/internal/location/zzbv;Lf6/f;Lw6/k;Landroid/app/PendingIntent;)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final removeGeofences(Lf6/f;Landroid/app/PendingIntent;)Lf6/h;
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

    new-instance v0, Lcom/google/android/gms/internal/location/zzbs;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/location/zzbs;-><init>(Lcom/google/android/gms/internal/location/zzbv;Lf6/f;Landroid/app/PendingIntent;)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final removeGeofences(Lf6/f;Ljava/util/List;)Lf6/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/f;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lf6/h<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/location/zzbt;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/location/zzbt;-><init>(Lcom/google/android/gms/internal/location/zzbv;Lf6/f;Ljava/util/List;)V

    invoke-virtual {p1, v0}, Lf6/f;->b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method
