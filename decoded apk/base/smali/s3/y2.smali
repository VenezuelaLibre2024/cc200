.class public final Ls3/y2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final s:Lu4/t$b;


# instance fields
.field public final a:Ls3/u3;

.field public final b:Lu4/t$b;

.field public final c:J

.field public final d:J

.field public final e:I

.field public final f:Ls3/q;

.field public final g:Z

.field public final h:Lu4/u0;

.field public final i:Ln5/c0;

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk4/a;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Lu4/t$b;

.field public final l:Z

.field public final m:I

.field public final n:Ls3/a3;

.field public final o:Z

.field public volatile p:J

.field public volatile q:J

.field public volatile r:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu4/t$b;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Lu4/t$b;-><init>(Ljava/lang/Object;)V

    sput-object v0, Ls3/y2;->s:Lu4/t$b;

    return-void
.end method

.method public constructor <init>(Ls3/u3;Lu4/t$b;JJILs3/q;ZLu4/u0;Ln5/c0;Ljava/util/List;Lu4/t$b;ZILs3/a3;JJJZ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/u3;",
            "Lu4/t$b;",
            "JJI",
            "Ls3/q;",
            "Z",
            "Lu4/u0;",
            "Ln5/c0;",
            "Ljava/util/List<",
            "Lk4/a;",
            ">;",
            "Lu4/t$b;",
            "ZI",
            "Ls3/a3;",
            "JJJZ)V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Ls3/y2;->a:Ls3/u3;

    move-object v1, p2

    iput-object v1, v0, Ls3/y2;->b:Lu4/t$b;

    move-wide v1, p3

    iput-wide v1, v0, Ls3/y2;->c:J

    move-wide v1, p5

    iput-wide v1, v0, Ls3/y2;->d:J

    move v1, p7

    iput v1, v0, Ls3/y2;->e:I

    move-object v1, p8

    iput-object v1, v0, Ls3/y2;->f:Ls3/q;

    move v1, p9

    iput-boolean v1, v0, Ls3/y2;->g:Z

    move-object v1, p10

    iput-object v1, v0, Ls3/y2;->h:Lu4/u0;

    move-object v1, p11

    iput-object v1, v0, Ls3/y2;->i:Ln5/c0;

    move-object v1, p12

    iput-object v1, v0, Ls3/y2;->j:Ljava/util/List;

    move-object/from16 v1, p13

    iput-object v1, v0, Ls3/y2;->k:Lu4/t$b;

    move/from16 v1, p14

    iput-boolean v1, v0, Ls3/y2;->l:Z

    move/from16 v1, p15

    iput v1, v0, Ls3/y2;->m:I

    move-object/from16 v1, p16

    iput-object v1, v0, Ls3/y2;->n:Ls3/a3;

    move-wide/from16 v1, p17

    iput-wide v1, v0, Ls3/y2;->p:J

    move-wide/from16 v1, p19

    iput-wide v1, v0, Ls3/y2;->q:J

    move-wide/from16 v1, p21

    iput-wide v1, v0, Ls3/y2;->r:J

    move/from16 v1, p23

    iput-boolean v1, v0, Ls3/y2;->o:Z

    return-void
.end method

.method public static j(Ln5/c0;)Ls3/y2;
    .locals 25

    move-object/from16 v11, p0

    new-instance v24, Ls3/y2;

    move-object/from16 v0, v24

    sget-object v1, Ls3/u3;->h:Ls3/u3;

    sget-object v13, Ls3/y2;->s:Lu4/t$b;

    move-object v2, v13

    sget-object v10, Lu4/u0;->k:Lu4/u0;

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v12

    sget-object v16, Ls3/a3;->k:Ls3/a3;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v0 .. v23}, Ls3/y2;-><init>(Ls3/u3;Lu4/t$b;JJILs3/q;ZLu4/u0;Ln5/c0;Ljava/util/List;Lu4/t$b;ZILs3/a3;JJJZ)V

    return-object v24
.end method

.method public static k()Lu4/t$b;
    .locals 1

    sget-object v0, Ls3/y2;->s:Lu4/t$b;

    return-object v0
