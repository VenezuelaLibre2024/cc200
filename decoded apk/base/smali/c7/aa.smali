.class public final Lc7/aa;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/rc;

.field public final synthetic i:Z

.field public final synthetic j:Lc7/lc;

.field public final synthetic k:Lc7/y9;


# direct methods
.method public constructor <init>(Lc7/y9;Lc7/rc;ZLc7/lc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/aa;->h:Lc7/rc;

    iput-boolean p3, p0, Lc7/aa;->i:Z

    iput-object p4, p0, Lc7/aa;->j:Lc7/lc;

    iput-object p1, p0, Lc7/aa;->k:Lc7/y9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lc7/aa;->k:Lc7/y9;

    invoke-static {v0}, Lc7/y9;->w(Lc7/y9;)Lc7/o4;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lc7/aa;->k:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Discarding data. Failed to set user property"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lc7/aa;->h:Lc7/rc;

    invoke-static {v1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lc7/aa;->k:Lc7/y9;

    iget-boolean v2, p0, Lc7/aa;->i:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lc7/aa;->j:Lc7/lc;

    :goto_0
    iget-object v3, p0, Lc7/aa;->h:Lc7/rc;

    invoke-virtual {v1, v0, v2, v3}, Lc7/y9;->B(Lc7/o4;Li6/a;Lc7/rc;)V

    iget-object v0, p0, Lc7/aa;->k:Lc7/y9;

    invoke-static {v0}, Lc7/y9;->h0(Lc7/y9;)V

    return-void
.end method
