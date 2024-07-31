.class public final Lw4/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/m;
.implements Lw4/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw4/e$a;
    }
.end annotation


# static fields
.field public static final q:Lw4/g$a;

.field public static final r:Lx3/y;


# instance fields
.field public final h:Lx3/k;

.field public final i:I

.field public final j:Ls3/m1;

.field public final k:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lw4/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public l:Z

.field public m:Lw4/g$b;

.field public n:J

.field public o:Lx3/z;

.field public p:[Ls3/m1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lw4/d;->a:Lw4/d;

    sput-object v0, Lw4/e;->q:Lw4/g$a;

    new-instance v0, Lx3/y;

    invoke-direct {v0}, Lx3/y;-><init>()V

    sput-object v0, Lw4/e;->r:Lx3/y;

    return-void
.end method

.method public constructor <init>(Lx3/k;ILs3/m1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/e;->h:Lx3/k;

    iput p2, p0, Lw4/e;->i:I

    iput-object p3, p0, Lw4/e;->j:Ls3/m1;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lw4/e;->k:Landroid/util/SparseArray;

    return-void
.end method

.method public static synthetic f(ILs3/m1;ZLjava/util/List;Lx3/b0;Lt3/s1;)Lw4/g;
    .locals 0

    invoke-static/range {p0 .. p5}, Lw4/e;->g(ILs3/m1;ZLjava/util/List;Lx3/b0;Lt3/s1;)Lw4/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(ILs3/m1;ZLjava/util/List;Lx3/b0;Lt3/s1;)Lw4/g;
    .locals 6

    iget-object p5, p1, Ls3/m1;->r:Ljava/lang/String;

    invoke-static {p5}, Lp5/v;->r(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p5}, Lp5/v;->q(Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_1

    new-instance p2, Ld4/e;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Ld4/e;-><init>(I)V

    goto :goto_0

    :cond_1
    const/4 p5, 0x0

    if-eqz p2, :cond_2

    const/4 p5, 0x4

    :cond_2
    move v1, p5

    new-instance p2, Lf4/g;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lf4/g;-><init>(ILp5/j0;Lf4/o;Ljava/util/List;Lx3/b0;)V

    :goto_0
    new-instance p3, Lw4/e;

    invoke-direct {p3, p2, p0, p1}, Lw4/e;-><init>(Lx3/k;ILs3/m1;)V

    return-object p3
.end method


# virtual methods
.method public a(Lx3/l;)Z
    .locals 3

    iget-object v0, p0, Lw4/e;->h:Lx3/k;

    sget-object v1, Lw4/e;->r:Lx3/y;

    invoke-interface {v0, p1, v1}, Lx3/k;->g(Lx3/l;Lx3/y;)I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    invoke-static {v2}, Lp5/a;->f(Z)V

    if-nez p1, :cond_1

    move v0, v1

    :cond_1
    return v0
.end method

.method public b(Lw4/g$b;JJ)V
    .locals 5

    iput-object p1, p0, Lw4/e;->m:Lw4/g$b;

    iput-wide p4, p0, Lw4/e;->n:J

    iget-boolean v0, p0, Lw4/e;->l:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v3, 0x0

    if-nez v0, :cond_1

    iget-object p1, p0, Lw4/e;->h:Lx3/k;

    invoke-interface {p1, p0}, Lx3/k;->b(Lx3/m;)V

    cmp-long p1, p2, v1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lw4/e;->h:Lx3/k;

    invoke-interface {p1, v3, v4, p2, p3}, Lx3/k;->c(JJ)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lw4/e;->l:Z

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lw4/e;->h:Lx3/k;

    cmp-long v1, p2, v1

    if-nez v1, :cond_2

    move-wide p2, v3

    :cond_2
    invoke-interface {v0, v3, v4, p2, p3}, Lx3/k;->c(JJ)V

    const/4 p2, 0x0

    :goto_0
    iget-object p3, p0, Lw4/e;->k:Landroid/util/SparseArray;

    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result p3

    if-ge p2, p3, :cond_3

    iget-object p3, p0, Lw4/e;->k:Landroid/util/SparseArray;

    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lw4/e$a;

    invoke-virtual {p3, p1, p4, p5}, Lw4/e$a;->g(Lw4/g$b;J)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public c()[Ls3/m1;
    .locals 1

    iget-object v0, p0, Lw4/e;->p:[Ls3/m1;

    return-object v0
.end method

.method public d()Lx3/c;
    .locals 2

    iget-object v0, p0, Lw4/e;->o:Lx3/z;

    instance-of v1, v0, Lx3/c;

    if-eqz v1, :cond_0

    check-cast v0, Lx3/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public e(II)Lx3/b0;
    .locals 3

    iget-object v0, p0, Lw4/e;->k:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw4/e$a;

    if-nez v0, :cond_2

    iget-object v0, p0, Lw4/e;->p:[Ls3/m1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    new-instance v0, Lw4/e$a;

    iget v1, p0, Lw4/e;->i:I

    if-ne p2, v1, :cond_1

    iget-object v1, p0, Lw4/e;->j:Ls3/m1;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-direct {v0, p1, p2, v1}, Lw4/e$a;-><init>(IILs3/m1;)V

    iget-object p2, p0, Lw4/e;->m:Lw4/g$b;

    iget-wide v1, p0, Lw4/e;->n:J

    invoke-virtual {v0, p2, v1, v2}, Lw4/e$a;->g(Lw4/g$b;J)V

    iget-object p2, p0, Lw4/e;->k:Landroid/util/SparseArray;

    invoke-virtual {p2, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_2
    return-object v0
.end method

.method public j(Lx3/z;)V
    .locals 0

    iput-object p1, p0, Lw4/e;->o:Lx3/z;

    return-void
.end method

.method public n()V
    .locals 3

    iget-object v0, p0, Lw4/e;->k:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    new-array v0, v0, [Ls3/m1;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lw4/e;->k:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lw4/e;->k:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw4/e$a;

    iget-object v2, v2, Lw4/e$a;->e:Ls3/m1;

    invoke-static {v2}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls3/m1;

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lw4/e;->p:[Ls3/m1;

    return-void
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lw4/e;->h:Lx3/k;

    invoke-interface {v0}, Lx3/k;->release()V

    return-void
.end method
