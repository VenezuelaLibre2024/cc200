.class public final Ls3/r$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public A:Z

.field public B:Landroid/os/Looper;

.field public C:Z

.field public final a:Landroid/content/Context;

.field public b:Lp5/d;

.field public c:J

.field public d:Lh7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/u<",
            "Ls3/l3;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lh7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/u<",
            "Lu4/t$a;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lh7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/u<",
            "Ln5/b0;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lh7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/u<",
            "Ls3/s1;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lh7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/u<",
            "Lo5/e;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lh7/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/g<",
            "Lp5/d;",
            "Lt3/a;",
            ">;"
        }
    .end annotation
.end field

.field public j:Landroid/os/Looper;

.field public k:Lp5/c0;

.field public l:Lu3/e;

.field public m:Z

.field public n:I

.field public o:Z

.field public p:Z

.field public q:I

.field public r:I

.field public s:Z

.field public t:Ls3/m3;

.field public u:J

.field public v:J

.field public w:Ls3/r1;

.field public x:J

.field public y:J

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Ls3/u;

    invoke-direct {v0, p1}, Ls3/u;-><init>(Landroid/content/Context;)V

    new-instance v1, Ls3/w;

    invoke-direct {v1, p1}, Ls3/w;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, v0, v1}, Ls3/r$b;-><init>(Landroid/content/Context;Lh7/u;Lh7/u;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lh7/u;Lh7/u;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lh7/u<",
            "Ls3/l3;",
            ">;",
            "Lh7/u<",
            "Lu4/t$a;",
            ">;)V"
        }
    .end annotation

    new-instance v4, Ls3/v;

    invoke-direct {v4, p1}, Ls3/v;-><init>(Landroid/content/Context;)V

    sget-object v5, Ls3/x;->h:Ls3/x;

    new-instance v6, Ls3/t;

    invoke-direct {v6, p1}, Ls3/t;-><init>(Landroid/content/Context;)V

    sget-object v7, Ls3/s;->h:Ls3/s;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v7}, Ls3/r$b;-><init>(Landroid/content/Context;Lh7/u;Lh7/u;Lh7/u;Lh7/u;Lh7/u;Lh7/g;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lh7/u;Lh7/u;Lh7/u;Lh7/u;Lh7/u;Lh7/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lh7/u<",
            "Ls3/l3;",
            ">;",
            "Lh7/u<",
            "Lu4/t$a;",
            ">;",
            "Lh7/u<",
            "Ln5/b0;",
            ">;",
            "Lh7/u<",
            "Ls3/s1;",
            ">;",
            "Lh7/u<",
            "Lo5/e;",
            ">;",
            "Lh7/g<",
            "Lp5/d;",
            "Lt3/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Ls3/r$b;->a:Landroid/content/Context;

    iput-object p2, p0, Ls3/r$b;->d:Lh7/u;

    iput-object p3, p0, Ls3/r$b;->e:Lh7/u;

    iput-object p4, p0, Ls3/r$b;->f:Lh7/u;

    iput-object p5, p0, Ls3/r$b;->g:Lh7/u;

    iput-object p6, p0, Ls3/r$b;->h:Lh7/u;

    iput-object p7, p0, Ls3/r$b;->i:Lh7/g;

    invoke-static {}, Lp5/n0;->Q()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, Ls3/r$b;->j:Landroid/os/Looper;

    sget-object p1, Lu3/e;->n:Lu3/e;

    iput-object p1, p0, Ls3/r$b;->l:Lu3/e;

    const/4 p1, 0x0

    iput p1, p0, Ls3/r$b;->n:I

    const/4 p2, 0x1

    iput p2, p0, Ls3/r$b;->q:I

    iput p1, p0, Ls3/r$b;->r:I

    iput-boolean p2, p0, Ls3/r$b;->s:Z

    sget-object p1, Ls3/m3;->g:Ls3/m3;

    iput-object p1, p0, Ls3/r$b;->t:Ls3/m3;

    const-wide/16 p3, 0x1388

    iput-wide p3, p0, Ls3/r$b;->u:J

    const-wide/16 p3, 0x3a98

    iput-wide p3, p0, Ls3/r$b;->v:J

    new-instance p1, Ls3/j$b;

    invoke-direct {p1}, Ls3/j$b;-><init>()V

    invoke-virtual {p1}, Ls3/j$b;->a()Ls3/j;

    move-result-object p1

    iput-object p1, p0, Ls3/r$b;->w:Ls3/r1;

    sget-object p1, Lp5/d;->a:Lp5/d;

    iput-object p1, p0, Ls3/r$b;->b:Lp5/d;

    const-wide/16 p3, 0x1f4

    iput-wide p3, p0, Ls3/r$b;->x:J

    const-wide/16 p3, 0x7d0

    iput-wide p3, p0, Ls3/r$b;->y:J

    iput-boolean p2, p0, Ls3/r$b;->A:Z

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)Lo5/e;
    .locals 0

    invoke-static {p0}, Ls3/r$b;->i(Landroid/content/Context;)Lo5/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;)Ls3/l3;
    .locals 0

    invoke-static {p0}, Ls3/r$b;->f(Landroid/content/Context;)Ls3/l3;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;)Ln5/b0;
    .locals 0

    invoke-static {p0}, Ls3/r$b;->h(Landroid/content/Context;)Ln5/b0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/content/Context;)Lu4/t$a;
    .locals 0

    invoke-static {p0}, Ls3/r$b;->g(Landroid/content/Context;)Lu4/t$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroid/content/Context;)Ls3/l3;
    .locals 1

    new-instance v0, Ls3/m;

    invoke-direct {v0, p0}, Ls3/m;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static synthetic g(Landroid/content/Context;)Lu4/t$a;
    .locals 2

    new-instance v0, Lu4/j;

    new-instance v1, Lx3/h;

    invoke-direct {v1}, Lx3/h;-><init>()V

    invoke-direct {v0, p0, v1}, Lu4/j;-><init>(Landroid/content/Context;Lx3/p;)V

    return-object v0
.end method

.method public static synthetic h(Landroid/content/Context;)Ln5/b0;
    .locals 1

    new-instance v0, Ln5/m;

    invoke-direct {v0, p0}, Ln5/m;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static synthetic i(Landroid/content/Context;)Lo5/e;
    .locals 0

    invoke-static {p0}, Lo5/q;->n(Landroid/content/Context;)Lo5/q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public e()Ls3/r;
    .locals 2

    iget-boolean v0, p0, Ls3/r$b;->C:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lp5/a;->f(Z)V

    iput-boolean v1, p0, Ls3/r$b;->C:Z

    new-instance v0, Ls3/w0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls3/w0;-><init>(Ls3/r$b;Ls3/b3;)V

    return-object v0
.end method
