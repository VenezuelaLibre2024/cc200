.class public abstract Lv0/y$a;
.super Lv0/a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lv0/y<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lv0/y$a<",
        "TMessageType;TBuilderType;>;>",
        "Lv0/a$a<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final h:Lv0/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public i:Lv0/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public j:Z


# direct methods
.method public constructor <init>(Lv0/y;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lv0/a$a;-><init>()V

    iput-object p1, p0, Lv0/y$a;->h:Lv0/y;

    sget-object v0, Lv0/y$f;->k:Lv0/y$f;

    invoke-virtual {p1, v0}, Lv0/y;->u(Lv0/y$f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv0/y;

    iput-object p1, p0, Lv0/y$a;->i:Lv0/y;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lv0/y$a;->j:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic E()Lv0/r0;
    .locals 1

    invoke-virtual {p0}, Lv0/y$a;->r()Lv0/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()Lv0/r0;
    .locals 1

    invoke-virtual {p0}, Lv0/y$a;->q()Lv0/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Lv0/r0;
    .locals 1

    invoke-virtual {p0}, Lv0/y$a;->u()Lv0/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lv0/y$a;->s()Lv0/y$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n(Lv0/a;)Lv0/a$a;
    .locals 0

    check-cast p1, Lv0/y;

    invoke-virtual {p0, p1}, Lv0/y$a;->v(Lv0/y;)Lv0/y$a;

    move-result-object p1

    return-object p1
.end method

.method public final q()Lv0/y;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lv0/y$a;->r()Lv0/y;

    move-result-object v0

    invoke-virtual {v0}, Lv0/y;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lv0/a$a;->p(Lv0/r0;)Lv0/m1;

    move-result-object v0

    throw v0
.end method

.method public r()Lv0/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-boolean v0, p0, Lv0/y$a;->j:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv0/y$a;->i:Lv0/y;

    return-object v0

    :cond_0
    iget-object v0, p0, Lv0/y$a;->i:Lv0/y;

    invoke-virtual {v0}, Lv0/y;->C()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv0/y$a;->j:Z

    iget-object v0, p0, Lv0/y$a;->i:Lv0/y;

    return-object v0
.end method

.method public s()Lv0/y$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Lv0/y$a;->u()Lv0/y;

    move-result-object v0

    invoke-virtual {v0}, Lv0/y;->F()Lv0/y$a;

    move-result-object v0

    invoke-virtual {p0}, Lv0/y$a;->r()Lv0/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lv0/y$a;->w(Lv0/y;)Lv0/y$a;

    return-object v0
.end method

.method public t()V
    .locals 2

    iget-boolean v0, p0, Lv0/y$a;->j:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv0/y$a;->i:Lv0/y;

    sget-object v1, Lv0/y$f;->k:Lv0/y$f;

    invoke-virtual {v0, v1}, Lv0/y;->u(Lv0/y$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/y;

    iget-object v1, p0, Lv0/y$a;->i:Lv0/y;

    invoke-virtual {p0, v0, v1}, Lv0/y$a;->x(Lv0/y;Lv0/y;)V

    iput-object v0, p0, Lv0/y$a;->i:Lv0/y;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lv0/y$a;->j:Z

    :cond_0
    return-void
.end method

.method public u()Lv0/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lv0/y$a;->h:Lv0/y;

    return-object v0
.end method

.method public v(Lv0/y;)Lv0/y$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lv0/y$a;->w(Lv0/y;)Lv0/y$a;

    move-result-object p1

    return-object p1
.end method

.method public w(Lv0/y;)Lv0/y$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Lv0/y$a;->t()V

    iget-object v0, p0, Lv0/y$a;->i:Lv0/y;

    invoke-virtual {p0, v0, p1}, Lv0/y$a;->x(Lv0/y;Lv0/y;)V

    return-object p0
.end method

.method public final x(Lv0/y;Lv0/y;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;TMessageType;)V"
        }
    .end annotation

    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lv0/c1;->e(Ljava/lang/Object;)Lv0/g1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lv0/g1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
