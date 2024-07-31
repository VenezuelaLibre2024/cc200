.class public La5/c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La5/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic h:La5/c;


# direct methods
.method public constructor <init>(La5/c;)V
    .locals 0

    iput-object p1, p0, La5/c$b;->h:La5/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La5/c;La5/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, La5/c$b;-><init>(La5/c;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, La5/c$b;->h:La5/c;

    invoke-static {v0}, La5/c;->y(La5/c;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public e(Landroid/net/Uri;Lo5/d0$c;Z)Z
    .locals 7

    iget-object p3, p0, La5/c$b;->h:La5/c;

    invoke-static {p3}, La5/c;->z(La5/c;)La5/g;

    move-result-object p3

    const/4 v0, 0x0

    if-nez p3, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-object p3, p0, La5/c$b;->h:La5/c;

    invoke-static {p3}, La5/c;->q(La5/c;)La5/h;

    move-result-object p3

    invoke-static {p3}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, La5/h;

    iget-object p3, p3, La5/h;->e:Ljava/util/List;

    move v3, v0

    move v4, v3

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_1

    iget-object v5, p0, La5/c$b;->h:La5/c;

    invoke-static {v5}, La5/c;->A(La5/c;)Ljava/util/HashMap;

    move-result-object v5

    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La5/h$b;

    iget-object v6, v6, La5/h$b;->a:Landroid/net/Uri;

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La5/c$c;

    if-eqz v5, :cond_0

    invoke-static {v5}, La5/c$c;->d(La5/c$c;)J

    move-result-wide v5

    cmp-long v5, v1, v5

    if-gez v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-instance p3, Lo5/d0$a;

    iget-object v1, p0, La5/c$b;->h:La5/c;

    invoke-static {v1}, La5/c;->q(La5/c;)La5/h;

    move-result-object v1

    iget-object v1, v1, La5/h;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    invoke-direct {p3, v2, v0, v1, v4}, Lo5/d0$a;-><init>(IIII)V

    iget-object v1, p0, La5/c$b;->h:La5/c;

    invoke-static {v1}, La5/c;->D(La5/c;)Lo5/d0;

    move-result-object v1

    invoke-interface {v1, p3, p2}, Lo5/d0;->c(Lo5/d0$a;Lo5/d0$c;)Lo5/d0$b;

    move-result-object p2

    if-eqz p2, :cond_2

    iget p3, p2, Lo5/d0$b;->a:I

    const/4 v1, 0x2

    if-ne p3, v1, :cond_2

    iget-object p3, p0, La5/c$b;->h:La5/c;

    invoke-static {p3}, La5/c;->A(La5/c;)Ljava/util/HashMap;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La5/c$c;

    if-eqz p1, :cond_2

    iget-wide p2, p2, Lo5/d0$b;->b:J

    invoke-static {p1, p2, p3}, La5/c$c;->b(La5/c$c;J)Z

    :cond_2
    return v0
.end method