.end method


# virtual methods
.method public a(Z)Ls3/y2;
    .locals 27

    move-object/from16 v0, p0

    move/from16 v10, p1

    new-instance v25, Ls3/y2;

    move-object/from16 v1, v25

    iget-object v2, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v3, v0, Ls3/y2;->b:Lu4/t$b;

    iget-wide v4, v0, Ls3/y2;->c:J

    iget-wide v6, v0, Ls3/y2;->d:J

    iget v8, v0, Ls3/y2;->e:I

    iget-object v9, v0, Ls3/y2;->f:Ls3/q;

    iget-object v11, v0, Ls3/y2;->h:Lu4/u0;

    iget-object v12, v0, Ls3/y2;->i:Ln5/c0;

    iget-object v13, v0, Ls3/y2;->j:Ljava/util/List;

    iget-object v14, v0, Ls3/y2;->k:Lu4/t$b;

    iget-boolean v15, v0, Ls3/y2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Ls3/y2;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Ls3/y2;->n:Ls3/a3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Ls3/y2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Ls3/y2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Ls3/y2;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Ls3/y2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Ls3/y2;-><init>(Ls3/u3;Lu4/t$b;JJILs3/q;ZLu4/u0;Ln5/c0;Ljava/util/List;Lu4/t$b;ZILs3/a3;JJJZ)V

    return-object v25
.end method

.method public b(Lu4/t$b;)Ls3/y2;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    new-instance v25, Ls3/y2;

    move-object/from16 v1, v25

    iget-object v2, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v3, v0, Ls3/y2;->b:Lu4/t$b;

    iget-wide v4, v0, Ls3/y2;->c:J

    iget-wide v6, v0, Ls3/y2;->d:J

    iget v8, v0, Ls3/y2;->e:I

    iget-object v9, v0, Ls3/y2;->f:Ls3/q;

    iget-boolean v10, v0, Ls3/y2;->g:Z

    iget-object v11, v0, Ls3/y2;->h:Lu4/u0;

    iget-object v12, v0, Ls3/y2;->i:Ln5/c0;

    iget-object v13, v0, Ls3/y2;->j:Ljava/util/List;

    iget-boolean v15, v0, Ls3/y2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Ls3/y2;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Ls3/y2;->n:Ls3/a3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Ls3/y2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Ls3/y2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Ls3/y2;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Ls3/y2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Ls3/y2;-><init>(Ls3/u3;Lu4/t$b;JJILs3/q;ZLu4/u0;Ln5/c0;Ljava/util/List;Lu4/t$b;ZILs3/a3;JJJZ)V

    return-object v25
.end method

.method public c(Lu4/t$b;JJJJLu4/u0;Ln5/c0;Ljava/util/List;)Ls3/y2;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu4/t$b;",
            "JJJJ",
            "Lu4/u0;",
            "Ln5/c0;",
            "Ljava/util/List<",
            "Lk4/a;",
            ">;)",
            "Ls3/y2;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-wide/from16 v22, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v20, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    new-instance v25, Ls3/y2;

    move-object/from16 v1, v25

    iget-object v2, v0, Ls3/y2;->a:Ls3/u3;

    iget v8, v0, Ls3/y2;->e:I

    iget-object v9, v0, Ls3/y2;->f:Ls3/q;

    iget-boolean v10, v0, Ls3/y2;->g:Z

    iget-object v14, v0, Ls3/y2;->k:Lu4/t$b;

    iget-boolean v15, v0, Ls3/y2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Ls3/y2;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Ls3/y2;->n:Ls3/a3;

    move-object/from16 v17, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Ls3/y2;->p:J

    move-wide/from16 v18, v1

    iget-boolean v1, v0, Ls3/y2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v24}, Ls3/y2;-><init>(Ls3/u3;Lu4/t$b;JJILs3/q;ZLu4/u0;Ln5/c0;Ljava/util/List;Lu4/t$b;ZILs3/a3;JJJZ)V

    return-object v25
.end method

