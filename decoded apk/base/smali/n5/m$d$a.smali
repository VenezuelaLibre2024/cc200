.class public final Ln5/m$d$a;
.super Ln5/z$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln5/m$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:Z

.field public final N:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/Map<",
            "Lu4/u0;",
            "Ln5/m$e;",
            ">;>;"
        }
    .end annotation
.end field

.field public final O:Landroid/util/SparseBooleanArray;


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ln5/z$a;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ln5/m$d$a;->N:Landroid/util/SparseArray;

    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Ln5/m$d$a;->O:Landroid/util/SparseBooleanArray;

    invoke-virtual {p0}, Ln5/m$d$a;->Z()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Ln5/z$a;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ln5/m$d$a;->N:Landroid/util/SparseArray;

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Ln5/m$d$a;->O:Landroid/util/SparseBooleanArray;

    invoke-virtual {p0}, Ln5/m$d$a;->Z()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 3

    invoke-direct {p0, p1}, Ln5/z$a;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Ln5/m$d$a;->Z()V

    sget-object v0, Ln5/m$d;->z0:Ln5/m$d;

    invoke-static {}, Ln5/m$d;->m()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Ln5/m$d;->k0:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Ln5/m$d$a;->n0(Z)Ln5/m$d$a;

    invoke-static {}, Ln5/m$d;->t()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Ln5/m$d;->l0:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Ln5/m$d$a;->i0(Z)Ln5/m$d$a;

    invoke-static {}, Ln5/m$d;->u()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Ln5/m$d;->m0:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Ln5/m$d$a;->j0(Z)Ln5/m$d$a;

    invoke-static {}, Ln5/m$d;->v()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Ln5/m$d;->n0:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Ln5/m$d$a;->h0(Z)Ln5/m$d$a;

    invoke-static {}, Ln5/m$d;->w()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Ln5/m$d;->o0:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Ln5/m$d$a;->l0(Z)Ln5/m$d$a;

    invoke-static {}, Ln5/m$d;->x()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Ln5/m$d;->p0:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Ln5/m$d$a;->e0(Z)Ln5/m$d$a;

    invoke-static {}, Ln5/m$d;->y()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Ln5/m$d;->q0:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Ln5/m$d$a;->f0(Z)Ln5/m$d$a;

    invoke-static {}, Ln5/m$d;->z()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Ln5/m$d;->r0:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Ln5/m$d$a;->c0(Z)Ln5/m$d$a;

    invoke-static {}, Ln5/m$d;->c()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Ln5/m$d;->s0:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Ln5/m$d$a;->d0(Z)Ln5/m$d$a;

    invoke-static {}, Ln5/m$d;->d()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Ln5/m$d;->t0:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Ln5/m$d$a;->k0(Z)Ln5/m$d$a;

    invoke-static {}, Ln5/m$d;->e()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Ln5/m$d;->u0:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Ln5/m$d$a;->m0(Z)Ln5/m$d$a;

    invoke-static {}, Ln5/m$d;->f()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Ln5/m$d;->v0:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Ln5/m$d$a;->r0(Z)Ln5/m$d$a;

    invoke-static {}, Ln5/m$d;->g()Ljava/lang/String;

    move-result-object v1

    iget-boolean v0, v0, Ln5/m$d;->w0:Z

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Ln5/m$d$a;->g0(Z)Ln5/m$d$a;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ln5/m$d$a;->N:Landroid/util/SparseArray;

    invoke-virtual {p0, p1}, Ln5/m$d$a;->q0(Landroid/os/Bundle;)V

    invoke-static {}, Ln5/m$d;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p1

    invoke-virtual {p0, p1}, Ln5/m$d$a;->a0([I)Landroid/util/SparseBooleanArray;

    move-result-object p1

    iput-object p1, p0, Ln5/m$d$a;->O:Landroid/util/SparseBooleanArray;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Bundle;Ln5/m$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ln5/m$d$a;-><init>(Landroid/os/Bundle;)V

    return-void
.end method

.method public constructor <init>(Ln5/m$d;)V
    .locals 1

    invoke-direct {p0, p1}, Ln5/z$a;-><init>(Ln5/z;)V

    iget-boolean v0, p1, Ln5/m$d;->k0:Z

    iput-boolean v0, p0, Ln5/m$d$a;->A:Z

    iget-boolean v0, p1, Ln5/m$d;->l0:Z

    iput-boolean v0, p0, Ln5/m$d$a;->B:Z

    iget-boolean v0, p1, Ln5/m$d;->m0:Z

    iput-boolean v0, p0, Ln5/m$d$a;->C:Z

    iget-boolean v0, p1, Ln5/m$d;->n0:Z

    iput-boolean v0, p0, Ln5/m$d$a;->D:Z

    iget-boolean v0, p1, Ln5/m$d;->o0:Z

    iput-boolean v0, p0, Ln5/m$d$a;->E:Z

    iget-boolean v0, p1, Ln5/m$d;->p0:Z

    iput-boolean v0, p0, Ln5/m$d$a;->F:Z

    iget-boolean v0, p1, Ln5/m$d;->q0:Z

    iput-boolean v0, p0, Ln5/m$d$a;->G:Z

    iget-boolean v0, p1, Ln5/m$d;->r0:Z

    iput-boolean v0, p0, Ln5/m$d$a;->H:Z

    iget-boolean v0, p1, Ln5/m$d;->s0:Z

    iput-boolean v0, p0, Ln5/m$d$a;->I:Z

    iget-boolean v0, p1, Ln5/m$d;->t0:Z

    iput-boolean v0, p0, Ln5/m$d$a;->J:Z

    iget-boolean v0, p1, Ln5/m$d;->u0:Z

    iput-boolean v0, p0, Ln5/m$d$a;->K:Z

    iget-boolean v0, p1, Ln5/m$d;->v0:Z

    iput-boolean v0, p0, Ln5/m$d$a;->L:Z

    iget-boolean v0, p1, Ln5/m$d;->w0:Z

    iput-boolean v0, p0, Ln5/m$d$a;->M:Z

    invoke-static {p1}, Ln5/m$d;->C(Ln5/m$d;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-static {v0}, Ln5/m$d$a;->Y(Landroid/util/SparseArray;)Landroid/util/SparseArray;

    move-result-object v0

    iput-object v0, p0, Ln5/m$d$a;->N:Landroid/util/SparseArray;

    invoke-static {p1}, Ln5/m$d;->D(Ln5/m$d;)Landroid/util/SparseBooleanArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clone()Landroid/util/SparseBooleanArray;

    move-result-object p1

    iput-object p1, p0, Ln5/m$d$a;->O:Landroid/util/SparseBooleanArray;

    return-void
.end method

.method public synthetic constructor <init>(Ln5/m$d;Ln5/m$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ln5/m$d$a;-><init>(Ln5/m$d;)V

    return-void
.end method

.method public static synthetic I(Ln5/m$d$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/m$d$a;->A:Z

    return p0
.end method

.method public static synthetic J(Ln5/m$d$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/m$d$a;->B:Z

    return p0
.end method

.method public static synthetic K(Ln5/m$d$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/m$d$a;->C:Z

    return p0
.end method

.method public static synthetic L(Ln5/m$d$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/m$d$a;->D:Z

    return p0
.end method

.method public static synthetic M(Ln5/m$d$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/m$d$a;->E:Z

    return p0
.end method

.method public static synthetic N(Ln5/m$d$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/m$d$a;->F:Z

    return p0
.end method

.method public static synthetic O(Ln5/m$d$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/m$d$a;->G:Z

    return p0
.end method

.method public static synthetic P(Ln5/m$d$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/m$d$a;->H:Z

    return p0
.end method

.method public static synthetic Q(Ln5/m$d$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/m$d$a;->I:Z

    return p0
.end method

.method public static synthetic R(Ln5/m$d$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/m$d$a;->J:Z

    return p0
.end method

.method public static synthetic S(Ln5/m$d$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/m$d$a;->K:Z

    return p0
.end method

.method public static synthetic T(Ln5/m$d$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/m$d$a;->L:Z

    return p0
.end method

.method public static synthetic U(Ln5/m$d$a;)Z
    .locals 0

    iget-boolean p0, p0, Ln5/m$d$a;->M:Z

    return p0
.end method

.method public static synthetic V(Ln5/m$d$a;)Landroid/util/SparseArray;
    .locals 0

    iget-object p0, p0, Ln5/m$d$a;->N:Landroid/util/SparseArray;

    return-object p0
.end method

.method public static synthetic W(Ln5/m$d$a;)Landroid/util/SparseBooleanArray;
    .locals 0

    iget-object p0, p0, Ln5/m$d$a;->O:Landroid/util/SparseBooleanArray;

    return-object p0
.end method

.method public static Y(Landroid/util/SparseArray;)Landroid/util/SparseArray;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Ljava/util/Map<",
            "Lu4/u0;",
            "Ln5/m$e;",
            ">;>;)",
            "Landroid/util/SparseArray<",
            "Ljava/util/Map<",
            "Lu4/u0;",
            "Ln5/m$e;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    new-instance v3, Ljava/util/HashMap;

    invoke-virtual {p0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public bridge synthetic A()Ln5/z;
    .locals 1

    invoke-virtual {p0}, Ln5/m$d$a;->X()Ln5/m$d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic E(Landroid/content/Context;)Ln5/z$a;
    .locals 0

    invoke-virtual {p0, p1}, Ln5/m$d$a;->o0(Landroid/content/Context;)Ln5/m$d$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic G(IIZ)Ln5/z$a;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ln5/m$d$a;->s0(IIZ)Ln5/m$d$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic H(Landroid/content/Context;Z)Ln5/z$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ln5/m$d$a;->t0(Landroid/content/Context;Z)Ln5/m$d$a;

    move-result-object p1

    return-object p1
.end method

.method public X()Ln5/m$d;
    .locals 2

    new-instance v0, Ln5/m$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ln5/m$d;-><init>(Ln5/m$d$a;Ln5/m$a;)V

    return-object v0
.end method

.method public final Z()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln5/m$d$a;->A:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Ln5/m$d$a;->B:Z

    iput-boolean v0, p0, Ln5/m$d$a;->C:Z

    iput-boolean v1, p0, Ln5/m$d$a;->D:Z

    iput-boolean v0, p0, Ln5/m$d$a;->E:Z

    iput-boolean v1, p0, Ln5/m$d$a;->F:Z

    iput-boolean v1, p0, Ln5/m$d$a;->G:Z

    iput-boolean v1, p0, Ln5/m$d$a;->H:Z

    iput-boolean v1, p0, Ln5/m$d$a;->I:Z

    iput-boolean v0, p0, Ln5/m$d$a;->J:Z

    iput-boolean v0, p0, Ln5/m$d$a;->K:Z

    iput-boolean v1, p0, Ln5/m$d$a;->L:Z

    iput-boolean v0, p0, Ln5/m$d$a;->M:Z

    return-void
.end method

.method public final a0([I)Landroid/util/SparseBooleanArray;
    .locals 5

    if-nez p1, :cond_0

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    return-object p1

    :cond_0
    new-instance v0, Landroid/util/SparseBooleanArray;

    array-length v1, p1

    invoke-direct {v0, v1}, Landroid/util/SparseBooleanArray;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget v3, p1, v2

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v4}, Landroid/util/SparseBooleanArray;->append(IZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public b0(Ln5/z;)Ln5/m$d$a;
    .locals 0

    invoke-super {p0, p1}, Ln5/z$a;->D(Ln5/z;)Ln5/z$a;

    return-object p0
.end method

.method public c0(Z)Ln5/m$d$a;
    .locals 0

    iput-boolean p1, p0, Ln5/m$d$a;->H:Z

    return-object p0
.end method

.method public d0(Z)Ln5/m$d$a;
    .locals 0

    iput-boolean p1, p0, Ln5/m$d$a;->I:Z

    return-object p0
.end method

.method public e0(Z)Ln5/m$d$a;
    .locals 0

    iput-boolean p1, p0, Ln5/m$d$a;->F:Z

    return-object p0
.end method

.method public f0(Z)Ln5/m$d$a;
    .locals 0

    iput-boolean p1, p0, Ln5/m$d$a;->G:Z

    return-object p0
.end method

.method public g0(Z)Ln5/m$d$a;
    .locals 0

    iput-boolean p1, p0, Ln5/m$d$a;->M:Z

    return-object p0
.end method

.method public h0(Z)Ln5/m$d$a;
    .locals 0

    iput-boolean p1, p0, Ln5/m$d$a;->D:Z

    return-object p0
.end method

.method public i0(Z)Ln5/m$d$a;
    .locals 0

    iput-boolean p1, p0, Ln5/m$d$a;->B:Z

    return-object p0
.end method

.method public j0(Z)Ln5/m$d$a;
    .locals 0

    iput-boolean p1, p0, Ln5/m$d$a;->C:Z

    return-object p0
.end method

.method public k0(Z)Ln5/m$d$a;
    .locals 0

    iput-boolean p1, p0, Ln5/m$d$a;->J:Z

    return-object p0
.end method

.method public l0(Z)Ln5/m$d$a;
    .locals 0

    iput-boolean p1, p0, Ln5/m$d$a;->E:Z

    return-object p0
.end method

.method public m0(Z)Ln5/m$d$a;
    .locals 0

    iput-boolean p1, p0, Ln5/m$d$a;->K:Z

    return-object p0
.end method

.method public n0(Z)Ln5/m$d$a;
    .locals 0

    iput-boolean p1, p0, Ln5/m$d$a;->A:Z

    return-object p0
.end method

.method public o0(Landroid/content/Context;)Ln5/m$d$a;
    .locals 0

    invoke-super {p0, p1}, Ln5/z$a;->E(Landroid/content/Context;)Ln5/z$a;

    return-object p0
.end method

.method public p0(ILu4/u0;Ln5/m$e;)Ln5/m$d$a;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Ln5/m$d$a;->N:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Ln5/m$d$a;->N:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-object p0

    :cond_1
    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final q0(Landroid/os/Bundle;)V
    .locals 6

    invoke-static {}, Ln5/m$d;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v0

    invoke-static {}, Ln5/m$d;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v2, Lu4/u0;->m:Ls3/h$a;

    invoke-static {v2, v1}, Lp5/c;->b(Ls3/h$a;Ljava/util/List;)Li7/u;

    move-result-object v1

    :goto_0
    invoke-static {}, Ln5/m$d;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object p1

    if-nez p1, :cond_1

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    goto :goto_1

    :cond_1
    sget-object v2, Ln5/m$e;->o:Ls3/h$a;

    invoke-static {v2, p1}, Lp5/c;->c(Ls3/h$a;Landroid/util/SparseArray;)Landroid/util/SparseArray;

    move-result-object p1

    :goto_1
    if-eqz v0, :cond_3

    array-length v2, v0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-eq v2, v3, :cond_2

    goto :goto_3

    :cond_2
    const/4 v2, 0x0

    :goto_2
    array-length v3, v0

    if-ge v2, v3, :cond_3

    aget v3, v0, v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu4/u0;

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln5/m$e;

    invoke-virtual {p0, v3, v4, v5}, Ln5/m$d$a;->p0(ILu4/u0;Ln5/m$e;)Ln5/m$d$a;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    return-void
.end method

.method public r0(Z)Ln5/m$d$a;
    .locals 0

    iput-boolean p1, p0, Ln5/m$d$a;->L:Z

    return-object p0
.end method

.method public s0(IIZ)Ln5/m$d$a;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Ln5/z$a;->G(IIZ)Ln5/z$a;

    return-object p0
.end method

.method public t0(Landroid/content/Context;Z)Ln5/m$d$a;
    .locals 0

    invoke-super {p0, p1, p2}, Ln5/z$a;->H(Landroid/content/Context;Z)Ln5/z$a;

    return-object p0
.end method
