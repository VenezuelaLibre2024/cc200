.class public abstract Lh7/s$b;
.super Lh7/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh7/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh7/b<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final j:Ljava/lang/CharSequence;

.field public final k:Lh7/d;

.field public final l:Z

.field public m:I

.field public n:I


# direct methods
.method public constructor <init>(Lh7/s;Ljava/lang/CharSequence;)V
    .locals 1

    invoke-direct {p0}, Lh7/b;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lh7/s$b;->m:I

    invoke-static {p1}, Lh7/s;->a(Lh7/s;)Lh7/d;

    move-result-object v0

    iput-object v0, p0, Lh7/s$b;->k:Lh7/d;

    invoke-static {p1}, Lh7/s;->b(Lh7/s;)Z

    move-result v0

    iput-boolean v0, p0, Lh7/s$b;->l:Z

    invoke-static {p1}, Lh7/s;->c(Lh7/s;)I

    move-result p1

    iput p1, p0, Lh7/s$b;->n:I

    iput-object p2, p0, Lh7/s$b;->j:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh7/s$b;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 6

    :goto_0
    iget v0, p0, Lh7/s$b;->m:I

    :cond_0
    :goto_1
    iget v1, p0, Lh7/s$b;->m:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_8

    invoke-virtual {p0, v1}, Lh7/s$b;->g(I)I

    move-result v1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lh7/s$b;->j:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v2, p0, Lh7/s$b;->m:I

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v1}, Lh7/s$b;->f(I)I

    move-result v3

    iput v3, p0, Lh7/s$b;->m:I

    :goto_2
    iget v3, p0, Lh7/s$b;->m:I

    if-ne v3, v0, :cond_2

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lh7/s$b;->m:I

    iget-object v1, p0, Lh7/s$b;->j:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-le v3, v1, :cond_0

    iput v2, p0, Lh7/s$b;->m:I

    goto :goto_1

    :cond_2
    :goto_3
    if-ge v0, v1, :cond_3

    iget-object v3, p0, Lh7/s$b;->k:Lh7/d;

    iget-object v4, p0, Lh7/s$b;->j:Ljava/lang/CharSequence;

    invoke-interface {v4, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-virtual {v3, v4}, Lh7/d;->e(C)Z

    move-result v3

    if-eqz v3, :cond_3

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    :goto_4
    if-le v1, v0, :cond_4

    iget-object v3, p0, Lh7/s$b;->k:Lh7/d;

    iget-object v4, p0, Lh7/s$b;->j:Ljava/lang/CharSequence;

    add-int/lit8 v5, v1, -0x1

    invoke-interface {v4, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-virtual {v3, v4}, Lh7/d;->e(C)Z

    move-result v3

    if-eqz v3, :cond_4

    add-int/lit8 v1, v1, -0x1

    goto :goto_4

    :cond_4
    iget-boolean v3, p0, Lh7/s$b;->l:Z

    if-eqz v3, :cond_5

    if-ne v0, v1, :cond_5

    goto :goto_0

    :cond_5
    iget v3, p0, Lh7/s$b;->n:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_6

    iget-object v1, p0, Lh7/s$b;->j:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v2, p0, Lh7/s$b;->m:I

    :goto_5
    if-le v1, v0, :cond_7

    iget-object v2, p0, Lh7/s$b;->k:Lh7/d;

    iget-object v3, p0, Lh7/s$b;->j:Ljava/lang/CharSequence;

    add-int/lit8 v4, v1, -0x1

    invoke-interface {v3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-virtual {v2, v3}, Lh7/d;->e(C)Z

    move-result v2

    if-eqz v2, :cond_7

    add-int/lit8 v1, v1, -0x1

    goto :goto_5

    :cond_6
    sub-int/2addr v3, v4

    iput v3, p0, Lh7/s$b;->n:I

    :cond_7
    iget-object v2, p0, Lh7/s$b;->j:Ljava/lang/CharSequence;

    invoke-interface {v2, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_8
    invoke-virtual {p0}, Lh7/b;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public abstract f(I)I
.end method

.method public abstract g(I)I
.end method
