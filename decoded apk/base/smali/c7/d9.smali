.class public final Lc7/d9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/w;

.field public final synthetic i:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;Lc7/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/d9;->h:Lc7/w;

    iput-object p1, p0, Lc7/d9;->i:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/d9;->i:Lc7/w7;

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v1, p0, Lc7/d9;->h:Lc7/w;

    invoke-virtual {v0, v1}, Lc7/i5;->u(Lc7/w;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/d9;->i:Lc7/w7;

    invoke-virtual {v0}, Lc7/f4;->o()Lc7/y9;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc7/y9;->P(Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lc7/d9;->i:Lc7/w7;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->E()Lc7/x4;

    move-result-object v0

    iget-object v1, p0, Lc7/d9;->h:Lc7/w;

    invoke-virtual {v1}, Lc7/w;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Lower precedence consent source ignored, proposed source"

    invoke-virtual {v0, v2, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
