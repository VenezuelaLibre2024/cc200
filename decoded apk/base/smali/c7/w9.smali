.class public final Lc7/w9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/q9;

.field public final synthetic i:J

.field public final synthetic j:Lc7/p9;


# direct methods
.method public constructor <init>(Lc7/p9;Lc7/q9;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/w9;->h:Lc7/q9;

    iput-wide p3, p0, Lc7/w9;->i:J

    iput-object p1, p0, Lc7/w9;->j:Lc7/p9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lc7/w9;->j:Lc7/p9;

    iget-object v1, p0, Lc7/w9;->h:Lc7/q9;

    iget-wide v2, p0, Lc7/w9;->i:J

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lc7/p9;->H(Lc7/p9;Lc7/q9;ZJ)V

    iget-object v0, p0, Lc7/w9;->j:Lc7/p9;

    const/4 v1, 0x0

    iput-object v1, v0, Lc7/p9;->e:Lc7/q9;

    invoke-virtual {v0}, Lc7/f4;->o()Lc7/y9;

    move-result-object v0

    invoke-virtual {v0, v1}, Lc7/y9;->C(Lc7/q9;)V

    return-void
.end method
