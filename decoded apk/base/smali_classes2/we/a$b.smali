.class public abstract Lwe/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lbf/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "b"
.end annotation


# instance fields
.field public final h:Lbf/i;

.field public i:Z

.field public final synthetic j:Lwe/a;


# direct methods
.method public constructor <init>(Lwe/a;)V
    .locals 1

    iput-object p1, p0, Lwe/a$b;->j:Lwe/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lbf/i;

    invoke-static {p1}, Lwe/a;->n(Lwe/a;)Lbf/e;

    move-result-object p1

    invoke-interface {p1}, Lbf/t;->c()Lbf/u;

    move-result-object p1

    invoke-direct {v0, p1}, Lbf/i;-><init>(Lbf/u;)V

    iput-object v0, p0, Lwe/a$b;->h:Lbf/i;

    return-void
.end method

.method public synthetic constructor <init>(Lwe/a;Lwe/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lwe/a$b;-><init>(Lwe/a;)V

    return-void
.end method


# virtual methods
.method public T(Lbf/c;J)J
    .locals 1

    :try_start_0
    iget-object v0, p0, Lwe/a$b;->j:Lwe/a;

    invoke-static {v0}, Lwe/a;->n(Lwe/a;)Lbf/e;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lbf/t;->T(Lbf/c;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lwe/a$b;->j:Lwe/a;

    invoke-static {p2}, Lwe/a;->o(Lwe/a;)Lue/e;

    move-result-object p2

    invoke-virtual {p2}, Lue/e;->p()V

    invoke-virtual {p0}, Lwe/a$b;->a()V

    throw p1
.end method

.method public final a()V
    .locals 3

    iget-object v0, p0, Lwe/a$b;->j:Lwe/a;

    invoke-static {v0}, Lwe/a;->l(Lwe/a;)I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lwe/a$b;->j:Lwe/a;

    invoke-static {v0}, Lwe/a;->l(Lwe/a;)I

    move-result v0

    const/4 v2, 0x5

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lwe/a$b;->j:Lwe/a;

    iget-object v2, p0, Lwe/a$b;->h:Lbf/i;

    invoke-static {v0, v2}, Lwe/a;->k(Lwe/a;Lbf/i;)V

    iget-object v0, p0, Lwe/a$b;->j:Lwe/a;

    invoke-static {v0, v1}, Lwe/a;->m(Lwe/a;I)I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lwe/a$b;->j:Lwe/a;

    invoke-static {v2}, Lwe/a;->l(Lwe/a;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()Lbf/u;
    .locals 1

    iget-object v0, p0, Lwe/a$b;->h:Lbf/i;

    return-object v0
.end method
