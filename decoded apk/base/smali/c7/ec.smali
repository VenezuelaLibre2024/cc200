.class public final Lc7/ec;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Landroid/os/Bundle;

.field public final synthetic k:Lc7/fc;


# direct methods
.method public constructor <init>(Lc7/fc;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/ec;->h:Ljava/lang/String;

    iput-object p3, p0, Lc7/ec;->i:Ljava/lang/String;

    iput-object p4, p0, Lc7/ec;->j:Landroid/os/Bundle;

    iput-object p1, p0, Lc7/ec;->k:Lc7/fc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lc7/ec;->k:Lc7/fc;

    iget-object v0, v0, Lc7/fc;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v1

    iget-object v2, p0, Lc7/ec;->h:Ljava/lang/String;

    iget-object v3, p0, Lc7/ec;->i:Ljava/lang/String;

    iget-object v4, p0, Lc7/ec;->j:Landroid/os/Bundle;

    iget-object v0, p0, Lc7/ec;->k:Lc7/fc;

    iget-object v0, v0, Lc7/fc;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v6

    const-string v5, "auto"

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-virtual/range {v1 .. v9}, Lc7/qc;->C(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lc7/g0;

    move-result-object v0

    iget-object v1, p0, Lc7/ec;->k:Lc7/fc;

    iget-object v1, v1, Lc7/fc;->a:Lc7/yb;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc7/g0;

    iget-object v2, p0, Lc7/ec;->h:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lc7/yb;->m(Lc7/g0;Ljava/lang/String;)V

    return-void
.end method
