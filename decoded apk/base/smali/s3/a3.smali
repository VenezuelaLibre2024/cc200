.class public final Ls3/a3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/h;


# static fields
.field public static final k:Ls3/a3;

.field public static final l:Ljava/lang/String;

.field public static final m:Ljava/lang/String;

.field public static final n:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Ls3/a3;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:F

.field public final i:F

.field public final j:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls3/a3;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1}, Ls3/a3;-><init>(F)V

    sput-object v0, Ls3/a3;->k:Ls3/a3;

    const/4 v0, 0x0

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/a3;->l:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/a3;->m:Ljava/lang/String;

    sget-object v0, Ls3/z2;->a:Ls3/z2;

    sput-object v0, Ls3/a3;->n:Ls3/h$a;

    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, p1, v0}, Ls3/a3;-><init>(FF)V

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    invoke-static {v1}, Lp5/a;->a(Z)V

    cmpl-float v0, p2, v0

    if-lez v0, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-static {v2}, Lp5/a;->a(Z)V

    iput p1, p0, Ls3/a3;->h:F

    iput p2, p0, Ls3/a3;->i:F

    const/high16 p2, 0x447a0000    # 1000.0f

    mul-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Ls3/a3;->j:I

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls3/a3;
    .locals 0

    invoke-static {p0}, Ls3/a3;->c(Landroid/os/Bundle;)Ls3/a3;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/os/Bundle;)Ls3/a3;
    .locals 3

    sget-object v0, Ls3/a3;->l:Ljava/lang/String;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v0

    sget-object v2, Ls3/a3;->m:Ljava/lang/String;

    invoke-virtual {p0, v2, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p0

    new-instance v1, Ls3/a3;

    invoke-direct {v1, v0, p0}, Ls3/a3;-><init>(FF)V

    return-object v1
.end method


# virtual methods
.method public b(J)J
    .locals 2

    iget v0, p0, Ls3/a3;->j:I

    int-to-long v0, v0

    mul-long/2addr p1, v0

    return-wide p1
.end method

.method public d(F)Ls3/a3;
    .locals 2

    new-instance v0, Ls3/a3;

    iget v1, p0, Ls3/a3;->i:F

    invoke-direct {v0, p1, v1}, Ls3/a3;-><init>(FF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ls3/a3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ls3/a3;

    iget v2, p0, Ls3/a3;->h:F

    iget v3, p1, Ls3/a3;->h:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_2

    iget v2, p0, Ls3/a3;->i:F

    iget p1, p1, Ls3/a3;->i:F

    cmpl-float p1, v2, p1

    if-nez p1, :cond_2

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

    iget v0, p0, Ls3/a3;->h:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Ls3/a3;->i:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Ls3/a3;->h:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Ls3/a3;->i:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "PlaybackParameters(speed=%.2f, pitch=%.2f)"

    invoke-static {v1, v0}, Lp5/n0;->C(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
