.class public final Loa/c;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:[B

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loa/c;->a:[B

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    iget-object v0, p0, Loa/c;->a:[B

    array-length v0, v0

    iget v1, p0, Loa/c;->b:I

    sub-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x8

    iget v1, p0, Loa/c;->c:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Loa/c;->c:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Loa/c;->b:I

    return v0
.end method

.method public d(I)I
    .locals 9

    const/4 v0, 0x1

    if-lt p1, v0, :cond_4

    const/16 v1, 0x20

    if-gt p1, v1, :cond_4

    invoke-virtual {p0}, Loa/c;->a()I

    move-result v1

    if-gt p1, v1, :cond_4

    iget v1, p0, Loa/c;->c:I

    const/4 v2, 0x0

    const/16 v3, 0xff

    const/16 v4, 0x8

    if-lez v1, :cond_1

    rsub-int/lit8 v1, v1, 0x8

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v5

    sub-int/2addr v1, v5

    rsub-int/lit8 v6, v5, 0x8

    shr-int v6, v3, v6

    shl-int/2addr v6, v1

    iget-object v7, p0, Loa/c;->a:[B

    iget v8, p0, Loa/c;->b:I

    aget-byte v7, v7, v8

    and-int/2addr v6, v7

    shr-int v1, v6, v1

    sub-int/2addr p1, v5

    iget v6, p0, Loa/c;->c:I

    add-int/2addr v6, v5

    iput v6, p0, Loa/c;->c:I

    if-ne v6, v4, :cond_0

    iput v2, p0, Loa/c;->c:I

    add-int/2addr v8, v0

    iput v8, p0, Loa/c;->b:I

    :cond_0
    move v2, v1

    :cond_1
    if-lez p1, :cond_3

    :goto_0
    if-lt p1, v4, :cond_2

    shl-int/lit8 v1, v2, 0x8

    iget-object v2, p0, Loa/c;->a:[B

    iget v5, p0, Loa/c;->b:I

    aget-byte v2, v2, v5

    and-int/2addr v2, v3

    or-int/2addr v2, v1

    add-int/2addr v5, v0

    iput v5, p0, Loa/c;->b:I

    add-int/lit8 p1, p1, -0x8

    goto :goto_0

    :cond_2
    if-lez p1, :cond_3

    rsub-int/lit8 v0, p1, 0x8

    shr-int v1, v3, v0

    shl-int/2addr v1, v0

    shl-int/2addr v2, p1

    iget-object v3, p0, Loa/c;->a:[B

    iget v4, p0, Loa/c;->b:I

    aget-byte v3, v3, v4

    and-int/2addr v1, v3

    shr-int v0, v1, v0

    or-int/2addr v2, v0

    iget v0, p0, Loa/c;->c:I

    add-int/2addr v0, p1

    iput v0, p0, Loa/c;->c:I

    :cond_3
    return v2

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
