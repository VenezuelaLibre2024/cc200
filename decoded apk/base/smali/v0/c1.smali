.class public final Lv0/c1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lv0/c1;


# instance fields
.field public final a:Lv0/h1;

.field public final b:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Lv0/g1<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv0/c1;

    invoke-direct {v0}, Lv0/c1;-><init>()V

    sput-object v0, Lv0/c1;->c:Lv0/c1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lv0/c1;->b:Ljava/util/concurrent/ConcurrentMap;

    new-instance v0, Lv0/j0;

    invoke-direct {v0}, Lv0/j0;-><init>()V

    iput-object v0, p0, Lv0/c1;->a:Lv0/h1;

    return-void
.end method

.method public static a()Lv0/c1;
    .locals 1

    sget-object v0, Lv0/c1;->c:Lv0/c1;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lv0/f1;Lv0/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lv0/f1;",
            "Lv0/p;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lv0/c1;->e(Ljava/lang/Object;)Lv0/g1;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lv0/g1;->e(Ljava/lang/Object;Lv0/f1;Lv0/p;)V

    return-void
.end method

.method public c(Ljava/lang/Class;Lv0/g1;)Lv0/g1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lv0/g1<",
            "*>;)",
            "Lv0/g1<",
            "*>;"
        }
    .end annotation

    const-string v0, "messageType"

    invoke-static {p1, v0}, Lv0/a0;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "schema"

    invoke-static {p2, v0}, Lv0/a0;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lv0/c1;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv0/g1;

    return-object p1
.end method

.method public d(Ljava/lang/Class;)Lv0/g1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lv0/g1<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "messageType"

    invoke-static {p1, v0}, Lv0/a0;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lv0/c1;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/g1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lv0/c1;->a:Lv0/h1;

    invoke-interface {v0, p1}, Lv0/h1;->a(Ljava/lang/Class;)Lv0/g1;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lv0/c1;->c(Ljava/lang/Class;Lv0/g1;)Lv0/g1;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v0, p1

    :cond_0
    return-object v0
.end method

.method public e(Ljava/lang/Object;)Lv0/g1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lv0/g1<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, Lv0/c1;->d(Ljava/lang/Class;)Lv0/g1;

    move-result-object p1

    return-object p1
.end method
