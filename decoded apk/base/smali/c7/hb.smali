.class public final Lc7/hb;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lc7/lb;

.field public final synthetic b:Lc7/gb;


# direct methods
.method public constructor <init>(Lc7/gb;)V
    .locals 0

    iput-object p1, p0, Lc7/hb;->b:Lc7/gb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lc7/hb;->b:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/hb;->a:Lc7/lb;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/hb;->b:Lc7/gb;

    invoke-static {v0}, Lc7/gb;->w(Lc7/gb;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lc7/hb;->a:Lc7/lb;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v0, p0, Lc7/hb;->b:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->u:Lc7/l5;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc7/l5;->a(Z)V

    iget-object v0, p0, Lc7/hb;->b:Lc7/gb;

    invoke-virtual {v0, v1}, Lc7/gb;->y(Z)V

    return-void
.end method

.method public final b(J)V
    .locals 7

    new-instance v6, Lc7/lb;

    iget-object v0, p0, Lc7/hb;->b:Lc7/gb;

    invoke-virtual {v0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v2

    move-object v0, v6

    move-object v1, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, Lc7/lb;-><init>(Lc7/hb;JJ)V

    iput-object v6, p0, Lc7/hb;->a:Lc7/lb;

    iget-object p1, p0, Lc7/hb;->b:Lc7/gb;

    invoke-static {p1}, Lc7/gb;->w(Lc7/gb;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lc7/hb;->a:Lc7/lb;

    const-wide/16 v0, 0x7d0

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
