.class public final Lp5/d0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lp5/d0;

.field public static final d:Lp5/d0;


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp5/d0;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Lp5/d0;-><init>(II)V

    sput-object v0, Lp5/d0;->c:Lp5/d0;

    new-instance v0, Lp5/d0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lp5/d0;-><init>(II)V

    sput-object v0, Lp5/d0;->d:Lp5/d0;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    if-ltz p1, :cond_1

    :cond_0
    if-eq p2, v0, :cond_2

    if-ltz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lp5/a;->a(Z)V

    iput p1, p0, Lp5/d0;->a:I

    iput p2, p0, Lp5/d0;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lp5/d0;->b:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lp5/d0;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-ne p0, p1, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, Lp5/d0;

    if-eqz v2, :cond_2

    check-cast p1, Lp5/d0;

    iget v2, p0, Lp5/d0;->a:I

    iget v3, p1, Lp5/d0;->a:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lp5/d0;->b:I

    iget p1, p1, Lp5/d0;->b:I

    if-ne v2, p1, :cond_2

    move v0, v1

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lp5/d0;->b:I

    iget v1, p0, Lp5/d0;->a:I

    shl-int/lit8 v2, v1, 0x10

    ushr-int/lit8 v1, v1, 0x10

    or-int/2addr v1, v2

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lp5/d0;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lp5/d0;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
