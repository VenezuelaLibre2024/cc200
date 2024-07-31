.class public final Ls3/z3$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/z3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final m:Ljava/lang/String;

.field public static final n:Ljava/lang/String;

.field public static final o:Ljava/lang/String;

.field public static final p:Ljava/lang/String;

.field public static final q:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Ls3/z3$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:Lu4/s0;

.field public final j:Z

.field public final k:[I

.field public final l:[Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/z3$a;->m:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/z3$a;->n:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/z3$a;->o:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/z3$a;->p:Ljava/lang/String;

    sget-object v0, Ls3/y3;->a:Ls3/y3;

    sput-object v0, Ls3/z3$a;->q:Ls3/h$a;

    return-void
.end method

.method public constructor <init>(Lu4/s0;Z[I[Z)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Lu4/s0;->h:I

    iput v0, p0, Ls3/z3$a;->h:I

    array-length v1, p3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    array-length v1, p4

    if-ne v0, v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {v1}, Lp5/a;->a(Z)V

    iput-object p1, p0, Ls3/z3$a;->i:Lu4/s0;

    if-eqz p2, :cond_1

    if-le v0, v3, :cond_1

    move v2, v3

    :cond_1
    iput-boolean v2, p0, Ls3/z3$a;->j:Z

    invoke-virtual {p3}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Ls3/z3$a;->k:[I

    invoke-virtual {p4}, [Z->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Z

    iput-object p1, p0, Ls3/z3$a;->l:[Z

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls3/z3$a;
    .locals 0

    invoke-static {p0}, Ls3/z3$a;->f(Landroid/os/Bundle;)Ls3/z3$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroid/os/Bundle;)Ls3/z3$a;
    .locals 5

    sget-object v0, Lu4/s0;->o:Ls3/h$a;

    sget-object v1, Ls3/z3$a;->m:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    invoke-interface {v0, v1}, Ls3/h$a;->a(Landroid/os/Bundle;)Ls3/h;

    move-result-object v0

    check-cast v0, Lu4/s0;

    sget-object v1, Ls3/z3$a;->n:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v1

    iget v2, v0, Lu4/s0;->h:I

    new-array v2, v2, [I

    invoke-static {v1, v2}, Lh7/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    sget-object v2, Ls3/z3$a;->o:Ljava/lang/String;

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getBooleanArray(Ljava/lang/String;)[Z

    move-result-object v2

    iget v3, v0, Lu4/s0;->h:I

    new-array v3, v3, [Z

    invoke-static {v2, v3}, Lh7/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Z

    sget-object v3, Ls3/z3$a;->p:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {p0, v3, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    new-instance v3, Ls3/z3$a;

    invoke-direct {v3, v0, p0, v1, v2}, Ls3/z3$a;-><init>(Lu4/s0;Z[I[Z)V

    return-object v3
.end method


# virtual methods
.method public b(I)Ls3/m1;
    .locals 1

    iget-object v0, p0, Ls3/z3$a;->i:Lu4/s0;

    invoke-virtual {v0, p1}, Lu4/s0;->b(I)Ls3/m1;

    move-result-object p1

    return-object p1
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Ls3/z3$a;->i:Lu4/s0;

    iget v0, v0, Lu4/s0;->j:I

    return v0
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Ls3/z3$a;->l:[Z

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lk7/a;->b([ZZ)Z

    move-result v0

    return v0
.end method

.method public e(I)Z
    .locals 1

    iget-object v0, p0, Ls3/z3$a;->l:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ls3/z3$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ls3/z3$a;

    iget-boolean v2, p0, Ls3/z3$a;->j:Z

    iget-boolean v3, p1, Ls3/z3$a;->j:Z

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ls3/z3$a;->i:Lu4/s0;

    iget-object v3, p1, Ls3/z3$a;->i:Lu4/s0;

    invoke-virtual {v2, v3}, Lu4/s0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls3/z3$a;->k:[I

    iget-object v3, p1, Ls3/z3$a;->k:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls3/z3$a;->l:[Z

    iget-object p1, p1, Ls3/z3$a;->l:[Z

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Z[Z)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Ls3/z3$a;->i:Lu4/s0;

    invoke-virtual {v0}, Lu4/s0;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ls3/z3$a;->j:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/z3$a;->k:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/z3$a;->l:[Z

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
