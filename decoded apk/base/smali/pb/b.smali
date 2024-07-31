.class public abstract Lpb/b;
.super Lob/f;
.source ""


# instance fields
.field public final d:[F

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lob/f;-><init>()V

    sget-object v0, Lob/c;->a:[F

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lpb/b;->d:[F

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract b()I
.end method

.method public final c()[F
    .locals 1

    iget-object v0, p0, Lpb/b;->d:[F

    return-object v0
.end method

.method public abstract d()Ljava/nio/FloatBuffer;
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lpb/b;->e:I

    return v0
.end method

.method public f()I
    .locals 2

    invoke-virtual {p0}, Lpb/b;->d()Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->limit()I

    move-result v0

    invoke-virtual {p0}, Lpb/b;->b()I

    move-result v1

    div-int/2addr v0, v1

    return v0
.end method

.method public g()I
    .locals 1

    invoke-virtual {p0}, Lpb/b;->b()I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    return v0
.end method
