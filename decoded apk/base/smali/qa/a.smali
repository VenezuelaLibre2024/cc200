.class public final Lqa/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final h:Lqa/a;

.field public static final i:Lqa/a;

.field public static final j:Lqa/a;

.field public static final k:Lqa/a;

.field public static final l:Lqa/a;

.field public static final m:Lqa/a;

.field public static final n:Lqa/a;

.field public static final o:Lqa/a;


# instance fields
.field public final a:[I

.field public final b:[I

.field public final c:Lqa/b;

.field public final d:Lqa/b;

.field public final e:I

.field public final f:I

.field public final g:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lqa/a;

    const/16 v1, 0x1069

    const/16 v2, 0x1000

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lqa/a;-><init>(III)V

    sput-object v0, Lqa/a;->h:Lqa/a;

    new-instance v0, Lqa/a;

    const/16 v1, 0x409

    const/16 v2, 0x400

    invoke-direct {v0, v1, v2, v3}, Lqa/a;-><init>(III)V

    sput-object v0, Lqa/a;->i:Lqa/a;

    new-instance v0, Lqa/a;

    const/16 v1, 0x43

    const/16 v2, 0x40

    invoke-direct {v0, v1, v2, v3}, Lqa/a;-><init>(III)V

    sput-object v0, Lqa/a;->j:Lqa/a;

    new-instance v1, Lqa/a;

    const/16 v2, 0x13

    const/16 v4, 0x10

    invoke-direct {v1, v2, v4, v3}, Lqa/a;-><init>(III)V

    sput-object v1, Lqa/a;->k:Lqa/a;

    new-instance v1, Lqa/a;

    const/16 v2, 0x11d

    const/16 v4, 0x100

    const/4 v5, 0x0

    invoke-direct {v1, v2, v4, v5}, Lqa/a;-><init>(III)V

    sput-object v1, Lqa/a;->l:Lqa/a;

    new-instance v1, Lqa/a;

    const/16 v2, 0x12d

    invoke-direct {v1, v2, v4, v3}, Lqa/a;-><init>(III)V

    sput-object v1, Lqa/a;->m:Lqa/a;

    sput-object v1, Lqa/a;->n:Lqa/a;

    sput-object v0, Lqa/a;->o:Lqa/a;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lqa/a;->f:I

    iput p2, p0, Lqa/a;->e:I

    iput p3, p0, Lqa/a;->g:I

    new-array p3, p2, [I

    iput-object p3, p0, Lqa/a;->a:[I

    new-array p3, p2, [I

    iput-object p3, p0, Lqa/a;->b:[I

    const/4 p3, 0x0

    const/4 v0, 0x1

    move v1, p3

    move v2, v0

    :goto_0
    if-ge v1, p2, :cond_1

    iget-object v3, p0, Lqa/a;->a:[I

    aput v2, v3, v1

    mul-int/lit8 v2, v2, 0x2

    if-lt v2, p2, :cond_0

    xor-int/2addr v2, p1

    add-int/lit8 v3, p2, -0x1

    and-int/2addr v2, v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move p1, p3

    :goto_1
    add-int/lit8 v1, p2, -0x1

    if-ge p1, v1, :cond_2

    iget-object v1, p0, Lqa/a;->b:[I

    iget-object v2, p0, Lqa/a;->a:[I

    aget v2, v2, p1

    aput p1, v1, v2

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    new-instance p1, Lqa/b;

    new-array p2, v0, [I

    aput p3, p2, p3

    invoke-direct {p1, p0, p2}, Lqa/b;-><init>(Lqa/a;[I)V

    iput-object p1, p0, Lqa/a;->c:Lqa/b;

    new-instance p1, Lqa/b;

    new-array p2, v0, [I

    aput v0, p2, p3

    invoke-direct {p1, p0, p2}, Lqa/b;-><init>(Lqa/a;[I)V

    iput-object p1, p0, Lqa/a;->d:Lqa/b;

    return-void
.end method

.method public static a(II)I
    .locals 0

    xor-int/2addr p0, p1

    return p0
.end method


# virtual methods
.method public b(II)Lqa/b;
    .locals 1

    if-ltz p1, :cond_1

    if-nez p2, :cond_0

    iget-object p1, p0, Lqa/a;->c:Lqa/b;

    return-object p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    new-array p1, p1, [I

    const/4 v0, 0x0

    aput p2, p1, v0

    new-instance p2, Lqa/b;

    invoke-direct {p2, p0, p1}, Lqa/b;-><init>(Lqa/a;[I)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public c(I)I
    .locals 1

    iget-object v0, p0, Lqa/a;->a:[I

    aget p1, v0, p1

    return p1
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lqa/a;->g:I

    return v0
.end method

.method public e()Lqa/b;
    .locals 1

    iget-object v0, p0, Lqa/a;->d:Lqa/b;

    return-object v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lqa/a;->e:I

    return v0
.end method

.method public g()Lqa/b;
    .locals 1

    iget-object v0, p0, Lqa/a;->c:Lqa/b;

    return-object v0
.end method

.method public h(I)I
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, Lqa/a;->a:[I

    iget v1, p0, Lqa/a;->e:I

    iget-object v2, p0, Lqa/a;->b:[I

    aget p1, v2, p1

    sub-int/2addr v1, p1

    add-int/lit8 v1, v1, -0x1

    aget p1, v0, v1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public i(I)I
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lqa/a;->b:[I

    aget p1, v0, p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public j(II)I
    .locals 2

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqa/a;->a:[I

    iget-object v1, p0, Lqa/a;->b:[I

    aget p1, v1, p1

    aget p2, v1, p2

    add-int/2addr p1, p2

    iget p2, p0, Lqa/a;->e:I

    add-int/lit8 p2, p2, -0x1

    rem-int/2addr p1, p2

    aget p1, v0, p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GF(0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lqa/a;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lqa/a;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
