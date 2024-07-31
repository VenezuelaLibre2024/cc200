.class public abstract Lv0/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv0/z0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType::",
        "Lv0/r0;",
        ">",
        "Ljava/lang/Object;",
        "Lv0/z0<",
        "TMessageType;>;"
    }
.end annotation


# static fields
.field public static final a:Lv0/p;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lv0/p;->b()Lv0/p;

    move-result-object v0

    sput-object v0, Lv0/b;->a:Lv0/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lv0/h;Lv0/p;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lv0/b;->e(Lv0/h;Lv0/p;)Lv0/r0;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lv0/r0;)Lv0/r0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TMessageType;"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lv0/s0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lv0/b;->d(Lv0/r0;)Lv0/m1;

    move-result-object v0

    invoke-virtual {v0}, Lv0/m1;->a()Lv0/b0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lv0/b0;->i(Lv0/r0;)Lv0/b0;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method public final d(Lv0/r0;)Lv0/m1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)",
            "Lv0/m1;"
        }
    .end annotation

    instance-of v0, p1, Lv0/a;

    if-eqz v0, :cond_0

    check-cast p1, Lv0/a;

    invoke-virtual {p1}, Lv0/a;->o()Lv0/m1;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lv0/m1;

    invoke-direct {v0, p1}, Lv0/m1;-><init>(Lv0/r0;)V

    return-object v0
.end method

.method public e(Lv0/h;Lv0/p;)Lv0/r0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv0/h;",
            "Lv0/p;",
            ")TMessageType;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lv0/b;->f(Lv0/h;Lv0/p;)Lv0/r0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lv0/b;->c(Lv0/r0;)Lv0/r0;

    move-result-object p1

    return-object p1
.end method

.method public f(Lv0/h;Lv0/p;)Lv0/r0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv0/h;",
            "Lv0/p;",
            ")TMessageType;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Lv0/h;->q()Lv0/i;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lv0/z0;->b(Lv0/i;Lv0/p;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lv0/r0;
    :try_end_0
    .catch Lv0/b0; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p1, v0}, Lv0/i;->a(I)V
    :try_end_1
    .catch Lv0/b0; {:try_start_1 .. :try_end_1} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    :try_start_2
    invoke-virtual {p1, p2}, Lv0/b0;->i(Lv0/r0;)Lv0/b0;

    move-result-object p1

    throw p1
    :try_end_2
    .catch Lv0/b0; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception p1

    throw p1
.end method