.method public d(ZI)Ls3/y2;
    .locals 26

    move-object/from16 v0, p0

    move/from16 v15, p1

    move/from16 v16, p2

    new-instance v25, Ls3/y2;

    move-object/from16 v1, v25

    iget-object v2, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v3, v0, Ls3/y2;->b:Lu4/t$b;

    iget-wide v4, v0, Ls3/y2;->c:J

    iget-wide v6, v0, Ls3/y2;->d:J

    iget v8, v0, Ls3/y2;->e:I

    iget-object v9, v0, Ls3/y2;->f:Ls3/q;

    iget-boolean v10, v0, Ls3/y2;->g:Z

    iget-object v11, v0, Ls3/y2;->h:Lu4/u0;

    iget-object v12, v0, Ls3/y2;->i:Ln5/c0;

    iget-object v13, v0, Ls3/y2;->j:Ljava/util/List;

    iget-object v14, v0, Ls3/y2;->k:Lu4/t$b;

    move-object/from16 p1, v1

    iget-object v1, v0, Ls3/y2;->n:Ls3/a3;

    move-object/from16 v17, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Ls3/y2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Ls3/y2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Ls3/y2;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Ls3/y2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v24}, Ls3/y2;-><init>(Ls3/u3;Lu4/t$b;JJILs3/q;ZLu4/u0;Ln5/c0;Ljava/util/List;Lu4/t$b;ZILs3/a3;JJJZ)V

    return-object v25
.end method

.method public e(Ls3/q;)Ls3/y2;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    new-instance v25, Ls3/y2;

    move-object/from16 v1, v25

    iget-object v2, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v3, v0, Ls3/y2;->b:Lu4/t$b;

    iget-wide v4, v0, Ls3/y2;->c:J

    iget-wide v6, v0, Ls3/y2;->d:J

    iget v8, v0, Ls3/y2;->e:I

    iget-boolean v10, v0, Ls3/y2;->g:Z

    iget-object v11, v0, Ls3/y2;->h:Lu4/u0;

    iget-object v12, v0, Ls3/y2;->i:Ln5/c0;

    iget-object v13, v0, Ls3/y2;->j:Ljava/util/List;

    iget-object v14, v0, Ls3/y2;->k:Lu4/t$b;

    iget-boolean v15, v0, Ls3/y2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Ls3/y2;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Ls3/y2;->n:Ls3/a3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Ls3/y2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Ls3/y2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Ls3/y2;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Ls3/y2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Ls3/y2;-><init>(Ls3/u3;Lu4/t$b;JJILs3/q;ZLu4/u0;Ln5/c0;Ljava/util/List;Lu4/t$b;ZILs3/a3;JJJZ)V

    return-object v25
.end method

.method public f(Ls3/a3;)Ls3/y2;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v17, p1

    new-instance v25, Ls3/y2;

    move-object/from16 v1, v25

    iget-object v2, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v3, v0, Ls3/y2;->b:Lu4/t$b;

    iget-wide v4, v0, Ls3/y2;->c:J

    iget-wide v6, v0, Ls3/y2;->d:J

    iget v8, v0, Ls3/y2;->e:I

    iget-object v9, v0, Ls3/y2;->f:Ls3/q;

    iget-boolean v10, v0, Ls3/y2;->g:Z

    iget-object v11, v0, Ls3/y2;->h:Lu4/u0;

    iget-object v12, v0, Ls3/y2;->i:Ln5/c0;

    iget-object v13, v0, Ls3/y2;->j:Ljava/util/List;

    iget-object v14, v0, Ls3/y2;->k:Lu4/t$b;

    iget-boolean v15, v0, Ls3/y2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Ls3/y2;->m:I

    move/from16 v16, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Ls3/y2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Ls3/y2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Ls3/y2;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Ls3/y2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Ls3/y2;-><init>(Ls3/u3;Lu4/t$b;JJILs3/q;ZLu4/u0;Ln5/c0;Ljava/util/List;Lu4/t$b;ZILs3/a3;JJJZ)V

    return-object v25
.end method

