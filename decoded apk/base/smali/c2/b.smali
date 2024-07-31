.class public final Lc2/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc2/b$a;
    }
.end annotation


# static fields
.field public static final i:Lc2/b;


# instance fields
.field public a:Lc2/k;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:J

.field public g:J

.field public h:Lc2/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc2/b$a;

    invoke-direct {v0}, Lc2/b$a;-><init>()V

    invoke-virtual {v0}, Lc2/b$a;->a()Lc2/b;

    move-result-object v0

    sput-object v0, Lc2/b;->i:Lc2/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lc2/k;->h:Lc2/k;

    iput-object v0, p0, Lc2/b;->a:Lc2/k;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lc2/b;->f:J

    iput-wide v0, p0, Lc2/b;->g:J

    new-instance v0, Lc2/c;

    invoke-direct {v0}, Lc2/c;-><init>()V

    iput-object v0, p0, Lc2/b;->h:Lc2/c;

    return-void
.end method

.method public constructor <init>(Lc2/b$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lc2/k;->h:Lc2/k;

    iput-object v0, p0, Lc2/b;->a:Lc2/k;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lc2/b;->f:J

    iput-wide v0, p0, Lc2/b;->g:J

    new-instance v0, Lc2/c;

    invoke-direct {v0}, Lc2/c;-><init>()V

    iput-object v0, p0, Lc2/b;->h:Lc2/c;

    iget-boolean v0, p1, Lc2/b$a;->a:Z

    iput-boolean v0, p0, Lc2/b;->b:Z

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    iget-boolean v1, p1, Lc2/b$a;->b:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lc2/b;->c:Z

    iget-object v1, p1, Lc2/b$a;->c:Lc2/k;

    iput-object v1, p0, Lc2/b;->a:Lc2/k;

    iget-boolean v1, p1, Lc2/b$a;->d:Z

    iput-boolean v1, p0, Lc2/b;->d:Z

    iget-boolean v1, p1, Lc2/b$a;->e:Z

    iput-boolean v1, p0, Lc2/b;->e:Z

    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    iget-object v0, p1, Lc2/b$a;->h:Lc2/c;

    iput-object v0, p0, Lc2/b;->h:Lc2/c;

    iget-wide v0, p1, Lc2/b$a;->f:J

    iput-wide v0, p0, Lc2/b;->f:J

    iget-wide v0, p1, Lc2/b$a;->g:J

    iput-wide v0, p0, Lc2/b;->g:J

    :cond_1
    return-void
.end method

.method public constructor <init>(Lc2/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lc2/k;->h:Lc2/k;

    iput-object v0, p0, Lc2/b;->a:Lc2/k;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lc2/b;->f:J

    iput-wide v0, p0, Lc2/b;->g:J

    new-instance v0, Lc2/c;

    invoke-direct {v0}, Lc2/c;-><init>()V

    iput-object v0, p0, Lc2/b;->h:Lc2/c;

    iget-boolean v0, p1, Lc2/b;->b:Z

    iput-boolean v0, p0, Lc2/b;->b:Z

    iget-boolean v0, p1, Lc2/b;->c:Z

    iput-boolean v0, p0, Lc2/b;->c:Z

    iget-object v0, p1, Lc2/b;->a:Lc2/k;

    iput-object v0, p0, Lc2/b;->a:Lc2/k;

    iget-boolean v0, p1, Lc2/b;->d:Z

    iput-boolean v0, p0, Lc2/b;->d:Z

    iget-boolean v0, p1, Lc2/b;->e:Z

    iput-boolean v0, p0, Lc2/b;->e:Z

    iget-object p1, p1, Lc2/b;->h:Lc2/c;

    iput-object p1, p0, Lc2/b;->h:Lc2/c;

    return-void
.end method


# virtual methods
.method public a()Lc2/c;
    .locals 1

    iget-object v0, p0, Lc2/b;->h:Lc2/c;

    return-object v0
.end method

.method public b()Lc2/k;
    .locals 1

    iget-object v0, p0, Lc2/b;->a:Lc2/k;

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lc2/b;->f:J

    return-wide v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lc2/b;->g:J

    return-wide v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lc2/b;->h:Lc2/c;

    invoke-virtual {v0}, Lc2/c;->c()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_9

    const-class v1, Lc2/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lc2/b;

    iget-boolean v1, p0, Lc2/b;->b:Z

    iget-boolean v2, p1, Lc2/b;->b:Z

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    iget-boolean v1, p0, Lc2/b;->c:Z

    iget-boolean v2, p1, Lc2/b;->c:Z

    if-eq v1, v2, :cond_3

    return v0

    :cond_3
    iget-boolean v1, p0, Lc2/b;->d:Z

    iget-boolean v2, p1, Lc2/b;->d:Z

    if-eq v1, v2, :cond_4

    return v0

    :cond_4
    iget-boolean v1, p0, Lc2/b;->e:Z

    iget-boolean v2, p1, Lc2/b;->e:Z

    if-eq v1, v2, :cond_5

    return v0

    :cond_5
    iget-wide v1, p0, Lc2/b;->f:J

    iget-wide v3, p1, Lc2/b;->f:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_6

    return v0

    :cond_6
    iget-wide v1, p0, Lc2/b;->g:J

    iget-wide v3, p1, Lc2/b;->g:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_7

    return v0

    :cond_7
    iget-object v1, p0, Lc2/b;->a:Lc2/k;

    iget-object v2, p1, Lc2/b;->a:Lc2/k;

    if-eq v1, v2, :cond_8

    return v0

    :cond_8
    iget-object v0, p0, Lc2/b;->h:Lc2/c;

    iget-object p1, p1, Lc2/b;->h:Lc2/c;

    invoke-virtual {v0, p1}, Lc2/c;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_9
    :goto_0
    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lc2/b;->d:Z

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lc2/b;->b:Z

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lc2/b;->c:Z

    return v0
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lc2/b;->a:Lc2/k;

    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lc2/b;->b:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lc2/b;->c:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lc2/b;->d:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lc2/b;->e:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lc2/b;->f:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lc2/b;->g:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc2/b;->h:Lc2/c;

    invoke-virtual {v1}, Lc2/c;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lc2/b;->e:Z

    return v0
.end method

.method public j(Lc2/c;)V
    .locals 0

    iput-object p1, p0, Lc2/b;->h:Lc2/c;

    return-void
.end method

.method public k(Lc2/k;)V
    .locals 0

    iput-object p1, p0, Lc2/b;->a:Lc2/k;

    return-void
.end method

.method public l(Z)V
    .locals 0

    iput-boolean p1, p0, Lc2/b;->d:Z

    return-void
.end method

.method public m(Z)V
    .locals 0

    iput-boolean p1, p0, Lc2/b;->b:Z

    return-void
.end method

.method public n(Z)V
    .locals 0

    iput-boolean p1, p0, Lc2/b;->c:Z

    return-void
.end method

.method public o(Z)V
    .locals 0

    iput-boolean p1, p0, Lc2/b;->e:Z

    return-void
.end method

.method public p(J)V
    .locals 0

    iput-wide p1, p0, Lc2/b;->f:J

    return-void
.end method

.method public q(J)V
    .locals 0

    iput-wide p1, p0, Lc2/b;->g:J

    return-void
.end method
