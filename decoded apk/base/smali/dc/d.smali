.class public Ldc/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ldc/a;


# static fields
.field public static final d:Ljava/util/Random;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Ldc/d;->d:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()S
    .locals 2

    sget-object v0, Ldc/d;->d:Ljava/util/Random;

    const/16 v1, 0x12c

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    int-to-short v0, v0

    return v0
.end method

.method public static c(II)F
    .locals 0

    int-to-float p0, p0

    int-to-float p1, p1

    div-float/2addr p0, p1

    return p0
.end method


# virtual methods
.method public a(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;I)V
    .locals 7

    invoke-virtual {p1}, Ljava/nio/ShortBuffer;->remaining()I

    move-result v0

    invoke-virtual {p2}, Ljava/nio/ShortBuffer;->remaining()I

    move-result v1

    if-ge v0, v1, :cond_6

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-eq p3, v0, :cond_1

    if-ne p3, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Illegal use of AudioStretcher.INSERT. Channels:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/nio/ShortBuffer;->remaining()I

    move-result v0

    div-int/2addr v0, p3

    invoke-virtual {p2}, Ljava/nio/ShortBuffer;->remaining()I

    move-result v2

    invoke-virtual {p1}, Ljava/nio/ShortBuffer;->remaining()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-double v2, v2

    int-to-double v4, p3

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-static {v0, v0}, Ldc/d;->c(II)F

    move-result v3

    invoke-static {v2, v2}, Ldc/d;->c(II)F

    move-result v4

    move v5, v0

    :goto_1
    if-lez v5, :cond_5

    if-lez v2, :cond_5

    cmpl-float v6, v3, v4

    if-ltz v6, :cond_3

    invoke-virtual {p1}, Ljava/nio/ShortBuffer;->get()S

    move-result v3

    invoke-virtual {p2, v3}, Ljava/nio/ShortBuffer;->put(S)Ljava/nio/ShortBuffer;

    if-ne p3, v1, :cond_2

    invoke-virtual {p1}, Ljava/nio/ShortBuffer;->get()S

    move-result v3

    invoke-virtual {p2, v3}, Ljava/nio/ShortBuffer;->put(S)Ljava/nio/ShortBuffer;

    :cond_2
    add-int/lit8 v5, v5, -0x1

    invoke-static {v5, v0}, Ldc/d;->c(II)F

    move-result v3

    goto :goto_1

    :cond_3
    invoke-static {}, Ldc/d;->b()S

    move-result v4

    invoke-virtual {p2, v4}, Ljava/nio/ShortBuffer;->put(S)Ljava/nio/ShortBuffer;

    if-ne p3, v1, :cond_4

    invoke-static {}, Ldc/d;->b()S

    move-result v4

    invoke-virtual {p2, v4}, Ljava/nio/ShortBuffer;->put(S)Ljava/nio/ShortBuffer;

    :cond_4
    add-int/lit8 v2, v2, -0x1

    invoke-static {v2, v0}, Ldc/d;->c(II)F

    move-result v4

    goto :goto_1

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Illegal use of AudioStretcher.INSERT"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
