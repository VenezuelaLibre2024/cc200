.class public Lwb/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lvb/d;",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lwb/g;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lwb/g;->a:Ljava/util/Map;

    sget-object v0, Lvb/d;->i:Lvb/d;

    invoke-virtual {p0, v0, p2}, Lwb/g;->h(Lvb/d;Ljava/lang/Object;)V

    sget-object p2, Lvb/d;->h:Lvb/d;

    invoke-virtual {p0, p2, p1}, Lwb/g;->h(Lvb/d;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lvb/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvb/d;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lwb/g;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lvb/d;)Z
    .locals 1

    iget-object v0, p0, Lwb/g;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public c()Z
    .locals 1

    sget-object v0, Lvb/d;->i:Lvb/d;

    invoke-virtual {p0, v0}, Lwb/g;->b(Lvb/d;)Z

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    sget-object v0, Lvb/d;->h:Lvb/d;

    invoke-virtual {p0, v0}, Lwb/g;->b(Lvb/d;)Z

    move-result v0

    return v0
.end method

.method public e(Lvb/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvb/d;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lwb/g;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lvb/d;->i:Lvb/d;

    invoke-virtual {p0, v0}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lvb/d;->h:Lvb/d;

    invoke-virtual {p0, v0}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public h(Lvb/d;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvb/d;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lwb/g;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public i(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    sget-object v0, Lvb/d;->i:Lvb/d;

    invoke-virtual {p0, v0, p1}, Lwb/g;->h(Lvb/d;Ljava/lang/Object;)V

    return-void
.end method

.method public j(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    sget-object v0, Lvb/d;->h:Lvb/d;

    invoke-virtual {p0, v0, p1}, Lwb/g;->h(Lvb/d;Ljava/lang/Object;)V

    return-void
.end method