.method public g(I)Ls3/y2;
    .locals 27

    move-object/from16 v0, p0

    move/from16 v8, p1

    new-instance v25, Ls3/y2;

    move-object/from16 v1, v25

    iget-object v2, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v3, v0, Ls3/y2;->b:Lu4/t$b;

    iget-wide v4, v0, Ls3/y2;->c:J

    iget-wide v6, v0, Ls3/y2;->d:J

    iget-object v9, v0, Ls3/y2;->f:Ls3/q;

    iget-boolean v10, v0, Ls3/y2;->g:Z

    iget-object v11, v0, Ls3/y2;->h:Lu4/u0;

    iget-object v12, v0, Ls3/y2;->i:Ln5/c0;

    iget-object v13, v0, Ls3/y2;->j:Ljava/util/List;

    iget-object v14, v0, Ls3/y2;->k:Lu4/t$b;

    iget-boolean v15, v0, Ls3/y2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Ls3/y2;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Ls3/y2;->n:Ls3/a3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Ls3/y2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Ls3/y2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Ls3/y2;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Ls3/y2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Ls3/y2;-><init>(Ls3/u3;Lu4/t$b;JJILs3/q;ZLu4/u0;Ln5/c0;Ljava/util/List;Lu4/t$b;ZILs3/a3;JJJZ)V

    return-object v25
.end method

.method public h(Z)Ls3/y2;
    .locals 27

    move-object/from16 v0, p0

    move/from16 v24, p1

    new-instance v25, Ls3/y2;

    move-object/from16 v1, v25

    iget-object v2, v0, Ls3/y2;->a:Ls3/u3;

    iget-object v3, v0, Ls3/y2;->b:Lu4/t$b;

    iget-wide v4, v0, Ls3/y2;->c:J

    iget-wide v6, v0, Ls3/y2;->d:J

    iget v8, v0, Ls3/y2;->e:I

    iget-object v9, v0, Ls3/y2;->f:Ls3/q;

    iget-boolean v10, v0, Ls3/y2;->g:Z

    iget-object v11, v0, Ls3/y2;->h:Lu4/u0;

    iget-object v12, v0, Ls3/y2;->i:Ln5/c0;

    iget-object v13, v0, Ls3/y2;->j:Ljava/util/List;

    iget-object v14, v0, Ls3/y2;->k:Lu4/t$b;

    iget-boolean v15, v0, Ls3/y2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Ls3/y2;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Ls3/y2;->n:Ls3/a3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Ls3/y2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Ls3/y2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Ls3/y2;->r:J

    move-wide/from16 v22, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Ls3/y2;-><init>(Ls3/u3;Lu4/t$b;JJILs3/q;ZLu4/u0;Ln5/c0;Ljava/util/List;Lu4/t$b;ZILs3/a3;JJJZ)V

    return-object v25
.end method

.method public i(Ls3/u3;)Ls3/y2;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    new-instance v25, Ls3/y2;

    move-object/from16 v1, v25

    iget-object v3, v0, Ls3/y2;->b:Lu4/t$b;

    iget-wide v4, v0, Ls3/y2;->c:J

    iget-wide v6, v0, Ls3/y2;->d:J

    iget v8, v0, Ls3/y2;->e:I

    iget-object v9, v0, Ls3/y2;->f:Ls3/q;

    iget-boolean v10, v0, Ls3/y2;->g:Z

    iget-object v11, v0, Ls3/y2;->h:Lu4/u0;

    iget-object v12, v0, Ls3/y2;->i:Ln5/c0;

    iget-object v13, v0, Ls3/y2;->j:Ljava/util/List;

    iget-object v14, v0, Ls3/y2;->k:Lu4/t$b;

    iget-boolean v15, v0, Ls3/y2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Ls3/y2;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Ls3/y2;->n:Ls3/a3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Ls3/y2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Ls3/y2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Ls3/y2;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Ls3/y2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Ls3/y2;-><init>(Ls3/u3;Lu4/t$b;JJILs3/q;ZLu4/u0;Ln5/c0;Ljava/util/List;Lu4/t$b;ZILs3/a3;JJJZ)V

    return-object v25
.end method
