.class public final Lc7/ra;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;
.implements Lh6/c$a;
.implements Lh6/c$b;


# instance fields
.field public volatile h:Z

.field public volatile i:Lc7/w4;

.field public final synthetic j:Lc7/y9;


# direct methods
.method public constructor <init>(Lc7/y9;)V
    .locals 0

    iput-object p1, p0, Lc7/ra;->j:Lc7/y9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic d(Lc7/ra;Z)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lc7/ra;->h:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v0

    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lc7/ra;->h:Z

    if-eqz v1, :cond_0

    iget-object v0, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v1, "Connection attempt already in progress"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    monitor-exit p0

    return-void

    :cond_0
    iget-object v1, p0, Lc7/ra;->i:Lc7/w4;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lc7/ra;->i:Lc7/w4;

    invoke-virtual {v1}, Lh6/c;->isConnecting()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lc7/ra;->i:Lc7/w4;

    invoke-virtual {v1}, Lh6/c;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    iget-object v0, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v1, "Already awaiting connection attempt"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    monitor-exit p0

    return-void

    :cond_2
    new-instance v1, Lc7/w4;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v0, v2, p0, p0}, Lc7/w4;-><init>(Landroid/content/Context;Landroid/os/Looper;Lh6/c$a;Lh6/c$b;)V

    iput-object v1, p0, Lc7/ra;->i:Lc7/w4;

    iget-object v0, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v1, "Connecting to remote service"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc7/ra;->h:Z

    iget-object v0, p0, Lc7/ra;->i:Lc7/w4;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc7/ra;->i:Lc7/w4;

    invoke-virtual {v0}, Lh6/c;->checkAvailabilityAndConnect()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b(Landroid/content/Intent;)V
    .locals 4

    iget-object v0, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Ln6/a;->b()Ln6/a;

    move-result-object v1

    monitor-enter p0

    :try_start_0
    iget-boolean v2, p0, Lc7/ra;->h:Z

    if-eqz v2, :cond_0

    iget-object p1, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {p1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->F()Lc7/x4;

    move-result-object p1

    const-string v0, "Connection attempt already in progress"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    monitor-exit p0

    return-void

    :cond_0
    iget-object v2, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->F()Lc7/x4;

    move-result-object v2

    const-string v3, "Using local app measurement service"

    invoke-virtual {v2, v3}, Lc7/x4;->a(Ljava/lang/String;)V

    const/4 v2, 0x1

    iput-boolean v2, p0, Lc7/ra;->h:Z

    iget-object v2, p0, Lc7/ra;->j:Lc7/y9;

    invoke-static {v2}, Lc7/y9;->d0(Lc7/y9;)Lc7/ra;

    move-result-object v2

    const/16 v3, 0x81

    invoke-virtual {v1, v0, p1, v2, v3}, Ln6/a;->a(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final c(I)V
    .locals 1

    const-string p1, "MeasurementServiceConnection.onConnectionSuspended"

    invoke-static {p1}, Lh6/s;->e(Ljava/lang/String;)V

    iget-object p1, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {p1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->A()Lc7/x4;

    move-result-object p1

    const-string v0, "Service connection suspended"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {p1}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object p1

    new-instance v0, Lc7/va;

    invoke-direct {v0, p0}, Lc7/va;-><init>(Lc7/ra;)V

    invoke-virtual {p1, v0}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e(Le6/b;)V
    .locals 2

    const-string v0, "MeasurementServiceConnection.onConnectionFailed"

    invoke-static {v0}, Lh6/s;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lc7/ra;->j:Lc7/y9;

    iget-object v0, v0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->z()Lc7/v4;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc7/v4;->G()Lc7/x4;

    move-result-object v0

    const-string v1, "Service connection failed"

    invoke-virtual {v0, v1, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    monitor-enter p0

    const/4 p1, 0x0

    :try_start_0
    iput-boolean p1, p0, Lc7/ra;->h:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lc7/ra;->i:Lc7/w4;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {p1}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object p1

    new-instance v0, Lc7/ya;

    invoke-direct {v0, p0}, Lc7/ya;-><init>(Lc7/ra;)V

    invoke-virtual {p1, v0}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lc7/ra;->i:Lc7/w4;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc7/ra;->i:Lc7/w4;

    invoke-virtual {v0}, Lh6/c;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lc7/ra;->i:Lc7/w4;

    invoke-virtual {v0}, Lh6/c;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lc7/ra;->i:Lc7/w4;

    invoke-virtual {v0}, Lh6/c;->disconnect()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lc7/ra;->i:Lc7/w4;

    return-void
.end method

.method public final g(Landroid/os/Bundle;)V
    .locals 2

    const-string p1, "MeasurementServiceConnection.onConnected"

    invoke-static {p1}, Lh6/s;->e(Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lc7/ra;->i:Lc7/w4;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lc7/ra;->i:Lc7/w4;

    invoke-virtual {p1}, Lh6/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lc7/o4;

    iget-object v0, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/wa;

    invoke-direct {v1, p0, p1}, Lc7/wa;-><init>(Lc7/ra;Lc7/o4;)V

    invoke-virtual {v0, v1}, Lc7/d6;->y(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    const/4 p1, 0x0

    :try_start_1
    iput-object p1, p0, Lc7/ra;->i:Lc7/w4;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lc7/ra;->h:Z

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    const-string p1, "MeasurementServiceConnection.onServiceConnected"

    invoke-static {p1}, Lh6/s;->e(Ljava/lang/String;)V

    monitor-enter p0

    const/4 p1, 0x0

    if-nez p2, :cond_0

    :try_start_0
    iput-boolean p1, p0, Lc7/ra;->h:Z

    iget-object p1, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {p1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p2, "Service connected with null binder"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    invoke-interface {p2}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.android.gms.measurement.internal.IMeasurementService"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v1, "com.google.android.gms.measurement.internal.IMeasurementService"

    invoke-interface {p2, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Lc7/o4;

    if-eqz v2, :cond_1

    check-cast v1, Lc7/o4;

    goto :goto_0

    :cond_1
    new-instance v1, Lc7/q4;

    invoke-direct {v1, p2}, Lc7/q4;-><init>(Landroid/os/IBinder;)V

    :goto_0
    move-object v0, v1

    iget-object p2, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {p2}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->F()Lc7/x4;

    move-result-object p2

    const-string v1, "Bound to IMeasurementService interface"

    invoke-virtual {p2, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {p2}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    const-string v2, "Got binder with a wrong descriptor"

    invoke-virtual {p2, v2, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    :try_start_2
    iget-object p2, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {p2}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    const-string v1, "Service connect failed to get IMeasurementService"

    invoke-virtual {p2, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    :goto_1
    if-nez v0, :cond_3

    iput-boolean p1, p0, Lc7/ra;->h:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {}, Ln6/a;->b()Ln6/a;

    move-result-object p1

    iget-object p2, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {p2}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object p2

    iget-object v0, p0, Lc7/ra;->j:Lc7/y9;

    invoke-static {v0}, Lc7/y9;->d0(Lc7/y9;)Lc7/ra;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Ln6/a;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :cond_3
    :try_start_4
    iget-object p1, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {p1}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object p1

    new-instance p2, Lc7/ua;

    invoke-direct {p2, p0, v0}, Lc7/ua;-><init>(Lc7/ra;Lc7/o4;)V

    invoke-virtual {p1, p2}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    :catch_1
    :goto_2
    monitor-exit p0

    return-void

    :goto_3
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    const-string v0, "MeasurementServiceConnection.onServiceDisconnected"

    invoke-static {v0}, Lh6/s;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v1, "Service disconnected"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/ta;

    invoke-direct {v1, p0, p1}, Lc7/ta;-><init>(Lc7/ra;Landroid/content/ComponentName;)V

    invoke-virtual {v0, v1}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method
