.class public final Lc7/q8;
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

    iput-wide p2, p0, Lc7/q8;->h:J

    iput-object p1, p0, Lc7/q8;->i:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lc7/q8;->i:Lc7/w7;

    iget-wide v1, p0, Lc7/q8;->h:J

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lc7/w7;->z(JZ)V

    iget-object v0, p0, Lc7/q8;->i:Lc7/w7;

    invoke-virtual {v0}, Lc7/f4;->o()Lc7/y9;

    move-result-object v0

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v0, v1}, Lc7/y9;->L(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method
