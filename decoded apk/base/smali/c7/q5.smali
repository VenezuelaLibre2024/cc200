.class public final Lc7/q5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final h:Ljava/lang/String;

.field public final synthetic i:Lc7/r5;


# direct methods
.method public constructor <init>(Lc7/r5;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lc7/q5;->i:Lc7/r5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc7/q5;->h:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic a(Lc7/q5;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lc7/q5;->h:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    if-nez p2, :cond_0

    iget-object p1, p0, Lc7/q5;->i:Lc7/r5;

    iget-object p1, p1, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    const-string p2, "Install Referrer connection returned with null binder"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/zzcb;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/measurement/zzby;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lc7/q5;->i:Lc7/r5;

    iget-object p1, p1, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    const-string p2, "Install Referrer Service implementation was not found"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object p2, p0, Lc7/q5;->i:Lc7/r5;

    iget-object p2, p2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->F()Lc7/x4;

    move-result-object p2

    const-string v0, "Install Referrer Service connected"

    invoke-virtual {p2, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    iget-object p2, p0, Lc7/q5;->i:Lc7/r5;

    iget-object p2, p2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object p2

    new-instance v0, Lc7/t5;

    invoke-direct {v0, p0, p1, p0}, Lc7/t5;-><init>(Lc7/q5;Lcom/google/android/gms/internal/measurement/zzby;Landroid/content/ServiceConnection;)V

    invoke-virtual {p2, v0}, Lc7/d6;->y(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lc7/q5;->i:Lc7/r5;

    iget-object p2, p2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->G()Lc7/x4;

    move-result-object p2

    const-string v0, "Exception occurred while calling Install Referrer API"

    invoke-virtual {p2, v0, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    iget-object p1, p0, Lc7/q5;->i:Lc7/r5;

    iget-object p1, p1, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->F()Lc7/x4;

    move-result-object p1

    const-string v0, "Install Referrer Service disconnected"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void
.end method
