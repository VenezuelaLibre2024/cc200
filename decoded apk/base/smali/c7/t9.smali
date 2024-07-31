.class public final Lc7/t9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:J

.field public final synthetic i:Lc7/p9;


# direct methods
.method public constructor <init>(Lc7/p9;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-wide p2, p0, Lc7/t9;->h:J

    iput-object p1, p0, Lc7/t9;->i:Lc7/p9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/t9;->i:Lc7/p9;

    invoke-virtual {v0}, Lc7/f4;->j()Lc7/b0;

    move-result-object v0

    iget-wide v1, p0, Lc7/t9;->h:J

    invoke-virtual {v0, v1, v2}, Lc7/b0;->q(J)V

    iget-object v0, p0, Lc7/t9;->i:Lc7/p9;

    const/4 v1, 0x0

    iput-object v1, v0, Lc7/p9;->e:Lc7/q9;

    return-void
.end method
