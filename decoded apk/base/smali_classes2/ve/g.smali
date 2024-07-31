.class public final Lve/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lre/w$a;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lre/w;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lue/k;

.field public final c:Lue/c;

.field public final d:I

.field public final e:Lre/b0;

.field public final f:Lre/e;

.field public final g:I

.field public final h:I

.field public final i:I

.field public j:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lue/k;Lue/c;ILre/b0;Lre/e;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lre/w;",
            ">;",
            "Lue/k;",
            "Lue/c;",
            "I",
            "Lre/b0;",
            "Lre/e;",
            "III)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lve/g;->a:Ljava/util/List;

    iput-object p2, p0, Lve/g;->b:Lue/k;

    iput-object p3, p0, Lve/g;->c:Lue/c;

    iput p4, p0, Lve/g;->d:I

    iput-object p5, p0, Lve/g;->e:Lre/b0;

    iput-object p6, p0, Lve/g;->f:Lre/e;

    iput p7, p0, Lve/g;->g:I

    iput p8, p0, Lve/g;->h:I

    iput p9, p0, Lve/g;->i:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lve/g;->h:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lve/g;->i:I

    return v0
.end method

.method public c(Lre/b0;)Lre/d0;
    .locals 2

    iget-object v0, p0, Lve/g;->b:Lue/k;

    iget-object v1, p0, Lve/g;->c:Lue/c;

    invoke-virtual {p0, p1, v0, v1}, Lve/g;->g(Lre/b0;Lue/k;Lue/c;)Lre/d0;

    move-result-object p1

    return-object p1
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lve/g;->g:I

    return v0
.end method

.method public e()Lre/b0;
    .locals 1

    iget-object v0, p0, Lve/g;->e:Lre/b0;

    return-object v0
.end method

.method public f()Lue/c;
    .locals 1

    iget-object v0, p0, Lve/g;->c:Lue/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public g(Lre/b0;Lue/k;Lue/c;)Lre/d0;
    .locals 15

    move-object v0, p0

    iget v1, v0, Lve/g;->d:I

    iget-object v2, v0, Lve/g;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_8

    iget v1, v0, Lve/g;->j:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Lve/g;->j:I

    iget-object v1, v0, Lve/g;->c:Lue/c;

    const-string v3, "network interceptor "

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lue/c;->c()Lue/e;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lre/b0;->h()Lre/v;

    move-result-object v4

    invoke-virtual {v1, v4}, Lue/e;->u(Lre/v;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lve/g;->a:Ljava/util/List;

    iget v5, v0, Lve/g;->d:I

    sub-int/2addr v5, v2

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " must retain the same host and port"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v1, v0, Lve/g;->c:Lue/c;

    const-string v4, " must call proceed() exactly once"

    if-eqz v1, :cond_3

    iget v1, v0, Lve/g;->j:I

    if-gt v1, v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lve/g;->a:Ljava/util/List;

    iget v6, v0, Lve/g;->d:I

    sub-int/2addr v6, v2

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_1
    new-instance v1, Lve/g;

    iget-object v6, v0, Lve/g;->a:Ljava/util/List;

    iget v5, v0, Lve/g;->d:I

    add-int/lit8 v9, v5, 0x1

    iget-object v11, v0, Lve/g;->f:Lre/e;

    iget v12, v0, Lve/g;->g:I

    iget v13, v0, Lve/g;->h:I

    iget v14, v0, Lve/g;->i:I

    move-object v5, v1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v10, p1

    invoke-direct/range {v5 .. v14}, Lve/g;-><init>(Ljava/util/List;Lue/k;Lue/c;ILre/b0;Lre/e;III)V

    iget-object v5, v0, Lve/g;->a:Ljava/util/List;

    iget v6, v0, Lve/g;->d:I

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lre/w;

    invoke-interface {v5, v1}, Lre/w;->a(Lre/w$a;)Lre/d0;

    move-result-object v6

    if-eqz p3, :cond_5

    iget v7, v0, Lve/g;->d:I

    add-int/2addr v7, v2

    iget-object v8, v0, Lve/g;->a:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_5

    iget v1, v1, Lve/g;->j:I

    if-ne v1, v2, :cond_4

    goto :goto_2

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    :goto_2
    const-string v1, "interceptor "

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lre/d0;->a()Lre/e0;

    move-result-object v2

    if-eqz v2, :cond_6

    return-object v6

    :cond_6
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " returned a response with no body"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_7
    new-instance v2, Ljava/lang/NullPointerException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " returned null"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_8
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1
.end method

.method public h()Lue/k;
    .locals 1

    iget-object v0, p0, Lve/g;->b:Lue/k;

    return-object v0
.end method
