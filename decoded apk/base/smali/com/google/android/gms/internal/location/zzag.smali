.class public final Lcom/google/android/gms/internal/location/zzag;
.super Lf6/e;
.source ""


# static fields
.field public static final zza:Lf6/a$g;

.field public static final zzb:Lf6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lf6/a$g;

    invoke-direct {v0}, Lf6/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/location/zzag;->zza:Lf6/a$g;

    new-instance v1, Lf6/a;

    new-instance v2, Lcom/google/android/gms/internal/location/zzad;

    invoke-direct {v2}, Lcom/google/android/gms/internal/location/zzad;-><init>()V

    const-string v3, "ActivityRecognition.API"

    invoke-direct {v1, v3, v2, v0}, Lf6/a;-><init>(Ljava/lang/String;Lf6/a$a;Lf6/a$g;)V

    sput-object v1, Lcom/google/android/gms/internal/location/zzag;->zzb:Lf6/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/location/zzag;->zzb:Lf6/a;

    sget-object v1, Lf6/a$d;->d:Lf6/a$d$c;

    sget-object v2, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lf6/e;-><init>(Landroid/app/Activity;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/location/zzag;->zzb:Lf6/a;

    sget-object v1, Lf6/a$d;->d:Lf6/a$d$c;

    sget-object v2, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lf6/e;-><init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method


# virtual methods
.method public final removeActivityTransitionUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/location/zzx;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/location/zzx;-><init>(Landroid/app/PendingIntent;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    const/16 v0, 0x966

    invoke-virtual {p1, v0}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doWrite(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final removeActivityUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/location/zzy;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/location/zzy;-><init>(Landroid/app/PendingIntent;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    const/16 v0, 0x962

    invoke-virtual {p1, v0}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doWrite(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final removeSleepSegmentUpdates(Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/location/zzab;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/location/zzab;-><init>(Landroid/app/PendingIntent;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    const/16 v0, 0x96b

    invoke-virtual {p1, v0}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doWrite(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final requestActivityTransitionUpdates(Lw6/d;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw6/d;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lf6/e;->getContextAttributionTag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lw6/d;->I(Ljava/lang/String;)Lw6/d;

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/location/zzaa;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/location/zzaa;-><init>(Lw6/d;Landroid/app/PendingIntent;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    const/16 p2, 0x965

    invoke-virtual {p1, p2}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doWrite(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final requestActivityUpdates(JLandroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lw6/w;

    invoke-direct {v0}, Lw6/w;-><init>()V

    invoke-virtual {v0, p1, p2}, Lw6/w;->a(J)Lw6/w;

    invoke-virtual {v0}, Lw6/w;->b()Lw6/g0;

    move-result-object p1

    invoke-virtual {p0}, Lf6/e;->getContextAttributionTag()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lw6/g0;->I(Ljava/lang/String;)Lw6/g0;

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/location/zzz;

    invoke-direct {v0, p1, p3}, Lcom/google/android/gms/internal/location/zzz;-><init>(Lw6/g0;Landroid/app/PendingIntent;)V

    invoke-virtual {p2, v0}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    const/16 p2, 0x961

    invoke-virtual {p1, p2}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doWrite(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final requestSleepSegmentUpdates(Landroid/app/PendingIntent;Lw6/v;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/PendingIntent;",
            "Lw6/v;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "PendingIntent must be specified."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/location/zzac;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/location/zzac;-><init>(Lcom/google/android/gms/internal/location/zzag;Landroid/app/PendingIntent;Lw6/v;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Le6/d;

    sget-object v0, Lw6/m0;->b:Le6/d;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    invoke-virtual {p1, p2}, Lg6/v$a;->d([Le6/d;)Lg6/v$a;

    move-result-object p1

    const/16 p2, 0x96a

    invoke-virtual {p1, p2}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doRead(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
