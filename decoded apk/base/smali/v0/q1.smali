.class public Lv0/q1;
.super Ljava/util/AbstractList;
.source ""

# interfaces
.implements Lv0/g0;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList<",
        "Ljava/lang/String;",
        ">;",
        "Lv0/g0;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field public final h:Lv0/g0;


# direct methods
.method public constructor <init>(Lv0/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lv0/q1;->h:Lv0/g0;

    return-void
.end method

.method public static synthetic a(Lv0/q1;)Lv0/g0;
    .locals 0

    iget-object p0, p0, Lv0/q1;->h:Lv0/g0;

    return-object p0
.end method


# virtual methods
.method public A()Lv0/g0;
    .locals 0

    return-object p0
.end method

.method public F(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv0/q1;->h:Lv0/g0;

    invoke-interface {v0, p1}, Lv0/g0;->F(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv0/q1;->h:Lv0/g0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lv0/q1;->b(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lv0/q1$b;

    invoke-direct {v0, p0}, Lv0/q1$b;-><init>(Lv0/q1;)V

    return-object v0
.end method

.method public l(Lv0/h;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lv0/q1$a;

    invoke-direct {v0, p0, p1}, Lv0/q1$a;-><init>(Lv0/q1;I)V

    return-object v0
.end method

.method public r()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lv0/q1;->h:Lv0/g0;

    invoke-interface {v0}, Lv0/g0;->r()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lv0/q1;->h:Lv0/g0;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
