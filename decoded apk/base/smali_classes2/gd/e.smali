.class public final Lgd/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgd/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lgd/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final l:Lgd/e$a;

.field public static final m:Lgd/e;


# instance fields
.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgd/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgd/e$a;-><init>(Ltd/g;)V

    sput-object v0, Lgd/e;->l:Lgd/e$a;

    invoke-static {}, Lgd/f;->a()Lgd/e;

    move-result-object v0

    sput-object v0, Lgd/e;->m:Lgd/e;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lgd/e;->h:I

    iput p2, p0, Lgd/e;->i:I

    iput p3, p0, Lgd/e;->j:I

    invoke-virtual {p0, p1, p2, p3}, Lgd/e;->c(III)I

    move-result p1

    iput p1, p0, Lgd/e;->k:I

    return-void
.end method


# virtual methods
.method public b(Lgd/e;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lgd/e;->k:I

    iget p1, p1, Lgd/e;->k:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final c(III)I
    .locals 3

    new-instance v0, Lxd/f;

    const/4 v1, 0x0

    const/16 v2, 0xff

    invoke-direct {v0, v1, v2}, Lxd/f;-><init>(II)V

    invoke-virtual {v0, p1}, Lxd/f;->h(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lxd/f;

    invoke-direct {v0, v1, v2}, Lxd/f;-><init>(II)V

    invoke-virtual {v0, p2}, Lxd/f;->h(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lxd/f;

    invoke-direct {v0, v1, v2}, Lxd/f;-><init>(II)V

    invoke-virtual {v0, p3}, Lxd/f;->h(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_1

    shl-int/lit8 p1, p1, 0x10

    shl-int/lit8 p2, p2, 0x8

    add-int/2addr p1, p2

    add-int/2addr p1, p3

    return p1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Version components are out of range: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lgd/e;

    invoke-virtual {p0, p1}, Lgd/e;->b(Lgd/e;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lgd/e;

    if-eqz v1, :cond_1

    check-cast p1, Lgd/e;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez p1, :cond_2

    return v1

    :cond_2
    iget v2, p0, Lgd/e;->k:I

    iget p1, p1, Lgd/e;->k:I

    if-ne v2, p1, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lgd/e;->k:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lgd/e;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Lgd/e;->i:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lgd/e;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
