.class public Ly4/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt4/a<",
        "Ly4/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:Z

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:J

.field public final i:Ly4/o;

.field public final j:Ly4/l;

.field public final k:Landroid/net/Uri;

.field public final l:Ly4/h;

.field public final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly4/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JJJZJJJJLy4/h;Ly4/o;Ly4/l;Landroid/net/Uri;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJZJJJJ",
            "Ly4/h;",
            "Ly4/o;",
            "Ly4/l;",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Ly4/g;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, Ly4/c;->a:J

    move-wide v1, p3

    iput-wide v1, v0, Ly4/c;->b:J

    move-wide v1, p5

    iput-wide v1, v0, Ly4/c;->c:J

    move v1, p7

    iput-boolean v1, v0, Ly4/c;->d:Z

    move-wide v1, p8

    iput-wide v1, v0, Ly4/c;->e:J

    move-wide v1, p10

    iput-wide v1, v0, Ly4/c;->f:J

    move-wide v1, p12

    iput-wide v1, v0, Ly4/c;->g:J

    move-wide/from16 v1, p14

    iput-wide v1, v0, Ly4/c;->h:J

    move-object/from16 v1, p16

    iput-object v1, v0, Ly4/c;->l:Ly4/h;

    move-object/from16 v1, p17

    iput-object v1, v0, Ly4/c;->i:Ly4/o;

    move-object/from16 v1, p19

    iput-object v1, v0, Ly4/c;->k:Landroid/net/Uri;

    move-object/from16 v1, p18

    iput-object v1, v0, Ly4/c;->j:Ly4/l;

    if-nez p20, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object/from16 v1, p20

    :goto_0
    iput-object v1, v0, Ly4/c;->m:Ljava/util/List;

    return-void
.end method

.method public static c(Ljava/util/List;Ljava/util/LinkedList;)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly4/a;",
            ">;",
            "Ljava/util/LinkedList<",
            "Lt4/c;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Ly4/a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt4/c;

    iget v1, v0, Lt4/c;->h:I

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iget v3, v0, Lt4/c;->i:I

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly4/a;

    iget-object v5, v4, Ly4/a;->c:Ljava/util/List;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    iget v0, v0, Lt4/c;->j:I

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly4/j;

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt4/c;

    iget v6, v0, Lt4/c;->h:I

    if-ne v6, v1, :cond_2

    iget v6, v0, Lt4/c;->i:I

    if-eq v6, v3, :cond_1

    :cond_2
    new-instance v3, Ly4/a;

    iget v7, v4, Ly4/a;->a:I

    iget v8, v4, Ly4/a;->b:I

    iget-object v10, v4, Ly4/a;->d:Ljava/util/List;

    iget-object v11, v4, Ly4/a;->e:Ljava/util/List;

    iget-object v12, v4, Ly4/a;->f:Ljava/util/List;

    move-object v6, v3

    invoke-direct/range {v6 .. v12}, Ly4/a;-><init>(IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v3, v0, Lt4/c;->h:I

    if-eq v3, v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    return-object v2
.end method


# virtual methods
.method public bridge synthetic a(Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ly4/c;->b(Ljava/util/List;)Ly4/c;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;)Ly4/c;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lt4/c;",
            ">;)",
            "Ly4/c;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/LinkedList;

    move-object/from16 v2, p1

    invoke-direct {v1, v2}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    new-instance v2, Lt4/c;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3, v3}, Lt4/c;-><init>(III)V

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Ly4/c;->e()I

    move-result v6

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v5, v6, :cond_2

    invoke-virtual {v1}, Ljava/util/LinkedList;->peek()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt4/c;

    iget v6, v6, Lt4/c;->h:I

    if-eq v6, v5, :cond_0

    invoke-virtual {v0, v5}, Ly4/c;->f(I)J

    move-result-wide v9

    cmp-long v6, v9, v7

    if-eqz v6, :cond_1

    add-long/2addr v3, v9

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v5}, Ly4/c;->d(I)Ly4/g;

    move-result-object v6

    iget-object v7, v6, Ly4/g;->c:Ljava/util/List;

    invoke-static {v7, v1}, Ly4/c;->c(Ljava/util/List;Ljava/util/LinkedList;)Ljava/util/ArrayList;

    move-result-object v12

    new-instance v7, Ly4/g;

    iget-object v9, v6, Ly4/g;->a:Ljava/lang/String;

    iget-wide v10, v6, Ly4/g;->b:J

    sub-long/2addr v10, v3

    iget-object v13, v6, Ly4/g;->d:Ljava/util/List;

    move-object v8, v7

    invoke-direct/range {v8 .. v13}, Ly4/g;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    iget-wide v5, v0, Ly4/c;->b:J

    cmp-long v1, v5, v7

    if-eqz v1, :cond_3

    sub-long/2addr v5, v3

    move-wide v7, v5

    :cond_3
    new-instance v1, Ly4/c;

    move-object v4, v1

    iget-wide v5, v0, Ly4/c;->a:J

    iget-wide v9, v0, Ly4/c;->c:J

    iget-boolean v11, v0, Ly4/c;->d:Z

    iget-wide v12, v0, Ly4/c;->e:J

    iget-wide v14, v0, Ly4/c;->f:J

    move-object/from16 p1, v4

    iget-wide v3, v0, Ly4/c;->g:J

    move-wide/from16 v16, v3

    iget-wide v3, v0, Ly4/c;->h:J

    move-wide/from16 v18, v3

    iget-object v3, v0, Ly4/c;->l:Ly4/h;

    move-object/from16 v20, v3

    iget-object v3, v0, Ly4/c;->i:Ly4/o;

    move-object/from16 v21, v3

    iget-object v3, v0, Ly4/c;->j:Ly4/l;

    move-object/from16 v22, v3

    iget-object v3, v0, Ly4/c;->k:Landroid/net/Uri;

    move-object/from16 v23, v3

    move-object/from16 v24, v2

    move-object/from16 v4, p1

    invoke-direct/range {v4 .. v24}, Ly4/c;-><init>(JJJZJJJJLy4/h;Ly4/o;Ly4/l;Landroid/net/Uri;Ljava/util/List;)V

    return-object v1
.end method

.method public final d(I)Ly4/g;
    .locals 1

    iget-object v0, p0, Ly4/c;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly4/g;

    return-object p1
.end method

.method public final e()I
    .locals 1

    iget-object v0, p0, Ly4/c;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final f(I)J
    .locals 5

    iget-object v0, p0, Ly4/c;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-ne p1, v0, :cond_1

    iget-wide v3, p0, Ly4/c;->b:J

    cmp-long v0, v3, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ly4/c;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly4/g;

    iget-wide v0, p1, Ly4/g;->b:J

    sub-long v1, v3, v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ly4/c;->m:Ljava/util/List;

    add-int/lit8 v1, p1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly4/g;

    iget-wide v0, v0, Ly4/g;->b:J

    iget-object v2, p0, Ly4/c;->m:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly4/g;

    iget-wide v2, p1, Ly4/g;->b:J

    sub-long v1, v0, v2

    :goto_0
    return-wide v1
.end method

.method public final g(I)J
    .locals 2

    invoke-virtual {p0, p1}, Ly4/c;->f(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lp5/n0;->B0(J)J

    move-result-wide v0

    return-wide v0
.end method
