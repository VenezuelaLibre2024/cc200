.class public final Lc7/q6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/rc;

.field public final synthetic i:Lc7/o6;


# direct methods
.method public constructor <init>(Lc7/o6;Lc7/rc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/q6;->h:Lc7/rc;

    iput-object p1, p0, Lc7/q6;->i:Lc7/o6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/q6;->i:Lc7/o6;

    invoke-static {v0}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v0

    invoke-virtual {v0}, Lc7/yb;->k0()V

    iget-object v0, p0, Lc7/q6;->i:Lc7/o6;

    invoke-static {v0}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v0

    iget-object v1, p0, Lc7/q6;->h:Lc7/rc;

    invoke-virtual {v0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v2

    invoke-virtual {v2}, Lc7/j7;->i()V

    invoke-virtual {v0}, Lc7/yb;->l0()V

    iget-object v2, v1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0, v1}, Lc7/yb;->d(Lc7/rc;)Lc7/g5;

    return-void
.end method
