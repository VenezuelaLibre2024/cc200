.class public final Lc7/s9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Landroid/os/Bundle;

.field public final synthetic i:Lc7/q9;

.field public final synthetic j:Lc7/q9;

.field public final synthetic k:J

.field public final synthetic l:Lc7/p9;


# direct methods
.method public constructor <init>(Lc7/p9;Landroid/os/Bundle;Lc7/q9;Lc7/q9;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/s9;->h:Landroid/os/Bundle;

    iput-object p3, p0, Lc7/s9;->i:Lc7/q9;

    iput-object p4, p0, Lc7/s9;->j:Lc7/q9;

    iput-wide p5, p0, Lc7/s9;->k:J

    iput-object p1, p0, Lc7/s9;->l:Lc7/p9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lc7/s9;->l:Lc7/p9;

    iget-object v1, p0, Lc7/s9;->h:Landroid/os/Bundle;

    iget-object v2, p0, Lc7/s9;->i:Lc7/q9;

    iget-object v3, p0, Lc7/s9;->j:Lc7/q9;

    iget-wide v4, p0, Lc7/s9;->k:J

    invoke-static/range {v0 .. v5}, Lc7/p9;->E(Lc7/p9;Landroid/os/Bundle;Lc7/q9;Lc7/q9;J)V

    return-void
.end method
