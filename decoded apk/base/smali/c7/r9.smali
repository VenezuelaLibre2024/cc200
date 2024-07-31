.class public final Lc7/r9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/q9;

.field public final synthetic i:Lc7/q9;

.field public final synthetic j:J

.field public final synthetic k:Z

.field public final synthetic l:Lc7/p9;


# direct methods
.method public constructor <init>(Lc7/p9;Lc7/q9;Lc7/q9;JZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/r9;->h:Lc7/q9;

    iput-object p3, p0, Lc7/r9;->i:Lc7/q9;

    iput-wide p4, p0, Lc7/r9;->j:J

    iput-boolean p6, p0, Lc7/r9;->k:Z

    iput-object p1, p0, Lc7/r9;->l:Lc7/p9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lc7/r9;->l:Lc7/p9;

    iget-object v1, p0, Lc7/r9;->h:Lc7/q9;

    iget-object v2, p0, Lc7/r9;->i:Lc7/q9;

    iget-wide v3, p0, Lc7/r9;->j:J

    iget-boolean v5, p0, Lc7/r9;->k:Z

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lc7/p9;->G(Lc7/p9;Lc7/q9;Lc7/q9;JZLandroid/os/Bundle;)V

    return-void
.end method
