.class public abstract Ljd/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljd/g$b;


# instance fields
.field public final h:Ljd/g$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/g$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljd/g$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g$c<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljd/a;->h:Ljd/g$c;

    return-void
.end method


# virtual methods
.method public b0(Ljd/g$c;)Ljd/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g$c<",
            "*>;)",
            "Ljd/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljd/g$b$a;->c(Ljd/g$b;Ljd/g$c;)Ljd/g;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljd/g$c;)Ljd/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ljd/g$b;",
            ">(",
            "Ljd/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljd/g$b$a;->b(Ljd/g$b;Ljd/g$c;)Ljd/g$b;

    move-result-object p1

    return-object p1
.end method

.method public e0(Ljd/g;)Ljd/g;
    .locals 0

    invoke-static {p0, p1}, Ljd/g$b$a;->d(Ljd/g$b;Ljd/g;)Ljd/g;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Ljd/g$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljd/g$c<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Ljd/a;->h:Ljd/g$c;

    return-object v0
.end method

.method public z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;
    .locals 0
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

    invoke-static {p0, p1, p2}, Ljd/g$b$a;->a(Ljd/g$b;Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
