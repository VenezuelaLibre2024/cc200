.class public abstract Lza/i;
.super Lza/h;
.source ""


# direct methods
.method public constructor <init>(Loa/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lza/h;-><init>(Loa/a;)V

    return-void
.end method


# virtual methods
.method public abstract h(Ljava/lang/StringBuilder;I)V
.end method

.method public abstract i(I)I
.end method

.method public final j(Ljava/lang/StringBuilder;II)V
    .locals 2

    invoke-virtual {p0}, Lza/j;->b()Lza/s;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lza/s;->f(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lza/i;->h(Ljava/lang/StringBuilder;I)V

    invoke-virtual {p0, p2}, Lza/i;->i(I)I

    move-result p2

    const p3, 0x186a0

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x5

    if-ge v0, v1, :cond_1

    div-int v1, p2, p3

    if-nez v1, :cond_0

    const/16 v1, 0x30

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    div-int/lit8 p3, p3, 0xa

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    return-void
.end method
