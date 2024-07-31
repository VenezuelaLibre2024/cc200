.class public final Lge/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljd/g;


# instance fields
.field public final h:Ljava/lang/Throwable;

.field public final synthetic i:Ljd/g;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Ljd/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lge/e;->h:Ljava/lang/Throwable;

    iput-object p2, p0, Lge/e;->i:Ljd/g;

    return-void
.end method


# virtual methods
.method public b0(Ljd/g$c;)Ljd/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g$c<",
            "*>;)",
            "Ljd/g;"
        }
    .end annotation

    iget-object v0, p0, Lge/e;->i:Ljd/g;

    invoke-interface {v0, p1}, Ljd/g;->b0(Ljd/g$c;)Ljd/g;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljd/g$c;)Ljd/g$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ljd/g$b;",
            ">(",
            "Ljd/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    iget-object v0, p0, Lge/e;->i:Ljd/g;

    invoke-interface {v0, p1}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object p1

    return-object p1
.end method

.method public e0(Ljd/g;)Ljd/g;
    .locals 1

    iget-object v0, p0, Lge/e;->i:Ljd/g;

    invoke-interface {v0, p1}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object p1

    return-object p1
.end method

.method public z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lsd/p<",
            "-TR;-",
            "Ljd/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    iget-object v0, p0, Lge/e;->i:Ljd/g;

    invoke-interface {v0, p1, p2}, Ljd/g;->z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
