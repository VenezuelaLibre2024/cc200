.class public final Lc7/m8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:J

.field public final synthetic i:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-wide p2, p0, Lc7/m8;->h:J

    iput-object p1, p0, Lc7/m8;->i:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/m8;->i:Lc7/w7;

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->m:Lc7/n5;

    iget-wide v1, p0, Lc7/m8;->h:J

    invoke-virtual {v0, v1, v2}, Lc7/n5;->b(J)V

    iget-object v0, p0, Lc7/m8;->i:Lc7/w7;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    iget-wide v1, p0, Lc7/m8;->h:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Session timeout duration set"

    invoke-virtual {v0, v2, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
