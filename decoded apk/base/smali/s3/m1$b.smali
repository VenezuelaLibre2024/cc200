.class public final Ls3/m1$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/m1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Ljava/lang/String;

.field public i:Lk4/a;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:I

.field public m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field public n:Lw3/m;

.field public o:J

.field public p:I

.field public q:I

.field public r:F

.field public s:I

.field public t:F

.field public u:[B

.field public v:I

.field public w:Lq5/c;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ls3/m1$b;->f:I

    iput v0, p0, Ls3/m1$b;->g:I

    iput v0, p0, Ls3/m1$b;->l:I

    const-wide v1, 0x7fffffffffffffffL

    iput-wide v1, p0, Ls3/m1$b;->o:J

    iput v0, p0, Ls3/m1$b;->p:I

    iput v0, p0, Ls3/m1$b;->q:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Ls3/m1$b;->r:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Ls3/m1$b;->t:F

    iput v0, p0, Ls3/m1$b;->v:I

    iput v0, p0, Ls3/m1$b;->x:I

    iput v0, p0, Ls3/m1$b;->y:I

    iput v0, p0, Ls3/m1$b;->z:I

    iput v0, p0, Ls3/m1$b;->C:I

    iput v0, p0, Ls3/m1$b;->D:I

    iput v0, p0, Ls3/m1$b;->E:I

    const/4 v0, 0x0

    iput v0, p0, Ls3/m1$b;->F:I

    return-void
.end method

.method public constructor <init>(Ls3/m1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ls3/m1;->h:Ljava/lang/String;

    iput-object v0, p0, Ls3/m1$b;->a:Ljava/lang/String;

    iget-object v0, p1, Ls3/m1;->i:Ljava/lang/String;

    iput-object v0, p0, Ls3/m1$b;->b:Ljava/lang/String;

    iget-object v0, p1, Ls3/m1;->j:Ljava/lang/String;

    iput-object v0, p0, Ls3/m1$b;->c:Ljava/lang/String;

    iget v0, p1, Ls3/m1;->k:I

    iput v0, p0, Ls3/m1$b;->d:I

    iget v0, p1, Ls3/m1;->l:I

    iput v0, p0, Ls3/m1$b;->e:I

    iget v0, p1, Ls3/m1;->m:I

    iput v0, p0, Ls3/m1$b;->f:I

    iget v0, p1, Ls3/m1;->n:I

    iput v0, p0, Ls3/m1$b;->g:I

    iget-object v0, p1, Ls3/m1;->p:Ljava/lang/String;

    iput-object v0, p0, Ls3/m1$b;->h:Ljava/lang/String;

    iget-object v0, p1, Ls3/m1;->q:Lk4/a;

    iput-object v0, p0, Ls3/m1$b;->i:Lk4/a;

    iget-object v0, p1, Ls3/m1;->r:Ljava/lang/String;

    iput-object v0, p0, Ls3/m1$b;->j:Ljava/lang/String;

    iget-object v0, p1, Ls3/m1;->s:Ljava/lang/String;

    iput-object v0, p0, Ls3/m1$b;->k:Ljava/lang/String;

    iget v0, p1, Ls3/m1;->t:I

    iput v0, p0, Ls3/m1$b;->l:I

    iget-object v0, p1, Ls3/m1;->u:Ljava/util/List;

    iput-object v0, p0, Ls3/m1$b;->m:Ljava/util/List;

    iget-object v0, p1, Ls3/m1;->v:Lw3/m;

    iput-object v0, p0, Ls3/m1$b;->n:Lw3/m;

    iget-wide v0, p1, Ls3/m1;->w:J

    iput-wide v0, p0, Ls3/m1$b;->o:J

    iget v0, p1, Ls3/m1;->x:I

    iput v0, p0, Ls3/m1$b;->p:I

    iget v0, p1, Ls3/m1;->y:I

    iput v0, p0, Ls3/m1$b;->q:I

    iget v0, p1, Ls3/m1;->z:F

    iput v0, p0, Ls3/m1$b;->r:F

    iget v0, p1, Ls3/m1;->A:I

    iput v0, p0, Ls3/m1$b;->s:I

    iget v0, p1, Ls3/m1;->B:F

    iput v0, p0, Ls3/m1$b;->t:F

    iget-object v0, p1, Ls3/m1;->C:[B

    iput-object v0, p0, Ls3/m1$b;->u:[B

    iget v0, p1, Ls3/m1;->D:I

    iput v0, p0, Ls3/m1$b;->v:I

    iget-object v0, p1, Ls3/m1;->E:Lq5/c;

    iput-object v0, p0, Ls3/m1$b;->w:Lq5/c;

    iget v0, p1, Ls3/m1;->F:I

    iput v0, p0, Ls3/m1$b;->x:I

    iget v0, p1, Ls3/m1;->G:I

    iput v0, p0, Ls3/m1$b;->y:I

    iget v0, p1, Ls3/m1;->H:I

    iput v0, p0, Ls3/m1$b;->z:I

    iget v0, p1, Ls3/m1;->I:I

    iput v0, p0, Ls3/m1$b;->A:I

    iget v0, p1, Ls3/m1;->J:I

    iput v0, p0, Ls3/m1$b;->B:I

    iget v0, p1, Ls3/m1;->K:I

    iput v0, p0, Ls3/m1$b;->C:I

    iget v0, p1, Ls3/m1;->L:I

    iput v0, p0, Ls3/m1$b;->D:I

    iget v0, p1, Ls3/m1;->M:I

    iput v0, p0, Ls3/m1$b;->E:I

    iget p1, p1, Ls3/m1;->N:I

    iput p1, p0, Ls3/m1$b;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ls3/m1;Ls3/m1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/m1$b;-><init>(Ls3/m1;)V

    return-void
.end method

.method public static synthetic A(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->d:I

    return p0
.end method

.method public static synthetic B(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->e:I

    return p0
.end method

.method public static synthetic C(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->f:I

    return p0
.end method

.method public static synthetic D(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->g:I

    return p0
.end method

.method public static synthetic E(Ls3/m1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls3/m1$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic F(Ls3/m1$b;)Lk4/a;
    .locals 0

    iget-object p0, p0, Ls3/m1$b;->i:Lk4/a;

    return-object p0
.end method

.method public static synthetic a(Ls3/m1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls3/m1$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic b(Ls3/m1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls3/m1$b;->j:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(Ls3/m1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls3/m1$b;->k:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic d(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->l:I

    return p0
.end method

.method public static synthetic e(Ls3/m1$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ls3/m1$b;->m:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic f(Ls3/m1$b;)Lw3/m;
    .locals 0

    iget-object p0, p0, Ls3/m1$b;->n:Lw3/m;

    return-object p0
.end method

.method public static synthetic g(Ls3/m1$b;)J
    .locals 2

    iget-wide v0, p0, Ls3/m1$b;->o:J

    return-wide v0
.end method

.method public static synthetic h(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->p:I

    return p0
.end method

.method public static synthetic i(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->q:I

    return p0
.end method

.method public static synthetic j(Ls3/m1$b;)F
    .locals 0

    iget p0, p0, Ls3/m1$b;->r:F

    return p0
.end method

.method public static synthetic k(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->s:I

    return p0
.end method

.method public static synthetic l(Ls3/m1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls3/m1$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic m(Ls3/m1$b;)F
    .locals 0

    iget p0, p0, Ls3/m1$b;->t:F

    return p0
.end method

.method public static synthetic n(Ls3/m1$b;)[B
    .locals 0

    iget-object p0, p0, Ls3/m1$b;->u:[B

    return-object p0
.end method

.method public static synthetic o(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->v:I

    return p0
.end method

.method public static synthetic p(Ls3/m1$b;)Lq5/c;
    .locals 0

    iget-object p0, p0, Ls3/m1$b;->w:Lq5/c;

    return-object p0
.end method

.method public static synthetic q(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->x:I

    return p0
.end method

.method public static synthetic r(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->y:I

    return p0
.end method

.method public static synthetic s(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->z:I

    return p0
.end method

.method public static synthetic t(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->A:I

    return p0
.end method

.method public static synthetic u(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->B:I

    return p0
.end method

.method public static synthetic v(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->C:I

    return p0
.end method

.method public static synthetic w(Ls3/m1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls3/m1$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic x(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->D:I

    return p0
.end method

.method public static synthetic y(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->E:I

    return p0
.end method

.method public static synthetic z(Ls3/m1$b;)I
    .locals 0

    iget p0, p0, Ls3/m1$b;->F:I

    return p0
.end method


# virtual methods
.method public G()Ls3/m1;
    .locals 2

    new-instance v0, Ls3/m1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls3/m1;-><init>(Ls3/m1$b;Ls3/m1$a;)V

    return-object v0
.end method

.method public H(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->C:I

    return-object p0
.end method

.method public I(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->f:I

    return-object p0
.end method

.method public J(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->x:I

    return-object p0
.end method

.method public K(Ljava/lang/String;)Ls3/m1$b;
    .locals 0

    iput-object p1, p0, Ls3/m1$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method public L(Lq5/c;)Ls3/m1$b;
    .locals 0

    iput-object p1, p0, Ls3/m1$b;->w:Lq5/c;

    return-object p0
.end method

.method public M(Ljava/lang/String;)Ls3/m1$b;
    .locals 0

    iput-object p1, p0, Ls3/m1$b;->j:Ljava/lang/String;

    return-object p0
.end method

.method public N(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->F:I

    return-object p0
.end method

.method public O(Lw3/m;)Ls3/m1$b;
    .locals 0

    iput-object p1, p0, Ls3/m1$b;->n:Lw3/m;

    return-object p0
.end method

.method public P(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->A:I

    return-object p0
.end method

.method public Q(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->B:I

    return-object p0
.end method

.method public R(F)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->r:F

    return-object p0
.end method

.method public S(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->q:I

    return-object p0
.end method

.method public T(I)Ls3/m1$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ls3/m1$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public U(Ljava/lang/String;)Ls3/m1$b;
    .locals 0

    iput-object p1, p0, Ls3/m1$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public V(Ljava/util/List;)Ls3/m1$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)",
            "Ls3/m1$b;"
        }
    .end annotation

    iput-object p1, p0, Ls3/m1$b;->m:Ljava/util/List;

    return-object p0
.end method

.method public W(Ljava/lang/String;)Ls3/m1$b;
    .locals 0

    iput-object p1, p0, Ls3/m1$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public X(Ljava/lang/String;)Ls3/m1$b;
    .locals 0

    iput-object p1, p0, Ls3/m1$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public Y(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->l:I

    return-object p0
.end method

.method public Z(Lk4/a;)Ls3/m1$b;
    .locals 0

    iput-object p1, p0, Ls3/m1$b;->i:Lk4/a;

    return-object p0
.end method

.method public a0(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->z:I

    return-object p0
.end method

.method public b0(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->g:I

    return-object p0
.end method

.method public c0(F)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->t:F

    return-object p0
.end method

.method public d0([B)Ls3/m1$b;
    .locals 0

    iput-object p1, p0, Ls3/m1$b;->u:[B

    return-object p0
.end method

.method public e0(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->e:I

    return-object p0
.end method

.method public f0(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->s:I

    return-object p0
.end method

.method public g0(Ljava/lang/String;)Ls3/m1$b;
    .locals 0

    iput-object p1, p0, Ls3/m1$b;->k:Ljava/lang/String;

    return-object p0
.end method

.method public h0(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->y:I

    return-object p0
.end method

.method public i0(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->d:I

    return-object p0
.end method

.method public j0(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->v:I

    return-object p0
.end method

.method public k0(J)Ls3/m1$b;
    .locals 0

    iput-wide p1, p0, Ls3/m1$b;->o:J

    return-object p0
.end method

.method public l0(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->D:I

    return-object p0
.end method

.method public m0(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->E:I

    return-object p0
.end method

.method public n0(I)Ls3/m1$b;
    .locals 0

    iput p1, p0, Ls3/m1$b;->p:I

    return-object p0
.end method
