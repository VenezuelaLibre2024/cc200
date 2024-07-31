.class public final synthetic Lc7/c8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic h:Lc7/w7;

.field public synthetic i:Landroid/os/Bundle;

.field public synthetic j:J


# direct methods
.method public synthetic constructor <init>(Lc7/w7;Landroid/os/Bundle;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/c8;->h:Lc7/w7;

    iput-object p2, p0, Lc7/c8;->i:Landroid/os/Bundle;

    iput-wide p3, p0, Lc7/c8;->j:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lc7/c8;->h:Lc7/w7;

    iget-object v1, p0, Lc7/c8;->i:Landroid/os/Bundle;

    iget-wide v2, p0, Lc7/c8;->j:J

    invoke-virtual {v0}, Lc7/f4;->k()Lc7/p4;

    move-result-object v4

    invoke-virtual {v4}, Lc7/p4;->B()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Lc7/w7;->C(Landroid/os/Bundle;IJ)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->H()Lc7/x4;

    move-result-object v0

    const-string v1, "Using developer consent only; google app id found"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void
.end method
