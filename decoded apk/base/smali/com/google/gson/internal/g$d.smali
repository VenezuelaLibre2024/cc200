.class public abstract Lcom/google/gson/internal/g$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public h:Lcom/google/gson/internal/g$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/internal/g$e<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public i:Lcom/google/gson/internal/g$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/internal/g$e<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public j:I

.field public final synthetic k:Lcom/google/gson/internal/g;


# direct methods
.method public constructor <init>(Lcom/google/gson/internal/g;)V
    .locals 1

    iput-object p1, p0, Lcom/google/gson/internal/g$d;->k:Lcom/google/gson/internal/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/google/gson/internal/g;->l:Lcom/google/gson/internal/g$e;

    iget-object v0, v0, Lcom/google/gson/internal/g$e;->k:Lcom/google/gson/internal/g$e;

    iput-object v0, p0, Lcom/google/gson/internal/g$d;->h:Lcom/google/gson/internal/g$e;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/gson/internal/g$d;->i:Lcom/google/gson/internal/g$e;

    iget p1, p1, Lcom/google/gson/internal/g;->k:I

    iput p1, p0, Lcom/google/gson/internal/g$d;->j:I

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/gson/internal/g$e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/gson/internal/g$e<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/gson/internal/g$d;->h:Lcom/google/gson/internal/g$e;

    iget-object v1, p0, Lcom/google/gson/internal/g$d;->k:Lcom/google/gson/internal/g;

    iget-object v2, v1, Lcom/google/gson/internal/g;->l:Lcom/google/gson/internal/g$e;

    if-eq v0, v2, :cond_1

    iget v1, v1, Lcom/google/gson/internal/g;->k:I

    iget v2, p0, Lcom/google/gson/internal/g$d;->j:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lcom/google/gson/internal/g$e;->k:Lcom/google/gson/internal/g$e;

    iput-object v1, p0, Lcom/google/gson/internal/g$d;->h:Lcom/google/gson/internal/g$e;

    iput-object v0, p0, Lcom/google/gson/internal/g$d;->i:Lcom/google/gson/internal/g$e;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, Lcom/google/gson/internal/g$d;->h:Lcom/google/gson/internal/g$e;

    iget-object v1, p0, Lcom/google/gson/internal/g$d;->k:Lcom/google/gson/internal/g;

    iget-object v1, v1, Lcom/google/gson/internal/g;->l:Lcom/google/gson/internal/g$e;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Lcom/google/gson/internal/g$d;->i:Lcom/google/gson/internal/g$e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/gson/internal/g$d;->k:Lcom/google/gson/internal/g;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/internal/g;->f(Lcom/google/gson/internal/g$e;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/gson/internal/g$d;->i:Lcom/google/gson/internal/g$e;

    iget-object v0, p0, Lcom/google/gson/internal/g$d;->k:Lcom/google/gson/internal/g;

    iget v0, v0, Lcom/google/gson/internal/g;->k:I

    iput v0, p0, Lcom/google/gson/internal/g$d;->j:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
