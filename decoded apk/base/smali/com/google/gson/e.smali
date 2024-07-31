.class public final Lcom/google/gson/e;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/google/gson/internal/Excluder;

.field public b:Lcom/google/gson/s;

.field public c:Lcom/google/gson/d;

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Lcom/google/gson/f<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/gson/v;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/gson/v;",
            ">;"
        }
    .end annotation
.end field

.field public g:Z

.field public h:Ljava/lang/String;

.field public i:I

.field public j:I

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Lcom/google/gson/u;

.field public r:Lcom/google/gson/u;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/gson/internal/Excluder;->n:Lcom/google/gson/internal/Excluder;

    iput-object v0, p0, Lcom/google/gson/e;->a:Lcom/google/gson/internal/Excluder;

    sget-object v0, Lcom/google/gson/s;->h:Lcom/google/gson/s;

    iput-object v0, p0, Lcom/google/gson/e;->b:Lcom/google/gson/s;

    sget-object v0, Lcom/google/gson/c;->h:Lcom/google/gson/c;

    iput-object v0, p0, Lcom/google/gson/e;->c:Lcom/google/gson/d;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/gson/e;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/gson/e;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/gson/e;->f:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/gson/e;->g:Z

    const/4 v1, 0x2

    iput v1, p0, Lcom/google/gson/e;->i:I

    iput v1, p0, Lcom/google/gson/e;->j:I

    iput-boolean v0, p0, Lcom/google/gson/e;->k:Z

    iput-boolean v0, p0, Lcom/google/gson/e;->l:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/gson/e;->m:Z

    iput-boolean v0, p0, Lcom/google/gson/e;->n:Z

    iput-boolean v0, p0, Lcom/google/gson/e;->o:Z

    iput-boolean v0, p0, Lcom/google/gson/e;->p:Z

    sget-object v0, Lcom/google/gson/t;->h:Lcom/google/gson/t;

    iput-object v0, p0, Lcom/google/gson/e;->q:Lcom/google/gson/u;

    sget-object v0, Lcom/google/gson/t;->i:Lcom/google/gson/t;

    iput-object v0, p0, Lcom/google/gson/e;->r:Lcom/google/gson/u;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;IILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lcom/google/gson/v;",
            ">;)V"
        }
    .end annotation

    sget-boolean v0, Lcom/google/gson/internal/sql/a;->a:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object p2, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;->b:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;

    invoke-virtual {p2, p1}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;->b(Ljava/lang/String;)Lcom/google/gson/v;

    move-result-object p2

    if-eqz v0, :cond_0

    sget-object p3, Lcom/google/gson/internal/sql/a;->c:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;

    invoke-virtual {p3, p1}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;->b(Ljava/lang/String;)Lcom/google/gson/v;

    move-result-object v1

    sget-object p3, Lcom/google/gson/internal/sql/a;->b:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;

    invoke-virtual {p3, p1}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;->b(Ljava/lang/String;)Lcom/google/gson/v;

    move-result-object p1

    goto :goto_1

    :cond_0
    :goto_0
    move-object p1, v1

    goto :goto_1

    :cond_1
    const/4 p1, 0x2

    if-eq p2, p1, :cond_3

    if-eq p3, p1, :cond_3

    sget-object p1, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;->b:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;

    invoke-virtual {p1, p2, p3}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;->a(II)Lcom/google/gson/v;

    move-result-object p1

    if-eqz v0, :cond_2

    sget-object v1, Lcom/google/gson/internal/sql/a;->c:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;

    invoke-virtual {v1, p2, p3}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;->a(II)Lcom/google/gson/v;

    move-result-object v1

    sget-object v2, Lcom/google/gson/internal/sql/a;->b:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;

    invoke-virtual {v2, p2, p3}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$b;->a(II)Lcom/google/gson/v;

    move-result-object p2

    move-object v3, p2

    move-object p2, p1

    move-object p1, v3

    goto :goto_1

    :cond_2
    move-object p2, p1

    goto :goto_0

    :goto_1
    invoke-interface {p4, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_3

    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method

.method public b()Lcom/google/gson/Gson;
    .locals 23

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v18, v1

    iget-object v2, v0, Lcom/google/gson/e;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, v0, Lcom/google/gson/e;->f:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, v0, Lcom/google/gson/e;->e:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v0, Lcom/google/gson/e;->f:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v2, v0, Lcom/google/gson/e;->h:Ljava/lang/String;

    iget v3, v0, Lcom/google/gson/e;->i:I

    iget v4, v0, Lcom/google/gson/e;->j:I

    invoke-virtual {v0, v2, v3, v4, v1}, Lcom/google/gson/e;->a(Ljava/lang/String;IILjava/util/List;)V

    new-instance v21, Lcom/google/gson/Gson;

    move-object/from16 v1, v21

    iget-object v2, v0, Lcom/google/gson/e;->a:Lcom/google/gson/internal/Excluder;

    iget-object v3, v0, Lcom/google/gson/e;->c:Lcom/google/gson/d;

    iget-object v4, v0, Lcom/google/gson/e;->d:Ljava/util/Map;

    iget-boolean v5, v0, Lcom/google/gson/e;->g:Z

    iget-boolean v6, v0, Lcom/google/gson/e;->k:Z

    iget-boolean v7, v0, Lcom/google/gson/e;->o:Z

    iget-boolean v8, v0, Lcom/google/gson/e;->m:Z

    iget-boolean v9, v0, Lcom/google/gson/e;->n:Z

    iget-boolean v10, v0, Lcom/google/gson/e;->p:Z

    iget-boolean v11, v0, Lcom/google/gson/e;->l:Z

    iget-object v12, v0, Lcom/google/gson/e;->b:Lcom/google/gson/s;

    iget-object v13, v0, Lcom/google/gson/e;->h:Ljava/lang/String;

    iget v14, v0, Lcom/google/gson/e;->i:I

    iget v15, v0, Lcom/google/gson/e;->j:I

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/google/gson/e;->e:Ljava/util/List;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/google/gson/e;->f:Ljava/util/List;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/google/gson/e;->q:Lcom/google/gson/u;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/google/gson/e;->r:Lcom/google/gson/u;

    move-object/from16 v20, v1

    move-object/from16 v1, v22

    invoke-direct/range {v1 .. v20}, Lcom/google/gson/Gson;-><init>(Lcom/google/gson/internal/Excluder;Lcom/google/gson/d;Ljava/util/Map;ZZZZZZZLcom/google/gson/s;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/gson/u;Lcom/google/gson/u;)V

    return-object v21
.end method

.method public c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/e;
    .locals 3

    instance-of v0, p2, Lcom/google/gson/q;

    if-nez v0, :cond_1

    instance-of v1, p2, Lcom/google/gson/i;

    if-nez v1, :cond_1

    instance-of v1, p2, Lcom/google/gson/f;

    if-nez v1, :cond_1

    instance-of v1, p2, Lcom/google/gson/TypeAdapter;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lcom/google/gson/internal/a;->a(Z)V

    instance-of v1, p2, Lcom/google/gson/f;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/gson/e;->d:Ljava/util/Map;

    move-object v2, p2

    check-cast v2, Lcom/google/gson/f;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-nez v0, :cond_3

    instance-of v0, p2, Lcom/google/gson/i;

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {p1}, Lx9/a;->get(Ljava/lang/reflect/Type;)Lx9/a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/gson/e;->e:Ljava/util/List;

    invoke-static {v0, p2}, Lcom/google/gson/internal/bind/TreeTypeAdapter;->b(Lx9/a;Ljava/lang/Object;)Lcom/google/gson/v;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    instance-of v0, p2, Lcom/google/gson/TypeAdapter;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/gson/e;->e:Ljava/util/List;

    invoke-static {p1}, Lx9/a;->get(Ljava/lang/reflect/Type;)Lx9/a;

    move-result-object p1

    check-cast p2, Lcom/google/gson/TypeAdapter;

    invoke-static {p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters;->c(Lx9/a;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/v;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object p0
.end method

.method public d(Lcom/google/gson/v;)Lcom/google/gson/e;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/e;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
