.class public final Lc7/s6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:J

.field public final synthetic l:Lc7/o6;


# direct methods
.method public constructor <init>(Lc7/o6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/s6;->h:Ljava/lang/String;

    iput-object p3, p0, Lc7/s6;->i:Ljava/lang/String;

    iput-object p4, p0, Lc7/s6;->j:Ljava/lang/String;

    iput-wide p5, p0, Lc7/s6;->k:J

    iput-object p1, p0, Lc7/s6;->l:Lc7/o6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lc7/s6;->h:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lc7/s6;->l:Lc7/o6;

    invoke-static {v0}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v0

    iget-object v1, p0, Lc7/s6;->i:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lc7/yb;->x(Ljava/lang/String;Lc7/q9;)V

    return-void

    :cond_0
    new-instance v1, Lc7/q9;

    iget-object v2, p0, Lc7/s6;->j:Ljava/lang/String;

    iget-wide v3, p0, Lc7/s6;->k:J

    invoke-direct {v1, v2, v0, v3, v4}, Lc7/q9;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    iget-object v0, p0, Lc7/s6;->l:Lc7/o6;

    invoke-static {v0}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v0

    iget-object v2, p0, Lc7/s6;->i:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lc7/yb;->x(Ljava/lang/String;Lc7/q9;)V

    return-void
.end method
