.class public final Lc7/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/l7;

.field public final synthetic i:Lc7/u;


# direct methods
.method public constructor <init>(Lc7/u;Lc7/l7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/x;->h:Lc7/l7;

    iput-object p1, p0, Lc7/x;->i:Lc7/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lc7/x;->h:Lc7/l7;

    invoke-interface {v0}, Lc7/l7;->zzd()Lc7/c;

    invoke-static {}, Lc7/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/x;->h:Lc7/l7;

    invoke-interface {v0}, Lc7/l7;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0, p0}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lc7/x;->i:Lc7/u;

    invoke-virtual {v0}, Lc7/u;->e()Z

    move-result v0

    iget-object v1, p0, Lc7/x;->i:Lc7/u;

    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3}, Lc7/u;->c(Lc7/u;J)V

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc7/x;->i:Lc7/u;

    invoke-virtual {v0}, Lc7/u;->d()V

    :cond_1
    return-void
.end method
