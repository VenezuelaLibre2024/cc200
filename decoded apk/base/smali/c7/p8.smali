.class public final Lc7/p8;
.super Lc7/u;
.source ""


# instance fields
.field public final synthetic e:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;Lc7/l7;)V
    .locals 0

    iput-object p1, p0, Lc7/p8;->e:Lc7/w7;

    invoke-direct {p0, p2}, Lc7/u;-><init>(Lc7/l7;)V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 3

    iget-object v0, p0, Lc7/p8;->e:Lc7/w7;

    iget-object v0, v0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/p8;->e:Lc7/w7;

    invoke-static {v0}, Lc7/w7;->w(Lc7/w7;)Lc7/u;

    move-result-object v0

    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, v1, v2}, Lc7/u;->b(J)V

    :cond_0
    return-void
.end method
