.class public Lf4/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf4/g$b;,
        Lf4/g$a;
    }
.end annotation


# static fields
.field public static final I:Lx3/p;

.field public static final J:[B

.field public static final K:Ls3/m1;


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:Z

.field public E:Lx3/m;

.field public F:[Lx3/b0;

.field public G:[Lx3/b0;

.field public H:Z

.field public final a:I

.field public final b:Lf4/o;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/m1;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lf4/g$b;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lp5/a0;

.field public final f:Lp5/a0;

.field public final g:Lp5/a0;

.field public final h:[B

.field public final i:Lp5/a0;

.field public final j:Lp5/j0;

.field public final k:Lm4/c;

.field public final l:Lp5/a0;

.field public final m:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lf4/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lf4/g$a;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Lx3/b0;

.field public p:I

.field public q:I

.field public r:J

.field public s:I

.field public t:Lp5/a0;

.field public u:J

.field public v:I

.field public w:J

.field public x:J

.field public y:J

.field public z:Lf4/g$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lf4/f;->b:Lf4/f;

    sput-object v0, Lf4/g;->I:Lx3/p;

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lf4/g;->J:[B

    new-instance v0, Ls3/m1$b;

    invoke-direct {v0}, Ls3/m1$b;-><init>()V

    const-string v1, "application/x-emsg"

    invoke-virtual {v0, v1}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v0

    sput-object v0, Lf4/g;->K:Ls3/m1;

    return-void

    nop

    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lf4/g;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lf4/g;-><init>(ILp5/j0;)V

    return-void
.end method

.method public constructor <init>(ILp5/j0;)V
    .locals 2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v1, v0}, Lf4/g;-><init>(ILp5/j0;Lf4/o;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILp5/j0;Lf4/o;)V
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lf4/g;-><init>(ILp5/j0;Lf4/o;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILp5/j0;Lf4/o;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lp5/j0;",
            "Lf4/o;",
            "Ljava/util/List<",
            "Ls3/m1;",
            ">;)V"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lf4/g;-><init>(ILp5/j0;Lf4/o;Ljava/util/List;Lx3/b0;)V

    return-void
.end method

.method public constructor <init>(ILp5/j0;Lf4/o;Ljava/util/List;Lx3/b0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lp5/j0;",
            "Lf4/o;",
            "Ljava/util/List<",
            "Ls3/m1;",
            ">;",
            "Lx3/b0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf4/g;->a:I

    iput-object p2, p0, Lf4/g;->j:Lp5/j0;

    iput-object p3, p0, Lf4/g;->b:Lf4/o;

    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lf4/g;->c:Ljava/util/List;

    iput-object p5, p0, Lf4/g;->o:Lx3/b0;

    new-instance p1, Lm4/c;

    invoke-direct {p1}, Lm4/c;-><init>()V

    iput-object p1, p0, Lf4/g;->k:Lm4/c;

    new-instance p1, Lp5/a0;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lp5/a0;-><init>(I)V

    iput-object p1, p0, Lf4/g;->l:Lp5/a0;

    new-instance p1, Lp5/a0;

    sget-object p3, Lp5/w;->a:[B

    invoke-direct {p1, p3}, Lp5/a0;-><init>([B)V

    iput-object p1, p0, Lf4/g;->e:Lp5/a0;

    new-instance p1, Lp5/a0;

    const/4 p3, 0x5

    invoke-direct {p1, p3}, Lp5/a0;-><init>(I)V

    iput-object p1, p0, Lf4/g;->f:Lp5/a0;

    new-instance p1, Lp5/a0;

    invoke-direct {p1}, Lp5/a0;-><init>()V

    iput-object p1, p0, Lf4/g;->g:Lp5/a0;

    new-array p1, p2, [B

    iput-object p1, p0, Lf4/g;->h:[B

    new-instance p2, Lp5/a0;

    invoke-direct {p2, p1}, Lp5/a0;-><init>([B)V

    iput-object p2, p0, Lf4/g;->i:Lp5/a0;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lf4/g;->m:Ljava/util/ArrayDeque;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lf4/g;->n:Ljava/util/ArrayDeque;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lf4/g;->d:Landroid/util/SparseArray;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lf4/g;->x:J

    iput-wide p1, p0, Lf4/g;->w:J

    iput-wide p1, p0, Lf4/g;->y:J

    sget-object p1, Lx3/m;->g:Lx3/m;

    iput-object p1, p0, Lf4/g;->E:Lx3/m;

    const/4 p1, 0x0

    new-array p2, p1, [Lx3/b0;

    iput-object p2, p0, Lf4/g;->F:[Lx3/b0;

    new-array p1, p1, [Lx3/b0;

    iput-object p1, p0, Lf4/g;->G:[Lx3/b0;

    return-void
.end method

.method public static A(Lp5/a0;Lf4/q;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Lf4/g;->z(Lp5/a0;ILf4/q;)V

    return-void
.end method

.method public static B(Lp5/a0;J)Landroid/util/Pair;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp5/a0;",
            "J)",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Lx3/c;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lp5/a0;->T(I)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->p()I

    move-result v1

    invoke-static {v1}, Lf4/a;->c(I)I

    move-result v1

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lp5/a0;->U(I)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->I()J

    move-result-wide v9

    if-nez v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->I()J

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->I()J

    move-result-wide v5

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lp5/a0;->L()J

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->L()J

    move-result-wide v5

    :goto_0
    add-long v5, p1, v5

    move-wide v11, v3

    move-wide v13, v5

    const-wide/32 v5, 0xf4240

    move-wide v3, v11

    move-wide v7, v9

    invoke-static/range {v3 .. v8}, Lp5/n0;->N0(JJJ)J

    move-result-wide v15

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lp5/a0;->U(I)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->M()I

    move-result v1

    new-array v7, v1, [I

    new-array v8, v1, [J

    new-array v5, v1, [J

    new-array v6, v1, [J

    const/4 v3, 0x0

    move-wide/from16 v17, v15

    move-wide/from16 v23, v11

    move v11, v3

    move-wide/from16 v3, v23

    :goto_1
    if-ge v11, v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->p()I

    move-result v12

    const/high16 v19, -0x80000000

    and-int v19, v12, v19

    if-nez v19, :cond_1

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->I()J

    move-result-wide v19

    const v21, 0x7fffffff

    and-int v12, v12, v21

    aput v12, v7, v11

    aput-wide v13, v8, v11

    aput-wide v17, v6, v11

    add-long v17, v3, v19

    const-wide/32 v19, 0xf4240

    move-wide/from16 v3, v17

    move-object v12, v5

    move-object v2, v6

    move-wide/from16 v5, v19

    move/from16 p1, v1

    move-object v1, v7

    move-object/from16 v22, v8

    move-wide v7, v9

    invoke-static/range {v3 .. v8}, Lp5/n0;->N0(JJJ)J

    move-result-wide v3

    aget-wide v5, v2, v11

    sub-long v5, v3, v5

    aput-wide v5, v12, v11

    const/4 v5, 0x4

    invoke-virtual {v0, v5}, Lp5/a0;->U(I)V

    aget v6, v1, v11

    int-to-long v6, v6

    add-long/2addr v13, v6

    add-int/lit8 v11, v11, 0x1

    move-object v7, v1

    move-object v6, v2

    move v2, v5

    move-object v5, v12

    move-object/from16 v8, v22

    move/from16 v1, p1

    move-wide/from16 v23, v3

    move-wide/from16 v3, v17

    move-wide/from16 v17, v23

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    const-string v1, "Unhandled indirect reference"

    invoke-static {v1, v0}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object v0

    throw v0

    :cond_2
    move-object v12, v5

    move-object v2, v6

    move-object v1, v7

    move-object/from16 v22, v8

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v3, Lx3/c;

    move-object/from16 v4, v22

    invoke-direct {v3, v1, v4, v12, v2}, Lx3/c;-><init>([I[J[J[J)V

    invoke-static {v0, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    return-object v0
.end method

.method public static C(Lp5/a0;)J
    .locals 2

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v0

    invoke-static {v0}, Lf4/a;->c(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lp5/a0;->L()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lp5/a0;->I()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public static D(Lp5/a0;Landroid/util/SparseArray;Z)Lf4/g$b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp5/a0;",
            "Landroid/util/SparseArray<",
            "Lf4/g$b;",
            ">;Z)",
            "Lf4/g$b;"
        }
    .end annotation

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v0

    invoke-static {v0}, Lf4/a;->b(I)I

    move-result v0

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v1

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, Lf4/g$b;

    if-nez p1, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    and-int/lit8 p2, v0, 0x1

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lp5/a0;->L()J

    move-result-wide v1

    iget-object p2, p1, Lf4/g$b;->b:Lf4/q;

    iput-wide v1, p2, Lf4/q;->c:J

    iput-wide v1, p2, Lf4/q;->d:J

    :cond_2
    iget-object p2, p1, Lf4/g$b;->e:Lf4/c;

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_3
    iget v1, p2, Lf4/c;->a:I

    :goto_1
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v2

    goto :goto_2

    :cond_4
    iget v2, p2, Lf4/c;->b:I

    :goto_2
    and-int/lit8 v3, v0, 0x10

    if-eqz v3, :cond_5

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v3

    goto :goto_3

    :cond_5
    iget v3, p2, Lf4/c;->c:I

    :goto_3
    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result p0

    goto :goto_4

    :cond_6
    iget p0, p2, Lf4/c;->d:I

    :goto_4
    iget-object p2, p1, Lf4/g$b;->b:Lf4/q;

    new-instance v0, Lf4/c;

    invoke-direct {v0, v1, v2, v3, p0}, Lf4/c;-><init>(IIII)V

    iput-object v0, p2, Lf4/q;->a:Lf4/c;

    return-object p1
.end method

.method public static E(Lf4/a$a;Landroid/util/SparseArray;ZI[B)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/a$a;",
            "Landroid/util/SparseArray<",
            "Lf4/g$b;",
            ">;ZI[B)V"
        }
    .end annotation

    const v0, 0x74666864

    invoke-virtual {p0, v0}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v0

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/a$b;

    iget-object v0, v0, Lf4/a$b;->b:Lp5/a0;

    invoke-static {v0, p1, p2}, Lf4/g;->D(Lp5/a0;Landroid/util/SparseArray;Z)Lf4/g$b;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p2, p1, Lf4/g$b;->b:Lf4/q;

    iget-wide v0, p2, Lf4/q;->q:J

    iget-boolean v2, p2, Lf4/q;->r:Z

    invoke-virtual {p1}, Lf4/g$b;->k()V

    const/4 v3, 0x1

    invoke-static {p1, v3}, Lf4/g$b;->b(Lf4/g$b;Z)Z

    const v4, 0x74666474

    invoke-virtual {p0, v4}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v4

    if-eqz v4, :cond_1

    and-int/lit8 v5, p3, 0x2

    if-nez v5, :cond_1

    iget-object v0, v4, Lf4/a$b;->b:Lp5/a0;

    invoke-static {v0}, Lf4/g;->C(Lp5/a0;)J

    move-result-wide v0

    iput-wide v0, p2, Lf4/q;->q:J

    iput-boolean v3, p2, Lf4/q;->r:Z

    goto :goto_0

    :cond_1
    iput-wide v0, p2, Lf4/q;->q:J

    iput-boolean v2, p2, Lf4/q;->r:Z

    :goto_0
    invoke-static {p0, p1, p3}, Lf4/g;->H(Lf4/a$a;Lf4/g$b;I)V

    iget-object p1, p1, Lf4/g$b;->d:Lf4/r;

    iget-object p1, p1, Lf4/r;->a:Lf4/o;

    iget-object p3, p2, Lf4/q;->a:Lf4/c;

    invoke-static {p3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lf4/c;

    iget p3, p3, Lf4/c;->a:I

    invoke-virtual {p1, p3}, Lf4/o;->a(I)Lf4/p;

    move-result-object p1

    const p3, 0x7361697a

    invoke-virtual {p0, p3}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/p;

    iget-object p3, p3, Lf4/a$b;->b:Lp5/a0;

    invoke-static {v0, p3, p2}, Lf4/g;->x(Lf4/p;Lp5/a0;Lf4/q;)V

    :cond_2
    const p3, 0x7361696f

    invoke-virtual {p0, p3}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object p3

    if-eqz p3, :cond_3

    iget-object p3, p3, Lf4/a$b;->b:Lp5/a0;

    invoke-static {p3, p2}, Lf4/g;->w(Lp5/a0;Lf4/q;)V

    :cond_3
    const p3, 0x73656e63

    invoke-virtual {p0, p3}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object p3

    if-eqz p3, :cond_4

    iget-object p3, p3, Lf4/a$b;->b:Lp5/a0;

    invoke-static {p3, p2}, Lf4/g;->A(Lp5/a0;Lf4/q;)V

    :cond_4
    if-eqz p1, :cond_5

    iget-object p1, p1, Lf4/p;->b:Ljava/lang/String;

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    invoke-static {p0, p1, p2}, Lf4/g;->y(Lf4/a$a;Ljava/lang/String;Lf4/q;)V

    iget-object p1, p0, Lf4/a$a;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 p3, 0x0

    :goto_2
    if-ge p3, p1, :cond_7

    iget-object v0, p0, Lf4/a$a;->c:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/a$b;

    iget v1, v0, Lf4/a;->a:I

    const v2, 0x75756964

    if-ne v1, v2, :cond_6

    iget-object v0, v0, Lf4/a$b;->b:Lp5/a0;

    invoke-static {v0, p2, p4}, Lf4/g;->I(Lp5/a0;Lf4/q;[B)V

    :cond_6
    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_7
    return-void
.end method

.method public static F(Lp5/a0;)Landroid/util/Pair;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp5/a0;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Lf4/c;",
            ">;"
        }
    .end annotation

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v0

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v2

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v3

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result p0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v4, Lf4/c;

    invoke-direct {v4, v1, v2, v3, p0}, Lf4/c;-><init>(IIII)V

    invoke-static {v0, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static G(Lf4/g$b;IILp5/a0;I)I
    .locals 32

    move-object/from16 v0, p0

    const/16 v1, 0x8

    move-object/from16 v2, p3

    invoke-virtual {v2, v1}, Lp5/a0;->T(I)V

    invoke-virtual/range {p3 .. p3}, Lp5/a0;->p()I

    move-result v1

    invoke-static {v1}, Lf4/a;->b(I)I

    move-result v1

    iget-object v3, v0, Lf4/g$b;->d:Lf4/r;

    iget-object v3, v3, Lf4/r;->a:Lf4/o;

    iget-object v4, v0, Lf4/g$b;->b:Lf4/q;

    iget-object v5, v4, Lf4/q;->a:Lf4/c;

    invoke-static {v5}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf4/c;

    iget-object v6, v4, Lf4/q;->h:[I

    invoke-virtual/range {p3 .. p3}, Lp5/a0;->K()I

    move-result v7

    aput v7, v6, p1

    iget-object v6, v4, Lf4/q;->g:[J

    iget-wide v7, v4, Lf4/q;->c:J

    aput-wide v7, v6, p1

    and-int/lit8 v7, v1, 0x1

    if-eqz v7, :cond_0

    aget-wide v7, v6, p1

    invoke-virtual/range {p3 .. p3}, Lp5/a0;->p()I

    move-result v9

    int-to-long v9, v9

    add-long/2addr v7, v9

    aput-wide v7, v6, p1

    :cond_0
    and-int/lit8 v6, v1, 0x4

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    move v6, v7

    :goto_0
    iget v9, v5, Lf4/c;->d:I

    if-eqz v6, :cond_2

    invoke-virtual/range {p3 .. p3}, Lp5/a0;->p()I

    move-result v9

    :cond_2
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_3

    const/4 v10, 0x1

    goto :goto_1

    :cond_3
    move v10, v7

    :goto_1
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_4

    const/4 v11, 0x1

    goto :goto_2

    :cond_4
    move v11, v7

    :goto_2
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_5

    const/4 v12, 0x1

    goto :goto_3

    :cond_5
    move v12, v7

    :goto_3
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    goto :goto_4

    :cond_6
    move v1, v7

    :goto_4
    const-wide/16 v13, 0x0

    invoke-static {v3}, Lf4/g;->l(Lf4/o;)Z

    move-result v15

    if-eqz v15, :cond_7

    iget-object v13, v3, Lf4/o;->i:[J

    invoke-static {v13}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, [J

    aget-wide v14, v13, v7

    move-wide v13, v14

    :cond_7
    iget-object v15, v4, Lf4/q;->i:[I

    iget-object v7, v4, Lf4/q;->j:[J

    iget-object v8, v4, Lf4/q;->k:[Z

    iget v2, v3, Lf4/o;->b:I

    move/from16 v16, v9

    const/4 v9, 0x2

    if-ne v2, v9, :cond_8

    const/4 v2, 0x1

    and-int/lit8 v9, p2, 0x1

    if-eqz v9, :cond_8

    const/4 v2, 0x1

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    :goto_5
    iget-object v9, v4, Lf4/q;->h:[I

    aget v9, v9, p1

    add-int v9, p4, v9

    move/from16 p2, v2

    iget-wide v2, v3, Lf4/o;->c:J

    move-object/from16 v23, v7

    move-object/from16 v24, v8

    iget-wide v7, v4, Lf4/q;->q:J

    move-wide/from16 v25, v2

    move-wide v2, v7

    move/from16 v7, p4

    :goto_6
    if-ge v7, v9, :cond_11

    if-eqz v10, :cond_9

    invoke-virtual/range {p3 .. p3}, Lp5/a0;->p()I

    move-result v8

    goto :goto_7

    :cond_9
    iget v8, v5, Lf4/c;->b:I

    :goto_7
    invoke-static {v8}, Lf4/g;->d(I)I

    move-result v8

    if-eqz v11, :cond_a

    invoke-virtual/range {p3 .. p3}, Lp5/a0;->p()I

    move-result v17

    move/from16 v27, v10

    goto :goto_8

    :cond_a
    move/from16 v27, v10

    iget v10, v5, Lf4/c;->c:I

    move/from16 v17, v10

    :goto_8
    invoke-static/range {v17 .. v17}, Lf4/g;->d(I)I

    move-result v10

    if-eqz v12, :cond_b

    invoke-virtual/range {p3 .. p3}, Lp5/a0;->p()I

    move-result v17

    move/from16 v28, v6

    move/from16 v6, v17

    goto :goto_9

    :cond_b
    if-nez v7, :cond_c

    if-eqz v6, :cond_c

    move/from16 v28, v6

    move/from16 v6, v16

    goto :goto_9

    :cond_c
    move/from16 v28, v6

    iget v6, v5, Lf4/c;->d:I

    :goto_9
    if-eqz v1, :cond_d

    invoke-virtual/range {p3 .. p3}, Lp5/a0;->p()I

    move-result v17

    move/from16 v29, v1

    move/from16 v30, v11

    move/from16 v31, v12

    move/from16 v1, v17

    goto :goto_a

    :cond_d
    move/from16 v29, v1

    move/from16 v30, v11

    move/from16 v31, v12

    const/4 v1, 0x0

    :goto_a
    int-to-long v11, v1

    add-long/2addr v11, v2

    sub-long v17, v11, v13

    const-wide/32 v19, 0xf4240

    move-wide/from16 v21, v25

    invoke-static/range {v17 .. v22}, Lp5/n0;->N0(JJJ)J

    move-result-wide v11

    aput-wide v11, v23, v7

    iget-boolean v1, v4, Lf4/q;->r:Z

    if-nez v1, :cond_e

    aget-wide v11, v23, v7

    iget-object v1, v0, Lf4/g$b;->d:Lf4/r;

    iget-wide v0, v1, Lf4/r;->h:J

    add-long/2addr v11, v0

    aput-wide v11, v23, v7

    :cond_e
    aput v10, v15, v7

    shr-int/lit8 v0, v6, 0x10

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-nez v0, :cond_10

    if-eqz p2, :cond_f

    if-nez v7, :cond_10

    :cond_f
    move v0, v1

    goto :goto_b

    :cond_10
    const/4 v0, 0x0

    :goto_b
    aput-boolean v0, v24, v7

    int-to-long v10, v8

    add-long/2addr v2, v10

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, p0

    move/from16 v10, v27

    move/from16 v6, v28

    move/from16 v1, v29

    move/from16 v11, v30

    move/from16 v12, v31

    goto/16 :goto_6

    :cond_11
    iput-wide v2, v4, Lf4/q;->q:J

    return v9
.end method

.method public static H(Lf4/a$a;Lf4/g$b;I)V
    .locals 8

    iget-object p0, p0, Lf4/a$a;->c:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    move v4, v3

    :goto_0
    const v5, 0x7472756e

    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf4/a$b;

    iget v7, v6, Lf4/a;->a:I

    if-ne v7, v5, :cond_0

    iget-object v5, v6, Lf4/a$b;->b:Lp5/a0;

    const/16 v6, 0xc

    invoke-virtual {v5, v6}, Lp5/a0;->T(I)V

    invoke-virtual {v5}, Lp5/a0;->K()I

    move-result v5

    if-lez v5, :cond_0

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iput v1, p1, Lf4/g$b;->h:I

    iput v1, p1, Lf4/g$b;->g:I

    iput v1, p1, Lf4/g$b;->f:I

    iget-object v2, p1, Lf4/g$b;->b:Lf4/q;

    invoke-virtual {v2, v3, v4}, Lf4/q;->e(II)V

    move v2, v1

    move v3, v2

    :goto_1
    if-ge v1, v0, :cond_3

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf4/a$b;

    iget v6, v4, Lf4/a;->a:I

    if-ne v6, v5, :cond_2

    add-int/lit8 v6, v2, 0x1

    iget-object v4, v4, Lf4/a$b;->b:Lp5/a0;

    invoke-static {p1, v2, p2, v4, v3}, Lf4/g;->G(Lf4/g$b;IILp5/a0;I)I

    move-result v2

    move v3, v2

    move v2, v6

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public static I(Lp5/a0;Lf4/q;[B)V
    .locals 2

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    const/4 v0, 0x0

    const/16 v1, 0x10

    invoke-virtual {p0, p2, v0, v1}, Lp5/a0;->l([BII)V

    sget-object v0, Lf4/g;->J:[B

    invoke-static {p2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-static {p0, v1, p1}, Lf4/g;->z(Lp5/a0;ILf4/q;)V

    return-void
.end method

.method public static O(I)Z
    .locals 1

    const v0, 0x6d6f6f76

    if-eq p0, v0, :cond_1

    const v0, 0x7472616b

    if-eq p0, v0, :cond_1

    const v0, 0x6d646961

    if-eq p0, v0, :cond_1

    const v0, 0x6d696e66

    if-eq p0, v0, :cond_1

    const v0, 0x7374626c

    if-eq p0, v0, :cond_1

    const v0, 0x6d6f6f66

    if-eq p0, v0, :cond_1

    const v0, 0x74726166

    if-eq p0, v0, :cond_1

    const v0, 0x6d766578

    if-eq p0, v0, :cond_1

    const v0, 0x65647473

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static P(I)Z
    .locals 1

    const v0, 0x68646c72    # 4.3148E24f

    if-eq p0, v0, :cond_1

    const v0, 0x6d646864

    if-eq p0, v0, :cond_1

    const v0, 0x6d766864

    if-eq p0, v0, :cond_1

    const v0, 0x73696478

    if-eq p0, v0, :cond_1

    const v0, 0x73747364

    if-eq p0, v0, :cond_1

    const v0, 0x73747473

    if-eq p0, v0, :cond_1

    const v0, 0x63747473

    if-eq p0, v0, :cond_1

    const v0, 0x73747363

    if-eq p0, v0, :cond_1

    const v0, 0x7374737a

    if-eq p0, v0, :cond_1

    const v0, 0x73747a32

    if-eq p0, v0, :cond_1

    const v0, 0x7374636f

    if-eq p0, v0, :cond_1

    const v0, 0x636f3634

    if-eq p0, v0, :cond_1

    const v0, 0x73747373

    if-eq p0, v0, :cond_1

    const v0, 0x74666474

    if-eq p0, v0, :cond_1

    const v0, 0x74666864

    if-eq p0, v0, :cond_1

    const v0, 0x746b6864

    if-eq p0, v0, :cond_1

    const v0, 0x74726578

    if-eq p0, v0, :cond_1

    const v0, 0x7472756e

    if-eq p0, v0, :cond_1

    const v0, 0x70737368    # 3.013775E29f

    if-eq p0, v0, :cond_1

    const v0, 0x7361697a

    if-eq p0, v0, :cond_1

    const v0, 0x7361696f

    if-eq p0, v0, :cond_1

    const v0, 0x73656e63

    if-eq p0, v0, :cond_1

    const v0, 0x75756964

    if-eq p0, v0, :cond_1

    const v0, 0x73626770

    if-eq p0, v0, :cond_1

    const v0, 0x73677064

    if-eq p0, v0, :cond_1

    const v0, 0x656c7374

    if-eq p0, v0, :cond_1

    const v0, 0x6d656864

    if-eq p0, v0, :cond_1

    const v0, 0x656d7367

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static synthetic a()[Lx3/k;
    .locals 1

    invoke-static {}, Lf4/g;->m()[Lx3/k;

    move-result-object v0

    return-object v0
.end method

.method public static d(I)I
    .locals 2

    if-ltz p0, :cond_0

    return p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected negative value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p0

    throw p0
.end method

.method public static i(Ljava/util/List;)Lw3/m;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lf4/a$b;",
            ">;)",
            "Lw3/m;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v1

    :goto_0
    if-ge v2, v0, :cond_3

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf4/a$b;

    iget v5, v4, Lf4/a;->a:I

    const v6, 0x70737368    # 3.013775E29f

    if-ne v5, v6, :cond_2

    if-nez v3, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iget-object v4, v4, Lf4/a$b;->b:Lp5/a0;

    invoke-virtual {v4}, Lp5/a0;->e()[B

    move-result-object v4

    invoke-static {v4}, Lf4/l;->f([B)Ljava/util/UUID;

    move-result-object v5

    if-nez v5, :cond_1

    const-string v4, "FragmentedMp4Extractor"

    const-string v5, "Skipped pssh atom (failed to extract uuid)"

    invoke-static {v4, v5}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance v6, Lw3/m$b;

    const-string v7, "video/mp4"

    invoke-direct {v6, v5, v7, v4}, Lw3/m$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    new-instance v1, Lw3/m;

    invoke-direct {v1, v3}, Lw3/m;-><init>(Ljava/util/List;)V

    :goto_2
    return-object v1
.end method

.method public static j(Landroid/util/SparseArray;)Lf4/g$b;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Lf4/g$b;",
            ">;)",
            "Lf4/g$b;"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    const-wide v2, 0x7fffffffffffffffL

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_3

    invoke-virtual {p0, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf4/g$b;

    invoke-static {v5}, Lf4/g$b;->a(Lf4/g$b;)Z

    move-result v6

    if-nez v6, :cond_0

    iget v6, v5, Lf4/g$b;->f:I

    iget-object v7, v5, Lf4/g$b;->d:Lf4/r;

    iget v7, v7, Lf4/r;->b:I

    if-eq v6, v7, :cond_2

    :cond_0
    invoke-static {v5}, Lf4/g$b;->a(Lf4/g$b;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget v6, v5, Lf4/g$b;->h:I

    iget-object v7, v5, Lf4/g$b;->b:Lf4/q;

    iget v7, v7, Lf4/q;->e:I

    if-ne v6, v7, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lf4/g$b;->d()J

    move-result-wide v6

    cmp-long v8, v6, v2

    if-gez v8, :cond_2

    move-object v1, v5

    move-wide v2, v6

    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static l(Lf4/o;)Z
    .locals 14

    iget-object v0, p0, Lf4/o;->h:[J

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    array-length v2, v0

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lf4/o;->i:[J

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    aget-wide v4, v0, v1

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-nez v4, :cond_1

    return v3

    :cond_1
    aget-wide v4, v0, v1

    aget-wide v6, v2, v1

    add-long v8, v4, v6

    const-wide/32 v10, 0xf4240

    iget-wide v12, p0, Lf4/o;->d:J

    invoke-static/range {v8 .. v13}, Lp5/n0;->N0(JJJ)J

    move-result-wide v4

    iget-wide v6, p0, Lf4/o;->e:J

    cmp-long p0, v4, v6

    if-ltz p0, :cond_2

    move v1, v3

    :cond_2
    :goto_0
    return v1
.end method

.method public static synthetic m()[Lx3/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx3/k;

    new-instance v1, Lf4/g;

    invoke-direct {v1}, Lf4/g;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static u(Lp5/a0;)J
    .locals 2

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v0

    invoke-static {v0}, Lf4/a;->c(I)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp5/a0;->I()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lp5/a0;->L()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public static v(Lf4/a$a;Landroid/util/SparseArray;ZI[B)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/a$a;",
            "Landroid/util/SparseArray<",
            "Lf4/g$b;",
            ">;ZI[B)V"
        }
    .end annotation

    iget-object v0, p0, Lf4/a$a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lf4/a$a;->d:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf4/a$a;

    iget v3, v2, Lf4/a;->a:I

    const v4, 0x74726166

    if-ne v3, v4, :cond_0

    invoke-static {v2, p1, p2, p3, p4}, Lf4/g;->E(Lf4/a$a;Landroid/util/SparseArray;ZI[B)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static w(Lp5/a0;Lf4/q;)V
    .locals 5

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v1

    invoke-static {v1}, Lf4/a;->b(I)I

    move-result v2

    const/4 v3, 0x1

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_0

    invoke-virtual {p0, v0}, Lp5/a0;->U(I)V

    :cond_0
    invoke-virtual {p0}, Lp5/a0;->K()I

    move-result v0

    if-ne v0, v3, :cond_2

    invoke-static {v1}, Lf4/a;->c(I)I

    move-result v0

    iget-wide v1, p1, Lf4/q;->d:J

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lp5/a0;->I()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lp5/a0;->L()J

    move-result-wide v3

    :goto_0
    add-long/2addr v1, v3

    iput-wide v1, p1, Lf4/q;->d:J

    return-void

    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Unexpected saio entry count: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p0

    throw p0
.end method

.method public static x(Lf4/p;Lp5/a0;Lf4/q;)V
    .locals 7

    iget p0, p0, Lf4/p;->d:I

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p1}, Lp5/a0;->p()I

    move-result v1

    invoke-static {v1}, Lf4/a;->b(I)I

    move-result v1

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    invoke-virtual {p1, v0}, Lp5/a0;->U(I)V

    :cond_0
    invoke-virtual {p1}, Lp5/a0;->G()I

    move-result v0

    invoke-virtual {p1}, Lp5/a0;->K()I

    move-result v1

    iget v3, p2, Lf4/q;->f:I

    if-gt v1, v3, :cond_6

    const/4 v3, 0x0

    if-nez v0, :cond_2

    iget-object v0, p2, Lf4/q;->m:[Z

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v1, :cond_4

    invoke-virtual {p1}, Lp5/a0;->G()I

    move-result v6

    add-int/2addr v5, v6

    if-le v6, p0, :cond_1

    move v6, v2

    goto :goto_1

    :cond_1
    move v6, v3

    :goto_1
    aput-boolean v6, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-le v0, p0, :cond_3

    goto :goto_2

    :cond_3
    move v2, v3

    :goto_2
    mul-int/2addr v0, v1

    add-int/lit8 v5, v0, 0x0

    iget-object p0, p2, Lf4/q;->m:[Z

    invoke-static {p0, v3, v1, v2}, Ljava/util/Arrays;->fill([ZIIZ)V

    :cond_4
    iget-object p0, p2, Lf4/q;->m:[Z

    iget p1, p2, Lf4/q;->f:I

    invoke-static {p0, v1, p1, v3}, Ljava/util/Arrays;->fill([ZIIZ)V

    if-lez v5, :cond_5

    invoke-virtual {p2, v5}, Lf4/q;->d(I)V

    :cond_5
    return-void

    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Saiz sample count "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is greater than fragment sample count"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p2, Lf4/q;->f:I

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p0

    throw p0
.end method

.method public static y(Lf4/a$a;Ljava/lang/String;Lf4/q;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, v2

    move-object v6, v5

    move v4, v3

    :goto_0
    iget-object v7, v0, Lf4/a$a;->c:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v4, v7, :cond_2

    iget-object v7, v0, Lf4/a$a;->c:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf4/a$b;

    iget-object v8, v7, Lf4/a$b;->b:Lp5/a0;

    iget v7, v7, Lf4/a;->a:I

    const v9, 0x73626770

    const v10, 0x73656967

    const/16 v11, 0xc

    if-ne v7, v9, :cond_0

    invoke-virtual {v8, v11}, Lp5/a0;->T(I)V

    invoke-virtual {v8}, Lp5/a0;->p()I

    move-result v7

    if-ne v7, v10, :cond_1

    move-object v5, v8

    goto :goto_1

    :cond_0
    const v9, 0x73677064

    if-ne v7, v9, :cond_1

    invoke-virtual {v8, v11}, Lp5/a0;->T(I)V

    invoke-virtual {v8}, Lp5/a0;->p()I

    move-result v7

    if-ne v7, v10, :cond_1

    move-object v6, v8

    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-eqz v5, :cond_d

    if-nez v6, :cond_3

    goto/16 :goto_4

    :cond_3
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Lp5/a0;->T(I)V

    invoke-virtual {v5}, Lp5/a0;->p()I

    move-result v4

    invoke-static {v4}, Lf4/a;->c(I)I

    move-result v4

    const/4 v7, 0x4

    invoke-virtual {v5, v7}, Lp5/a0;->U(I)V

    const/4 v8, 0x1

    if-ne v4, v8, :cond_4

    invoke-virtual {v5, v7}, Lp5/a0;->U(I)V

    :cond_4
    invoke-virtual {v5}, Lp5/a0;->p()I

    move-result v4

    if-ne v4, v8, :cond_c

    invoke-virtual {v6, v0}, Lp5/a0;->T(I)V

    invoke-virtual {v6}, Lp5/a0;->p()I

    move-result v0

    invoke-static {v0}, Lf4/a;->c(I)I

    move-result v0

    invoke-virtual {v6, v7}, Lp5/a0;->U(I)V

    if-ne v0, v8, :cond_6

    invoke-virtual {v6}, Lp5/a0;->I()J

    move-result-wide v4

    const-wide/16 v9, 0x0

    cmp-long v0, v4, v9

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    const-string v0, "Variable length description in sgpd found (unsupported)"

    invoke-static {v0}, Ls3/t2;->d(Ljava/lang/String;)Ls3/t2;

    move-result-object v0

    throw v0

    :cond_6
    const/4 v4, 0x2

    if-lt v0, v4, :cond_7

    invoke-virtual {v6, v7}, Lp5/a0;->U(I)V

    :cond_7
    :goto_2
    invoke-virtual {v6}, Lp5/a0;->I()J

    move-result-wide v4

    const-wide/16 v9, 0x1

    cmp-long v0, v4, v9

    if-nez v0, :cond_b

    invoke-virtual {v6, v8}, Lp5/a0;->U(I)V

    invoke-virtual {v6}, Lp5/a0;->G()I

    move-result v0

    and-int/lit16 v4, v0, 0xf0

    shr-int/lit8 v14, v4, 0x4

    and-int/lit8 v15, v0, 0xf

    invoke-virtual {v6}, Lp5/a0;->G()I

    move-result v0

    if-ne v0, v8, :cond_8

    move v10, v8

    goto :goto_3

    :cond_8
    move v10, v3

    :goto_3
    if-nez v10, :cond_9

    return-void

    :cond_9
    invoke-virtual {v6}, Lp5/a0;->G()I

    move-result v12

    const/16 v0, 0x10

    new-array v13, v0, [B

    invoke-virtual {v6, v13, v3, v0}, Lp5/a0;->l([BII)V

    if-nez v12, :cond_a

    invoke-virtual {v6}, Lp5/a0;->G()I

    move-result v0

    new-array v2, v0, [B

    invoke-virtual {v6, v2, v3, v0}, Lp5/a0;->l([BII)V

    :cond_a
    move-object/from16 v16, v2

    iput-boolean v8, v1, Lf4/q;->l:Z

    new-instance v0, Lf4/p;

    move-object v9, v0

    move-object/from16 v11, p1

    invoke-direct/range {v9 .. v16}, Lf4/p;-><init>(ZLjava/lang/String;I[BII[B)V

    iput-object v0, v1, Lf4/q;->n:Lf4/p;

    return-void

    :cond_b
    const-string v0, "Entry count in sgpd != 1 (unsupported)."

    invoke-static {v0}, Ls3/t2;->d(Ljava/lang/String;)Ls3/t2;

    move-result-object v0

    throw v0

    :cond_c
    const-string v0, "Entry count in sbgp != 1 (unsupported)."

    invoke-static {v0}, Ls3/t2;->d(Ljava/lang/String;)Ls3/t2;

    move-result-object v0

    throw v0

    :cond_d
    :goto_4
    return-void
.end method

.method public static z(Lp5/a0;ILf4/q;)V
    .locals 3

    add-int/lit8 p1, p1, 0x8

    invoke-virtual {p0, p1}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result p1

    invoke-static {p1}, Lf4/a;->b(I)I

    move-result p1

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_3

    and-int/lit8 p1, p1, 0x2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    invoke-virtual {p0}, Lp5/a0;->K()I

    move-result v1

    if-nez v1, :cond_1

    iget-object p0, p2, Lf4/q;->m:[Z

    iget p1, p2, Lf4/q;->f:I

    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    return-void

    :cond_1
    iget v2, p2, Lf4/q;->f:I

    if-ne v1, v2, :cond_2

    iget-object v2, p2, Lf4/q;->m:[Z

    invoke-static {v2, v0, v1, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    invoke-virtual {p0}, Lp5/a0;->a()I

    move-result p1

    invoke-virtual {p2, p1}, Lf4/q;->d(I)V

    invoke-virtual {p2, p0}, Lf4/q;->a(Lp5/a0;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Senc sample count "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is different from fragment sample count"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p2, Lf4/q;->f:I

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p0

    throw p0

    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    invoke-static {p0}, Ls3/t2;->d(Ljava/lang/String;)Ls3/t2;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final J(J)V
    .locals 2

    :goto_0
    iget-object v0, p0, Lf4/g;->m:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lf4/g;->m:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/a$a;

    iget-wide v0, v0, Lf4/a$a;->b:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_0

    iget-object v0, p0, Lf4/g;->m:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/a$a;

    invoke-virtual {p0, v0}, Lf4/g;->o(Lf4/a$a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lf4/g;->e()V

    return-void
.end method

.method public final K(Lx3/l;)Z
    .locals 11

    iget v0, p0, Lf4/g;->s:I

    const/16 v1, 0x8

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lf4/g;->l:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, v2, v1, v3}, Lx3/l;->d([BIIZ)Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    :cond_0
    iput v1, p0, Lf4/g;->s:I

    iget-object v0, p0, Lf4/g;->l:Lp5/a0;

    invoke-virtual {v0, v2}, Lp5/a0;->T(I)V

    iget-object v0, p0, Lf4/g;->l:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->I()J

    move-result-wide v4

    iput-wide v4, p0, Lf4/g;->r:J

    iget-object v0, p0, Lf4/g;->l:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->p()I

    move-result v0

    iput v0, p0, Lf4/g;->q:I

    :cond_1
    iget-wide v4, p0, Lf4/g;->r:J

    const-wide/16 v6, 0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    iget-object v0, p0, Lf4/g;->l:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, v1, v1}, Lx3/l;->readFully([BII)V

    iget v0, p0, Lf4/g;->s:I

    add-int/2addr v0, v1

    iput v0, p0, Lf4/g;->s:I

    iget-object v0, p0, Lf4/g;->l:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->L()J

    move-result-wide v4

    :goto_0
    iput-wide v4, p0, Lf4/g;->r:J

    goto :goto_1

    :cond_2
    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-nez v0, :cond_4

    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_3

    iget-object v0, p0, Lf4/g;->m:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lf4/g;->m:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/a$a;

    iget-wide v4, v0, Lf4/a$a;->b:J

    :cond_3
    cmp-long v0, v4, v6

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v6

    sub-long/2addr v4, v6

    iget v0, p0, Lf4/g;->s:I

    int-to-long v6, v0

    add-long/2addr v4, v6

    goto :goto_0

    :cond_4
    :goto_1
    iget-wide v4, p0, Lf4/g;->r:J

    iget v0, p0, Lf4/g;->s:I

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-ltz v0, :cond_f

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v4

    iget v0, p0, Lf4/g;->s:I

    int-to-long v6, v0

    sub-long/2addr v4, v6

    iget v0, p0, Lf4/g;->q:I

    const v6, 0x6d646174

    const v7, 0x6d6f6f66

    if-eq v0, v7, :cond_5

    if-ne v0, v6, :cond_6

    :cond_5
    iget-boolean v0, p0, Lf4/g;->H:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Lf4/g;->E:Lx3/m;

    new-instance v8, Lx3/z$b;

    iget-wide v9, p0, Lf4/g;->x:J

    invoke-direct {v8, v9, v10, v4, v5}, Lx3/z$b;-><init>(JJ)V

    invoke-interface {v0, v8}, Lx3/m;->j(Lx3/z;)V

    iput-boolean v3, p0, Lf4/g;->H:Z

    :cond_6
    iget v0, p0, Lf4/g;->q:I

    if-ne v0, v7, :cond_7

    iget-object v0, p0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    move v7, v2

    :goto_2
    if-ge v7, v0, :cond_7

    iget-object v8, p0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-virtual {v8, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf4/g$b;

    iget-object v8, v8, Lf4/g$b;->b:Lf4/q;

    iput-wide v4, v8, Lf4/q;->b:J

    iput-wide v4, v8, Lf4/q;->d:J

    iput-wide v4, v8, Lf4/q;->c:J

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_7
    iget v0, p0, Lf4/g;->q:I

    const/4 v7, 0x0

    if-ne v0, v6, :cond_8

    iput-object v7, p0, Lf4/g;->z:Lf4/g$b;

    iget-wide v0, p0, Lf4/g;->r:J

    add-long/2addr v4, v0

    iput-wide v4, p0, Lf4/g;->u:J

    const/4 p1, 0x2

    iput p1, p0, Lf4/g;->p:I

    return v3

    :cond_8
    invoke-static {v0}, Lf4/g;->O(I)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v0

    iget-wide v4, p0, Lf4/g;->r:J

    add-long/2addr v0, v4

    const-wide/16 v4, 0x8

    sub-long/2addr v0, v4

    iget-object p1, p0, Lf4/g;->m:Ljava/util/ArrayDeque;

    new-instance v2, Lf4/a$a;

    iget v4, p0, Lf4/g;->q:I

    invoke-direct {v2, v4, v0, v1}, Lf4/a$a;-><init>(IJ)V

    invoke-virtual {p1, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-wide v4, p0, Lf4/g;->r:J

    iget p1, p0, Lf4/g;->s:I

    int-to-long v6, p1

    cmp-long p1, v4, v6

    if-nez p1, :cond_9

    invoke-virtual {p0, v0, v1}, Lf4/g;->J(J)V

    goto :goto_4

    :cond_9
    invoke-virtual {p0}, Lf4/g;->e()V

    goto :goto_4

    :cond_a
    iget p1, p0, Lf4/g;->q:I

    invoke-static {p1}, Lf4/g;->P(I)Z

    move-result p1

    const-wide/32 v4, 0x7fffffff

    if-eqz p1, :cond_d

    iget p1, p0, Lf4/g;->s:I

    if-ne p1, v1, :cond_c

    iget-wide v6, p0, Lf4/g;->r:J

    cmp-long p1, v6, v4

    if-gtz p1, :cond_b

    new-instance p1, Lp5/a0;

    iget-wide v4, p0, Lf4/g;->r:J

    long-to-int v0, v4

    invoke-direct {p1, v0}, Lp5/a0;-><init>(I)V

    iget-object v0, p0, Lf4/g;->l:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    invoke-virtual {p1}, Lp5/a0;->e()[B

    move-result-object v4

    invoke-static {v0, v2, v4, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p1, p0, Lf4/g;->t:Lp5/a0;

    goto :goto_3

    :cond_b
    const-string p1, "Leaf atom with length > 2147483647 (unsupported)."

    invoke-static {p1}, Ls3/t2;->d(Ljava/lang/String;)Ls3/t2;

    move-result-object p1

    throw p1

    :cond_c
    const-string p1, "Leaf atom defines extended atom size (unsupported)."

    invoke-static {p1}, Ls3/t2;->d(Ljava/lang/String;)Ls3/t2;

    move-result-object p1

    throw p1

    :cond_d
    iget-wide v0, p0, Lf4/g;->r:J

    cmp-long p1, v0, v4

    if-gtz p1, :cond_e

    iput-object v7, p0, Lf4/g;->t:Lp5/a0;

    :goto_3
    iput v3, p0, Lf4/g;->p:I

    :goto_4
    return v3

    :cond_e
    const-string p1, "Skipping atom with length > 2147483647 (unsupported)."

    invoke-static {p1}, Ls3/t2;->d(Ljava/lang/String;)Ls3/t2;

    move-result-object p1

    throw p1

    :cond_f
    const-string p1, "Atom size less than header length (unsupported)."

    invoke-static {p1}, Ls3/t2;->d(Ljava/lang/String;)Ls3/t2;

    move-result-object p1

    throw p1
.end method

.method public final L(Lx3/l;)V
    .locals 4

    iget-wide v0, p0, Lf4/g;->r:J

    long-to-int v0, v0

    iget v1, p0, Lf4/g;->s:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lf4/g;->t:Lp5/a0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lp5/a0;->e()[B

    move-result-object v2

    const/16 v3, 0x8

    invoke-interface {p1, v2, v3, v0}, Lx3/l;->readFully([BII)V

    new-instance v0, Lf4/a$b;

    iget v2, p0, Lf4/g;->q:I

    invoke-direct {v0, v2, v1}, Lf4/a$b;-><init>(ILp5/a0;)V

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Lf4/g;->q(Lf4/a$b;J)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v0}, Lx3/l;->m(I)V

    :goto_0
    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lf4/g;->J(J)V

    return-void
.end method

.method public final M(Lx3/l;)V
    .locals 9

    iget-object v0, p0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    const-wide v2, 0x7fffffffffffffffL

    const/4 v4, 0x0

    move-object v5, v1

    :goto_0
    if-ge v4, v0, :cond_1

    iget-object v6, p0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-virtual {v6, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf4/g$b;

    iget-object v6, v6, Lf4/g$b;->b:Lf4/q;

    iget-boolean v7, v6, Lf4/q;->p:Z

    if-eqz v7, :cond_0

    iget-wide v6, v6, Lf4/q;->d:J

    cmp-long v8, v6, v2

    if-gez v8, :cond_0

    iget-object v2, p0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lf4/g$b;

    move-wide v2, v6

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    if-nez v5, :cond_2

    const/4 p1, 0x3

    iput p1, p0, Lf4/g;->p:I

    return-void

    :cond_2
    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v6

    sub-long/2addr v2, v6

    long-to-int v0, v2

    if-ltz v0, :cond_3

    invoke-interface {p1, v0}, Lx3/l;->m(I)V

    iget-object v0, v5, Lf4/g$b;->b:Lf4/q;

    invoke-virtual {v0, p1}, Lf4/q;->b(Lx3/l;)V

    return-void

    :cond_3
    const-string p1, "Offset to encryption data was negative."

    invoke-static {p1, v1}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1
.end method

.method public final N(Lx3/l;)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lf4/g;->z:Lf4/g$b;

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-nez v2, :cond_3

    iget-object v2, v0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-static {v2}, Lf4/g;->j(Landroid/util/SparseArray;)Lf4/g$b;

    move-result-object v2

    if-nez v2, :cond_1

    iget-wide v5, v0, Lf4/g;->u:J

    invoke-interface/range {p1 .. p1}, Lx3/l;->getPosition()J

    move-result-wide v7

    sub-long/2addr v5, v7

    long-to-int v2, v5

    if-ltz v2, :cond_0

    invoke-interface {v1, v2}, Lx3/l;->m(I)V

    invoke-virtual/range {p0 .. p0}, Lf4/g;->e()V

    return v4

    :cond_0
    const-string v1, "Offset to end of mdat was negative."

    invoke-static {v1, v3}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object v1

    throw v1

    :cond_1
    invoke-virtual {v2}, Lf4/g$b;->d()J

    move-result-wide v5

    invoke-interface/range {p1 .. p1}, Lx3/l;->getPosition()J

    move-result-wide v7

    sub-long/2addr v5, v7

    long-to-int v5, v5

    if-gez v5, :cond_2

    const-string v5, "FragmentedMp4Extractor"

    const-string v6, "Ignoring negative offset to sample data."

    invoke-static {v5, v6}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    move v5, v4

    :cond_2
    invoke-interface {v1, v5}, Lx3/l;->m(I)V

    iput-object v2, v0, Lf4/g;->z:Lf4/g$b;

    :cond_3
    iget v5, v0, Lf4/g;->p:I

    const/4 v6, 0x3

    const/4 v7, 0x4

    const/4 v8, 0x1

    if-ne v5, v6, :cond_8

    invoke-virtual {v2}, Lf4/g$b;->f()I

    move-result v5

    iput v5, v0, Lf4/g;->A:I

    iget v9, v2, Lf4/g$b;->f:I

    iget v10, v2, Lf4/g$b;->i:I

    if-ge v9, v10, :cond_5

    invoke-interface {v1, v5}, Lx3/l;->m(I)V

    invoke-virtual {v2}, Lf4/g$b;->m()V

    invoke-virtual {v2}, Lf4/g$b;->h()Z

    move-result v1

    if-nez v1, :cond_4

    iput-object v3, v0, Lf4/g;->z:Lf4/g$b;

    :cond_4
    iput v6, v0, Lf4/g;->p:I

    return v8

    :cond_5
    iget-object v9, v2, Lf4/g$b;->d:Lf4/r;

    iget-object v9, v9, Lf4/r;->a:Lf4/o;

    iget v9, v9, Lf4/o;->g:I

    if-ne v9, v8, :cond_6

    const/16 v9, 0x8

    sub-int/2addr v5, v9

    iput v5, v0, Lf4/g;->A:I

    invoke-interface {v1, v9}, Lx3/l;->m(I)V

    :cond_6
    iget-object v5, v2, Lf4/g$b;->d:Lf4/r;

    iget-object v5, v5, Lf4/r;->a:Lf4/o;

    iget-object v5, v5, Lf4/o;->f:Ls3/m1;

    iget-object v5, v5, Ls3/m1;->s:Ljava/lang/String;

    const-string v9, "audio/ac4"

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    iget v5, v0, Lf4/g;->A:I

    const/4 v9, 0x7

    invoke-virtual {v2, v5, v9}, Lf4/g$b;->i(II)I

    move-result v5

    iput v5, v0, Lf4/g;->B:I

    iget v5, v0, Lf4/g;->A:I

    iget-object v10, v0, Lf4/g;->i:Lp5/a0;

    invoke-static {v5, v10}, Lu3/c;->a(ILp5/a0;)V

    iget-object v5, v2, Lf4/g$b;->a:Lx3/b0;

    iget-object v10, v0, Lf4/g;->i:Lp5/a0;

    invoke-interface {v5, v10, v9}, Lx3/b0;->e(Lp5/a0;I)V

    iget v5, v0, Lf4/g;->B:I

    add-int/2addr v5, v9

    goto :goto_0

    :cond_7
    iget v5, v0, Lf4/g;->A:I

    invoke-virtual {v2, v5, v4}, Lf4/g$b;->i(II)I

    move-result v5

    :goto_0
    iput v5, v0, Lf4/g;->B:I

    iget v5, v0, Lf4/g;->A:I

    iget v9, v0, Lf4/g;->B:I

    add-int/2addr v5, v9

    iput v5, v0, Lf4/g;->A:I

    iput v7, v0, Lf4/g;->p:I

    iput v4, v0, Lf4/g;->C:I

    :cond_8
    iget-object v5, v2, Lf4/g$b;->d:Lf4/r;

    iget-object v5, v5, Lf4/r;->a:Lf4/o;

    iget-object v9, v2, Lf4/g$b;->a:Lx3/b0;

    invoke-virtual {v2}, Lf4/g$b;->e()J

    move-result-wide v10

    iget-object v12, v0, Lf4/g;->j:Lp5/j0;

    if-eqz v12, :cond_9

    invoke-virtual {v12, v10, v11}, Lp5/j0;->a(J)J

    move-result-wide v10

    :cond_9
    move-wide v14, v10

    iget v10, v5, Lf4/o;->j:I

    if-eqz v10, :cond_e

    iget-object v10, v0, Lf4/g;->f:Lp5/a0;

    invoke-virtual {v10}, Lp5/a0;->e()[B

    move-result-object v10

    aput-byte v4, v10, v4

    aput-byte v4, v10, v8

    const/4 v11, 0x2

    aput-byte v4, v10, v11

    iget v11, v5, Lf4/o;->j:I

    add-int/lit8 v12, v11, 0x1

    rsub-int/lit8 v11, v11, 0x4

    :goto_1
    iget v13, v0, Lf4/g;->B:I

    iget v6, v0, Lf4/g;->A:I

    if-ge v13, v6, :cond_f

    iget v6, v0, Lf4/g;->C:I

    if-nez v6, :cond_c

    invoke-interface {v1, v10, v11, v12}, Lx3/l;->readFully([BII)V

    iget-object v6, v0, Lf4/g;->f:Lp5/a0;

    invoke-virtual {v6, v4}, Lp5/a0;->T(I)V

    iget-object v6, v0, Lf4/g;->f:Lp5/a0;

    invoke-virtual {v6}, Lp5/a0;->p()I

    move-result v6

    if-lt v6, v8, :cond_b

    add-int/lit8 v6, v6, -0x1

    iput v6, v0, Lf4/g;->C:I

    iget-object v6, v0, Lf4/g;->e:Lp5/a0;

    invoke-virtual {v6, v4}, Lp5/a0;->T(I)V

    iget-object v6, v0, Lf4/g;->e:Lp5/a0;

    invoke-interface {v9, v6, v7}, Lx3/b0;->e(Lp5/a0;I)V

    iget-object v6, v0, Lf4/g;->f:Lp5/a0;

    invoke-interface {v9, v6, v8}, Lx3/b0;->e(Lp5/a0;I)V

    iget-object v6, v0, Lf4/g;->G:[Lx3/b0;

    array-length v6, v6

    if-lez v6, :cond_a

    iget-object v6, v5, Lf4/o;->f:Ls3/m1;

    iget-object v6, v6, Ls3/m1;->s:Ljava/lang/String;

    aget-byte v13, v10, v7

    invoke-static {v6, v13}, Lp5/w;->g(Ljava/lang/String;B)Z

    move-result v6

    if-eqz v6, :cond_a

    move v6, v8

    goto :goto_2

    :cond_a
    move v6, v4

    :goto_2
    iput-boolean v6, v0, Lf4/g;->D:Z

    iget v6, v0, Lf4/g;->B:I

    add-int/lit8 v6, v6, 0x5

    iput v6, v0, Lf4/g;->B:I

    iget v6, v0, Lf4/g;->A:I

    add-int/2addr v6, v11

    iput v6, v0, Lf4/g;->A:I

    const/4 v6, 0x3

    goto :goto_1

    :cond_b
    const-string v1, "Invalid NAL length"

    invoke-static {v1, v3}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object v1

    throw v1

    :cond_c
    iget-boolean v13, v0, Lf4/g;->D:Z

    if-eqz v13, :cond_d

    iget-object v13, v0, Lf4/g;->g:Lp5/a0;

    invoke-virtual {v13, v6}, Lp5/a0;->P(I)V

    iget-object v6, v0, Lf4/g;->g:Lp5/a0;

    invoke-virtual {v6}, Lp5/a0;->e()[B

    move-result-object v6

    iget v13, v0, Lf4/g;->C:I

    invoke-interface {v1, v6, v4, v13}, Lx3/l;->readFully([BII)V

    iget-object v6, v0, Lf4/g;->g:Lp5/a0;

    iget v13, v0, Lf4/g;->C:I

    invoke-interface {v9, v6, v13}, Lx3/b0;->e(Lp5/a0;I)V

    iget v6, v0, Lf4/g;->C:I

    iget-object v13, v0, Lf4/g;->g:Lp5/a0;

    invoke-virtual {v13}, Lp5/a0;->e()[B

    move-result-object v13

    iget-object v7, v0, Lf4/g;->g:Lp5/a0;

    invoke-virtual {v7}, Lp5/a0;->g()I

    move-result v7

    invoke-static {v13, v7}, Lp5/w;->q([BI)I

    move-result v7

    iget-object v13, v0, Lf4/g;->g:Lp5/a0;

    iget-object v8, v5, Lf4/o;->f:Ls3/m1;

    iget-object v8, v8, Ls3/m1;->s:Ljava/lang/String;

    const-string v3, "video/hevc"

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13, v3}, Lp5/a0;->T(I)V

    iget-object v3, v0, Lf4/g;->g:Lp5/a0;

    invoke-virtual {v3, v7}, Lp5/a0;->S(I)V

    iget-object v3, v0, Lf4/g;->g:Lp5/a0;

    iget-object v7, v0, Lf4/g;->G:[Lx3/b0;

    invoke-static {v14, v15, v3, v7}, Lx3/b;->a(JLp5/a0;[Lx3/b0;)V

    goto :goto_3

    :cond_d
    invoke-interface {v9, v1, v6, v4}, Lx3/b0;->c(Lo5/h;IZ)I

    move-result v6

    :goto_3
    iget v3, v0, Lf4/g;->B:I

    add-int/2addr v3, v6

    iput v3, v0, Lf4/g;->B:I

    iget v3, v0, Lf4/g;->C:I

    sub-int/2addr v3, v6

    iput v3, v0, Lf4/g;->C:I

    const/4 v3, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x4

    const/4 v8, 0x1

    goto/16 :goto_1

    :cond_e
    :goto_4
    iget v3, v0, Lf4/g;->B:I

    iget v5, v0, Lf4/g;->A:I

    if-ge v3, v5, :cond_f

    sub-int/2addr v5, v3

    invoke-interface {v9, v1, v5, v4}, Lx3/b0;->c(Lo5/h;IZ)I

    move-result v3

    iget v5, v0, Lf4/g;->B:I

    add-int/2addr v5, v3

    iput v5, v0, Lf4/g;->B:I

    goto :goto_4

    :cond_f
    invoke-virtual {v2}, Lf4/g$b;->c()I

    move-result v12

    invoke-virtual {v2}, Lf4/g$b;->g()Lf4/p;

    move-result-object v1

    if-eqz v1, :cond_10

    iget-object v1, v1, Lf4/p;->c:Lx3/b0$a;

    goto :goto_5

    :cond_10
    const/4 v1, 0x0

    :goto_5
    iget v13, v0, Lf4/g;->A:I

    const/4 v3, 0x0

    move-wide v10, v14

    move-wide v4, v14

    move v14, v3

    move-object v15, v1

    invoke-interface/range {v9 .. v15}, Lx3/b0;->a(JIIILx3/b0$a;)V

    invoke-virtual {v0, v4, v5}, Lf4/g;->t(J)V

    invoke-virtual {v2}, Lf4/g$b;->h()Z

    move-result v1

    if-nez v1, :cond_11

    const/4 v1, 0x0

    iput-object v1, v0, Lf4/g;->z:Lf4/g$b;

    :cond_11
    const/4 v1, 0x3

    iput v1, v0, Lf4/g;->p:I

    const/4 v1, 0x1

    return v1
.end method

.method public b(Lx3/m;)V
    .locals 12

    iput-object p1, p0, Lf4/g;->E:Lx3/m;

    invoke-virtual {p0}, Lf4/g;->e()V

    invoke-virtual {p0}, Lf4/g;->k()V

    iget-object v0, p0, Lf4/g;->b:Lf4/o;

    if-eqz v0, :cond_0

    new-instance v1, Lf4/g$b;

    iget v0, v0, Lf4/o;->b:I

    const/4 v2, 0x0

    invoke-interface {p1, v2, v0}, Lx3/m;->e(II)Lx3/b0;

    move-result-object p1

    new-instance v0, Lf4/r;

    iget-object v4, p0, Lf4/g;->b:Lf4/o;

    new-array v5, v2, [J

    new-array v6, v2, [I

    const/4 v7, 0x0

    new-array v8, v2, [J

    new-array v9, v2, [I

    const-wide/16 v10, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v11}, Lf4/r;-><init>(Lf4/o;[J[II[J[IJ)V

    new-instance v3, Lf4/c;

    invoke-direct {v3, v2, v2, v2, v2}, Lf4/c;-><init>(IIII)V

    invoke-direct {v1, p1, v0, v3}, Lf4/g$b;-><init>(Lx3/b0;Lf4/r;Lf4/c;)V

    iget-object p1, p0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-virtual {p1, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object p1, p0, Lf4/g;->E:Lx3/m;

    invoke-interface {p1}, Lx3/m;->n()V

    :cond_0
    return-void
.end method

.method public c(JJ)V
    .locals 2

    iget-object p1, p0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    const/4 p2, 0x0

    move v0, p2

    :goto_0
    if-ge v0, p1, :cond_0

    iget-object v1, p0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4/g$b;

    invoke-virtual {v1}, Lf4/g$b;->k()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lf4/g;->n:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    iput p2, p0, Lf4/g;->v:I

    iput-wide p3, p0, Lf4/g;->w:J

    iget-object p1, p0, Lf4/g;->m:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    invoke-virtual {p0}, Lf4/g;->e()V

    return-void
.end method

.method public final e()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lf4/g;->p:I

    iput v0, p0, Lf4/g;->s:I

    return-void
.end method

.method public final f(Landroid/util/SparseArray;I)Lf4/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Lf4/c;",
            ">;I)",
            "Lf4/c;"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, Lf4/c;

    return-object p1

    :cond_0
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf4/c;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0
.end method

.method public g(Lx3/l;Lx3/y;)I
    .locals 1

    :cond_0
    :goto_0
    iget p2, p0, Lf4/g;->p:I

    if-eqz p2, :cond_3

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    invoke-virtual {p0, p1}, Lf4/g;->N(Lx3/l;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p0, p1}, Lf4/g;->M(Lx3/l;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Lf4/g;->L(Lx3/l;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1}, Lf4/g;->K(Lx3/l;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, -0x1

    return p1
.end method

.method public h(Lx3/l;)Z
    .locals 0

    invoke-static {p1}, Lf4/n;->b(Lx3/l;)Z

    move-result p1

    return p1
.end method

.method public final k()V
    .locals 8

    const/4 v0, 0x2

    new-array v0, v0, [Lx3/b0;

    iput-object v0, p0, Lf4/g;->F:[Lx3/b0;

    iget-object v1, p0, Lf4/g;->o:Lx3/b0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iget v3, p0, Lf4/g;->a:I

    and-int/lit8 v3, v3, 0x4

    const/16 v4, 0x64

    if-eqz v3, :cond_1

    add-int/lit8 v3, v1, 0x1

    iget-object v5, p0, Lf4/g;->E:Lx3/m;

    const/16 v6, 0x65

    const/4 v7, 0x5

    invoke-interface {v5, v4, v7}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v4

    aput-object v4, v0, v1

    move v1, v3

    move v4, v6

    :cond_1
    iget-object v0, p0, Lf4/g;->F:[Lx3/b0;

    invoke-static {v0, v1}, Lp5/n0;->G0([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx3/b0;

    iput-object v0, p0, Lf4/g;->F:[Lx3/b0;

    array-length v1, v0

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_2

    aget-object v5, v0, v3

    sget-object v6, Lf4/g;->K:Ls3/m1;

    invoke-interface {v5, v6}, Lx3/b0;->b(Ls3/m1;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lf4/g;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lx3/b0;

    iput-object v0, p0, Lf4/g;->G:[Lx3/b0;

    :goto_2
    iget-object v0, p0, Lf4/g;->G:[Lx3/b0;

    array-length v0, v0

    if-ge v2, v0, :cond_3

    iget-object v0, p0, Lf4/g;->E:Lx3/m;

    add-int/lit8 v1, v4, 0x1

    const/4 v3, 0x3

    invoke-interface {v0, v4, v3}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v0

    iget-object v3, p0, Lf4/g;->c:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls3/m1;

    invoke-interface {v0, v3}, Lx3/b0;->b(Ls3/m1;)V

    iget-object v3, p0, Lf4/g;->G:[Lx3/b0;

    aput-object v0, v3, v2

    add-int/lit8 v2, v2, 0x1

    move v4, v1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public n(Lf4/o;)Lf4/o;
    .locals 0

    return-object p1
.end method

.method public final o(Lf4/a$a;)V
    .locals 2

    iget v0, p1, Lf4/a;->a:I

    const v1, 0x6d6f6f76

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lf4/g;->s(Lf4/a$a;)V

    goto :goto_0

    :cond_0
    const v1, 0x6d6f6f66

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1}, Lf4/g;->r(Lf4/a$a;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lf4/g;->m:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lf4/g;->m:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/a$a;

    invoke-virtual {v0, p1}, Lf4/a$a;->d(Lf4/a$a;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final p(Lp5/a0;)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lf4/g;->F:[Lx3/b0;

    array-length v2, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lp5/a0;->T(I)V

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->p()I

    move-result v2

    invoke-static {v2}, Lf4/a;->c(I)I

    move-result v2

    const/4 v3, 0x1

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Skipping unsupported emsg version: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FragmentedMp4Extractor"

    invoke-static {v2, v1}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lp5/a0;->I()J

    move-result-wide v12

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->L()J

    move-result-wide v6

    const-wide/32 v8, 0xf4240

    move-wide v10, v12

    invoke-static/range {v6 .. v11}, Lp5/n0;->N0(JJJ)J

    move-result-wide v14

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->I()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    invoke-static/range {v6 .. v11}, Lp5/n0;->N0(JJJ)J

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->I()J

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->A()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->A()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    move-object/from16 v20, v2

    move-wide/from16 v22, v6

    move-wide/from16 v24, v8

    move-object/from16 v21, v10

    move-wide v8, v4

    goto :goto_1

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lp5/a0;->A()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->A()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->I()J

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->I()J

    move-result-wide v11

    const-wide/32 v13, 0xf4240

    move-wide v15, v6

    invoke-static/range {v11 .. v16}, Lp5/n0;->N0(JJJ)J

    move-result-wide v8

    iget-wide v11, v0, Lf4/g;->y:J

    cmp-long v13, v11, v4

    if-eqz v13, :cond_3

    add-long/2addr v11, v8

    move-wide/from16 v17, v11

    goto :goto_0

    :cond_3
    move-wide/from16 v17, v4

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lp5/a0;->I()J

    move-result-wide v11

    const-wide/16 v13, 0x3e8

    move-wide v15, v6

    invoke-static/range {v11 .. v16}, Lp5/n0;->N0(JJJ)J

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->I()J

    move-result-wide v11

    move-object/from16 v20, v2

    move-wide/from16 v22, v6

    move-object/from16 v21, v10

    move-wide/from16 v24, v11

    move-wide/from16 v14, v17

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lp5/a0;->a()I

    move-result v2

    new-array v2, v2, [B

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->a()I

    move-result v6

    const/4 v7, 0x0

    invoke-virtual {v1, v2, v7, v6}, Lp5/a0;->l([BII)V

    new-instance v1, Lm4/a;

    move-object/from16 v19, v1

    move-object/from16 v26, v2

    invoke-direct/range {v19 .. v26}, Lm4/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    new-instance v2, Lp5/a0;

    iget-object v6, v0, Lf4/g;->k:Lm4/c;

    invoke-virtual {v6, v1}, Lm4/c;->a(Lm4/a;)[B

    move-result-object v1

    invoke-direct {v2, v1}, Lp5/a0;-><init>([B)V

    invoke-virtual {v2}, Lp5/a0;->a()I

    move-result v1

    iget-object v6, v0, Lf4/g;->F:[Lx3/b0;

    array-length v10, v6

    move v11, v7

    :goto_2
    if-ge v11, v10, :cond_4

    aget-object v12, v6, v11

    invoke-virtual {v2, v7}, Lp5/a0;->T(I)V

    invoke-interface {v12, v2, v1}, Lx3/b0;->e(Lp5/a0;I)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_4
    cmp-long v2, v14, v4

    if-nez v2, :cond_5

    iget-object v2, v0, Lf4/g;->n:Ljava/util/ArrayDeque;

    new-instance v4, Lf4/g$a;

    invoke-direct {v4, v8, v9, v3, v1}, Lf4/g$a;-><init>(JZI)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    :goto_3
    iget v2, v0, Lf4/g;->v:I

    add-int/2addr v2, v1

    iput v2, v0, Lf4/g;->v:I

    goto :goto_5

    :cond_5
    iget-object v2, v0, Lf4/g;->n:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, v0, Lf4/g;->n:Ljava/util/ArrayDeque;

    new-instance v3, Lf4/g$a;

    invoke-direct {v3, v14, v15, v7, v1}, Lf4/g$a;-><init>(JZI)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    iget-object v2, v0, Lf4/g;->j:Lp5/j0;

    if-eqz v2, :cond_7

    invoke-virtual {v2, v14, v15}, Lp5/j0;->a(J)J

    move-result-wide v14

    :cond_7
    iget-object v2, v0, Lf4/g;->F:[Lx3/b0;

    array-length v3, v2

    :goto_4
    if-ge v7, v3, :cond_8

    aget-object v16, v2, v7

    const/16 v19, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-wide/from16 v17, v14

    move/from16 v20, v1

    invoke-interface/range {v16 .. v22}, Lx3/b0;->a(JIIILx3/b0$a;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_8
    :goto_5
    return-void
.end method

.method public final q(Lf4/a$b;J)V
    .locals 2

    iget-object v0, p0, Lf4/g;->m:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p2, p0, Lf4/g;->m:Ljava/util/ArrayDeque;

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lf4/a$a;

    invoke-virtual {p2, p1}, Lf4/a$a;->e(Lf4/a$b;)V

    goto :goto_0

    :cond_0
    iget v0, p1, Lf4/a;->a:I

    const v1, 0x73696478

    if-ne v0, v1, :cond_1

    iget-object p1, p1, Lf4/a$b;->b:Lp5/a0;

    invoke-static {p1, p2, p3}, Lf4/g;->B(Lp5/a0;J)Landroid/util/Pair;

    move-result-object p1

    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    iput-wide p2, p0, Lf4/g;->y:J

    iget-object p2, p0, Lf4/g;->E:Lx3/m;

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lx3/z;

    invoke-interface {p2, p1}, Lx3/m;->j(Lx3/z;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lf4/g;->H:Z

    goto :goto_0

    :cond_1
    const p2, 0x656d7367

    if-ne v0, p2, :cond_2

    iget-object p1, p1, Lf4/a$b;->b:Lp5/a0;

    invoke-virtual {p0, p1}, Lf4/g;->p(Lp5/a0;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final r(Lf4/a$a;)V
    .locals 7

    iget-object v0, p0, Lf4/g;->d:Landroid/util/SparseArray;

    iget-object v1, p0, Lf4/g;->b:Lf4/o;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iget v3, p0, Lf4/g;->a:I

    iget-object v4, p0, Lf4/g;->h:[B

    invoke-static {p1, v0, v1, v3, v4}, Lf4/g;->v(Lf4/a$a;Landroid/util/SparseArray;ZI[B)V

    iget-object p1, p1, Lf4/a$a;->c:Ljava/util/List;

    invoke-static {p1}, Lf4/g;->i(Ljava/util/List;)Lw3/m;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    move v1, v2

    :goto_1
    if-ge v1, v0, :cond_1

    iget-object v3, p0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf4/g$b;

    invoke-virtual {v3, p1}, Lf4/g$b;->n(Lw3/m;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    iget-wide v0, p0, Lf4/g;->w:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v3

    if-eqz p1, :cond_3

    iget-object p1, p0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    :goto_2
    if-ge v2, p1, :cond_2

    iget-object v0, p0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/g$b;

    iget-wide v5, p0, Lf4/g;->w:J

    invoke-virtual {v0, v5, v6}, Lf4/g$b;->l(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    iput-wide v3, p0, Lf4/g;->w:J

    :cond_3
    return-void
.end method

.method public release()V
    .locals 0

    return-void
.end method

.method public final s(Lf4/a$a;)V
    .locals 13

    iget-object v0, p0, Lf4/g;->b:Lf4/o;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v3, "Unexpected moov box."

    invoke-static {v0, v3}, Lp5/a;->g(ZLjava/lang/Object;)V

    iget-object v0, p1, Lf4/a$a;->c:Ljava/util/List;

    invoke-static {v0}, Lf4/g;->i(Ljava/util/List;)Lw3/m;

    move-result-object v7

    const v0, 0x6d766578

    invoke-virtual {p1, v0}, Lf4/a$a;->f(I)Lf4/a$a;

    move-result-object v0

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/a$a;

    new-instance v11, Landroid/util/SparseArray;

    invoke-direct {v11}, Landroid/util/SparseArray;-><init>()V

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v5, v0, Lf4/a$a;->c:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    move-wide v8, v3

    move v3, v2

    :goto_1
    if-ge v3, v5, :cond_3

    iget-object v4, v0, Lf4/a$a;->c:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf4/a$b;

    iget v6, v4, Lf4/a;->a:I

    const v10, 0x74726578

    if-ne v6, v10, :cond_1

    iget-object v4, v4, Lf4/a$b;->b:Lp5/a0;

    invoke-static {v4}, Lf4/g;->F(Lp5/a0;)Landroid/util/Pair;

    move-result-object v4

    iget-object v6, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Lf4/c;

    invoke-virtual {v11, v6, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_2

    :cond_1
    const v10, 0x6d656864

    if-ne v6, v10, :cond_2

    iget-object v4, v4, Lf4/a$b;->b:Lp5/a0;

    invoke-static {v4}, Lf4/g;->u(Lp5/a0;)J

    move-result-wide v8

    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    new-instance v4, Lx3/v;

    invoke-direct {v4}, Lx3/v;-><init>()V

    iget v0, p0, Lf4/g;->a:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_4

    move v0, v1

    goto :goto_3

    :cond_4
    move v0, v2

    :goto_3
    const/4 v10, 0x0

    new-instance v12, Lf4/e;

    invoke-direct {v12, p0}, Lf4/e;-><init>(Lf4/g;)V

    move-object v3, p1

    move-wide v5, v8

    move v8, v0

    move v9, v10

    move-object v10, v12

    invoke-static/range {v3 .. v10}, Lf4/b;->A(Lf4/a$a;Lx3/v;JLw3/m;ZZLh7/g;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v3, p0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-nez v3, :cond_6

    :goto_4
    if-ge v2, v0, :cond_5

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4/r;

    iget-object v3, v1, Lf4/r;->a:Lf4/o;

    new-instance v4, Lf4/g$b;

    iget-object v5, p0, Lf4/g;->E:Lx3/m;

    iget v6, v3, Lf4/o;->b:I

    invoke-interface {v5, v2, v6}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v5

    iget v6, v3, Lf4/o;->a:I

    invoke-virtual {p0, v11, v6}, Lf4/g;->f(Landroid/util/SparseArray;I)Lf4/c;

    move-result-object v6

    invoke-direct {v4, v5, v1, v6}, Lf4/g$b;-><init>(Lx3/b0;Lf4/r;Lf4/c;)V

    iget-object v1, p0, Lf4/g;->d:Landroid/util/SparseArray;

    iget v5, v3, Lf4/o;->a:I

    invoke-virtual {v1, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-wide v4, p0, Lf4/g;->x:J

    iget-wide v6, v3, Lf4/o;->e:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    iput-wide v3, p0, Lf4/g;->x:J

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_5
    iget-object p1, p0, Lf4/g;->E:Lx3/m;

    invoke-interface {p1}, Lx3/m;->n()V

    goto :goto_7

    :cond_6
    iget-object v3, p0, Lf4/g;->d:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ne v3, v0, :cond_7

    goto :goto_5

    :cond_7
    move v1, v2

    :goto_5
    invoke-static {v1}, Lp5/a;->f(Z)V

    :goto_6
    if-ge v2, v0, :cond_8

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4/r;

    iget-object v3, v1, Lf4/r;->a:Lf4/o;

    iget-object v4, p0, Lf4/g;->d:Landroid/util/SparseArray;

    iget v5, v3, Lf4/o;->a:I

    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf4/g$b;

    iget v3, v3, Lf4/o;->a:I

    invoke-virtual {p0, v11, v3}, Lf4/g;->f(Landroid/util/SparseArray;I)Lf4/c;

    move-result-object v3

    invoke-virtual {v4, v1, v3}, Lf4/g$b;->j(Lf4/r;Lf4/c;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_8
    :goto_7
    return-void
.end method

.method public final t(J)V
    .locals 13

    :cond_0
    iget-object v0, p0, Lf4/g;->n:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lf4/g;->n:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/g$a;

    iget v1, p0, Lf4/g;->v:I

    iget v2, v0, Lf4/g$a;->c:I

    sub-int/2addr v1, v2

    iput v1, p0, Lf4/g;->v:I

    iget-wide v1, v0, Lf4/g$a;->a:J

    iget-boolean v3, v0, Lf4/g$a;->b:Z

    if-eqz v3, :cond_1

    add-long/2addr v1, p1

    :cond_1
    iget-object v3, p0, Lf4/g;->j:Lp5/j0;

    if-eqz v3, :cond_2

    invoke-virtual {v3, v1, v2}, Lp5/j0;->a(J)J

    move-result-wide v1

    :cond_2
    iget-object v10, p0, Lf4/g;->F:[Lx3/b0;

    array-length v11, v10

    const/4 v3, 0x0

    move v12, v3

    :goto_0
    if-ge v12, v11, :cond_0

    aget-object v3, v10, v12

    const/4 v6, 0x1

    iget v7, v0, Lf4/g$a;->c:I

    iget v8, p0, Lf4/g;->v:I

    const/4 v9, 0x0

    move-wide v4, v1

    invoke-interface/range {v3 .. v9}, Lx3/b0;->a(JIIILx3/b0$a;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
