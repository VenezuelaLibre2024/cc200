.class public final Ls3/u1$g$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/u1$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:F

.field public e:F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Ls3/u1$g$a;->a:J

    iput-wide v0, p0, Ls3/u1$g$a;->b:J

    iput-wide v0, p0, Ls3/u1$g$a;->c:J

    const v0, -0x800001

    iput v0, p0, Ls3/u1$g$a;->d:F

    iput v0, p0, Ls3/u1$g$a;->e:F

    return-void
.end method

.method public constructor <init>(Ls3/u1$g;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-wide v0, p1, Ls3/u1$g;->h:J

    iput-wide v0, p0, Ls3/u1$g$a;->a:J

    iget-wide v0, p1, Ls3/u1$g;->i:J

    iput-wide v0, p0, Ls3/u1$g$a;->b:J

    iget-wide v0, p1, Ls3/u1$g;->j:J

    iput-wide v0, p0, Ls3/u1$g$a;->c:J

    iget v0, p1, Ls3/u1$g;->k:F

    iput v0, p0, Ls3/u1$g$a;->d:F

    iget p1, p1, Ls3/u1$g;->l:F

    iput p1, p0, Ls3/u1$g$a;->e:F

    return-void
.end method

.method public synthetic constructor <init>(Ls3/u1$g;Ls3/u1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/u1$g$a;-><init>(Ls3/u1$g;)V

    return-void
.end method

.method public static synthetic a(Ls3/u1$g$a;)J
    .locals 2

    iget-wide v0, p0, Ls3/u1$g$a;->a:J

    return-wide v0
.end method

.method public static synthetic b(Ls3/u1$g$a;)J
    .locals 2

    iget-wide v0, p0, Ls3/u1$g$a;->b:J

    return-wide v0
.end method

.method public static synthetic c(Ls3/u1$g$a;)J
    .locals 2

    iget-wide v0, p0, Ls3/u1$g$a;->c:J

    return-wide v0
.end method

.method public static synthetic d(Ls3/u1$g$a;)F
    .locals 0

    iget p0, p0, Ls3/u1$g$a;->d:F

    return p0
.end method

.method public static synthetic e(Ls3/u1$g$a;)F
    .locals 0

    iget p0, p0, Ls3/u1$g$a;->e:F

    return p0
.end method


# virtual methods
.method public f()Ls3/u1$g;
    .locals 2

    new-instance v0, Ls3/u1$g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls3/u1$g;-><init>(Ls3/u1$g$a;Ls3/u1$a;)V

    return-object v0
.end method

.method public g(J)Ls3/u1$g$a;
    .locals 0

    iput-wide p1, p0, Ls3/u1$g$a;->c:J

    return-object p0
.end method

.method public h(F)Ls3/u1$g$a;
    .locals 0

    iput p1, p0, Ls3/u1$g$a;->e:F

    return-object p0
.end method

.method public i(J)Ls3/u1$g$a;
    .locals 0

    iput-wide p1, p0, Ls3/u1$g$a;->b:J

    return-object p0
.end method

.method public j(F)Ls3/u1$g$a;
    .locals 0

    iput p1, p0, Ls3/u1$g$a;->d:F

    return-object p0
.end method

.method public k(J)Ls3/u1$g$a;
    .locals 0

    iput-wide p1, p0, Ls3/u1$g$a;->a:J

    return-object p0
.end method
