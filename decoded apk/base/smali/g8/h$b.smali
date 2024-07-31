.class public final Lg8/h$b;
.super Lg8/f0$e$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Long;

.field public e:Ljava/lang/Long;

.field public f:Ljava/lang/Boolean;

.field public g:Lg8/f0$e$a;

.field public h:Lg8/f0$e$f;

.field public i:Lg8/f0$e$e;

.field public j:Lg8/f0$e$c;

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg8/f0$e$d;",
            ">;"
        }
    .end annotation
.end field

.field public l:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lg8/f0$e$b;-><init>()V

    return-void
.end method

.method public constructor <init>(Lg8/f0$e;)V
    .locals 2

    invoke-direct {p0}, Lg8/f0$e$b;-><init>()V

    invoke-virtual {p1}, Lg8/f0$e;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lg8/h$b;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lg8/f0$e;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lg8/h$b;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lg8/f0$e;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lg8/h$b;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lg8/f0$e;->l()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lg8/h$b;->d:Ljava/lang/Long;

    invoke-virtual {p1}, Lg8/f0$e;->e()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lg8/h$b;->e:Ljava/lang/Long;

    invoke-virtual {p1}, Lg8/f0$e;->n()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lg8/h$b;->f:Ljava/lang/Boolean;

    invoke-virtual {p1}, Lg8/f0$e;->b()Lg8/f0$e$a;

    move-result-object v0

    iput-object v0, p0, Lg8/h$b;->g:Lg8/f0$e$a;

    invoke-virtual {p1}, Lg8/f0$e;->m()Lg8/f0$e$f;

    move-result-object v0

    iput-object v0, p0, Lg8/h$b;->h:Lg8/f0$e$f;

    invoke-virtual {p1}, Lg8/f0$e;->k()Lg8/f0$e$e;

    move-result-object v0

    iput-object v0, p0, Lg8/h$b;->i:Lg8/f0$e$e;

    invoke-virtual {p1}, Lg8/f0$e;->d()Lg8/f0$e$c;

    move-result-object v0

    iput-object v0, p0, Lg8/h$b;->j:Lg8/f0$e$c;

    invoke-virtual {p1}, Lg8/f0$e;->f()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lg8/h$b;->k:Ljava/util/List;

    invoke-virtual {p1}, Lg8/f0$e;->h()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lg8/h$b;->l:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lg8/f0$e;Lg8/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lg8/h$b;-><init>(Lg8/f0$e;)V

    return-void
.end method


# virtual methods
.method public a()Lg8/f0$e;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lg8/h$b;->a:Ljava/lang/String;

    const-string v2, ""

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " generator"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_0
    iget-object v1, v0, Lg8/h$b;->b:Ljava/lang/String;

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " identifier"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    iget-object v1, v0, Lg8/h$b;->d:Ljava/lang/Long;

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " startedAt"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    iget-object v1, v0, Lg8/h$b;->f:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " crashed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_3
    iget-object v1, v0, Lg8/h$b;->g:Lg8/f0$e$a;

    if-nez v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " app"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_4
    iget-object v1, v0, Lg8/h$b;->l:Ljava/lang/Integer;

    if-nez v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " generatorType"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Lg8/h;

    iget-object v4, v0, Lg8/h$b;->a:Ljava/lang/String;

    iget-object v5, v0, Lg8/h$b;->b:Ljava/lang/String;

    iget-object v6, v0, Lg8/h$b;->c:Ljava/lang/String;

    iget-object v2, v0, Lg8/h$b;->d:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    iget-object v9, v0, Lg8/h$b;->e:Ljava/lang/Long;

    iget-object v2, v0, Lg8/h$b;->f:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    iget-object v11, v0, Lg8/h$b;->g:Lg8/f0$e$a;

    iget-object v12, v0, Lg8/h$b;->h:Lg8/f0$e$f;

    iget-object v13, v0, Lg8/h$b;->i:Lg8/f0$e$e;

    iget-object v14, v0, Lg8/h$b;->j:Lg8/f0$e$c;

    iget-object v15, v0, Lg8/h$b;->k:Ljava/util/List;

    iget-object v2, v0, Lg8/h$b;->l:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v16

    const/16 v17, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v17}, Lg8/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLg8/f0$e$a;Lg8/f0$e$f;Lg8/f0$e$e;Lg8/f0$e$c;Ljava/util/List;ILg8/h$a;)V

    return-object v1

    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Missing required properties:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b(Lg8/f0$e$a;)Lg8/f0$e$b;
    .locals 1

    const-string v0, "Null app"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lg8/h$b;->g:Lg8/f0$e$a;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lg8/f0$e$b;
    .locals 0

    iput-object p1, p0, Lg8/h$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public d(Z)Lg8/f0$e$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lg8/h$b;->f:Ljava/lang/Boolean;

    return-object p0
.end method

.method public e(Lg8/f0$e$c;)Lg8/f0$e$b;
    .locals 0

    iput-object p1, p0, Lg8/h$b;->j:Lg8/f0$e$c;

    return-object p0
.end method

.method public f(Ljava/lang/Long;)Lg8/f0$e$b;
    .locals 0

    iput-object p1, p0, Lg8/h$b;->e:Ljava/lang/Long;

    return-object p0
.end method

.method public g(Ljava/util/List;)Lg8/f0$e$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg8/f0$e$d;",
            ">;)",
            "Lg8/f0$e$b;"
        }
    .end annotation

    iput-object p1, p0, Lg8/h$b;->k:Ljava/util/List;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lg8/f0$e$b;
    .locals 1

    const-string v0, "Null generator"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lg8/h$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public i(I)Lg8/f0$e$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lg8/h$b;->l:Ljava/lang/Integer;

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lg8/f0$e$b;
    .locals 1

    const-string v0, "Null identifier"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lg8/h$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public l(Lg8/f0$e$e;)Lg8/f0$e$b;
    .locals 0

    iput-object p1, p0, Lg8/h$b;->i:Lg8/f0$e$e;

    return-object p0
.end method

.method public m(J)Lg8/f0$e$b;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lg8/h$b;->d:Ljava/lang/Long;

    return-object p0
.end method

.method public n(Lg8/f0$e$f;)Lg8/f0$e$b;
    .locals 0

    iput-object p1, p0, Lg8/h$b;->h:Lg8/f0$e$f;

    return-object p0
.end method
