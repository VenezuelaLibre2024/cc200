.class public final Lwe/a$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lbf/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "f"
.end annotation


# instance fields
.field public final h:Lbf/i;

.field public i:Z

.field public final synthetic j:Lwe/a;


# direct methods
.method public constructor <init>(Lwe/a;)V
    .locals 1

    iput-object p1, p0, Lwe/a$f;->j:Lwe/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lbf/i;

    invoke-static {p1}, Lwe/a;->j(Lwe/a;)Lbf/d;

    move-result-object p1

    invoke-interface {p1}, Lbf/s;->c()Lbf/u;

    move-result-object p1

    invoke-direct {v0, p1}, Lbf/i;-><init>(Lbf/u;)V

    iput-object v0, p0, Lwe/a$f;->h:Lbf/i;

    return-void
.end method

.method public synthetic constructor <init>(Lwe/a;Lwe/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lwe/a$f;-><init>(Lwe/a;)V

    return-void
.end method


# virtual methods
.method public C0(Lbf/c;J)V
    .locals 7

    iget-boolean v0, p0, Lwe/a$f;->i:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lbf/c;->g0()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lse/e;->e(JJJ)V

    iget-object v0, p0, Lwe/a$f;->j:Lwe/a;

    invoke-static {v0}, Lwe/a;->j(Lwe/a;)Lbf/d;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lbf/s;->C0(Lbf/c;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()Lbf/u;
    .locals 1

    iget-object v0, p0, Lwe/a$f;->h:Lbf/i;

    return-object v0
.end method

.method public close()V
    .locals 2

    iget-boolean v0, p0, Lwe/a$f;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lwe/a$f;->i:Z

    iget-object v0, p0, Lwe/a$f;->j:Lwe/a;

    iget-object v1, p0, Lwe/a$f;->h:Lbf/i;

    invoke-static {v0, v1}, Lwe/a;->k(Lwe/a;Lbf/i;)V

    iget-object v0, p0, Lwe/a$f;->j:Lwe/a;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lwe/a;->m(Lwe/a;I)I

    return-void
.end method

.method public flush()V
    .locals 1

    iget-boolean v0, p0, Lwe/a$f;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lwe/a$f;->j:Lwe/a;

    invoke-static {v0}, Lwe/a;->j(Lwe/a;)Lbf/d;

    move-result-object v0

    invoke-interface {v0}, Lbf/d;->flush()V

    return-void
.end method