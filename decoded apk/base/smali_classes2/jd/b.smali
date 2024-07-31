.class public abstract Ljd/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljd/g$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B::",
        "Ljd/g$b;",
        "E::TB;>",
        "Ljava/lang/Object;",
        "Ljd/g$c<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final h:Lsd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/l<",
            "Ljd/g$b;",
            "TE;>;"
        }
    .end annotation
.end field

.field public final i:Ljd/g$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/g$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljd/g$c;Lsd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g$c<",
            "TB;>;",
            "Lsd/l<",
            "-",
            "Ljd/g$b;",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "baseKey"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "safeCast"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ljd/b;->h:Lsd/l;

    instance-of p2, p1, Ljd/b;

    if-eqz p2, :cond_0

    check-cast p1, Ljd/b;

    iget-object p1, p1, Ljd/b;->i:Ljd/g$c;

    :cond_0
    iput-object p1, p0, Ljd/b;->i:Ljd/g$c;

    return-void
.end method


# virtual methods
.method public final a(Ljd/g$c;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g$c<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p1, p0, :cond_1

    iget-object v0, p0, Ljd/b;->i:Ljd/g$c;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final b(Ljd/g$b;)Ljd/g$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g$b;",
            ")TE;"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljd/b;->h:Lsd/l;

    invoke-interface {v0, p1}, Lsd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljd/g$b;

    return-object p1
.end method
