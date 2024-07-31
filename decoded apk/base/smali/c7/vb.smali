.class public final Lc7/vb;
.super Lc7/u;
.source ""


# instance fields
.field public final synthetic e:Lc7/sb;


# direct methods
.method public constructor <init>(Lc7/sb;Lc7/l7;)V
    .locals 0

    iput-object p1, p0, Lc7/vb;->e:Lc7/sb;

    invoke-direct {p0, p2}, Lc7/u;-><init>(Lc7/l7;)V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    iget-object v0, p0, Lc7/vb;->e:Lc7/sb;

    invoke-virtual {v0}, Lc7/sb;->u()V

    iget-object v0, p0, Lc7/vb;->e:Lc7/sb;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v1, "Starting upload from DelayedRunnable"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lc7/vb;->e:Lc7/sb;

    iget-object v0, v0, Lc7/ub;->b:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->p0()V

    return-void
.end method
