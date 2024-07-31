.class public final Lc7/h8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll7/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll7/c<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lc7/qb;

.field public final synthetic b:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;Lc7/qb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/h8;->a:Lc7/qb;

    iput-object p1, p0, Lc7/h8;->b:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lc7/h8;->b:Lc7/w7;

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/h8;->b:Lc7/w7;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lc7/w7;->M(Lc7/w7;Z)V

    iget-object v0, p0, Lc7/h8;->b:Lc7/w7;

    invoke-virtual {v0}, Lc7/w7;->o0()V

    iget-object v0, p0, Lc7/h8;->b:Lc7/w7;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "registerTriggerAsync failed with throwable"

    invoke-virtual {v0, v1, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 2

    iget-object p1, p0, Lc7/h8;->b:Lc7/w7;

    invoke-virtual {p1}, Lc7/j7;->i()V

    iget-object p1, p0, Lc7/h8;->b:Lc7/w7;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lc7/w7;->M(Lc7/w7;Z)V

    iget-object p1, p0, Lc7/h8;->b:Lc7/w7;

    invoke-virtual {p1}, Lc7/w7;->o0()V

    iget-object p1, p0, Lc7/h8;->b:Lc7/w7;

    invoke-virtual {p1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->A()Lc7/x4;

    move-result-object p1

    iget-object v0, p0, Lc7/h8;->a:Lc7/qb;

    iget-object v0, v0, Lc7/qb;->h:Ljava/lang/String;

    const-string v1, "registerTriggerAsync ran. uri"

    invoke-virtual {p1, v1, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
