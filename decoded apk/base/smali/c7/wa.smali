.class public final Lc7/wa;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/o4;

.field public final synthetic i:Lc7/ra;


# direct methods
.method public constructor <init>(Lc7/ra;Lc7/o4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/wa;->h:Lc7/o4;

    iput-object p1, p0, Lc7/wa;->i:Lc7/ra;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/wa;->i:Lc7/ra;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc7/wa;->i:Lc7/ra;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lc7/ra;->d(Lc7/ra;Z)V

    iget-object v1, p0, Lc7/wa;->i:Lc7/ra;

    iget-object v1, v1, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {v1}, Lc7/y9;->X()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lc7/wa;->i:Lc7/ra;

    iget-object v1, v1, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->A()Lc7/x4;

    move-result-object v1

    const-string v2, "Connected to remote service"

    invoke-virtual {v1, v2}, Lc7/x4;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lc7/wa;->i:Lc7/ra;

    iget-object v1, v1, Lc7/ra;->j:Lc7/y9;

    iget-object v2, p0, Lc7/wa;->h:Lc7/o4;

    invoke-virtual {v1, v2}, Lc7/y9;->A(Lc7/o4;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
