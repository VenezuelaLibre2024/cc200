.class public final Lv0/h$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lv0/h;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lv0/h;Lv0/h;)I
    .locals 4

    invoke-virtual {p1}, Lv0/h;->o()Lv0/h$g;

    move-result-object v0

    invoke-virtual {p2}, Lv0/h;->o()Lv0/h$g;

    move-result-object v1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Lv0/h$g;->b()B

    move-result v2

    invoke-static {v2}, Lv0/h;->a(B)I

    move-result v2

    invoke-interface {v1}, Lv0/h$g;->b()B

    move-result v3

    invoke-static {v3}, Lv0/h;->a(B)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Integer;->compare(II)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_1
    invoke-virtual {p1}, Lv0/h;->size()I

    move-result p1

    invoke-virtual {p2}, Lv0/h;->size()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lv0/h;

    check-cast p2, Lv0/h;

    invoke-virtual {p0, p1, p2}, Lv0/h$b;->a(Lv0/h;Lv0/h;)I

    move-result p1

    return p1
.end method
