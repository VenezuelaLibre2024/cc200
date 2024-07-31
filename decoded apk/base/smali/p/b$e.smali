.class public abstract Lp/b$e;
.super Lp/b$f;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lp/b$f<",
        "TK;TV;>;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public h:Lp/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public i:Lp/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp/b$c;Lp/b$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/b$c<",
            "TK;TV;>;",
            "Lp/b$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lp/b$f;-><init>()V

    iput-object p2, p0, Lp/b$e;->h:Lp/b$c;

    iput-object p1, p0, Lp/b$e;->i:Lp/b$c;

    return-void
.end method


# virtual methods
.method public a(Lp/b$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/b$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lp/b$e;->h:Lp/b$c;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lp/b$e;->i:Lp/b$c;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lp/b$e;->i:Lp/b$c;

    iput-object v0, p0, Lp/b$e;->h:Lp/b$c;

    :cond_0
    iget-object v0, p0, Lp/b$e;->h:Lp/b$c;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0, v0}, Lp/b$e;->c(Lp/b$c;)Lp/b$c;

    move-result-object v0

    iput-object v0, p0, Lp/b$e;->h:Lp/b$c;

    :cond_1
    iget-object v0, p0, Lp/b$e;->i:Lp/b$c;

    if-ne v0, p1, :cond_2

    invoke-virtual {p0}, Lp/b$e;->f()Lp/b$c;

    move-result-object p1

    iput-object p1, p0, Lp/b$e;->i:Lp/b$c;

    :cond_2
    return-void
.end method

.method public abstract c(Lp/b$c;)Lp/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/b$c<",
            "TK;TV;>;)",
            "Lp/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public abstract d(Lp/b$c;)Lp/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/b$c<",
            "TK;TV;>;)",
            "Lp/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public e()Ljava/util/Map$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lp/b$e;->i:Lp/b$c;

    invoke-virtual {p0}, Lp/b$e;->f()Lp/b$c;

    move-result-object v1

    iput-object v1, p0, Lp/b$e;->i:Lp/b$c;

    return-object v0
.end method

.method public final f()Lp/b$c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp/b$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lp/b$e;->i:Lp/b$c;

    iget-object v1, p0, Lp/b$e;->h:Lp/b$c;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lp/b$e;->d(Lp/b$c;)Lp/b$c;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lp/b$e;->i:Lp/b$c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lp/b$e;->e()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
