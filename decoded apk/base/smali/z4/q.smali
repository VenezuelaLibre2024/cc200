.class public final Lz4/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/e0$b;
.implements Lo5/e0$f;
.implements Lu4/n0;
.implements Lx3/m;
.implements Lu4/l0$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz4/q$c;,
        Lz4/q$d;,
        Lz4/q$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo5/e0$b<",
        "Lw4/f;",
        ">;",
        "Lo5/e0$f;",
        "Lu4/n0;",
        "Lx3/m;",
        "Lu4/l0$d;"
    }
.end annotation


# static fields
.field public static final f0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lw3/m;",
            ">;"
        }
    .end annotation
.end field

.field public B:Lw4/f;

.field public C:[Lz4/q$d;

.field public D:[I

.field public E:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public F:Landroid/util/SparseIntArray;

.field public G:Lx3/b0;

.field public H:I

.field public I:I

.field public J:Z

.field public K:Z

.field public L:I

.field public M:Ls3/m1;

.field public N:Ls3/m1;

.field public O:Z

.field public P:Lu4/u0;

.field public Q:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lu4/s0;",
            ">;"
        }
    .end annotation
.end field

.field public R:[I

.field public S:I

.field public T:Z

.field public U:[Z

.field public V:[Z

.field public W:J

.field public X:J

.field public Y:Z

.field public Z:Z

.field public a0:Z

.field public b0:Z

.field public c0:J

.field public d0:Lw3/m;

.field public e0:Lz4/j;

.field public final h:Ljava/lang/String;

.field public final i:I

.field public final j:Lz4/q$b;

.field public final k:Lz4/f;

.field public final l:Lo5/b;

.field public final m:Ls3/m1;

.field public final n:Lw3/v;

.field public final o:Lw3/u$a;

.field public final p:Lo5/d0;

.field public final q:Lo5/e0;

.field public final r:Lu4/a0$a;

.field public final s:I

.field public final t:Lz4/f$b;

.field public final u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lz4/j;",
            ">;"
        }
    .end annotation
.end field

.field public final v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lz4/j;",
            ">;"
        }
    .end annotation
.end field

.field public final w:Ljava/lang/Runnable;

.field public final x:Ljava/lang/Runnable;

.field public final y:Landroid/os/Handler;

.field public final z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lz4/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lz4/q;->f0:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILz4/q$b;Lz4/f;Ljava/util/Map;Lo5/b;JLs3/m1;Lw3/v;Lw3/u$a;Lo5/d0;Lu4/a0$a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lz4/q$b;",
            "Lz4/f;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lw3/m;",
            ">;",
            "Lo5/b;",
            "J",
            "Ls3/m1;",
            "Lw3/v;",
            "Lw3/u$a;",
            "Lo5/d0;",
            "Lu4/a0$a;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/q;->h:Ljava/lang/String;

    iput p2, p0, Lz4/q;->i:I

    iput-object p3, p0, Lz4/q;->j:Lz4/q$b;

    iput-object p4, p0, Lz4/q;->k:Lz4/f;

    iput-object p5, p0, Lz4/q;->A:Ljava/util/Map;

    iput-object p6, p0, Lz4/q;->l:Lo5/b;

    iput-object p9, p0, Lz4/q;->m:Ls3/m1;

    iput-object p10, p0, Lz4/q;->n:Lw3/v;

    iput-object p11, p0, Lz4/q;->o:Lw3/u$a;

    iput-object p12, p0, Lz4/q;->p:Lo5/d0;

    iput-object p13, p0, Lz4/q;->r:Lu4/a0$a;

    iput p14, p0, Lz4/q;->s:I

    new-instance p1, Lo5/e0;

    const-string p2, "Loader:HlsSampleStreamWrapper"

    invoke-direct {p1, p2}, Lo5/e0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lz4/q;->q:Lo5/e0;

    new-instance p1, Lz4/f$b;

    invoke-direct {p1}, Lz4/f$b;-><init>()V

    iput-object p1, p0, Lz4/q;->t:Lz4/f$b;

    const/4 p1, 0x0

    new-array p2, p1, [I

    iput-object p2, p0, Lz4/q;->D:[I

    new-instance p2, Ljava/util/HashSet;

    sget-object p3, Lz4/q;->f0:Ljava/util/Set;

    invoke-interface {p3}, Ljava/util/Set;->size()I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/HashSet;-><init>(I)V

    iput-object p2, p0, Lz4/q;->E:Ljava/util/Set;

    new-instance p2, Landroid/util/SparseIntArray;

    invoke-interface {p3}, Ljava/util/Set;->size()I

    move-result p3

    invoke-direct {p2, p3}, Landroid/util/SparseIntArray;-><init>(I)V

    iput-object p2, p0, Lz4/q;->F:Landroid/util/SparseIntArray;

    new-array p2, p1, [Lz4/q$d;

    iput-object p2, p0, Lz4/q;->C:[Lz4/q$d;

    new-array p2, p1, [Z

    iput-object p2, p0, Lz4/q;->V:[Z

    new-array p1, p1, [Z

    iput-object p1, p0, Lz4/q;->U:[Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lz4/q;->v:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lz4/q;->z:Ljava/util/ArrayList;

    new-instance p1, Lz4/p;

    invoke-direct {p1, p0}, Lz4/p;-><init>(Lz4/q;)V

    iput-object p1, p0, Lz4/q;->w:Ljava/lang/Runnable;

    new-instance p1, Lz4/o;

    invoke-direct {p1, p0}, Lz4/o;-><init>(Lz4/q;)V

    iput-object p1, p0, Lz4/q;->x:Ljava/lang/Runnable;

    invoke-static {}, Lp5/n0;->w()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lz4/q;->y:Landroid/os/Handler;

    iput-wide p7, p0, Lz4/q;->W:J

    iput-wide p7, p0, Lz4/q;->X:J

    return-void
.end method

.method public static B(II)Lx3/j;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unmapped track with id "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " of type "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "HlsSampleStreamWrapper"

    invoke-static {p1, p0}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Lx3/j;

    invoke-direct {p0}, Lx3/j;-><init>()V

    return-object p0
.end method

.method public static E(Ls3/m1;Ls3/m1;Z)Ls3/m1;
    .locals 7

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p1, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v0}, Lp5/v;->k(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Ls3/m1;->p:Ljava/lang/String;

    invoke-static {v1, v0}, Lp5/n0;->K(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ls3/m1;->p:Ljava/lang/String;

    invoke-static {v1, v0}, Lp5/n0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lp5/v;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ls3/m1;->p:Ljava/lang/String;

    iget-object v3, p1, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v1, v3}, Lp5/v;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p1, Ls3/m1;->s:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1}, Ls3/m1;->b()Ls3/m1$b;

    move-result-object v4

    iget-object v5, p0, Ls3/m1;->h:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v4

    iget-object v5, p0, Ls3/m1;->i:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ls3/m1$b;->W(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v4

    iget-object v5, p0, Ls3/m1;->j:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ls3/m1$b;->X(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v4

    iget v5, p0, Ls3/m1;->k:I

    invoke-virtual {v4, v5}, Ls3/m1$b;->i0(I)Ls3/m1$b;

    move-result-object v4

    iget v5, p0, Ls3/m1;->l:I

    invoke-virtual {v4, v5}, Ls3/m1$b;->e0(I)Ls3/m1$b;

    move-result-object v4

    const/4 v5, -0x1

    if-eqz p2, :cond_2

    iget v6, p0, Ls3/m1;->m:I

    goto :goto_1

    :cond_2
    move v6, v5

    :goto_1
    invoke-virtual {v4, v6}, Ls3/m1$b;->I(I)Ls3/m1$b;

    move-result-object v4

    if-eqz p2, :cond_3

    iget p2, p0, Ls3/m1;->n:I

    goto :goto_2

    :cond_3
    move p2, v5

    :goto_2
    invoke-virtual {v4, p2}, Ls3/m1$b;->b0(I)Ls3/m1$b;

    move-result-object p2

    invoke-virtual {p2, v1}, Ls3/m1$b;->K(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    iget v1, p0, Ls3/m1;->x:I

    invoke-virtual {p2, v1}, Ls3/m1$b;->n0(I)Ls3/m1$b;

    move-result-object v1

    iget v4, p0, Ls3/m1;->y:I

    invoke-virtual {v1, v4}, Ls3/m1$b;->S(I)Ls3/m1$b;

    move-result-object v1

    iget v4, p0, Ls3/m1;->z:F

    invoke-virtual {v1, v4}, Ls3/m1$b;->R(F)Ls3/m1$b;

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {p2, v3}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    :cond_5
    iget v1, p0, Ls3/m1;->F:I

    if-eq v1, v5, :cond_6

    if-ne v0, v2, :cond_6

    invoke-virtual {p2, v1}, Ls3/m1$b;->J(I)Ls3/m1$b;

    :cond_6
    iget-object p0, p0, Ls3/m1;->q:Lk4/a;

    if-eqz p0, :cond_8

    iget-object p1, p1, Ls3/m1;->q:Lk4/a;

    if-eqz p1, :cond_7

    invoke-virtual {p1, p0}, Lk4/a;->b(Lk4/a;)Lk4/a;

    move-result-object p0

    :cond_7
    invoke-virtual {p2, p0}, Ls3/m1$b;->Z(Lk4/a;)Ls3/m1$b;

    :cond_8
    invoke-virtual {p2}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p0

    return-object p0
.end method

.method public static I(Ls3/m1;Ls3/m1;)Z
    .locals 6

    iget-object v0, p0, Ls3/m1;->s:Ljava/lang/String;

    iget-object v1, p1, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v0}, Lp5/v;->k(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x3

    if-eq v2, v5, :cond_1

    invoke-static {v1}, Lp5/v;->k(Ljava/lang/String;)I

    move-result p0

    if-ne v2, p0, :cond_0

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    return v3

    :cond_1
    invoke-static {v0, v1}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v4

    :cond_2
    const-string v1, "application/cea-608"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "application/cea-708"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    return v3

    :cond_4
    :goto_1
    iget p0, p0, Ls3/m1;->K:I

    iget p1, p1, Ls3/m1;->K:I

    if-ne p0, p1, :cond_5

    goto :goto_2

    :cond_5
    move v3, v4

    :goto_2
    return v3
.end method

.method public static L(I)I
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v2, 0x3

    if-eq p0, v0, :cond_1

    if-eq p0, v2, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return v1

    :cond_1
    return v2

    :cond_2
    return v0
.end method

.method public static N(Lw4/f;)Z
    .locals 0

    instance-of p0, p0, Lz4/j;

    return p0
.end method

.method public static synthetic u(Lz4/q;)V
    .locals 0

    invoke-virtual {p0}, Lz4/q;->b0()V

    return-void
.end method

.method public static synthetic v(Lz4/q;)V
    .locals 0

    invoke-virtual {p0}, Lz4/q;->S()V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 2

    iget-boolean v0, p0, Lz4/q;->K:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lz4/q;->W:J

    invoke-virtual {p0, v0, v1}, Lz4/q;->c(J)Z

    :cond_0
    return-void
.end method

.method public final C(II)Lu4/l0;
    .locals 9

    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v0, v0

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    const/4 v2, 0x2

    if-ne p2, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    new-instance v8, Lz4/q$d;

    iget-object v3, p0, Lz4/q;->l:Lo5/b;

    iget-object v4, p0, Lz4/q;->n:Lw3/v;

    iget-object v5, p0, Lz4/q;->o:Lw3/u$a;

    iget-object v6, p0, Lz4/q;->A:Ljava/util/Map;

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lz4/q$d;-><init>(Lo5/b;Lw3/v;Lw3/u$a;Ljava/util/Map;Lz4/q$a;)V

    iget-wide v2, p0, Lz4/q;->W:J

    invoke-virtual {v8, v2, v3}, Lu4/l0;->b0(J)V

    if-eqz v1, :cond_2

    iget-object v2, p0, Lz4/q;->d0:Lw3/m;

    invoke-virtual {v8, v2}, Lz4/q$d;->i0(Lw3/m;)V

    :cond_2
    iget-wide v2, p0, Lz4/q;->c0:J

    invoke-virtual {v8, v2, v3}, Lu4/l0;->a0(J)V

    iget-object v2, p0, Lz4/q;->e0:Lz4/j;

    if-eqz v2, :cond_3

    invoke-virtual {v8, v2}, Lz4/q$d;->j0(Lz4/j;)V

    :cond_3
    invoke-virtual {v8, p0}, Lu4/l0;->d0(Lu4/l0$d;)V

    iget-object v2, p0, Lz4/q;->D:[I

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, Lz4/q;->D:[I

    aput p1, v2, v0

    iget-object p1, p0, Lz4/q;->C:[Lz4/q$d;

    invoke-static {p1, v8}, Lp5/n0;->E0([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lz4/q$d;

    iput-object p1, p0, Lz4/q;->C:[Lz4/q$d;

    iget-object p1, p0, Lz4/q;->V:[Z

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, Lz4/q;->V:[Z

    aput-boolean v1, p1, v0

    iget-boolean v1, p0, Lz4/q;->T:Z

    aget-boolean p1, p1, v0

    or-int/2addr p1, v1

    iput-boolean p1, p0, Lz4/q;->T:Z

    iget-object p1, p0, Lz4/q;->E:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lz4/q;->F:Landroid/util/SparseIntArray;

    invoke-virtual {p1, p2, v0}, Landroid/util/SparseIntArray;->append(II)V

    invoke-static {p2}, Lz4/q;->L(I)I

    move-result p1

    iget v1, p0, Lz4/q;->H:I

    invoke-static {v1}, Lz4/q;->L(I)I

    move-result v1

    if-le p1, v1, :cond_4

    iput v0, p0, Lz4/q;->I:I

    iput p2, p0, Lz4/q;->H:I

    :cond_4
    iget-object p1, p0, Lz4/q;->U:[Z

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, Lz4/q;->U:[Z

    return-object v8
.end method

.method public final D([Lu4/s0;)Lu4/u0;
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    aget-object v2, p1, v1

    iget v3, v2, Lu4/s0;->h:I

    new-array v3, v3, [Ls3/m1;

    move v4, v0

    :goto_1
    iget v5, v2, Lu4/s0;->h:I

    if-ge v4, v5, :cond_0

    invoke-virtual {v2, v4}, Lu4/s0;->b(I)Ls3/m1;

    move-result-object v5

    iget-object v6, p0, Lz4/q;->n:Lw3/v;

    invoke-interface {v6, v5}, Lw3/v;->e(Ls3/m1;)I

    move-result v6

    invoke-virtual {v5, v6}, Ls3/m1;->c(I)Ls3/m1;

    move-result-object v5

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    new-instance v4, Lu4/s0;

    iget-object v2, v2, Lu4/s0;->i:Ljava/lang/String;

    invoke-direct {v4, v2, v3}, Lu4/s0;-><init>(Ljava/lang/String;[Ls3/m1;)V

    aput-object v4, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lu4/u0;

    invoke-direct {v0, p1}, Lu4/u0;-><init>([Lu4/s0;)V

    return-object v0
.end method

.method public final F(I)V
    .locals 7

    iget-object v0, p0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->j()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp5/a;->f(Z)V

    :goto_0
    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, -0x1

    if-ge p1, v0, :cond_1

    invoke-virtual {p0, p1}, Lz4/q;->z(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_1
    if-ne p1, v1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lz4/q;->J()Lz4/j;

    move-result-object v0

    iget-wide v5, v0, Lw4/f;->h:J

    invoke-virtual {p0, p1}, Lz4/q;->G(I)Lz4/j;

    move-result-object p1

    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-wide v0, p0, Lz4/q;->W:J

    iput-wide v0, p0, Lz4/q;->X:J

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-static {v0}, Li7/b0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz4/j;

    invoke-virtual {v0}, Lz4/j;->o()V

    :goto_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lz4/q;->a0:Z

    iget-object v1, p0, Lz4/q;->r:Lu4/a0$a;

    iget v2, p0, Lz4/q;->H:I

    iget-wide v3, p1, Lw4/f;->g:J

    invoke-virtual/range {v1 .. v6}, Lu4/a0$a;->D(IJJ)V

    return-void
.end method

.method public final G(I)Lz4/j;
    .locals 3

    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz4/j;

    iget-object v1, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v1, p1, v2}, Lp5/n0;->M0(Ljava/util/List;II)V

    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v1, v1

    if-ge p1, v1, :cond_0

    invoke-virtual {v0, p1}, Lz4/j;->m(I)I

    move-result v1

    iget-object v2, p0, Lz4/q;->C:[Lz4/q$d;

    aget-object v2, v2, p1

    invoke-virtual {v2, v1}, Lu4/l0;->u(I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final H(Lz4/j;)Z
    .locals 4

    iget p1, p1, Lz4/j;->k:I

    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lz4/q;->U:[Z

    aget-boolean v3, v3, v2

    if-eqz v3, :cond_0

    iget-object v3, p0, Lz4/q;->C:[Lz4/q$d;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lu4/l0;->Q()I

    move-result v3

    if-ne v3, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final J()Lz4/j;
    .locals 2

    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz4/j;

    return-object v0
.end method

.method public final K(II)Lx3/b0;
    .locals 3

    sget-object v0, Lz4/q;->f0:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lp5/a;->a(Z)V

    iget-object v0, p0, Lz4/q;->F:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    invoke-virtual {v0, p2, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v0

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Lz4/q;->E:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lz4/q;->D:[I

    aput p1, v1, v0

    :cond_1
    iget-object v1, p0, Lz4/q;->D:[I

    aget v1, v1, v0

    if-ne v1, p1, :cond_2

    iget-object p1, p0, Lz4/q;->C:[Lz4/q$d;

    aget-object p1, p1, v0

    goto :goto_0

    :cond_2
    invoke-static {p1, p2}, Lz4/q;->B(II)Lx3/j;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final M(Lz4/j;)V
    .locals 6

    iput-object p1, p0, Lz4/q;->e0:Lz4/j;

    iget-object v0, p1, Lw4/f;->d:Ls3/m1;

    iput-object v0, p0, Lz4/q;->M:Ls3/m1;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lz4/q;->X:J

    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Li7/u;->n()Li7/u$a;

    move-result-object v0

    iget-object v1, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v1, v4

    invoke-virtual {v5}, Lu4/l0;->G()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Li7/u$a;->h(Ljava/lang/Object;)Li7/u$a;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Li7/u$a;->k()Li7/u;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Lz4/j;->n(Lz4/q;Li7/u;)V

    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v1, v0

    :goto_1
    if-ge v3, v1, :cond_2

    aget-object v2, v0, v3

    invoke-virtual {v2, p1}, Lz4/q$d;->j0(Lz4/j;)V

    iget-boolean v4, p1, Lz4/j;->n:Z

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Lu4/l0;->g0()V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final O()Z
    .locals 4

    iget-wide v0, p0, Lz4/q;->X:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public P(I)Z
    .locals 1

    invoke-virtual {p0}, Lz4/q;->O()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    aget-object p1, v0, p1

    iget-boolean v0, p0, Lz4/q;->a0:Z

    invoke-virtual {p1, v0}, Lu4/l0;->K(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public Q()Z
    .locals 2

    iget v0, p0, Lz4/q;->H:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final R()V
    .locals 6

    iget-object v0, p0, Lz4/q;->P:Lu4/u0;

    iget v0, v0, Lu4/u0;->h:I

    new-array v1, v0, [I

    iput-object v1, p0, Lz4/q;->R:[I

    const/4 v2, -0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    move v3, v1

    :goto_1
    iget-object v4, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v5, v4

    if-ge v3, v5, :cond_1

    aget-object v4, v4, v3

    invoke-virtual {v4}, Lu4/l0;->F()Ls3/m1;

    move-result-object v4

    invoke-static {v4}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls3/m1;

    iget-object v5, p0, Lz4/q;->P:Lu4/u0;

    invoke-virtual {v5, v2}, Lu4/u0;->b(I)Lu4/s0;

    move-result-object v5

    invoke-virtual {v5, v1}, Lu4/s0;->b(I)Ls3/m1;

    move-result-object v5

    invoke-static {v4, v5}, Lz4/q;->I(Ls3/m1;Ls3/m1;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lz4/q;->R:[I

    aput v3, v4, v2

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lz4/q;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz4/m;

    invoke-virtual {v1}, Lz4/m;->b()V

    goto :goto_3

    :cond_3
    return-void
.end method

.method public final S()V
    .locals 4

    iget-boolean v0, p0, Lz4/q;->O:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lz4/q;->R:[I

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lz4/q;->J:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lu4/l0;->F()Ls3/m1;

    move-result-object v3

    if-nez v3, :cond_1

    return-void

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lz4/q;->P:Lu4/u0;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lz4/q;->R()V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lz4/q;->y()V

    invoke-virtual {p0}, Lz4/q;->k0()V

    iget-object v0, p0, Lz4/q;->j:Lz4/q$b;

    invoke-interface {v0}, Lz4/q$b;->a()V

    :cond_4
    :goto_1
    return-void
.end method

.method public T()V
    .locals 1

    iget-object v0, p0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->a()V

    iget-object v0, p0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v0}, Lz4/f;->n()V

    return-void
.end method

.method public U(I)V
    .locals 1

    invoke-virtual {p0}, Lz4/q;->T()V

    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lu4/l0;->N()V

    return-void
.end method

.method public V(Lw4/f;JJZ)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    iput-object v2, v0, Lz4/q;->B:Lw4/f;

    new-instance v2, Lu4/n;

    iget-wide v4, v1, Lw4/f;->a:J

    iget-object v6, v1, Lw4/f;->b:Lo5/n;

    invoke-virtual/range {p1 .. p1}, Lw4/f;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lw4/f;->e()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lw4/f;->a()J

    move-result-wide v13

    move-object v3, v2

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lu4/n;-><init>(JLo5/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v3, v0, Lz4/q;->p:Lo5/d0;

    iget-wide v4, v1, Lw4/f;->a:J

    invoke-interface {v3, v4, v5}, Lo5/d0;->b(J)V

    iget-object v3, v0, Lz4/q;->r:Lu4/a0$a;

    iget v5, v1, Lw4/f;->c:I

    iget v6, v0, Lz4/q;->i:I

    iget-object v7, v1, Lw4/f;->d:Ls3/m1;

    iget v8, v1, Lw4/f;->e:I

    iget-object v9, v1, Lw4/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lw4/f;->g:J

    iget-wide v12, v1, Lw4/f;->h:J

    move-object v4, v2

    invoke-virtual/range {v3 .. v13}, Lu4/a0$a;->r(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_2

    invoke-virtual {p0}, Lz4/q;->O()Z

    move-result v1

    if-nez v1, :cond_0

    iget v1, v0, Lz4/q;->L:I

    if-nez v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lz4/q;->f0()V

    :cond_1
    iget v1, v0, Lz4/q;->L:I

    if-lez v1, :cond_2

    iget-object v1, v0, Lz4/q;->j:Lz4/q$b;

    invoke-interface {v1, p0}, Lu4/n0$a;->e(Lu4/n0;)V

    :cond_2
    return-void
.end method

.method public W(Lw4/f;JJ)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    iput-object v2, v0, Lz4/q;->B:Lw4/f;

    iget-object v2, v0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v2, v1}, Lz4/f;->p(Lw4/f;)V

    new-instance v2, Lu4/n;

    iget-wide v4, v1, Lw4/f;->a:J

    iget-object v6, v1, Lw4/f;->b:Lo5/n;

    invoke-virtual/range {p1 .. p1}, Lw4/f;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lw4/f;->e()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lw4/f;->a()J

    move-result-wide v13

    move-object v3, v2

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lu4/n;-><init>(JLo5/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v3, v0, Lz4/q;->p:Lo5/d0;

    iget-wide v4, v1, Lw4/f;->a:J

    invoke-interface {v3, v4, v5}, Lo5/d0;->b(J)V

    iget-object v3, v0, Lz4/q;->r:Lu4/a0$a;

    iget v5, v1, Lw4/f;->c:I

    iget v6, v0, Lz4/q;->i:I

    iget-object v7, v1, Lw4/f;->d:Ls3/m1;

    iget v8, v1, Lw4/f;->e:I

    iget-object v9, v1, Lw4/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lw4/f;->g:J

    iget-wide v12, v1, Lw4/f;->h:J

    move-object v4, v2

    invoke-virtual/range {v3 .. v13}, Lu4/a0$a;->u(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V

    iget-boolean v1, v0, Lz4/q;->K:Z

    if-nez v1, :cond_0

    iget-wide v1, v0, Lz4/q;->W:J

    invoke-virtual {p0, v1, v2}, Lz4/q;->c(J)Z

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lz4/q;->j:Lz4/q$b;

    invoke-interface {v1, p0}, Lu4/n0$a;->e(Lu4/n0;)V

    :goto_0
    return-void
.end method

.method public X(Lw4/f;JJLjava/io/IOException;I)Lo5/e0$c;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v13, p6

    invoke-static/range {p1 .. p1}, Lz4/q;->N(Lw4/f;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v3, v1

    check-cast v3, Lz4/j;

    invoke-virtual {v3}, Lz4/j;->q()Z

    move-result v3

    if-nez v3, :cond_1

    instance-of v3, v13, Lo5/a0;

    if-eqz v3, :cond_1

    move-object v3, v13

    check-cast v3, Lo5/a0;

    iget v3, v3, Lo5/a0;->k:I

    const/16 v4, 0x19a

    if-eq v3, v4, :cond_0

    const/16 v4, 0x194

    if-ne v3, v4, :cond_1

    :cond_0
    sget-object v1, Lo5/e0;->d:Lo5/e0$c;

    return-object v1

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lw4/f;->a()J

    move-result-wide v3

    new-instance v5, Lu4/n;

    iget-wide v6, v1, Lw4/f;->a:J

    iget-object v8, v1, Lw4/f;->b:Lo5/n;

    invoke-virtual/range {p1 .. p1}, Lw4/f;->f()Landroid/net/Uri;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lw4/f;->e()Ljava/util/Map;

    move-result-object v19

    move-object v14, v5

    move-wide v15, v6

    move-object/from16 v17, v8

    move-wide/from16 v20, p2

    move-wide/from16 v22, p4

    move-wide/from16 v24, v3

    invoke-direct/range {v14 .. v25}, Lu4/n;-><init>(JLo5/n;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v6, Lu4/q;

    iget v7, v1, Lw4/f;->c:I

    iget v8, v0, Lz4/q;->i:I

    iget-object v9, v1, Lw4/f;->d:Ls3/m1;

    iget v10, v1, Lw4/f;->e:I

    iget-object v11, v1, Lw4/f;->f:Ljava/lang/Object;

    iget-wide v14, v1, Lw4/f;->g:J

    invoke-static {v14, v15}, Lp5/n0;->Y0(J)J

    move-result-wide v26

    iget-wide v14, v1, Lw4/f;->h:J

    invoke-static {v14, v15}, Lp5/n0;->Y0(J)J

    move-result-wide v28

    move-object/from16 v20, v6

    move/from16 v21, v7

    move/from16 v22, v8

    move-object/from16 v23, v9

    move/from16 v24, v10

    move-object/from16 v25, v11

    invoke-direct/range {v20 .. v29}, Lu4/q;-><init>(IILs3/m1;ILjava/lang/Object;JJ)V

    new-instance v7, Lo5/d0$c;

    move/from16 v8, p7

    invoke-direct {v7, v5, v6, v13, v8}, Lo5/d0$c;-><init>(Lu4/n;Lu4/q;Ljava/io/IOException;I)V

    iget-object v6, v0, Lz4/q;->p:Lo5/d0;

    iget-object v8, v0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v8}, Lz4/f;->k()Ln5/s;

    move-result-object v8

    invoke-static {v8}, Ln5/a0;->c(Ln5/s;)Lo5/d0$a;

    move-result-object v8

    invoke-interface {v6, v8, v7}, Lo5/d0;->c(Lo5/d0$a;Lo5/d0$c;)Lo5/d0$b;

    move-result-object v6

    const/4 v8, 0x0

    if-eqz v6, :cond_2

    iget v9, v6, Lo5/d0$b;->a:I

    const/4 v10, 0x2

    if-ne v9, v10, :cond_2

    iget-object v9, v0, Lz4/q;->k:Lz4/f;

    iget-wide v10, v6, Lo5/d0$b;->b:J

    invoke-virtual {v9, v1, v10, v11}, Lz4/f;->m(Lw4/f;J)Z

    move-result v6

    move v15, v6

    goto :goto_0

    :cond_2
    move v15, v8

    :goto_0
    const/4 v6, 0x1

    if-eqz v15, :cond_6

    if-eqz v2, :cond_5

    const-wide/16 v9, 0x0

    cmp-long v2, v3, v9

    if-nez v2, :cond_5

    iget-object v2, v0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v6

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz4/j;

    if-ne v2, v1, :cond_3

    move v8, v6

    :cond_3
    invoke-static {v8}, Lp5/a;->f(Z)V

    iget-object v2, v0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-wide v2, v0, Lz4/q;->W:J

    iput-wide v2, v0, Lz4/q;->X:J

    goto :goto_1

    :cond_4
    iget-object v2, v0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-static {v2}, Li7/b0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz4/j;

    invoke-virtual {v2}, Lz4/j;->o()V

    :cond_5
    :goto_1
    sget-object v2, Lo5/e0;->f:Lo5/e0$c;

    :goto_2
    move-object/from16 v16, v2

    goto :goto_3

    :cond_6
    iget-object v2, v0, Lz4/q;->p:Lo5/d0;

    invoke-interface {v2, v7}, Lo5/d0;->a(Lo5/d0$c;)J

    move-result-wide v2

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v9

    if-eqz v4, :cond_7

    invoke-static {v8, v2, v3}, Lo5/e0;->h(ZJ)Lo5/e0$c;

    move-result-object v2

    goto :goto_2

    :cond_7
    sget-object v2, Lo5/e0;->g:Lo5/e0$c;

    goto :goto_2

    :goto_3
    invoke-virtual/range {v16 .. v16}, Lo5/e0$c;->c()Z

    move-result v2

    xor-int/lit8 v17, v2, 0x1

    iget-object v2, v0, Lz4/q;->r:Lu4/a0$a;

    iget v4, v1, Lw4/f;->c:I

    iget v6, v0, Lz4/q;->i:I

    iget-object v7, v1, Lw4/f;->d:Ls3/m1;

    iget v8, v1, Lw4/f;->e:I

    iget-object v9, v1, Lw4/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lw4/f;->g:J

    iget-wide v12, v1, Lw4/f;->h:J

    move-object v3, v5

    move v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v9

    move-wide v9, v10

    move-wide v11, v12

    move-object/from16 v13, p6

    move/from16 v14, v17

    invoke-virtual/range {v2 .. v14}, Lu4/a0$a;->w(Lu4/n;IILs3/m1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-eqz v17, :cond_8

    const/4 v2, 0x0

    iput-object v2, v0, Lz4/q;->B:Lw4/f;

    iget-object v2, v0, Lz4/q;->p:Lo5/d0;

    iget-wide v3, v1, Lw4/f;->a:J

    invoke-interface {v2, v3, v4}, Lo5/d0;->b(J)V

    :cond_8
    if-eqz v15, :cond_a

    iget-boolean v1, v0, Lz4/q;->K:Z

    if-nez v1, :cond_9

    iget-wide v1, v0, Lz4/q;->W:J

    invoke-virtual {v0, v1, v2}, Lz4/q;->c(J)Z

    goto :goto_4

    :cond_9
    iget-object v1, v0, Lz4/q;->j:Lz4/q$b;

    invoke-interface {v1, v0}, Lu4/n0$a;->e(Lu4/n0;)V

    :cond_a
    :goto_4
    return-object v16
.end method

.method public Y()V
    .locals 1

    iget-object v0, p0, Lz4/q;->E:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public Z(Landroid/net/Uri;Lo5/d0$c;Z)Z
    .locals 4

    iget-object v0, p0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v0, p1}, Lz4/f;->o(Landroid/net/Uri;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-nez p3, :cond_1

    iget-object p3, p0, Lz4/q;->p:Lo5/d0;

    iget-object v0, p0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v0}, Lz4/f;->k()Ln5/s;

    move-result-object v0

    invoke-static {v0}, Ln5/a0;->c(Ln5/s;)Lo5/d0$a;

    move-result-object v0

    invoke-interface {p3, v0, p2}, Lo5/d0;->c(Lo5/d0$a;Lo5/d0$c;)Lo5/d0$b;

    move-result-object p2

    if-eqz p2, :cond_1

    iget p3, p2, Lo5/d0$b;->a:I

    const/4 v0, 0x2

    if-ne p3, v0, :cond_1

    iget-wide p2, p2, Lo5/d0$b;->b:J

    goto :goto_0

    :cond_1
    move-wide p2, v2

    :goto_0
    iget-object v0, p0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v0, p1, p2, p3}, Lz4/f;->q(Landroid/net/Uri;J)Z

    move-result p1

    if-eqz p1, :cond_2

    cmp-long p1, p2, v2

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public a(Ls3/m1;)V
    .locals 1

    iget-object p1, p0, Lz4/q;->y:Landroid/os/Handler;

    iget-object v0, p0, Lz4/q;->w:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a0()V
    .locals 3

    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-static {v0}, Li7/b0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz4/j;

    iget-object v1, p0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v1, v0}, Lz4/f;->c(Lz4/j;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lz4/j;->v()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne v1, v0, :cond_2

    iget-boolean v0, p0, Lz4/q;->a0:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->f()V

    :cond_2
    :goto_0
    return-void
.end method

.method public b()J
    .locals 2

    invoke-virtual {p0}, Lz4/q;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lz4/q;->X:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lz4/q;->a0:Z

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lz4/q;->J()Lz4/j;

    move-result-object v0

    iget-wide v0, v0, Lw4/f;->h:J

    :goto_0
    return-wide v0
.end method

.method public final b0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz4/q;->J:Z

    invoke-virtual {p0}, Lz4/q;->S()V

    return-void
.end method

.method public c(J)Z
    .locals 23

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lz4/q;->a0:Z

    const/4 v2, 0x0

    if-nez v1, :cond_a

    iget-object v1, v0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {v1}, Lo5/e0;->j()Z

    move-result v1

    if-nez v1, :cond_a

    iget-object v1, v0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {v1}, Lo5/e0;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lz4/q;->O()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iget-wide v3, v0, Lz4/q;->X:J

    iget-object v5, v0, Lz4/q;->C:[Lz4/q$d;

    array-length v6, v5

    move v7, v2

    :goto_0
    if-ge v7, v6, :cond_3

    aget-object v8, v5, v7

    iget-wide v9, v0, Lz4/q;->X:J

    invoke-virtual {v8, v9, v10}, Lu4/l0;->b0(J)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lz4/q;->v:Ljava/util/List;

    invoke-virtual/range {p0 .. p0}, Lz4/q;->J()Lz4/j;

    move-result-object v3

    invoke-virtual {v3}, Lz4/j;->h()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-wide v3, v3, Lw4/f;->h:J

    goto :goto_1

    :cond_2
    iget-wide v4, v0, Lz4/q;->W:J

    iget-wide v6, v3, Lw4/f;->g:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :cond_3
    :goto_1
    move-object v10, v1

    move-wide v8, v3

    iget-object v1, v0, Lz4/q;->t:Lz4/f$b;

    invoke-virtual {v1}, Lz4/f$b;->a()V

    iget-object v5, v0, Lz4/q;->k:Lz4/f;

    iget-boolean v1, v0, Lz4/q;->K:Z

    const/4 v3, 0x1

    if-nez v1, :cond_5

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    move v11, v2

    goto :goto_3

    :cond_5
    :goto_2
    move v11, v3

    :goto_3
    iget-object v12, v0, Lz4/q;->t:Lz4/f$b;

    move-wide/from16 v6, p1

    invoke-virtual/range {v5 .. v12}, Lz4/f;->e(JJLjava/util/List;ZLz4/f$b;)V

    iget-object v1, v0, Lz4/q;->t:Lz4/f$b;

    iget-boolean v4, v1, Lz4/f$b;->b:Z

    iget-object v5, v1, Lz4/f$b;->a:Lw4/f;

    iget-object v1, v1, Lz4/f$b;->c:Landroid/net/Uri;

    if-eqz v4, :cond_6

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, v0, Lz4/q;->X:J

    iput-boolean v3, v0, Lz4/q;->a0:Z

    return v3

    :cond_6
    if-nez v5, :cond_8

    if-eqz v1, :cond_7

    iget-object v3, v0, Lz4/q;->j:Lz4/q$b;

    invoke-interface {v3, v1}, Lz4/q$b;->j(Landroid/net/Uri;)V

    :cond_7
    return v2

    :cond_8
    invoke-static {v5}, Lz4/q;->N(Lw4/f;)Z

    move-result v1

    if-eqz v1, :cond_9

    move-object v1, v5

    check-cast v1, Lz4/j;

    invoke-virtual {v0, v1}, Lz4/q;->M(Lz4/j;)V

    :cond_9
    iput-object v5, v0, Lz4/q;->B:Lw4/f;

    iget-object v1, v0, Lz4/q;->q:Lo5/e0;

    iget-object v2, v0, Lz4/q;->p:Lo5/d0;

    iget v4, v5, Lw4/f;->c:I

    invoke-interface {v2, v4}, Lo5/d0;->d(I)I

    move-result v2

    invoke-virtual {v1, v5, v0, v2}, Lo5/e0;->n(Lo5/e0$e;Lo5/e0$b;I)J

    move-result-wide v10

    iget-object v12, v0, Lz4/q;->r:Lu4/a0$a;

    new-instance v13, Lu4/n;

    iget-wide v7, v5, Lw4/f;->a:J

    iget-object v9, v5, Lw4/f;->b:Lo5/n;

    move-object v6, v13

    invoke-direct/range {v6 .. v11}, Lu4/n;-><init>(JLo5/n;J)V

    iget v14, v5, Lw4/f;->c:I

    iget v15, v0, Lz4/q;->i:I

    iget-object v1, v5, Lw4/f;->d:Ls3/m1;

    iget v2, v5, Lw4/f;->e:I

    iget-object v4, v5, Lw4/f;->f:Ljava/lang/Object;

    iget-wide v6, v5, Lw4/f;->g:J

    iget-wide v8, v5, Lw4/f;->h:J

    move-object/from16 v16, v1

    move/from16 v17, v2

    move-object/from16 v18, v4

    move-wide/from16 v19, v6

    move-wide/from16 v21, v8

    invoke-virtual/range {v12 .. v22}, Lu4/a0$a;->A(Lu4/n;IILs3/m1;ILjava/lang/Object;JJ)V

    return v3

    :cond_a
    :goto_4
    return v2
.end method

.method public varargs c0([Lu4/s0;I[I)V
    .locals 4

    invoke-virtual {p0, p1}, Lz4/q;->D([Lu4/s0;)Lu4/u0;

    move-result-object p1

    iput-object p1, p0, Lz4/q;->P:Lu4/u0;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lz4/q;->Q:Ljava/util/Set;

    array-length p1, p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    aget v1, p3, v0

    iget-object v2, p0, Lz4/q;->Q:Ljava/util/Set;

    iget-object v3, p0, Lz4/q;->P:Lu4/u0;

    invoke-virtual {v3, v1}, Lu4/u0;->b(I)Lu4/s0;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iput p2, p0, Lz4/q;->S:I

    iget-object p1, p0, Lz4/q;->y:Landroid/os/Handler;

    iget-object p2, p0, Lz4/q;->j:Lz4/q$b;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, Lz4/n;

    invoke-direct {p3, p2}, Lz4/n;-><init>(Lz4/q$b;)V

    invoke-virtual {p1, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, Lz4/q;->k0()V

    return-void
.end method

.method public d(JLs3/m3;)J
    .locals 1

    iget-object v0, p0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v0, p1, p2, p3}, Lz4/f;->b(JLs3/m3;)J

    move-result-wide p1

    return-wide p1
.end method

.method public d0(ILs3/n1;Lv3/g;I)I
    .locals 11

    invoke-virtual {p0}, Lz4/q;->O()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_3

    move v0, v2

    :goto_0
    iget-object v3, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_1

    iget-object v3, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz4/j;

    invoke-virtual {p0, v3}, Lz4/q;->H(Lz4/j;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-static {v3, v2, v0}, Lp5/n0;->M0(Ljava/util/List;II)V

    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz4/j;

    iget-object v10, v0, Lw4/f;->d:Ls3/m1;

    iget-object v3, p0, Lz4/q;->N:Ls3/m1;

    invoke-virtual {v10, v3}, Ls3/m1;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p0, Lz4/q;->r:Lu4/a0$a;

    iget v4, p0, Lz4/q;->i:I

    iget v6, v0, Lw4/f;->e:I

    iget-object v7, v0, Lw4/f;->f:Ljava/lang/Object;

    iget-wide v8, v0, Lw4/f;->g:J

    move-object v5, v10

    invoke-virtual/range {v3 .. v9}, Lu4/a0$a;->i(ILs3/m1;ILjava/lang/Object;J)V

    :cond_2
    iput-object v10, p0, Lz4/q;->N:Ls3/m1;

    :cond_3
    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz4/j;

    invoke-virtual {v0}, Lz4/j;->q()Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    aget-object v0, v0, p1

    iget-boolean v1, p0, Lz4/q;->a0:Z

    invoke-virtual {v0, p2, p3, p4, v1}, Lu4/l0;->S(Ls3/n1;Lv3/g;IZ)I

    move-result p3

    const/4 p4, -0x5

    if-ne p3, p4, :cond_8

    iget-object p4, p2, Ls3/n1;->b:Ls3/m1;

    invoke-static {p4}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ls3/m1;

    iget v0, p0, Lz4/q;->I:I

    if-ne p1, v0, :cond_7

    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lu4/l0;->Q()I

    move-result p1

    :goto_1
    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz4/j;

    iget v0, v0, Lz4/j;->k:I

    if-eq v0, p1, :cond_5

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz4/j;

    iget-object p1, p1, Lw4/f;->d:Ls3/m1;

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lz4/q;->M:Ls3/m1;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/m1;

    :goto_2
    invoke-virtual {p4, p1}, Ls3/m1;->j(Ls3/m1;)Ls3/m1;

    move-result-object p4

    :cond_7
    iput-object p4, p2, Ls3/n1;->b:Ls3/m1;

    :cond_8
    return p3
.end method

.method public e(II)Lx3/b0;
    .locals 3

    sget-object v0, Lz4/q;->f0:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lz4/q;->K(II)Lx3/b0;

    move-result-object v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lz4/q;->D:[I

    aget v2, v2, v0

    if-ne v2, p1, :cond_1

    aget-object v0, v1, v0

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_4

    iget-boolean v0, p0, Lz4/q;->b0:Z

    if-eqz v0, :cond_3

    invoke-static {p1, p2}, Lz4/q;->B(II)Lx3/j;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p0, p1, p2}, Lz4/q;->C(II)Lu4/l0;

    move-result-object v0

    :cond_4
    const/4 p1, 0x5

    if-ne p2, p1, :cond_6

    iget-object p1, p0, Lz4/q;->G:Lx3/b0;

    if-nez p1, :cond_5

    new-instance p1, Lz4/q$c;

    iget p2, p0, Lz4/q;->s:I

    invoke-direct {p1, v0, p2}, Lz4/q$c;-><init>(Lx3/b0;I)V

    iput-object p1, p0, Lz4/q;->G:Lx3/b0;

    :cond_5
    iget-object p1, p0, Lz4/q;->G:Lx3/b0;

    return-object p1

    :cond_6
    return-object v0
.end method

.method public e0()V
    .locals 4

    iget-boolean v0, p0, Lz4/q;->K:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lu4/l0;->R()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {v0, p0}, Lo5/e0;->m(Lo5/e0$f;)V

    iget-object v0, p0, Lz4/q;->y:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz4/q;->O:Z

    iget-object v0, p0, Lz4/q;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public f()J
    .locals 7

    iget-boolean v0, p0, Lz4/q;->a0:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lz4/q;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lz4/q;->X:J

    return-wide v0

    :cond_1
    iget-wide v0, p0, Lz4/q;->W:J

    invoke-virtual {p0}, Lz4/q;->J()Lz4/j;

    move-result-object v2

    invoke-virtual {v2}, Lz4/j;->h()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_3

    iget-object v2, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz4/j;

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    iget-wide v2, v2, Lw4/f;->h:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_4
    iget-boolean v2, p0, Lz4/q;->J:Z

    if-eqz v2, :cond_5

    iget-object v2, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_5

    aget-object v5, v2, v4

    invoke-virtual {v5}, Lu4/l0;->z()J

    move-result-wide v5

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    return-wide v0
.end method

.method public final f0()V
    .locals 6

    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    iget-boolean v5, p0, Lz4/q;->Y:Z

    invoke-virtual {v4, v5}, Lu4/l0;->W(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v2, p0, Lz4/q;->Y:Z

    return-void
.end method

.method public g(J)V
    .locals 4

    iget-object v0, p0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->i()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lz4/q;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lz4/q;->B:Lw4/f;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz4/q;->k:Lz4/f;

    iget-object v1, p0, Lz4/q;->B:Lw4/f;

    iget-object v2, p0, Lz4/q;->v:Ljava/util/List;

    invoke-virtual {v0, p1, p2, v1, v2}, Lz4/f;->v(JLw4/f;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {p1}, Lo5/e0;->f()V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lz4/q;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-lez v0, :cond_3

    iget-object v1, p0, Lz4/q;->k:Lz4/f;

    iget-object v2, p0, Lz4/q;->v:Ljava/util/List;

    add-int/lit8 v3, v0, -0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz4/j;

    invoke-virtual {v1, v2}, Lz4/f;->c(Lz4/j;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lz4/q;->v:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-virtual {p0, v0}, Lz4/q;->F(I)V

    :cond_4
    iget-object v0, p0, Lz4/q;->k:Lz4/f;

    iget-object v1, p0, Lz4/q;->v:Ljava/util/List;

    invoke-virtual {v0, p1, p2, v1}, Lz4/f;->h(JLjava/util/List;)I

    move-result p1

    iget-object p2, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_5

    invoke-virtual {p0, p1}, Lz4/q;->F(I)V

    :cond_5
    :goto_1
    return-void
.end method

.method public final g0(J)Z
    .locals 4

    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v3, p0, Lz4/q;->C:[Lz4/q$d;

    aget-object v3, v3, v2

    invoke-virtual {v3, p1, p2, v1}, Lu4/l0;->Z(JZ)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lz4/q;->V:[Z

    aget-boolean v3, v3, v2

    if-nez v3, :cond_0

    iget-boolean v3, p0, Lz4/q;->T:Z

    if-nez v3, :cond_1

    :cond_0
    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public h()V
    .locals 4

    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lu4/l0;->T()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h0(JZ)Z
    .locals 3

    iput-wide p1, p0, Lz4/q;->W:J

    invoke-virtual {p0}, Lz4/q;->O()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lz4/q;->X:J

    return v1

    :cond_0
    iget-boolean v0, p0, Lz4/q;->J:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-nez p3, :cond_1

    invoke-virtual {p0, p1, p2}, Lz4/q;->g0(J)Z

    move-result p3

    if-eqz p3, :cond_1

    return v2

    :cond_1
    iput-wide p1, p0, Lz4/q;->X:J

    iput-boolean v2, p0, Lz4/q;->a0:Z

    iget-object p1, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {p1}, Lo5/e0;->j()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lz4/q;->J:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lz4/q;->C:[Lz4/q$d;

    array-length p2, p1

    :goto_0
    if-ge v2, p2, :cond_2

    aget-object p3, p1, v2

    invoke-virtual {p3}, Lu4/l0;->r()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {p1}, Lo5/e0;->f()V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {p1}, Lo5/e0;->g()V

    invoke-virtual {p0}, Lz4/q;->f0()V

    :goto_1
    return v1
.end method

.method public i0([Ln5/s;[Z[Lu4/m0;[ZJZ)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-wide/from16 v12, p5

    invoke-virtual/range {p0 .. p0}, Lz4/q;->w()V

    iget v3, v0, Lz4/q;->L:I

    const/4 v14, 0x0

    move v4, v14

    :goto_0
    array-length v5, v1

    const/4 v6, 0x0

    const/4 v15, 0x1

    if-ge v4, v5, :cond_2

    aget-object v5, v2, v4

    check-cast v5, Lz4/m;

    if-eqz v5, :cond_1

    aget-object v7, v1, v4

    if-eqz v7, :cond_0

    aget-boolean v7, p2, v4

    if-nez v7, :cond_1

    :cond_0
    iget v7, v0, Lz4/q;->L:I

    sub-int/2addr v7, v15

    iput v7, v0, Lz4/q;->L:I

    invoke-virtual {v5}, Lz4/m;->d()V

    aput-object v6, v2, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-nez p7, :cond_5

    iget-boolean v4, v0, Lz4/q;->Z:Z

    if-eqz v4, :cond_3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_3
    iget-wide v3, v0, Lz4/q;->W:J

    cmp-long v3, v12, v3

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    move v3, v14

    goto :goto_2

    :cond_5
    :goto_1
    move v3, v15

    :goto_2
    iget-object v4, v0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v4}, Lz4/f;->k()Ln5/s;

    move-result-object v4

    move/from16 v16, v3

    move-object v11, v4

    move v3, v14

    :goto_3
    array-length v5, v1

    if-ge v3, v5, :cond_a

    aget-object v5, v1, v3

    if-nez v5, :cond_6

    goto :goto_5

    :cond_6
    iget-object v7, v0, Lz4/q;->P:Lu4/u0;

    invoke-interface {v5}, Ln5/v;->b()Lu4/s0;

    move-result-object v8

    invoke-virtual {v7, v8}, Lu4/u0;->c(Lu4/s0;)I

    move-result v7

    iget v8, v0, Lz4/q;->S:I

    if-ne v7, v8, :cond_7

    iget-object v8, v0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v8, v5}, Lz4/f;->u(Ln5/s;)V

    move-object v11, v5

    :cond_7
    aget-object v5, v2, v3

    if-nez v5, :cond_9

    iget v5, v0, Lz4/q;->L:I

    add-int/2addr v5, v15

    iput v5, v0, Lz4/q;->L:I

    new-instance v5, Lz4/m;

    invoke-direct {v5, v0, v7}, Lz4/m;-><init>(Lz4/q;I)V

    aput-object v5, v2, v3

    aput-boolean v15, p4, v3

    iget-object v5, v0, Lz4/q;->R:[I

    if-eqz v5, :cond_9

    aget-object v5, v2, v3

    check-cast v5, Lz4/m;

    invoke-virtual {v5}, Lz4/m;->b()V

    if-nez v16, :cond_9

    iget-object v5, v0, Lz4/q;->C:[Lz4/q$d;

    iget-object v8, v0, Lz4/q;->R:[I

    aget v7, v8, v7

    aget-object v5, v5, v7

    invoke-virtual {v5, v12, v13, v15}, Lu4/l0;->Z(JZ)Z

    move-result v7

    if-nez v7, :cond_8

    invoke-virtual {v5}, Lu4/l0;->C()I

    move-result v5

    if-eqz v5, :cond_8

    move v5, v15

    goto :goto_4

    :cond_8
    move v5, v14

    :goto_4
    move/from16 v16, v5

    :cond_9
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_a
    iget v1, v0, Lz4/q;->L:I

    if-nez v1, :cond_d

    iget-object v1, v0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v1}, Lz4/f;->r()V

    iput-object v6, v0, Lz4/q;->N:Ls3/m1;

    iput-boolean v15, v0, Lz4/q;->Y:Z

    iget-object v1, v0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {v1}, Lo5/e0;->j()Z

    move-result v1

    if-eqz v1, :cond_c

    iget-boolean v1, v0, Lz4/q;->J:Z

    if-eqz v1, :cond_b

    iget-object v1, v0, Lz4/q;->C:[Lz4/q$d;

    array-length v3, v1

    :goto_6
    if-ge v14, v3, :cond_b

    aget-object v4, v1, v14

    invoke-virtual {v4}, Lu4/l0;->r()V

    add-int/lit8 v14, v14, 0x1

    goto :goto_6

    :cond_b
    iget-object v1, v0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {v1}, Lo5/e0;->f()V

    goto/16 :goto_b

    :cond_c
    invoke-virtual/range {p0 .. p0}, Lz4/q;->f0()V

    goto/16 :goto_b

    :cond_d
    iget-object v1, v0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_11

    invoke-static {v11, v4}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    iget-boolean v1, v0, Lz4/q;->Z:Z

    if-nez v1, :cond_10

    const-wide/16 v3, 0x0

    cmp-long v1, v12, v3

    if-gez v1, :cond_e

    neg-long v3, v12

    :cond_e
    move-wide v6, v3

    invoke-virtual/range {p0 .. p0}, Lz4/q;->J()Lz4/j;

    move-result-object v1

    iget-object v3, v0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v3, v1, v12, v13}, Lz4/f;->a(Lz4/j;J)[Lw4/o;

    move-result-object v17

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v10, v0, Lz4/q;->v:Ljava/util/List;

    move-object v3, v11

    move-wide/from16 v4, p5

    move-object/from16 v18, v11

    move-object/from16 v11, v17

    invoke-interface/range {v3 .. v11}, Ln5/s;->j(JJJLjava/util/List;[Lw4/o;)V

    iget-object v3, v0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v3}, Lz4/f;->j()Lu4/s0;

    move-result-object v3

    iget-object v1, v1, Lw4/f;->d:Ls3/m1;

    invoke-virtual {v3, v1}, Lu4/s0;->c(Ls3/m1;)I

    move-result v1

    invoke-interface/range {v18 .. v18}, Ln5/s;->n()I

    move-result v3

    if-eq v3, v1, :cond_f

    goto :goto_7

    :cond_f
    move v1, v14

    goto :goto_8

    :cond_10
    :goto_7
    move v1, v15

    :goto_8
    if-eqz v1, :cond_11

    iput-boolean v15, v0, Lz4/q;->Y:Z

    move v1, v15

    move/from16 v16, v1

    goto :goto_9

    :cond_11
    move/from16 v1, p7

    :goto_9
    if-eqz v16, :cond_13

    invoke-virtual {v0, v12, v13, v1}, Lz4/q;->h0(JZ)Z

    :goto_a
    array-length v1, v2

    if-ge v14, v1, :cond_13

    aget-object v1, v2, v14

    if-eqz v1, :cond_12

    aput-boolean v15, p4, v14

    :cond_12
    add-int/lit8 v14, v14, 0x1

    goto :goto_a

    :cond_13
    :goto_b
    invoke-virtual {v0, v2}, Lz4/q;->p0([Lu4/m0;)V

    iput-boolean v15, v0, Lz4/q;->Z:Z

    return v16
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, Lz4/q;->q:Lo5/e0;

    invoke-virtual {v0}, Lo5/e0;->j()Z

    move-result v0

    return v0
.end method

.method public j(Lx3/z;)V
    .locals 0

    return-void
.end method

.method public j0(Lw3/m;)V
    .locals 3

    iget-object v0, p0, Lz4/q;->d0:Lw3/m;

    invoke-static {v0, p1}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Lz4/q;->d0:Lw3/m;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lz4/q;->V:[Z

    aget-boolean v2, v2, v0

    if-eqz v2, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Lz4/q$d;->i0(Lw3/m;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public bridge synthetic k(Lo5/e0$e;JJLjava/io/IOException;I)Lo5/e0$c;
    .locals 0

    check-cast p1, Lw4/f;

    invoke-virtual/range {p0 .. p7}, Lz4/q;->X(Lw4/f;JJLjava/io/IOException;I)Lo5/e0$c;

    move-result-object p1

    return-object p1
.end method

.method public final k0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz4/q;->K:Z

    return-void
.end method

.method public l()V
    .locals 2

    invoke-virtual {p0}, Lz4/q;->T()V

    iget-boolean v0, p0, Lz4/q;->a0:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lz4/q;->K:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const-string v1, "Loading finished before preparation is complete."

    invoke-static {v1, v0}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public l0(Z)V
    .locals 1

    iget-object v0, p0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v0, p1}, Lz4/f;->t(Z)V

    return-void
.end method

.method public m0(J)V
    .locals 4

    iget-wide v0, p0, Lz4/q;->c0:J

    cmp-long v0, v0, p1

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lz4/q;->c0:J

    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2}, Lu4/l0;->a0(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public n()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz4/q;->b0:Z

    iget-object v0, p0, Lz4/q;->y:Landroid/os/Handler;

    iget-object v1, p0, Lz4/q;->x:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public n0(IJ)I
    .locals 2

    invoke-virtual {p0}, Lz4/q;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    aget-object v0, v0, p1

    iget-boolean v1, p0, Lz4/q;->a0:Z

    invoke-virtual {v0, p2, p3, v1}, Lu4/l0;->E(JZ)I

    move-result p2

    iget-object p3, p0, Lz4/q;->u:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-static {p3, v1}, Li7/b0;->e(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lz4/j;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lz4/j;->q()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lu4/l0;->C()I

    move-result v1

    invoke-virtual {p3, p1}, Lz4/j;->m(I)I

    move-result p1

    sub-int/2addr p1, v1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_1
    invoke-virtual {v0, p2}, Lu4/l0;->e0(I)V

    return p2
.end method

.method public bridge synthetic o(Lo5/e0$e;JJ)V
    .locals 0

    check-cast p1, Lw4/f;

    invoke-virtual/range {p0 .. p5}, Lz4/q;->W(Lw4/f;JJ)V

    return-void
.end method

.method public o0(I)V
    .locals 2

    invoke-virtual {p0}, Lz4/q;->w()V

    iget-object v0, p0, Lz4/q;->R:[I

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz4/q;->R:[I

    aget p1, v0, p1

    iget-object v0, p0, Lz4/q;->U:[Z

    aget-boolean v0, v0, p1

    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-object v0, p0, Lz4/q;->U:[Z

    const/4 v1, 0x0

    aput-boolean v1, v0, p1

    return-void
.end method

.method public final p0([Lu4/m0;)V
    .locals 4

    iget-object v0, p0, Lz4/q;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    iget-object v3, p0, Lz4/q;->z:Ljava/util/ArrayList;

    check-cast v2, Lz4/m;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public bridge synthetic r(Lo5/e0$e;JJZ)V
    .locals 0

    check-cast p1, Lw4/f;

    invoke-virtual/range {p0 .. p6}, Lz4/q;->V(Lw4/f;JJZ)V

    return-void
.end method

.method public s()Lu4/u0;
    .locals 1

    invoke-virtual {p0}, Lz4/q;->w()V

    iget-object v0, p0, Lz4/q;->P:Lu4/u0;

    return-object v0
.end method

.method public t(JZ)V
    .locals 4

    iget-boolean v0, p0, Lz4/q;->J:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lz4/q;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lz4/q;->C:[Lz4/q$d;

    aget-object v2, v2, v1

    iget-object v3, p0, Lz4/q;->U:[Z

    aget-boolean v3, v3, v1

    invoke-virtual {v2, p1, p2, p3, v3}, Lu4/l0;->q(JZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final w()V
    .locals 1

    iget-boolean v0, p0, Lz4/q;->K:Z

    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-object v0, p0, Lz4/q;->P:Lu4/u0;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz4/q;->Q:Ljava/util/Set;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public x(I)I
    .locals 3

    invoke-virtual {p0}, Lz4/q;->w()V

    iget-object v0, p0, Lz4/q;->R:[I

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz4/q;->R:[I

    aget v0, v0, p1

    const/4 v1, -0x2

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lz4/q;->Q:Ljava/util/Set;

    iget-object v2, p0, Lz4/q;->P:Lu4/u0;

    invoke-virtual {v2, p1}, Lu4/u0;->b(I)Lu4/s0;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, -0x3

    :cond_0
    return v1

    :cond_1
    iget-object p1, p0, Lz4/q;->U:[Z

    aget-boolean v2, p1, v0

    if-eqz v2, :cond_2

    return v1

    :cond_2
    const/4 v1, 0x1

    aput-boolean v1, p1, v0

    return v0
.end method

.method public final y()V
    .locals 15

    iget-object v0, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v0, v0

    const/4 v1, -0x2

    const/4 v2, -0x1

    const/4 v3, 0x0

    move v5, v1

    move v6, v2

    move v4, v3

    :goto_0
    const/4 v7, 0x2

    const/4 v8, 0x1

    if-ge v4, v0, :cond_5

    iget-object v9, p0, Lz4/q;->C:[Lz4/q$d;

    aget-object v9, v9, v4

    invoke-virtual {v9}, Lu4/l0;->F()Ls3/m1;

    move-result-object v9

    invoke-static {v9}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ls3/m1;

    iget-object v9, v9, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v9}, Lp5/v;->s(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v9}, Lp5/v;->o(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v8

    goto :goto_1

    :cond_1
    invoke-static {v9}, Lp5/v;->r(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/4 v7, 0x3

    goto :goto_1

    :cond_2
    move v7, v1

    :goto_1
    invoke-static {v7}, Lz4/q;->L(I)I

    move-result v8

    invoke-static {v5}, Lz4/q;->L(I)I

    move-result v9

    if-le v8, v9, :cond_3

    move v6, v4

    move v5, v7

    goto :goto_2

    :cond_3
    if-ne v7, v5, :cond_4

    if-eq v6, v2, :cond_4

    move v6, v2

    :cond_4
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lz4/q;->k:Lz4/f;

    invoke-virtual {v1}, Lz4/f;->j()Lu4/s0;

    move-result-object v1

    iget v4, v1, Lu4/s0;->h:I

    iput v2, p0, Lz4/q;->S:I

    new-array v2, v0, [I

    iput-object v2, p0, Lz4/q;->R:[I

    move v2, v3

    :goto_3
    if-ge v2, v0, :cond_6

    iget-object v9, p0, Lz4/q;->R:[I

    aput v2, v9, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    new-array v2, v0, [Lu4/s0;

    move v9, v3

    :goto_4
    if-ge v9, v0, :cond_d

    iget-object v10, p0, Lz4/q;->C:[Lz4/q$d;

    aget-object v10, v10, v9

    invoke-virtual {v10}, Lu4/l0;->F()Ls3/m1;

    move-result-object v10

    invoke-static {v10}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ls3/m1;

    if-ne v9, v6, :cond_a

    new-array v11, v4, [Ls3/m1;

    move v12, v3

    :goto_5
    if-ge v12, v4, :cond_9

    invoke-virtual {v1, v12}, Lu4/s0;->b(I)Ls3/m1;

    move-result-object v13

    if-ne v5, v8, :cond_7

    iget-object v14, p0, Lz4/q;->m:Ls3/m1;

    if-eqz v14, :cond_7

    invoke-virtual {v13, v14}, Ls3/m1;->j(Ls3/m1;)Ls3/m1;

    move-result-object v13

    :cond_7
    if-ne v4, v8, :cond_8

    invoke-virtual {v10, v13}, Ls3/m1;->j(Ls3/m1;)Ls3/m1;

    move-result-object v13

    goto :goto_6

    :cond_8
    invoke-static {v13, v10, v8}, Lz4/q;->E(Ls3/m1;Ls3/m1;Z)Ls3/m1;

    move-result-object v13

    :goto_6
    aput-object v13, v11, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_9
    new-instance v10, Lu4/s0;

    iget-object v12, p0, Lz4/q;->h:Ljava/lang/String;

    invoke-direct {v10, v12, v11}, Lu4/s0;-><init>(Ljava/lang/String;[Ls3/m1;)V

    aput-object v10, v2, v9

    iput v9, p0, Lz4/q;->S:I

    goto :goto_9

    :cond_a
    if-ne v5, v7, :cond_b

    iget-object v11, v10, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v11}, Lp5/v;->o(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_b

    iget-object v11, p0, Lz4/q;->m:Ls3/m1;

    goto :goto_7

    :cond_b
    const/4 v11, 0x0

    :goto_7
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v13, p0, Lz4/q;->h:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ":muxed:"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-ge v9, v6, :cond_c

    move v13, v9

    goto :goto_8

    :cond_c
    add-int/lit8 v13, v9, -0x1

    :goto_8
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Lu4/s0;

    new-array v14, v8, [Ls3/m1;

    invoke-static {v11, v10, v3}, Lz4/q;->E(Ls3/m1;Ls3/m1;Z)Ls3/m1;

    move-result-object v10

    aput-object v10, v14, v3

    invoke-direct {v13, v12, v14}, Lu4/s0;-><init>(Ljava/lang/String;[Ls3/m1;)V

    aput-object v13, v2, v9

    :goto_9
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_d
    invoke-virtual {p0, v2}, Lz4/q;->D([Lu4/s0;)Lu4/u0;

    move-result-object v0

    iput-object v0, p0, Lz4/q;->P:Lu4/u0;

    iget-object v0, p0, Lz4/q;->Q:Ljava/util/Set;

    if-nez v0, :cond_e

    move v3, v8

    :cond_e
    invoke-static {v3}, Lp5/a;->f(Z)V

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lz4/q;->Q:Ljava/util/Set;

    return-void
.end method

.method public final z(I)Z
    .locals 4

    move v0, p1

    :goto_0
    iget-object v1, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz4/j;

    iget-boolean v1, v1, Lz4/j;->n:Z

    if-eqz v1, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lz4/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz4/j;

    move v0, v2

    :goto_1
    iget-object v1, p0, Lz4/q;->C:[Lz4/q$d;

    array-length v1, v1

    if-ge v0, v1, :cond_3

    invoke-virtual {p1, v0}, Lz4/j;->m(I)I

    move-result v1

    iget-object v3, p0, Lz4/q;->C:[Lz4/q$d;

    aget-object v3, v3, v0

    invoke-virtual {v3}, Lu4/l0;->C()I

    move-result v3

    if-le v3, v1, :cond_2

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method
