.class public final Ls3/v2;
.super Ls3/h3;
.source ""


# static fields
.field public static final k:Ljava/lang/String;

.field public static final l:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Ls3/v2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final j:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/v2;->k:Ljava/lang/String;

    sget-object v0, Ls3/u2;->a:Ls3/u2;

    sput-object v0, Ls3/v2;->l:Ls3/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ls3/h3;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Ls3/v2;->j:F

    return-void
.end method

.method public constructor <init>(F)V
    .locals 2

    invoke-direct {p0}, Ls3/h3;-><init>()V

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x42c80000    # 100.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "percent must be in the range of [0, 100]"

    invoke-static {v0, v1}, Lp5/a;->b(ZLjava/lang/Object;)V

    iput p1, p0, Ls3/v2;->j:F

    return-void
.end method

.method public static synthetic c(Landroid/os/Bundle;)Ls3/v2;
    .locals 0

    invoke-static {p0}, Ls3/v2;->d(Landroid/os/Bundle;)Ls3/v2;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/os/Bundle;)Ls3/v2;
    .locals 2

    sget-object v0, Ls3/h3;->h:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lp5/a;->a(Z)V

    sget-object v0, Ls3/v2;->k:Ljava/lang/String;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p0

    cmpl-float v0, p0, v1

    if-nez v0, :cond_1

    new-instance p0, Ls3/v2;

    invoke-direct {p0}, Ls3/v2;-><init>()V

    goto :goto_1

    :cond_1
    new-instance v0, Ls3/v2;

    invoke-direct {v0, p0}, Ls3/v2;-><init>(F)V

    move-object p0, v0

    :goto_1
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ls3/v2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Ls3/v2;->j:F

    check-cast p1, Ls3/v2;

    iget p1, p1, Ls3/v2;->j:F

    cmpl-float p1, v0, p1

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Ls3/v2;->j:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lh7/k;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
