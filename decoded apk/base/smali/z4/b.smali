.class public final Lz4/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz4/k;


# static fields
.field public static final d:Lx3/y;


# instance fields
.field public final a:Lx3/k;

.field public final b:Ls3/m1;

.field public final c:Lp5/j0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx3/y;

    invoke-direct {v0}, Lx3/y;-><init>()V

    sput-object v0, Lz4/b;->d:Lx3/y;

    return-void
.end method

.method public constructor <init>(Lx3/k;Ls3/m1;Lp5/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/b;->a:Lx3/k;

    iput-object p2, p0, Lz4/b;->b:Ls3/m1;

    iput-object p3, p0, Lz4/b;->c:Lp5/j0;

    return-void
.end method


# virtual methods
.method public a(Lx3/l;)Z
    .locals 2

    iget-object v0, p0, Lz4/b;->a:Lx3/k;

    sget-object v1, Lz4/b;->d:Lx3/y;

    invoke-interface {v0, p1, v1}, Lx3/k;->g(Lx3/l;Lx3/y;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b(Lx3/m;)V
    .locals 1

    iget-object v0, p0, Lz4/b;->a:Lx3/k;

    invoke-interface {v0, p1}, Lx3/k;->b(Lx3/m;)V

    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lz4/b;->a:Lx3/k;

    const-wide/16 v1, 0x0

    invoke-interface {v0, v1, v2, v1, v2}, Lx3/k;->c(JJ)V

    return-void
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lz4/b;->a:Lx3/k;

    instance-of v1, v0, Lh4/h;

    if-nez v1, :cond_1

    instance-of v1, v0, Lh4/b;

    if-nez v1, :cond_1

    instance-of v1, v0, Lh4/e;

    if-nez v1, :cond_1

    instance-of v0, v0, Le4/f;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Lz4/b;->a:Lx3/k;

    instance-of v1, v0, Lh4/h0;

    if-nez v1, :cond_1

    instance-of v0, v0, Lf4/g;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public f()Lz4/k;
    .locals 4

    invoke-virtual {p0}, Lz4/b;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-object v0, p0, Lz4/b;->a:Lx3/k;

    instance-of v1, v0, Lz4/u;

    if-eqz v1, :cond_0

    new-instance v0, Lz4/u;

    iget-object v1, p0, Lz4/b;->b:Ls3/m1;

    iget-object v1, v1, Ls3/m1;->j:Ljava/lang/String;

    iget-object v2, p0, Lz4/b;->c:Lp5/j0;

    invoke-direct {v0, v1, v2}, Lz4/u;-><init>(Ljava/lang/String;Lp5/j0;)V

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lh4/h;

    if-eqz v1, :cond_1

    new-instance v0, Lh4/h;

    invoke-direct {v0}, Lh4/h;-><init>()V

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lh4/b;

    if-eqz v1, :cond_2

    new-instance v0, Lh4/b;

    invoke-direct {v0}, Lh4/b;-><init>()V

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lh4/e;

    if-eqz v1, :cond_3

    new-instance v0, Lh4/e;

    invoke-direct {v0}, Lh4/e;-><init>()V

    goto :goto_0

    :cond_3
    instance-of v0, v0, Le4/f;

    if-eqz v0, :cond_4

    new-instance v0, Le4/f;

    invoke-direct {v0}, Le4/f;-><init>()V

    :goto_0
    new-instance v1, Lz4/b;

    iget-object v2, p0, Lz4/b;->b:Ls3/m1;

    iget-object v3, p0, Lz4/b;->c:Lp5/j0;

    invoke-direct {v1, v0, v2, v3}, Lz4/b;-><init>(Lx3/k;Ls3/m1;Lp5/j0;)V

    return-object v1

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected extractor type for recreation: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz4/b;->a:Lx3/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
