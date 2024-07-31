.class public final Lc7/d7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/lc;

.field public final synthetic i:Lc7/rc;

.field public final synthetic j:Lc7/o6;


# direct methods
.method public constructor <init>(Lc7/o6;Lc7/lc;Lc7/rc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/d7;->h:Lc7/lc;

    iput-object p3, p0, Lc7/d7;->i:Lc7/rc;

    iput-object p1, p0, Lc7/d7;->j:Lc7/o6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/d7;->j:Lc7/o6;

    invoke-static {v0}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v0

    invoke-virtual {v0}, Lc7/yb;->k0()V

    iget-object v0, p0, Lc7/d7;->h:Lc7/lc;

    invoke-virtual {v0}, Lc7/lc;->I()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lc7/d7;->j:Lc7/o6;

    invoke-static {v0}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v0

    iget-object v1, p0, Lc7/d7;->h:Lc7/lc;

    iget-object v1, v1, Lc7/lc;->i:Ljava/lang/String;

    iget-object v2, p0, Lc7/d7;->i:Lc7/rc;

    invoke-virtual {v0, v1, v2}, Lc7/yb;->y(Ljava/lang/String;Lc7/rc;)V

    return-void

    :cond_0
    iget-object v0, p0, Lc7/d7;->j:Lc7/o6;

    invoke-static {v0}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v0

    iget-object v1, p0, Lc7/d7;->h:Lc7/lc;

    iget-object v2, p0, Lc7/d7;->i:Lc7/rc;

    invoke-virtual {v0, v1, v2}, Lc7/yb;->p(Lc7/lc;Lc7/rc;)V

    return-void
.end method
